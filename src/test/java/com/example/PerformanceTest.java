package com.example;

import junit.framework.TestCase;

public class PerformanceTest extends TestCase {
	private Builder builder;
	private Format fmt;

	@Override
	protected void setUp() throws Exception {
		this.builder = new Builder();
		this.fmt = new Format();

	}

	public void testConcatenate() {
		System.out.println("With StringBuilder:");
		for (int c = 10; c <= 100; c += 10) {
			for (int i = 1000; i <= 10000; i += 1000) {
				final long time = builder.concatenateWithBuilder(c, i);
				System.out.printf("%d,%d,%d%n", c, i, time);
			}
		}

		System.out.println("\nWith StringBuffer:");
		for (int c = 10; c <= 100; c += 10) {
			for (int i = 1000; i <= 10000; i += 1000) {
				final long time = builder.concatenateWithBuffer(c, i);
				System.out.printf("%d,%d,%d%n", c, i, time);
			}
		}

		System.out.println("\nWithout builder:");
		for (int c = 10; c <= 100; c += 10) {
			for (int i = 1000; i <= 10000; i += 1000) {
				final long time = builder.concatenateWithoutBuilder(c, i);
				System.out.printf("%d,%d,%d%n", c, i, time);
			}
		}
	}

	public void testStringFormatConcatenation() {
		System.out.println("\nConcatenate with Format:");
		for (int c = 10000; c <= 100000; c+=10000) {
			final long time = fmt.contenateWithFormat(c);
			System.out.printf("%d,%d%n", c, time);
		}

		System.out.println("\nConcatenate without Format:");
		for (int c = 10000; c <= 100000; c+=10000) {
			final long time = fmt.contenateWithoutFormat(c);
			System.out.printf("%d,%d%n", c, time);
		}
	}
}
