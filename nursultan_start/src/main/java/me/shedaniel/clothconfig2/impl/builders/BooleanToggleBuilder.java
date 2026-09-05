/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.BooleanListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.BooleanListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractFieldBuilder;
import me.shedaniel.clothconfig2.impl.builders.BooleanToggleBuilder$1;
import minecraft.class00392;

public class BooleanToggleBuilder
extends AbstractFieldBuilder<Boolean, BooleanListEntry, BooleanToggleBuilder> {
    Function<Boolean, class00392> yesNoTextSupplier = null;

    public BooleanToggleBuilder(class00392 class003922, class00392 class003923, boolean bl) {
        super(class003922, class003923);
        this.value = bl;
    }

    @Override
    public BooleanListEntry build() {
        BooleanToggleBuilder$1 booleanToggleBuilder$1 = new BooleanToggleBuilder$1(this, this.getFieldNameKey(), (Boolean)this.value, this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), null, this.isRequireRestart());
        booleanToggleBuilder$1.setTooltipSupplier(() -> this.getTooltipSupplier().apply(booleanToggleBuilder$1.getValue()));
        if (this.errorSupplier != null) {
            booleanToggleBuilder$1.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(booleanToggleBuilder$1.getValue()));
        }
        return this.finishBuilding(booleanToggleBuilder$1);
    }

    @Override
    public BooleanToggleBuilder setDefaultValue(boolean bl) {
        this.defaultValue = () -> bl;
        return this;
    }

    @Override
    public BooleanToggleBuilder setDefaultValue(Supplier<Boolean> supplier) {
        return (BooleanToggleBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public BooleanToggleBuilder setSaveConsumer(Consumer<Boolean> consumer) {
        return (BooleanToggleBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public BooleanToggleBuilder setTooltip(class00392 ... class00392Array) {
        return (BooleanToggleBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public BooleanToggleBuilder setTooltip(Optional<class00392[]> optional) {
        return (BooleanToggleBuilder)super.setTooltip(optional);
    }

    @Override
    public BooleanToggleBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (BooleanToggleBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public BooleanToggleBuilder setTooltipSupplier(Function<Boolean, Optional<class00392[]>> function) {
        return (BooleanToggleBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public BooleanToggleBuilder setErrorSupplier(Function<Boolean, Optional<class00392>> function) {
        return (BooleanToggleBuilder)super.setErrorSupplier(function);
    }

    @Override
    public BooleanToggleBuilder requireRestart() {
        return (BooleanToggleBuilder)super.requireRestart();
    }

    public BooleanToggleBuilder setYesNoTextSupplier(Function<Boolean, class00392> function) {
        this.yesNoTextSupplier = function;
        return this;
    }

    public Function<Boolean, class00392> getYesNoTextSupplier() {
        return this.yesNoTextSupplier;
    }
}

