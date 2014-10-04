package demibenari;

import com.google.inject.Guice;
import com.google.inject.Injector;
import demibenari.engine.SystemEngine;
import demibenari.modules.SystemConfigMoudule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * Created by Demi Ben-Ari on 9/29/2014.
 */
public class GuiceMain {
    private static final Logger logger = LogManager.getLogger(GuiceMain.class);

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new SystemConfigMoudule());

        SystemEngine engine = injector.getInstance(SystemEngine.class);

        engine.doWork();
    }
}
