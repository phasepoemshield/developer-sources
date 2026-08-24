package jnr.ffi.provider;

import java.lang.reflect.Method;

// $VF: Compiled from NativeVariable.java
public class NativeVariable {
   private final Method method;

   public NativeVariable(Method method) {
      this.method = method;
   }

   public Method getMethod() {
      return this.method;
   }
}
