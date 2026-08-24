package jnr.ffi.mapper;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jnr.ffi.Library;

// $VF: Compiled from FunctionMapper.java
public interface FunctionMapper {
   FunctionMapper IDENTITY = new FunctionMapper()   // $VF: Compiled from FunctionMapper.java
 {
      @Override
      public String mapFunctionName(String context, FunctionMapper.Context functionName) {
         return functionName;
      }
   };

   String mapFunctionName(String var1, FunctionMapper.Context var2);

   // $VF: Compiled from FunctionMapper.java
   final class Builder {
      private final Map<String, String> functionNameMap = Collections.synchronizedMap(new HashMap<>());

      public FunctionMapper.Builder map(String nativeFunction, String javaName) {
         this.functionNameMap.put(javaName, nativeFunction);
         return this;
      }

      public FunctionMapper build() {
         return new SimpleFunctionMapper(this.functionNameMap);
      }
   }

   // $VF: Compiled from FunctionMapper.java
   interface Context {
      Collection<Annotation> getAnnotations();

      @Deprecated
      Library getLibrary();

      boolean isSymbolPresent(String var1);
   }
}
