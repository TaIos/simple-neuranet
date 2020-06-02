import com.github.talos.simple_neuranet.logger.NeuraLogger;
import com.github.talos.simple_neuranet.neura_api.SimpleNeuranetBuilder;

public class Main {
	public static void main(String[] args) {
		try {
			NeuraLogger.info("info message");
			SimpleNeuranetBuilder.newBuilder().setLayerCount(1).setNeuronCountForLayer(1, 5).build();

		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

}
