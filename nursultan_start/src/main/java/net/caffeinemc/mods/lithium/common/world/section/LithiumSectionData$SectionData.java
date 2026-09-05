/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00554
 *  net.caffeinemc.mods.lithium.common.tracking.block.ChunkSectionChangeCallback
 */
package net.caffeinemc.mods.lithium.common.world.section;

import java.util.Arrays;
import minecraft.class00554;
import net.caffeinemc.mods.lithium.common.tracking.block.ChunkSectionChangeCallback;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper;

public class LithiumSectionData$SectionData {
    private short[] countsByFlag = null;
    private ChunkSectionChangeCallback changeListener = null;
    private byte[] randomTickableBlocksByY;

    public LithiumSectionData$SectionData(class00554 class005542) {
    }

    public String toString() {
        return "SectionData[countsByFlag=" + Arrays.toString(this.countsByFlag) + ", changeListener=" + String.valueOf(this.changeListener) + ", randomTickableBlocksByY=" + Arrays.toString(this.randomTickableBlocksByY) + "]";
    }

    public void setRandomTickableBlocksByY(byte[] byArray) {
        if (byArray.length != RandomTickingSectionDataHelper.BYTE_COUNT) {
            throw new IllegalArgumentException("Invalid randomTickableBlocksByY length: " + byArray.length + ", expected " + RandomTickingSectionDataHelper.BYTE_COUNT);
        }
        this.randomTickableBlocksByY = byArray;
    }

    public byte[] getRandomTickableBlocksByY() {
        return this.randomTickableBlocksByY;
    }

    public ChunkSectionChangeCallback getChangeListener() {
        return this.changeListener;
    }

    public void setChangeListener(ChunkSectionChangeCallback chunkSectionChangeCallback) {
        this.changeListener = chunkSectionChangeCallback;
    }

    public void setCountsByFlag(short[] sArray) {
        this.countsByFlag = sArray;
    }

    public short[] getCountsByFlag() {
        return this.countsByFlag;
    }
}

