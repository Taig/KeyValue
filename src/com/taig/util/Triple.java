/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package com.taig.util;

/**
 * The logical continuation of a {@link Tuple}. Is equipped with an additional field (third).
 *
 * @param <First>  The first item's type.
 * @param <Second> The second item's type.
 * @param <Third>  The third item's type.
 */
public class Triple<First, Second, Third> extends Tuple<First, Second>
{
	/**
	 * The third item.
	 */
	private Third third;

	/**
	 * Construct a {@link Triple}.
	 *
	 * @param first  The Triple's first item.
	 * @param second The Triple's second item.
	 * @param third  The Triple's third item.
	 */
	public Triple( First first, Second second, Third third )
	{
		super( first, second );
		this.third = third;
	}

	/**
	 * Get the {@link Triple Triple's} third element.
	 *
	 * @return The Triple's third item.
	 */
	public Third getThird()
	{
		return third;
	}

	/**
	 * Set the {@link Triple Triple's} third element.
	 *
	 * @param third The Triple's third item.
	 */
	public void setThird( Third third )
	{
		this.third = third;
	}

	/**
	 * Generate a formatted String consisting of three Strings [first, second, third].
	 *
	 * @param pattern The String.format parameter (e.g. "(%s, %s, %s)").
	 * @return The formatted String.
	 * @see String#format(String, Object...)
	 */
	public String toString( String pattern )
	{
		return String.format( pattern, getFirst(), getSecond(), third );
	}

	@Override
	public String toString()
	{
		return toString( "(%s, %s, %s)" );
	}
}