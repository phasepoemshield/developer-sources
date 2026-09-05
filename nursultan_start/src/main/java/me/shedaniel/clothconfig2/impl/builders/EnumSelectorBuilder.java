/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.EnumListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.EnumListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractFieldBuilder;
import minecraft.class00392;

public class EnumSelectorBuilder<T extends Enum<?>>
extends AbstractFieldBuilder<T, EnumListEntry<T>, EnumSelectorBuilder<T>> {
    private final Class<T> clazz;
    private Function<Enum, class00392> enumNameProvider = EnumListEntry.DEFAULT_NAME_PROVIDER;

    public EnumSelectorBuilder(class00392 class003922, class00392 class003923, Class<T> clazz, T t) {
        super(class003922, class003923);
        Objects.requireNonNull(clazz);
        Objects.requireNonNull(t);
        this.value = t;
        this.clazz = clazz;
    }

    @Override
    public EnumListEntry<T> build() {
        EnumListEntry enumListEntry = new EnumListEntry(this.getFieldNameKey(), this.clazz, (Enum)this.value, this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), this.enumNameProvider, null, this.isRequireRestart());
        enumListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply((Enum)enumListEntry.getValue()));
        if (this.errorSupplier != null) {
            enumListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply((Enum)enumListEntry.getValue()));
        }
        return this.finishBuilding(enumListEntry);
    }

    @Override
    public EnumSelectorBuilder<T> setDefaultValue(T t) {
        Objects.requireNonNull(t);
        this.defaultValue = () -> t;
        return this;
    }

    @Override
    public EnumSelectorBuilder<T> setDefaultValue(Supplier<T> supplier) {
        return (EnumSelectorBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public EnumSelectorBuilder<T> setSaveConsumer(Consumer<T> consumer) {
        return (EnumSelectorBuilder)super.setSaveConsumer(consumer);
    }

    public EnumSelectorBuilder<T> setEnumNameProvider(Function<Enum, class00392> function) {
        Objects.requireNonNull(function);
        this.enumNameProvider = function;
        return this;
    }

    @Override
    public EnumSelectorBuilder<T> setTooltip(Optional<class00392[]> optional) {
        return (EnumSelectorBuilder)super.setTooltip(optional);
    }

    @Override
    public EnumSelectorBuilder<T> setTooltip(class00392 ... class00392Array) {
        return (EnumSelectorBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public EnumSelectorBuilder<T> setTooltipSupplier(Function<T, Optional<class00392[]>> function) {
        return (EnumSelectorBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public EnumSelectorBuilder<T> setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (EnumSelectorBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public EnumSelectorBuilder<T> setErrorSupplier(Function<T, Optional<class00392>> function) {
        return (EnumSelectorBuilder)super.setErrorSupplier(function);
    }

    @Override
    public EnumSelectorBuilder<T> requireRestart() {
        return (EnumSelectorBuilder)super.requireRestart();
    }
}

