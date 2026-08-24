/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Aggregate;
import com.kenai.jffi.Foreign;
import com.kenai.jffi.Type;

public final class Array
extends Aggregate {
    private final Type elementType;
    private final int length;

    @Override
    public boolean equals(Object o) {
        block12: {
            block13: {
                Array array;
                block11: {
                    block10: {
                        block9: {
                            if (this == o) {
                                return true;
                            }
                            if (o == null) break block9;
                            if (this.getClass() == o.getClass()) break block10;
                        }
                        return false;
                    }
                    if (!super.equals(o)) {
                        return false;
                    }
                    array = (Array)o;
                    if (this.length != array.length) {
                        return false;
                    }
                    if (this.elementType == null) break block11;
                    if (this.elementType.equals(array.elementType)) break block12;
                    break block13;
                }
                if (array.elementType == null) break block12;
            }
            return false;
        }
        return true;
    }

    public static Array newArray(Type elementType, int length) {
        return new Array(elementType, length);
    }

    public Array(Type elementType, int length) {
        super(Foreign.getInstance(), Foreign.getInstance().newArray(elementType.handle(), length));
        this.elementType = elementType;
        this.length = length;
    }

    public final Type getElementType() {
        return this.elementType;
    }

    public final int length() {
        return this.length;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int hashCode() {
        void var1_1;
        int result = super.hashCode();
        result = 31 * result + (this.elementType != null ? this.elementType.hashCode() : 0);
        result = 31 * result + this.length;
        return (int)var1_1;
    }
}

