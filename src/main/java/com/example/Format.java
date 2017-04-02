package com.example;

public class Format {

    private static final String format = "%s_%s";
    private static final String lhs = "a";
    private static final String rhs = "b";

    public long contenateWithFormat(final int times) {
        final long before = System.currentTimeMillis();


        for (int i=0; i<times; i++) {
            String newStr = String.format(format, lhs, rhs);
        }

        return System.currentTimeMillis() - before;
    }

    public long contenateWithoutFormat(final int times) {
        final long before = System.currentTimeMillis();

        for (int i=0; i<times; i++) {
            String newStr = lhs + "_" + rhs;
        }

        return System.currentTimeMillis() - before;
    }
}
