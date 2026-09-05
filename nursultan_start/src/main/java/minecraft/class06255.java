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

final class class06255
extends Record
implements class06267 {
    private final byte[] contents;

    private class06255(byte[] byArray) {
        this.contents = byArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06255.class, "contents", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06255.class, "contents", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06255.class, "contents", "contents"}, this);
    }

    public byte[] y() {
        return this.contents;
    }

    static class06267 N(int n, ByteList byteList) {
        byte[] byArray = new byte[16];
        int n2 = 0;
        for (int i = 0; i < 16; ++i) {
            byte by;
            int n3 = class06268.N((int)n, (ByteList)byteList, (int)n2++);
            int n4 = class06268.N((int)n, (ByteList)byteList, (int)n2++);
            byArray[i] = by = (byte)(n3 << 4 | n4);
        }
        return new class06255(byArray);
    }

    public int N(int n) {
        return this.contents[n] << 24;
    }

    public int N() {
        return 8;
    }
}

