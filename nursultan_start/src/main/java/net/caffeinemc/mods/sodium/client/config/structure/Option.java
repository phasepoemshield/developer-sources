/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.OptionExtended
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.client.gui.options.control.Control
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import java.util.Collection;
import java.util.Set;
import java.util.function.Consumer;
import me.flashyreese.mods.reeses_sodium_options.client.gui.OptionExtended;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.client.config.search.SearchIndex;
import net.caffeinemc.mods.sodium.client.config.structure.Config;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Option$OptionNameSource;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import net.caffeinemc.mods.sodium.client.config.structure.OptionPage;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public abstract class Option
implements OptionExtended {
    final class01894 id;
    final Collection<class01894> dependencies;
    final class00392 name;
    final DependentValue<Boolean> enabled;
    Config state;
    Control control;
    private Dim2i parent;
    private Dim2i dim2i;
    private boolean highlight;
    private boolean selected;

    public Set<class01894> getFlags() {
        return Set.of();
    }

    public Control getControl() {
        if (this.control == null) {
            this.control = this.createControl();
        }
        return this.control;
    }

    Option(class01894 class018942, Collection<class01894> collection, class00392 class003922, DependentValue<Boolean> dependentValue) {
        if (collection.contains(class018942)) {
            throw new IllegalArgumentException("Option cannot depend on itself");
        }
        this.id = class018942;
        this.dependencies = collection;
        this.name = class003922;
        this.enabled = dependentValue;
    }

    public class00392 getName() {
        return this.name;
    }

    public boolean isEnabled() {
        return this.enabled.get(this.state);
    }

    public class01894 getId() {
        return this.id;
    }

    public DependentValue<Boolean> getEnabled() {
        return this.enabled;
    }

    public OptionImpact getImpact() {
        return null;
    }

    public abstract class00392 getTooltip();

    public void registerTextSources(SearchIndex searchIndex, ModOptions modOptions, OptionPage optionPage, OptionGroup optionGroup) {
        searchIndex.register(new Option$OptionNameSource(this, modOptions, optionPage, optionGroup));
    }

    void visitDependentValues(Consumer<DependentValue<?>> consumer) {
        consumer.accept(this.enabled);
    }

    public boolean hasChanged() {
        return false;
    }

    public void setDim2i(Dim2i dim2i) {
        this.dim2i = dim2i;
    }

    public Dim2i getDim2i() {
        return this.dim2i;
    }

    boolean applyChanges() {
        return false;
    }

    void setParentConfig(Config config) {
        this.state = config;
    }

    public boolean getSelected() {
        return this.selected;
    }

    abstract Control createControl();

    public Dim2i getParentDimension() {
        return this.parent;
    }

    void resetFromBinding() {
    }

    void loadValueInitial() {
    }

    public boolean isHighlight() {
        return this.highlight;
    }

    public void setParentDimension(Dim2i dim2i) {
        this.parent = dim2i;
    }

    public void setHighlight(boolean bl) {
        this.highlight = bl;
    }

    public void resetToDefault() {
    }

    public void setSelected(boolean bl) {
        this.selected = bl;
    }
}

