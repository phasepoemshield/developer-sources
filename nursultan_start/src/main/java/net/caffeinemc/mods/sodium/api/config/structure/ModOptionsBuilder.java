/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.option.FlagHook
 *  net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder
 */
package net.caffeinemc.mods.sodium.api.config.structure;

import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.option.FlagHook;
import net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.PageBuilder;

public interface ModOptionsBuilder {
    public ModOptionsBuilder setVersion(String var1);

    public ModOptionsBuilder setName(String var1);

    public ModOptionsBuilder registerFlagHook(FlagHook var1);

    public ModOptionsBuilder registerFlagHook(BiConsumer<Collection<class01894>, ConfigState> var1, class01894 ... var2);

    public ModOptionsBuilder setNonTintedIcon(class01894 var1);

    public ModOptionsBuilder addPage(PageBuilder var1);

    public ModOptionsBuilder setIcon(class01894 var1);

    public ModOptionsBuilder formatVersion(Function<String, String> var1);

    public ModOptionsBuilder registerOptionOverlay(class01894 var1, OptionBuilder var2);

    public ModOptionsBuilder registerOptionReplacement(class01894 var1, OptionBuilder var2);

    public ModOptionsBuilder setColorTheme(ColorThemeBuilder var1);
}

