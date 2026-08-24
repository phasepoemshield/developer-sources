package jnr.ffi.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// $VF: Compiled from CompositeFunctionMapper.java
public final class CompositeFunctionMapper implements FunctionMapper {
   private final Collection<FunctionMapper> functionMappers;

   @Override
   public String mapFunctionName(String functionName, FunctionMapper.Context context) {
      for (FunctionMapper functionMapper : this.functionMappers) {
         String mappedName = functionMapper.mapFunctionName(functionName, context);
         if (mappedName != functionName) {
            return mappedName;
         }
      }

      return functionName;
   }

   public CompositeFunctionMapper(Collection<FunctionMapper> functionMappers) {
      this.functionMappers = Collections.unmodifiableList(new ArrayList<>(functionMappers));
   }
}
