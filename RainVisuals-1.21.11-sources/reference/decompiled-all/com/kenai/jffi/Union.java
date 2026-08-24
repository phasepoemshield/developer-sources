package com.kenai.jffi;

import java.util.Arrays;

// $VF: Compiled from Union.java
public final class Union extends Aggregate {
   private final Type[] fields;

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }

      if (o == null || this.getClass() != o.getClass()) {
         return false;
      }

      if (!super.equals(o)) {
         return false;
      }

      Union union = (Union)o;
      return Arrays.equals(this.fields, union.fields);
   }

   public Union(Type... fields) {
      super(Foreign.getInstance(), Foreign.getInstance().newStruct(Type.nativeHandles(fields), true));
      this.fields = (Type[])fields.clone();
   }

   @Override
   public int hashCode() {
      int result = super.hashCode();
      return 31 * result + (this.fields != null ? Arrays.hashCode(this.fields) : 0);
   }

   public static Union newUnion(Type... fields) {
      return new Union(fields);
   }
}
