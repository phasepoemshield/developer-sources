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

public class LongConfigEntry
extends AbstractRangedConfigEntry<Long> {
    public LongConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<Long> valueSerializer, String[] stringArray, String string, Long l, @Nullable Long l2, @Nullable Long l3) {
        super(commentedPropertyConfig, valueSerializer, stringArray, string, (Object)l, (Object)l2, (Object)l3);
        this.reload();
    }

    @Nonnull
    Long minimumPossibleValue() {
        return Long.MIN_VALUE;
    }

    @Nonnull
    Long maximumPossibleValue() {
        return Long.MAX_VALUE;
    }

    Long fixValue(Long l) {
        return Math.max(Math.min(l, (Long)this.max), (Long)this.min);
    }
}

