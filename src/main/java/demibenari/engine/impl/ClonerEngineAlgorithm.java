package demibenari.engine.impl;

import demibenari.engine.EngineAlgorithm;
import demibenari.entities.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 10/4/2014.
 */
public class ClonerEngineAlgorithm implements EngineAlgorithm {
    private static final Logger logger = LogManager.getLogger(ClonerEngineAlgorithm.class);

    @Override
    public List<Message> processMessages(List<Message> messages) {
        logger.info("Making a clone of the {} messages in the list", messages.size());

        return new ArrayList<Message>(messages);
    }
}
