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
import minecraft.class07718;
import minecraft.class07737;
import minecraft.class07756;

public final class class07720
extends Record
implements class07737 {
    private final int value;
    private static final int L = 12;
    public static final class01424<class07720> N = new class07756();

    public byte L() {
        return 3;
    }

    @Override
    public long M() {
        return this.value;
    }

    @Deprecated(forRemoval=true)
    public class07720(int n) {
        this.value = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07720.class, "value", "value"}, this, object);
    }

    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07720.class, "value", "value"}, this);
    }

    @Override
    public int B() {
        return this.value;
    }

    @Override
    public short Z() {
        return (short)(this.value & 0xFFFF);
    }

    public class07720 N() {
        return this;
    }

    public int m() {
        return this.value;
    }

    @Override
    public double U() {
        return this.value;
    }

    @Override
    public byte z() {
        return (byte)(this.value & 0xFF);
    }

    public class01424<class07720> u() {
        return N;
    }

    public int y() {
        return 12;
    }

    @Override
    public float E() {
        return this.value;
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.value);
    }

    public static class07720 N(int n) {
        if (n >= -128 && n <= 1024) {
            return class07718.N[n - -128];
        }
        return new class07720(n);
    }

    public class03154 N(class03175 class031752) {
        return class031752.N(this.value);
    }

    @Override
    public Number W() {
        return this.value;
    }
}

