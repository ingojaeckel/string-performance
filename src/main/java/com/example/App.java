package com.example;

public class App {
	private static final String A = "a";
	private static final String B = "bb";
	private static final String C = "cccc";
	private static final String D = "dddddddd";
	private static final String E = "eeeeeeeeeeeeeeee";
	
	public long concatenateWithoutBuilder(final int concatenations, final int times) {
		final long before = System.currentTimeMillis();

		for (int i = 0; i < times; i++) {
			String newString = "";

			for (int k = 0; k < concatenations; k++) {
				newString += A + B + C + D + E;
			}

			// System.out.println(newString.length());
		}

		return System.currentTimeMillis() - before;
	}
	
	public long concatenateWithBuilder(final int concatenations, final int times) {
		final long before = System.currentTimeMillis();

		for (int i = 0; i < times; i++) {
			final StringBuilder builder = new StringBuilder();

			for (int k = 0; k < concatenations; k++) {
				builder.append(A);
				builder.append(B);
				builder.append(C);
				builder.append(D);
				builder.append(E);
			}

			builder.toString();
		}

		return System.currentTimeMillis() - before;
	}
	
	public long concatenateWithBuffer(final int concatenations, final int times) {
		final long before = System.currentTimeMillis();

		for (int i = 0; i < times; i++) {
			final StringBuffer builder = new StringBuffer();

			for (int k = 0; k < concatenations; k++) {
				builder.append(A);
				builder.append(B);
				builder.append(C);
				builder.append(D);
				builder.append(E);
			}

			builder.toString();
		}

		return System.currentTimeMillis() - before;
	}
}
