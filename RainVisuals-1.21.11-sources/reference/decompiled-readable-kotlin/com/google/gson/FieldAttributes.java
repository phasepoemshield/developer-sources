package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

// $VF: Compiled from FieldAttributes.java
public final class FieldAttributes {
   private final Field field;

   public Class<?> getDeclaringClass() {
      return this.field.getDeclaringClass();
   }

   public FieldAttributes(Field f) {
      this.field = Objects.requireNonNull(f);
   }

   public boolean hasModifier(int modifier) {
      return (this.field.getModifiers() & modifier) != 0;
   }

   public <T extends Annotation> T getAnnotation(Class<T> annotation) {
      return this.field.getAnnotation(annotation);
   }

   public Type getDeclaredType() {
      return this.field.getGenericType();
   }

   public String getName() {
      return this.field.getName();
   }

   public Class<?> getDeclaredClass() {
      return this.field.getType();
   }

   public Collection<Annotation> getAnnotations() {
      return Arrays.asList(this.field.getAnnotations());
   }

   @Override
   public String toString() {
      return this.field.toString();
   }
}
