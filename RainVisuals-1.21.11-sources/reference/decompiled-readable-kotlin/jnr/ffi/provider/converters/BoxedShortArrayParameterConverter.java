package jnr.ffi.provider.converters;

import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from BoxedShortArrayParameterConverter.java
@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class BoxedShortArrayParameterConverter implements ToNativeConverter<Short[], short[]> {
   private static final ToNativeConverter<Short[], short[]> IN = new BoxedShortArrayParameterConverter(2);
   private static final ToNativeConverter<Short[], short[]> INOUT = new BoxedShortArrayParameterConverter.Out(3);
   private final int parameterFlags;
   private static final ToNativeConverter<Short[], short[]> OUT = new BoxedShortArrayParameterConverter.Out(1);

   public BoxedShortArrayParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   @Override
   public Class<short[]> nativeType() {
      return short[].class;
   }

   public static ToNativeConverter<Short[], short[]> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   public short[] toNative(Short[] array, ToNativeContext context) {
      if (array == null) {
         return null;
      }

      short[] primitive = new short[array.length];
      if (ParameterFlags.isIn(this.parameterFlags)) {
         for (int i = 0; i < array.length; i++) {
            primitive[i] = array[i] != null ? array[i] : 0;
         }
      }

      return primitive;
   }

   // $VF: Compiled from BoxedShortArrayParameterConverter.java
   public static final class Out extends BoxedShortArrayParameterConverter implements ToNativeConverter.PostInvocation<Short[], short[]> {
      public void postInvoke(Short[] context, short[] array, ToNativeContext primitive) {
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
