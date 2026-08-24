package jnr.ffi.mapper;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import jnr.ffi.Runtime;
import jnr.ffi.util.Annotations;

// $VF: Compiled from MethodResultContext.java
public class MethodResultContext implements FromNativeContext {
   private final Runtime runtime;
   private final Method method;
   private Collection<Annotation> annotations;

   public MethodResultContext(Runtime method, Method runtime) {
      this.runtime = runtime;
      this.method = method;
   }

   public Method getMethod() {
      return this.method;
   }

   @Override
   public Runtime getRuntime() {
      return this.runtime;
   }

   @Override
   public Collection<Annotation> getAnnotations() {
      return this.annotations != null ? this.annotations : (this.annotations = Annotations.sortedAnnotationCollection(this.method.getAnnotations()));
   }
}
