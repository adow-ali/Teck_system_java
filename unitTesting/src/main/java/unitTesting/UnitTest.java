package unitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTest {

//	// all from Junit 5 framework
//	// runs once before any other method in that class.
//	// method must be static
//	@BeforeAll
//	// runs once after any other test method in this class have.
//	// methods must be static 
//	@AfterAll
//	
//	// runs before every test
//	
//	@BeforeEach
//	
//	// runs after every test
//	
//	@AfterEach

	@BeforeAll
	public static void setUp1() throws Exception {
		System.out.println("Before Class");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("after first setup, before methods");
	}
//	
//	// the Test method

	@Test
	public void testFindMax() {
		assertEquals(4, TestingSomething.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, TestingSomething.findMax(new int[] { -12, -3, -4, -2, -1 }));
		System.out.println("testing find max");
	}

	@Test
	public void testCubeMethod() {
		System.out.println("Test cubed method");
		assertEquals(27, TestingSomething.cube(3));

	}

	@Test
	public void reverseWordTest() {
		System.out.println("Test case for reverse word");
		assertEquals("olleh", TestingSomething.reverseString("hello"));

	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("After Tests");

	}

	@AfterAll
	public static void classTearDown() throws Exception {
		System.out.println("After the class");
	}

}
