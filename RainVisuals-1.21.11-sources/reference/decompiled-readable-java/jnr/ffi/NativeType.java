/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

public final class NativeType
extends Enum<NativeType> {
    public static final /* enum */ NativeType UCHAR;
    public static final /* enum */ NativeType USHORT;
    public static final /* enum */ NativeType FLOAT;
    public static final /* enum */ NativeType SCHAR;
    public static final /* enum */ NativeType ULONG;
    public static final /* enum */ NativeType STRUCT;
    public static final /* enum */ NativeType ULONGLONG;
    public static final /* enum */ NativeType ADDRESS;
    public static final /* enum */ NativeType SSHORT;
    private static final /* synthetic */ NativeType[] $VALUES;
    public static final /* enum */ NativeType UINT;
    public static final /* enum */ NativeType SLONGLONG;
    public static final /* enum */ NativeType VOID;
    public static final /* enum */ NativeType DOUBLE;
    public static final /* enum */ NativeType SLONG;
    public static final /* enum */ NativeType SINT;

    public static NativeType[] values() {
        return (NativeType[])$VALUES.clone();
    }

    private static /* synthetic */ NativeType[] $values() {
        NativeType[] nativeTypeArray = new NativeType[15];
        nativeTypeArray[0] = VOID;
        nativeTypeArray[1] = SCHAR;
        nativeTypeArray[2] = UCHAR;
        nativeTypeArray[3] = SSHORT;
        nativeTypeArray[4] = USHORT;
        nativeTypeArray[5] = SINT;
        nativeTypeArray[6] = UINT;
        nativeTypeArray[7] = SLONG;
        nativeTypeArray[8] = ULONG;
        nativeTypeArray[9] = SLONGLONG;
        nativeTypeArray[10] = ULONGLONG;
        nativeTypeArray[11] = FLOAT;
        nativeTypeArray[12] = DOUBLE;
        nativeTypeArray[13] = STRUCT;
        nativeTypeArray[14] = ADDRESS;
        return nativeTypeArray;
    }

    static {
        VOID = new NativeType();
        SCHAR = new NativeType();
        UCHAR = new NativeType();
        SSHORT = new NativeType();
        USHORT = new NativeType();
        SINT = new NativeType();
        UINT = new NativeType();
        SLONG = new NativeType();
        ULONG = new NativeType();
        SLONGLONG = new NativeType();
        ULONGLONG = new NativeType();
        FLOAT = new NativeType();
        DOUBLE = new NativeType();
        STRUCT = new NativeType();
        ADDRESS = new NativeType();
        $VALUES = NativeType.$values();
    }

    public static NativeType valueOf(String name) {
        return Enum.valueOf(NativeType.class, name);
    }
}

