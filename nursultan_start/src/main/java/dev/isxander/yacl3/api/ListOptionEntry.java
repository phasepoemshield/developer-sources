/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package dev.isxander.yacl3.api;

import com.google.common.collect.ImmutableSet;
import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionFlag;

public interface ListOptionEntry<T>
extends Option<T> {
    @Override
    default public ImmutableSet<OptionFlag> flags() {
        return this.parentGroup().flags();
    }

    @Override
    default public boolean available() {
        return this.parentGroup().available();
    }

    public ListOption<T> parentGroup();
}

