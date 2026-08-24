package jnr.ffi.mapper;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;

// $VF: Compiled from SignatureType.java
public interface SignatureType {
   Collection<Annotation> getAnnotations();

   Class getDeclaredType();

   Type getGenericType();
}
