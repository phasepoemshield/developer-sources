/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.structure.BooleanOptionBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder
 */
package net.caffeinemc.mods.sodium.api.config.structure;

import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.structure.BooleanOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.EnumOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ExternalButtonOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ExternalPageBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.IntegerOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ModOptionsBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionGroupBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionPageBuilder;

public interface ConfigBuilder {
    public ExternalPageBuilder createExternalPage();

    public ModOptionsBuilder registerModOptions(String var1, String var2, String var3);

    public ModOptionsBuilder registerModOptions(String var1);

    public BooleanOptionBuilder createBooleanOption(class01894 var1);

    public IntegerOptionBuilder createIntegerOption(class01894 var1);

    public ModOptionsBuilder registerOwnModOptions();

    public ExternalButtonOptionBuilder createExternalButtonOption(class01894 var1);

    public <E extends Enum<E>> EnumOptionBuilder<E> createEnumOption(class01894 var1, Class<E> var2);

    public OptionGroupBuilder createOptionGroup();

    public ColorThemeBuilder createColorTheme();

    public OptionPageBuilder createOptionPage();
}

