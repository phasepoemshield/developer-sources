/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry.serializer;

import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nullable;

public class DoubleSerializer
implements ValueSerializer<Double> {
    public static final DoubleSerializer INSTANCE = new DoubleSerializer();

    @Override
    @Nullable
    public Double deserialize(String string) {
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    @Override
    @Nullable
    public String serialize(Double d) {
        return String.valueOf(d);
    }
}

