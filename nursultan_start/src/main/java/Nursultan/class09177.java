/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09177
extends Enum<class09177> {
    private static String[] strings_0b79176406e8a39e8bcd4b7ed5c6c0023;
    public static class09177 staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_0;
    public static class09177 staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_1;
    public static class09177 staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_2;
    public static class09177[] staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_3;

    private static void L() {
    }

    static {
        class09177.u();
        class09177.L();
        staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_0 = new class09177();
        staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_1 = new class09177();
        staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_2 = new class09177();
        staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_3 = class09177.y();
    }

    public static class09177[] values() {
        return (class09177[])staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_3.clone();
    }

    public static class09177 valueOf(String string) {
        return Enum.valueOf(class09177.class, string);
    }

    private static void u() {
        strings_0b79176406e8a39e8bcd4b7ed5c6c0023 = new String[3];
        class09177.strings_0b79176406e8a39e8bcd4b7ed5c6c0023[0] = "IDLE";
        class09177.strings_0b79176406e8a39e8bcd4b7ed5c6c0023[1] = "SIGNING_IN";
        class09177.strings_0b79176406e8a39e8bcd4b7ed5c6c0023[2] = "ERROR";
    }

    private static /* synthetic */ class09177[] y() {
        return new class09177[]{staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_0, staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_1, staticFields_0b79176406e8a39e8bcd4b7ed5c6c0023_2};
    }
}

