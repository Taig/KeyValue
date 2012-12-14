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
 * @param <First> The first item's type (the key).
 * @param <Second> The second item's type (the value).
 */
public class Tuple<First, Second> extends KeyValue<First, Second>
{
	/**
	 * Construct a {@link Tuple}.
	 *
	 * @param first  The Tuple's first item.
	 * @param second The Tuple's second item.
	 */
	public Tuple( First first, Second second )
	{
		super( first, second );
	}

	/**
	 * Get the {@link Tuple Tuple's} first item (the key).
	 *
	 * @return The Tuple's first item (the key).
	 */
	public First getFirst()
	{
		return getKey();
	}

	/**
	 * Set the {@link Tuple Tuple's} first item (the key).
	 *
	 * @param first The Tuple's first item (the key).
	 */
	public void setFirst( First first )
	{
		setKey( first );
	}

	/**
	 * Get the {@link Tuple Tuple's} second item (the value).
	 *
	 * @return The Tuple's second item (the value).
	 */
	public Second getSecond()
	{
		return getValue();
	}

	/**
	 * Set the {@link Tuple Tuple's} second item (the value).
	 *
	 * @param second The Tuple's second item (the value).
	 */
	public void setSecond( Second second )
	{
		setValue( second );
	}

	@Override
	public String toString()
	{
		return super.toString( "(%s, %s)" );
	}
}