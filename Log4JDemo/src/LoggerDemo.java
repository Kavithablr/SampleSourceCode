import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerDemo {

	public static void main(String[] args){
		
		Logger logger = Logger.getLogger("LoggerDemo");
		PropertyConfigurator.configure("/Users/kavitha/Documents/workspace/Log4JDemo/Log4j.Properties");
		logger.debug("This is debug");
		logger.info("This is info");
		logger.warn("This is warn");

		//in the catch block
		logger.error("This is error");
		logger.fatal("This is fatal");
		System.out.println("Log4j demo");
		
	}
	
}
