package com.github.talos.simple_neuranet.model.functions;

public class SigmoidActivationFunction extends ActivationFunctionBase<Double, Double> {

	public Double apply(Double x) {
		return 1 / (1 + Math.exp(-x));
	}

}
