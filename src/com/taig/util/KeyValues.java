package com.taig.util;

import java.util.Collection;
import java.util.LinkedList;

/**
 * A convenience extension of the {@link KeyValue} class specialized on a
 * {@link Collection}-value.
 * 
 * @param <K>
 *            The key's type.
 * @param <V>
 *            The value's type (without the collection).
 */
public class KeyValues<K, V> extends KeyValue<K, Collection<V>>
{
	/**
	 * Construct a {@link KeyValues} object with a single value.
	 * 
	 * @param key
	 * @param value
	 */
	public KeyValues( K key, V value )
	{
		this( key, new LinkedList<V>() );
		getValue().add( value );
	}

	/**
	 * Construct a {@link KeyValues} object based on a {@link Collection} of
	 * values.
	 * 
	 * @param key
	 * @param values
	 */
	public KeyValues( K key, Collection<V> values )
	{
		super( key, values );
	}
}