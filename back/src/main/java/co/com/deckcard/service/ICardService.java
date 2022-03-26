package co.com.deckcard.service;

import co.com.deckcard.dto.DTOCard;
import co.com.deckcard.model.Card;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;
import java.util.List;

public interface ICardService {
    public DTOCard save();
    public Mono<Card> getRandom();
    public Mono<Card> getBySuit(String suit);
    public Mono<Card> getByValueAndSuit(String value, String suit);

    public Mono<Card> getByNumbers();
}


