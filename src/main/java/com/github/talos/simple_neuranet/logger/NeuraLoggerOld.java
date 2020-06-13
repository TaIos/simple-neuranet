package com.github.talos.simple_neuranet.logger;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Simple logger using custom messages and formats.
 * 
 * @deprecated Replaced with {@link NeuraLogger} for more logging options.
 */
@Deprecated
public class NeuraLoggerOld {

	private static final NeuraLoggerOld instance = createNewInstance();

	private static NeuraLoggerOld createNewInstance() {
		NeuraLoggerOld logger = new NeuraLoggerOld();
		return logger;
	}

	private NeuraLoggerOld() {
		if (instance != null) {
			// Prevent Reflection
			throw new IllegalStateException("Cannot instantiate a new singleton instance");
		}
	}

	// ========================================================================================================================
	// LOGGING
	// ========================================================================================================================

	public static void error(String msg) {
		instance.saveTextLog(msg, NeuraLogMessageType.ERROR);
	}

	public static void info(String msg) {
		instance.saveTextLog(msg, NeuraLogMessageType.INFO);
	}

	public static void warning(String msg) {
		instance.saveTextLog(msg, NeuraLogMessageType.WARNING);
	}

	// ============================================================

	private void saveTextLog(String msg, NeuraLogMessageType msgType) {
		String outStr = LoggerUtil.getLogTimestampPrefixForTextFileOutput() + " " + msgType.value + " " + LoggerUtil.getStactTraceFormatted() + ": " + msg;
		System.out.println(outStr);
	}

	// ========================================================================================================================
	// HELPERS
	// ========================================================================================================================

	/*
	 * Helper methods
	 */
	public static class LoggerUtil {

		/**
		 * Get time prefix for a text log message
		 * 
		 * @return formatted string containing time information in format that can be prefixed to log to specify it's time
		 */
		public static String getLogTimestampPrefixForTextFileOutput() {
			return "[" + getLocalDateTimeNow().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "]";
		}

		/**
		 * Get time prefix with formatting for a terminal output
		 * 
		 * @return formatted string containing time information in format that can be prefixed to log to specify it's time
		 */
		public static String getLogTimestampPrefixForTerminalOutput() {
			return "[" + getLocalDateTimeNow().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "]";
		}

		/**
		 * Get [day-month-year] unique prefix
		 * 
		 * @return [day-month-year] unique prefix
		 */
		public static String getDaySpecificPrefixOfLogFile() {
			return getLocalDateTimeNow().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		}

		/**
		 * Get [day-month-year-hour-minute-second] prefix that can be used at Windows machines for creating file (excluding characters like ':' in filename)
		 * 
		 * @return [day-month-year-hour-minute-second] prefix
		 */
		public static String getSecondSpecificPrefixOfLogFileForWindows() {
			final String colon = "꞉"; // won't trhow error while saving file with this 'colon' like symbol
			return getLocalDateTimeNow().format(DateTimeFormatter.ofPattern("dd-MM-yyyy" + colon + "HH" + colon + "mm" + colon + "ss"));
		}

		/**
		 * Create (if not exists) and retrieve direcotry with name {@code dirName} in {@code path}.
		 * 
		 * @param absolutePath absolute path on filesystem
		 * @param dirName      name of the directory that is crated (if not exists) in {@code path}
		 * @return created directory as {@link File}
		 */
		public static File createDirectoryIfNotExists(String absolutePath, String dirName) {
			File dir = new File(absolutePath + File.separator + dirName);

			if (!dir.exists()) {
				if (dir.mkdir()) {
					System.out.println("INFO: directory '" + dir.getAbsolutePath() + "' succesfully created");
				} else {
					System.err.println("INFO: directory '" + dir.getAbsolutePath() + "' can't be created");
				}
			}
			return dir;
		}

		public static LocalDateTime getLocalDateTimeNow() {
			return LocalDateTime.now();
		}

		public static String getStactTraceFormatted() {
			StackTraceElement[] trace = Thread.currentThread().getStackTrace();

			if (trace.length > 4) {
				StackTraceElement contextElem = trace[4];
				String classNameFull = contextElem.getClassName();
				String methodName = contextElem.getMethodName();

				String[] classNameSplit = classNameFull.split("\\.");
				String classNameSimple = classNameSplit[classNameSplit.length - 1];
				return classNameSimple + "#" + methodName;
			} else {
				return "";
			}

		}
	}

	private enum NeuraLogMessageType {
		ERROR("ERROR"), WARNING("WARNING"), INFO("INFO");

		private final String value;

		private NeuraLogMessageType(String str) {
			this.value = str;
		}

	}

}
