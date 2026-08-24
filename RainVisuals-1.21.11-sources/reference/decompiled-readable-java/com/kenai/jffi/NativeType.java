/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

public final class NativeType
extends Enum<NativeType> {
    public static final /* enum */ NativeType SINT16;
    public static final /* enum */ NativeType POINTER;
    private static final /* synthetic */ NativeType[] $VALUES;
    public static final /* enum */ NativeType SINT;
    public static final /* enum */ NativeType UCHAR;
    public static final /* enum */ NativeType UINT;
    public static final /* enum */ NativeType USHORT;
    public static final /* enum */ NativeType FLOAT;
    public static final /* enum */ NativeType SINT64;
    public static final /* enum */ NativeType UINT32;
    public static final /* enum */ NativeType SINT32;
    public static final /* enum */ NativeType LONGDOUBLE;
    public static final /* enum */ NativeType VOID;
    public static final /* enum */ NativeType ULONG;
    public static final /* enum */ NativeType SCHAR;
    public static final /* enum */ NativeType UINT64;
    final int ffiType;
    public static final /* enum */ NativeType UINT16;
    public static final /* enum */ NativeType STRUCT;
    public static final /* enum */ NativeType DOUBLE;
    public static final /* enum */ NativeType SSHORT;
    public static final /* enum */ NativeType SLONG;
    public static final /* enum */ NativeType UINT8;
    public static final /* enum */ NativeType SINT8;

    public static NativeType valueOf(String name) {
        return Enum.valueOf(NativeType.class, name);
    }

    static {
        VOID = new NativeType(0);
        FLOAT = new NativeType(2);
        DOUBLE = new NativeType(3);
        LONGDOUBLE = new NativeType(4);
        UINT8 = new NativeType(5);
        SINT8 = new NativeType(6);
        UINT16 = new NativeType(7);
        SINT16 = new NativeType(8);
        UINT32 = new NativeType(9);
        SINT32 = new NativeType(10);
        UINT64 = new NativeType(11);
        SINT64 = new NativeType(12);
        POINTER = new NativeType(14);
        UCHAR = new NativeType(101);
        SCHAR = new NativeType(102);
        USHORT = new NativeType(103);
        SSHORT = new NativeType(104);
        UINT = new NativeType(105);
        SINT = new NativeType(106);
        ULONG = new NativeType(107);
        SLONG = new NativeType(108);
        STRUCT = new NativeType(13);
        $VALUES = NativeType.$values();
    }

    public static NativeType[] values() {
        return (NativeType[])$VALUES.clone();
    }

    private NativeType(int ffiType) {
        this.ffiType = ffiType;
    }

    private static /* synthetic */ NativeType[] $values() {
        NativeType[] nativeTypeArray = new NativeType[22];
        nativeTypeArray[0] = VOID;
        nativeTypeArray[1] = FLOAT;
        nativeTypeArray[2] = DOUBLE;
        nativeTypeArray[3] = LONGDOUBLE;
        nativeTypeArray[4] = UINT8;
        nativeTypeArray[5] = SINT8;
        nativeTypeArray[6] = UINT16;
        nativeTypeArray[7] = SINT16;
        nativeTypeArray[8] = UINT32;
        nativeTypeArray[9] = SINT32;
        nativeTypeArray[10] = UINT64;
        nativeTypeArray[11] = SINT64;
        nativeTypeArray[12] = POINTER;
        nativeTypeArray[13] = UCHAR;
        nativeTypeArray[14] = SCHAR;
        nativeTypeArray[15] = USHORT;
        nativeTypeArray[16] = SSHORT;
        nativeTypeArray[17] = UINT;
        nativeTypeArray[18] = SINT;
        nativeTypeArray[19] = ULONG;
        nativeTypeArray[20] = SLONG;
        nativeTypeArray[21] = STRUCT;
        return nativeTypeArray;
    }
}

