/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package minecraft;

import minecraft.class01894;

public class class07491<T> {
    private final class01894 N;

    public class07491(class01894 class018942) {
        this.N = class018942;
    }

    public String toString() {
        return "<parameter " + String.valueOf(this.N) + ">";
    }

    public static <T> class07491<T> N(String string) {
        return new class07491<T>(class01894.y((String)string));
    }

    public class01894 N() {
        return this.N;
    }
}

