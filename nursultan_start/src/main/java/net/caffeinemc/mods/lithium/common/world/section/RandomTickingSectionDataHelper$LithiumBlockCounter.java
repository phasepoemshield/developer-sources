/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class07340
 *  minecraft.class07350
 *  net.caffeinemc.mods.lithium.common.block.BlockCountingSection
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlags
 */
package net.caffeinemc.mods.lithium.common.world.section;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Arrays;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class07340;
import minecraft.class07350;
import net.caffeinemc.mods.lithium.common.block.BlockCountingSection;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.world.section.LithiumSectionData;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper;

public class RandomTickingSectionDataHelper$LithiumBlockCounter
implements class07350<class00500> {
    private final byte[] randomTickData;
    private byte lastRandomTickableBlockCountTotal;
    private int minisectionIndex;
    private final class07350<class00500> delegate;
    static final /* synthetic */ boolean $assertionsDisabled;

    public RandomTickingSectionDataHelper$LithiumBlockCounter(byte[] byArray, class07350<class00500> class073502) {
        this.randomTickData = byArray;
        this.lastRandomTickableBlockCountTotal = 0;
        this.minisectionIndex = 0;
        this.delegate = class073502;
    }

    static {
        $assertionsDisabled = !RandomTickingSectionDataHelper.class.desiredAssertionStatus();
    }

    public void accept(class00500 class005002, int n) {
        this.delegate.accept((Object)class005002, n);
    }

    public void handleAfterCounting(class00554 class005542) {
        if (RandomTickingSectionDataHelper.MINISECTION_COUNT != this.minisectionIndex) {
            if (this.randomTickData != ((LithiumSectionData)class005542).lithium$getSectionData().getRandomTickableBlocksByY()) {
                throw new IllegalArgumentException("Lithium random tick data was replaced unexpectedly!");
            }
            Arrays.fill(this.randomTickData, 0, this.randomTickData.length, (byte)0);
            RandomTickingSectionDataHelper.naiveInitializeData(class005542, this.randomTickData);
        }
        if (!$assertionsDisabled && 0 != this.sanityCheckRandomTickableBlockCount((BlockCountingSection)class005542)) {
            throw new AssertionError();
        }
    }

    public void finishedCountingMinisection(Int2IntOpenHashMap int2IntOpenHashMap, class07340<class00500> class073402) {
        int n = this.minisectionIndex;
        this.randomTickData[n] = (byte)(this.randomTickData[n] - this.lastRandomTickableBlockCountTotal);
        int2IntOpenHashMap.int2IntEntrySet().forEach(entry -> {
            class00500 class005002 = (class00500)class073402.method_12288(entry.getIntKey());
            if ((((BlockStateFlagHolder)class005002).lithium$getAllFlags() & RandomTickingSectionDataHelper.RANDOM_TICKING_FLAG_MASK) != 0) {
                int n = this.minisectionIndex;
                this.randomTickData[n] = (byte)(this.randomTickData[n] + (byte)entry.getIntValue());
            }
        });
        this.lastRandomTickableBlockCountTotal = (byte)(this.lastRandomTickableBlockCountTotal + this.randomTickData[this.minisectionIndex]);
        ++this.minisectionIndex;
    }

    private int sanityCheckRandomTickableBlockCount(BlockCountingSection blockCountingSection) {
        int n = blockCountingSection.lithium$getCount(BlockStateFlags.RANDOM_TICKING);
        int n2 = 0;
        for (byte by : this.randomTickData) {
            n2 += Byte.toUnsignedInt(by);
        }
        if (n != n2) {
            throw new IllegalStateException("Lithium random tick data initialization calculated inconsistent results: " + n + " != " + n2);
        }
        return 0;
    }
}

