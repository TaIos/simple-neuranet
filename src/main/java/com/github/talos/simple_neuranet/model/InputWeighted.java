package com.github.talos.simple_neuranet.model;

public class InputWeighted extends Input<Double> {
	Double value;
	Double weight;

	public InputWeighted() {
		value = 0d;
		weight = 1d;
	}

	@Override
	public Double get() {
		return value * weight;
	}

	// ========================================================================================================================
	// GETTERS & SETTERS
	// ========================================================================================================================

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
