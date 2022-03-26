package co.com.deckcard.mapper;

import co.com.deckcard.dto.DTOCard;
import co.com.deckcard.model.Card;
import com.google.gson.Gson;


public class PerMapper {

    public DTOCard toDTOCardFromJson(String JSONstring ){
        Gson gson = new Gson();
        return gson.fromJson(JSONstring, DTOCard.class);
    }

    public static DTOCard toDTOCardFromJson2(String JSONstring ){
        Gson gson = new Gson();
        return gson.fromJson(JSONstring, DTOCard.class);
    }


    public static Card fromDTO(DTOCard dtoCard){
        Card card = new Card();
        card.setCode(dtoCard.getCode());
        card.setImage(dtoCard.getImage());
        card.setValue(dtoCard.getValue());
        card.setSuit(dtoCard.getSuit());

        return card;
    }


    public Card fromDTOP(DTOCard dtoCard){
        Card card = new Card();
        card.setCode(dtoCard.getCode());
        card.setImage(dtoCard.getImage());
        card.setValue(dtoCard.getValue());
        card.setSuit(dtoCard.getSuit());

        return card;
    }

    public DTOCard toDTOP(Card Card){
        return new DTOCard(
                Card.getCode(), Card.getImage(), Card.getValue(), Card.getSuit()
        );
    }

}
