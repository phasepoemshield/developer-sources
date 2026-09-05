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

public class IntegerConfigEntry
extends AbstractRangedConfigEntry<Integer> {
    public IntegerConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<Integer> valueSerializer, String[] stringArray, String string, Integer n, @Nullable Integer n2, @Nullable Integer n3) {
        super(commentedPropertyConfig, valueSerializer, stringArray, string, (Object)n, (Object)n2, (Object)n3);
        this.reload();
    }

    @Nonnull
    Integer minimumPossibleValue() {
        return Integer.MIN_VALUE;
    }

    @Nonnull
    Integer maximumPossibleValue() {
        return Integer.MAX_VALUE;
    }

    Integer fixValue(Integer n) {
        return Math.max(Math.min(n, (Integer)this.max), (Integer)this.min);
    }
}

