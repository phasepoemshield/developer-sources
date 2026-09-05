/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 */
package baritone.utils.schematic.format.defaults;

import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

class LitematicaSchematic$LitematicaBitArray {
    private final long[] longArray;
    private final int bitsPerEntry;
    private final long maxEntryValue;
    private final long arraySize;

    public LitematicaSchematic$LitematicaBitArray(int n, long l, @Nullable long[] lArray) {
        Validate.inclusiveBetween((long)1L, (long)32L, (long)n);
        this.arraySize = l;
        this.bitsPerEntry = n;
        this.maxEntryValue = (1L << n) - 1L;
        this.longArray = lArray != null ? lArray : new long[(int)(LitematicaSchematic$LitematicaBitArray.roundUp(l * (long)n, 64L) / 64L)];
    }

    public long size() {
        return this.arraySize;
    }

    public static long roundUp(long l, long l2) {
        long l3;
        int n = 1;
        if (l2 == 0L) {
            return 0L;
        }
        if (l == 0L) {
            return l2;
        }
        if (l < 0L) {
            n = -1;
        }
        return (l3 = l % (l2 * (long)n)) == 0L ? l : l + l2 * (long)n - l3;
    }

    public int getAt(long l) {
        Validate.inclusiveBetween((long)0L, (long)(this.arraySize - 1L), (long)l);
        long l2 = l * (long)this.bitsPerEntry;
        int n = (int)(l2 >> 6);
        int n2 = (int)((l + 1L) * (long)this.bitsPerEntry - 1L >> 6);
        int n3 = (int)(l2 & 0x3FL);
        if (n == n2) {
            return (int)(this.longArray[n] >>> n3 & this.maxEntryValue);
        }
        int n4 = 64 - n3;
        return (int)((this.longArray[n] >>> n3 | this.longArray[n2] << n4) & this.maxEntryValue);
    }
}

