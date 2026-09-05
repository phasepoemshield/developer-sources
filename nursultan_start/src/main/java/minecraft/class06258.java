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

final class class06258
extends Record
implements class06267 {
    private final short[] contents;

    private class06258(short[] sArray) {
        this.contents = sArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06258.class, "contents", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06258.class, "contents", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06258.class, "contents", "contents"}, this);
    }

    public short[] y() {
        return this.contents;
    }

    static class06267 N(int n, ByteList byteList) {
        short[] sArray = new short[16];
        int n2 = 0;
        for (int i = 0; i < 16; ++i) {
            short s;
            int n3 = class06268.N((int)n, (ByteList)byteList, (int)n2++);
            int n4 = class06268.N((int)n, (ByteList)byteList, (int)n2++);
            int n5 = class06268.N((int)n, (ByteList)byteList, (int)n2++);
            int n6 = class06268.N((int)n, (ByteList)byteList, (int)n2++);
            sArray[i] = s = (short)(n3 << 12 | n4 << 8 | n5 << 4 | n6);
        }
        return new class06258(sArray);
    }

    public int N(int n) {
        return this.contents[n] << 16;
    }

    public int N() {
        return 16;
    }
}

