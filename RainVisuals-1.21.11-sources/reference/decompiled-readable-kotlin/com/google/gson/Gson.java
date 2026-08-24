package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

// $VF: Compiled from Gson.java
public final class Gson {
   static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
   final ToNumberStrategy objectToNumberStrategy;
   final List<TypeAdapterFactory> builderHierarchyFactories;
   static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
   static final boolean DEFAULT_ESCAPE_HTML = true;
   final boolean htmlSafe;
   static final String DEFAULT_DATE_PATTERN = null;
   final boolean complexMapKeySerialization;
   final boolean serializeSpecialFloatingPointValues;
   final List<TypeAdapterFactory> builderFactories;
   private final ThreadLocal<Map<TypeToken<?>, TypeAdapter<?>>> threadLocalAdapterResults = new ThreadLocal<>();
   final boolean generateNonExecutableJson;
   static final boolean DEFAULT_USE_JDK_UNSAFE = true;
   final boolean lenient;
   static final FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = FieldNamingPolicy.IDENTITY;
   private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
   final List<TypeAdapterFactory> factories;
   final String datePattern;
   final LongSerializationPolicy longSerializationPolicy;
   static final boolean DEFAULT_LENIENT = false;
   static final boolean DEFAULT_PRETTY_PRINT = false;
   final List<ReflectionAccessFilter> reflectionFilters;
   static final ToNumberStrategy DEFAULT_OBJECT_TO_NUMBER_STRATEGY = ToNumberPolicy.DOUBLE;
   private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
   private final ConcurrentMap<TypeToken<?>, TypeAdapter<?>> typeTokenCache = new ConcurrentHashMap<>();
   final ToNumberStrategy numberToNumberStrategy;
   final FieldNamingStrategy fieldNamingStrategy;
   final boolean useJdkUnsafe;
   final boolean prettyPrinting;
   final int timeStyle;
   final int dateStyle;
   final Excluder excluder;
   static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
   final boolean serializeNulls;
   static final boolean DEFAULT_SERIALIZE_NULLS = false;
   static final ToNumberStrategy DEFAULT_NUMBER_TO_NUMBER_STRATEGY = ToNumberPolicy.LAZILY_PARSED_NUMBER;
   final Map<Type, InstanceCreator<?>> instanceCreators;
   private final ConstructorConstructor constructorConstructor;

   private TypeAdapter<Number> floatAdapter(boolean serializeSpecialFloatingPointValues) {
      return serializeSpecialFloatingPointValues ? TypeAdapters.FLOAT : new TypeAdapter<Number>()      // $VF: Compiled from Gson.java
 {
         public Float read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
               in.nextNull();
               return null;
            } else {
               return (float)in.nextDouble();
            }
         }

