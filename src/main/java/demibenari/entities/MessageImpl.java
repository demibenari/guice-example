package demibenari.entities;

/**
 *
 * Created by Demi Ben-Ari on 9/30/2014.
 */
public class MessageImpl implements Message {

    private final Integer id;
    private final String text;

    public MessageImpl(Integer id, String text) {
        this.text = text;
        this.id = id;
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public String getText() {
        return text;
    }
}
