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

public class LongListEntry
extends AbstractNumberListEntry<Long> {
    @Deprecated
    public LongListEntry(class00392 class003922, Long l, class00392 class003923, Supplier<Long> supplier, Consumer<Long> consumer, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, l, class003923, supplier, supplier2, bl);
        this.saveCallback = consumer;
    }

    @Deprecated
    public LongListEntry(class00392 class003922, Long l, class00392 class003923, Supplier<Long> supplier, Consumer<Long> consumer, Supplier<Optional<class00392[]>> supplier2) {
        this(class003922, l, class003923, supplier, consumer, supplier2, false);
    }

    @Deprecated
    public LongListEntry(class00392 class003922, Long l, class00392 class003923, Supplier<Long> supplier, Consumer<Long> consumer) {
        super(class003922, l, class003923, supplier);
        this.saveCallback = consumer;
    }

    public Long getValue() {
        try {
            return Long.valueOf(this.textFieldWidget.method_1882());
        }
        catch (Exception exception) {
            return 0L;
        }
    }

    public LongListEntry setMinimum(long l) {
        this.minimum = l;
        return this;
    }

    public LongListEntry setMaximum(long l) {
        this.maximum = l;
        return this;
    }

    public Optional<class00392> getError() {
        try {
            long l = Long.parseLong(this.textFieldWidget.method_1882());
            if (l > (Long)this.maximum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_large", (Object[])new Object[]{this.maximum}));
            }
            if (l < (Long)this.minimum) {
                return Optional.of(class00392.N((String)"text.cloth-config.error.too_small", (Object[])new Object[]{this.minimum}));
            }
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.of(class00392.L((String)"text.cloth-config.error.not_valid_number_long"));
        }
        return super.getError();
    }

    @Override
    protected Map.Entry<Long, Long> getDefaultRange() {
        return new AbstractMap.SimpleEntry<Long, Long>(-9223372036854775807L, Long.MAX_VALUE);
    }
}

