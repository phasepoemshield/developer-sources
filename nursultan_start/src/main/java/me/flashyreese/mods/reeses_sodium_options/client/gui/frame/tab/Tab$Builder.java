/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.AbstractFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.PageFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.ScrollableFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab.Tab;
import minecraft.class00392;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class Tab$Builder<T extends AbstractFrame> {
    private ModOptions modOptions;
    private class00392 title;
    private Page page;
    private Function<Dim2i, T> frameFunction;

    public Tab<ScrollableFrame> from(class05096 class050962, ModOptions modOptions, Page page, AtomicReference<Integer> atomicReference) {
        return new Tab<ScrollableFrame>(modOptions, page.name(), page, dim2i -> ScrollableFrame.builder().withDimension((Dim2i)dim2i).withModOptions(modOptions).withScreen(class050962).withFrame(PageFrame.builder().withDimension(new Dim2i(dim2i.x(), dim2i.y(), dim2i.width(), dim2i.height())).withModOptions(modOptions).withPage(page).withScreen(class050962).build()).withVerticalScrollBarOffset(atomicReference).build());
    }

    public Tab<T> build() {
        return new Tab<T>(this.modOptions, this.title, this.page, this.frameFunction);
    }

    public Tab$Builder<T> withPage(Page page) {
        this.page = page;
        return this;
    }

    public Tab$Builder<T> withTitle(class00392 class003922) {
        this.title = class003922;
        return this;
    }

    public Tab$Builder<T> withModOptions(ModOptions modOptions) {
        this.modOptions = modOptions;
        return this;
    }

    public Tab$Builder<T> withFrameFunction(Function<Dim2i, T> function) {
        this.frameFunction = function;
        return this;
    }
}

