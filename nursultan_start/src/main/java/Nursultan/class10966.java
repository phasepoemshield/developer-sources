/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class10966
extends Enum<class10966> {
    private static String[] strings_0cabd41f8be773279a9b5245fe31e3239;
    public static class10966 staticFields_0cabd41f8be773279a9b5245fe31e3239_0;
    public static class10966 staticFields_0cabd41f8be773279a9b5245fe31e3239_1;
    public static class10966 staticFields_0cabd41f8be773279a9b5245fe31e3239_2;
    public static class10966 staticFields_0cabd41f8be773279a9b5245fe31e3239_3;
    public static class10966[] staticFields_0cabd41f8be773279a9b5245fe31e3239_4;

    static {
        class10966.R();
        class10966.y();
        staticFields_0cabd41f8be773279a9b5245fe31e3239_0 = new class10966();
        staticFields_0cabd41f8be773279a9b5245fe31e3239_1 = new class10966();
        staticFields_0cabd41f8be773279a9b5245fe31e3239_2 = new class10966();
        staticFields_0cabd41f8be773279a9b5245fe31e3239_3 = new class10966();
        staticFields_0cabd41f8be773279a9b5245fe31e3239_4 = class10966.u();
    }

    public static class10966[] values() {
        return (class10966[])staticFields_0cabd41f8be773279a9b5245fe31e3239_4.clone();
    }

    public static class10966 valueOf(String string) {
        return Enum.valueOf(class10966.class, string);
    }

    private static /* synthetic */ class10966[] u() {
        return new class10966[]{staticFields_0cabd41f8be773279a9b5245fe31e3239_0, staticFields_0cabd41f8be773279a9b5245fe31e3239_1, staticFields_0cabd41f8be773279a9b5245fe31e3239_2, staticFields_0cabd41f8be773279a9b5245fe31e3239_3};
    }

    private static void y() {
    }

    private static void R() {
        strings_0cabd41f8be773279a9b5245fe31e3239 = new String[4];
        class10966.strings_0cabd41f8be773279a9b5245fe31e3239[0] = "ADD";
        class10966.strings_0cabd41f8be773279a9b5245fe31e3239[1] = "UPDATE";
        class10966.strings_0cabd41f8be773279a9b5245fe31e3239[2] = "PLAYER_INIT";
        class10966.strings_0cabd41f8be773279a9b5245fe31e3239[3] = "REMOVE";
    }
}

