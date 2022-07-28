package skripte;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MAIN {

    private static final Logger LOG = LogManager.getLogger(MAIN.class);

    public static void main(String[] args) {
	LOG.info("info");
	LOG.warn("warn");
	LOG.error("error");
	LOG.fatal("fatal");
    }

}
