/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  squeek.appleskin.shadowed.blue.endless.jankson.Comment
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonArray
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonElement
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonNull
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonObject
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive
 *  squeek.appleskin.shadowed.blue.endless.jankson.annotation.SerializedName
 *  squeek.appleskin.shadowed.blue.endless.jankson.annotation.Serializer
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.DeserializationException
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.DeserializerFunction
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.Marshaller
 */
package squeek.appleskin.shadowed.blue.endless.jankson.impl;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import squeek.appleskin.shadowed.blue.endless.jankson.Comment;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonArray;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonNull;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonObject;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive;
import squeek.appleskin.shadowed.blue.endless.jankson.annotation.SerializedName;
import squeek.appleskin.shadowed.blue.endless.jankson.annotation.Serializer;
import squeek.appleskin.shadowed.blue.endless.jankson.api.DeserializationException;
import squeek.appleskin.shadowed.blue.endless.jankson.api.DeserializerFunction;
import squeek.appleskin.shadowed.blue.endless.jankson.api.Marshaller;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.POJODeserializer;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.serializer.DeserializerFunctionPool;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.serializer.DeserializerFunctionPool$FunctionMatchFailedException;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.serializer.InternalDeserializerFunction;
import squeek.appleskin.shadowed.blue.endless.jankson.magic.TypeMagic;

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
        this.register(String.class, object -> object.toString());
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
        this.registerSerializer(Character.class, (T c) -> new JsonPrimitive((Object)("" + c)));
        this.registerSerializer(JsonPrimitive.class, JsonPrimitive::new);
        this.registerSerializer(Byte.class, (T by) -> new JsonPrimitive(by));
        this.registerSerializer(Short.class, (T s) -> new JsonPrimitive(s));
        this.registerSerializer(Integer.class, (T n) -> new JsonPrimitive(n));
        this.registerSerializer(Long.class, JsonPrimitive::new);
        this.registerSerializer(Float.class, (T f) -> new JsonPrimitive((Object)f.floatValue()));
        this.registerSerializer(Double.class, JsonPrimitive::new);
        this.registerSerializer(Boolean.class, JsonPrimitive::new);
        this.registerSerializer(Void.TYPE, (T void_) -> JsonNull.INSTANCE);
        this.registerSerializer(Character.TYPE, (T c) -> new JsonPrimitive((Object)("" + c)));
        this.registerSerializer(Byte.TYPE, (T by) -> new JsonPrimitive(by));
        this.registerSerializer(Short.TYPE, (T s) -> new JsonPrimitive(s));
        this.registerSerializer(Integer.TYPE, (T n) -> new JsonPrimitive(n));
        this.registerSerializer(Long.TYPE, JsonPrimitive::new);
        this.registerSerializer(Float.TYPE, (T f) -> new JsonPrimitive((Object)f.floatValue()));
        this.registerSerializer(Double.TYPE, JsonPrimitive::new);
        this.registerSerializer(Boolean.TYPE, JsonPrimitive::new);
    }

    public <T> void register(Class<T> clazz, Function<Object, T> function) {
        this.primitiveMarshallers.put(clazz, function);
    }

    public <T> void registerTypeAdapter(Class<T> clazz, Function<JsonObject, T> function) {
        this.typeAdapters.put(clazz, function);
    }

    public JsonElement serialize(Object object) {
        Comment comment;
        SerializedName serializedName;
        String string;
        JsonArray jsonArray;
        Object object2;
        Object object322;
        if (object == null) {
            return JsonNull.INSTANCE;
        }
        BiFunction<Object, Marshaller, JsonElement> biFunction = this.serializers.get(object.getClass());
        if (biFunction != null) {
            JsonElement jsonElement = biFunction.apply(object, this);
            if (jsonElement instanceof JsonObject) {
                ((JsonObject)jsonElement).setMarshaller((Marshaller)this);
            }
            if (jsonElement instanceof JsonArray) {
                ((JsonArray)jsonElement).setMarshaller((Marshaller)this);
            }
            return jsonElement;
        }
        for (Map.Entry<Class<?>, BiFunction<Object, Marshaller, JsonElement>> entry : this.serializers.entrySet()) {
            if (!entry.getKey().isAssignableFrom(object.getClass())) continue;
            JsonElement jsonElement = entry.getValue().apply(object, this);
            if (jsonElement instanceof JsonObject) {
                ((JsonObject)jsonElement).setMarshaller((Marshaller)this);
            }
            if (jsonElement instanceof JsonArray) {
                ((JsonArray)jsonElement).setMarshaller((Marshaller)this);
            }
            return jsonElement;
        }
        for (Object object322 : object.getClass().getDeclaredMethods()) {
            Class<?> annotatedElement2;
            if (!((AccessibleObject)object322).isAnnotationPresent(Serializer.class) || Modifier.isStatic(((Method)object322).getModifiers()) || !JsonElement.class.isAssignableFrom(annotatedElement2 = ((Method)object322).getReturnType())) continue;
            object2 = ((Executable)object322).getParameters();
            if (((Parameter[])object2).length == 0) {
                try {
                    boolean bl = ((AccessibleObject)object322).isAccessible();
                    if (!bl) {
                        ((Method)object322).setAccessible(true);
                    }
                    JsonElement jsonElement = (JsonElement)((Method)object322).invoke(object, new Object[0]);
                    if (!bl) {
                        ((Method)object322).setAccessible(false);
                    }
                    if (jsonElement instanceof JsonObject) {
                        ((JsonObject)jsonElement).setMarshaller((Marshaller)this);
                    }
                    if (jsonElement instanceof JsonArray) {
                        ((JsonArray)jsonElement).setMarshaller((Marshaller)this);
                    }
                    return jsonElement;
                }
                catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
                    return JsonNull.INSTANCE;
                }
            }
            if (((Parameter[])object2).length != 1 || !Marshaller.class.isAssignableFrom(object2[0].getType())) continue;
            try {
                boolean bl = ((AccessibleObject)object322).isAccessible();
                if (!bl) {
                    ((Method)object322).setAccessible(true);
                }
                JsonElement jsonElement = (JsonElement)((Method)object322).invoke(object, this);
                if (!bl) {
                    ((Method)object322).setAccessible(false);
                }
                if (jsonElement instanceof JsonObject) {
                    ((JsonObject)jsonElement).setMarshaller((Marshaller)this);
                }
                if (jsonElement instanceof JsonArray) {
                    ((JsonArray)jsonElement).setMarshaller((Marshaller)this);
                }
                return jsonElement;
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
                return JsonNull.INSTANCE;
            }
        }
        if (object instanceof Enum) {
            return new JsonPrimitive((Object)((Enum)object).name());
        }
        if (object.getClass().isArray()) {
            jsonArray = new JsonArray();
            jsonArray.setMarshaller((Marshaller)this);
            for (int i = 0; i < Array.getLength(object); ++i) {
                Object object4 = Array.get(object, i);
                object322 = this.serialize(object4);
                jsonArray.add((JsonElement)object322);
            }
            return jsonArray;
        }
        if (object instanceof Collection) {
            jsonArray = new JsonArray();
            jsonArray.setMarshaller((Marshaller)this);
            for (Object e : (Collection)object) {
                object322 = this.serialize(e);
                jsonArray.add((JsonElement)object322);
            }
            return jsonArray;
        }
        if (object instanceof Map) {
            jsonArray = new JsonObject();
            for (Map.Entry entry : ((Map)object).entrySet()) {
                object322 = entry.getKey().toString();
                Object v = entry.getValue();
                jsonArray.put((String)object322, this.serialize(v));
            }
            return jsonArray;
        }
        jsonArray = new JsonObject();
        for (Field field : object.getClass().getFields()) {
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
                    jsonArray.put(string, this.serialize(object2));
                    continue;
                }
                jsonArray.put(string, this.serialize(object2), comment.value());
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
                    jsonArray.put(string, this.serialize(object2));
                    continue;
                }
                jsonArray.put(string, this.serialize(object2), comment.value());
            }
            catch (IllegalAccessException | IllegalArgumentException exception) {
                // empty catch block
            }
        }
        return jsonArray;
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
        deserializerFunctionPool.registerUnsafe(clazz, (InternalDeserializerFunction<A>)deserializerFunction);
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
                return this.marshall((Class)type, jsonElement);
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
                JsonArray object3 = object;
                n = ((T[])object3).length;
                for (int i = 0; i < n; ++i) {
                    JsonArray jsonArray = object3[i];
                    if (!((Enum)jsonArray).name().equals(object2)) continue;
                    return (T)jsonArray;
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
                object2.setMarshaller((Marshaller)this);
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
                    Object object3 = Array.newInstance(object2, object.size());
                    for (n = 0; n < object.size(); ++n) {
                        Array.set(object3, n, this.marshall((Class<T>)object2, object.get(n)));
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

