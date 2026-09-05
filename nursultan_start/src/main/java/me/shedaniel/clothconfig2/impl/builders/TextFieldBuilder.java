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

public class TextFieldBuilder
extends AbstractFieldBuilder<String, StringListEntry, TextFieldBuilder> {
    public TextFieldBuilder(class00392 class003922, class00392 class003923, String string) {
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
    public TextFieldBuilder setDefaultValue(String string) {
        return (TextFieldBuilder)super.setDefaultValue(string);
    }

    @Override
    public TextFieldBuilder setDefaultValue(Supplier<String> supplier) {
        return (TextFieldBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public TextFieldBuilder setSaveConsumer(Consumer<String> consumer) {
        return (TextFieldBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public TextFieldBuilder setTooltip(class00392 ... class00392Array) {
        return (TextFieldBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public TextFieldBuilder setTooltip(Optional<class00392[]> optional) {
        return (TextFieldBuilder)super.setTooltip(optional);
    }

    @Override
    public TextFieldBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (TextFieldBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public TextFieldBuilder setTooltipSupplier(Function<String, Optional<class00392[]>> function) {
        return (TextFieldBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public TextFieldBuilder setErrorSupplier(Function<String, Optional<class00392>> function) {
        return (TextFieldBuilder)super.setErrorSupplier(function);
    }

    @Override
    public TextFieldBuilder requireRestart() {
        return (TextFieldBuilder)super.requireRestart();
    }
}

