/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04995
 *  net.caffeinemc.mods.sodium.client.gui.options.TextProvider
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting;

import minecraft.class00392;
import minecraft.class04995;
import net.caffeinemc.mods.sodium.client.gui.options.TextProvider;

public enum QuadSplittingMode implements TextProvider
{
    OFF("/", 1.0f, true, "options.off"),
    SAFE("S", 2.0f, true, "sodium.options.quad_splitting.safe"),
    UNLIMITED("U", Float.POSITIVE_INFINITY, false, "sodium.options.quad_splitting.unlimited");

    private final String shortName;
    private final float maxAmplificationFactor;
    private final boolean quantizeTriggerNormals;
    private final class00392 name;

    private QuadSplittingMode(String string2, float f, boolean bl, String string3) {
        this.shortName = string2;
        this.maxAmplificationFactor = f;
        this.quantizeTriggerNormals = bl;
        this.name = class00392.L((String)string3);
    }

    public class00392 getLocalizedName() {
        return this.name;
    }

    public boolean quantizeTriggerNormals() {
        return this.quantizeTriggerNormals;
    }

    public String getShortName() {
        return this.shortName;
    }

    public boolean allowsSplitting() {
        return this != OFF;
    }

    public int getMaxTotalQuads(int n) {
        if (Float.isInfinite(this.maxAmplificationFactor)) {
            return Integer.MAX_VALUE;
        }
        return class04995.u((float)((float)n * this.maxAmplificationFactor));
    }
}

