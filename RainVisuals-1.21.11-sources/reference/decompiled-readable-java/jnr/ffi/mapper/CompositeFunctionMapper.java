/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import jnr.ffi.mapper.FunctionMapper;

public final class CompositeFunctionMapper
implements FunctionMapper {
    private final Collection<FunctionMapper> functionMappers;

    /*
     * WARNING - void declaration
     */
    @Override
    public String mapFunctionName(String functionName, FunctionMapper.Context context) {
        void var1_1;
        Iterator<FunctionMapper> iterator2 = this.functionMappers.iterator();
        while (iterator2.hasNext()) {
            void var5_5;
            FunctionMapper functionMapper = iterator2.next();
            String mappedName = functionMapper.mapFunctionName(functionName, context);
            if (mappedName == functionName) continue;
            return var5_5;
        }
        return var1_1;
    }

    public CompositeFunctionMapper(Collection<FunctionMapper> functionMappers) {
        this.functionMappers = Collections.unmodifiableList(new ArrayList<FunctionMapper>(functionMappers));
    }
}

