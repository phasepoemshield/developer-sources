/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializationException;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.Marshaller;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer.InternalDeserializerFunction;

@FunctionalInterface
public interface DeserializerFunction<A, B>
extends InternalDeserializerFunction<B> {
    @Override
    default public B deserialize(Object object, Marshaller marshaller) throws DeserializationException {
        try {
            return this.apply(object, marshaller);
        }
        catch (ClassCastException classCastException) {
            throw new DeserializationException(classCastException);
        }
    }

    public B apply(A var1, Marshaller var2) throws DeserializationException;
}

