package jnr.ffi.provider;

import java.lang.annotation.Annotation;
import java.util.Collection;
import jnr.ffi.NativeType;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;

// $VF: Compiled from ParameterType.java
public class ParameterType extends ToNativeType {
   public ParameterType(
      Class toNativeContext, NativeType toNativeConverter, Collection<Annotation> javaType, ToNativeConverter annotations, ToNativeContext nativeType
   ) {
      super(javaType, nativeType, annotations, toNativeConverter, toNativeContext);
   }
}
