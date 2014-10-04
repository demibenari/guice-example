package demibenari.communication.impl;

import demibenari.communication.InputService;
import demibenari.entities.Message;
import demibenari.entities.MessageImpl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 9/30/2014.
 */
public class SatelliteInput implements InputService {
    protected List<Message> messageToSend;

    public SatelliteInput() {
        messageToSend = new ArrayList<Message>();
        messageToSend.add(new MessageImpl(0, "First Message coming...."));
        messageToSend.add(new MessageImpl(0, "Second Message is Here!"));
        messageToSend.add(new MessageImpl(0, "Third already???"));
        messageToSend.add(new MessageImpl(0, "Fourth and final :)"));

    }

    @Override
    public List<Message> getMessages() {
        return new ArrayList<Message>(messageToSend);
    }
}
