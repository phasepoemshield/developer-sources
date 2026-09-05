/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11356
extends Enum<class11356> {
    private static String[] strings_09092df2045453c22ab608d6c924605fc;
    public static class11356 staticFields_09092df2045453c22ab608d6c924605fc_0;
    public static class11356 staticFields_09092df2045453c22ab608d6c924605fc_1;
    public static class11356[] staticFields_09092df2045453c22ab608d6c924605fc_2;

    private static /* synthetic */ class11356[] L() {
        return new class11356[]{staticFields_09092df2045453c22ab608d6c924605fc_0, staticFields_09092df2045453c22ab608d6c924605fc_1};
    }

    static {
        class11356.i();
        class11356.u();
        staticFields_09092df2045453c22ab608d6c924605fc_0 = new class11356();
        staticFields_09092df2045453c22ab608d6c924605fc_1 = new class11356();
        staticFields_09092df2045453c22ab608d6c924605fc_2 = class11356.L();
    }

    public static class11356[] values() {
        return (class11356[])staticFields_09092df2045453c22ab608d6c924605fc_2.clone();
    }

    public static class11356 valueOf(String string) {
        return Enum.valueOf(class11356.class, string);
    }

    private static void i() {
        strings_09092df2045453c22ab608d6c924605fc = new String[2];
        class11356.strings_09092df2045453c22ab608d6c924605fc[0] = "SET";
        class11356.strings_09092df2045453c22ab608d6c924605fc[1] = "CLEAR";
    }

    private static void u() {
    }
}

