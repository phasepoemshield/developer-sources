/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.impl.ListOptionImpl$BuilderImpl
 */
package dev.isxander.yacl3.api;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ListOption$Builder;
import dev.isxander.yacl3.api.ListOptionEntry;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.impl.ListOptionImpl;
import java.util.List;

public interface ListOption<T>
extends Option<List<T>>,
OptionGroup {
    public void removeEntry(ListOptionEntry<?> var1);

    public ImmutableList<ListOptionEntry<T>> options();

    public int indexOf(ListOptionEntry<?> var1);

    public static <T> ListOption$Builder<T> createBuilder() {
        return new ListOptionImpl.BuilderImpl();
    }

    @Deprecated
    public static <T> ListOption$Builder<T> createBuilder(Class<T> clazz) {
        return ListOption.createBuilder();
    }

    public int minimumNumberOfEntries();

    public int maximumNumberOfEntries();

    public int numberOfEntries();

    public ListOptionEntry<T> insertNewEntry();

    public void addRefreshListener(Runnable var1);

    public void insertEntry(int var1, ListOptionEntry<?> var2);
}

