/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01424
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class04818
 *  minecraft.class04836
 *  minecraft.class07709
 *  minecraft.class07737
 *  org.apache.commons.lang3.ArrayUtils
 */
package minecraft;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import minecraft.class01424;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class04818;
import minecraft.class04836;
import minecraft.class07023;
import minecraft.class07035;
import minecraft.class07037;
import minecraft.class07709;
import minecraft.class07737;
import org.apache.commons.lang3.ArrayUtils;

public final class class07029
implements class07023 {
    private static final int y = 24;
    public static final class01424<class07029> N = new class07035();
    private byte[] L;

    public byte L() {
        return 7;
    }

    @Override
    public /* synthetic */ class07709 get(int n) {
        return this.L(n);
    }

    public class07029(byte[] byArray) {
        this.L = byArray;
    }

    @Override
    public int size() {
        return this.L.length;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class07029 && Arrays.equals(this.L, ((class07029)object).L);
    }

    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    public int hashCode() {
        return Arrays.hashCode(this.L);
    }

    @Override
    public void clear() {
        this.L = new byte[0];
    }

    public byte[] i() {
        return this.L;
    }

    public class01424<class07029> u() {
        return N;
    }

    @Override
    public /* synthetic */ class07709 remove(int n) {
        return this.u(n);
    }

    @Override
    public boolean y(int n, class07709 class077092) {
        if (class077092 instanceof class07737) {
            class07737 class077372 = (class07737)class077092;
            this.L = ArrayUtils.add((byte[])this.L, (int)n, (byte)class077372.z());
            return true;
        }
        return false;
    }

    public int y() {
        return 24 + 1 * this.L.length;
    }

    public class07037 u(int n) {
        byte by = this.L[n];
        this.L = ArrayUtils.remove((byte[])this.L, (int)n);
        return class07037.N(by);
    }

    public class03154 N(class03175 class031752) {
        return class031752.N(this.L);
    }

    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.L.length);
        dataOutput.write(this.L);
    }

    public class07709 N() {
        byte[] byArray = new byte[this.L.length];
        System.arraycopy(this.L, 0, byArray, 0, this.L.length);
        return new class07029(byArray);
    }

    public class07037 L(int n) {
        return class07037.N(this.L[n]);
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    @Override
    public boolean N(int n, class07709 class077092) {
        if (class077092 instanceof class07737) {
            class07737 class077372 = (class07737)class077092;
            this.L[n] = class077372.z();
            return true;
        }
        return false;
    }

    public Optional<byte[]> R() {
        return Optional.of(this.L);
    }
}

