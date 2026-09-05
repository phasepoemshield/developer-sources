/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry.serializer;

import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nullable;

public class BooleanSerializer
implements ValueSerializer<Boolean> {
    public static final BooleanSerializer INSTANCE = new BooleanSerializer();

    @Override
    @Nullable
    public Boolean deserialize(String string) {
        return Boolean.valueOf(string);
    }

    @Override
    @Nullable
    public String serialize(Boolean bl) {
        return String.valueOf(bl);
    }
}

