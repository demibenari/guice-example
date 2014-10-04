package demibenari.dataaccess.impl;

import demibenari.dataaccess.Storage;
import demibenari.entities.Message;

import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 9/30/2014.
 */
public class NoSQLDBStorage implements Storage {
    @Override
    public boolean storeMessage(Message message) {
        return false;
    }

    @Override
    public List<Message> getAllMessages() {
        return null;
    }
}
