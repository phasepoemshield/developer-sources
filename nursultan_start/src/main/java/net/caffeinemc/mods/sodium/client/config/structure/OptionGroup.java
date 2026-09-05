/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import java.util.List;
import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.config.search.SearchIndex;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.structure.OptionPage;

public record OptionGroup(class00392 name, List<Option> options) {
    public void registerTextSources(SearchIndex searchIndex, ModOptions modOptions, OptionPage optionPage) {
        for (Option option : this.options) {
            option.registerTextSources(searchIndex, modOptions, optionPage, this);
        }
    }
}

