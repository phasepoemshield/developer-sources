/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  javax.annotation.Nonnull
 */
package de.maxhenkel.voicechat.configbuilder.entry;

import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import javax.annotation.Nonnull;

public interface RangedConfigEntry<T>
extends ConfigEntry<T> {
    @Nonnull
    public T getMax();

    @Nonnull
    public T getMin();
}

