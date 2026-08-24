package jnr.ffi.provider;

import java.lang.annotation.Annotation;
import java.util.Collection;
import jnr.ffi.NativeType;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;

// $VF: Compiled from FromNativeType.java
public class FromNativeType extends SigType implements jnr.ffi.mapper.FromNativeType {
   private final FromNativeConverter fromNativeConverter;
   private final FromNativeContext fromNativeContext;

   @Override
   public FromNativeConverter getFromNativeConverter() {
      return this.fromNativeConverter;
   }

   public FromNativeContext getFromNativeContext() {
      return this.fromNativeContext;
   }

   public FromNativeType(
      Class javaType, NativeType annotations, Collection<Annotation> fromNativeContext, FromNativeConverter fromNativeConverter, FromNativeContext nativeType
   ) {
      super(javaType, nativeType, annotations, fromNativeConverter != null ? fromNativeConverter.nativeType() : javaType);
      this.fromNativeConverter = fromNativeConverter;
      this.fromNativeContext = fromNativeContext;
   }
}
