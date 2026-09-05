/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.bytes.ByteList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06267
 *  minecraft.class06268
 */
package minecraft;

import it.unimi.dsi.fastutil.bytes.ByteList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06267;
import minecraft.class06268;

final class class06253
extends Record
implements class06267 {
    private final int[] contents;
    private final int bitWidth;
    private static final int L = 24;

    private class06253(int[] nArray, int n) {
        this.contents = nArray;
        this.bitWidth = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06253.class, "contents;bitWidth", "contents", "bitWidth"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06253.class, "contents;bitWidth", "contents", "bitWidth"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06253.class, "contents;bitWidth", "contents", "bitWidth"}, this);
    }

    public int[] y() {
        return this.contents;
    }

    public static class06267 y(int n, ByteList byteList) {
        int[] nArray = new int[16];
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < 16; ++i) {
            int n4;
            int n5 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n6 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n7 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n8 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n9 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n10 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n11 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n12 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            nArray[i] = n4 = n5 << 28 | n6 << 24 | n7 << 20 | n8 << 16 | n9 << 12 | n10 << 8 | n11 << 4 | n12;
            n2 |= n4;
        }
        return new class06253(nArray, 32);
    }

    public int N() {
        return this.bitWidth;
    }

    public int N(int n) {
        return this.contents[n];
    }

    static class06267 N(int n, ByteList byteList) {
        int[] nArray = new int[16];
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < 16; ++i) {
            int n4 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n5 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n6 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n7 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n8 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n9 = class06268.N((int)n, (ByteList)byteList, (int)n3++);
            int n10 = n4 << 20 | n5 << 16 | n6 << 12 | n7 << 8 | n8 << 4 | n9;
            nArray[i] = n10 << 8;
            n2 |= n10;
        }
        return new class06253(nArray, 24);
    }
}

