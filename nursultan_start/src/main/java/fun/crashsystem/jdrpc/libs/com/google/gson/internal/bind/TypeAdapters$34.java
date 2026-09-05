/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.Gson
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind;

import fun.crashsystem.jdrpc.libs.com.google.gson.Gson;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory;
import fun.crashsystem.jdrpc.libs.com.google.gson.reflect.TypeToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter;
import java.io.IOException;

class TypeAdapters$34
implements TypeAdapterFactory {
    final /* synthetic */ Class val$clazz;
    final /* synthetic */ TypeAdapter val$typeAdapter;

    TypeAdapters$34(Class clazz, TypeAdapter typeAdapter) {
        this.val$clazz = clazz;
        this.val$typeAdapter = typeAdapter;
    }

    public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
        final Class<T2> requestedType = typeToken.getRawType();
        if (!this.val$clazz.isAssignableFrom(requestedType)) {
            return null;
        }
        return new TypeAdapter<T1>(){

            public void write(JsonWriter out, T1 value) throws IOException {
                TypeAdapters$34.this.val$typeAdapter.write(out, value);
            }

            public T1 read(JsonReader in) throws IOException {
                Object result = TypeAdapters$34.this.val$typeAdapter.read(in);
                if (result != null && !requestedType.isInstance(result)) {
                    throw new JsonSyntaxException("Expected a " + requestedType.getName() + " but was " + result.getClass().getName() + "; at path " + in.getPreviousPath());
                }
                return (T1)result;
            }
        };
    }

    public String toString() {
        return "Factory[typeHierarchy=" + this.val$clazz.getName() + ",adapter=" + this.val$typeAdapter + "]";
    }
}

