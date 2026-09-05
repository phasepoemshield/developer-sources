/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api;

import java.lang.reflect.Type;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializationException;

public interface Marshaller {
    public JsonElement serialize(Object var1);

    public <E> E marshall(Type var1, JsonElement var2);

    public <E> E marshall(Class<E> var1, JsonElement var2);

    public <E> E marshallCarefully(Class<E> var1, JsonElement var2) throws DeserializationException;
}

