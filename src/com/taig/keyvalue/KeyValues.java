package com.taig.keyvalue;

import java.util.Collection;

/**
 * A convenience extension of the {@link KeyValue} class specialized on a {@link Collection}-value.
 *
 * @param <K> The key's type.
 * @param <V> The value's collection-type.
 */
public class KeyValues<K, V> extends KeyValue<K, Collection<V>>
{
	/**
	 * Construct a {@link KeyValues} object based on a {@link Collection} of values.
	 *
	 * @param key    {@inheritDoc}
	 * @param values The payload collection. May be <code>null</code>.
	 */
	public KeyValues( K key, Collection<V> values )
	{
		super( key, values );
	}

	/**
	 * Convenience method for semantic integrity. Equal to {@link #getValue()}.
	 *
	 * @return The payload collection. May be <code>null</code>.
	 */
	public Collection<V> getValues()
	{
		return getValue();
	}

	/**
	 * Convenience method for semantic integrity. Equal to {@link #setValue(Object)}.
	 */
	public void setValues( Collection<V> values )
	{
		setValue( values );
	}
}