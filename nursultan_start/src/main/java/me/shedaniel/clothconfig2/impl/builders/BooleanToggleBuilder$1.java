/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.BooleanListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.BooleanListEntry;
import me.shedaniel.clothconfig2.impl.builders.BooleanToggleBuilder;
import minecraft.class00392;

class BooleanToggleBuilder$1
extends BooleanListEntry {
    final /* synthetic */ BooleanToggleBuilder this$0;

    BooleanToggleBuilder$1(BooleanToggleBuilder booleanToggleBuilder, class00392 class003922, boolean bl, class00392 class003923, Supplier supplier, Consumer consumer, Supplier supplier2, boolean bl2) {
        this.this$0 = booleanToggleBuilder;
        super(class003922, bl, class003923, supplier, consumer, supplier2, bl2);
    }

    public class00392 getYesNoText(boolean bl) {
        if (this.this$0.yesNoTextSupplier == null) {
            return super.getYesNoText(bl);
        }
        return this.this$0.yesNoTextSupplier.apply(bl);
    }
}

