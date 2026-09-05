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

public class DoubleListEntry
extends AbstractNumberListEntry<Double> {
    @Deprecated
    public DoubleListEntry(class00392 class003922, Double d, class00392 class003923, Supplier<Double> supplier, Consumer<Double> consumer, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, d, class003923, supplier, supplier2, bl);
        this.saveCallback = consumer;
    }

    @Deprecated
    public DoubleListEntry(class00392 class003922, Double d, class00392 class003923, Supplier<Double> supplier, Consumer<Double> consumer, Supplier<Optional<class00392[]>> supplier2) {
        this(class003922, d, class003923, supplier, consumer, supplier2, false);
    }

    @Deprecated
    public DoubleListEntry(class00392 class003922, Double d, class00392 class003923, Supplier<Double> supplier, Consumer<Double> consumer) {
        super(class003922, d, class003923, supplier);
        this.saveCallback = consumer;
    }

    public Double getValue() {
        try {
            return Double.valueOf(this.textFieldWidget.method_1882());
        }
        catch (Exception exception) {
            return 0.0;
        }
    }

    public DoubleListEntry setMinimum(double d) {
        this.minimum = d;
        return this;
    }

    public DoubleListEntry setMaximum(double d) {
        this.maximum = d;
        return this;
    }

    public Optional<class00392> getError() {
        try {
            double d = Double.parseDouble(this.textFieldWidget.method_1882());
            if (d > (Double)this.maximum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_large", (Object[])new Object[]{this.maximum}));
            }
            if (d < (Double)this.minimum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_small", (Object[])new Object[]{this.minimum}));
            }
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.of(class00392.L((String)"text.cloth-config.error.not_valid_number_double"));
        }
        return super.getError();
    }

    @Override
    protected Map.Entry<Double, Double> getDefaultRange() {
        return new AbstractMap.SimpleEntry<Double, Double>(-1.7976931348623157E308, (Double)Double.MAX_VALUE);
    }
}

