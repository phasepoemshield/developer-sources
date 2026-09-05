/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializationException;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.Marshaller;

@FunctionalInterface
public interface InternalDeserializerFunction<B> {
    public B deserialize(Object var1, Marshaller var2) throws DeserializationException;
}

