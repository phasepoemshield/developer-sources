package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

// $VF: Compiled from CollectionTypeAdapterFactory.java
public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
   private final ConstructorConstructor constructorConstructor;

   public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
      this.constructorConstructor = constructorConstructor;
   }

   @Override
   public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
      Type type = typeToken.getType();
      Class<? super T> rawType = typeToken.getRawType();
      if (!Collection.class.isAssignableFrom(rawType)) {
         return null;
      }

      Type elementType = $Gson$Types.getCollectionElementType(type, rawType);
      TypeAdapter<?> elementTypeAdapter = gson.getAdapter(TypeToken.get(elementType));
      ObjectConstructor<T> constructor = this.constructorConstructor.get(typeToken);
      return new CollectionTypeAdapterFactory.Adapter(gson, elementType, elementTypeAdapter, constructor);
   }

   // $VF: Compiled from CollectionTypeAdapterFactory.java
   private static final class Adapter<E> extends TypeAdapter<Collection<E>> {
      private final ObjectConstructor<? extends Collection<E>> constructor;
      private final TypeAdapter<E> elementTypeAdapter;

      public Collection<E> read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         Collection<E> collection = this.constructor.construct();
         in.beginArray();

         while (in.hasNext()) {
            E instance = this.elementTypeAdapter.read(in);
            collection.add(instance);
         }

         in.endArray();
         return collection;
      }

      public Adapter(Gson constructor, Type context, TypeAdapter<E> elementType, ObjectConstructor<? extends Collection<E>> elementTypeAdapter) {
         this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper<>(context, elementTypeAdapter, elementType);
         this.constructor = constructor;
      }

      public void write(JsonWriter collection, Collection<E> out) throws IOException {
         if (collection == null) {
            out.nullValue();
         } else {
            out.beginArray();

            for (E element : collection) {
               this.elementTypeAdapter.write(out, (E)element);
            }

            out.endArray();
         }
      }
   }
}
