package Logging;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LogTest {
	
	
	@Test
	public void oneCanWriteMessageToLog(){
		Logger logger = LogManager.getRootLogger(); 
			
		logger.debug("Debug message"); 
		logger.info("Info message"); 
		logger.error("Error message");
		logger.fatal("Fatal message");		
		logger.warn("Warn message");
		logger.trace("Trace message");
				
	}; 
	
	
	

}
