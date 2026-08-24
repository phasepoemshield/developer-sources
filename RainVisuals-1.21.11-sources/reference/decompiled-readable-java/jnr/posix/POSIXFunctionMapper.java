/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.mapper.FunctionMapper;

@Deprecated
final class POSIXFunctionMapper
implements FunctionMapper {
    public static final FunctionMapper INSTANCE = new POSIXFunctionMapper();

    /*
     * WARNING - void declaration
     */
    @Override
    public String mapFunctionName(String name, FunctionMapper.Context ctx) {
        void var1_1;
        if (ctx.getLibrary().getName().equals("msvcrt") && (name.equals("getpid") || name.equals("chmod"))) {
            name = "_" + name;
        }
        return var1_1;
    }

    private POSIXFunctionMapper() {
    }
}

