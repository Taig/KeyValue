package com.taig.util;

/**
 * A generic KeyValue-implementation.
 * 
 * @param <K>
 * @param <V>
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
		this.key = key;
		this.value = value;
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
		this.key = key;
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
		System.out.println("eq");
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
		return key.hashCode();
	}
}