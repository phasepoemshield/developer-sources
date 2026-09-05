/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.bytes.ByteBytePair
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  minecraft.class00753
 *  minecraft.class02146
 *  minecraft.class06069
 *  minecraft.class07209
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.bytes.ByteBytePair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class00753;
import minecraft.class02146;
import minecraft.class06069;
import minecraft.class07209;

public class LongJumpChoiceList
extends AbstractList<class02146> {
    private static final ConcurrentHashMap<ByteBytePair, LongJumpChoiceList> CHOICE_LISTS = new ConcurrentHashMap();
    private static final LongJumpChoiceList FROG_JUMP = new LongJumpChoiceList(4, 2);
    private static final LongJumpChoiceList GOAT_JUMP = new LongJumpChoiceList(5, 5);
    private final class07209 origin;
    private final IntArrayList[] packedOffsetsByDistanceSq;
    private final int[] weightByDistanceSq;
    private int totalWeight;

    public LongJumpChoiceList(byte n, byte n2) {
        if (n < 0 || n2 < 0) {
            throw new IllegalArgumentException("The ranges must be within 0..127!");
        }
        this.origin = class07209.field_10980;
        int n3 = n * n * 2 + n2 * n2;
        this.packedOffsetsByDistanceSq = new IntArrayList[n3];
        this.weightByDistanceSq = new int[n3];
        for (int i = -n; i <= n; ++i) {
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n; k <= n; ++k) {
                    int n4 = i * i + j * j + k * k;
                    int n5 = n4 - 1;
                    if (n5 < 0) continue;
                    int n6 = this.packOffset(i, j, k);
                    IntArrayList intArrayList = this.packedOffsetsByDistanceSq[n5];
                    if (intArrayList == null) {
                        this.packedOffsetsByDistanceSq[n5] = intArrayList = new IntArrayList();
                    }
                    intArrayList.add(n6);
                    int n7 = n5;
                    this.weightByDistanceSq[n7] = this.weightByDistanceSq[n7] + n4;
                    this.totalWeight += n4;
                }
            }
        }
    }

    public LongJumpChoiceList(class07209 class072092, IntArrayList[] intArrayListArray, int[] nArray, int n) {
        this.origin = class072092;
        this.packedOffsetsByDistanceSq = intArrayListArray;
        this.weightByDistanceSq = nArray;
        this.totalWeight = n;
    }

    @Override
    public class02146 remove(int n) {
        int n2 = n;
        IntArrayList[] intArrayListArray = this.packedOffsetsByDistanceSq;
        for (int i = 0; i < intArrayListArray.length; ++i) {
            IntArrayList intArrayList = intArrayListArray[i];
            if (intArrayList == null) continue;
            if (n2 < intArrayList.size()) {
                int n3 = intArrayList.getInt(n2);
                intArrayList.set(n2, intArrayList.set(intArrayList.size() - 1, intArrayList.getInt(n2)));
                intArrayList.removeInt(intArrayList.size() - 1);
                int n4 = i;
                this.weightByDistanceSq[n4] = this.weightByDistanceSq[n4] - i;
                this.totalWeight -= i;
                return new class02146(this.origin.method_10069(this.unpackX(n3), this.unpackY(n3), this.unpackZ(n3)), i);
            }
            n2 -= intArrayList.size();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        int n = 0;
        for (IntArrayList intArrayList : this.packedOffsetsByDistanceSq) {
            if (intArrayList == null) continue;
            n += intArrayList.size();
        }
        return n;
    }

    @Override
    public class02146 get(int n) {
        int n2 = n;
        IntArrayList[] intArrayListArray = this.packedOffsetsByDistanceSq;
        for (int i = 0; i < intArrayListArray.length; ++i) {
            IntArrayList intArrayList = intArrayListArray[i];
            if (intArrayList == null) continue;
            if (n2 < intArrayList.size()) {
                int n3 = intArrayList.getInt(n2);
                return new class02146(this.origin.method_10069(this.unpackX(n3), this.unpackY(n3), this.unpackZ(n3)), i);
            }
            n2 -= intArrayList.size();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean isEmpty() {
        return this.totalWeight == 0;
    }

    public static LongJumpChoiceList forCenter(class07209 class072092, byte by, byte by2) {
        if (by < 0 || by2 < 0) {
            throw new IllegalArgumentException("The ranges must be within 0..127!");
        }
        short s = (short)(by << 8 | by2);
        LongJumpChoiceList longJumpChoiceList = s == 1026 ? FROG_JUMP : (s == 1285 ? GOAT_JUMP : CHOICE_LISTS.computeIfAbsent(ByteBytePair.of((byte)by, (byte)by2), byteBytePair -> new LongJumpChoiceList(byteBytePair.leftByte(), byteBytePair.rightByte())));
        return longJumpChoiceList.offsetCopy(class072092);
    }

    public class02146 removeRandomWeightedByDistanceSq(class06069 class060692) {
        int n = class060692.y(this.totalWeight);
        for (int i = 0; n >= 0 && i < this.weightByDistanceSq.length; ++i) {
            if ((n -= this.weightByDistanceSq[i]) >= 0) continue;
            int n2 = i + 1;
            IntArrayList intArrayList = this.packedOffsetsByDistanceSq[i];
            int n3 = class060692.y(intArrayList.size());
            intArrayList.set(n3, intArrayList.set(intArrayList.size() - 1, intArrayList.getInt(n3)));
            int n4 = intArrayList.removeInt(intArrayList.size() - 1);
            int n5 = i;
            this.weightByDistanceSq[n5] = this.weightByDistanceSq[n5] - n2;
            this.totalWeight -= n2;
            return new class02146(this.origin.method_10069(this.unpackX(n4), this.unpackY(n4), this.unpackZ(n4)), n2);
        }
        return null;
    }

    private int unpackZ(int n) {
        return (n >>> 16 & 0xFF) - 128;
    }

    private int unpackX(int n) {
        return (n & 0xFF) - 128;
    }

    private int unpackY(int n) {
        return (n >>> 8 & 0xFF) - 128;
    }

    private LongJumpChoiceList offsetCopy(class07209 class072092) {
        IntArrayList[] intArrayListArray = new IntArrayList[this.packedOffsetsByDistanceSq.length];
        for (int i = 0; i < intArrayListArray.length; ++i) {
            IntArrayList intArrayList = this.packedOffsetsByDistanceSq[i];
            if (intArrayList == null) continue;
            intArrayListArray[i] = intArrayList.clone();
        }
        return new LongJumpChoiceList(this.origin.method_10081((class00753)class072092), intArrayListArray, Arrays.copyOf(this.weightByDistanceSq, this.weightByDistanceSq.length), this.totalWeight);
    }

    private int packOffset(int n, int n2, int n3) {
        return n + 128 | n2 + 128 << 8 | n3 + 128 << 16;
    }
}

