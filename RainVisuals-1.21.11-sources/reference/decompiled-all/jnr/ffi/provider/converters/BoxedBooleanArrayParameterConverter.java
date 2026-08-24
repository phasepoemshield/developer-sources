package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from BoxedBooleanArrayParameterConverter.java
@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class BoxedBooleanArrayParameterConverter implements ToNativeConverter<Boolean[], boolean[]> {
   private static final ToNativeConverter<Boolean[], boolean[]> OUT = new BoxedBooleanArrayParameterConverter.Out(1);
   private static final ToNativeConverter<Boolean[], boolean[]> INOUT = new BoxedBooleanArrayParameterConverter.Out(3);
   private static final ToNativeConverter<Boolean[], boolean[]> IN = new BoxedBooleanArrayParameterConverter(2);
   private final int parameterFlags;

   public boolean[] toNative(Boolean[] array, ToNativeContext context) {
      if (array == null) {
         return null;
      }

      boolean[] primitive = new boolean[array.length];
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < array.length; i++) {
            primitive[i] = array[i] != null ? array[i] : false;
         }
      }

      return primitive;
   }

   public static ToNativeConverter<Boolean[], boolean[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   @Override
   public Class<boolean[]> nativeType() {
      return boolean[].class;
   }

   public BoxedBooleanArrayParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   // $VF: Compiled from BoxedBooleanArrayParameterConverter.java
   public static final class Out extends BoxedBooleanArrayParameterConverter implements ToNativeConverter.PostInvocation<Boolean[], boolean[]> {
      public void postInvoke(Boolean[] array, boolean[] context, ToNativeContext primitive) {
         if (array != null && primitive != null) {
            for (int i = 0; i < array.length; i++) {
               array[i] = primitive[i];
            }
         }
      }

      Out(int parameterFlags) {
         super(parameterFlags);
      }
   }
}
