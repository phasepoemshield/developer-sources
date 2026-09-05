/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry.serializer;

import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nullable;

public class IntegerSerializer
implements ValueSerializer<Integer> {
    public static final IntegerSerializer INSTANCE = new IntegerSerializer();

    @Override
    @Nullable
    public Integer deserialize(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    @Override
    @Nullable
    public String serialize(Integer n) {
        return String.valueOf(n);
    }
}

