/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter
 *  net.caffeinemc.mods.sodium.api.config.option.OptionBinding
 *  net.caffeinemc.mods.sodium.api.config.option.OptionFlag
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.api.config.option.Range
 *  net.caffeinemc.mods.sodium.api.config.option.SteppedValidator
 *  net.irisshaders.iris.compat.sodium.mixin.IntegerOptionBuilderImplAccessor
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;
import net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter;
import net.caffeinemc.mods.sodium.api.config.option.OptionBinding;
import net.caffeinemc.mods.sodium.api.config.option.OptionFlag;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.api.config.option.Range;
import net.caffeinemc.mods.sodium.api.config.option.SteppedValidator;
import net.caffeinemc.mods.sodium.api.config.structure.IntegerOptionBuilder;
import net.caffeinemc.mods.sodium.client.config.builder.StatefulOptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.IntegerOption;
import net.caffeinemc.mods.sodium.client.config.value.ConstantValue;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.config.value.DynamicValue;
import net.irisshaders.iris.compat.sodium.mixin.IntegerOptionBuilderImplAccessor;
import org.apache.commons.lang3.Validate;

class IntegerOptionBuilderImpl
extends StatefulOptionBuilderImpl<IntegerOption, Integer>
implements IntegerOptionBuilder,
IntegerOptionBuilderImplAccessor {
    private DependentValue<? extends SteppedValidator> validatorProvider;
    private ControlValueFormatter valueFormatter;

    @Override
    public IntegerOptionBuilder setFlags(class01894 ... class01894Array) {
        super.setFlags(class01894Array);
        return this;
    }

    @Override
    public IntegerOptionBuilder setFlags(OptionFlag ... optionFlagArray) {
        super.setFlags(optionFlagArray);
        return this;
    }

    IntegerOptionBuilderImpl(class01894 class018942) {
        super(class018942);
    }

    @Override
    public IntegerOptionBuilder setName(class00392 class003922) {
        super.setName(class003922);
        return this;
    }

    @Override
    IntegerOption build() {
        this.prepareBuild();
        return new IntegerOption(this.id, this.getDependencies(), this.getName(), this.getEnabled(), this.getStorage(), this.getTooltipProvider(), this.getImpact(), this.getFlags(), this.getDefaultValue(), this.getControlHiddenWhenDisabled(), this.getBinding(), this.getApplyHook(), this.getValidatorProvider(), this.getValueFormatter());
    }

    @Override
    public IntegerOptionBuilder setEnabled(boolean bl) {
        super.setEnabled(bl);
        return this;
    }

    @Override
    void validateData() {
        super.validateData();
        Validate.notNull(this.getValidatorProvider(), (String)"Validator provider must be set", (Object[])new Object[0]);
        Validate.notNull((Object)this.getValueFormatter(), (String)"Value formatter must be set", (Object[])new Object[0]);
    }

    @Override
    Class<IntegerOption> getOptionClass() {
        return IntegerOption.class;
    }

    @Override
    public IntegerOptionBuilder setApplyHook(Consumer<ConfigState> consumer) {
        super.setApplyHook(consumer);
        return this;
    }

    @Override
    public IntegerOptionBuilder setDefaultProvider(Function<ConfigState, Integer> function, class01894 ... class01894Array) {
        super.setDefaultProvider(function, class01894Array);
        return this;
    }

    @Override
    public IntegerOptionBuilder setRange(Range range) {
        this.validatorProvider = new ConstantValue<Range>(range);
        return this;
    }

    @Override
    public IntegerOptionBuilder setRange(int n, int n2, int n3) {
        return this.setRange(new Range(n, n2, n3));
    }

    @Override
    public IntegerOptionBuilder setImpact(OptionImpact optionImpact) {
        super.setImpact(optionImpact);
        return this;
    }

    @Override
    public IntegerOptionBuilder setBinding(Consumer<Integer> consumer, Supplier<Integer> supplier) {
        super.setBinding(consumer, supplier);
        return this;
    }

    @Override
    public IntegerOptionBuilder setBinding(OptionBinding<Integer> optionBinding) {
        super.setBinding(optionBinding);
        return this;
    }

    @Override
    Collection<class01894> getDependencies() {
        Collection<class01894> collection = super.getDependencies();
        collection.addAll(this.getValidatorProvider().getDependencies());
        return collection;
    }

    @Override
    public IntegerOptionBuilder setValidatorProvider(Function<ConfigState, ? extends SteppedValidator> function, class01894 ... class01894Array) {
        this.validatorProvider = new DynamicValue<SteppedValidator>(function, class01894Array);
        return this;
    }

    @Override
    public IntegerOptionBuilder setEnabledProvider(Function<ConfigState, Boolean> function, class01894 ... class01894Array) {
        super.setEnabledProvider((Function)function, class01894Array);
        return this;
    }

    @Override
    public IntegerOptionBuilder setStorageHandler(StorageEventHandler storageEventHandler) {
        super.setStorageHandler(storageEventHandler);
        return this;
    }

    @Override
    public IntegerOptionBuilder setValueFormatter(ControlValueFormatter controlValueFormatter) {
        this.valueFormatter = controlValueFormatter;
        return this;
    }

    @Override
    public IntegerOptionBuilder setValidator(SteppedValidator steppedValidator) {
        this.validatorProvider = new ConstantValue<SteppedValidator>(steppedValidator);
        return this;
    }

    @Override
    public IntegerOptionBuilder setDefaultValue(Integer n) {
        super.setDefaultValue(n);
        return this;
    }

    public /* synthetic */ ControlValueFormatter iris$getValueFormatter() {
        return this.valueFormatter;
    }

    DependentValue<? extends SteppedValidator> getValidatorProvider() {
        return (DependentValue)this.getFirstNotNull(this.validatorProvider, IntegerOption::getValidatorProvider);
    }

    @Override
    public IntegerOptionBuilder setControlHiddenWhenDisabled(boolean bl) {
        super.setControlHiddenWhenDisabled(bl);
        return this;
    }

    @Override
    public IntegerOptionBuilder setTooltip(class00392 class003922) {
        super.setTooltip(class003922);
        return this;
    }

    @Override
    public IntegerOptionBuilder setTooltip(Function<Integer, class00392> function) {
        super.setTooltip(function);
        return this;
    }

    @Override
    public IntegerOptionBuilder setRangeProvider(Function<ConfigState, ? extends SteppedValidator> function, class01894 ... class01894Array) {
        this.validatorProvider = new DynamicValue<SteppedValidator>(function, class01894Array);
        return this;
    }

    ControlValueFormatter getValueFormatter() {
        return (ControlValueFormatter)this.getFirstNotNull(this.valueFormatter, IntegerOption::getValueFormatter);
    }
}

