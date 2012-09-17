package com.taig.util;

/**
 * A semantic alternative to a {@link KeyValue} class. Provides no additional
 * functionalities.
 * 
 * @param <L>
 * @param <R>
 */
public class Tuple<L, R> extends KeyValue<L, R>
{
	/**
	 * Construct a {@link Tuple}.
	 * 
	 * @param left
	 * @param right
	 */
	public Tuple( L left, R right )
	{
		super( left, right );
	}

	/**
	 * Get the {@link Tuple Tuple's} left item (the key).
	 * 
	 * @return
	 */
	public L getLeft()
	{
		return getKey();
	}

	/**
	 * Set the {@link Tuple Tuple's} left item (the key).
	 * 
	 * @param left
	 */
	public void setLeft( L left )
	{
		setKey( left );
	}

	/**
	 * Get the {@link Tuple Tuple's} right item (the value).
	 * 
	 * @param left
	 */
	public R getRight()
	{
		return getValue();
	}

	/**
	 * Set the {@link Tuple Tuple's} right item (the value).
	 * 
	 * @param left
	 */
	public void setRight( R right )
	{
		setValue( right );
	}

	@Override
	public String toString()
	{
		return "( " + getLeft() + ", " + getRight() + " )";
	}
}