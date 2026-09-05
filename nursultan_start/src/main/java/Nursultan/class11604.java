/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11604
extends Enum<class11604> {
    private static String[] strings_0c70c7610ba0d3622a5bd78dbcf202bb2;
    public static class11604 staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0;
    public static class11604 staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
    public static class11604[] staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_2;

    static {
        class11604.u();
        class11604.N();
        staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 = new class11604();
        staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1 = new class11604();
        staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_2 = class11604.y();
    }

    public static class11604[] values() {
        return (class11604[])staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_2.clone();
    }

    public static class11604 valueOf(String string) {
        return Enum.valueOf(class11604.class, string);
    }

    private static void u() {
        strings_0c70c7610ba0d3622a5bd78dbcf202bb2 = new String[2];
        class11604.strings_0c70c7610ba0d3622a5bd78dbcf202bb2[0] = "MIN";
        class11604.strings_0c70c7610ba0d3622a5bd78dbcf202bb2[1] = "MAX";
    }

    private static /* synthetic */ class11604[] y() {
        return new class11604[]{staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0, staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1};
    }

    private static void N() {
    }
}

