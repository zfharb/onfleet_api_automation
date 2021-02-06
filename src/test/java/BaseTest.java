import org.junit.BeforeClass;

import java.util.logging.*;

public class BaseTest {

    public Logger logger;

    @BeforeClass
    public void setup(){
        logger=Logger.getLogger("onfleet API");
        logger.setLevel(Level.ALL);
    }
}
