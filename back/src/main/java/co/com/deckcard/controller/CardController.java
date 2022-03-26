package co.com.deckcard.controller;

import co.com.deckcard.dto.DTOCard;
import co.com.deckcard.model.Card;
import co.com.deckcard.service.CardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost"})
@RequestMapping("/cards")
public class CardController {
    @Autowired
    private CardServiceImpl cardService;

    @GetMapping("/save")
    public ResponseEntity<DTOCard> save(){
        return new ResponseEntity(cardService.save(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/random")
    public Mono<Card> getRandom(){
        return cardService.getRandom();
    }


    @GetMapping(path = "/suit/{str}")
    public Mono<Card> getBySuit(@PathVariable("str") String suit){
        return cardService.getBySuit(suit);
    }


    @GetMapping(path = "/query")
    public Mono<Card> getBySuitAndByValue(@RequestParam("suit") Optional<String> suit,
                                          @RequestParam("value") Optional<String> value){

        if(suit.isPresent() && value.isPresent()) return cardService.getByValueAndSuit(value.get(), suit.get());
        return null;
    }

    @GetMapping("/onlyNumbers")
    public Mono<Card> getOnlyNumbers(){
        return cardService.getByNumbers();
    }



}
