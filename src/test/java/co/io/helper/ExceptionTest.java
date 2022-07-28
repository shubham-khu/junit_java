package co.io.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionTest {

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void indexTest()
	{
		int[] a = {1,2,3};
		System.out.println(a[4]);
	}

}
