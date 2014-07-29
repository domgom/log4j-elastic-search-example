/**
 * 
 */
package com.thomascook.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gomezgarciad
 *
 */
public class Another {

	private static Logger LOGGER = LoggerFactory.getLogger("another");
	
	static void log(){
		LOGGER.info("Another logger is logging");
	}
}
