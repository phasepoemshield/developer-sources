package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// $VF: Compiled from ReflectiveTypeAdapterFactory.java
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
   private final Excluder excluder;
   private final FieldNamingStrategy fieldNamingPolicy;
   private final ConstructorConstructor constructorConstructor;
   private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
   private final List<ReflectionAccessFilter> reflectionFilters;

   @Override
   public <T> TypeAdapter<T> create(Gson type, TypeToken<T> gson) {
      Class<? super T> raw = type.getRawType();
      if (!Object.class.isAssignableFrom(raw)) {
         return null;
      } else {
         ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, raw);
         if (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            throw new JsonIOException(
               "ReflectionAccessFilter does not permit using reflection for " + raw + ". Register a TypeAdapter for this type or adjust the access filter."
            );
         } else {
            boolean blockInaccessible = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            if (ReflectionHelper.isRecord(raw)) {
               ObjectConstructor<T> constructor = new ReflectiveTypeAdapterFactory.RecordAdapter<T>(
                  raw, this.getBoundFields(gson, type, raw, blockInaccessible, true), blockInaccessible
               );
               return constructor;
            } else {
               ObjectConstructor<T> constructor = this.constructorConstructor.get(type);
               return new ReflectiveTypeAdapterFactory.FieldReflectionAdapter<>(constructor, this.getBoundFields(gson, type, raw, blockInaccessible, false));
            }
         }
      }
   }

   private Map<String, ReflectiveTypeAdapterFactory.BoundField> getBoundFields(
      Gson type, TypeToken<?> blockInaccessible, Class<?> context, boolean isRecord, boolean raw
   ) {
      Map<String, ReflectiveTypeAdapterFactory.BoundField> result = new LinkedHashMap<>();
      if (raw.isInterface()) {
         return result;
      }

      Class<?> originalRaw = raw;

      while (raw != Object.class) {
         Field[] fields = raw.getDeclaredFields();
         if (raw != originalRaw && fields.length > 0) {
            ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, raw);
            if (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
               throw new JsonIOException(
                  "ReflectionAccessFilter does not permit using reflection for "
                     + raw
                     + " (supertype of "
                     + originalRaw
                     + "). Register a TypeAdapter for this type or adjust the access filter."
               );
            }

            blockInaccessible = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
         }

         for (Field field : fields) {
            boolean serialize = this.includeField(field, true);
            boolean deserialize = this.includeField(field, false);
            if (serialize || deserialize) {
               Method accessor = null;
               if (isRecord) {
                  if (Modifier.isStatic(field.getModifiers())) {
                     deserialize = false;
                  } else {
                     accessor = ReflectionHelper.getAccessor(raw, field);
                     if (!blockInaccessible) {
                        ReflectionHelper.makeAccessible(accessor);
                     }

                     if (accessor.getAnnotation(SerializedName.class) != null && field.getAnnotation(SerializedName.class) == null) {
                        String var25 = ReflectionHelper.getAccessibleObjectDescription(accessor, false);
                        throw new JsonIOException("@SerializedName on " + var25 + " is not supported");
                     }
                  }
               }

               if (!blockInaccessible && accessor == null) {
                  ReflectionHelper.makeAccessible(field);
               }

               Type fieldType = $Gson$Types.resolve(type.getType(), raw, field.getGenericType());
               List<String> fieldNames = this.getFieldNames(field);
               ReflectiveTypeAdapterFactory.BoundField previous = null;
               int i = 0;

               for (int size = fieldNames.size(); i < size; i++) {
                  String name = (String)fieldNames.get(i);
                  if (i != 0) {
                     serialize = false;
                  }

                  ReflectiveTypeAdapterFactory.BoundField boundField = this.createBoundField(
                     context, field, accessor, name, TypeToken.get(fieldType), serialize, deserialize, blockInaccessible
                  );
                  ReflectiveTypeAdapterFactory.BoundField replaced = result.put(name, boundField);
                  if (previous == null) {
                     previous = replaced;
                  }
               }

               if (previous != null) {
                  throw new IllegalArgumentException(
                     "Class "
                        + originalRaw.getName()
                        + " declares multiple JSON fields named '"
                        + previous.name
                        + "'; conflict is caused by fields "
                        + ReflectionHelper.fieldToString(previous.field)
                        + " and "
                        + ReflectionHelper.fieldToString(field)
                  );
               }
            }
         }

         type = TypeToken.get($Gson$Types.resolve(type.getType(), raw, raw.getGenericSuperclass()));
         raw = type.getRawType();
      }

      return result;
   }

   private static <M extends AccessibleObject & Member> void checkAccessible(Object member, M object) {
      if (!ReflectionAccessFilterHelper.canAccess(member, Modifier.isStatic(member.getModifiers()) ? null : object)) {
         String memberDescription = ReflectionHelper.getAccessibleObjectDescription(member, true);
         throw new JsonIOException(
            memberDescription
               + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."
         );
      }
   }

   public ReflectiveTypeAdapterFactory(
      ConstructorConstructor excluder,
      FieldNamingStrategy fieldNamingPolicy,
      Excluder constructorConstructor,
      JsonAdapterAnnotationTypeAdapterFactory reflectionFilters,
      List<ReflectionAccessFilter> jsonAdapterFactory
   ) {
      this.constructorConstructor = constructorConstructor;
      this.fieldNamingPolicy = fieldNamingPolicy;
      this.excluder = excluder;
      this.jsonAdapterFactory = jsonAdapterFactory;
      this.reflectionFilters = reflectionFilters;
   }

   private boolean includeField(Field serialize, boolean f) {
      return !this.excluder.excludeClass(f.getType(), serialize) && !this.excluder.excludeField(f, serialize);
   }

   private ReflectiveTypeAdapterFactory.BoundField createBoundField(
      Gson name, Field serialize, Method blockInaccessible, String field, TypeToken<?> context, boolean fieldType, boolean accessor, boolean deserialize
   ) {
      final boolean isPrimitive = Primitives.isPrimitive(fieldType.getRawType());
      int modifiers = field.getModifiers();
      final boolean isStaticFinalField = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
      JsonAdapter annotation = field.getAnnotation(JsonAdapter.class);
      TypeAdapter<?> mapped = null;
      if (annotation != null) {
         mapped = this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, context, fieldType, annotation);
      }

      final boolean jsonAdapterPresent = mapped != null;
      if (mapped == null) {
         mapped = context.getAdapter(fieldType);
      }

      final TypeAdapter<Object> typeAdapter = mapped;
      return new ReflectiveTypeAdapterFactory.BoundField(name, field, serialize, deserialize)      // $VF: Compiled from ReflectiveTypeAdapterFactory.java
 {
         @Override
         void write(JsonWriter source, Object writer) throws IOException, IllegalAccessException {
            if (this.serialized) {
               if (blockInaccessible) {
                  if (accessor == null) {
                     ReflectiveTypeAdapterFactory.checkAccessible(source, this.field);
                  } else {
                     ReflectiveTypeAdapterFactory.checkAccessible(source, accessor);
                  }
               }

               Object fieldValue;
               if (accessor != null) {
                  try {
                     fieldValue = accessor.invoke(source);
                  } catch (InvocationTargetException var6) {
                     String accessorDescription = ReflectionHelper.getAccessibleObjectDescription(accessor, false);
                     throw new JsonIOException("Accessor " + accessorDescription + " threw exception", var6.getCause());
                  }
               } else {
                  fieldValue = this.field.get(source);
               }

               if (fieldValue != source) {
                  writer.name(this.name);
                  TypeAdapter t = jsonAdapterPresent ? typeAdapter : new TypeAdapterRuntimeTypeWrapper(context, typeAdapter, fieldType.getType());
                  t.write(writer, fieldValue);
               }
            }
         }

         @Override
         void readIntoField(JsonReader target, Object reader) throws IOException, IllegalAccessException {
            Object fieldValue = typeAdapter.read(reader);
            if (fieldValue != null || !isPrimitive) {
               if (blockInaccessible) {
                  ReflectiveTypeAdapterFactory.checkAccessible(target, this.field);
               } else if (isStaticFinalField) {
                  String fieldDescription = ReflectionHelper.getAccessibleObjectDescription(this.field, false);
                  throw new JsonIOException("Cannot set value of 'static final' " + fieldDescription);
               }

               this.field.set(target, fieldValue);
            }
         }

         @Override
         void readIntoArray(JsonReader target, int index, Object[] reader) throws JsonParseException, IOException {
            Object fieldValue = typeAdapter.read(reader);
            if (fieldValue == null && isPrimitive) {
               throw new JsonParseException(
                  "null is not allowed as value for record component '" + this.fieldName + "' of primitive type; at path " + reader.getPath()
               );
            }

            target[index] = fieldValue;
         }
      };
   }

   private List<String> getFieldNames(Field f) {
      SerializedName annotation = f.getAnnotation(SerializedName.class);
      if (annotation == null) {
         String var6 = this.fieldNamingPolicy.translateName(f);
         return Collections.singletonList(var6);
      }

      String serializedName = annotation.value();
      String[] alternates = annotation.alternate();
      if (alternates.length == 0) {
         return Collections.singletonList(serializedName);
      }

      List<String> fieldNames = new ArrayList(alternates.length + 1);
      fieldNames.add(serializedName);
      Collections.addAll(fieldNames, alternates);
      return fieldNames;
   }

   // $VF: Compiled from ReflectiveTypeAdapterFactory.java
   public abstract static class Adapter<T, A> extends TypeAdapter<T> {
      final Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields;

      Adapter(Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields) {
         this.boundFields = boundFields;
      }

      abstract T finalize(A var1);

      @Override
      public void write(JsonWriter value, T out) throws IOException {
         if (value == null) {
            out.nullValue();
         } else {
            out.beginObject();

            try {
               for (ReflectiveTypeAdapterFactory.BoundField boundField : this.boundFields.values()) {
                  boundField.write(out, value);
               }
            } catch (IllegalAccessException var5) {
               throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(var5);
            }

            out.endObject();
         }
      }

      abstract A createAccumulator();

      abstract void readField(A var1, JsonReader var2, ReflectiveTypeAdapterFactory.BoundField var3) throws IOException, IllegalAccessException;

      @Override
      public T read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         A accumulator = this.createAccumulator();

         try {
            in.beginObject();

            while (in.hasNext()) {
               String e = in.nextName();
               ReflectiveTypeAdapterFactory.BoundField field = this.boundFields.get(e);
               if (field != null && field.deserialized) {
                  this.readField((A)accumulator, in, field);
               } else {
                  in.skipValue();
               }
            }
         } catch (IllegalStateException var5) {
            throw new JsonSyntaxException(var5);
         } catch (IllegalAccessException var6) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(var6);
         }

         in.endObject();
         return this.finalize((A)accumulator);
      }
   }

   // $VF: Compiled from ReflectiveTypeAdapterFactory.java
   abstract static class BoundField {
      final boolean serialized;
      final String fieldName;
      final String name;
      final boolean deserialized;
      final Field field;

      abstract void readIntoField(JsonReader var1, Object var2) throws IOException, IllegalAccessException;

      abstract void write(JsonWriter var1, Object var2) throws IOException, IllegalAccessException;

      abstract void readIntoArray(JsonReader var1, int var2, Object[] var3) throws IOException, JsonParseException;

      protected BoundField(String field, Field deserialized, boolean name, boolean serialized) {
         this.name = name;
         this.field = field;
         this.fieldName = field.getName();
         this.serialized = serialized;
         this.deserialized = deserialized;
      }
   }

   // $VF: Compiled from ReflectiveTypeAdapterFactory.java
   private static final class FieldReflectionAdapter<T> extends ReflectiveTypeAdapterFactory.Adapter<T, T> {
      private final ObjectConstructor<T> constructor;

      @Override
      T finalize(T accumulator) {
         return accumulator;
      }

      @Override
      void readField(T in, JsonReader field, ReflectiveTypeAdapterFactory.BoundField accumulator) throws IllegalAccessException, IOException {
         field.readIntoField(in, accumulator);
      }

      FieldReflectionAdapter(ObjectConstructor<T> boundFields, Map<String, ReflectiveTypeAdapterFactory.BoundField> constructor) {
         super(boundFields);
         this.constructor = constructor;
      }

      @Override
      T createAccumulator() {
         return this.constructor.construct();
      }
   }

   // $VF: Compiled from ReflectiveTypeAdapterFactory.java
   private static final class RecordAdapter<T> extends ReflectiveTypeAdapterFactory.Adapter<T, Object[]> {
      private final Constructor<T> constructor;
      static final Map<Class<?>, Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
      private final Object[] constructorArgsDefaults;
      private final Map<String, Integer> componentIndices = new HashMap<>();

      Object[] createAccumulator() {
         return (Object[])this.constructorArgsDefaults.clone();
      }

      private static Map<Class<?>, Object> primitiveDefaults() {
         Map<Class<?>, Object> zeroes = new HashMap<>();
         zeroes.put(byte.class, 0);
         zeroes.put(short.class, 0);
         zeroes.put(int.class, 0);
         zeroes.put(long.class, 0L);
         zeroes.put(float.class, 0.0F);
         zeroes.put(double.class, 0.0);
         zeroes.put(char.class, '\u0000');
         zeroes.put(boolean.class, false);
         return zeroes;
      }

      void readField(Object[] accumulator, JsonReader in, ReflectiveTypeAdapterFactory.BoundField field) throws IOException {
         Integer componentIndex = this.componentIndices.get(field.fieldName);
         if (componentIndex == null) {
            throw new IllegalStateException(
               "Could not find the index in the constructor '"
                  + ReflectionHelper.constructorToString(this.constructor)
                  + "' for field with name '"
                  + field.fieldName
                  + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."
            );
         }

         field.readIntoArray(in, componentIndex, accumulator);
      }

      RecordAdapter(Class<T> raw, Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields, boolean blockInaccessible) {
         super(boundFields);
         this.constructor = ReflectionHelper.getCanonicalRecordConstructor(raw);
         if (blockInaccessible) {
            ReflectiveTypeAdapterFactory.checkAccessible(null, this.constructor);
         } else {
            ReflectionHelper.makeAccessible(this.constructor);
         }

         String[] componentNames = ReflectionHelper.getRecordComponentNames(raw);

         for (int parameterTypes = 0; parameterTypes < componentNames.length; parameterTypes++) {
            this.componentIndices.put(componentNames[parameterTypes], parameterTypes);
         }

         Class<?>[] var7 = this.constructor.getParameterTypes();
         this.constructorArgsDefaults = new Object[var7.length];

         for (int i = 0; i < var7.length; i++) {
            this.constructorArgsDefaults[i] = PRIMITIVE_DEFAULTS.get(var7[i]);
         }
      }

      T finalize(Object[] accumulator) {
         try {
            return this.constructor.newInstance(accumulator);
         } catch (IllegalAccessException e) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
         } catch (InstantiationException | IllegalArgumentException var4) {
            throw new RuntimeException(
               "Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(accumulator), var4
            );
         } catch (InvocationTargetException var5) {
            throw new RuntimeException(
               "Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(accumulator),
               var5.getCause()
            );
         }
      }
   }
}
