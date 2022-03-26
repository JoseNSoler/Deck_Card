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

@RestController
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
}
