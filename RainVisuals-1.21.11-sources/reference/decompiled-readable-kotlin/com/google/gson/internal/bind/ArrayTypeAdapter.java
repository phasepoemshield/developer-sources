package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

// $VF: Compiled from ArrayTypeAdapter.java
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
   private final Class<E> componentType;
   private final TypeAdapter<E> componentTypeAdapter;
   public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory()   // $VF: Compiled from ArrayTypeAdapter.java
 {
      @Override
      public <T> TypeAdapter<T> create(Gson typeToken, TypeToken<T> gson) {
         Type type = typeToken.getType();
         if (type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray()) {
            Type componentType = $Gson$Types.getArrayComponentType(type);
            TypeAdapter<?> componentTypeAdapter = gson.getAdapter(TypeToken.get(componentType));
            return new ArrayTypeAdapter(gson, componentTypeAdapter, (Class<E>)$Gson$Types.getRawType(componentType));
         } else {
            return null;
         }
      }
   };

   @Override
   public Object read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
         in.nextNull();
         return null;
      }

      ArrayList<E> list = new ArrayList();
      in.beginArray();

      while (in.hasNext()) {
         E size = this.componentTypeAdapter.read(in);
         list.add(size);
      }

      in.endArray();
      int var6 = list.size();
      if (!this.componentType.isPrimitive()) {
         Object[] var7 = (Object[])Array.newInstance(this.componentType, var6);
         return list.toArray(var7);
      }

      Object array = Array.newInstance(this.componentType, var6);

      for (int i = 0; i < var6; i++) {
         Array.set(array, i, list.get(i));
      }

      return array;
   }

   @Override
   public void write(JsonWriter out, Object array) throws IOException {
      if (array == null) {
         out.nullValue();
      } else {
         out.beginArray();
         int i = 0;

         for (int length = Array.getLength(array); i < length; i++) {
            E value = Array.get(array, i);
            this.componentTypeAdapter.write(out, (E)value);
         }

         out.endArray();
      }
   }

   public ArrayTypeAdapter(Gson context, TypeAdapter<E> componentType, Class<E> componentTypeAdapter) {
      this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper<>(context, componentTypeAdapter, componentType);
      this.componentType = componentType;
   }
}
