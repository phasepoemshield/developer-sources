/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01424
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class04818
 *  minecraft.class04836
 *  minecraft.class07023
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
import minecraft.class07709;
import minecraft.class07727;
import minecraft.class07729;
import minecraft.class07737;
import org.apache.commons.lang3.ArrayUtils;

public final class class07757
implements class07023 {
    private static final int y = 24;
    public static final class01424<class07757> N = new class07727();
    private long[] L;

    public /* synthetic */ class07709 get(int n) {
        return this.L(n);
    }

    public byte L() {
        return 12;
    }

    public long[] M() {
        return this.L;
    }

    public class07757(long[] lArray) {
        this.L = lArray;
    }

    public int size() {
        return this.L.length;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class07757 && Arrays.equals(this.L, ((class07757)object).L);
    }

    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    public int hashCode() {
        return Arrays.hashCode(this.L);
    }

    public void clear() {
        this.L = new long[0];
    }

    public class07757 N() {
        long[] lArray = new long[this.L.length];
        System.arraycopy(this.L, 0, lArray, 0, this.L.length);
        return new class07757(lArray);
    }

    public /* synthetic */ class07709 remove(int n) {
        return this.u(n);
    }

    public class01424<class07757> u() {
        return N;
    }

    public boolean y(int n, class07709 class077092) {
        if (class077092 instanceof class07737) {
            class07737 class077372 = (class07737)((Object)class077092);
            this.L = ArrayUtils.add((long[])this.L, (int)n, (long)class077372.M());
            return true;
        }
        return false;
    }

    public class07729 u(int n) {
        long l = this.L[n];
        this.L = ArrayUtils.remove((long[])this.L, (int)n);
        return class07729.N(l);
    }

    public int y() {
        return 24 + 8 * this.L.length;
    }

    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.L.length);
        for (long l : this.L) {
            dataOutput.writeLong(l);
        }
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    public boolean N(int n, class07709 class077092) {
        if (class077092 instanceof class07737) {
            class07737 class077372 = (class07737)((Object)class077092);
            this.L[n] = class077372.M();
            return true;
        }
        return false;
    }

    public class07729 L(int n) {
        return class07729.N(this.L[n]);
    }

    public class03154 N(class03175 class031752) {
        return class031752.N(this.L);
    }

    public Optional<long[]> aj_() {
        return Optional.of(this.L);
    }
}

