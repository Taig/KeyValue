package com.taig.util;

public class Tuple<L, R> extends KeyValue<L, R>
{
	public Tuple( L left, R right )
	{
		super( left, right );
	}
	
	public L getLeft()
	{
		return getKey();
	}
	
	public void setLeft( L left )
	{
		setKey( left );
	}
	
	public R getRight()
	{
		return getValue();
	}
	
	public void setRight( R right )
	{
		setValue( right );
	}
}