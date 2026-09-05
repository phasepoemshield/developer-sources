/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util;

public class BitwiseMath {
    public static int lessThan(int n, int n2) {
        return n - n2 >>> 31;
    }

    public static int greaterThan(int n, int n2) {
        return n2 - n >>> 31;
    }
}

