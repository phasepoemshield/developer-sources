/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.ColorEntry
 *  minecraft.class00392
 *  minecraft.class05194
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.ColorEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractFieldBuilder;
import me.shedaniel.math.Color;
import minecraft.class00392;
import minecraft.class05194;

public class ColorFieldBuilder
extends AbstractFieldBuilder<Integer, ColorEntry, ColorFieldBuilder> {
    private boolean alpha = false;

    public ColorFieldBuilder(class00392 class003922, class00392 class003923, int n) {
        super(class003922, class003923);
        this.value = n;
    }

    @Override
    public ColorEntry build() {
        ColorEntry colorEntry = new ColorEntry(this.getFieldNameKey(), ((Integer)this.value).intValue(), this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), null, this.isRequireRestart());
        if (this.alpha) {
            colorEntry.withAlpha();
        } else {
            colorEntry.withoutAlpha();
        }
        colorEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(colorEntry.getValue()));
        if (this.errorSupplier != null) {
            colorEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(colorEntry.getValue()));
        }
        return this.finishBuilding(colorEntry);
    }

    @Override
    public ColorFieldBuilder setDefaultValue(Supplier<Integer> supplier) {
        return (ColorFieldBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public ColorFieldBuilder setDefaultValue(int n) {
        this.defaultValue = () -> n;
        return this;
    }

    @Override
    public ColorFieldBuilder setDefaultValue(class05194 class051942) {
        this.defaultValue = () -> Objects.requireNonNull(class051942).N();
        return this;
    }

    @Override
    public ColorFieldBuilder setSaveConsumer(Consumer<Integer> consumer) {
        return (ColorFieldBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public ColorFieldBuilder setTooltip(Optional<class00392[]> optional) {
        return (ColorFieldBuilder)super.setTooltip(optional);
    }

    @Override
    public ColorFieldBuilder setTooltip(class00392 ... class00392Array) {
        return (ColorFieldBuilder)super.setTooltip(class00392Array);
    }

    public ColorFieldBuilder setAlphaMode(boolean bl) {
        this.alpha = bl;
        return this;
    }

    @Override
    public ColorFieldBuilder setTooltipSupplier(Function<Integer, Optional<class00392[]>> function) {
        return (ColorFieldBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public ColorFieldBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (ColorFieldBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public ColorFieldBuilder setErrorSupplier(Function<Integer, Optional<class00392>> function) {
        return (ColorFieldBuilder)super.setErrorSupplier(function);
    }

    @Override
    public ColorFieldBuilder requireRestart() {
        return (ColorFieldBuilder)super.requireRestart();
    }

    public ColorFieldBuilder setSaveConsumer3(Consumer<class05194> consumer) {
        return (ColorFieldBuilder)super.setSaveConsumer((T n) -> consumer.accept(class05194.N((int)n)));
    }

    public ColorFieldBuilder setDefaultValue2(Supplier<Color> supplier) {
        this.defaultValue = () -> ((Color)supplier.get()).getColor();
        return this;
    }

    public ColorFieldBuilder setDefaultValue3(Supplier<class05194> supplier) {
        this.defaultValue = () -> ((class05194)supplier.get()).N();
        return this;
    }

    public ColorFieldBuilder setSaveConsumer2(Consumer<Color> consumer) {
        return (ColorFieldBuilder)super.setSaveConsumer((T n) -> consumer.accept(this.alpha ? Color.ofTransparent(n) : Color.ofOpaque(n)));
    }
}

