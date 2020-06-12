package com.github.talos.simple_neuranet.model.activation_functions;

/**
 * Sigmoid activation function given by formula: f(x) = 1 / (1+e^{-x}).
 */
public class SigmoidActivationFunction extends ActivationFunctionBase<Double, Double> {

	public Double apply(Double x) {
		return 1 / (1 + Math.exp(-x));
	}

}
