package jnr.posix;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jnr.ffi.mapper.FunctionMapper;

// $VF: Compiled from SimpleFunctionMapper.java
public class SimpleFunctionMapper implements FunctionMapper {
   private final Map<String, String> functionNameMap;

   private SimpleFunctionMapper(Map<String, String> map) {
      this.functionNameMap = Collections.unmodifiableMap(new HashMap<>(map));
   }

   @Override
   public String mapFunctionName(String context, FunctionMapper.Context functionName) {
      String nativeFunction = this.functionNameMap.get(functionName);
      return nativeFunction != null ? nativeFunction : functionName;
   }

   // $VF: Compiled from SimpleFunctionMapper.java
   public static class Builder {
      private final Map<String, String> functionNameMap = Collections.synchronizedMap(new HashMap<>());

      public SimpleFunctionMapper.Builder map(String posixName, String nativeFunction) {
         this.functionNameMap.put(posixName, nativeFunction);
         return this;
      }

      public SimpleFunctionMapper build() {
         return new SimpleFunctionMapper(this.functionNameMap);
      }
   }
}
