package cryhack;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client implements ModInitializer {

    public Logger LOGGER = LogManager.getLogger(Client.class);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello, world!");
    }
}
