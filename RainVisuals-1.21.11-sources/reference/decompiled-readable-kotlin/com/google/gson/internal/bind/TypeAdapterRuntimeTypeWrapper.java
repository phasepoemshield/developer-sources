package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// $VF: Compiled from TypeAdapterRuntimeTypeWrapper.java
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
   private final TypeAdapter<T> delegate;
   private final Gson context;
   private final Type type;

   @Override
   public void write(JsonWriter value, T out) throws IOException {
      TypeAdapter<T> chosen = this.delegate;
      Type runtimeType = getRuntimeTypeIfMoreSpecific(this.type, value);
      if (runtimeType != this.type) {
         TypeAdapter<T> runtimeTypeAdapter = this.context.getAdapter((TypeToken<T>)TypeToken.get(runtimeType));
         if (!(runtimeTypeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
            chosen = runtimeTypeAdapter;
         } else if (!isReflective(this.delegate)) {
            chosen = this.delegate;
         } else {
            chosen = runtimeTypeAdapter;
         }
      }

      chosen.write(out, value);
   }

   TypeAdapterRuntimeTypeWrapper(Gson delegate, TypeAdapter<T> context, Type type) {
      this.context = context;
      this.delegate = delegate;
      this.type = type;
   }

   private static boolean isReflective(TypeAdapter<?> typeAdapter) {
      while (typeAdapter instanceof SerializationDelegatingTypeAdapter) {
         TypeAdapter<?> delegate = ((SerializationDelegatingTypeAdapter)typeAdapter).getSerializationDelegate();
         if (delegate != typeAdapter) {
            typeAdapter = delegate;
            continue;
         }
         break;
      }

      return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
   }

   @Override
   public T read(JsonReader in) throws IOException {
      return this.delegate.read(in);
   }

   private static Type getRuntimeTypeIfMoreSpecific(Type value, Object type) {
      if (value != null && (type instanceof Class || type instanceof TypeVariable)) {
         type = value.getClass();
      }

      return type;
   }
}
