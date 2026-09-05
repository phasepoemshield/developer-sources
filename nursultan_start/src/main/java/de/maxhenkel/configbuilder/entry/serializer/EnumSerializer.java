/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.configbuilder.entry.serializer.ValueSerializer
 *  javax.annotation.Nullable
 */
package de.maxhenkel.configbuilder.entry.serializer;

import de.maxhenkel.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nullable;

public class EnumSerializer<E extends Enum<E>>
implements ValueSerializer<E> {
    protected Class<E> enumClass;

    public EnumSerializer(Class<E> enumClass) {
        this.enumClass = enumClass;
    }

    @Nullable
    public E deserialize(String str) {
        try {
            return Enum.valueOf(this.enumClass, str);
        }
        catch (Exception e) {
            return null;
        }
    }

    @Nullable
    public String serialize(E val) {
        return ((Enum)val).name();
    }
}

