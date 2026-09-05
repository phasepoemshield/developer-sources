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

public class IntegerListEntry
extends AbstractNumberListEntry<Integer> {
    @Deprecated
    public IntegerListEntry(class00392 class003922, Integer n, class00392 class003923, Supplier<Integer> supplier, Consumer<Integer> consumer, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, n, class003923, supplier, supplier2, bl);
        this.saveCallback = consumer;
    }

    @Deprecated
    public IntegerListEntry(class00392 class003922, Integer n, class00392 class003923, Supplier<Integer> supplier, Consumer<Integer> consumer, Supplier<Optional<class00392[]>> supplier2) {
        this(class003922, n, class003923, supplier, consumer, supplier2, false);
    }

    @Deprecated
    public IntegerListEntry(class00392 class003922, Integer n, class00392 class003923, Supplier<Integer> supplier, Consumer<Integer> consumer) {
        super(class003922, n, class003923, supplier);
        this.saveCallback = consumer;
    }

    public Integer getValue() {
        try {
            return Integer.valueOf(this.textFieldWidget.method_1882());
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public IntegerListEntry setMinimum(int n) {
        this.minimum = n;
        return this;
    }

    public IntegerListEntry setMaximum(int n) {
        this.maximum = n;
        return this;
    }

    public Optional<class00392> getError() {
        try {
            int n = Integer.parseInt(this.textFieldWidget.method_1882());
            if (n > (Integer)this.maximum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_large", (Object[])new Object[]{this.maximum}));
            }
            if (n < (Integer)this.minimum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_small", (Object[])new Object[]{this.minimum}));
            }
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.of(class00392.L((String)"text.cloth-config.error.not_valid_number_int"));
        }
        return super.getError();
    }

    @Override
    protected Map.Entry<Integer, Integer> getDefaultRange() {
        return new AbstractMap.SimpleEntry<Integer, Integer>(-2147483647, Integer.MAX_VALUE);
    }
}

