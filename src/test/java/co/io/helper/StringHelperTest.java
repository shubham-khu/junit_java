package co.io.helper;

import static org.junit.Assert.*;


import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper();

	@Test
	public void testTurncatedAInFirst2Positions_Ainfirst2Postion() {
		//		fail("Not yet implemented");
		//assertEquals(expected, actual)
		assertEquals("CD", helper.truncateAInFirst2Position("AACD"));
		assertEquals("XY", helper.truncateAInFirst2Position("AAXY"));
		}

	//all test method should be public and void
	@Test
	public void testTurncatedAInFirst2Positions2_AinFirstPosition()
	{
		assertEquals("CD", helper.truncateAInFirst2Position("ACD"));
		
	}
	
	@Test
	public void testTurncatedAInFirst2Positions2_AinLast2Postion()
	{
		assertEquals("CDAA", helper.truncateAInFirst2Position("CDAA"));
		
	}
	
	@Test
	public void testTurncatedAInFirst2Positions2_NoA()
	{
		assertEquals("CDEF", helper.truncateAInFirst2Position("CDEF"));
		
	}
}
