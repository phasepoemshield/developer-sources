/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder.entry.serializer;

import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import javax.annotation.Nullable;

public class EnumSerializer<E extends Enum<E>>
implements ValueSerializer<E> {
    protected Class<E> enumClass;

    @Override
    @Nullable
    public E deserialize(String string) {
        try {
            return Enum.valueOf(this.enumClass, string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public EnumSerializer(Class<E> clazz) {
        this.enumClass = clazz;
    }

    @Override
    @Nullable
    public String serialize(E e) {
        return ((Enum)e).name();
    }
}

