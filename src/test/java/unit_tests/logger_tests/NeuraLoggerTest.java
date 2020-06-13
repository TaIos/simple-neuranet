package unit_tests.logger_tests;

import org.junit.jupiter.api.Test;

import com.github.talos.simple_neuranet.logger.NeuraLogger;

class NeuraLoggerTest {

	@Test
	void testError() {
		NeuraLogger.error("Sample error message.");
	}

	@Test
	void testInfo() {
		NeuraLogger.info("Sample info message.");
	}

	@Test
	void testWarning() {
		NeuraLogger.warning("Sample warning message.");
	}

	@Test
	void testDebug() {
		NeuraLogger.debug("Sample debug message.");
	}

}
