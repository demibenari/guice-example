package demibenari.engine;

import demibenari.entities.Message;

import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 10/4/2014.
 */
public interface EngineAlgorithm {
    List<Message> processMessages(List<Message> messages);
}
