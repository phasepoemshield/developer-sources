/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig
 *  de.maxhenkel.voicechat.configbuilder.entry.AbstractRangedConfigEntry
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry;

import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.entry.AbstractRangedConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class FloatConfigEntry
extends AbstractRangedConfigEntry<Float> {
    public FloatConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<Float> valueSerializer, String[] stringArray, String string, Float f, @Nullable Float f2, @Nullable Float f3) {
        super(commentedPropertyConfig, valueSerializer, stringArray, string, (Object)f, (Object)f2, (Object)f3);
        this.reload();
    }

    @Nonnull
    Float minimumPossibleValue() {
        return Float.valueOf(Float.MIN_VALUE);
    }

    @Nonnull
    Float maximumPossibleValue() {
        return Float.valueOf(Float.MAX_VALUE);
    }

    Float fixValue(Float f) {
        return Float.valueOf(Math.max(Math.min(f.floatValue(), ((Float)this.max).floatValue()), ((Float)this.min).floatValue()));
    }
}

