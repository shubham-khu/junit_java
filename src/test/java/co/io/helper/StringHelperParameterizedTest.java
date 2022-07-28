package co.io.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//step 1
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	//step 2
	@Parameters
	public static Collection<String[]> testConditions()
	{
		String expectedOutputs[][] = {
				{"AACD","CD"},
				{"ACD","CD"}
		};
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void test() {
		assertEquals(expectedOutput,helper.truncateAInFirst2Position(input));
	}

}
