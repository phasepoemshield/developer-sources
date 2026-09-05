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
import me.shedaniel.clothconfig2.gui.entries.FloatListListEntry$FloatListCell;
import minecraft.class00392;

public class FloatListListEntry
extends AbstractTextFieldListListEntry<Float, FloatListListEntry$FloatListCell, FloatListListEntry> {
    float minimum = Float.NEGATIVE_INFINITY;
    float maximum = Float.POSITIVE_INFINITY;

    @Deprecated
    public FloatListListEntry(class00392 class003922, List<Float> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Float>> consumer, Supplier<List<Float>> supplier2, class00392 class003923, boolean bl2, boolean bl3, boolean bl4) {
        super(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, bl3, bl4, FloatListListEntry$FloatListCell::new);
    }

    @Deprecated
    public FloatListListEntry(class00392 class003922, List<Float> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Float>> consumer, Supplier<List<Float>> supplier2, class00392 class003923, boolean bl2) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, true, true);
    }

    @Deprecated
    public FloatListListEntry(class00392 class003922, List<Float> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Float>> consumer, Supplier<List<Float>> supplier2, class00392 class003923) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, false);
    }

    @Override
    public FloatListListEntry self() {
        return this;
    }

    public FloatListListEntry setMinimum(float f) {
        this.minimum = f;
        return this;
    }

    public FloatListListEntry setMaximum(float f) {
        this.maximum = f;
        return this;
    }
}

