/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.option.FlagHook
 *  net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder
 *  net.caffeinemc.mods.sodium.client.gui.ColorTheme
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.option.FlagHook;
import net.caffeinemc.mods.sodium.api.config.structure.ColorThemeBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.ModOptionsBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.PageBuilder;
import net.caffeinemc.mods.sodium.client.config.builder.ColorThemeBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.OptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.PageBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.FlagHookImpl;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.structure.OptionOverlay;
import net.caffeinemc.mods.sodium.client.config.structure.OptionOverride;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import org.apache.commons.lang3.Validate;

class ModOptionsBuilderImpl
implements ModOptionsBuilder {
    private final String configId;
    private String name;
    private String version;
    private ColorTheme theme;
    private class01894 icon;
    private boolean iconMonochrome = true;
    private final List<Page> pages = new ArrayList<Page>();
    private List<OptionOverride> optionOverrides;
    private List<OptionOverlay> optionOverlays;
    private Collection<FlagHook> flagHooks;

    @Override
    public ModOptionsBuilder setVersion(String string) {
        this.version = string;
        return this;
    }

    ModOptionsBuilderImpl(String string, String string2, String string3) {
        this.configId = string;
        this.name = string2;
        this.version = string3;
    }

    @Override
    public ModOptionsBuilder setName(String string) {
        this.name = string;
        return this;
    }

    ModOptions build() {
        List<Object> list;
        Validate.notEmpty((CharSequence)this.name, (String)"Name must not be empty", (Object[])new Object[0]);
        Validate.notEmpty((CharSequence)this.version, (String)"Version must not be empty", (Object[])new Object[0]);
        List<Object> list2 = this.optionOverrides == null ? List.of() : this.optionOverrides;
        List<Object> list3 = list = this.optionOverlays == null ? List.of() : this.optionOverlays;
        if (this.pages.isEmpty() && list2.isEmpty() && list.isEmpty()) {
            throw new IllegalStateException("At least one page, option override, or option overlay must be added");
        }
        if (this.theme == null) {
            this.theme = ColorTheme.PRESETS[Math.abs(this.configId.hashCode()) % ColorTheme.PRESETS.length];
        }
        return new ModOptions(this.configId, this.name, this.version, this.theme, this.icon, this.iconMonochrome, (ImmutableList<Page>)ImmutableList.copyOf(this.pages), list2, list, this.flagHooks);
    }

    @Override
    public ModOptionsBuilder registerFlagHook(FlagHook flagHook) {
        if (this.flagHooks == null) {
            this.flagHooks = new ObjectArrayList();
        }
        this.flagHooks.add(flagHook);
        return this;
    }

    @Override
    public ModOptionsBuilder registerFlagHook(BiConsumer<Collection<class01894>, ConfigState> biConsumer, class01894 ... class01894Array) {
        return this.registerFlagHook(new FlagHookImpl(biConsumer, List.of(class01894Array)));
    }

    @Override
    public ModOptionsBuilder setNonTintedIcon(class01894 class018942) {
        this.icon = class018942;
        this.iconMonochrome = false;
        return this;
    }

    @Override
    public ModOptionsBuilder addPage(PageBuilder pageBuilder) {
        this.pages.add(((PageBuilderImpl)((Object)pageBuilder)).build());
        return this;
    }

    @Override
    public ModOptionsBuilder setIcon(class01894 class018942) {
        this.icon = class018942;
        return this;
    }

    @Override
    public ModOptionsBuilder formatVersion(Function<String, String> function) {
        this.version = function.apply(this.version);
        return this;
    }

    @Override
    public ModOptionsBuilder registerOptionOverlay(class01894 class018942, OptionBuilder optionBuilder) {
        OptionOverlay optionOverlay = new OptionOverlay(class018942, this.configId, (OptionBuilderImpl)optionBuilder);
        if (this.optionOverlays == null) {
            this.optionOverlays = new ArrayList<OptionOverlay>();
        }
        this.optionOverlays.add(optionOverlay);
        return this;
    }

    @Override
    public ModOptionsBuilder registerOptionReplacement(class01894 class018942, OptionBuilder optionBuilder) {
        OptionOverride optionOverride = new OptionOverride(class018942, this.configId, (Option)((OptionBuilderImpl)optionBuilder).build());
        if (this.optionOverrides == null) {
            this.optionOverrides = new ArrayList<OptionOverride>();
        }
        this.optionOverrides.add(optionOverride);
        return this;
    }

    @Override
    public ModOptionsBuilder setColorTheme(ColorThemeBuilder colorThemeBuilder) {
        this.theme = ((ColorThemeBuilderImpl)colorThemeBuilder).build();
        return this;
    }
}

