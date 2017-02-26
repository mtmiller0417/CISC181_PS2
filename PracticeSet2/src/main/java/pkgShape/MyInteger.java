package pkgShape;

public class MyInteger 
{
	private int iValue;

	public MyInteger(int x) 
	{
		iValue = x;
	}

	public int getiValue()
	{
		return iValue;
	}

	public boolean isEven()
	{
		if(iValue % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isOdd()
	{
		if(iValue % 2 == 0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
	
	public boolean isPrime()
	{
		for(int c = 2; c < iValue; c++)
		{
			if(iValue % c == 0)
			{
				return false;
			}			
		}
		return true;
	}
	
	public static boolean isEven(int x)
	{
		if(x % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int x)
	{
		if(x % 2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean isPrime(int x)
	{
		for(int c = 2; c < x; c++)
		{
			if(x % c == 0)
			{
				return false;
			}			
		}
		return true;
	}
	
	public static boolean isEven(MyInteger x)
	{
		if(x.iValue % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public static boolean isOdd(MyInteger x)
	{
		if(x.iValue % 2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}	
	
	public static boolean isPrime(MyInteger x)
	{
		for(int c = 2; c < x.iValue; c++)
		{
			if(x.iValue % c == 0)
			{
				return false;
			}			
		}
		return true;
	}	
	
	public boolean equals(int x)
	{
		if(x == iValue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean equals(MyInteger x)
	{
		if(x.iValue == iValue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
