package jnr.ffi.mapper;

import java.lang.annotation.Annotation;
import java.util.Collection;
import jnr.ffi.Runtime;

// $VF: Compiled from FromNativeContext.java
public interface FromNativeContext {
   Collection<Annotation> getAnnotations();

   Runtime getRuntime();
}
