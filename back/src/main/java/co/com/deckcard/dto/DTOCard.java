package co.com.deckcard.dto;

public class DTOCard {
    private String id;

    private String code;
    private String image;
    private String value;
    private String suit;


    public DTOCard(String code, String image, String value, String suit) {

        this.code = code;
        this.image = image;
        this.value = value;
        this.suit = suit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "DTOCard{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", imageURL='" + image + '\'' +
                ", value='" + value + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
