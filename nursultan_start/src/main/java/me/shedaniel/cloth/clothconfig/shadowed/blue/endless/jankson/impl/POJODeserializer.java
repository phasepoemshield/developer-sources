/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonArray;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonGrammar;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonNull;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonPrimitive;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Deserializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.SerializedName;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializationException;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.Marshaller;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer.DeserializerFunctionPool;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer.InternalDeserializerFunction;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.magic.TypeMagic;

public class POJODeserializer {
    @Nullable
    public static Object unpack(Type type, JsonElement jsonElement, Marshaller marshaller) {
        Class<?> clazz = TypeMagic.classForType(type);
        if (clazz.isPrimitive()) {
            return null;
        }
        if (jsonElement == null) {
            return null;
        }
        return null;
    }

    protected static <B> DeserializerFunctionPool<B> deserializersFor(Class<B> clazz) {
        DeserializerFunctionPool<B> deserializerFunctionPool = new DeserializerFunctionPool<B>(clazz);
        for (Method method : clazz.getDeclaredMethods()) {
            Class<?> clazz2;
            InternalDeserializerFunction<B> internalDeserializerFunction;
            Parameter[] parameterArray;
            if (method.getAnnotation(Deserializer.class) == null || !Modifier.isStatic(method.getModifiers()) || !method.getReturnType().equals(clazz) || (parameterArray = method.getParameters()).length < 1 || (internalDeserializerFunction = POJODeserializer.makeDeserializer(method, clazz2 = parameterArray[0].getType(), clazz)) == null) continue;
            deserializerFunctionPool.registerUnsafe(clazz2, internalDeserializerFunction);
        }
        return deserializerFunctionPool;
    }

    public static void unpackObject(Object object, JsonObject jsonObject) {
        try {
            POJODeserializer.unpackObject(object, jsonObject, false);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static void unpackObject(Object object, JsonObject jsonObject, boolean bl) throws DeserializationException {
        int n;
        JsonObject jsonObject2 = jsonObject.clone();
        for (Field field : object.getClass().getDeclaredFields()) {
            n = field.getModifiers();
            if (Modifier.isStatic(n) || Modifier.isTransient(n)) continue;
            POJODeserializer.unpackField(object, field, jsonObject2, bl);
        }
        for (Field field : object.getClass().getFields()) {
            n = field.getModifiers();
            if (Modifier.isStatic(n) || Modifier.isTransient(n)) continue;
            POJODeserializer.unpackField(object, field, jsonObject2, bl);
        }
        if (!jsonObject2.isEmpty() && bl) {
            throw new DeserializationException("There was data that couldn't be applied to the destination object: " + jsonObject2.toJson(JsonGrammar.STRICT));
        }
    }

    public static boolean unpackFieldData(Object object, Field field, JsonElement jsonElement, Marshaller marshaller) throws Throwable {
        Object object2;
        if (jsonElement == null) {
            return true;
        }
        try {
            field.setAccessible(true);
        }
        catch (Throwable throwable) {
            return false;
        }
        if (jsonElement == JsonNull.INSTANCE) {
            field.set(object, null);
            return true;
        }
        Class<?> clazz = field.getType();
        if (!POJODeserializer.isCollections(clazz)) {
            Object obj = marshaller.marshallCarefully(clazz, jsonElement);
            field.set(object, obj);
            return true;
        }
        if (field.get(object) == null) {
            object2 = TypeMagic.createAndCast(field.getGenericType());
            if (object2 == null) {
                return false;
            }
            field.set(object, object2);
        }
        if (Map.class.isAssignableFrom(clazz)) {
            object2 = ((ParameterizedType)field.getGenericType()).getActualTypeArguments();
            POJODeserializer.unpackMap((Map)field.get(object), object2[0], object2[1], jsonElement, marshaller);
            return true;
        }
        if (Collection.class.isAssignableFrom(clazz)) {
            object2 = ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0];
            POJODeserializer.unpackCollection((Collection)field.get(object), object2, jsonElement, marshaller);
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void unpackField(Object object, Field field, JsonObject jsonObject, boolean bl) throws DeserializationException {
        String string = field.getName();
        SerializedName serializedName = field.getAnnotation(SerializedName.class);
        if (serializedName != null) {
            string = serializedName.value();
        }
        if (!jsonObject.containsKey(string)) return;
        Object object2 = jsonObject.get(string);
        jsonObject.remove(string);
        if (object2 == null || object2 == JsonNull.INSTANCE) {
            boolean bl2 = field.isAccessible();
            if (!bl2) {
                field.setAccessible(true);
            }
            try {
                field.set(object, null);
                if (bl2) return;
                field.setAccessible(false);
                return;
            }
            catch (IllegalAccessException | IllegalArgumentException exception) {
                if (!bl) return;
                throw new DeserializationException("Couldn't set field \"" + field.getName() + "\" of class \"" + object.getClass().getCanonicalName() + "\"", exception);
            }
        }
        try {
            POJODeserializer.unpackFieldData(object, field, (JsonElement)object2, jsonObject.getMarshaller());
            return;
        }
        catch (Throwable throwable) {
            if (!bl) return;
            throw new DeserializationException("There was a problem unpacking field " + field.getName() + " of class " + object.getClass().getCanonicalName(), throwable);
        }
    }

    public static void unpackCollection(Collection<Object> collection, Type type, JsonElement jsonElement, Marshaller marshaller) throws DeserializationException {
        if (!(jsonElement instanceof JsonArray)) {
            throw new DeserializationException("Cannot deserialize a " + jsonElement.getClass().getSimpleName() + " into a Set - expected a JsonArray!");
        }
        JsonArray jsonArray = (JsonArray)jsonElement;
        for (JsonElement jsonElement2 : jsonArray) {
            Object e = marshaller.marshall(type, jsonElement2);
            if (e == null) continue;
            collection.add(e);
        }
    }

    @Nullable
    private static <A, B> InternalDeserializerFunction<B> makeDeserializer(@Nonnull Method method, @Nonnull Class<A> clazz, @Nonnull Class<B> clazz2) {
        if (!method.getReturnType().equals(clazz2)) {
            return null;
        }
        Parameter[] parameterArray = method.getParameters();
        if (parameterArray.length == 1) {
            return (object, marshaller) -> {
                try {
                    return method.invoke(null, object);
                }
                catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
                    throw new DeserializationException(exception);
                }
            };
        }
        if (parameterArray.length == 2) {
            if (parameterArray[1].getClass().equals(Marshaller.class)) {
                return (object, marshaller) -> {
                    try {
                        return method.invoke(null, object, marshaller);
                    }
                    catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
                        throw new DeserializationException(exception);
                    }
                };
            }
            return null;
        }
        return null;
    }

    private static boolean isCollections(Class<?> clazz) {
        return Map.class.isAssignableFrom(clazz) || Collection.class.isAssignableFrom(clazz);
    }

    public static void unpackMap(Map<Object, Object> map, Type type, Type type2, JsonElement jsonElement, Marshaller marshaller) throws DeserializationException {
        if (!(jsonElement instanceof JsonObject)) {
            throw new DeserializationException("Cannot deserialize a " + jsonElement.getClass().getSimpleName() + " into a Map - expected a JsonObject!");
        }
        JsonObject jsonObject = (JsonObject)jsonElement;
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            try {
                Object e = marshaller.marshall(type, (JsonElement)new JsonPrimitive(entry.getKey()));
                Object e2 = marshaller.marshall(type2, entry.getValue());
                if (e == null || e2 == null) continue;
                map.put(e, e2);
            }
            catch (Throwable throwable) {}
        }
    }
}

