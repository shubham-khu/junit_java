package co.io.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfterTest {

	@Before
	public void setup()
	{
		System.out.println("Any thing which we want to configure before "
				+ "test case start");
	}
	
	@Test
	public void test1() {

		System.out.println("test1 executed");
	}

	@Test
	public void test2() {

		System.out.println("test2 executed");
	}
	
	@After
	public void teardown()
	{
		System.out.println("If we used too much data to do our test then "
				+ "through after we can release as it will run after @test");
		
	}
}
