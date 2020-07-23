import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void test() {
		//initial test
		HelloJenkins hello = new HelloJenkins();
		String message = new String();
		
		message = hello.getWelcomeMessage("Jenkins");
		
		assertEquals("Hello Jenkins!", message);
		//fail("Not yet implemented");
	}

}
