package com.taig.util;

public class Triple<L, M, R> extends Tuple<L, R>
{
	M middle;

	public Triple( L left, M middle, R right )
	{
		super( left, right );
		this.middle = middle;
	}
	
	public M getMiddle()
	{
		return middle; 
	}
	
	public void setMiddle( M middle )
	{
		this.middle = middle;
	}
}