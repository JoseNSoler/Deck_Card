package co.com.deckcard.repository;

import co.com.deckcard.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardRepository extends ReactiveMongoRepository<Card, String>, ICustomCardRepository {

}
