/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Aggregate;
import com.kenai.jffi.Foreign;
import com.kenai.jffi.Type;
import java.util.Arrays;

public final class Union
extends Aggregate {
    private final Type[] fields;

    @Override
    public boolean equals(Object o) {
        block6: {
            block5: {
                if (this == o) {
                    return true;
                }
                if (o == null) break block5;
                if (this.getClass() == o.getClass()) break block6;
            }
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Union union = (Union)o;
        return Arrays.equals(this.fields, union.fields);
    }

    public Union(Type ... fields) {
        super(Foreign.getInstance(), Foreign.getInstance().newStruct(Type.nativeHandles(fields), true));
        this.fields = (Type[])fields.clone();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int hashCode() {
        void var1_1;
        int result = super.hashCode();
        result = 31 * result + (this.fields != null ? Arrays.hashCode(this.fields) : 0);
        return (int)var1_1;
    }

    public static Union newUnion(Type ... fields) {
        return new Union(fields);
    }
}

