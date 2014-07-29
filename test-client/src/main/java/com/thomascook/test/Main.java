package com.thomascook.test;

import java.io.IOException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class Main {

	private static Logger LOGGER = LoggerFactory.getLogger("AVAIL_RQ");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			URL url = Resources.getResource("logs/example1.log");
			String text = Resources.toString(url, Charsets.UTF_8);

			LOGGER.info(text);
			Another.log();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		LogManager.shutdown();
	}
}
