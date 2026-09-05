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
 *  net.caffeinemc.mods.sodium.api.config.structure.BooleanOptionBuilder
 */
package net.caffeinemc.mods.sodium.client.config.builder;

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
import net.caffeinemc.mods.sodium.api.config.structure.BooleanOptionBuilder;
import net.caffeinemc.mods.sodium.client.config.builder.StatefulOptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.BooleanOption;

class BooleanOptionBuilderImpl
extends StatefulOptionBuilderImpl<BooleanOption, Boolean>
implements BooleanOptionBuilder {
    public BooleanOptionBuilder setFlags(class01894 ... class01894Array) {
        super.setFlags(class01894Array);
        return this;
    }

    public BooleanOptionBuilder setFlags(OptionFlag ... optionFlagArray) {
        super.setFlags(optionFlagArray);
        return this;
    }

    BooleanOptionBuilderImpl(class01894 class018942) {
        super(class018942);
    }

    public BooleanOptionBuilder setName(class00392 class003922) {
        super.setName(class003922);
        return this;
    }

    @Override
    BooleanOption build() {
        this.prepareBuild();
        return new BooleanOption(this.id, this.getDependencies(), this.getName(), this.getEnabled(), this.getStorage(), this.getTooltipProvider(), this.getImpact(), this.getFlags(), this.getDefaultValue(), this.getControlHiddenWhenDisabled(), (OptionBinding<Boolean>)this.getBinding(), this.getApplyHook());
    }

    public BooleanOptionBuilder setEnabled(boolean bl) {
        super.setEnabled(bl);
        return this;
    }

    @Override
    Class<BooleanOption> getOptionClass() {
        return BooleanOption.class;
    }

    public BooleanOptionBuilder setApplyHook(Consumer<ConfigState> consumer) {
        super.setApplyHook(consumer);
        return this;
    }

    public BooleanOptionBuilder setDefaultProvider(Function<ConfigState, Boolean> function, class01894 ... class01894Array) {
        super.setDefaultProvider(function, class01894Array);
        return this;
    }

    public BooleanOptionBuilder setImpact(OptionImpact optionImpact) {
        super.setImpact(optionImpact);
        return this;
    }

    public BooleanOptionBuilder setBinding(OptionBinding<Boolean> optionBinding) {
        super.setBinding(optionBinding);
        return this;
    }

    public BooleanOptionBuilder setBinding(Consumer<Boolean> consumer, Supplier<Boolean> supplier) {
        super.setBinding(consumer, supplier);
        return this;
    }

    public BooleanOptionBuilder setEnabledProvider(Function<ConfigState, Boolean> function, class01894 ... class01894Array) {
        super.setEnabledProvider((Function)function, class01894Array);
        return this;
    }

    public BooleanOptionBuilder setStorageHandler(StorageEventHandler storageEventHandler) {
        super.setStorageHandler(storageEventHandler);
        return this;
    }

    public BooleanOptionBuilder setDefaultValue(Boolean bl) {
        super.setDefaultValue(bl);
        return this;
    }

    public BooleanOptionBuilder setControlHiddenWhenDisabled(boolean bl) {
        super.setControlHiddenWhenDisabled(bl);
        return this;
    }

    public BooleanOptionBuilder setTooltip(class00392 class003922) {
        super.setTooltip(class003922);
        return this;
    }

    public BooleanOptionBuilder setTooltip(Function<Boolean, class00392> function) {
        super.setTooltip(function);
        return this;
    }
}

