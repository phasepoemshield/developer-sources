/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07348
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlags
 */
package net.caffeinemc.mods.lithium.common.world.section;

import java.util.Arrays;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07348;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;

public class RandomTickingSectionDataHelper {
    public static final int MINISECTION_SIZE = 248;
    public static final int MINISECTION_BITS = class04995.R((int)248);
    public static final int MINISECTION_COUNT = class04995.u((float)16.516129f);
    public static final int MINISECTIONS_PER_BYTE = 8 / MINISECTION_BITS;
    public static final int BYTE_COUNT = class04995.u((float)((float)MINISECTION_COUNT / (float)MINISECTIONS_PER_BYTE));
    public static final int RANDOM_TICKING_FLAG_MASK = 1 << BlockStateFlags.RANDOM_TICKING.getIndex();

    private static int pack(int n, int n2, int n3) {
        return (n2 << 4 | n3) << 4 | n;
    }

    public static void removeAt(int n, int n2, int n3, byte[] byArray) {
        int n4 = RandomTickingSectionDataHelper.getMinisectionIndex(n, n2, n3);
        byArray[n4] = (byte)(byArray[n4] - 1);
    }

    public static void randomTickNthBlock(class00554 class005542, int n, byte[] byArray, class04782 class047822, int n2, int n3, int n4, class06069 class060692) {
        int n5;
        assert (byArray.length == BYTE_COUNT);
        assert ((n2 & 0xF) == 0);
        assert ((n3 & 0xF) == 0);
        assert ((n4 & 0xF) == 0);
        for (int i = 0; i < byArray.length && n >= (n5 = Byte.toUnsignedInt(byArray[i])); n -= n5, ++i) {
        }
        for (n5 = i * 248; n5 < 4096; ++n5) {
            class04688 class046882;
            int n6;
            int n7;
            int n8 = RandomTickingSectionDataHelper.unpackX(n5);
            class00500 class005002 = class005542.N(n8, n7 = RandomTickingSectionDataHelper.unpackY(n5), n6 = RandomTickingSectionDataHelper.unpackZ(n5));
            if ((((BlockStateFlagHolder)class005002).lithium$getAllFlags() & RANDOM_TICKING_FLAG_MASK) == 0 || n-- != 0) continue;
            class07209 class072092 = new class07209(n2 | n8, n3 | n7, n4 | n6);
            if (class005002.Q()) {
                class005002.y(class047822, class072092, class060692);
            }
            if ((class046882 = class005002.Y()).M()) {
                class046882.N(class047822, class072092, class060692);
            }
            return;
        }
        throw new IllegalStateException("Failed to find random tickable position! This means lithium's random tickable block optimization encountered inconsistent data, hinting at a mod compatibility issue.");
    }

    public static void addAt(int n, int n2, int n3, byte[] byArray) {
        int n4 = RandomTickingSectionDataHelper.getMinisectionIndex(n, n2, n3);
        byArray[n4] = (byte)(byArray[n4] + 1);
    }

    public static int unpackZ(int n) {
        return n >> 4 & 0xF;
    }

    public static int unpackX(int n) {
        return n & 0xF;
    }

    public static int unpackY(int n) {
        return n >> 8 & 0xF;
    }

    public static void naiveInitializeData(class00554 class005542, byte[] byArray) {
        if (byArray.length != BYTE_COUNT) {
            throw new IllegalArgumentException("Invalid data length: " + byArray.length + ", expected " + BYTE_COUNT);
        }
        Arrays.fill(byArray, 0, BYTE_COUNT, (byte)0);
        if (!class005542.N(class005002 -> class005002.Q() || class005002.Y().M())) {
            return;
        }
        class07348 class073482 = class005542.B();
        for (int i = 0; i < 4096; ++i) {
            int n;
            class00500 class005003 = (class00500)class073482.N(RandomTickingSectionDataHelper.unpackX(i), RandomTickingSectionDataHelper.unpackY(i), RandomTickingSectionDataHelper.unpackZ(i));
            if ((((BlockStateFlagHolder)class005003).lithium$getAllFlags() & RANDOM_TICKING_FLAG_MASK) == 0) continue;
            int n2 = n = i / 248;
            byArray[n2] = (byte)(byArray[n2] + 1);
        }
    }

    public static int getMinisectionIndex(int n, int n2, int n3) {
        return RandomTickingSectionDataHelper.pack(n, n2, n3) / 248;
    }
}

