package Demo1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4jDemo {
	//private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
	
	System.out.println("\n  Hi logj4 here   \n");
	
	// we will not get this tace message unless we specify level=trace in log4j2 properties file. Then all logs equal and below trace level will be logged
	//if we mention level=debug only the logs debug and below level will be logged
	logger.trace("This is tace message");
	logger.info("This is information message");
	logger.error("This is error message");
	logger.warn("This is warning message");
	logger.fatal("This is fatal message");
	
	System.out.println("\n completed");

	}

}
