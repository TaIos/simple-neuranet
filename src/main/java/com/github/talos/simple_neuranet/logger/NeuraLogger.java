package com.github.talos.simple_neuranet.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Log4j wrapper for logging.
 */
public class NeuraLogger {
	final static Logger logger = LogManager.getLogger(com.github.talos.simple_neuranet.logger.NeuraLogger.class.getCanonicalName());

	// ========================================================================================================================
	// LOGGING
	// ========================================================================================================================

	public static void error(String msg) {
		if (logger.isErrorEnabled()) {
			logger.error(msg);
		} else {
			System.out.println("ERROR LOGGING NOT ENABLED: " + msg);
		}
	}

	public static void info(String msg) {
		if (logger.isInfoEnabled()) {
			logger.info(msg);
		} else {
			System.out.println("INFO LOGGING NOT ENABLED: " + msg);
		}
	}

	public static void warning(String msg) {
		if (logger.isWarnEnabled()) {
			logger.warn(msg);
		} else {
			System.out.println("WARNING LOGGING NOT ENABLED: " + msg);
		}
	}

	public static void debug(String msg) {
		if (logger.isDebugEnabled()) {
			logger.debug(msg);
		} else {
			System.out.println("DEBUG LOGGING NOT ENABLED: " + msg);
		}
	}

}
