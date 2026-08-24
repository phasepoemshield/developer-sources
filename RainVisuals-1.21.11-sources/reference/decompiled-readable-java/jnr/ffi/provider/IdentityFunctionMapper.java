/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider;

import jnr.ffi.mapper.FunctionMapper;

public class IdentityFunctionMapper
implements FunctionMapper {
    @Override
    public String mapFunctionName(String functionName, FunctionMapper.Context context) {
        return functionName;
    }

    public static FunctionMapper getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static final class SingletonHolder {
        public static final FunctionMapper INSTANCE = new IdentityFunctionMapper();

        private SingletonHolder() {
        }
    }
}

