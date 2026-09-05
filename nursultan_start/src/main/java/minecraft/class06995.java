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
 *  minecraft.class07720
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
import minecraft.class07024;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class07737;
import org.apache.commons.lang3.ArrayUtils;

public final class class06995
implements class07023 {
    private static final int y = 24;
    public static final class01424<class06995> N = new class07024();
    private int[] L;

    @Override
    public /* synthetic */ class07709 get(int n) {
        return this.L(n);
    }

    public byte L() {
        return 11;
    }

    public int[] M() {
        return this.L;
    }

    public class06995(int[] nArray) {
        this.L = nArray;
    }

    @Override
    public int size() {
        return this.L.length;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class06995 && Arrays.equals(this.L, ((class06995)object).L);
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
        this.L = new int[0];
    }

    public class06995 N() {
        int[] nArray = new int[this.L.length];
        System.arraycopy(this.L, 0, nArray, 0, this.L.length);
        return new class06995(nArray);
    }

    @Override
    public /* synthetic */ class07709 remove(int n) {
        return this.u(n);
    }

    public class01424<class06995> u() {
        return N;
    }

    @Override
    public boolean y(int n, class07709 class077092) {
        if (class077092 instanceof class07737) {
            class07737 class077372 = (class07737)class077092;
            this.L = ArrayUtils.add((int[])this.L, (int)n, (int)class077372.B());
            return true;
        }
        return false;
    }

    public class07720 u(int n) {
        int n2 = this.L[n];
        this.L = ArrayUtils.remove((int[])this.L, (int)n);
        return class07720.N((int)n2);
    }

    public int y() {
        return 24 + 4 * this.L.length;
    }

    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.L.length);
        for (int n : this.L) {
            dataOutput.writeInt(n);
        }
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    @Override
    public boolean N(int n, class07709 class077092) {
        if (class077092 instanceof class07737) {
            class07737 class077372 = (class07737)class077092;
            this.L[n] = class077372.B();
            return true;
        }
        return false;
    }

    public class07720 L(int n) {
        return class07720.N((int)this.L[n]);
    }

    public class03154 N(class03175 class031752) {
        return class031752.N(this.L);
    }

    public Optional<int[]> ai_() {
        return Optional.of(this.L);
    }
}

