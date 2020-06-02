package com.github.talos.simple_neuranet.model;

/**
 * General input
 * 
 * @param <T> type value that input produces
 */
public abstract class Input<T> {

	/**
	 * Get value of input.
	 * 
	 * @return input value
	 */
	public abstract T get();
}
