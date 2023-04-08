package com.logger;

import org.slf4j.Logger;

public class Loggerfactory {
	private final static Logger logger = ColorLogFactory.getLogger(Loggerfactory.class);
	public static void main(String[] args) {
		logger.info("HI CHaran!!!!!!!!!!!1");
	}
}
