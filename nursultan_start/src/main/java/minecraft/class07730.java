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
import minecraft.class07733;
import minecraft.class07737;
import minecraft.class07747;

public final class class07730
extends Record
implements class07737 {
    private final short value;
    private static final int L = 10;
    public static final class01424<class07730> N = new class07733();

    public byte L() {
        return 2;
    }

    @Override
    public long M() {
        return this.value;
    }

    @Deprecated(forRemoval=true)
    public class07730(short s) {
        this.value = s;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07730.class, "value", "value"}, this, object);
    }

    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07730.class, "value", "value"}, this);
    }

    @Override
    public int B() {
        return this.value;
    }

    @Override
    public short Z() {
        return this.value;
    }

    public class07730 N() {
        return this;
    }

    public short m() {
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

    public class01424<class07730> u() {
        return N;
    }

    public int y() {
        return 10;
    }

    @Override
    public float E() {
        return this.value;
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeShort(this.value);
    }

    public static class07730 N(short s) {
        if (s >= -128 && s <= 1024) {
            return class07747.N[s - -128];
        }
        return new class07730(s);
    }

    public class03154 N(class03175 class031752) {
        return class031752.N(this.value);
    }

    @Override
    public Number W() {
        return this.value;
    }
}

