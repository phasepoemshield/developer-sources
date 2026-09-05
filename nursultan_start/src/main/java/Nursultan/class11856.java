/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11856
extends Enum<class11856> {
    private static String[] strings_0195a4643e2ea35d789c4540fa44e325e;
    public static class11856 staticFields_0195a4643e2ea35d789c4540fa44e325e_0;
    public static class11856 staticFields_0195a4643e2ea35d789c4540fa44e325e_1;
    public static class11856 staticFields_0195a4643e2ea35d789c4540fa44e325e_2;
    public static class11856[] staticFields_0195a4643e2ea35d789c4540fa44e325e_3;

    static {
        class11856.R();
        class11856.u();
        staticFields_0195a4643e2ea35d789c4540fa44e325e_0 = new class11856();
        staticFields_0195a4643e2ea35d789c4540fa44e325e_1 = new class11856();
        staticFields_0195a4643e2ea35d789c4540fa44e325e_2 = new class11856();
        staticFields_0195a4643e2ea35d789c4540fa44e325e_3 = class11856.y();
    }

    public static class11856[] values() {
        return (class11856[])staticFields_0195a4643e2ea35d789c4540fa44e325e_3.clone();
    }

    public static class11856 valueOf(String string) {
        return Enum.valueOf(class11856.class, string);
    }

    private static void u() {
    }

    private static /* synthetic */ class11856[] y() {
        return new class11856[]{staticFields_0195a4643e2ea35d789c4540fa44e325e_0, staticFields_0195a4643e2ea35d789c4540fa44e325e_1, staticFields_0195a4643e2ea35d789c4540fa44e325e_2};
    }

    private static void R() {
        strings_0195a4643e2ea35d789c4540fa44e325e = new String[3];
        class11856.strings_0195a4643e2ea35d789c4540fa44e325e[0] = "SINGLE";
        class11856.strings_0195a4643e2ea35d789c4540fa44e325e[1] = "LEFT";
        class11856.strings_0195a4643e2ea35d789c4540fa44e325e[2] = "RIGHT";
    }
}

