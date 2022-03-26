package co.com.deckcard.repository;

import co.com.deckcard.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;

public class CustomCardRepositoryImpl implements ICustomCardRepository {
    @Autowired
    MongoTemplate mongoTemplate;


    @Override
    public void save(ArrayList<Card> cards) {
        mongoTemplate.save(cards);
    }


}
