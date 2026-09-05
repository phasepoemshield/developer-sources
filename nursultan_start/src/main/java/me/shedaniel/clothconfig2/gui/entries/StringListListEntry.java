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
import me.shedaniel.clothconfig2.gui.entries.StringListListEntry$StringListCell;
import minecraft.class00392;

public class StringListListEntry
extends AbstractTextFieldListListEntry<String, StringListListEntry$StringListCell, StringListListEntry> {
    @Deprecated
    public StringListListEntry(class00392 class003922, List<String> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<String>> consumer, Supplier<List<String>> supplier2, class00392 class003923, boolean bl2, boolean bl3, boolean bl4) {
        super(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, bl3, bl4, StringListListEntry$StringListCell::new);
    }

    @Deprecated
    public StringListListEntry(class00392 class003922, List<String> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<String>> consumer, Supplier<List<String>> supplier2, class00392 class003923, boolean bl2) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, true, true);
    }

    @Deprecated
    public StringListListEntry(class00392 class003922, List<String> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<String>> consumer, Supplier<List<String>> supplier2, class00392 class003923) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, false);
    }

    @Override
    public StringListListEntry self() {
        return this;
    }
}

