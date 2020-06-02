package com.github.talos.simple_neuranet.model;

import java.util.List;

/**
 * 
 * @author martin.safranek
 *
 * @param <T> value that neuron produces
 */
public class Neuron extends NeuronBase<Double> {
	List<InputWeighted> inputLst;

	@Override
	public Double get() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addInput(Input<T> input) {
		inputLst.add(input);
	}

}
