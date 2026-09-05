/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.TextFieldListEntry;
import minecraft.class00392;

public class StringListEntry
extends TextFieldListEntry<String> {
    @Deprecated
    public StringListEntry(class00392 class003922, String string, class00392 class003923, Supplier<String> supplier, Consumer<String> consumer, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, string, class003923, supplier, supplier2, bl);
        this.saveCallback = consumer;
    }

    @Deprecated
    public StringListEntry(class00392 class003922, String string, class00392 class003923, Supplier<String> supplier, Consumer<String> consumer, Supplier<Optional<class00392[]>> supplier2) {
        this(class003922, string, class003923, supplier, consumer, supplier2, false);
    }

    @Deprecated
    public StringListEntry(class00392 class003922, String string, class00392 class003923, Supplier<String> supplier, Consumer<String> consumer) {
        super(class003922, string, class003923, supplier);
        this.saveCallback = consumer;
    }

    public String getValue() {
        return this.textFieldWidget.method_1882();
    }
}

