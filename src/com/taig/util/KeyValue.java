package com.taig.util;

/**
 * A generic KeyValue-implementation.
 * 
 * @param <K>
 *            The key's type.
 * @param <V>
 *            The value's type.
 */
public class KeyValue<K, V>
{
	private K	key;

	private V	value;

	/**
	 * Construct a KeyValue object.
	 * 
	 * @param key
	 * @param value
	 */
	public KeyValue( K key, V value )
	{
		setKey( key );
		setValue( value );
	}

	/**
	 * Retrieve the key.
	 * 
	 * @return
	 */
	public K getKey()
	{
		return key;
	}

	/**
	 * Set the key.
	 * 
	 * @param key
	 */
	public void setKey( K key )
	{
		if( key == null )
		{
			throw new IllegalArgumentException( "The key may not be null." );
		}
		else
		{
			this.key = key;
		}
	}

	/**
	 * Retrieve the value.
	 * 
	 * @return
	 */
	public V getValue()
	{
		return value;
	}

	/**
	 * Set the value.
	 * 
	 * @param value
	 */
	public void setValue( V value )
	{
		this.value = value;
	}

	@Override
	public boolean equals( Object object )
	{
		if( object instanceof KeyValue<?, ?> )
		{
			KeyValue<?, ?> element = (KeyValue<?, ?>) object;

			return key.equals( element.getKey() );
		}

		return false;
	}

	@Override
	public int hashCode()
	{
		if( key == null )
		{
			return 0;
		}
		else
		{
			return key.hashCode();
		}
	}

	/**
	 * Generate a formatted String consisting of two Strings [key, value].
	 * 
	 * @param pattern
	 *            The String.format parameter (e.g. "%s, %s").
	 * @return
	 * @see String#format(String, Object...)
	 */
	public String toString( String pattern )
	{
		return String.format( pattern, key, value );
	}

	@Override
	public String toString()
	{
		return toString( "%s => %s" );
	}
}