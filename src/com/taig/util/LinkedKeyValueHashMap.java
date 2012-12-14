package com.taig.keyvalue;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedKeyValueHashMap<K, V> extends LinkedHashMap<K, V>
{
	public LinkedKeyValueHashMap()
	{
		super();
	}

	public LinkedKeyValueHashMap( int i )
	{
		super( i );
	}

	public LinkedKeyValueHashMap( int i, float v )
	{
		super( i, v );
	}

	public LinkedKeyValueHashMap( int i, float v, boolean b )
	{
		super( i, v, b );
	}

	public LinkedKeyValueHashMap( Map<? extends K, ? extends V> map )
	{
		super( map );
	}

	public V put( KeyValue<K, V> keyValue )
	{
		return super.put( keyValue.getKey(), keyValue.getValue() );
	}

	public V remove( KeyValue<K,V> keyValue )
	{
		return super.remove( keyValue.getKey() );
	}
}
