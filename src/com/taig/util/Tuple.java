/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package com.taig.util;

/**
 * A semantic alternative to a {@link KeyValue} class. Provides no additional functionalities.
 *
 * @param <L> The left item's type (the key).
 * @param <R> The right item's type (the value).
 */
public class Tuple<L, R> extends KeyValue<L, R>
{
	/**
	 * Construct a {@link Tuple}.
	 *
	 * @param left  The Tuple's left item.
	 * @param right The Tuple's right item.
	 */
	public Tuple( L left, R right )
	{
		super( left, right );
	}

	/**
	 * Get the {@link Tuple Tuple's} left item (the key).
	 *
	 * @return The Tuple's left item (the key).
	 */
	public L getLeft()
	{
		return getKey();
	}

	/**
	 * Set the {@link Tuple Tuple's} left item (the key).
	 *
	 * @param left The Tuple's left item (the key).
	 */
	public void setLeft( L left )
	{
		setKey( left );
	}

	/**
	 * Get the {@link Tuple Tuple's} right item (the value).
	 *
	 * @return The Tuple's right item (the value).
	 */
	public R getRight()
	{
		return getValue();
	}

	/**
	 * Set the {@link Tuple Tuple's} right item (the value).
	 *
	 * @param right The Tuple's right item (the value).
	 */
	public void setRight( R right )
	{
		setValue( right );
	}

	@Override
	public String toString()
	{
		return super.toString( "(%s, %s)" );
	}
}