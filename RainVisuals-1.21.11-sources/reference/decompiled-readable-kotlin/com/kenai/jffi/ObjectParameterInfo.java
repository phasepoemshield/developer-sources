package com.kenai.jffi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// $VF: Compiled from ObjectParameterInfo.java
public final class ObjectParameterInfo {
   public static final ObjectParameterInfo.ObjectType ARRAY = ObjectParameterInfo.ObjectType.ARRAY;
   public static final int NULTERMINATE = 4;
   public static final ObjectParameterInfo.ComponentType BOOLEAN = ObjectParameterInfo.ComponentType.BOOLEAN;
   private final int objectInfo;
   public static final int CLEAR = 16;
   public static final ObjectParameterInfo.ComponentType CHAR = ObjectParameterInfo.ComponentType.CHAR;
   public static final ObjectParameterInfo.ComponentType FLOAT = ObjectParameterInfo.ComponentType.FLOAT;
   private final int ioflags;
   public static final ObjectParameterInfo.ComponentType BYTE = ObjectParameterInfo.ComponentType.BYTE;
   private final int parameterIndex;
   public static final ObjectParameterInfo.ComponentType DOUBLE = ObjectParameterInfo.ComponentType.DOUBLE;
   public static final ObjectParameterInfo.ComponentType LONG = ObjectParameterInfo.ComponentType.LONG;
   public static final int IN = 1;
   public static final ObjectParameterInfo.ComponentType INT = ObjectParameterInfo.ComponentType.INT;
   public static final int PINNED = 8;
   public static final int OUT = 2;
   private static final ConcurrentMap<Integer, ObjectParameterInfo> CACHE = new ConcurrentHashMap<>();
   public static final ObjectParameterInfo.ComponentType SHORT = ObjectParameterInfo.ComponentType.SHORT;
   public static final ObjectParameterInfo.ObjectType BUFFER = ObjectParameterInfo.ObjectType.BUFFER;

   public final int getParameterIndex() {
      return this.parameterIndex;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         ObjectParameterInfo info = (ObjectParameterInfo)o;
         return this.objectInfo == info.objectInfo;
      } else {
         return false;
      }
   }

   final int ioflags() {
      return this.ioflags;
   }

   final int asObjectInfo() {
      return this.objectInfo;
   }

   private ObjectParameterInfo(int objectInfo) {
      this.objectInfo = objectInfo;
      this.ioflags = objectInfo & 0xFF;
      this.parameterIndex = (objectInfo & 0xFF0000) >> 16;
   }

   public static ObjectParameterInfo create(int ioflags, int parameterIndex) {
      return getCachedInfo(ObjectBuffer.makeObjectFlags(ioflags, 0, parameterIndex));
   }

   @Override
   public int hashCode() {
      return 31 * this.objectInfo;
   }

   private static ObjectParameterInfo getCachedInfo(int objectInfo) {
      ObjectParameterInfo info = CACHE.get(objectInfo);
      if (info != null) {
         return info;
      }

      ObjectParameterInfo cachedInfo = CACHE.putIfAbsent(objectInfo, info = new ObjectParameterInfo(objectInfo));
      return cachedInfo != null ? cachedInfo : info;
   }

   public static ObjectParameterInfo create(
      int parameterIndex, ObjectParameterInfo.ObjectType ioflags, ObjectParameterInfo.ComponentType objectType, int componentType
   ) {
      return getCachedInfo(ObjectBuffer.makeObjectFlags(ioflags, objectType.value | componentType.value, parameterIndex));
   }

   // $VF: Compiled from ObjectParameterInfo.java
   public enum ComponentType {
      SHORT(33554432),
      DOUBLE(100663296),
      LONG(67108864),
      FLOAT(83886080),
      BOOLEAN(117440512),
      INT(50331648),
      BYTE(16777216),
      CHAR(134217728);

      final int value;

      ComponentType(int type) {
         this.value = type;
      }
   }

   // $VF: Compiled from ObjectParameterInfo.java
   public enum ObjectType {
      ARRAY(268435456),
      BUFFER(536870912);

      final int value;

      ObjectType(int type) {
         this.value = type;
      }
   }
}
