package jnr.ffi.provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import jnr.ffi.CallingConvention;
import jnr.ffi.annotations.IgnoreError;
import jnr.ffi.annotations.SaveError;

// $VF: Compiled from NativeFunction.java
public final class NativeFunction {
   private final Method method;
   private final CallingConvention callingConvention;
   private final Collection<Annotation> annotations;
   private final boolean ignoreError;
   private final boolean saveError;

   public boolean hasIgnoreError() {
      return this.ignoreError;
   }

   public static boolean hasIgnoreError(Method method) {
      return method.getAnnotation(IgnoreError.class) != null;
   }

   public String name() {
      return this.method.getName();
   }

   public boolean isErrnoRequired() {
      return !this.ignoreError || this.saveError;
   }

   public boolean hasSaveError() {
      return this.saveError;
   }

   public NativeFunction(Method method, CallingConvention callingConvention) {
      this.method = method;
      this.annotations = Collections.unmodifiableCollection(Arrays.asList(method.getAnnotations()));
      this.saveError = hasSaveError(method);
      this.ignoreError = hasIgnoreError(method);
      this.callingConvention = callingConvention;
   }

   public Collection<Annotation> annotations() {
      return this.annotations;
   }

   public Method getMethod() {
      return this.method;
   }

   public static boolean hasSaveError(Method method) {
      return method.getAnnotation(SaveError.class) != null;
   }

   public CallingConvention convention() {
      return this.callingConvention;
   }
}
