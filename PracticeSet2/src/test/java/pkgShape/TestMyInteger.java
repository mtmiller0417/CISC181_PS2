package pkgShape;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgMyInteger.MyInteger;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestPrime() 
	{
		MyInteger int1 = new MyInteger(10);
		MyInteger int2 = new MyInteger(7);
		int tester = 6;
		int tester2 = 11;
		int tester3 = 10;
		boolean f = false;
		boolean t = true;
		
		assertEquals(f, tester2 == int1.getiValue());
		
		assertEquals(t, int1.isEven());
		assertEquals(f, int2.isEven());
		
		assertEquals(f, int1.isOdd());
		assertEquals(t, int2.isOdd());
		
		assertEquals(f, int1.isPrime());
		assertEquals(t, int2.isPrime());
		
		assertEquals(t, MyInteger.isEven(tester));
		assertEquals(f, MyInteger.isEven(tester2));
		
		assertEquals(f, MyInteger.isOdd(tester));
		assertEquals(t, MyInteger.isOdd(tester2));
		
		assertEquals(f, MyInteger.isPrime(tester));
		assertEquals(t, MyInteger.isPrime(tester2));
		
		assertEquals(t, MyInteger.isEven(int1));
		assertEquals(f, MyInteger.isEven(int2));
		
		assertEquals(f, MyInteger.isOdd(int1));
		assertEquals(t, MyInteger.isOdd(int2));
		
		assertEquals(f, MyInteger.isPrime(int1));
		assertEquals(t, MyInteger.isPrime(int2));
		
		assertEquals(t, int1.equals(tester3));
		assertEquals(f, int1.equals(tester2));
		
		assertEquals(t, int1.equals(int1));
		assertEquals(f, int1.equals(int2));
	}

}
