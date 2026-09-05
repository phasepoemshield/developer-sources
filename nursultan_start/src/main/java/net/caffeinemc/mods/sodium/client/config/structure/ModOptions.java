/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.option.FlagHook
 *  net.caffeinemc.mods.sodium.client.gui.ColorTheme
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.option.FlagHook;
import net.caffeinemc.mods.sodium.client.config.search.SearchIndex;
import net.caffeinemc.mods.sodium.client.config.search.Searchable;
import net.caffeinemc.mods.sodium.client.config.structure.OptionOverlay;
import net.caffeinemc.mods.sodium.client.config.structure.OptionOverride;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;

public record ModOptions(String configId, String name, String version, ColorTheme theme, class01894 icon, boolean iconMonochrome, ImmutableList<Page> pages, List<OptionOverride> overrides, List<OptionOverlay> overlays, Collection<FlagHook> flagHooks) implements Searchable
{
    @Override
    public void registerTextSources(SearchIndex searchIndex) {
        for (Page page : this.pages) {
            page.registerTextSources(searchIndex, this);
        }
    }
}

