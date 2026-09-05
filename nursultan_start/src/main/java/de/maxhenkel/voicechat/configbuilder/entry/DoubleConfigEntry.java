/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry;

import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.entry.AbstractRangedConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class DoubleConfigEntry
extends AbstractRangedConfigEntry<Double> {
    public DoubleConfigEntry(CommentedPropertyConfig commentedPropertyConfig, ValueSerializer<Double> valueSerializer, String[] stringArray, String string, Double d, @Nullable Double d2, @Nullable Double d3) {
        super(commentedPropertyConfig, valueSerializer, stringArray, string, d, d2, d3);
        this.reload();
    }

    @Override
    @Nonnull
    Double minimumPossibleValue() {
        return Double.MIN_VALUE;
    }

    @Override
    @Nonnull
    Double maximumPossibleValue() {
        return Double.MAX_VALUE;
    }

    @Override
    Double fixValue(Double d) {
        return Math.max(Math.min(d, (Double)this.max), (Double)this.min);
    }
}

