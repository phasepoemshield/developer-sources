package jnr.ffi.provider;

import jnr.ffi.mapper.FunctionMapper;

// $VF: Compiled from IdentityFunctionMapper.java
public class IdentityFunctionMapper implements FunctionMapper {
   @Override
   public String mapFunctionName(String context, FunctionMapper.Context functionName) {
      return functionName;
   }

   public static FunctionMapper getInstance() {
      return IdentityFunctionMapper.SingletonHolder.INSTANCE;
   }

   // $VF: Compiled from IdentityFunctionMapper.java
   private static final class SingletonHolder {
      public static final FunctionMapper INSTANCE = new IdentityFunctionMapper();
   }
}
