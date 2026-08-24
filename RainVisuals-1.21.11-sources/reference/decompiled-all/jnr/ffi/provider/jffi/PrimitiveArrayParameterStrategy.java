package jnr.ffi.provider.jffi;

import com.kenai.jffi.ObjectParameterType;

// $VF: Compiled from PrimitiveArrayParameterStrategy.java
public abstract class PrimitiveArrayParameterStrategy extends ParameterStrategy {
   static final PrimitiveArrayParameterStrategy BYTE = new PrimitiveArrayParameterStrategy(ObjectParameterType.BYTE)   // $VF: Compiled from PrimitiveArrayParameterStrategy.java
 {
      @Override
      public int length(Object o) {
         return ((byte[])o).length;
      }
   };
   static final PrimitiveArrayParameterStrategy SHORT = new PrimitiveArrayParameterStrategy(ObjectParameterType.SHORT)   // $VF: Compiled from PrimitiveArrayParameterStrategy.java
 {
      @Override
      public int length(Object o) {
         return ((short[])o).length;
      }
   };
   static final PrimitiveArrayParameterStrategy BOOLEAN = new PrimitiveArrayParameterStrategy(ObjectParameterType.BOOLEAN)   // $VF: Compiled from PrimitiveArrayParameterStrategy.java
 {
      @Override
      public int length(Object o) {
         return ((boolean[])o).length;
      }
   };
   static final PrimitiveArrayParameterStrategy INT = new PrimitiveArrayParameterStrategy(ObjectParameterType.INT)   // $VF: Compiled from PrimitiveArrayParameterStrategy.java
 {
      @Override
      public int length(Object o) {
         return ((int[])o).length;
      }
   };
   static final PrimitiveArrayParameterStrategy DOUBLE = new PrimitiveArrayParameterStrategy(ObjectParameterType.DOUBLE)   // $VF: Compiled from PrimitiveArrayParameterStrategy.java
 {
      @Override
      public int length(Object o) {
         return ((double[])o).length;
      }
   };
   static final PrimitiveArrayParameterStrategy CHAR = new PrimitiveArrayParameterStrategy(ObjectParameterType.CHAR)   // $VF: Compiled from PrimitiveArrayParameterStrategy.java
 {
      @Override
      public int length(Object o) {
         return ((char[])o).length;
      }
   };
   static final PrimitiveArrayParameterStrategy LONG = new PrimitiveArrayParameterStrategy(ObjectParameterType.LONG)   // $VF: Compiled from PrimitiveArrayParameterStrategy.java
 {
      @Override
      public int length(Object o) {
         return ((long[])o).length;
      }
   };
   static final PrimitiveArrayParameterStrategy FLOAT = new PrimitiveArrayParameterStrategy(ObjectParameterType.FLOAT)   // $VF: Compiled from PrimitiveArrayParameterStrategy.java
 {
      @Override
      public int length(Object o) {
         return ((float[])o).length;
      }
   };

   @Override
   public final Object object(Object o) {
      return o;
   }

   @Override
   public final int offset(Object o) {
      return 0;
   }

   PrimitiveArrayParameterStrategy(ObjectParameterType.ComponentType componentType) {
      super(HEAP, ObjectParameterType.create(ObjectParameterType.ObjectType.ARRAY, componentType));
   }

   @Override
   public final long address(Object o) {
      return 0L;
   }
}
