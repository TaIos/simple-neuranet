package com.github.talos.simple_neuranet.model.activation_functions;

/**
 * ReLU (rectified linear unit) activation function given by formula: f(x) = max(0, x).
 */
public class ReLUActivationFunction extends ActivationFunctionBase<Double, Double> {

	@Override
	public Double apply(Double x) {
		return Math.max(0, x);
	}

}
