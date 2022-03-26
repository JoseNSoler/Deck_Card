package co.com.deckcard.service;

import co.com.deckcard.dto.DTOCard;
import co.com.deckcard.mapper.PerMapper;
import co.com.deckcard.model.Card;


import co.com.deckcard.repository.ICardRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.minidev.json.JSONArray;

import net.minidev.json.parser.JSONParser;
import net.minidev.json.JSONObject;

import net.nullschool.util.DigitalRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


import java.io.Console;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class CardServiceImpl implements ICardService{

    @Autowired
    private ICardRepository cardRepository;



    private PerMapper mapper = new PerMapper();


    @Override
    public DTOCard save(){
        return null;
    }

    @Override
    public Mono<Card> getRandom(){
        return cardRepository.findAll()
                .elementAt(
                        new DigitalRandom().nextInt(52)
                );


    }

    @Override
    public Mono<Card> getBySuit(String suit){
        return cardRepository.findBySuit(suit).elementAt(new DigitalRandom().nextInt(13));
    }

    @Override
    public Mono<Card> getByValueAndSuit(String value, String suit){
        return cardRepository.findByValueAndSuit(value, suit).elementAt(0);
    }


    @Override
    public Mono<Card> getByNumbers(){

        return cardRepository.findAll().filter(value ->
                value.getValue().matches("[0-9]+") && value.getValue().length() < 3).elementAt(
                    new DigitalRandom().nextInt(35)
        );
    }

}

