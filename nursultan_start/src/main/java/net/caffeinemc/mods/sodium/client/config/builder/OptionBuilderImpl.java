/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Collection;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.value.ConstantValue;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.config.value.DynamicValue;
import org.apache.commons.lang3.Validate;

public abstract class OptionBuilderImpl<O extends Option>
implements OptionBuilder {
    final class01894 id;
    private O baseOption;
    private class00392 name;
    private DependentValue<Boolean> enabled;

    OptionBuilderImpl(class01894 class018942) {
        this.id = class018942;
    }

    class00392 getName() {
        return (class00392)this.getFirstNotNull(this.name, Option::getName);
    }

    @Override
    public OptionBuilder setName(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"Argument must not be null", (Object[])new Object[0]);
        this.name = class003922;
        return this;
    }

    abstract O build();

    @Override
    public OptionBuilder setEnabled(boolean bl) {
        this.enabled = new ConstantValue<Boolean>(bl);
        return this;
    }

    DependentValue<Boolean> getEnabled() {
        return (DependentValue)this.getFirstNotNull(this.enabled, Option::getEnabled);
    }

    void validateData() {
        Validate.notNull((Object)this.getName(), (String)"Name must be set", (Object[])new Object[0]);
        Validate.notBlank((CharSequence)this.getName().getString(), (String)"Name must not be blank", (Object[])new Object[0]);
    }

    abstract Class<O> getOptionClass();

    void prepareBuild() {
        this.validateData();
        if (this.getEnabled() == null) {
            this.enabled = new ConstantValue<Boolean>(true);
        }
    }

    public <V> V getFirstNotNull(V v, Function<O, V> function) {
        if (v != null) {
            return v;
        }
        if (this.baseOption != null) {
            return function.apply(this.baseOption);
        }
        return null;
    }

    Collection<class01894> getDependencies() {
        ObjectLinkedOpenHashSet objectLinkedOpenHashSet = new ObjectLinkedOpenHashSet();
        objectLinkedOpenHashSet.addAll(this.getEnabled().getDependencies());
        return objectLinkedOpenHashSet;
    }

    public O buildWithBaseOption(Option option) {
        Validate.isTrue((boolean)this.getOptionClass().isInstance(option), (String)"Base option must be of type %s", (Object[])new Object[]{this.getOptionClass().getSimpleName()});
        Option option2 = option;
        this.baseOption = option2;
        return this.build();
    }

    @Override
    public OptionBuilder setEnabledProvider(Function<ConfigState, Boolean> function, class01894 ... class01894Array) {
        Validate.notNull(function, (String)"Argument must not be null", (Object[])new Object[0]);
        this.enabled = new DynamicValue<Boolean>(function, class01894Array);
        return this;
    }
}

