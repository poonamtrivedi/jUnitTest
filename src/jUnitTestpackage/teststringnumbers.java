package jUnitTestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class teststringnumbers {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addStrings("capestone", "project");
		assertEquals("capestoneproject", result);
	}

}
