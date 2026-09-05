/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.OptionBinding
 *  net.caffeinemc.mods.sodium.api.config.option.OptionFlag
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import java.util.Collection;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;
import net.caffeinemc.mods.sodium.api.config.option.OptionBinding;
import net.caffeinemc.mods.sodium.api.config.option.OptionFlag;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.api.config.structure.StatefulOptionBuilder;
import net.caffeinemc.mods.sodium.client.config.AnonymousOptionBinding;
import net.caffeinemc.mods.sodium.client.config.builder.OptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.StatefulOption;
import net.caffeinemc.mods.sodium.client.config.value.ConstantValue;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.config.value.DynamicValue;
import org.apache.commons.lang3.Validate;

abstract class StatefulOptionBuilderImpl<O extends StatefulOption<V>, V>
extends OptionBuilderImpl<O>
implements StatefulOptionBuilder<V> {
    private StorageEventHandler storage;
    private Function<V, class00392> tooltipProvider;
    private OptionImpact impact;
    private Set<class01894> flags;
    private DependentValue<V> defaultValue;
    private Boolean controlHiddenWhenDisabled;
    private OptionBinding<V> binding;
    private Consumer<ConfigState> applyHook;

    Set<class01894> getFlags() {
        return (Set)this.getFirstNotNull(this.flags, StatefulOption::getFlags);
    }

    @Override
    public StatefulOptionBuilder<V> setFlags(OptionFlag ... optionFlagArray) {
        class01894[] class01894Array = new class01894[optionFlagArray.length];
        for (int i = 0; i < optionFlagArray.length; ++i) {
            class01894Array[i] = optionFlagArray[i].getId();
        }
        return this.setFlags(class01894Array);
    }

    @Override
    public StatefulOptionBuilder<V> setFlags(class01894 ... class01894Array) {
        this.flags = Set.of(class01894Array);
        return this;
    }

    StatefulOptionBuilderImpl(class01894 class018942) {
        super(class018942);
    }

    @Override
    public StatefulOptionBuilder<V> setName(class00392 class003922) {
        super.setName(class003922);
        return this;
    }

    DependentValue<V> getDefaultValue() {
        return (DependentValue)this.getFirstNotNull(this.defaultValue, StatefulOption::getDefaultValue);
    }

    @Override
    public StatefulOptionBuilder<V> setEnabled(boolean bl) {
        super.setEnabled(bl);
        return this;
    }

    OptionBinding<V> getBinding() {
        return (OptionBinding)this.getFirstNotNull(this.binding, StatefulOption::getBinding);
    }

    @Override
    void validateData() {
        super.validateData();
        Validate.notNull((Object)this.getStorage(), (String)"Storage handler must be set", (Object[])new Object[0]);
        Validate.notNull(this.getTooltipProvider(), (String)"Tooltip provider must be set", (Object[])new Object[0]);
        Validate.notNull(this.getDefaultValue(), (String)"Default value must be set", (Object[])new Object[0]);
        Validate.notNull(this.getBinding(), (String)"Binding must be set", (Object[])new Object[0]);
    }

    Consumer<ConfigState> getApplyHook() {
        return (Consumer)this.getFirstNotNull(this.applyHook, StatefulOption::getApplyHook);
    }

    Function<V, class00392> getTooltipProvider() {
        return (Function)this.getFirstNotNull(this.tooltipProvider, StatefulOption::getTooltipProvider);
    }

    @Override
    public StatefulOptionBuilder<V> setApplyHook(Consumer<ConfigState> consumer) {
        this.applyHook = consumer;
        return this;
    }

    @Override
    public StatefulOptionBuilder<V> setDefaultProvider(Function<ConfigState, V> function, class01894 ... class01894Array) {
        Validate.notNull(function, (String)"Argument must not be null", (Object[])new Object[0]);
        this.defaultValue = new DynamicValue<V>(function, class01894Array);
        return this;
    }

    @Override
    public StatefulOptionBuilder<V> setImpact(OptionImpact optionImpact) {
        Validate.notNull((Object)optionImpact, (String)"Argument must not be null", (Object[])new Object[0]);
        this.impact = optionImpact;
        return this;
    }

    @Override
    public StatefulOptionBuilder<V> setBinding(Consumer<V> consumer, Supplier<V> supplier) {
        Validate.notNull(consumer, (String)"Setter must not be null", (Object[])new Object[0]);
        Validate.notNull(supplier, (String)"Getter must not be null", (Object[])new Object[0]);
        this.binding = new AnonymousOptionBinding<V>(consumer, supplier);
        return this;
    }

    @Override
    public StatefulOptionBuilder<V> setBinding(OptionBinding<V> optionBinding) {
        Validate.notNull(optionBinding, (String)"Argument must not be null", (Object[])new Object[0]);
        this.binding = optionBinding;
        return this;
    }

    OptionImpact getImpact() {
        return (OptionImpact)this.getFirstNotNull(this.impact, StatefulOption::getImpact);
    }

    @Override
    Collection<class01894> getDependencies() {
        Collection<class01894> collection = super.getDependencies();
        collection.addAll(this.getDefaultValue().getDependencies());
        return collection;
    }

    StorageEventHandler getStorage() {
        return (StorageEventHandler)this.getFirstNotNull(this.storage, StatefulOption::getStorage);
    }

    @Override
    public StatefulOptionBuilder<V> setEnabledProvider(Function<ConfigState, Boolean> function, class01894 ... class01894Array) {
        super.setEnabledProvider(function, class01894Array);
        return this;
    }

    @Override
    public StatefulOptionBuilder<V> setStorageHandler(StorageEventHandler storageEventHandler) {
        Validate.notNull((Object)storageEventHandler, (String)"Argument must not be null", (Object[])new Object[0]);
        this.storage = storageEventHandler;
        return this;
    }

    @Override
    public StatefulOptionBuilder<V> setDefaultValue(V v) {
        Validate.notNull(v, (String)"Argument must not be null", (Object[])new Object[0]);
        this.defaultValue = new ConstantValue<V>(v);
        return this;
    }

    @Override
    public StatefulOptionBuilder<V> setControlHiddenWhenDisabled(boolean bl) {
        this.controlHiddenWhenDisabled = bl;
        return this;
    }

    Boolean getControlHiddenWhenDisabled() {
        return (Boolean)this.getFirstNotNull(this.controlHiddenWhenDisabled, StatefulOption::getControlHiddenWhenDisabled);
    }

    @Override
    public StatefulOptionBuilder<V> setTooltip(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"Argument must not be null", (Object[])new Object[0]);
        Validate.notBlank((CharSequence)class003922.getString(), (String)"Tooltip must not be blank", (Object[])new Object[0]);
        this.tooltipProvider = object -> class003922;
        return this;
    }

    @Override
    public StatefulOptionBuilder<V> setTooltip(Function<V, class00392> function) {
        Validate.notNull(function, (String)"Argument must not be null", (Object[])new Object[0]);
        this.tooltipProvider = function;
        return this;
    }
}

