/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.DeserializationException
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.Marshaller
 */
package squeek.appleskin.shadowed.blue.endless.jankson.impl.serializer;

import squeek.appleskin.shadowed.blue.endless.jankson.api.DeserializationException;
import squeek.appleskin.shadowed.blue.endless.jankson.api.Marshaller;

@FunctionalInterface
public interface InternalDeserializerFunction<B> {
    public B deserialize(Object var1, Marshaller var2) throws DeserializationException;
}

