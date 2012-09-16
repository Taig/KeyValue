package com.taig.util;

import java.util.Collection;
import java.util.LinkedHashSet;

public class KeyValueSet<T extends KeyValue<?, ?>> extends LinkedHashSet<T>
{
	private static final long	serialVersionUID	= -3477324045431734981L;

	public KeyValueSet()
	{
		super();
	}

	public KeyValueSet( int initialCapacity )
	{
		super( initialCapacity );
	}

	public KeyValueSet( int initialCapacity, float loadFactor )
	{
		super( initialCapacity, loadFactor );
	}

	public KeyValueSet( Collection<T> collection )
	{
		super( collection );
	}

	public T get( Object key )
	{
		for( T element : this )
		{
			if( element.getKey().equals( key ) )
			{
				return element;
			}
		}

		return null;
	}
	
	public boolean containsKey( Object key )
	{
		return get( key ) != null;
	}
}