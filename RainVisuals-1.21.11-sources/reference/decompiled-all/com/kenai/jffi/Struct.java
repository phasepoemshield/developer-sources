package com.kenai.jffi;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// $VF: Compiled from Struct.java
public final class Struct extends Aggregate {
   private static final ReferenceQueue<Struct> structReferenceQueue = new ReferenceQueue<>();
   private static final Map<List<Type>, Struct.StructReference> structCache = new ConcurrentHashMap<>();
   private final Type[] fields;

   @Deprecated
   public Struct(Type... fields) {
      super(Foreign.getInstance(), Foreign.getInstance().newStruct(Type.nativeHandles(fields), false));
      this.fields = (Type[])fields.clone();
   }

   @Override
   public int hashCode() {
      int result = super.hashCode();
      return 31 * result + Arrays.hashCode(this.fields);
   }

   public static Struct newStruct(Type... fields) {
      List<Type> fieldsList = Arrays.asList(fields);
      Struct.StructReference ref = structCache.get(fieldsList);
      Struct s = ref != null ? ref.get() : null;
      if (s != null) {
         return s;
      }

      while ((ref = (Struct.StructReference)structReferenceQueue.poll()) != null) {
         structCache.remove(ref.fieldsList);
      }

      structCache.put(fieldsList, new Struct.StructReference(s = new Struct(Foreign.getInstance(), fields), structReferenceQueue, fieldsList));
      return s;
   }

   private Struct(Foreign foreign, Type... fields) {
      super(foreign, foreign.newStruct(Type.nativeHandles(fields), false));
      this.fields = (Type[])fields.clone();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o == null || this.getClass() != o.getClass()) {
         return false;
      } else {
         return !super.equals(o) ? false : Arrays.equals(this.fields, ((Struct)o).fields);
      }
   }

   // $VF: Compiled from Struct.java
   private static final class StructReference extends WeakReference<Struct> {
      List<Type> fieldsList;

      private StructReference(Struct referenceQueue, ReferenceQueue<? super Struct> fieldsList, List<Type> struct) {
         super(struct, referenceQueue);
         this.fieldsList = fieldsList;
      }
   }
}
