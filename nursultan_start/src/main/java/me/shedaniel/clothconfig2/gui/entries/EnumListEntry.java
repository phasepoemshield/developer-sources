/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.SelectionListEntry;
import me.shedaniel.clothconfig2.gui.entries.SelectionListEntry$Translatable;
import minecraft.class00392;

public class EnumListEntry<T extends Enum<?>>
extends SelectionListEntry<T> {
    public static final Function<Enum, class00392> DEFAULT_NAME_PROVIDER = enum_ -> class00392.L((String)(enum_ instanceof SelectionListEntry$Translatable ? ((SelectionListEntry$Translatable)((Object)enum_)).getKey() : enum_.toString()));

    @Deprecated
    public EnumListEntry(class00392 class003922, Class<T> clazz, T t, class00392 class003923, Supplier<T> supplier, Consumer<T> consumer, Function<Enum, class00392> function, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, (Enum[])clazz.getEnumConstants(), t, class003923, supplier, consumer, function::apply, supplier2, bl);
    }

    @Deprecated
    public EnumListEntry(class00392 class003922, Class<T> clazz, T t, class00392 class003923, Supplier<T> supplier, Consumer<T> consumer, Function<Enum, class00392> function, Supplier<Optional<class00392[]>> supplier2) {
        super(class003922, (Enum[])clazz.getEnumConstants(), t, class003923, supplier, consumer, function::apply, supplier2, false);
    }

    @Deprecated
    public EnumListEntry(class00392 class003922, Class<T> clazz, T t, class00392 class003923, Supplier<T> supplier, Consumer<T> consumer, Function<Enum, class00392> function) {
        super(class003922, (Enum[])clazz.getEnumConstants(), t, class003923, supplier, consumer, function::apply, null);
    }

    @Deprecated
    public EnumListEntry(class00392 class003922, Class<T> clazz, T t, class00392 class003923, Supplier<T> supplier, Consumer<T> consumer) {
        super(class003922, (Enum[])clazz.getEnumConstants(), t, class003923, supplier, consumer, DEFAULT_NAME_PROVIDER::apply);
    }
}

