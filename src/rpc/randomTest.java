package rpc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class randomTest {

	@Test

	public void testSubString() {
		String str = new String("this is a unit test");
		assertEquals("unit", str.substring(10, 14));
	}

}
