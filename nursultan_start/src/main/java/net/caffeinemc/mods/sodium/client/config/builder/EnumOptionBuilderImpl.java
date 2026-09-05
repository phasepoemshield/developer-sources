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
 *  net.caffeinemc.mods.sodium.client.gui.options.TextProvider
 *  net.irisshaders.iris.compat.sodium.mixin.EnumOptionBuilderImplAccessor
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
import net.caffeinemc.mods.sodium.api.config.structure.EnumOptionBuilder;
import net.caffeinemc.mods.sodium.client.config.builder.StatefulOptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.EnumOption;
import net.caffeinemc.mods.sodium.client.config.value.ConstantValue;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.config.value.DynamicValue;
import net.caffeinemc.mods.sodium.client.gui.options.TextProvider;
import net.irisshaders.iris.compat.sodium.mixin.EnumOptionBuilderImplAccessor;
import org.apache.commons.lang3.Validate;

class EnumOptionBuilderImpl<E extends Enum<E>>
extends StatefulOptionBuilderImpl<EnumOption<E>, E>
implements EnumOptionBuilder<E>,
EnumOptionBuilderImplAccessor {
    private final Class<E> enumClass;
    private DependentValue<Set<E>> allowedValues;
    private Function<E, class00392> elementNameProvider;

    @Override
    public EnumOptionBuilder<E> setFlags(class01894 ... class01894Array) {
        super.setFlags(class01894Array);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setFlags(OptionFlag ... optionFlagArray) {
        super.setFlags(optionFlagArray);
        return this;
    }

    EnumOptionBuilderImpl(class01894 class018942, Class<E> clazz) {
        super(class018942);
        this.enumClass = clazz;
    }

    @Override
    public EnumOptionBuilder<E> setName(class00392 class003922) {
        super.setName(class003922);
        return this;
    }

    @Override
    EnumOption<E> build() {
        if (this.getAllowedValues() == null) {
            this.allowedValues = new ConstantValue<Set<Enum>>(Set.of((Enum[])this.enumClass.getEnumConstants()));
        }
        if (this.getElementNameProvider() == null && TextProvider.class.isAssignableFrom(this.enumClass)) {
            this.elementNameProvider = enum_ -> ((TextProvider)enum_).getLocalizedName();
        }
        this.prepareBuild();
        return new EnumOption(this.id, this.getDependencies(), this.getName(), this.getEnabled(), this.getStorage(), this.getTooltipProvider(), this.getImpact(), this.getFlags(), this.getDefaultValue(), this.getControlHiddenWhenDisabled(), this.getBinding(), this.getApplyHook(), this.getEnumClass(), this.getAllowedValues(), this.getElementNameProvider());
    }

    @Override
    public EnumOptionBuilder<E> setEnabled(boolean bl) {
        super.setEnabled(bl);
        return this;
    }

    @Override
    void validateData() {
        super.validateData();
        Validate.notNull(this.getElementNameProvider(), (String)"Element name provider must be set or enum class must implement TextProvider", (Object[])new Object[0]);
    }

    @Override
    Class<EnumOption<E>> getOptionClass() {
        Class<EnumOption> clazz = EnumOption.class;
        return clazz;
    }

    @Override
    public EnumOptionBuilder<E> setApplyHook(Consumer<ConfigState> consumer) {
        super.setApplyHook(consumer);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setDefaultProvider(Function<ConfigState, E> function, class01894 ... class01894Array) {
        super.setDefaultProvider(function, class01894Array);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setImpact(OptionImpact optionImpact) {
        super.setImpact(optionImpact);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setBinding(Consumer<E> consumer, Supplier<E> supplier) {
        super.setBinding(consumer, supplier);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setBinding(OptionBinding<E> optionBinding) {
        super.setBinding(optionBinding);
        return this;
    }

    @Override
    Collection<class01894> getDependencies() {
        Collection<class01894> collection = super.getDependencies();
        collection.addAll(this.getAllowedValues().getDependencies());
        return collection;
    }

    @Override
    public EnumOptionBuilder<E> setElementNameProvider(Function<E, class00392> function) {
        this.elementNameProvider = function;
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setAllowedValuesProvider(Function<ConfigState, Set<E>> function, class01894 ... class01894Array) {
        this.allowedValues = new DynamicValue<Set<E>>(function, class01894Array);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setEnabledProvider(Function<ConfigState, Boolean> function, class01894 ... class01894Array) {
        super.setEnabledProvider((Function)function, class01894Array);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setStorageHandler(StorageEventHandler storageEventHandler) {
        super.setStorageHandler(storageEventHandler);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setDefaultValue(E e) {
        super.setDefaultValue(e);
        return this;
    }

    Function<E, class00392> getElementNameProvider() {
        return (Function)this.getFirstNotNull(this.elementNameProvider, EnumOption::getElementNameProvider);
    }

    @Override
    public EnumOptionBuilder<E> setControlHiddenWhenDisabled(boolean bl) {
        super.setControlHiddenWhenDisabled(bl);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setTooltip(class00392 class003922) {
        super.setTooltip(class003922);
        return this;
    }

    @Override
    public EnumOptionBuilder<E> setTooltip(Function<E, class00392> function) {
        super.setTooltip(function);
        return this;
    }

    DependentValue<Set<E>> getAllowedValues() {
        return (DependentValue)this.getFirstNotNull(this.allowedValues, EnumOption::getAllowedValues);
    }

    @Override
    public EnumOptionBuilder<E> setAllowedValues(Set<E> set) {
        this.allowedValues = new ConstantValue<Set<E>>(set);
        return this;
    }

    public /* synthetic */ Class getEnumClass() {
        return this.enumClass;
    }
}

