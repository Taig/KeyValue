package com.taig.util;

/**
 * The logical continuation of a {@link Tuple}. Is equipped an additional field
 * (middle).
 * 
 * @param <L>
 * @param <M>
 * @param <R>
 */
public class Triple<L, M, R> extends Tuple<L, R>
{
	M	middle;

	/**
	 * Construct a {@link Triple}.
	 * 
	 * @param left
	 * @param middle
	 * @param right
	 */
	public Triple( L left, M middle, R right )
	{
		super( left, right );
		this.middle = middle;
	}

	/**
	 * Get the {@link Triple Triple's} middle element.
	 * 
	 * @return
	 */
	public M getMiddle()
	{
		return middle;
	}

	/**
	 * Set the {@link Triple Triple's} middle element.
	 * 
	 * @param middle
	 */
	public void setMiddle( M middle )
	{
		this.middle = middle;
	}

	/**
	 * Generate a formatted String consisting of three Strings [left, middle,
	 * right].
	 * 
	 * @param pattern
	 *            The String.format parameter (e.g. "(%s, %s, %s)").
	 * @return
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