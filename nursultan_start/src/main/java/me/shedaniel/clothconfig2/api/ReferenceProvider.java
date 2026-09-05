/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.api;

import me.shedaniel.clothconfig2.api.AbstractConfigEntry;

public interface ReferenceProvider<T> {
    public AbstractConfigEntry<T> provideReferenceEntry();
}

