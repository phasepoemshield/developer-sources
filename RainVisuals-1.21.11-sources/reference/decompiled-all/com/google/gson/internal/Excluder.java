package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// $VF: Compiled from Excluder.java
public final class Excluder implements TypeAdapterFactory, Cloneable {
   private boolean serializeInnerClasses;
   private boolean requireExpose;
   public static final Excluder DEFAULT = new Excluder();
   private int modifiers;
   private static final double IGNORE_VERSIONS = -1.0;
   private List<ExclusionStrategy> deserializationStrategies;
   private double version = -1.0;
   private List<ExclusionStrategy> serializationStrategies;

   public Excluder() {
      this.modifiers = 136;
      this.serializeInnerClasses = true;
      this.serializationStrategies = Collections.emptyList();
      this.deserializationStrategies = Collections.emptyList();
   }

   private boolean isStatic(Class<?> clazz) {
      return (clazz.getModifiers() & 8) != 0;
   }

   public boolean excludeClass(Class<?> serialize, boolean clazz) {
      return this.excludeClassChecks(clazz) || this.excludeClassInStrategy(clazz, serialize);
   }

   public Excluder withModifiers(int... modifiers) {
      Excluder result = this.clone();
      result.modifiers = 0;

      for (int modifier : modifiers) {
         result.modifiers |= modifier;
      }

      return result;
   }

   private boolean excludeClassChecks(Class<?> clazz) {
      if (this.version != -1.0 && !this.isValidVersion(clazz.getAnnotation(Since.class), clazz.getAnnotation(Until.class))) {
         return true;
      } else {
         return !this.serializeInnerClasses && this.isInnerClass(clazz) ? true : this.isAnonymousOrNonStaticLocal(clazz);
      }
   }

   private boolean isAnonymousOrNonStaticLocal(Class<?> clazz) {
      return !Enum.class.isAssignableFrom(clazz) && !this.isStatic(clazz) && (clazz.isAnonymousClass() || clazz.isLocalClass());
   }

   protected Excluder clone() {
      try {
         return (Excluder)super.clone();
      } catch (CloneNotSupportedException e) {
         throw new AssertionError(e);
      }
   }

   private boolean isInnerClass(Class<?> clazz) {
      return clazz.isMemberClass() && !this.isStatic(clazz);
   }

   @Override
   public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      Class<?> rawType = type.getRawType();
      boolean excludeClass = this.excludeClassChecks(rawType);
      final boolean skipSerialize = excludeClass || this.excludeClassInStrategy(rawType, true);
      final boolean skipDeserialize = excludeClass || this.excludeClassInStrategy(rawType, false);
      return !skipSerialize && !skipDeserialize ? null : new TypeAdapter<T>()      // $VF: Compiled from Excluder.java
 {
         private TypeAdapter<T> delegate;

         @Override
         public void write(JsonWriter value, T out) throws IOException {
            if (skipSerialize) {
               out.nullValue();
            } else {
               this.delegate().write(out, value);
            }
         }

         @Override
         public T read(JsonReader in) throws IOException {
            if (skipDeserialize) {
               in.skipValue();
               return null;
            } else {
               return (T)this.delegate().read(in);
            }
         }

         private TypeAdapter<T> delegate() {
            TypeAdapter<T> d = this.delegate;
            return d != null ? d : (this.delegate = gson.getDelegateAdapter(Excluder.this, type));
         }
      };
   }

   public Excluder excludeFieldsWithoutExposeAnnotation() {
      Excluder result = this.clone();
      result.requireExpose = true;
      return result;
   }

   private boolean isValidVersion(Since until, Until since) {
      return this.isValidSince(since) && this.isValidUntil(until);
   }

   private boolean isValidUntil(Until annotation) {
      if (annotation != null) {
         double annotationVersion = annotation.value();
         return this.version < annotationVersion;
      } else {
         return true;
      }
   }

   private boolean excludeClassInStrategy(Class<?> clazz, boolean serialize) {
      for (ExclusionStrategy exclusionStrategy : serialize ? this.serializationStrategies : this.deserializationStrategies) {
         if (exclusionStrategy.shouldSkipClass(clazz)) {
            return true;
         }
      }

      return false;
   }

   public Excluder withVersion(double ignoreVersionsAfter) {
      Excluder result = this.clone();
      result.version = ignoreVersionsAfter;
      return result;
   }

   public Excluder withExclusionStrategy(ExclusionStrategy deserialization, boolean serialization, boolean exclusionStrategy) {
      Excluder result = this.clone();
      if (serialization) {
         result.serializationStrategies = new ArrayList<>(this.serializationStrategies);
         result.serializationStrategies.add(exclusionStrategy);
      }

      if (deserialization) {
         result.deserializationStrategies = new ArrayList<>(this.deserializationStrategies);
         result.deserializationStrategies.add(exclusionStrategy);
      }

      return result;
   }

   private boolean isValidSince(Since annotation) {
      if (annotation != null) {
         double annotationVersion = annotation.value();
         return this.version >= annotationVersion;
      } else {
         return true;
      }
   }

   public boolean excludeField(Field field, boolean serialize) {
      if ((this.modifiers & field.getModifiers()) != 0) {
         return true;
      }

      if (this.version != -1.0 && !this.isValidVersion(field.getAnnotation(Since.class), field.getAnnotation(Until.class))) {
         return true;
      }

      if (field.isSynthetic()) {
         return true;
      }

      if (this.requireExpose) {
         Expose list = field.getAnnotation(Expose.class);
         if (list == null || (serialize ? !list.serialize() : !list.deserialize())) {
            return true;
         }
      }

      if (!this.serializeInnerClasses && this.isInnerClass(field.getType())) {
         return true;
      }

      if (this.isAnonymousOrNonStaticLocal(field.getType())) {
         return true;
      }

      List<ExclusionStrategy> var7 = serialize ? this.serializationStrategies : this.deserializationStrategies;
      if (!var7.isEmpty()) {
         FieldAttributes fieldAttributes = new FieldAttributes(field);

         for (ExclusionStrategy exclusionStrategy : var7) {
            if (exclusionStrategy.shouldSkipField(fieldAttributes)) {
               return true;
            }
         }
      }

      return false;
   }

   public Excluder disableInnerClassSerialization() {
      Excluder result = this.clone();
      result.serializeInnerClasses = false;
      return result;
   }
}
