/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame;

import java.util.concurrent.atomic.AtomicReference;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.AbstractFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.ScrollableFrame;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class ScrollableFrame$Builder {
    private boolean renderOutline = false;
    private Dim2i dim = null;
    private AbstractFrame frame = null;
    private AtomicReference<Integer> verticalScrollBarOffset = new AtomicReference<Integer>(0);
    private AtomicReference<Integer> horizontalScrollBarOffset = new AtomicReference<Integer>(0);
    private class05096 screen;
    private ModOptions modOptions;

    public ScrollableFrame build() {
        return new ScrollableFrame(this.dim, this.screen, this.modOptions, this.frame, this.renderOutline, this.verticalScrollBarOffset, this.horizontalScrollBarOffset);
    }

    public ScrollableFrame$Builder withDimension(Dim2i dim2i) {
        this.dim = dim2i;
        return this;
    }

    public ScrollableFrame$Builder withScreen(class05096 class050962) {
        this.screen = class050962;
        return this;
    }

    public ScrollableFrame$Builder withFrame(AbstractFrame abstractFrame) {
        this.frame = abstractFrame;
        return this;
    }

    public ScrollableFrame$Builder withHorizontalScrollBarOffset(AtomicReference<Integer> atomicReference) {
        this.horizontalScrollBarOffset = atomicReference;
        return this;
    }

    public ScrollableFrame$Builder withVerticalScrollBarOffset(AtomicReference<Integer> atomicReference) {
        this.verticalScrollBarOffset = atomicReference;
        return this;
    }

    public ScrollableFrame$Builder withRenderOutline(boolean bl) {
        this.renderOutline = bl;
        return this;
    }

    public ScrollableFrame$Builder withModOptions(ModOptions modOptions) {
        this.modOptions = modOptions;
        return this;
    }
}

