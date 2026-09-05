/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01424
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class04818
 *  minecraft.class04836
 *  minecraft.class07737
 */
package minecraft;

import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01424;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class04818;
import minecraft.class04836;
import minecraft.class07015;
import minecraft.class07026;
import minecraft.class07737;

public final class class07037
extends Record
implements class07737 {
    private final byte value;
    private static final int G = 9;
    public static final class01424<class07037> N = new class07026();
    public static final class07037 y = class07037.N((byte)0);
    public static final class07037 L = class07037.N((byte)1);

    public byte L() {
        return 1;
    }

    public long M() {
        return this.value;
    }

    @Deprecated(forRemoval=true)
    public class07037(byte by) {
        this.value = by;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07037.class, "value", "value"}, this, object);
    }

    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07037.class, "value", "value"}, this);
    }

    public int B() {
        return this.value;
    }

    public short Z() {
        return this.value;
    }

    public class07037 N() {
        return this;
    }

    public byte m() {
        return this.value;
    }

    public double U() {
        return this.value;
    }

    public byte z() {
        return this.value;
    }

    public class01424<class07037> u() {
        return N;
    }

    public int y() {
        return 9;
    }

    public float E() {
        return this.value;
    }

    public static class07037 N(boolean bl) {
        return bl ? L : y;
    }

    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.value);
    }

    public static class07037 N(byte by) {
        return class07015.N[128 + by];
    }

    public class03154 N(class03175 class031752) {
        return class031752.N(this.value);
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    public Number W() {
        return this.value;
    }
}

