/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  minecraft.class00753
 *  minecraft.class04995
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 */
package baritone.api.utils;

import baritone.api.utils.SettingsUtil;
import javax.annotation.Nonnull;
import minecraft.class00753;
import minecraft.class04995;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;

public final class BetterBlockPos
extends class07209 {
    private static final int NUM_X_BITS = 26;
    private static final int NUM_Z_BITS = 26;
    private static final int NUM_Y_BITS = 12;
    private static final int Y_SHIFT = 26;
    private static final int X_SHIFT = 38;
    private static final long X_MASK = 0x3FFFFFFL;
    private static final long Y_MASK = 4095L;
    private static final long Z_MASK = 0x3FFFFFFL;
    public static final BetterBlockPos ORIGIN = new BetterBlockPos(0, 0, 0);
    public final int x;
    public final int y;
    public final int z;

    public BetterBlockPos relative(class07211 class072112) {
        class00753 class007532 = class072112.E();
        return new BetterBlockPos(this.x + class007532.method_10263(), this.y + class007532.method_10264(), this.z + class007532.method_10260());
    }

    public BetterBlockPos relative(class07211 class072112, int n) {
        if (n == 0) {
            return this;
        }
        class00753 class007532 = class072112.E();
        return new BetterBlockPos(this.x + class007532.method_10263() * n, this.y + class007532.method_10264() * n, this.z + class007532.method_10260() * n);
    }

    public /* synthetic */ class07209 method_10084() {
        return this.above();
    }

    public BetterBlockPos(int n, int n2, int n3) {
        super(n, n2, n3);
        this.x = n;
        this.y = n2;
        this.z = n3;
    }

    public BetterBlockPos(double d, double d2, double d3) {
        this(class04995.N((double)d), class04995.N((double)d2), class04995.N((double)d3));
    }

    public BetterBlockPos(class07209 class072092) {
        this(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof BetterBlockPos) {
            BetterBlockPos betterBlockPos = (BetterBlockPos)((Object)object);
            return betterBlockPos.x == this.x && betterBlockPos.y == this.y && betterBlockPos.z == this.z;
        }
        class07209 class072092 = (class07209)object;
        return class072092.method_10263() == this.x && class072092.method_10264() == this.y && class072092.method_10260() == this.z;
    }

    @Nonnull
    public String toString() {
        return String.format("BetterBlockPos{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z));
    }

    public int hashCode() {
        return (int)BetterBlockPos.longHash(this.x, this.y, this.z);
    }

    public /* synthetic */ int compareTo(Object object) {
        return super.compareTo((class00753)object);
    }

    public static BetterBlockPos from(class07209 class072092) {
        if (class072092 == null) {
            return null;
        }
        return new BetterBlockPos(class072092);
    }

    public double distanceSq(BetterBlockPos betterBlockPos) {
        double d = (double)this.x - (double)betterBlockPos.x;
        double d2 = (double)this.y - (double)betterBlockPos.y;
        double d3 = (double)this.z - (double)betterBlockPos.z;
        return d * d + d2 * d2 + d3 * d3;
    }

    public BetterBlockPos south(int n) {
        return n == 0 ? this : new BetterBlockPos(this.x, this.y, this.z + n);
    }

    public BetterBlockPos south() {
        return new BetterBlockPos(this.x, this.y, this.z + 1);
    }

    public BetterBlockPos north(int n) {
        return n == 0 ? this : new BetterBlockPos(this.x, this.y, this.z - n);
    }

    public BetterBlockPos north() {
        return new BetterBlockPos(this.x, this.y, this.z - 1);
    }

    public BetterBlockPos west() {
        return new BetterBlockPos(this.x - 1, this.y, this.z);
    }

    public BetterBlockPos west(int n) {
        return n == 0 ? this : new BetterBlockPos(this.x - n, this.y, this.z);
    }

    public BetterBlockPos east(int n) {
        return n == 0 ? this : new BetterBlockPos(this.x + n, this.y, this.z);
    }

    public BetterBlockPos east() {
        return new BetterBlockPos(this.x + 1, this.y, this.z);
    }

    public /* synthetic */ class07209 method_10087(int n) {
        return this.below(n);
    }

    public /* synthetic */ class00753 method_35850(class07185 class071852, int n) {
        return super.method_30513(class071852, n);
    }

    public /* synthetic */ class00753 method_23227(int n) {
        return this.below(n);
    }

    public /* synthetic */ class00753 method_35852(class00753 class007532) {
        return super.method_10059(class007532);
    }

    public /* synthetic */ class00753 method_35851(class07211 class072112) {
        return this.relative(class072112);
    }

    public /* synthetic */ class00753 method_35862(int n) {
        return super.method_35830(n);
    }

    public /* synthetic */ class07209 method_10077(int n) {
        return this.south(n);
    }

    public /* synthetic */ class00753 method_35856(int n) {
        return this.west(n);
    }

    public /* synthetic */ class00753 method_35859() {
        return this.south();
    }

    public /* synthetic */ class00753 method_10259(class00753 class007532) {
        return super.method_10075(class007532);
    }

    public /* synthetic */ class00753 method_23226(class07211 class072112, int n) {
        return this.relative(class072112, n);
    }

    public /* synthetic */ class00753 method_34592(int n, int n2, int n3) {
        return super.method_10069(n, n2, n3);
    }

    public /* synthetic */ class00753 method_35855() {
        return this.east();
    }

    public /* synthetic */ class07209 method_10076(int n) {
        return this.north(n);
    }

    public /* synthetic */ class00753 method_35857() {
        return this.west();
    }

    public /* synthetic */ class00753 method_35858(int n) {
        return this.south(n);
    }

    public /* synthetic */ class00753 method_35854(int n) {
        return this.east(n);
    }

    public /* synthetic */ class00753 method_30931() {
        return this.above();
    }

    public /* synthetic */ class00753 method_23228() {
        return this.below();
    }

    public /* synthetic */ class00753 method_35853(class00753 class007532) {
        return super.method_10081(class007532);
    }

    public /* synthetic */ class07209 method_10089(int n) {
        return this.east(n);
    }

    public /* synthetic */ class00753 method_35860(int n) {
        return this.north(n);
    }

    public /* synthetic */ class07209 method_10088(int n) {
        return this.west(n);
    }

    public /* synthetic */ class00753 method_35861() {
        return this.north();
    }

    public /* synthetic */ class00753 method_30930(int n) {
        return this.above(n);
    }

    public /* synthetic */ class07209 method_10074() {
        return this.below();
    }

    public /* synthetic */ class07209 method_10086(int n) {
        return this.above(n);
    }

    public /* synthetic */ class07209 method_10093(class07211 class072112) {
        return this.relative(class072112);
    }

    public /* synthetic */ class07209 method_10067() {
        return this.west();
    }

    public /* synthetic */ class07209 method_10095() {
        return this.north();
    }

    public /* synthetic */ class07209 method_10072() {
        return this.south();
    }

    public /* synthetic */ class07209 method_10078() {
        return this.east();
    }

    public /* synthetic */ class07209 method_10079(class07211 class072112, int n) {
        return this.relative(class072112, n);
    }

    public static long longHash(int n, int n2, int n3) {
        long l = 3241L;
        l = 3457689L * l + (long)n;
        l = 8734625L * l + (long)n2;
        l = 2873465L * l + (long)n3;
        return l;
    }

    public static long longHash(BetterBlockPos betterBlockPos) {
        return BetterBlockPos.longHash(betterBlockPos.x, betterBlockPos.y, betterBlockPos.z);
    }

    public BetterBlockPos above(int n) {
        return n == 0 ? this : new BetterBlockPos(this.x, this.y + n, this.z);
    }

    public BetterBlockPos above() {
        return new BetterBlockPos(this.x, this.y + 1, this.z);
    }

    public BetterBlockPos below() {
        return new BetterBlockPos(this.x, this.y - 1, this.z);
    }

    public BetterBlockPos below(int n) {
        return n == 0 ? this : new BetterBlockPos(this.x, this.y - n, this.z);
    }

    public double distanceTo(BetterBlockPos betterBlockPos) {
        double d = (double)this.x - (double)betterBlockPos.x;
        double d2 = (double)this.y - (double)betterBlockPos.y;
        double d3 = (double)this.z - (double)betterBlockPos.z;
        return Math.sqrt(d * d + d2 * d2 + d3 * d3);
    }

    public static long serializeToLong(int n, int n2, int n3) {
        return ((long)n & 0x3FFFFFFL) << 38 | ((long)n2 & 0xFFFL) << 26 | (long)n3 & 0x3FFFFFFL;
    }

    public static BetterBlockPos deserializeFromLong(long l) {
        int n = (int)(l << 0 >> 38);
        int n2 = (int)(l << 26 >> 52);
        int n3 = (int)(l << 38 >> 38);
        return new BetterBlockPos(n, n2, n3);
    }
}

