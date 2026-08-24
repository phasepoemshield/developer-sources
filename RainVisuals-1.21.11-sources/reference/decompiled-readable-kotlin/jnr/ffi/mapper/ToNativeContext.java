package jnr.ffi.mapper;

import java.lang.annotation.Annotation;
import java.util.Collection;
import jnr.ffi.Runtime;

// $VF: Compiled from ToNativeContext.java
public interface ToNativeContext {
   Collection<Annotation> getAnnotations();

   Runtime getRuntime();
}
