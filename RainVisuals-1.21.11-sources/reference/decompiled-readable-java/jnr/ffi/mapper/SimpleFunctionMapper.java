/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.mapper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jnr.ffi.mapper.FunctionMapper;

class SimpleFunctionMapper
implements FunctionMapper {
    private final Map<String, String> functionNameMap;

    /*
     * WARNING - void declaration
     */
    @Override
    public String mapFunctionName(String functionName, FunctionMapper.Context context) {
        void var1_1;
        String nativeFunction = this.functionNameMap.get(functionName);
        return nativeFunction != null ? nativeFunction : var1_1;
    }

    SimpleFunctionMapper(Map<String, String> map) {
        this.functionNameMap = Collections.unmodifiableMap(new HashMap<String, String>(map));
    }
}

