package com.github.talos.simple_neuranet.neura_api;

import java.util.Arrays;

import com.github.talos.simple_neuranet.logger.NeuraLogger;

/**
 * Simple-neuranet API. Build using {@link SimpleNeuranetBuilder}
 */
public class SimpleNeuranet {

	private int layerCount;
	private int neuronLayerCount[];

	SimpleNeuranet(int layerCount, int neuronLayerCount[]) {
		this.layerCount = layerCount;
		this.neuronLayerCount = neuronLayerCount;
		NeuraLogger.info("Initialized with: layerCount=" + layerCount);
		NeuraLogger.info("neuronLayerCount=" + Arrays.toString(neuronLayerCount));
	}

}
