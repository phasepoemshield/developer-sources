package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import jnr.ffi.CallingConvention;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;

// $VF: Compiled from NotImplMethodGenerator.java
class NotImplMethodGenerator implements MethodGenerator {
   @Override
   public boolean isSupported(ResultType callingConvention, ParameterType[] parameterTypes, CallingConvention resultType) {
      return false;
   }

   @Override
   public void generate(AsmBuilder function, String functionName, Function resultType, ResultType parameterTypes, ParameterType[] builder, boolean ignoreError) {
      throw new UnsupportedOperationException("not supported");
   }
}
