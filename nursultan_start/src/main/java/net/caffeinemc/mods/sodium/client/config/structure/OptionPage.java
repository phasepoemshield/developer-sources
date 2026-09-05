/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import com.google.common.collect.ImmutableList;
import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.config.search.SearchIndex;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import net.caffeinemc.mods.sodium.client.config.structure.Page;

public record OptionPage(class00392 name, ImmutableList<OptionGroup> groups) implements Page
{
    @Override
    public void registerTextSources(SearchIndex searchIndex, ModOptions modOptions) {
        for (OptionGroup optionGroup : this.groups()) {
            optionGroup.registerTextSources(searchIndex, modOptions, this);
        }
    }
}

