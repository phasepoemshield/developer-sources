package jnr.ffi.provider.jffi;

import java.lang.annotation.Annotation;
import java.util.Collection;
import jnr.ffi.Library;
import jnr.ffi.mapper.FunctionMapper;

// $VF: Compiled from NativeFunctionMapperContext.java
public final class NativeFunctionMapperContext implements FunctionMapper.Context {
   private final Collection<Annotation> annotations;
   private final NativeLibrary library;

   public NativeFunctionMapperContext(NativeLibrary library, Collection<Annotation> annotations) {
      this.library = library;
      this.annotations = annotations;
   }

   @Override
   public Collection<Annotation> getAnnotations() {
      return this.annotations;
   }

   @Override
   public boolean isSymbolPresent(String name) {
      return this.library.getSymbolAddress(name) != 0L;
   }

   @Override
   public Library getLibrary() {
      return null;
   }
}
