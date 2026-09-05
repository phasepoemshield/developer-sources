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

public interface Page {
    public class00392 name();

    public ImmutableList<OptionGroup> groups();

    public void registerTextSources(SearchIndex var1, ModOptions var2);
}

