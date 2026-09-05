/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry.serializer;

import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nullable;

public class FloatSerializer
implements ValueSerializer<Float> {
    public static final FloatSerializer INSTANCE = new FloatSerializer();

    @Override
    @Nullable
    public Float deserialize(String string) {
        try {
            return Float.valueOf(Float.parseFloat(string));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    @Override
    @Nullable
    public String serialize(Float f) {
        return String.valueOf(f);
    }
}

