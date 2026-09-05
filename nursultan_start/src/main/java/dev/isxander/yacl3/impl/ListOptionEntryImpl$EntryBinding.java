/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.OptionEventListener$Event
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.impl.ListOptionEntryImpl;

class ListOptionEntryImpl$EntryBinding
implements Binding<T> {
    final /* synthetic */ ListOptionEntryImpl this$0;

    ListOptionEntryImpl$EntryBinding(ListOptionEntryImpl listOptionEntryImpl) {
        this.this$0 = listOptionEntryImpl;
    }

    public T getValue() {
        return this.this$0.value;
    }

    public T defaultValue() {
        throw new UnsupportedOperationException();
    }

    public void setValue(T t) {
        this.this$0.value = t;
        this.this$0.group.triggerListener(OptionEventListener.Event.OTHER, true);
    }
}

