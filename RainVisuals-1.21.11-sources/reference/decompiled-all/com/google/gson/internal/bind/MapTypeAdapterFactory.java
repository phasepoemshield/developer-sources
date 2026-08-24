package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// $VF: Compiled from MapTypeAdapterFactory.java
public final class MapTypeAdapterFactory implements TypeAdapterFactory {
   final boolean complexMapKeySerialization;
   private final ConstructorConstructor constructorConstructor;

   private TypeAdapter<?> getKeyAdapter(Gson context, Type keyType) {
      return keyType != boolean.class && keyType != Boolean.class ? context.getAdapter(TypeToken.get(keyType)) : TypeAdapters.BOOLEAN_AS_STRING;
   }

   public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean complexMapKeySerialization) {
      this.constructorConstructor = constructorConstructor;
      this.complexMapKeySerialization = complexMapKeySerialization;
   }

   @Override
   public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
      Type type = typeToken.getType();
      Class<? super T> rawType = typeToken.getRawType();
      if (!Map.class.isAssignableFrom(rawType)) {
         return null;
      }

      Type[] keyAndValueTypes = $Gson$Types.getMapKeyAndValueTypes(type, rawType);
      TypeAdapter<?> keyAdapter = this.getKeyAdapter(gson, keyAndValueTypes[0]);
      TypeAdapter<?> valueAdapter = gson.getAdapter(TypeToken.get(keyAndValueTypes[1]));
      ObjectConstructor<T> constructor = this.constructorConstructor.get(typeToken);
      return new MapTypeAdapterFactory.Adapter(gson, keyAndValueTypes[0], keyAdapter, keyAndValueTypes[1], valueAdapter, constructor);
   }

   // $VF: Compiled from MapTypeAdapterFactory.java
   private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
      private final TypeAdapter<K> keyTypeAdapter;
      private final TypeAdapter<V> valueTypeAdapter;
      private final ObjectConstructor<? extends Map<K, V>> constructor;

      private String keyToString(JsonElement keyElement) {
         if (keyElement.isJsonPrimitive()) {
            JsonPrimitive primitive = keyElement.getAsJsonPrimitive();
            if (primitive.isNumber()) {
               return String.valueOf(primitive.getAsNumber());
            } else if (primitive.isBoolean()) {
               return Boolean.toString(primitive.getAsBoolean());
            } else if (primitive.isString()) {
               return primitive.getAsString();
            } else {
               throw new AssertionError();
            }
         } else if (keyElement.isJsonNull()) {
            return "null";
         } else {
            throw new AssertionError();
         }
      }

      public Map<K, V> read(JsonReader in) throws IOException {
         JsonToken peek = in.peek();
         if (peek == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         Map<K, V> map = this.constructor.construct();
         if (peek == JsonToken.BEGIN_ARRAY) {
            in.beginArray();

            while (in.hasNext()) {
               in.beginArray();
               K key = this.keyTypeAdapter.read(in);
               V value = this.valueTypeAdapter.read(in);
               V replaced = map.put(key, value);
               if (replaced != null) {
                  throw new JsonSyntaxException("duplicate key: " + key);
               }

               in.endArray();
            }

            in.endArray();
         } else {
            in.beginObject();

            while (in.hasNext()) {
               JsonReaderInternalAccess.INSTANCE.promoteNameToValue(in);
               K var7 = this.keyTypeAdapter.read(in);
               V var8 = this.valueTypeAdapter.read(in);
               V var9 = map.put(var7, var8);
               if (var9 != null) {
                  throw new JsonSyntaxException("duplicate key: " + var7);
               }
            }

            in.endObject();
         }

         return map;
      }

      public void write(JsonWriter map, Map<K, V> out) throws IOException {
         if (map == null) {
            out.nullValue();
         } else if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
            out.beginObject();

            for (Entry<K, V> var10 : map.entrySet()) {
               out.name(String.valueOf(var10.getKey()));
               this.valueTypeAdapter.write(out, (V)var10.getValue());
            }

            out.endObject();
         } else {
            boolean hasComplexKeys = false;
            List<JsonElement> keys = new ArrayList(map.size());
            List<V> values = new ArrayList(map.size());

            for (Entry<K, V> size : map.entrySet()) {
               JsonElement keyElement = this.keyTypeAdapter.toJsonTree((K)size.getKey());
               keys.add(keyElement);
               values.add(size.getValue());
               hasComplexKeys |= keyElement.isJsonArray() || keyElement.isJsonObject();
            }

            if (hasComplexKeys) {
               out.beginArray();
               int var11 = 0;

               for (int var13 = keys.size(); var11 < var13; var11++) {
                  out.beginArray();
                  Streams.write((JsonElement)keys.get(var11), out);
                  this.valueTypeAdapter.write(out, (V)values.get(var11));
                  out.endArray();
               }

               out.endArray();
            } else {
               out.beginObject();
               int var12 = 0;

               for (int var14 = keys.size(); var12 < var14; var12++) {
                  JsonElement var15 = (JsonElement)keys.get(var12);
                  out.name(this.keyToString(var15));
                  this.valueTypeAdapter.write(out, (V)values.get(var12));
               }

               out.endObject();
            }
         }
      }

      public Adapter(
         Gson context,
         Type keyType,
         TypeAdapter<K> keyTypeAdapter,
         Type valueType,
         TypeAdapter<V> valueTypeAdapter,
         ObjectConstructor<? extends Map<K, V>> constructor
      ) {
         this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper<>(context, keyTypeAdapter, keyType);
         this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper<>(context, valueTypeAdapter, valueType);
         this.constructor = constructor;
      }
   }
}
