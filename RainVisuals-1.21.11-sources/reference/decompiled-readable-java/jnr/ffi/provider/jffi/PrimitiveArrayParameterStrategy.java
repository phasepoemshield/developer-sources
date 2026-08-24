/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.ObjectParameterType;
import jnr.ffi.provider.jffi.ParameterStrategy;

public abstract class PrimitiveArrayParameterStrategy
extends ParameterStrategy {
    static final PrimitiveArrayParameterStrategy BYTE = new PrimitiveArrayParameterStrategy(ObjectParameterType.BYTE){

        public int length(Object o) {
            return ((byte[])o).length;
        }
    };
    static final PrimitiveArrayParameterStrategy SHORT = new PrimitiveArrayParameterStrategy(ObjectParameterType.SHORT){

        public int length(Object o) {
            return ((short[])o).length;
        }
    };
    static final PrimitiveArrayParameterStrategy BOOLEAN;
    static final PrimitiveArrayParameterStrategy INT;
    static final PrimitiveArrayParameterStrategy DOUBLE;
    static final PrimitiveArrayParameterStrategy CHAR;
    static final PrimitiveArrayParameterStrategy LONG;
    static final PrimitiveArrayParameterStrategy FLOAT;

    public final Object object(Object o) {
        return o;
    }

    public final int offset(Object o) {
        return 0;
    }

    PrimitiveArrayParameterStrategy(ObjectParameterType.ComponentType componentType) {
        super(HEAP, ObjectParameterType.create(ObjectParameterType.ObjectType.ARRAY, componentType));
    }

    static {
        CHAR = new PrimitiveArrayParameterStrategy(ObjectParameterType.CHAR){

            public int length(Object o) {
                return ((char[])o).length;
            }
        };
        INT = new PrimitiveArrayParameterStrategy(ObjectParameterType.INT){

            public int length(Object o) {
                return ((int[])o).length;
            }
        };
        LONG = new PrimitiveArrayParameterStrategy(ObjectParameterType.LONG){

            public int length(Object o) {
                return ((long[])o).length;
            }
        };
        FLOAT = new PrimitiveArrayParameterStrategy(ObjectParameterType.FLOAT){

            public int length(Object o) {
                return ((float[])o).length;
            }
        };
        DOUBLE = new PrimitiveArrayParameterStrategy(ObjectParameterType.DOUBLE){

            public int length(Object o) {
                return ((double[])o).length;
            }
        };
        BOOLEAN = new PrimitiveArrayParameterStrategy(ObjectParameterType.BOOLEAN){

            public int length(Object o) {
                return ((boolean[])o).length;
            }
        };
    }

    public final long address(Object o) {
        return 0L;
    }
}

