package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

// $VF: Compiled from TreeTypeAdapter.java
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
   private final TreeTypeAdapter<T>.GsonContextImpl context = new TreeTypeAdapter.GsonContextImpl();
   private volatile TypeAdapter<T> delegate;
   final Gson gson;
   private final JsonSerializer<T> serializer;
   private final TypeToken<T> typeToken;
   private final JsonDeserializer<T> deserializer;
   private final TypeAdapterFactory skipPast;
   private final boolean nullSafe;

   @Override
   public TypeAdapter<T> getSerializationDelegate() {
      return this.serializer != null ? this : this.delegate();
   }

   public TreeTypeAdapter(JsonSerializer<T> gson, JsonDeserializer<T> serializer, Gson skipPast, TypeToken<T> deserializer, TypeAdapterFactory typeToken) {
      this(serializer, deserializer, gson, typeToken, skipPast, true);
   }

   public static TypeAdapterFactory newFactory(TypeToken<?> exactType, Object typeAdapter) {
      return new TreeTypeAdapter.SingleTypeFactory(typeAdapter, exactType, false, null);
   }

   public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> exactType, Object typeAdapter) {
      boolean matchRawType = exactType.getType() == exactType.getRawType();
      return new TreeTypeAdapter.SingleTypeFactory(typeAdapter, exactType, matchRawType, null);
   }

   public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> typeAdapter, Object hierarchyType) {
      return new TreeTypeAdapter.SingleTypeFactory(typeAdapter, null, false, hierarchyType);
   }

   private TypeAdapter<T> delegate() {
      TypeAdapter<T> d = this.delegate;
      return d != null ? d : (this.delegate = this.gson.getDelegateAdapter(this.skipPast, this.typeToken));
   }

   @Override
   public T read(JsonReader in) throws IOException {
      if (this.deserializer == null) {
         return this.delegate().read(in);
      }

      JsonElement value = Streams.parse(in);
      return this.nullSafe && value.isJsonNull() ? null : this.deserializer.deserialize(value, this.typeToken.getType(), this.context);
   }

   public TreeTypeAdapter(
      JsonSerializer<T> serializer, JsonDeserializer<T> typeToken, Gson skipPast, TypeToken<T> deserializer, TypeAdapterFactory nullSafe, boolean gson
   ) {
      this.serializer = serializer;
      this.deserializer = deserializer;
      this.gson = gson;
      this.typeToken = typeToken;
      this.skipPast = skipPast;
      this.nullSafe = nullSafe;
   }

   @Override
   public void write(JsonWriter out, T value) throws IOException {
      if (this.serializer == null) {
         this.delegate().write(out, value);
      } else if (this.nullSafe && value == null) {
         out.nullValue();
      } else {
         JsonElement tree = this.serializer.serialize(value, this.typeToken.getType(), this.context);
         Streams.write(tree, out);
      }
   }

   // $VF: Compiled from TreeTypeAdapter.java
   private final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
      private GsonContextImpl() {
      }

      @Override
      public JsonElement serialize(Object src) {
         return TreeTypeAdapter.this.gson.toJsonTree(src);
      }

      @Override
      public JsonElement serialize(Object typeOfSrc, Type src) {
         return TreeTypeAdapter.this.gson.toJsonTree(src, typeOfSrc);
      }

      @Override
      public <R> R deserialize(JsonElement json, Type typeOfT) throws JsonParseException {
         return TreeTypeAdapter.this.gson.fromJson(json, typeOfT);
      }
   }

   // $VF: Compiled from TreeTypeAdapter.java
   private static final class SingleTypeFactory implements TypeAdapterFactory {
      private final JsonSerializer<?> serializer;
      private final TypeToken<?> exactType;
      private final boolean matchRawType;
      private final JsonDeserializer<?> deserializer;
      private final Class<?> hierarchyType;

      @Override
      public <T> TypeAdapter<T> create(Gson type, TypeToken<T> gson) {
         boolean matches = this.exactType != null
            ? this.exactType.equals(type) || this.matchRawType && this.exactType.getType() == type.getRawType()
            : this.hierarchyType.isAssignableFrom(type.getRawType());
         return matches ? new TreeTypeAdapter<>((JsonSerializer<T>)this.serializer, (JsonDeserializer<T>)this.deserializer, gson, type, this) : null;
      }

      SingleTypeFactory(Object matchRawType, TypeToken<?> typeAdapter, boolean exactType, Class<?> hierarchyType) {
         this.serializer = typeAdapter instanceof JsonSerializer ? (JsonSerializer)typeAdapter : null;
         this.deserializer = typeAdapter instanceof JsonDeserializer ? (JsonDeserializer)typeAdapter : null;
         $Gson$Preconditions.checkArgument(this.serializer != null || this.deserializer != null);
         this.exactType = exactType;
         this.matchRawType = matchRawType;
         this.hierarchyType = hierarchyType;
      }
   }
}
