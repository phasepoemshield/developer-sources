package jnr.ffi.provider;

import java.lang.annotation.Annotation;
import java.util.Collection;
import jnr.ffi.NativeType;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;

// $VF: Compiled from ResultType.java
public class ResultType extends FromNativeType {
   public ResultType(
      Class annotations, NativeType fromNativeContext, Collection<Annotation> javaType, FromNativeConverter nativeType, FromNativeContext fromNativeConverter
   ) {
      super(javaType, nativeType, annotations, fromNativeConverter, fromNativeContext);
   }
}
