package in.teja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteTest {
	Deleting_A obj;
	@BeforeEach
	void setup() {
		 obj=new Deleting_A();
	}

	@org.junit.jupiter.api.Test
	void test12A() {
		assertEquals("bcd",obj.removeA("aabcd"));
	}
	@org.junit.jupiter.api.Test
	void test1A() {
		assertEquals("bcd",obj.removeA("abcd"));
	}
	@org.junit.jupiter.api.Test
	void test0A() {
		assertEquals("bcd",obj.removeA("bcd"));
	}
	@org.junit.jupiter.api.Test
	void test2A() {
		assertEquals("bbcd",obj.removeA("babcd"));
	}
	@org.junit.jupiter.api.Test
	void testOtherA() {
		assertEquals("bcaacd",obj.removeA("aabcaacd"));
	}
	@org.junit.jupiter.api.Test
	void testOnly1A() {
		assertEquals("",obj.removeA("a"));
	}
	@org.junit.jupiter.api.Test
	void test2As() {
		assertEquals("",obj.removeA("aa"));
	}
	@org.junit.jupiter.api.Test
	void testNullString() {
		assertEquals("",obj.removeA("a"));
	}

}
