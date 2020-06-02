package com.github.talos.simple_neuranet.neura_api;

import java.util.Arrays;

/**
 * Simple-neuranet API. Build using {@link SimpleNeuranetBuilder}
 */
public class SimpleNeuranet {

	private int layerCount;
	private int neuronLayerCount[];

	SimpleNeuranet(int layerCount, int neuronLayerCount[]) {
		this.layerCount = layerCount;
		this.neuronLayerCount = neuronLayerCount;
		System.out.println("Initialized with: layerCount=" + layerCount);
		System.out.println("neuronLayerCount=" + Arrays.toString(neuronLayerCount));
	}

}
