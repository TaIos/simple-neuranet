package com.github.talos.simple_neuranet.logger;

import org.apache.log4j.Logger;

/**
 * Log4j wrapper for logging.
 */
public class NeuraLogger {
	final static Logger logger = Logger.getLogger(com.github.talos.simple_neuranet.logger.NeuraLogger.class);

	// ========================================================================================================================
	// LOGGING
	// ========================================================================================================================

	public static void error(String msg) {
		logger.error(msg);
	}

	public static void info(String msg) {
		if (logger.isInfoEnabled()) {
			logger.info(msg);
		}
	}

	public static void warning(String msg) {
		logger.warn(msg);
	}

	public static void debug(String msg) {
		if (logger.isDebugEnabled()) {
			logger.debug(msg);
		}
	}

}
