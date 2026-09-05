/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.structure.BooleanOptionBuilder
 *  net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.structure.BooleanOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.EnumOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ExternalButtonOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ExternalPageBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.IntegerOptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ModOptionsBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionGroupBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionPageBuilder;
import net.caffeinemc.mods.sodium.client.config.ConfigManager$ModMetadata;
import net.caffeinemc.mods.sodium.client.config.builder.BooleanOptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.ColorThemeBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.EnumOptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.ExternalButtonOptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.ExternalPageBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.IntegerOptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.ModOptionsBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.OptionGroupBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.OptionPageBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;

public class ConfigBuilderImpl
implements ConfigBuilder {
    private final List<ModOptionsBuilderImpl> pendingModConfigBuilders = new ArrayList<ModOptionsBuilderImpl>(1);
    private final Function<String, ConfigManager$ModMetadata> modInfoFunction;
    private final String defaultConfigId;

    public ConfigBuilderImpl(Function<String, ConfigManager$ModMetadata> function, String string) {
        this.modInfoFunction = function;
        this.defaultConfigId = string;
    }

    public Collection<ModOptions> build() {
        ArrayList<ModOptions> arrayList = new ArrayList<ModOptions>(this.pendingModConfigBuilders.size());
        for (ModOptionsBuilderImpl modOptionsBuilderImpl : this.pendingModConfigBuilders) {
            arrayList.add(modOptionsBuilderImpl.build());
        }
        return arrayList;
    }

    @Override
    public ExternalPageBuilder createExternalPage() {
        return new ExternalPageBuilderImpl();
    }

    @Override
    public ModOptionsBuilder registerModOptions(String string) {
        ConfigManager$ModMetadata configManager$ModMetadata = this.modInfoFunction.apply(string);
        return this.registerModOptions(string, configManager$ModMetadata.modName(), configManager$ModMetadata.modVersion());
    }

    @Override
    public ModOptionsBuilder registerModOptions(String string, String string2, String string3) {
        ModOptionsBuilderImpl modOptionsBuilderImpl = new ModOptionsBuilderImpl(string, string2, string3);
        this.pendingModConfigBuilders.add(modOptionsBuilderImpl);
        return modOptionsBuilderImpl;
    }

    @Override
    public BooleanOptionBuilder createBooleanOption(class01894 class018942) {
        return new BooleanOptionBuilderImpl(class018942);
    }

    @Override
    public IntegerOptionBuilder createIntegerOption(class01894 class018942) {
        return new IntegerOptionBuilderImpl(class018942);
    }

    @Override
    public ModOptionsBuilder registerOwnModOptions() {
        return this.registerModOptions(this.defaultConfigId);
    }

    @Override
    public ExternalButtonOptionBuilder createExternalButtonOption(class01894 class018942) {
        return new ExternalButtonOptionBuilderImpl(class018942);
    }

    @Override
    public <E extends Enum<E>> EnumOptionBuilder<E> createEnumOption(class01894 class018942, Class<E> clazz) {
        return new EnumOptionBuilderImpl<E>(class018942, clazz);
    }

    @Override
    public OptionGroupBuilder createOptionGroup() {
        return new OptionGroupBuilderImpl();
    }

    @Override
    public ColorThemeBuilder createColorTheme() {
        return new ColorThemeBuilderImpl();
    }

    @Override
    public OptionPageBuilder createOptionPage() {
        return new OptionPageBuilderImpl();
    }
}

