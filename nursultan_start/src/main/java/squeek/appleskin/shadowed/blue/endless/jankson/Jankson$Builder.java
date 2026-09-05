/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.impl.MarshallerImpl
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import squeek.appleskin.shadowed.blue.endless.jankson.Jankson;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonObject;
import squeek.appleskin.shadowed.blue.endless.jankson.api.DeserializerFunction;
import squeek.appleskin.shadowed.blue.endless.jankson.api.Marshaller;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.MarshallerImpl;

public class Jankson$Builder {
    MarshallerImpl marshaller = new MarshallerImpl();
    boolean allowBareRootObject = false;

    public <T> Jankson$Builder registerSerializer(Class<T> clazz, BiFunction<T, Marshaller, JsonElement> biFunction) {
        this.marshaller.registerSerializer(clazz, biFunction);
        return this;
    }

    public Jankson build() {
        Jankson jankson = new Jankson(this, null);
        Jankson.access$402(jankson, (Marshaller)this.marshaller);
        Jankson.access$502(jankson, this.allowBareRootObject);
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

    public Jankson$Builder allowBareRootObject() {
        this.allowBareRootObject = true;
        return this;
    }
}

