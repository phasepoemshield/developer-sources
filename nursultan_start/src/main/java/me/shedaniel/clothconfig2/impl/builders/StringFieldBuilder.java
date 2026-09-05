/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.StringListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.StringListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractFieldBuilder;
import minecraft.class00392;

public class StringFieldBuilder
extends AbstractFieldBuilder<String, StringListEntry, StringFieldBuilder> {
    public StringFieldBuilder(class00392 class003922, class00392 class003923, String string) {
        super(class003922, class003923);
        Objects.requireNonNull(string);
        this.value = string;
    }

    @Override
    public StringListEntry build() {
        StringListEntry stringListEntry = new StringListEntry(this.getFieldNameKey(), (String)this.value, this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), null, this.isRequireRestart());
        stringListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(stringListEntry.getValue()));
        if (this.errorSupplier != null) {
            stringListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(stringListEntry.getValue()));
        }
        return this.finishBuilding(stringListEntry);
    }

    @Override
    public StringFieldBuilder setDefaultValue(String string) {
        return (StringFieldBuilder)super.setDefaultValue(string);
    }

    @Override
    public StringFieldBuilder setDefaultValue(Supplier<String> supplier) {
        return (StringFieldBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public StringFieldBuilder setSaveConsumer(Consumer<String> consumer) {
        return (StringFieldBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public StringFieldBuilder setTooltip(class00392 ... class00392Array) {
        return (StringFieldBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public StringFieldBuilder setTooltip(Optional<class00392[]> optional) {
        return (StringFieldBuilder)super.setTooltip(optional);
    }

    @Override
    public StringFieldBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (StringFieldBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public StringFieldBuilder setTooltipSupplier(Function<String, Optional<class00392[]>> function) {
        return (StringFieldBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public StringFieldBuilder setErrorSupplier(Function<String, Optional<class00392>> function) {
        return (StringFieldBuilder)super.setErrorSupplier(function);
    }

    @Override
    public StringFieldBuilder requireRestart() {
        return (StringFieldBuilder)super.requireRestart();
    }
}

