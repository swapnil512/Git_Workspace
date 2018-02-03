package com.training.client;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class LoggingDemo {

	private static Logger logger = Logger.getLogger("Logging Demo");

	public static void main(String[] args) {
		// logger.getRootLogger();
		try {
			FileAppender a0 = new FileAppender(new SimpleLayout(), "a0.log");
			FileAppender a1 = new FileAppender(new SimpleLayout(), "a1.log");
			logger.addAppender(a0);
			logger.addAppender(a1);
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		logger.debug("Life is too short, live it fully");
		logger.setLevel(Level.OFF);
	}

}
