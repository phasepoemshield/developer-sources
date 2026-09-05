/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.impl.serializer.InternalDeserializerFunction
 */
package squeek.appleskin.shadowed.blue.endless.jankson.api;

import squeek.appleskin.shadowed.blue.endless.jankson.api.DeserializationException;
import squeek.appleskin.shadowed.blue.endless.jankson.api.Marshaller;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.serializer.InternalDeserializerFunction;

@FunctionalInterface
public interface DeserializerFunction<A, B>
extends InternalDeserializerFunction<B> {
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

