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
import minecraft.class07038;
import minecraft.class07737;

public final class class07009
extends Record
implements class07737 {
    private final float value;
    private static final int t = 12;
    public static final class07009 N = new class07009(0.0f);
    public static final class01424<class07009> y = new class07038();

    public byte L() {
        return 5;
    }

    public long M() {
        return (long)this.value;
    }

    @Deprecated(forRemoval=true)
    public class07009(float f) {
        this.value = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07009.class, "value", "value"}, this, object);
    }

    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07009.class, "value", "value"}, this);
    }

    public int B() {
        return class04995.y((float)this.value);
    }

    public short Z() {
        return (short)(class04995.y((float)this.value) & 0xFFFF);
    }

    public class07009 N() {
        return this;
    }

    public float m() {
        return this.value;
    }

    public double U() {
        return this.value;
    }

    public byte z() {
        return (byte)(class04995.y((float)this.value) & 0xFF);
    }

    public class01424<class07009> u() {
        return y;
    }

    public int y() {
        return 12;
    }

    public float E() {
        return this.value;
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeFloat(this.value);
    }

    public static class07009 N(float f) {
        if (f == 0.0f) {
            return N;
        }
        return new class07009(f);
    }

    public class03154 N(class03175 class031752) {
        return class031752.N(this.value);
    }

    public Number W() {
        return Float.valueOf(this.value);
    }
}

