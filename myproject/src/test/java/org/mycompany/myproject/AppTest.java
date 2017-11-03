package org.mycompany.myproject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private App app;
	
	@Before
	public void init() {
		app = new App();
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Hello", app.sayHello(null));
	}
	
}
