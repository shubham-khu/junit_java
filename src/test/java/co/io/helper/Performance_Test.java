package co.io.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Performance_Test {

	//time is in millisecond
	@Test(timeout = 100)
	public void test() {
		int arr[]= {12,2,32};
		
		for(int i=1;i<10000;i++)
		{
			arr[0]=i;
			Arrays.sort(arr);
		}
	}

}
