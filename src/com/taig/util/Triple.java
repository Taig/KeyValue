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
	
	@Override
	public String toString()
	{
		return "( " + getLeft() + ", " + getMiddle() + ", " + getRight() + " )";
	}
}