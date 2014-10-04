package demibenari.communication;

import demibenari.entities.Message;

import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 9/30/2014.
 */
public interface OutputService {
    void sendMessage(Message message);

    void sendMessages(List<Message> messages);
}
