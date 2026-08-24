package jnr.ffi.provider.converters;

import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.byref.ByReference;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from ByReferenceParameterConverter.java
@ToNativeConverter.Cacheable
public class ByReferenceParameterConverter implements ToNativeConverter<ByReference, Pointer> {
   private final int parameterFlags;
   private static final ToNativeConverter<ByReference, Pointer> OUT = new ByReferenceParameterConverter.Out(1);
   private static final ToNativeConverter<ByReference, Pointer> INOUT = new ByReferenceParameterConverter.Out(3);
   private static final ToNativeConverter<ByReference, Pointer> IN = new ByReferenceParameterConverter(2);

   public Pointer toNative(ByReference value, ToNativeContext context) {
      if (value == null) {
         return null;
      }

      Pointer memory = Memory.allocate(context.getRuntime(), value.nativeSize(context.getRuntime()));
      if (ParameterFlags.isIn(this.parameterFlags)) {
         value.toNative(context.getRuntime(), memory, 0L);
      }

      return memory;
   }

   private ByReferenceParameterConverter(int parameterFlags) {
      this.parameterFlags = parameterFlags;
   }

   public static ToNativeConverter<ByReference, Pointer> getInstance(ToNativeContext toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return ParameterFlags.isOut(parameterFlags) ? (ParameterFlags.isIn(parameterFlags) ? INOUT : OUT) : IN;
   }

   @Override
   public Class<Pointer> nativeType() {
      return Pointer.class;
   }

   // $VF: Compiled from ByReferenceParameterConverter.java
   public static final class Out extends ByReferenceParameterConverter implements ToNativeConverter.PostInvocation<ByReference, Pointer> {
      public void postInvoke(ByReference pointer, Pointer context, ToNativeContext byReference) {
         if (byReference != null && pointer != null) {
            byReference.fromNative(context.getRuntime(), pointer, 0L);
         }
      }

      public Out(int parameterFlags) {
         super(parameterFlags);
      }
   }
}
