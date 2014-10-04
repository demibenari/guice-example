package demibenari.dataaccess;

import demibenari.entities.Message;

import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 9/30/2014.
 */
public interface Storage {
    boolean storeMessage(Message message);

    List<Message> getAllMessages();
}
