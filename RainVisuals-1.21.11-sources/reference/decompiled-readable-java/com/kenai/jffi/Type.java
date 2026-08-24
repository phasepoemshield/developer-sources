/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Foreign;
import com.kenai.jffi.NativeType;
import java.util.List;

public abstract class Type {
    public static final Type UINT8;
    public static final Type VOID;
    public static final Type DOUBLE;
    public static final Type UINT64;
    public static final Type FLOAT;
    public static final Type UINT32;
    public static final Type POINTER;
    public static final Type SINT16;
    public static final Type SLONG;
    public static final Type SLONG_LONG;
    public static final Type ULONG;
    public static final Type ULONG_LONG;
    public static final Type SCHAR;
    public static final Type USHORT;
    private int size = 0;
    public static final Type SSHORT;
    public static final Type SINT8;
    public static final Type UCHAR;
    private volatile long handle = 0L;
    public static final Type UINT;
    public static final Type SINT;
    public static final Type SINT64;
    private int type = 0;
    public static final Type UINT16;
    public static final Type SINT32;
    private int alignment = 0;
    public static final Type LONGDOUBLE;

    private int resolveAlignment() {
        this.alignment = this.getTypeInfo().alignment;
        return this.alignment;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void var1_1;
        int hash = 3;
        hash = 67 * hash + (int)(this.handle() ^ this.handle() >>> 32);
        return (int)var1_1;
    }

    public final int alignment() {
        return this.alignment != 0 ? this.alignment : this.resolveAlignment();
    }

    private static Type builtin(NativeType nativeType) {
        return new Builtin(nativeType);
    }

    final long handle() {
        return this.handle != 0L ? this.handle : this.resolveHandle();
    }

    private int resolveSize() {
        this.size = this.getTypeInfo().size;
        return this.size;
    }

    public final int type() {
        return this.type != 0 ? this.type : this.resolveType();
    }

    public boolean equals(Object obj) {
        return obj instanceof Type && ((Type)obj).handle() == this.handle();
    }

    abstract TypeInfo getTypeInfo();

    private int resolveType() {
        this.type = this.getTypeInfo().type;
        return this.type;
    }

    /*
     * WARNING - void declaration
     */
    static long[] nativeHandles(List<Type> types) {
        void var1_1;
        long[] nativeTypes = new long[types.size()];
        for (int i = 0; i < nativeTypes.length; ++i) {
            nativeTypes[i] = types.get(i).handle();
        }
        return var1_1;
    }

    private long resolveHandle() {
        this.handle = this.getTypeInfo().handle;
        return this.handle;
    }

    static {
        VOID = Type.builtin(NativeType.VOID);
        FLOAT = Type.builtin(NativeType.FLOAT);
        DOUBLE = Type.builtin(NativeType.DOUBLE);
        LONGDOUBLE = Type.builtin(NativeType.LONGDOUBLE);
        UINT8 = Type.builtin(NativeType.UINT8);
        SINT8 = Type.builtin(NativeType.SINT8);
        UINT16 = Type.builtin(NativeType.UINT16);
        SINT16 = Type.builtin(NativeType.SINT16);
        UINT32 = Type.builtin(NativeType.UINT32);
        SINT32 = Type.builtin(NativeType.SINT32);
        UINT64 = Type.builtin(NativeType.UINT64);
        SINT64 = Type.builtin(NativeType.SINT64);
        POINTER = Type.builtin(NativeType.POINTER);
        UCHAR = UINT8;
        SCHAR = SINT8;
        USHORT = UINT16;
        SSHORT = SINT16;
        UINT = UINT32;
        SINT = SINT32;
        ULONG = Type.builtin(NativeType.ULONG);
        SLONG = Type.builtin(NativeType.SLONG);
        ULONG_LONG = UINT64;
        SLONG_LONG = SINT64;
    }

    /*
     * WARNING - void declaration
     */
    static long[] nativeHandles(Type[] types) {
        void var1_1;
        long[] nativeTypes = new long[types.length];
        for (int i = 0; i < types.length; ++i) {
            nativeTypes[i] = types[i].handle();
        }
        return var1_1;
    }

    public final int size() {
        return this.size != 0 ? this.size : this.resolveSize();
    }

    static final class TypeInfo {
        final int type;
        final int alignment;
        final int size;
        final long handle;

        TypeInfo(long handle, int type, int size, int alignment) {
            this.handle = handle;
            this.type = type;
            this.size = size;
            this.alignment = alignment;
        }
    }

    static final class Builtin
    extends Type {
        private final NativeType nativeType;
        private TypeInfo typeInfo;

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + this.nativeType.hashCode();
            return result;
        }

        private TypeInfo lookupTypeInfo() {
            try {
                Foreign foreign = Foreign.getInstance();
                long handle = foreign.lookupBuiltinType(this.nativeType.ffiType);
                if (handle == 0L) {
                    throw new NullPointerException("invalid handle for native type " + (Object)((Object)this.nativeType));
                }
                this.typeInfo = new TypeInfo(handle, foreign.getTypeType(handle), foreign.getTypeSize(handle), foreign.getTypeAlign(handle));
                return this.typeInfo;
            }
            catch (Throwable error) {
                throw new UnsatisfiedLinkError("could not get native definition for type `" + (Object)((Object)this.nativeType) + "`, original error message follows: " + error.getLocalizedMessage());
            }
        }

        private Builtin(NativeType nativeType) {
            this.nativeType = nativeType;
        }

        @Override
        public boolean equals(Object o) {
            block7: {
                block6: {
                    if (this == o) {
                        return true;
                    }
                    if (o == null) break block6;
                    if (this.getClass() == o.getClass()) break block7;
                }
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            Builtin builtin = (Builtin)o;
            if (this.nativeType != builtin.nativeType) {
                return false;
            }
            return true;
        }

        @Override
        TypeInfo getTypeInfo() {
            return this.typeInfo != null ? this.typeInfo : this.lookupTypeInfo();
        }
    }
}

