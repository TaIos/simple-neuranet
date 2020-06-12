package com.github.talos.simple_neuranet.model;

import java.util.ArrayList;
import java.util.List;

import com.github.talos.simple_neuranet.model.activation_functions.ActivationFunctionBase;
import com.github.talos.simple_neuranet.model.activation_functions.SigmoidActivationFunction;

/**
 * Simle neuron with inputs, bias and activation function
 * 
 */
public class Neuron extends NeuronBase<Double> {
	private List<InputWeighted> inputLst;
	private Double bias;
	private ActivationFunctionBase<Double, Double> actFnc;

	public Neuron() {
		inputLst = new ArrayList<InputWeighted>();
		actFnc = new SigmoidActivationFunction();
	}

	@Override
	public Double get() {
		Double sumInput = bias + inputLst.stream().mapToDouble(input -> input.get().doubleValue()).sum();
		return actFnc.apply(sumInput);
	}

	// ========================================================================================================================
	// HELPERS
	// ========================================================================================================================

	public void addInput(InputWeighted input) {
		this.inputLst.add(input);
	}

	public void addInputBatch(List<InputWeighted> inputLst) {
		this.inputLst.addAll(inputLst);
	}

}
