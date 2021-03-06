package com.github.talos.simple_neuranet.neura_api;

import com.github.talos.simple_neuranet.exception.SimpleNeuranetBuilderException;

/**
 * Builder for creating simple-neuranet instance. For creating simple-neuranet instace it is easier to initialize it in one line rather on multiple
 * lines. This pattern can also be seen in scikit.
 */
public class SimpleNeuranetBuilder {
	private int layerCount;
	private int neuronLayerCount[];

	private SimpleNeuranetBuilder(int layerCount, int[] neuronLayerCount) {
		this.layerCount = layerCount;
		this.neuronLayerCount = neuronLayerCount;
	}

	private SimpleNeuranetBuilder() {
		this(0, null);
	}

	// ============================================================

	public static SimpleNeuranetBuilder newBuilder() {
		return new SimpleNeuranetBuilder();
	}

	public static SimpleNeuranetBuilder newBuilderFrom(int layerCount, int neuronLayerCount[]) {
		return new SimpleNeuranetBuilder(layerCount, neuronLayerCount);
	}

	public SimpleNeuranet build() throws SimpleNeuranetBuilderException {
		if (layerCount <= 0 || neuronLayerCount == null) throw new SimpleNeuranetBuilderException("incorectly set parameters");
		return new SimpleNeuranet(layerCount, neuronLayerCount);
	}

	// ========================================================================================================================
	// BUILDING SETTERS
	// ========================================================================================================================

	public SimpleNeuranetBuilder setLayerCount(int layerCount) {
		this.layerCount = layerCount;
		this.neuronLayerCount = new int[layerCount];
		return this;
	}

	public SimpleNeuranetBuilder setNeuronCountForLayer(int layerNumber, int neuronCount) throws SimpleNeuranetBuilderException {
		if (layerNumber > this.layerCount || layerNumber < 1) throw new SimpleNeuranetBuilderException("layer count is too small or too high");
		this.neuronLayerCount[layerNumber - 1] = neuronCount;
		return this;
	}

}
