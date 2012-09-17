package com.taig.util;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * A {@link java.util.Set Set} for {@link KeyValue} objects. Provides additional
 * methods to manage the {@link java.util.Set Set} with the {@link KeyValue
 * KeyValue's} key.
 * 
 * @param <T>
 *            The {@link KeyValue KeyValue's} type.
 */
public class KeyValueSet<T extends KeyValue<?, ?>> extends LinkedHashSet<T>
{
	private static final long	serialVersionUID	= -3477324045431734981L;

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
	 * @param initialCapacity
	 */
	public KeyValueSet( int initialCapacity )
	{
		super( initialCapacity );
	}

	/**
	 * Construct a {@link KeyValueSet} with an initial capacity and the load
	 * factor.
	 * 
	 * @param initialCapacity
	 * @param loadFactor
	 */
	public KeyValueSet( int initialCapacity, float loadFactor )
	{
		super( initialCapacity, loadFactor );
	}

	/**
	 * Construct a {@link KeyValueSet} based on a given {@link Collection}.
	 * 
	 * @param collection
	 */
	public KeyValueSet( Collection<T> collection )
	{
		super( collection );
	}

	/**
	 * Retrieve a {@link KeyValue} object by its key.
	 * 
	 * @param key
	 * @return
	 */
	public T get( Object key )
	{
		for( T element : this )
		{
			if( element.getKey() == null )
			{
				if( key == null )
				{
					return element;
				}
			}
			else
			{
				if( element.getKey().equals( key ) )
				{
					return element;
				}
			}
		}

		return null;
	}

	/**
	 * Check if the given key exists in the {@link Collection}.
	 * 
	 * @param key
	 * @return
	 */
	public boolean containsKey( Object key )
	{
		return get( key ) != null;
	}

	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder( this.getClass().getSimpleName() ).append( " [" );

		if( size() > 0 )
		{
			stringBuilder.append( "\n" );

			for( T keyValue : this )
			{
				stringBuilder.append( "\t" );
				stringBuilder.append( keyValue.toString() );
				stringBuilder.append( "\n" );
			}
		}

		return stringBuilder.append( "]" ).toString();
	}
}