/*
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 */
package com.taig.keyvalue;

/**
 * A generic KeyValue-implementation.
 *
 * @param <K> The key's type.
 * @param <V> The value's type.
 */
public class KeyValue<K, V>
{
	private K key;

	private V value;

	/**
	 * Construct a KeyValue object.
	 *
	 * @param key   A key value. May not be <code>null</code>.
	 * @param value The payload value. May be <code>null</code>.
	 */
	public KeyValue( K key, V value )
	{
		setKey( key );
		setValue( value );
	}

	/**
	 * Retrieve the key.
	 *
	 * @return The key value.
	 */
	public K getKey()
	{
		return key;
	}

	/**
	 * Set the key.
	 *
	 * @param key A key value. May not be <code>null</code>.
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
	 * @return The payload value. May be <code>null</code>.
	 */
	public V getValue()
	{
		return value;
	}

	/**
	 * Set the value.
	 *
	 * @param value Set the payload value. May be <code>null</code>.
	 */
	public void setValue( V value )
	{
		this.value = value;
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

	@Override
	public boolean equals( Object object )
	{
		if( object != null && object instanceof KeyValue<?, ?> )
		{
			KeyValue<?, ?> element = (KeyValue<?, ?>) object;

			return key.equals( element.getKey() );
		}

		return false;
	}

	@Override
	public String toString()
	{
		return toString( "%s => %s" );
	}

	/**
	 * Generate a formatted String consisting of two Strings [key, value].
	 *
	 * @param pattern The String.format parameter (e.g. "%s, %s").
	 * @return A string representation based on the given pattern (e.g. '"taig" => "great"' for the pattern "%s => %s").
	 * @see String#format(String, Object...)
	 */
	public String toString( String pattern )
	{
		return String.format( pattern, key, value );
	}
}