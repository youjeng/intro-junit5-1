package guru.springframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	void testHelloWorld() {
		Greeting result = new Greeting();
		assertEquals("Hello World", result.helloWorld());
	}

	@Test
	void testHelloWorldString() {
		Greeting result = new Greeting();
		assertEquals("Hello Mike", result.helloWorld("Mike"));
	}

}
