/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.TextFieldListEntry;
import minecraft.class00392;

public abstract class AbstractNumberListEntry<T>
extends TextFieldListEntry<T> {
    private static final Function<String, String> stripCharacters = string -> {
        char[] cArray;
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : cArray = string.toCharArray()) {
            if (!Character.isDigit(c) && c != '-' && c != '.') continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    };
    protected T minimum;
    protected T maximum;

    @Deprecated
    protected AbstractNumberListEntry(class00392 class003922, T t, class00392 class003923, Supplier<T> supplier, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, t, class003923, supplier, supplier2, bl);
        this.applyDefaultRange();
    }

    @Deprecated
    protected AbstractNumberListEntry(class00392 class003922, T t, class00392 class003923, Supplier<T> supplier, Supplier<Optional<class00392[]>> supplier2) {
        super(class003922, t, class003923, supplier, supplier2);
        this.applyDefaultRange();
    }

    @Deprecated
    protected AbstractNumberListEntry(class00392 class003922, T t, class00392 class003923, Supplier<T> supplier) {
        super(class003922, t, class003923, supplier);
        this.applyDefaultRange();
    }

    private void applyDefaultRange() {
        Map.Entry<T, T> entry = this.getDefaultRange();
        if (entry != null) {
            this.minimum = entry.getKey();
            this.maximum = entry.getValue();
        }
    }

    protected abstract Map.Entry<T, T> getDefaultRange();

    @Override
    protected String stripAddText(String string) {
        return stripCharacters.apply(string);
    }
}

