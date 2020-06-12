package com.github.talos.simple_neuranet.model.input;

/**
 * General input
 * 
 * @param <T> type value that input produces
 */
public abstract class InputBase<T> {

	/**
	 * Get value of input.
	 * 
	 * @return input value
	 */
	public abstract T get();
}
