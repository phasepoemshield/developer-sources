/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry;
import me.shedaniel.clothconfig2.gui.entries.LongListListEntry$LongListCell;
import minecraft.class00392;

public class LongListListEntry
extends AbstractTextFieldListListEntry<Long, LongListListEntry$LongListCell, LongListListEntry> {
    long minimum = Long.MIN_VALUE;
    long maximum = Long.MAX_VALUE;

    @Deprecated
    public LongListListEntry(class00392 class003922, List<Long> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Long>> consumer, Supplier<List<Long>> supplier2, class00392 class003923, boolean bl2, boolean bl3, boolean bl4) {
        super(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, bl3, bl4, LongListListEntry$LongListCell::new);
    }

    @Deprecated
    public LongListListEntry(class00392 class003922, List<Long> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Long>> consumer, Supplier<List<Long>> supplier2, class00392 class003923, boolean bl2) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, true, true);
    }

    @Deprecated
    public LongListListEntry(class00392 class003922, List<Long> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Long>> consumer, Supplier<List<Long>> supplier2, class00392 class003923) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, false);
    }

    @Override
    public LongListListEntry self() {
        return this;
    }

    public LongListListEntry setMinimum(long l) {
        this.minimum = l;
        return this;
    }

    public LongListListEntry setMaximum(long l) {
        this.maximum = l;
        return this;
    }
}

