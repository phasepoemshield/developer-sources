/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonArray;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonNull;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonPrimitive;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.SerializedName;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializationException;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializerFunction;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.Marshaller;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.POJODeserializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer.DeserializerFunctionPool;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.serializer.DeserializerFunctionPool$FunctionMatchFailedException;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.magic.TypeMagic;

@Deprecated
public class MarshallerImpl
implements Marshaller {
    private static MarshallerImpl INSTANCE = new MarshallerImpl();
    private Map<Class<?>, Function<Object, ?>> primitiveMarshallers = new HashMap();
    Map<Class<?>, Function<JsonObject, ?>> typeAdapters = new HashMap();
    private Map<Class<?>, BiFunction<Object, Marshaller, JsonElement>> serializers = new HashMap();
    private Map<Class<?>, DeserializerFunctionPool<?>> deserializers = new HashMap();
    private Map<Class<?>, Supplier<?>> typeFactories = new HashMap();

    public <T> void registerSerializer(Class<T> clazz, BiFunction<T, Marshaller, JsonElement> biFunction) {
        this.serializers.put(clazz, biFunction);
    }

    public <T> void registerSerializer(Class<T> clazz, Function<T, JsonElement> function) {
        this.serializers.put(clazz, (object, marshaller) -> (JsonElement)function.apply(object));
    }

    public MarshallerImpl() {
        this.register(Void.class, object -> null);
        this.register(String.class, object -> object instanceof String ? (String)object : object.toString());
        this.register(Byte.class, object -> object instanceof Number ? Byte.valueOf(((Number)object).byteValue()) : null);
        this.register(Character.class, object -> Character.valueOf(object instanceof Number ? (char)((Number)object).shortValue() : object.toString().charAt(0)));
        this.register(Short.class, object -> object instanceof Number ? Short.valueOf(((Number)object).shortValue()) : null);
        this.register(Integer.class, object -> object instanceof Number ? Integer.valueOf(((Number)object).intValue()) : null);
        this.register(Long.class, object -> object instanceof Number ? Long.valueOf(((Number)object).longValue()) : null);
        this.register(Float.class, object -> object instanceof Number ? Float.valueOf(((Number)object).floatValue()) : null);
        this.register(Double.class, object -> object instanceof Number ? Double.valueOf(((Number)object).doubleValue()) : null);
        this.register(Boolean.class, object -> object instanceof Boolean ? (Boolean)object : null);
        this.register(Void.TYPE, object -> null);
        this.register(Byte.TYPE, object -> object instanceof Number ? Byte.valueOf(((Number)object).byteValue()) : null);
        this.register(Character.TYPE, object -> Character.valueOf(object instanceof Number ? (char)((Number)object).shortValue() : object.toString().charAt(0)));
        this.register(Short.TYPE, object -> object instanceof Number ? Short.valueOf(((Number)object).shortValue()) : null);
        this.register(Integer.TYPE, object -> object instanceof Number ? Integer.valueOf(((Number)object).intValue()) : null);
        this.register(Long.TYPE, object -> object instanceof Number ? Long.valueOf(((Number)object).longValue()) : null);
        this.register(Float.TYPE, object -> object instanceof Number ? Float.valueOf(((Number)object).floatValue()) : null);
        this.register(Double.TYPE, object -> object instanceof Number ? Double.valueOf(((Number)object).doubleValue()) : null);
        this.register(Boolean.TYPE, object -> object instanceof Boolean ? (Boolean)object : null);
        this.registerSerializer(Void.class, (T void_) -> JsonNull.INSTANCE);
        this.registerSerializer(Character.class, (T c) -> new JsonPrimitive("" + c));
        this.registerSerializer(JsonPrimitive.class, JsonPrimitive::new);
        this.registerSerializer(Byte.class, (T by) -> new JsonPrimitive(by));
        this.registerSerializer(Short.class, (T s) -> new JsonPrimitive(s));
        this.registerSerializer(Integer.class, (T n) -> new JsonPrimitive(n));
        this.registerSerializer(Long.class, JsonPrimitive::new);
        this.registerSerializer(Float.class, (T f) -> new JsonPrimitive(f.floatValue()));
        this.registerSerializer(Double.class, JsonPrimitive::new);
        this.registerSerializer(Boolean.class, JsonPrimitive::new);
        this.registerSerializer(Void.TYPE, (T void_) -> JsonNull.INSTANCE);
        this.registerSerializer(Character.TYPE, (T c) -> new JsonPrimitive("" + c));
        this.registerSerializer(Byte.TYPE, (T by) -> new JsonPrimitive(by));
        this.registerSerializer(Short.TYPE, (T s) -> new JsonPrimitive(s));
        this.registerSerializer(Integer.TYPE, (T n) -> new JsonPrimitive(n));
        this.registerSerializer(Long.TYPE, JsonPrimitive::new);
        this.registerSerializer(Float.TYPE, (T f) -> new JsonPrimitive(f.floatValue()));
        this.registerSerializer(Double.TYPE, JsonPrimitive::new);
        this.registerSerializer(Boolean.TYPE, JsonPrimitive::new);
    }

    public <T> void register(Class<T> clazz, Function<Object, T> function) {
        this.primitiveMarshallers.put(clazz, function);
    }

    public <T> void registerTypeAdapter(Class<T> clazz, Function<JsonObject, T> function) {
        this.typeAdapters.put(clazz, function);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public JsonElement serialize(Object object) {
        Comment comment;
        SerializedName serializedName;
        String string;
        Object object2;
        Object object3;
        if (object == null) {
            return JsonNull.INSTANCE;
        }
        BiFunction<Object, Marshaller, JsonElement> biFunction = this.serializers.get(object.getClass());
        if (biFunction != null) {
            JsonElement jsonElement = biFunction.apply(object, this);
            if (jsonElement instanceof JsonObject) {
                ((JsonObject)jsonElement).setMarshaller(this);
            }
            if (jsonElement instanceof JsonArray) {
                ((JsonArray)jsonElement).setMarshaller(this);
            }
            return jsonElement;
        }
        for (Map.Entry<Class<?>, BiFunction<Object, Marshaller, JsonElement>> object4 : this.serializers.entrySet()) {
            if (!object4.getKey().isAssignableFrom(object.getClass())) continue;
            JsonElement jsonElement = object4.getValue().apply(object, this);
            if (jsonElement instanceof JsonObject) {
                ((JsonObject)jsonElement).setMarshaller(this);
            }
            if (jsonElement instanceof JsonArray) {
                ((JsonArray)jsonElement).setMarshaller(this);
            }
            return jsonElement;
        }
        if (object instanceof Enum) {
            return new JsonPrimitive(((Enum)object).name());
        }
        if (object.getClass().isArray()) {
            void var4_7;
            object3 = new JsonArray();
            ((JsonArray)object3).setMarshaller(this);
            boolean i = false;
            while (var4_7 < Array.getLength(object)) {
                Object object4 = Array.get(object, (int)var4_7);
                JsonElement jsonElement = this.serialize(object4);
                ((JsonArray)object3).add(jsonElement);
                ++var4_7;
            }
            return object3;
        }
        if (object instanceof Collection) {
            object3 = new JsonArray();
            ((JsonArray)object3).setMarshaller(this);
            for (Object e : (Collection)object) {
                JsonElement jsonElement = this.serialize(e);
                ((JsonArray)object3).add(jsonElement);
            }
            return object3;
        }
        if (object instanceof Map) {
            object3 = new JsonObject();
            for (Map.Entry entry : ((Map)object).entrySet()) {
                String string2 = entry.getKey().toString();
                Object v = entry.getValue();
                ((JsonObject)object3).put(string2, this.serialize(v));
            }
            return object3;
        }
        object3 = new JsonObject();
        Field[] fieldArray = object.getClass().getFields();
        int n = fieldArray.length;
        for (int i = 0; i < n; ++i) {
            Field field = fieldArray[i];
            if (Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers())) continue;
            field.setAccessible(true);
            try {
                object2 = field.get(object);
                string = field.getName();
                serializedName = field.getAnnotation(SerializedName.class);
                if (serializedName != null) {
                    string = serializedName.value();
                }
                if ((comment = field.getAnnotation(Comment.class)) == null) {
                    ((JsonObject)object3).put(string, this.serialize(object2));
                    continue;
                }
                ((JsonObject)object3).put(string, this.serialize(object2), comment.value());
                continue;
            }
            catch (IllegalAccessException | IllegalArgumentException exception) {
                // empty catch block
            }
        }
        for (Field field : object.getClass().getDeclaredFields()) {
            if (Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers())) continue;
            field.setAccessible(true);
            try {
                object2 = field.get(object);
                string = field.getName();
                serializedName = field.getAnnotation(SerializedName.class);
                if (serializedName != null) {
                    string = serializedName.value();
                }
                if ((comment = field.getAnnotation(Comment.class)) == null) {
                    ((JsonObject)object3).put(string, this.serialize(object2));
                    continue;
                }
                ((JsonObject)object3).put(string, this.serialize(object2), comment.value());
            }
            catch (IllegalAccessException | IllegalArgumentException exception) {
                // empty catch block
            }
        }
        return object3;
    }

    public static Marshaller getFallback() {
        return INSTANCE;
    }

    public <A, B> void registerDeserializer(Class<A> clazz, Class<B> clazz2, DeserializerFunction<A, B> deserializerFunction) {
        DeserializerFunctionPool<Object> deserializerFunctionPool = this.deserializers.get(clazz2);
        if (deserializerFunctionPool == null) {
            deserializerFunctionPool = new DeserializerFunctionPool<B>(clazz2);
            this.deserializers.put(clazz2, deserializerFunctionPool);
        }
        deserializerFunctionPool.registerUnsafe(clazz, deserializerFunction);
    }

    public <T> void registerTypeFactory(Class<T> clazz, Supplier<T> supplier) {
        this.typeFactories.put(clazz, supplier);
    }

    @Nullable
    public <T> T marshall(Type type, JsonElement jsonElement) {
        if (jsonElement == null) {
            return null;
        }
        if (jsonElement == JsonNull.INSTANCE) {
            return null;
        }
        if (type instanceof Class) {
            try {
                return this.marshall((Class<T>)((Class)type), jsonElement);
            }
            catch (ClassCastException classCastException) {
                return null;
            }
        }
        if (type instanceof ParameterizedType) {
            try {
                Class<?> clazz = TypeMagic.classForType(type);
                return (T)this.marshall(clazz, jsonElement);
            }
            catch (ClassCastException classCastException) {
                return null;
            }
        }
        return null;
    }

    public <T> T marshall(Class<T> clazz, JsonElement jsonElement) {
        try {
            return this.marshall(clazz, jsonElement, false);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @Nullable
    public <T> T marshall(Class<T> clazz, JsonElement jsonElement, boolean bl) throws DeserializationException {
        if (jsonElement == null) {
            return null;
        }
        if (jsonElement == JsonNull.INSTANCE) {
            return null;
        }
        if (clazz.isAssignableFrom(jsonElement.getClass())) {
            return (T)jsonElement;
        }
        DeserializerFunctionPool<Object> deserializerFunctionPool = this.deserializers.get(clazz);
        if (deserializerFunctionPool != null) {
            try {
                return (T)deserializerFunctionPool.apply(jsonElement, this);
            }
            catch (DeserializerFunctionPool$FunctionMatchFailedException deserializerFunctionPool$FunctionMatchFailedException) {
                // empty catch block
            }
        }
        deserializerFunctionPool = POJODeserializer.deserializersFor(clazz);
        try {
            Object object = deserializerFunctionPool.apply(jsonElement, this);
            return (T)object;
        }
        catch (DeserializerFunctionPool$FunctionMatchFailedException deserializerFunctionPool$FunctionMatchFailedException) {
            int n;
            Object object;
            Object object2;
            if (Enum.class.isAssignableFrom(clazz)) {
                if (!(jsonElement instanceof JsonPrimitive)) {
                    return null;
                }
                object2 = ((JsonPrimitive)jsonElement).getValue().toString();
                object = clazz.getEnumConstants();
                if (object == null) {
                    return null;
                }
                T[] object3 = object;
                n = object3.length;
                for (int i = 0; i < n; ++i) {
                    T t = object3[i];
                    if (!((Enum)t).name().equals(object2)) continue;
                    return t;
                }
            }
            if (clazz.equals(String.class)) {
                if (jsonElement instanceof JsonObject) {
                    return (T)((JsonObject)jsonElement).toJson(false, false);
                }
                if (jsonElement instanceof JsonArray) {
                    return (T)((JsonArray)jsonElement).toJson(false, false);
                }
                if (jsonElement instanceof JsonPrimitive) {
                    ((JsonPrimitive)jsonElement).getValue();
                    return (T)((JsonPrimitive)jsonElement).asString();
                }
                if (jsonElement instanceof JsonNull) {
                    return (T)"null";
                }
                if (bl) {
                    throw new DeserializationException("Encountered unexpected JsonElement type while deserializing to string: " + jsonElement.getClass().getCanonicalName());
                }
                return null;
            }
            if (jsonElement instanceof JsonPrimitive) {
                object2 = this.primitiveMarshallers.get(clazz);
                if (object2 != null) {
                    return (T)object2.apply(((JsonPrimitive)jsonElement).getValue());
                }
                if (bl) {
                    throw new DeserializationException("Don't know how to unpack value '" + jsonElement.toString() + "' into target type '" + clazz.getCanonicalName() + "'");
                }
                return null;
            }
            if (jsonElement instanceof JsonObject) {
                if (clazz.isPrimitive()) {
                    throw new DeserializationException("Can't marshall json object into primitive type " + clazz.getCanonicalName());
                }
                if (JsonPrimitive.class.isAssignableFrom(clazz)) {
                    if (bl) {
                        throw new DeserializationException("Can't marshall json object into a json primitive");
                    }
                    return null;
                }
                object2 = (JsonObject)jsonElement;
                ((JsonObject)object2).setMarshaller(this);
                if (this.typeAdapters.containsKey(clazz)) {
                    return (T)this.typeAdapters.get(clazz).apply((JsonObject)jsonElement);
                }
                if (this.typeFactories.containsKey(clazz)) {
                    object = this.typeFactories.get(clazz).get();
                    try {
                        POJODeserializer.unpackObject(object, object2, bl);
                        return (T)object;
                    }
                    catch (Throwable throwable) {
                        if (bl) {
                            throw throwable;
                        }
                        return null;
                    }
                }
                try {
                    object = TypeMagic.createAndCast(clazz, bl);
                    POJODeserializer.unpackObject(object, object2, bl);
                    return (T)object;
                }
                catch (Throwable throwable) {
                    if (bl) {
                        throw throwable;
                    }
                    return null;
                }
            }
            if (jsonElement instanceof JsonArray) {
                if (clazz.isPrimitive()) {
                    return null;
                }
                if (clazz.isArray()) {
                    object2 = clazz.getComponentType();
                    object = (JsonArray)jsonElement;
                    Object object3 = Array.newInstance(object2, ((JsonArray)object).size());
                    for (n = 0; n < ((JsonArray)object).size(); ++n) {
                        Array.set(object3, n, this.marshall((Class<T>)object2, (JsonElement)((JsonArray)object).get(n)));
                    }
                    return (T)object3;
                }
            }
            return null;
        }
    }

    public <T> T marshallCarefully(Class<T> clazz, JsonElement jsonElement) throws DeserializationException {
        return this.marshall(clazz, jsonElement, true);
    }
}

