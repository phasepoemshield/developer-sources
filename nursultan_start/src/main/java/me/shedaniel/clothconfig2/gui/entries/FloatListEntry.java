/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.AbstractNumberListEntry;
import minecraft.class00392;

public class FloatListEntry
extends AbstractNumberListEntry<Float> {
    @Deprecated
    public FloatListEntry(class00392 class003922, Float f, class00392 class003923, Supplier<Float> supplier, Consumer<Float> consumer, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, f, class003923, supplier, supplier2, bl);
        this.saveCallback = consumer;
    }

    @Deprecated
    public FloatListEntry(class00392 class003922, Float f, class00392 class003923, Supplier<Float> supplier, Consumer<Float> consumer, Supplier<Optional<class00392[]>> supplier2) {
        this(class003922, f, class003923, supplier, consumer, supplier2, false);
    }

    @Deprecated
    public FloatListEntry(class00392 class003922, Float f, class00392 class003923, Supplier<Float> supplier, Consumer<Float> consumer) {
        super(class003922, f, class003923, supplier);
        this.saveCallback = consumer;
    }

    public Float getValue() {
        try {
            return Float.valueOf(this.textFieldWidget.method_1882());
        }
        catch (Exception exception) {
            return Float.valueOf(0.0f);
        }
    }

    public FloatListEntry setMinimum(float f) {
        this.minimum = Float.valueOf(f);
        return this;
    }

    public FloatListEntry setMaximum(float f) {
        this.maximum = Float.valueOf(f);
        return this;
    }

    public Optional<class00392> getError() {
        try {
            float f = Float.parseFloat(this.textFieldWidget.method_1882());
            if (f > ((Float)this.maximum).floatValue()) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_large", (Object[])new Object[]{this.maximum}));
            }
            if (f < ((Float)this.minimum).floatValue()) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_small", (Object[])new Object[]{this.minimum}));
            }
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.of(class00392.L((String)"text.cloth-config.error.not_valid_number_float"));
        }
        return super.getError();
    }

    @Override
    protected Map.Entry<Float, Float> getDefaultRange() {
        return new AbstractMap.SimpleEntry<Float, Float>(Float.valueOf(-3.4028235E38f), Float.valueOf(Float.MAX_VALUE));
    }
}

