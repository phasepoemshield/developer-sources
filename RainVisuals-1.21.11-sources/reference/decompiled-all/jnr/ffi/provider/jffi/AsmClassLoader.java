package jnr.ffi.provider.jffi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// $VF: Compiled from AsmClassLoader.java
final class AsmClassLoader extends ClassLoader {
   private final ConcurrentMap<String, Class> definedClasses = new ConcurrentHashMap<>();

   public Class defineClass(String name, byte[] b) {
      Class klass = this.defineClass(name, b, 0, b.length);
      this.definedClasses.putIfAbsent(name, klass);
      this.resolveClass(klass);
      return klass;
   }

   public AsmClassLoader() {
   }

   @Override
   protected Class<?> findClass(String name) throws ClassNotFoundException {
      Class klass = this.definedClasses.get(name);
      return klass != null ? klass : super.findClass(name);
   }

   public AsmClassLoader(ClassLoader parent) {
      super(parent);
   }
}
