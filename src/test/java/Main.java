import com.github.talos.simple_neuranet.logger.NeuraLogger;

public class Main {
	public static void main(String[] args) {
		try {
			// SimpleNeuranet sn = SimpleNeuranetBuilder.newBuilder().build();
			// SimpleNeuranet sn = SimpleNeuranetBuilder.newBuilder().setLayerCount(5).build();
			// SimpleNeuranet sn = SimpleNeuranetBuilder.newBuilder().setLayerCount(5).setNeuronCountForLayer(1, 50).build();
			// SimpleNeuranet sn = SimpleNeuranetBuilder.newBuilder().setLayerCount(5).setNeuronCountForLayer(0, 50).build();
			// SimpleNeuranet sn = SimpleNeuranetBuilder.newBuilder().setLayerCount(5).setNeuronCountForLayer(10, 50).build();
			// System.out.println(NeuraLogMessageType.ERROR.value);

			NeuraLogger.info("info msg");
			NeuraLogger.warning("warning message");
			NeuraLogger.error("error message");

		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

	private enum NeuraLogMessageType {
		ERROR("E"), WARNING("WARNING"), INFO("INFO");

		public final String value;

		private NeuraLogMessageType(String str) {
			this.value = str;
		}
	}
}
