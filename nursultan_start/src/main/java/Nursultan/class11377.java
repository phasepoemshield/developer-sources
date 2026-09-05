/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11377
extends Enum<class11377> {
    private static String[] strings_07f4c9373bc3a31d98ab36a1e18190ed1;
    public static class11377 staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_0;
    public static class11377 staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_1;
    public static class11377 staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_2;
    public static class11377[] staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_3;

    private static /* synthetic */ class11377[] L() {
        return new class11377[]{staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_0, staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_1, staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_2};
    }

    static {
        class11377.R();
        class11377.u();
        staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_0 = new class11377();
        staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_1 = new class11377();
        staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_2 = new class11377();
        staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_3 = class11377.L();
    }

    public static class11377[] values() {
        return (class11377[])staticFields_07f4c9373bc3a31d98ab36a1e18190ed1_3.clone();
    }

    public static class11377 valueOf(String string) {
        return Enum.valueOf(class11377.class, string);
    }

    private static void u() {
    }

    private static void R() {
        strings_07f4c9373bc3a31d98ab36a1e18190ed1 = new String[3];
        class11377.strings_07f4c9373bc3a31d98ab36a1e18190ed1[0] = "ADD";
        class11377.strings_07f4c9373bc3a31d98ab36a1e18190ed1[1] = "REMOVE";
        class11377.strings_07f4c9373bc3a31d98ab36a1e18190ed1[2] = "CLEAR";
    }
}

