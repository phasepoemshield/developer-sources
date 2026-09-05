/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializerFunction
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.Marshaller
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.MarshallerImpl
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializerFunction;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.Marshaller;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.MarshallerImpl;

public class Jankson$Builder {
    MarshallerImpl marshaller = new MarshallerImpl();

    public <T> Jankson$Builder registerSerializer(Class<T> clazz, BiFunction<T, Marshaller, JsonElement> biFunction) {
        this.marshaller.registerSerializer(clazz, biFunction);
        return this;
    }

    public Jankson build() {
        Jankson jankson = new Jankson(this, null);
        Jankson.access$402((Jankson)jankson, (Marshaller)this.marshaller);
        return jankson;
    }

    @Deprecated
    public <T> Jankson$Builder registerTypeAdapter(Class<T> clazz, Function<JsonObject, T> function) {
        this.marshaller.registerTypeAdapter(clazz, function);
        return this;
    }

    @Deprecated
    public <T> Jankson$Builder registerPrimitiveTypeAdapter(Class<T> clazz, Function<Object, T> function) {
        this.marshaller.register(clazz, function);
        return this;
    }

    public <A, B> Jankson$Builder registerDeserializer(Class<A> clazz, Class<B> clazz2, DeserializerFunction<A, B> deserializerFunction) {
        this.marshaller.registerDeserializer(clazz, clazz2, deserializerFunction);
        return this;
    }

    public <T> Jankson$Builder registerTypeFactory(Class<T> clazz, Supplier<T> supplier) {
        this.marshaller.registerTypeFactory(clazz, supplier);
        return this;
    }
}

