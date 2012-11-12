package com.taig.keyvalue;

import java.util.Collection;

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

	/**
	 * Convenience method for semantical correctness. Equal to
	 * {@link #getValue()}.
	 * 
	 * @return
	 */
	public Collection<V> getValues()
	{
		return getValue();
	}

	/**
	 * Convenience method for semantical correctness. Equal to
	 * {@link #setValue(Object)}.
	 * 
	 * @return
	 */
	public void setValues( Collection<V> values )
	{
		setValue( values );
	}
}