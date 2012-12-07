package com.taig.keyvalue;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * A {@link java.util.Set Set} for {@link KeyValue} objects. Provides additional methods to manage the {@link
 * java.util.Set Set} with the {@link KeyValue KeyValue's} key.
 *
 * @param <K>
 * @param <V>
 */
public class KeyValueSet<K, V> extends HashSet<KeyValue<K, V>>
{
	/**
	 * Construct a {@link KeyValueSet}.
	 */
	public KeyValueSet()
	{
		super();
	}

	/**
	 * Construct a {@link KeyValueSet} with an initial capacity.
	 *
	 * @param initialCapacity {@inheritDoc}
	 */
	public KeyValueSet( int initialCapacity )
	{
		super( initialCapacity );
	}

	/**
	 * Construct a {@link KeyValueSet} with an initial capacity and the load factor.
	 *
	 * @param initialCapacity {@inheritDoc}
	 * @param loadFactor      {@inheritDoc}
	 */
	public KeyValueSet( int initialCapacity, float loadFactor )
	{
		super( initialCapacity, loadFactor );
	}

	/**
	 * Construct a {@link KeyValueSet} based on a given {@link Collection}.
	 *
	 * @param collection {@inheritDoc}
	 */
	public KeyValueSet( Collection<KeyValue<K, V>> collection )
	{
		super( collection );
	}

	/**
	 * Retrieve a value by its key.
	 *
	 * @param key The key that will be searched for in the Set.
	 * @return The first value with the given key or <code>null</code> if the key was not found.
	 */
	public V get( K key )
	{
		for( KeyValue<K, V> element : this )
		{
			if( element.getKey().equals( key ) )
			{
				return element.getValue();
			}
		}

		return null;
	}

	/**
	 * Check if the given key exists in the {@link Collection}.
	 *
	 * @param key The key that will be searched.
	 * @return <code>true</code> if the key exists at least once, otherwise <code>false</code>.
	 */
	public boolean containsKey( K key )
	{
		for( KeyValue<K, V> element : this )
		{
			if( element.getKey().equals( key ) )
			{
				return true;
			}
		}

		return false;
	}

	/**
	 * Generate a formatted String based on the {@link Collection Collection's} elements.
	 *
	 * @param pattern The String.format parameter (e.g. "[%s]").
	 * @param glue    The String used to concatenate the {@link Collection Collection's} elements.
	 * @return The formatted String.
	 * @see String#format(String, Object...)
	 */
	public String toString( String pattern, String glue )
	{
		StringBuilder stringBuilder = new StringBuilder();

		for( Iterator<KeyValue<K, V>> iterator = iterator(); iterator.hasNext(); )
		{
			stringBuilder.append( iterator.next() );

			if( iterator.hasNext() )
			{
				stringBuilder.append( glue );
			}
		}

		return String.format( pattern, stringBuilder );
	}

	@Override
	public String toString()
	{
		return toString( "[%s]", ", " );
	}
}