/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11538
extends Enum<class11538> {
    private static String[] strings_002f846683278372c86f24838365e6c39;
    public static class11538 staticFields_002f846683278372c86f24838365e6c39_0;
    public static class11538 staticFields_002f846683278372c86f24838365e6c39_1;
    public static class11538[] staticFields_002f846683278372c86f24838365e6c39_2;

    static {
        class11538.y();
        class11538.u();
        staticFields_002f846683278372c86f24838365e6c39_0 = new class11538();
        staticFields_002f846683278372c86f24838365e6c39_1 = new class11538();
        staticFields_002f846683278372c86f24838365e6c39_2 = class11538.N();
    }

    public static class11538[] values() {
        return (class11538[])staticFields_002f846683278372c86f24838365e6c39_2.clone();
    }

    public static class11538 valueOf(String string) {
        return Enum.valueOf(class11538.class, string);
    }

    private static void u() {
    }

    private static void y() {
        strings_002f846683278372c86f24838365e6c39 = new String[2];
        class11538.strings_002f846683278372c86f24838365e6c39[0] = "FAST";
        class11538.strings_002f846683278372c86f24838365e6c39[1] = "SMOOTH";
    }

    private static /* synthetic */ class11538[] N() {
        return new class11538[]{staticFields_002f846683278372c86f24838365e6c39_0, staticFields_002f846683278372c86f24838365e6c39_1};
    }
}

