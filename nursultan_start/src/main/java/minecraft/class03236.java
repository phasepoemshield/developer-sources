/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04552
 *  minecraft.class07340
 *  net.caffeinemc.mods.sodium.client.world.BitStorageExtension
 */
package minecraft;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.IntConsumer;
import minecraft.class04552;
import minecraft.class07340;
import net.caffeinemc.mods.sodium.client.world.BitStorageExtension;

public class class03236
implements class04552,
BitStorageExtension {
    public static final long[] N = new long[0];
    private final int y;

    public int L() {
        return 0;
    }

    public class03236(int n) {
        this.y = n;
    }

    public class04552 u() {
        return this;
    }

    public int y() {
        return this.y;
    }

    public void y(int n, int n2) {
        long l = n;
        long l2 = this.y - 1;
        long l3 = 0L;
        this.N(l3, l2, l);
        l = n2;
        l2 = 0L;
        l3 = 0L;
        this.N(l3, l2, l);
    }

    public void N(long l, long l2, long l3) {
    }

    public void N(int[] nArray) {
        Arrays.fill(nArray, 0, this.y, 0);
    }

    public int N(int n) {
        long l = n;
        long l2 = this.y - 1;
        long l3 = 0L;
        this.N(l3, l2, l);
        return 0;
    }

    public long[] N() {
        return N;
    }

    public int N(int n, int n2) {
        long l = n;
        long l2 = this.y - 1;
        long l3 = 0L;
        this.N(l3, l2, l);
        l = n2;
        l2 = 0L;
        l3 = 0L;
        this.N(l3, l2, l);
        return 0;
    }

    public void N(IntConsumer intConsumer) {
        for (int i = 0; i < this.y; ++i) {
            intConsumer.accept(0);
        }
    }

    public void sodium$unpack(Object[] objectArray, class07340 class073402) {
        if (this.y != objectArray.length) {
            throw new IllegalArgumentException("Array has mismatched size");
        }
        Object object = Objects.requireNonNull(class073402.method_12288(0), "Palette must have default entry");
        Arrays.fill(objectArray, object);
    }
}

