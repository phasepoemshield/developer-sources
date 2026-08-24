package com.kenai.jffi;

import java.util.EnumSet;

// $VF: Compiled from ObjectParameterType.java
public final class ObjectParameterType {
   public static final ObjectParameterType.ComponentType BYTE = ObjectParameterType.ComponentType.BYTE;
   final int typeInfo;
   static final ObjectParameterType NONE = new ObjectParameterType(0);
   public static final ObjectParameterType.ComponentType LONG = ObjectParameterType.ComponentType.LONG;
   static final ObjectParameterType INVALID = new ObjectParameterType(0);
   public static final ObjectParameterType.ComponentType DOUBLE = ObjectParameterType.ComponentType.DOUBLE;
   public static final ObjectParameterType.ObjectType ARRAY = ObjectParameterType.ObjectType.ARRAY;
   public static final ObjectParameterType.ComponentType SHORT = ObjectParameterType.ComponentType.SHORT;
   public static final ObjectParameterType.ObjectType BUFFER = ObjectParameterType.ObjectType.BUFFER;
   public static final ObjectParameterType.ComponentType CHAR = ObjectParameterType.ComponentType.CHAR;
   public static final ObjectParameterType.ComponentType INT = ObjectParameterType.ComponentType.INT;
   public static final ObjectParameterType.ComponentType BOOLEAN = ObjectParameterType.ComponentType.BOOLEAN;
   public static final ObjectParameterType.ComponentType FLOAT = ObjectParameterType.ComponentType.FLOAT;

   @Override
   public int hashCode() {
      return this.typeInfo;
   }

   @Override
   public boolean equals(Object o) {
      return this == o || o instanceof ObjectParameterType && this.typeInfo == ((ObjectParameterType)o).typeInfo;
   }

   ObjectParameterType(int typeInfo) {
      this.typeInfo = typeInfo;
   }

   public static ObjectParameterType create(ObjectParameterType.ObjectType objectType, ObjectParameterType.ComponentType componentType) {
      if (objectType == ObjectParameterType.ObjectType.ARRAY) {
         return ObjectParameterType.TypeCache.arrayTypeCache[componentType.ordinal()];
      } else {
         return objectType == ObjectParameterType.ObjectType.BUFFER
            ? ObjectParameterType.TypeCache.bufferTypeCache[componentType.ordinal()]
            : new ObjectParameterType(objectType.value | componentType.value);
      }
   }

   ObjectParameterType(ObjectParameterType.ObjectType componentType, ObjectParameterType.ComponentType objectType) {
      this.typeInfo = objectType.value | componentType.value;
   }

   // $VF: Compiled from ObjectParameterType.java
   public enum ComponentType {
      CHAR(134217728),
      BYTE(16777216),
      FLOAT(83886080),
      INT(50331648),
      BOOLEAN(117440512),
      LONG(67108864),
      SHORT(33554432),
      DOUBLE(100663296);

      final int value;

      ComponentType(int type) {
         this.value = type;
      }
   }

   // $VF: Compiled from ObjectParameterType.java
   public enum ObjectType {
      ARRAY(268435456),
      BUFFER(536870912);

      final int value;

      ObjectType(int type) {
         this.value = type;
      }
   }

   // $VF: Compiled from ObjectParameterType.java
   private static final class TypeCache {
      static final ObjectParameterType[] bufferTypeCache;
      static final ObjectParameterType[] arrayTypeCache;

      static {
         EnumSet<ObjectParameterType.ComponentType> componentTypes = EnumSet.allOf(ObjectParameterType.ComponentType.class);
         arrayTypeCache = new ObjectParameterType[componentTypes.size()];
         bufferTypeCache = new ObjectParameterType[componentTypes.size()];

         for (ObjectParameterType.ComponentType componentType : componentTypes) {
            arrayTypeCache[componentType.ordinal()] = new ObjectParameterType(ObjectParameterType.ARRAY, componentType);
            bufferTypeCache[componentType.ordinal()] = new ObjectParameterType(ObjectParameterType.BUFFER, componentType);
         }
      }
   }
}
