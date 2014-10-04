package demibenari.modules;

import com.google.inject.AbstractModule;
import demibenari.communication.InputService;
import demibenari.communication.OutputService;
import demibenari.communication.impl.ConsoleOutput;
import demibenari.communication.impl.SatelliteInput;
import demibenari.dataaccess.Storage;
import demibenari.dataaccess.impl.FileSystemStorage;
import demibenari.engine.EngineAlgorithm;
import demibenari.engine.impl.ClonerEngineAlgorithm;
import demibenari.entities.IDGenerator;
import demibenari.entities.SimpleIDGenerator;

/**
 *
 * Created by Demi Ben-Ari on 9/30/2014.
 */
public class SystemConfigMoudule extends AbstractModule {
    @Override
    protected void configure() {
        bind(InputService.class).to(SatelliteInput.class);

        bind(OutputService.class).to(ConsoleOutput.class);

        bind(Storage.class).to(FileSystemStorage.class);

        bind(IDGenerator.class) .to(SimpleIDGenerator.class);

        bind(EngineAlgorithm.class).to(ClonerEngineAlgorithm.class);
    }
}
