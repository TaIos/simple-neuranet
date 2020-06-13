package unit_tests.neura_api_tests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.github.talos.simple_neuranet.exception.SimpleNeuranetBuilderException;
import com.github.talos.simple_neuranet.neura_api.SimpleNeuranet;
import com.github.talos.simple_neuranet.neura_api.SimpleNeuranetBuilder;

/**
 * Test initialization and creation of {@link SimpleNeuranet}
 */
class NeuraApiInitializationTest {

	// @Test
	// void testNewBuilder() {
	// fail("Not yet implemented");
	// }

	// @Test
	// void testNewBuilderFrom() {
	// SimpleNeuranetBuilder.newBuilderFrom(0, new int[] { 0, 1 });
	// }

	@Test
	void succesfullInitializtion() {
		try {
			SimpleNeuranetBuilder.newBuilder().setLayerCount(2).setNeuronCountForLayer(1, 1).setNeuronCountForLayer(2, 2).build();
		} catch (SimpleNeuranetBuilderException e) {
			fail("Initialization with correct parameters failed.");
		}
	}

	@Test
	void testBuild() {
		try {
			SimpleNeuranetBuilder.newBuilder().build();
		} catch (SimpleNeuranetBuilderException e) {
			return;
		}
		fail("Initialization succesfull without setting any value.");
	}

	// @Test
	// void testSetLayerCount() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// void testSetNeuronCountForLayer() {
	// fail("Not yet implemented");
	// }

}
