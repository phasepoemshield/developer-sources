/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import jnr.ffi.Address;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.provider.ToNativeType;
import jnr.ffi.provider.jffi.AsmRuntime;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.NumberUtil;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;

abstract class ToNativeOp {
    private final boolean isPrimitive;
    private static final Map<Class, ToNativeOp> operations;

    abstract void emitPrimitive(SkinnyMethodAdapter var1, Class var2, NativeType var3);

    protected ToNativeOp(boolean primitive) {
        this.isPrimitive = primitive;
    }

    /*
     * WARNING - void declaration
     */
    static {
        void var0;
        IdentityHashMap<Class, Primitive> m = new IdentityHashMap<Class, Primitive>();
        Class[] classArray = new Class[6];
        classArray[0] = Byte.TYPE;
        classArray[1] = Character.TYPE;
        classArray[2] = Short.TYPE;
        classArray[3] = Integer.TYPE;
        classArray[4] = Long.TYPE;
        classArray[5] = Boolean.TYPE;
        Class[] classArray2 = classArray;
        int n = classArray2.length;
        for (int i = 0; i < n; ++i) {
            Class c = classArray2[i];
            m.put(c, new Integral(c));
            m.put(AsmUtil.boxedType(c), new Integral(AsmUtil.boxedType(c)));
        }
        m.put(Float.TYPE, new Float32(Float.TYPE));
        m.put(Float.class, new Float32(Float.class));
        m.put(Double.TYPE, new Float64(Double.TYPE));
        m.put(Double.class, new Float64(Double.class));
        m.put(Address.class, new AddressOp());
        operations = Collections.unmodifiableMap(var0);
    }

    final boolean isPrimitive() {
        return this.isPrimitive;
    }

    static ToNativeOp get(ToNativeType type) {
        ToNativeOp op = operations.get(type.effectiveJavaType());
        if (op != null) {
            return op;
        }
        return null;
    }

    static class Delegate
    extends Primitive {
        static final ToNativeOp INSTANCE = new Delegate();

        @Override
        void emitPrimitive(SkinnyMethodAdapter mv, Class primitiveClass, NativeType nativeType) {
            AsmUtil.unboxPointer(mv, primitiveClass);
        }

        Delegate() {
            super(Pointer.class);
        }
    }

    static class AddressOp
    extends Primitive {
        AddressOp() {
            super(Address.class);
        }

        /*
         * WARNING - void declaration
         */
        @Override
        void emitPrimitive(SkinnyMethodAdapter mv, Class primitiveClass, NativeType nativeType) {
            if (Long.TYPE == primitiveClass) {
                Class[] classArray = new Class[1];
                classArray[0] = Address.class;
                mv.invokestatic(AsmRuntime.class, "longValue", Long.TYPE, classArray);
            } else {
                void var2_2;
                Class[] classArray = new Class[1];
                classArray[0] = Address.class;
                mv.invokestatic(AsmRuntime.class, "intValue", Integer.TYPE, classArray);
                NumberUtil.narrow(mv, Integer.TYPE, (Class)var2_2);
            }
        }
    }

    static class Float32
    extends Primitive {
        @Override
        void emitPrimitive(SkinnyMethodAdapter mv, Class primitiveClass, NativeType nativeType) {
            if (!this.javaType.isPrimitive()) {
                AsmUtil.unboxNumber(mv, this.javaType, Float.TYPE);
            }
            if (primitiveClass != Float.TYPE) {
                Class[] classArray = new Class[1];
                classArray[0] = Float.TYPE;
                mv.invokestatic(Float.class, "floatToRawIntBits", Integer.TYPE, classArray);
                NumberUtil.widen(mv, Integer.TYPE, primitiveClass);
            }
        }

        Float32(Class javaType) {
            super(javaType);
        }
    }

    static class Float64
    extends Primitive {
        @Override
        void emitPrimitive(SkinnyMethodAdapter mv, Class primitiveClass, NativeType nativeType) {
            if (!this.javaType.isPrimitive()) {
                AsmUtil.unboxNumber(mv, this.javaType, Double.TYPE);
            }
            if (primitiveClass != Double.TYPE) {
                Class[] classArray = new Class[1];
                classArray[0] = Double.TYPE;
                mv.invokestatic(Double.class, "doubleToRawLongBits", Long.TYPE, classArray);
                NumberUtil.narrow(mv, Long.TYPE, primitiveClass);
            }
        }

        Float64(Class javaType) {
            super(javaType);
        }
    }

    static abstract class Primitive
    extends ToNativeOp {
        protected final Class javaType;

        protected Primitive(Class javaType) {
            super(true);
            this.javaType = javaType;
        }
    }

    static class Integral
    extends Primitive {
        @Override
        public void emitPrimitive(SkinnyMethodAdapter mv, Class primitiveClass, NativeType nativeType) {
            if (this.javaType.isPrimitive()) {
                NumberUtil.convertPrimitive(mv, this.javaType, primitiveClass, nativeType);
            } else {
                AsmUtil.unboxNumber(mv, this.javaType, primitiveClass, nativeType);
            }
        }

        Integral(Class javaType) {
            super(javaType);
        }
    }
}

