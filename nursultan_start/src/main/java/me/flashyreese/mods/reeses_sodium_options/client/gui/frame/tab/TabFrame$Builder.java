/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.apache.commons.lang3.Validate
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab.Tab;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab.TabFrame;
import minecraft.class00392;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.apache.commons.lang3.Validate;

public class TabFrame$Builder {
    private final List<Tab<?>> functions = new ArrayList();
    private Dim2i dim;
    private boolean renderOutline;
    private Runnable onSetTab;
    private AtomicReference<class00392> tabSectionSelectedTab = new AtomicReference<Object>(null);
    private AtomicReference<Integer> tabSectionScrollBarOffset = new AtomicReference<Integer>(0);
    private class05096 screen;
    private ModOptions modOptions;

    public TabFrame build() {
        Validate.notNull((Object)this.dim, (String)"Dimension must be specified", (Object[])new Object[0]);
        return new TabFrame(this.dim, this.screen, this.modOptions, this.renderOutline, this.functions, this.onSetTab, this.tabSectionSelectedTab, this.tabSectionScrollBarOffset);
    }

    public TabFrame$Builder setDimension(Dim2i dim2i) {
        this.dim = dim2i;
        return this;
    }

    public TabFrame$Builder addTabs(Consumer<List<Tab<?>>> consumer) {
        consumer.accept(this.functions);
        return this;
    }

    public TabFrame$Builder onSetTab(Runnable runnable) {
        this.onSetTab = runnable;
        return this;
    }

    public TabFrame$Builder withScreen(class05096 class050962) {
        this.screen = class050962;
        return this;
    }

    public TabFrame$Builder setTabSectionScrollBarOffset(AtomicReference<Integer> atomicReference) {
        this.tabSectionScrollBarOffset = atomicReference;
        return this;
    }

    public TabFrame$Builder withModOptions(ModOptions modOptions) {
        this.modOptions = modOptions;
        return this;
    }

    public TabFrame$Builder shouldRenderOutline(boolean bl) {
        this.renderOutline = bl;
        return this;
    }

    public TabFrame$Builder setTabSectionSelectedTab(AtomicReference<class00392> atomicReference) {
        this.tabSectionSelectedTab = atomicReference;
        return this;
    }
}

