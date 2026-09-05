/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 *  minecraft.class05096
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import com.google.common.collect.ImmutableList;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.search.SearchIndex;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import net.caffeinemc.mods.sodium.client.config.structure.Page;

public record ExternalPage(class00392 name, Consumer<class05096> currentScreenConsumer) implements Page
{
    @Override
    public ImmutableList<OptionGroup> groups() {
        return ImmutableList.of();
    }

    @Override
    public void registerTextSources(SearchIndex searchIndex, ModOptions modOptions) {
    }
}

