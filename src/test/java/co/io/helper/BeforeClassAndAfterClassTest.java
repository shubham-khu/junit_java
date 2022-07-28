package co.io.helper;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClassAndAfterClassTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class is always Static and it will run before class. For ex - if we wnat to establish a database connection for "
				+"testing we can do it here or any process which take long time so that we want only one to do that in whole class");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class works after class means all your woek is done then you can write code cleanyp here");
	}

	@Test
	public void test() {
		System.out.println("Not yet implemented but passed");
	}

}
