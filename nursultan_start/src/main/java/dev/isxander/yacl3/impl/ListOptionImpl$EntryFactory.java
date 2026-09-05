/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.ListOptionEntry
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.ListOptionEntry;
import dev.isxander.yacl3.impl.ListOptionEntryImpl;
import dev.isxander.yacl3.impl.ListOptionImpl;
import java.util.function.Function;

class ListOptionImpl$EntryFactory {
    private final Function<ListOptionEntry<T>, Controller<T>> controllerFunction;
    final /* synthetic */ ListOptionImpl this$0;

    public ListOptionEntry<T> create(T t) {
        return new ListOptionEntryImpl(this.this$0, t, this.controllerFunction);
    }

    ListOptionImpl$EntryFactory(ListOptionImpl listOptionImpl, Function<ListOptionEntry<T>, Controller<T>> function) {
        this.this$0 = listOptionImpl;
        this.controllerFunction = function;
    }
}

