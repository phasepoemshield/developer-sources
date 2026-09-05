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
 *  minecraft.class04995
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
import minecraft.class04995;
import minecraft.class07014;
import minecraft.class07737;

public final class class07019
extends Record
implements class07737 {
    private final double value;
    private static final int t = 16;
    public static final class07019 N = new class07019(0.0);
    public static final class01424<class07019> y = new class07014();

    public byte L() {
        return 6;
    }

    public long M() {
        return (long)Math.floor(this.value);
    }

    @Deprecated(forRemoval=true)
    public class07019(double d) {
        this.value = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07019.class, "value", "value"}, this, object);
    }

    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07019.class, "value", "value"}, this);
    }

    public int B() {
        return class04995.N((double)this.value);
    }

    public short Z() {
        return (short)(class04995.N((double)this.value) & 0xFFFF);
    }

    public class07019 N() {
        return this;
    }

    public double m() {
        return this.value;
    }

    public double U() {
        return this.value;
    }

    public byte z() {
        return (byte)(class04995.N((double)this.value) & 0xFF);
    }

    public class01424<class07019> u() {
        return y;
    }

    public int y() {
        return 16;
    }

    public float E() {
        return (float)this.value;
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeDouble(this.value);
    }

    public static class07019 N(double d) {
        if (d == 0.0) {
            return N;
        }
        return new class07019(d);
    }

    public class03154 N(class03175 class031752) {
        return class031752.N(this.value);
    }

    public Number W() {
        return this.value;
    }
}

