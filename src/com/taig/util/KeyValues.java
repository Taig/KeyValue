package com.taig.util;

import java.util.Collection;
import java.util.LinkedList;

public class KeyValues<K, V> extends KeyValue<K, Collection<V>>
{
	public KeyValues( K key, V value )
	{
		this( key, new LinkedList<V>() );
		getValue().add( value );
	}
	
	public KeyValues( K key, Collection<V> values )
	{
		super( key, values );
	}
}