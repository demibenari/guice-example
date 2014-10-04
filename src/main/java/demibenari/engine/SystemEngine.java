package demibenari.engine;

import com.google.inject.Inject;
import demibenari.communication.InputService;
import demibenari.communication.OutputService;
import demibenari.dataaccess.Storage;
import demibenari.entities.IDGenerator;
import demibenari.entities.Message;
import demibenari.entities.MessageImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 9/30/2014.
 */
public class SystemEngine {
    private static final Logger logger = LogManager.getLogger(SystemEngine.class);

    protected InputService inputService;
    protected OutputService outputService;
    protected Storage storage;
    @Inject protected IDGenerator idGenerator;
    @Inject protected EngineAlgorithm engineAlgorithm;

    @Inject
    public SystemEngine(InputService inputService, OutputService outputService, Storage storage) {
        this.inputService = inputService;
        this.outputService = outputService;
        this.storage = storage;
    }


    public void doWork() {
        List<Message> messages = inputService.getMessages();

        List<Message> processedMessages = engineAlgorithm.processMessages(messages);

        for (Message message : processedMessages) {
            logger.info("Input: {}", message.toString());

            storage.storeMessage(message);
        }

        outputService.sendMessage(new MessageImpl(idGenerator.nextID(), "Finished Storing the Messages"));
    }
}
