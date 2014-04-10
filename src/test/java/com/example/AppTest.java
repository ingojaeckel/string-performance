package com.example;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	private App app;

	@Override
	protected void setUp() throws Exception {
		this.app = new App();
	}

	public void testConcatenate() {
		System.out.println("With StringBuilder:");
		for (int c = 10; c <= 100; c+=10) {
			for (int i = 1000; i <= 10000; i += 1000) {
				final long time = app.concatenateWithBuilder(c, i);
				System.out.printf("%d,%d,%d%n", c, i, time);
			}
		}

		System.out.println("\nWith StringBuffer:");
		for (int c = 10; c <= 100; c+=10) {
			for (int i = 1000; i <= 10000; i += 1000) {
				final long time = app.concatenateWithBuffer(c, i);
				System.out.printf("%d,%d,%d%n", c, i, time);
			}
		}
		
		System.out.println("\nWithout builder:");
		for (int c = 10; c <= 100; c+=10) {
			for (int i = 1000; i <= 10000; i += 1000) {
				final long time = app.concatenateWithoutBuilder(c, i);
				System.out.printf("%d,%d,%d%n", c, i, time);
			}
		}
	}
}
