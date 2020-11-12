package guru.springframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

	private Greeting result;
	
	@BeforeEach
	void setUp() {
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

}
