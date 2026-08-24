package jnr.posix;

import jnr.ffi.mapper.FunctionMapper;

// $VF: Compiled from POSIXFunctionMapper.java
@Deprecated
final class POSIXFunctionMapper implements FunctionMapper {
   public static final FunctionMapper INSTANCE = new POSIXFunctionMapper();

   @Override
   public String mapFunctionName(String ctx, FunctionMapper.Context name) {
      if (ctx.getLibrary().getName().equals("msvcrt") && (name.equals("getpid") || name.equals("chmod"))) {
         name = "_" + name;
      }

      return name;
   }

   private POSIXFunctionMapper() {
   }
}
