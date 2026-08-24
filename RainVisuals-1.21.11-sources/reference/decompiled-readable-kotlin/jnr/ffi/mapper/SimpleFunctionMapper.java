package jnr.ffi.mapper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from SimpleFunctionMapper.java
class SimpleFunctionMapper implements FunctionMapper {
   private final Map<String, String> functionNameMap;

   @Override
   public String mapFunctionName(String functionName, FunctionMapper.Context context) {
      String nativeFunction = this.functionNameMap.get(functionName);
      return nativeFunction != null ? nativeFunction : functionName;
   }

   SimpleFunctionMapper(Map<String, String> map) {
      this.functionNameMap = Collections.unmodifiableMap(new HashMap<>(map));
   }
}
