package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import jnr.ffi.CallingConvention;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;

// $VF: Compiled from MethodGenerator.java
public interface MethodGenerator {
   void generate(AsmBuilder var1, String var2, Function var3, ResultType var4, ParameterType[] var5, boolean var6);

   boolean isSupported(ResultType var1, ParameterType[] var2, CallingConvention var3);
}
