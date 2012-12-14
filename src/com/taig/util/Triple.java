/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package com.taig.keyvalue;

/**
 * The logical continuation of a {@link Tuple}. Is equipped with an additional field (middle).
 *
 * @param <L> {@inheritDoc}
 * @param <M> The middle item's type.
 * @param <R> {@inheritDoc}
 */
public class Triple<L, M, R> extends Tuple<L, R>
{
	/**
	 * The middle item.
	 */
	private M middle;

	/**
	 * Construct a {@link Triple}.
	 *
	 * @param left   The Triple's left item.
	 * @param middle The Triple's middle item.
	 * @param right  The Triple's right item.
	 */
	public Triple( L left, M middle, R right )
	{
		super( left, right );
		this.middle = middle;
	}

	/**
	 * Get the {@link Triple Triple's} middle element.
	 *
	 * @return The Triple's middle item.
	 */
	public M getMiddle()
	{
		return middle;
	}

	/**
	 * Set the {@link Triple Triple's} middle element.
	 *
	 * @param middle The Triple's middle item.
	 */
	public void setMiddle( M middle )
	{
		this.middle = middle;
	}

	/**
	 * Generate a formatted String consisting of three Strings [left, middle, right].
	 *
	 * @param pattern The String.format parameter (e.g. "(%s, %s, %s)").
	 * @return The formatted String.
	 * @see String#format(String, Object...)
	 */
	public String toString( String pattern )
	{
		return String.format( pattern, getLeft(), middle, getRight() );
	}

	@Override
	public String toString()
	{
		return toString( "(%s, %s, %s)" );
	}
}