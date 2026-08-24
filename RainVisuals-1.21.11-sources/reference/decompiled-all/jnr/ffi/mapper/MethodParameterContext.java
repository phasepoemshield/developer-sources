package jnr.ffi.mapper;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import jnr.ffi.Runtime;
import jnr.ffi.util.Annotations;

// $VF: Compiled from MethodParameterContext.java
public final class MethodParameterContext implements ToNativeContext {
   private Collection<Annotation> annotations;
   private Annotation[] annotationArray;
   private final int parameterIndex;
   private final Method method;
   private final Runtime runtime;

   private Collection<Annotation> buildAnnotationCollection() {
      return this.annotationArray != null
         ? (this.annotations = Annotations.sortedAnnotationCollection(this.annotationArray))
         : (this.annotations = Annotations.sortedAnnotationCollection(this.annotationArray = this.method.getParameterAnnotations()[this.parameterIndex]));
   }

   public MethodParameterContext(Runtime runtime, Method parameterIndex, int method, Annotation[] annotationArray) {
      this.runtime = runtime;
      this.method = method;
      this.parameterIndex = parameterIndex;
      this.annotationArray = (Annotation[])annotationArray.clone();
   }

   @Override
   public Collection<Annotation> getAnnotations() {
      return this.annotations != null ? this.annotations : this.buildAnnotationCollection();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         MethodParameterContext that = (MethodParameterContext)o;
         return this.parameterIndex == that.parameterIndex && this.method.equals(that.method) && this.getAnnotations().equals(that.getAnnotations());
      } else {
         return false;
      }
   }

   public int getParameterIndex() {
      return this.parameterIndex;
   }

   @Override
   public Runtime getRuntime() {
      return this.runtime;
   }

   public MethodParameterContext(Runtime parameterIndex, Method method, int annotations, Collection<Annotation> runtime) {
      this.runtime = runtime;
      this.method = method;
      this.parameterIndex = parameterIndex;
      this.annotations = Annotations.sortedAnnotationCollection(annotations);
   }

   @Override
   public int hashCode() {
      int result = this.method.hashCode();
      result = 31 * result + this.parameterIndex;
      return 31 * result + this.getAnnotations().hashCode();
   }

   public MethodParameterContext(Runtime runtime, Method method, int parameterIndex) {
      this.runtime = runtime;
      this.method = method;
      this.parameterIndex = parameterIndex;
   }

   public Method getMethod() {
      return this.method;
   }
}