         public void write(JsonWriter value, Number out) throws IOException {
            if (value == null) {
               out.nullValue();
            } else {
               float floatValue = value.floatValue();
               Gson.checkValidFloatingPoint(floatValue);
               Number floatNumber = value instanceof Float ? value : floatValue;
               out.value(floatNumber);
            }
         }
      };
   }

   public void toJson(Object typeOfSrc, Type writer, JsonWriter src) throws JsonIOException {
      TypeAdapter<Object> adapter = this.getAdapter((TypeToken<Object>)TypeToken.get(typeOfSrc));
      boolean oldLenient = writer.isLenient();
      writer.setLenient(true);
      boolean oldHtmlSafe = writer.isHtmlSafe();
      writer.setHtmlSafe(this.htmlSafe);
      boolean oldSerializeNulls = writer.getSerializeNulls();
      writer.setSerializeNulls(this.serializeNulls);

      try {
         adapter.write(writer, src);
      } catch (IOException e) {
         throw new JsonIOException(e);
      } catch (AssertionError var14) {
         throw new AssertionError("AssertionError (GSON 2.10.1): " + var14.getMessage(), var14);
      } finally {
         writer.setLenient(oldLenient);
         writer.setHtmlSafe(oldHtmlSafe);
         writer.setSerializeNulls(oldSerializeNulls);
      }
   }

   public <T> TypeAdapter<T> getAdapter(TypeToken<T> type) {
      Objects.requireNonNull(type, "type must not be null");
      TypeAdapter<?> cached = this.typeTokenCache.get(type);
      if (cached != null) {
         return (TypeAdapter<T>)cached;
      }

      Map<TypeToken<?>, TypeAdapter<?>> threadCalls = this.threadLocalAdapterResults.get();
      boolean isInitialAdapterRequest = false;
      if (threadCalls == null) {
         threadCalls = new HashMap();
         this.threadLocalAdapterResults.set(threadCalls);
         isInitialAdapterRequest = true;
      } else {
         TypeAdapter<T> candidate = (TypeAdapter<T>)threadCalls.get(type);
         if (candidate != null) {
            return candidate;
         }
      }

      TypeAdapter<T> var12 = null;

      try {
         Gson.FutureTypeAdapter<T> call = new Gson.FutureTypeAdapter();
         threadCalls.put(type, call);

         for (TypeAdapterFactory factory : this.factories) {
            var12 = factory.create(this, type);
            if (var12 != null) {
               call.setDelegate(var12);
               threadCalls.put(type, var12);
               break;
            }
         }
      } finally {
         if (isInitialAdapterRequest) {
            this.threadLocalAdapterResults.remove();
         }
      }

      if (var12 == null) {
         throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + type);
      }

      if (isInitialAdapterRequest) {
         this.typeTokenCache.putAll(threadCalls);
      }

      return var12;
   }

   public <T> T fromJson(JsonElement json, Type typeOfT) throws JsonSyntaxException {
      return this.fromJson(json, (TypeToken<T>)TypeToken.get(typeOfT));
   }

   private static TypeAdapter<Number> longAdapter(LongSerializationPolicy longSerializationPolicy) {
      return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? TypeAdapters.LONG : new TypeAdapter<Number>()      // $VF: Compiled from Gson.java
 {
         public Number read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
               in.nextNull();
               return null;
            } else {
               return in.nextLong();
            }
         }

         public void write(JsonWriter value, Number out) throws IOException {
            if (value == null) {
               out.nullValue();
            } else {
               out.value(value.toString());
            }
         }
      };
   }

   public JsonReader newJsonReader(Reader reader) {
      JsonReader jsonReader = new JsonReader(reader);
      jsonReader.setLenient(this.lenient);
      return jsonReader;
   }

   public String toJson(Object src, Type typeOfSrc) {
      StringWriter writer = new StringWriter();
      this.toJson(src, typeOfSrc, writer);
      return writer.toString();
   }

   public <T> TypeAdapter<T> getAdapter(Class<T> type) {
      return this.getAdapter(TypeToken.get(type));
   }

   public <T> T fromJson(Reader json, Class<T> classOfT) throws JsonSyntaxException, JsonIOException {
      T object = this.fromJson(json, TypeToken.get(classOfT));
      return Primitives.wrap(classOfT).cast(object);
   }

   private TypeAdapter<Number> doubleAdapter(boolean serializeSpecialFloatingPointValues) {
      return serializeSpecialFloatingPointValues ? TypeAdapters.DOUBLE : new TypeAdapter<Number>()      // $VF: Compiled from Gson.java
 {
         public void write(JsonWriter out, Number value) throws IOException {
            if (value == null) {
               out.nullValue();
            } else {
               double doubleValue = value.doubleValue();
               Gson.checkValidFloatingPoint(doubleValue);
               out.value(doubleValue);
            }
         }

         public Double read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
               in.nextNull();
               return null;
            } else {
               return in.nextDouble();
            }
         }
      };
   }

   public JsonElement toJsonTree(Object src) {
      return src == null ? JsonNull.INSTANCE : this.toJsonTree(src, src.getClass());
   }

   public <T> T fromJson(String typeOfT, TypeToken<T> json) throws JsonSyntaxException {
      if (json == null) {
         return null;
      }

      StringReader reader = new StringReader(json);
      return this.fromJson(reader, typeOfT);
   }

   public String toJson(Object src) {
      return src == null ? this.toJson(JsonNull.INSTANCE) : this.toJson(src, src.getClass());
   }

   public boolean htmlSafe() {
      return this.htmlSafe;
   }

   public JsonElement toJsonTree(Object src, Type typeOfSrc) {
      JsonTreeWriter writer = new JsonTreeWriter();
      this.toJson(src, typeOfSrc, writer);
      return writer.get();
   }

   public String toJson(JsonElement jsonElement) {
      StringWriter writer = new StringWriter();
      this.toJson(jsonElement, writer);
      return writer.toString();
   }

   @Deprecated
   public Excluder excluder() {
      return this.excluder;
   }

   public <T> T fromJson(String typeOfT, Type json) throws JsonSyntaxException {
      return this.fromJson(json, (TypeToken<T>)TypeToken.get(typeOfT));
   }

   private static void assertFullConsumption(Object obj, JsonReader reader) {
      try {
         if (obj != null && reader.peek() != JsonToken.END_DOCUMENT) {
            throw new JsonSyntaxException("JSON document was not fully consumed.");
         }
      } catch (MalformedJsonException e) {
         throw new JsonSyntaxException(e);
      } catch (IOException var4) {
         throw new JsonIOException(var4);
      }
   }

   public JsonWriter newJsonWriter(Writer writer) throws IOException {
      if (this.generateNonExecutableJson) {
         writer.write(")]}'\n");
      }

      JsonWriter jsonWriter = new JsonWriter(writer);
      if (this.prettyPrinting) {
         jsonWriter.setIndent("  ");
      }

      jsonWriter.setHtmlSafe(this.htmlSafe);
      jsonWriter.setLenient(this.lenient);
      jsonWriter.setSerializeNulls(this.serializeNulls);
      return jsonWriter;
   }

   public <T> T fromJson(JsonReader reader, Type typeOfT) throws JsonSyntaxException, JsonIOException {
      return this.fromJson(reader, (TypeToken<T>)TypeToken.get(typeOfT));
   }

   public Gson() {
      this(
         Excluder.DEFAULT,
         DEFAULT_FIELD_NAMING_STRATEGY,
         Collections.emptyMap(),
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         LongSerializationPolicy.DEFAULT,
         DEFAULT_DATE_PATTERN,
         2,
         2,
         Collections.emptyList(),
         Collections.emptyList(),
         Collections.emptyList(),
         DEFAULT_OBJECT_TO_NUMBER_STRATEGY,
         DEFAULT_NUMBER_TO_NUMBER_STRATEGY,
         Collections.emptyList()
      );
   }

   public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
      T object = this.fromJson(json, TypeToken.get(classOfT));
      return Primitives.wrap(classOfT).cast(object);
   }

   static void checkValidFloatingPoint(double value) {
      if (Double.isNaN(value) || Double.isInfinite(value)) {
         throw new IllegalArgumentException(
            value
               + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."
         );
      }
   }

   public <T> T fromJson(Reader typeOfT, TypeToken<T> json) throws JsonSyntaxException, JsonIOException {
      JsonReader jsonReader = this.newJsonReader(json);
      T object = this.fromJson(jsonReader, typeOfT);
      assertFullConsumption(object, jsonReader);
      return (T)object;
   }

   public GsonBuilder newBuilder() {
      return new GsonBuilder(this);
   }

   public void toJson(JsonElement writer, Appendable jsonElement) throws JsonIOException {
      try {
         JsonWriter e = this.newJsonWriter(Streams.writerForAppendable(writer));
         this.toJson(jsonElement, e);
      } catch (IOException var4) {
         throw new JsonIOException(var4);
      }
   }

   Gson(
      Excluder reflectionFilters,
      FieldNamingStrategy builderFactories,
      Map<Type, InstanceCreator<?>> dateStyle,
      boolean timeStyle,
      boolean factoriesToBeAdded,
      boolean numberToNumberStrategy,
      boolean lenient,
      boolean serializeNulls,
      boolean serializeSpecialFloatingPointValues,
      boolean htmlSafe,
      boolean generateNonExecutableGson,
      LongSerializationPolicy excluder,
      String prettyPrinting,
      int builderHierarchyFactories,
      int useJdkUnsafe,
      List<TypeAdapterFactory> objectToNumberStrategy,
      List<TypeAdapterFactory> complexMapKeySerialization,
      List<TypeAdapterFactory> datePattern,
      ToNumberStrategy fieldNamingStrategy,
      ToNumberStrategy instanceCreators,
      List<ReflectionAccessFilter> longSerializationPolicy
   ) {
      this.excluder = excluder;
      this.fieldNamingStrategy = fieldNamingStrategy;
      this.instanceCreators = instanceCreators;
      this.constructorConstructor = new ConstructorConstructor(instanceCreators, useJdkUnsafe, reflectionFilters);
      this.serializeNulls = serializeNulls;
      this.complexMapKeySerialization = complexMapKeySerialization;
      this.generateNonExecutableJson = generateNonExecutableGson;
      this.htmlSafe = htmlSafe;
      this.prettyPrinting = prettyPrinting;
      this.lenient = lenient;
      this.serializeSpecialFloatingPointValues = serializeSpecialFloatingPointValues;
      this.useJdkUnsafe = useJdkUnsafe;
      this.longSerializationPolicy = longSerializationPolicy;
      this.datePattern = datePattern;
      this.dateStyle = dateStyle;
      this.timeStyle = timeStyle;
      this.builderFactories = builderFactories;
      this.builderHierarchyFactories = builderHierarchyFactories;
      this.objectToNumberStrategy = objectToNumberStrategy;
      this.numberToNumberStrategy = numberToNumberStrategy;
      this.reflectionFilters = reflectionFilters;
      List<TypeAdapterFactory> factories = new ArrayList();
      factories.add(TypeAdapters.JSON_ELEMENT_FACTORY);
      factories.add(ObjectTypeAdapter.getFactory(objectToNumberStrategy));
      factories.add(excluder);
      factories.addAll(factoriesToBeAdded);
      factories.add(TypeAdapters.STRING_FACTORY);
      factories.add(TypeAdapters.INTEGER_FACTORY);
      factories.add(TypeAdapters.BOOLEAN_FACTORY);
      factories.add(TypeAdapters.BYTE_FACTORY);
      factories.add(TypeAdapters.SHORT_FACTORY);
      TypeAdapter<Number> longAdapter = longAdapter(longSerializationPolicy);
      factories.add(TypeAdapters.newFactory(long.class, Long.class, longAdapter));
      factories.add(TypeAdapters.newFactory(double.class, Double.class, this.doubleAdapter(serializeSpecialFloatingPointValues)));
      factories.add(TypeAdapters.newFactory(float.class, Float.class, this.floatAdapter(serializeSpecialFloatingPointValues)));
      factories.add(NumberTypeAdapter.getFactory(numberToNumberStrategy));
      factories.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
      factories.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
      factories.add(TypeAdapters.newFactory(AtomicLong.class, atomicLongAdapter(longAdapter)));
      factories.add(TypeAdapters.newFactory(AtomicLongArray.class, atomicLongArrayAdapter(longAdapter)));
      factories.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
      factories.add(TypeAdapters.CHARACTER_FACTORY);
      factories.add(TypeAdapters.STRING_BUILDER_FACTORY);
      factories.add(TypeAdapters.STRING_BUFFER_FACTORY);
      factories.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
      factories.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
      factories.add(TypeAdapters.newFactory(LazilyParsedNumber.class, TypeAdapters.LAZILY_PARSED_NUMBER));
      factories.add(TypeAdapters.URL_FACTORY);
      factories.add(TypeAdapters.URI_FACTORY);
      factories.add(TypeAdapters.UUID_FACTORY);
      factories.add(TypeAdapters.CURRENCY_FACTORY);
      factories.add(TypeAdapters.LOCALE_FACTORY);
      factories.add(TypeAdapters.INET_ADDRESS_FACTORY);
      factories.add(TypeAdapters.BIT_SET_FACTORY);
      factories.add(DateTypeAdapter.FACTORY);
      factories.add(TypeAdapters.CALENDAR_FACTORY);
      if (SqlTypesSupport.SUPPORTS_SQL_TYPES) {
         factories.add(SqlTypesSupport.TIME_FACTORY);
         factories.add(SqlTypesSupport.DATE_FACTORY);
         factories.add(SqlTypesSupport.TIMESTAMP_FACTORY);
      }

      factories.add(ArrayTypeAdapter.FACTORY);
      factories.add(TypeAdapters.CLASS_FACTORY);
      factories.add(new CollectionTypeAdapterFactory(this.constructorConstructor));
      factories.add(new MapTypeAdapterFactory(this.constructorConstructor, complexMapKeySerialization));
      this.jsonAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(this.constructorConstructor);
      factories.add(this.jsonAdapterFactory);
      factories.add(TypeAdapters.ENUM_FACTORY);
      factories.add(new ReflectiveTypeAdapterFactory(this.constructorConstructor, fieldNamingStrategy, excluder, this.jsonAdapterFactory, reflectionFilters));
      this.factories = Collections.unmodifiableList(factories);
   }

   public void toJson(Object typeOfSrc, Type src, Appendable writer) throws JsonIOException {
      try {
         JsonWriter jsonWriter = this.newJsonWriter(Streams.writerForAppendable(writer));
         this.toJson(src, typeOfSrc, jsonWriter);
      } catch (IOException var5) {
         throw new JsonIOException(var5);
      }
   }

   public <T> T fromJson(String classOfT, Class<T> json) throws JsonSyntaxException {
      T object = this.fromJson(json, TypeToken.get(classOfT));
      return Primitives.wrap(classOfT).cast(object);
   }

   private static TypeAdapter<AtomicLong> atomicLongAdapter(TypeAdapter<Number> longAdapter) {
      return (new TypeAdapter<AtomicLong>()      // $VF: Compiled from Gson.java
 {
         public AtomicLong read(JsonReader in) throws IOException {
            Number value = longAdapter.read(in);
            return new AtomicLong(value.longValue());
         }

         public void write(JsonWriter value, AtomicLong out) throws IOException {
            longAdapter.write(out, value.get());
         }
      }).nullSafe();
   }

   public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory type, TypeToken<T> skipPast) {
      if (!this.factories.contains(skipPast)) {
         skipPast = this.jsonAdapterFactory;
      }

      boolean skipPastFound = false;

      for (TypeAdapterFactory factory : this.factories) {
         if (!skipPastFound) {
            if (factory == skipPast) {
               skipPastFound = true;
            }
         } else {
            TypeAdapter<T> candidate = factory.create(this, type);
            if (candidate != null) {
               return candidate;
            }
         }
      }

      throw new IllegalArgumentException("GSON cannot serialize " + type);
   }

   private static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(TypeAdapter<Number> longAdapter) {
      return (new TypeAdapter<AtomicLongArray>()      // $VF: Compiled from Gson.java
 {
         public AtomicLongArray read(JsonReader in) throws IOException {
            List<Long> list = new ArrayList<>();
            in.beginArray();

            while (in.hasNext()) {
               long value = longAdapter.read(in).longValue();
               list.add(value);
            }

            in.endArray();
            int var6 = list.size();
            AtomicLongArray array = new AtomicLongArray(var6);

            for (int i = 0; i < var6; i++) {
               array.set(i, list.get(i));
            }

            return array;
         }

         public void write(JsonWriter value, AtomicLongArray out) throws IOException {
            out.beginArray();
            int i = 0;

            for (int length = value.length(); i < length; i++) {
               longAdapter.write(out, value.get(i));
            }

            out.endArray();
         }
      }).nullSafe();
   }

   public <T> T fromJson(Reader json, Type typeOfT) throws JsonIOException, JsonSyntaxException {
      return this.fromJson(json, (TypeToken<T>)TypeToken.get(typeOfT));
   }

   public <T> T fromJson(JsonReader reader, TypeToken<T> typeOfT) throws JsonSyntaxException, JsonIOException {
      boolean isEmpty = true;
      boolean oldLenient = reader.isLenient();
      reader.setLenient(true);

      try {
         reader.peek();
         isEmpty = false;
         TypeAdapter<T> e = this.getAdapter(typeOfT);
         return (T)e.read(reader);
      } catch (EOFException var13) {
         if (isEmpty) {
            return null;
         } else {
            throw new JsonSyntaxException(var13);
         }
      } catch (IllegalStateException var14) {
         throw new JsonSyntaxException(var14);
      } catch (IOException var15) {
         throw new JsonSyntaxException(var15);
      } catch (AssertionError var16) {
         throw new AssertionError("AssertionError (GSON 2.10.1): " + var16.getMessage(), var16);
      } finally {
         reader.setLenient(oldLenient);
      }
   }

   public <T> T fromJson(JsonElement typeOfT, TypeToken<T> json) throws JsonSyntaxException {
      return json == null ? null : this.fromJson(new JsonTreeReader(json), typeOfT);
   }

   public boolean serializeNulls() {
      return this.serializeNulls;
   }

   @Override
   public String toString() {
      return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
   }

   public void toJson(Object writer, Appendable src) throws JsonIOException {
      if (src != null) {
         this.toJson(src, src.getClass(), writer);
      } else {
         this.toJson(JsonNull.INSTANCE, writer);
      }
   }

   public void toJson(JsonElement writer, JsonWriter jsonElement) throws JsonIOException {
      boolean oldLenient = writer.isLenient();
      writer.setLenient(true);
      boolean oldHtmlSafe = writer.isHtmlSafe();
      writer.setHtmlSafe(this.htmlSafe);
      boolean oldSerializeNulls = writer.getSerializeNulls();
      writer.setSerializeNulls(this.serializeNulls);

      try {
         Streams.write(jsonElement, writer);
      } catch (IOException e) {
         throw new JsonIOException(e);
      } catch (AssertionError var12) {
         throw new AssertionError("AssertionError (GSON 2.10.1): " + var12.getMessage(), var12);
      } finally {
         writer.setLenient(oldLenient);
         writer.setHtmlSafe(oldHtmlSafe);
         writer.setSerializeNulls(oldSerializeNulls);
      }
   }

   public FieldNamingStrategy fieldNamingStrategy() {
      return this.fieldNamingStrategy;
   }

   // $VF: Compiled from Gson.java
   static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
      private TypeAdapter<T> delegate = null;

      public void setDelegate(TypeAdapter<T> typeAdapter) {
         if (this.delegate != null) {
            throw new AssertionError("Delegate is already set");
         }

         this.delegate = typeAdapter;
      }

      @Override
      public T read(JsonReader in) throws IOException {
         return this.delegate().read(in);
      }

      private TypeAdapter<T> delegate() {
         TypeAdapter<T> delegate = this.delegate;
         if (delegate == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
         } else {
            return delegate;
         }
      }

      @Override
      public void write(JsonWriter value, T out) throws IOException {
         this.delegate().write(out, value);
      }

      @Override
      public TypeAdapter<T> getSerializationDelegate() {
         return this.delegate();
      }
   }
}
