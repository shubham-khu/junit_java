package co.io.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		//		fail("Not yet implemented");
		StringHelper helper = new StringHelper();
		//assertEquals(expected, actual)
		assertEquals("CD", helper.truncateAInFirst2Position("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Position("ACD"));
		}

}
