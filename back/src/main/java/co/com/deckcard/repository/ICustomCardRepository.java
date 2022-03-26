package co.com.deckcard.repository;

import co.com.deckcard.model.Card;

import java.util.ArrayList;

public interface ICustomCardRepository {
    void save(ArrayList<Card> cards);
}
