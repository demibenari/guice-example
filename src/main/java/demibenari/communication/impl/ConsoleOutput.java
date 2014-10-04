package demibenari.communication.impl;

import demibenari.communication.OutputService;
import demibenari.entities.Message;

import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 9/30/2014.
 */
public class ConsoleOutput implements OutputService {

    @Override
    public void sendMessage(Message message) {
        System.out.println("ConsoleOutput: ID - " + message.getID() + " -" + message.getText());
    }

    @Override
    public void sendMessages(List<Message> messages) {
        for (Message message : messages) {
            sendMessage(message);
        }
    }
}
