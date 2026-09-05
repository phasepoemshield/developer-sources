/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.RangedConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry;

import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.entry.AbstractConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.RangedConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class AbstractRangedConfigEntry<T>
extends AbstractConfigEntry<T>
implements RangedConfigEntry<T> {
    @Nonnull
    protected final T min;
    @Nonnull
    protected final T max;

    public AbstractRangedConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<T> valueSerializer, String[] stringArray, String string, T t, @Nullable T t2, @Nullable T t3) {
        super(commentedPropertyConfig, valueSerializer, stringArray, string, t);
        this.min = t2 != null ? t2 : this.minimumPossibleValue();
        this.max = t3 != null ? t3 : this.maximumPossibleValue();
    }

    @Nonnull
    public T getMax() {
        return this.max;
    }

    @Nonnull
    public T getMin() {
        return this.min;
    }

    @Nonnull
    abstract T minimumPossibleValue();

    @Nonnull
    abstract T maximumPossibleValue();
}

