package demibenari.dataaccess.impl;

import demibenari.dataaccess.Storage;
import demibenari.entities.Message;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 9/30/2014.
 */
public class FileSystemStorage implements Storage {
    protected List<Message> storage = new ArrayList<Message>();

    @Override
    public boolean storeMessage(Message message) {
        System.out.println("File System Storage: Storing message - " + message.getID() + " - " + message.getText());

        storage.add(message);
        return true;
    }

    @Override
    public List<Message> getAllMessages() {
        return new ArrayList<Message>(storage) ;
    }
}
