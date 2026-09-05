/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04993
 */
package Nursultan;

import minecraft.class04993;

public class class10485 {
    public static final byte N = 0;
    private static final int y = 0;
    private static final int L = 26;
    private static final byte u = 32;
    private static final byte i = 31;

    public static class04993 L(byte by) {
        if (by == 0) {
            return class04993.field_44724;
        }
        if (class10485.N(by)) {
            return class04993.field_44726;
        }
        return class04993.field_44725;
    }

    protected class10485() {
    }

    public static int y(byte by) {
        return by & 0x1F;
    }

    public static boolean N(byte by) {
        return (by & 0x20) != 0;
    }

    public static byte N(byte by, int n) {
        if (n < 0 || n > 26) {
            throw new IllegalArgumentException("Neighbor count was not within range [0; 26]");
        }
        return (byte)(by & 0xFFFFFFE0 | n & 0x1F);
    }

    public static byte N(byte by, boolean bl) {
        return (byte)(bl ? by | 0x20 : by & 0xFFFFFFDF);
    }
}

