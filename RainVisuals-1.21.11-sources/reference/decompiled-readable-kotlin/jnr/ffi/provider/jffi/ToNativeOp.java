package jnr.ffi.provider.jffi;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import jnr.ffi.Address;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.provider.ToNativeType;

// $VF: Compiled from ToNativeOp.java
abstract class ToNativeOp {
   private final boolean isPrimitive;
   private static final Map<Class, ToNativeOp> operations;

   abstract void emitPrimitive(SkinnyMethodAdapter var1, Class var2, NativeType var3);

   protected ToNativeOp(boolean primitive) {
      this.isPrimitive = primitive;
   }

   static {
      Map<Class, ToNativeOp> m = new IdentityHashMap<>();

      for (Class c : new Class[]{byte.class, char.class, short.class, int.class, long.class, boolean.class}) {
         m.put(c, new ToNativeOp.Integral(c));
         m.put(AsmUtil.boxedType(c), new ToNativeOp.Integral(AsmUtil.boxedType(c)));
      }

      m.put(float.class, new ToNativeOp.Float32(float.class));
      m.put(Float.class, new ToNativeOp.Float32(Float.class));
      m.put(double.class, new ToNativeOp.Float64(double.class));
      m.put(Double.class, new ToNativeOp.Float64(Double.class));
      m.put(Address.class, new ToNativeOp.AddressOp());
      operations = Collections.unmodifiableMap(m);
   }

   final boolean isPrimitive() {
      return this.isPrimitive;
   }

   static ToNativeOp get(ToNativeType type) {
      ToNativeOp op = operations.get(type.effectiveJavaType());
      return op != null ? op : null;
   }

   // $VF: Compiled from ToNativeOp.java
   static class AddressOp extends ToNativeOp.Primitive {
      AddressOp() {
         super(Address.class);
      }

      @Override
      void emitPrimitive(SkinnyMethodAdapter primitiveClass, Class mv, NativeType nativeType) {
         if (long.class == primitiveClass) {
            mv.invokestatic(AsmRuntime.class, "longValue", long.class, Address.class);
         } else {
            mv.invokestatic(AsmRuntime.class, "intValue", int.class, Address.class);
            NumberUtil.narrow(mv, int.class, primitiveClass);
         }
      }
   }

   // $VF: Compiled from ToNativeOp.java
   static class Delegate extends ToNativeOp.Primitive {
      static final ToNativeOp INSTANCE = new ToNativeOp.Delegate();

      @Override
      void emitPrimitive(SkinnyMethodAdapter primitiveClass, Class mv, NativeType nativeType) {
         AsmUtil.unboxPointer(mv, primitiveClass);
      }

      Delegate() {
         super(Pointer.class);
      }
   }

   // $VF: Compiled from ToNativeOp.java
   static class Float32 extends ToNativeOp.Primitive {
      @Override
      void emitPrimitive(SkinnyMethodAdapter nativeType, Class mv, NativeType primitiveClass) {
         if (!this.javaType.isPrimitive()) {
            AsmUtil.unboxNumber(mv, this.javaType, float.class);
         }

         if (primitiveClass != float.class) {
            mv.invokestatic(Float.class, "floatToRawIntBits", int.class, float.class);
            NumberUtil.widen(mv, int.class, primitiveClass);
         }
      }

      Float32(Class javaType) {
         super(javaType);
      }
   }

   // $VF: Compiled from ToNativeOp.java
   static class Float64 extends ToNativeOp.Primitive {
      @Override
      void emitPrimitive(SkinnyMethodAdapter nativeType, Class primitiveClass, NativeType mv) {
         if (!this.javaType.isPrimitive()) {
            AsmUtil.unboxNumber(mv, this.javaType, double.class);
         }

         if (primitiveClass != double.class) {
            mv.invokestatic(Double.class, "doubleToRawLongBits", long.class, double.class);
            NumberUtil.narrow(mv, long.class, primitiveClass);
         }
      }

      Float64(Class javaType) {
         super(javaType);
      }
   }

   // $VF: Compiled from ToNativeOp.java
   static class Integral extends ToNativeOp.Primitive {
      @Override
      public void emitPrimitive(SkinnyMethodAdapter nativeType, Class mv, NativeType primitiveClass) {
         if (this.javaType.isPrimitive()) {
            NumberUtil.convertPrimitive(mv, this.javaType, primitiveClass, nativeType);
         } else {
            AsmUtil.unboxNumber(mv, this.javaType, primitiveClass, nativeType);
         }
      }

      Integral(Class javaType) {
         super(javaType);
      }
   }

   // $VF: Compiled from ToNativeOp.java
   abstract static class Primitive extends ToNativeOp {
      protected final Class javaType;

      protected Primitive(Class javaType) {
         super(true);
         this.javaType = javaType;
      }
   }
}
