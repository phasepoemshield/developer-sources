/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer;

import java.util.HashMap;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonArray;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonGrammar;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonPrimitive;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializationException;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.Marshaller;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer.DeserializerFunctionPool$FunctionMatchFailedException;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer.InternalDeserializerFunction;

public class DeserializerFunctionPool<B> {
    private Class<B> targetClass;
    private HashMap<Class<?>, InternalDeserializerFunction<B>> values = new HashMap();

    public InternalDeserializerFunction<B> getFunction(Class<?> clazz) {
        return this.values.get(clazz);
    }

    public DeserializerFunctionPool(Class<B> clazz) {
        this.targetClass = clazz;
    }

    public B apply(JsonElement jsonElement, Marshaller marshaller) throws DeserializationException, DeserializerFunctionPool$FunctionMatchFailedException {
        InternalDeserializerFunction<B> internalDeserializerFunction = null;
        if (jsonElement instanceof JsonPrimitive) {
            Object object = ((JsonPrimitive)jsonElement).getValue();
            internalDeserializerFunction = this.values.get(object.getClass());
            if (internalDeserializerFunction != null) {
                return internalDeserializerFunction.deserialize(object, marshaller);
            }
            internalDeserializerFunction = this.values.get(JsonPrimitive.class);
            if (internalDeserializerFunction != null) {
                return internalDeserializerFunction.deserialize((JsonPrimitive)jsonElement, marshaller);
            }
        } else if (jsonElement instanceof JsonObject) {
            internalDeserializerFunction = this.values.get(JsonObject.class);
            if (internalDeserializerFunction != null) {
                return internalDeserializerFunction.deserialize((JsonObject)jsonElement, marshaller);
            }
        } else if (jsonElement instanceof JsonArray && (internalDeserializerFunction = this.values.get(JsonArray.class)) != null) {
            return internalDeserializerFunction.deserialize((JsonArray)jsonElement, marshaller);
        }
        if ((internalDeserializerFunction = this.values.get(JsonElement.class)) != null) {
            return internalDeserializerFunction.deserialize(jsonElement, marshaller);
        }
        throw new DeserializerFunctionPool$FunctionMatchFailedException("Couldn't find a deserializer in class '" + this.targetClass.getCanonicalName() + "' to unpack element '" + jsonElement.toJson(JsonGrammar.JSON5) + "'.");
    }

    public void registerUnsafe(Class<?> clazz, InternalDeserializerFunction<B> internalDeserializerFunction) {
        this.values.put(clazz, internalDeserializerFunction);
    }
}

