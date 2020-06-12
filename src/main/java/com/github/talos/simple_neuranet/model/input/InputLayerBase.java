package com.github.talos.simple_neuranet.model.input;

import java.util.ArrayList;
import java.util.List;

/**
 * Basic grouping of inputs to layer.
 * 
 * @param <T> input type contained in layer
 */
public abstract class InputLayerBase<T extends InputBase<T>> {
	List<T> inputs;

	public InputLayerBase() {
		inputs = new ArrayList<T>();
	}

	// ========================================================================================================================
	// GETTERS & SETTERS
	// ========================================================================================================================

	public List<T> getInputs() {
		return inputs;
	}

	public void setInputs(List<T> inputs) {
		this.inputs = inputs;
	}

	public void addInput(T input) {
		this.inputs.add(input);
	}

}
