package com.github.talos.simple_neuranet.model.activation_functions;

import java.util.function.Function;

/**
 * Basic activation function (not only) for neural networks
 * 
 * @param <T> type of input
 * @param <R> type of result
 */
public abstract class ActivationFunctionBase<T, R> implements Function<T, R> {

	public abstract R apply(T x);

}
