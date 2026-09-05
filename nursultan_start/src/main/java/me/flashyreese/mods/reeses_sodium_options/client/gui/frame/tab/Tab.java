/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab;

import java.util.function.Function;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.AbstractFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.tab.Tab$Builder;
import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class Tab<T extends AbstractFrame> {
    private final ModOptions modOptions;
    private final class00392 title;
    private final Page page;
    private final Function<Dim2i, T> frameFunction;

    public Tab(ModOptions modOptions, class00392 class003922, Page page, Function<Dim2i, T> function) {
        this.modOptions = modOptions;
        this.title = class003922;
        this.page = page;
        this.frameFunction = function;
    }

    public static Tab$Builder<?> builder() {
        return new Tab$Builder();
    }

    public class00392 getTitle() {
        return this.title;
    }

    public Page getPage() {
        return this.page;
    }

    public ModOptions getModOptions() {
        return this.modOptions;
    }

    public Function<Dim2i, T> getFrameFunction() {
        return this.frameFunction;
    }
}

