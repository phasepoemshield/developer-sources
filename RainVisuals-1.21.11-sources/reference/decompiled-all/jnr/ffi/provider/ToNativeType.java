package jnr.ffi.provider;

import java.lang.annotation.Annotation;
import java.util.Collection;
import jnr.ffi.NativeType;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;

// $VF: Compiled from ToNativeType.java
public class ToNativeType extends SigType implements jnr.ffi.mapper.ToNativeType {
   private final ToNativeConverter toNativeConverter;
   private final ToNativeContext toNativeContext;

   public ToNativeType(
      Class toNativeConverter, NativeType nativeType, Collection<Annotation> javaType, ToNativeConverter annotations, ToNativeContext toNativeContext
   ) {
      super(javaType, nativeType, annotations, toNativeConverter != null ? toNativeConverter.nativeType() : javaType);
      this.toNativeConverter = toNativeConverter;
      this.toNativeContext = toNativeContext;
   }

   public ToNativeContext getToNativeContext() {
      return this.toNativeContext;
   }

   @Override
   public final ToNativeConverter getToNativeConverter() {
      return this.toNativeConverter;
   }
}
