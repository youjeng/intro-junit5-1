package guru.springframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

	private Greeting result;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("King of the java code!");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("eh man!");
		result = new Greeting();
	}
	
	
	@Test
	void testHelloWorld() {
		assertEquals("Hello World", result.helloWorld());
	}

	@Test
	void testHelloWorldString() {
		assertEquals("Hello Mike", result.helloWorld("Mike"));
	}

	@AfterEach
	void tearDown() {
		System.out.println("out you go!");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("I get teh last word!");
	}
	
}
