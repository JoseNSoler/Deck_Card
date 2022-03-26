package co.com.deckcard.repository;

import co.com.deckcard.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ICardRepository extends ReactiveMongoRepository<Card, String>, ICustomCardRepository {
    public Flux<Card> findBySuit(String suit);

    @Query("{ 'value': ?0, 'suit': ?1}")
    public Flux<Card> findByValueAndSuit(String value, String suit);

    public Flux<Card> findByvalue();
}
