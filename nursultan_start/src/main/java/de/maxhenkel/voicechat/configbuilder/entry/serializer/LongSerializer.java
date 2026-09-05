/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry.serializer;

import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nullable;

public class LongSerializer
implements ValueSerializer<Long> {
    public static final LongSerializer INSTANCE = new LongSerializer();

    @Override
    @Nullable
    public Long deserialize(String string) {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    @Override
    @Nullable
    public String serialize(Long l) {
        return String.valueOf(l);
    }
}

