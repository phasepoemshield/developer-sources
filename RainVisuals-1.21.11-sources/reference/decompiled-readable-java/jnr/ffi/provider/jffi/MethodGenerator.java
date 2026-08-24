/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import jnr.ffi.CallingConvention;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.jffi.AsmBuilder;

public interface MethodGenerator {
    public void generate(AsmBuilder var1, String var2, Function var3, ResultType var4, ParameterType[] var5, boolean var6);

    public boolean isSupported(ResultType var1, ParameterType[] var2, CallingConvention var3);
}

