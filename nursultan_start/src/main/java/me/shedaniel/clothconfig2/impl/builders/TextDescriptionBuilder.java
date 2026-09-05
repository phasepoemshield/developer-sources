/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.TextListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.TextListEntry;
import me.shedaniel.clothconfig2.impl.builders.FieldBuilder;
import minecraft.class00392;

public class TextDescriptionBuilder
extends FieldBuilder<class00392, TextListEntry, TextDescriptionBuilder> {
    private int color = -1;
    private Supplier<Optional<class00392[]>> tooltipSupplier = null;
    private final class00392 value;

    public TextDescriptionBuilder(class00392 class003922, class00392 class003923, class00392 class003924) {
        super(class003922, class003923);
        this.value = class003924;
    }

    @Override
    public TextListEntry build() {
        return this.finishBuilding(new TextListEntry(this.getFieldNameKey(), this.value, this.color, this.tooltipSupplier));
    }

    public TextDescriptionBuilder setColor(int n) {
        this.color = n;
        return this;
    }

    public TextDescriptionBuilder setTooltip(class00392 ... class00392Array) {
        this.tooltipSupplier = () -> Optional.ofNullable(class00392Array);
        return this;
    }

    public TextDescriptionBuilder setTooltip(Optional<class00392[]> optional) {
        this.tooltipSupplier = () -> optional;
        return this;
    }

    public TextDescriptionBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        this.tooltipSupplier = supplier;
        return this;
    }

    @Override
    public void requireRestart(boolean bl) {
        throw new UnsupportedOperationException();
    }
}

