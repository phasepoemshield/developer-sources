/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.lenni0451.reflect.accessor;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.ProtectionDomain;
import javax.annotation.Nullable;
import net.lenni0451.reflect.JavaBypass;

public class UnsafeAccess {
    private static final String UNAVAILABLE_MESSAGE = "This method is not supported on this platform or Java version!";
    private static final MethodHandle staticFieldBase_1 = UnsafeAccess.tryGet(new String[]{"staticFieldBase"}, MethodType.methodType(Object.class, Field.class));
    private static final MethodHandle staticFieldOffset_2 = UnsafeAccess.tryGet(new String[]{"staticFieldOffset"}, MethodType.methodType(Long.TYPE, Field.class));
    private static final MethodHandle allocateInstance_3 = UnsafeAccess.tryGet(new String[]{"allocateInstance"}, MethodType.methodType(Object.class, Class.class));
    private static final MethodHandle loadFence_4 = UnsafeAccess.tryGet(new String[]{"loadFence"}, MethodType.methodType(Void.TYPE));
    private static final MethodHandle storeFence_5 = UnsafeAccess.tryGet(new String[]{"storeFence"}, MethodType.methodType(Void.TYPE));
    private static final MethodHandle fullFence_6 = UnsafeAccess.tryGet(new String[]{"fullFence"}, MethodType.methodType(Void.TYPE));
    private static final MethodHandle getBoolean_7 = UnsafeAccess.tryGet(new String[]{"getBoolean"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putBoolean_8 = UnsafeAccess.tryGet(new String[]{"putBoolean"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getByte_9 = UnsafeAccess.tryGet(new String[]{"getByte"}, MethodType.methodType(Byte.TYPE, Long.TYPE));
    private static final MethodHandle getByte_10 = UnsafeAccess.tryGet(new String[]{"getByte"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putByte_11 = UnsafeAccess.tryGet(new String[]{"putByte"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle putByte_12 = UnsafeAccess.tryGet(new String[]{"putByte"}, MethodType.methodType(Void.TYPE, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getShort_13 = UnsafeAccess.tryGet(new String[]{"getShort"}, MethodType.methodType(Short.TYPE, Long.TYPE));
    private static final MethodHandle getShort_14 = UnsafeAccess.tryGet(new String[]{"getShort"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putShort_15 = UnsafeAccess.tryGet(new String[]{"putShort"}, MethodType.methodType(Void.TYPE, Long.TYPE, Short.TYPE));
    private static final MethodHandle putShort_16 = UnsafeAccess.tryGet(new String[]{"putShort"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getChar_17 = UnsafeAccess.tryGet(new String[]{"getChar"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle getChar_18 = UnsafeAccess.tryGet(new String[]{"getChar"}, MethodType.methodType(Character.TYPE, Long.TYPE));
    private static final MethodHandle putChar_19 = UnsafeAccess.tryGet(new String[]{"putChar"}, MethodType.methodType(Void.TYPE, Long.TYPE, Character.TYPE));
    private static final MethodHandle putChar_20 = UnsafeAccess.tryGet(new String[]{"putChar"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getInt_21 = UnsafeAccess.tryGet(new String[]{"getInt"}, MethodType.methodType(Integer.TYPE, Long.TYPE));
    private static final MethodHandle getInt_22 = UnsafeAccess.tryGet(new String[]{"getInt"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putInt_23 = UnsafeAccess.tryGet(new String[]{"putInt"}, MethodType.methodType(Void.TYPE, Long.TYPE, Integer.TYPE));
    private static final MethodHandle putInt_24 = UnsafeAccess.tryGet(new String[]{"putInt"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getLong_25 = UnsafeAccess.tryGet(new String[]{"getLong"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle getLong_26 = UnsafeAccess.tryGet(new String[]{"getLong"}, MethodType.methodType(Long.TYPE, Long.TYPE));
    private static final MethodHandle putLong_27 = UnsafeAccess.tryGet(new String[]{"putLong"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle putLong_28 = UnsafeAccess.tryGet(new String[]{"putLong"}, MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle getFloat_29 = UnsafeAccess.tryGet(new String[]{"getFloat"}, MethodType.methodType(Float.TYPE, Long.TYPE));
    private static final MethodHandle getFloat_30 = UnsafeAccess.tryGet(new String[]{"getFloat"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putFloat_31 = UnsafeAccess.tryGet(new String[]{"putFloat"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle putFloat_32 = UnsafeAccess.tryGet(new String[]{"putFloat"}, MethodType.methodType(Void.TYPE, Long.TYPE, Float.TYPE));
    private static final MethodHandle getDouble_33 = UnsafeAccess.tryGet(new String[]{"getDouble"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle getDouble_34 = UnsafeAccess.tryGet(new String[]{"getDouble"}, MethodType.methodType(Double.TYPE, Long.TYPE));
    private static final MethodHandle putDouble_35 = UnsafeAccess.tryGet(new String[]{"putDouble"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle putDouble_36 = UnsafeAccess.tryGet(new String[]{"putDouble"}, MethodType.methodType(Void.TYPE, Long.TYPE, Double.TYPE));
    private static final MethodHandle getBooleanVolatile_37 = UnsafeAccess.tryGet(new String[]{"getBooleanVolatile"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putBooleanVolatile_38 = UnsafeAccess.tryGet(new String[]{"putBooleanVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getByteVolatile_39 = UnsafeAccess.tryGet(new String[]{"getByteVolatile"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putByteVolatile_40 = UnsafeAccess.tryGet(new String[]{"putByteVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getShortVolatile_41 = UnsafeAccess.tryGet(new String[]{"getShortVolatile"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putShortVolatile_42 = UnsafeAccess.tryGet(new String[]{"putShortVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getCharVolatile_43 = UnsafeAccess.tryGet(new String[]{"getCharVolatile"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putCharVolatile_44 = UnsafeAccess.tryGet(new String[]{"putCharVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getIntVolatile_45 = UnsafeAccess.tryGet(new String[]{"getIntVolatile"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putIntVolatile_46 = UnsafeAccess.tryGet(new String[]{"putIntVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getLongVolatile_47 = UnsafeAccess.tryGet(new String[]{"getLongVolatile"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putLongVolatile_48 = UnsafeAccess.tryGet(new String[]{"putLongVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getFloatVolatile_49 = UnsafeAccess.tryGet(new String[]{"getFloatVolatile"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putFloatVolatile_50 = UnsafeAccess.tryGet(new String[]{"putFloatVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle getDoubleVolatile_51 = UnsafeAccess.tryGet(new String[]{"getDoubleVolatile"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putDoubleVolatile_52 = UnsafeAccess.tryGet(new String[]{"putDoubleVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle getAndAddInt_53 = UnsafeAccess.tryGet(new String[]{"getAndAddInt"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndAddLong_54 = UnsafeAccess.tryGet(new String[]{"getAndAddLong"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndSetInt_55 = UnsafeAccess.tryGet(new String[]{"getAndSetInt"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndSetLong_56 = UnsafeAccess.tryGet(new String[]{"getAndSetLong"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle park_57 = UnsafeAccess.tryGet(new String[]{"park"}, MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE));
    private static final MethodHandle unpark_58 = UnsafeAccess.tryGet(new String[]{"unpark"}, MethodType.methodType(Void.TYPE, Object.class));
    private static final MethodHandle throwException_59 = UnsafeAccess.tryGet(new String[]{"throwException"}, MethodType.methodType(Void.TYPE, Throwable.class));
    private static final MethodHandle objectFieldOffset_60 = UnsafeAccess.tryGet(new String[]{"objectFieldOffset"}, MethodType.methodType(Long.TYPE, Field.class));
    private static final MethodHandle ensureClassInitialized_61 = UnsafeAccess.tryGet(new String[]{"ensureClassInitialized"}, MethodType.methodType(Void.TYPE, Class.class));
    private static final MethodHandle shouldBeInitialized_62 = UnsafeAccess.tryGet(new String[]{"shouldBeInitialized"}, MethodType.methodType(Boolean.TYPE, Class.class));
    private static final MethodHandle getAddress_63 = UnsafeAccess.tryGet(new String[]{"getAddress"}, MethodType.methodType(Long.TYPE, Long.TYPE));
    private static final MethodHandle putAddress_64 = UnsafeAccess.tryGet(new String[]{"putAddress"}, MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle freeMemory_65 = UnsafeAccess.tryGet(new String[]{"freeMemory"}, MethodType.methodType(Void.TYPE, Long.TYPE));
    private static final MethodHandle setMemory_66 = UnsafeAccess.tryGet(new String[]{"setMemory"}, MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE, Byte.TYPE));
    private static final MethodHandle setMemory_67 = UnsafeAccess.tryGet(new String[]{"setMemory"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE, Byte.TYPE));
    private static final MethodHandle copyMemory_68 = UnsafeAccess.tryGet(new String[]{"copyMemory"}, MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle copyMemory_69 = UnsafeAccess.tryGet(new String[]{"copyMemory"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle arrayBaseOffsetInt_70 = UnsafeAccess.tryGet(new String[]{"arrayBaseOffsetInt", "arrayBaseOffset"}, MethodType.methodType(Integer.TYPE, Class.class));
    private static final MethodHandle arrayBaseOffsetLong_71 = UnsafeAccess.tryGet(new String[]{"arrayBaseOffsetLong", "arrayBaseOffset"}, MethodType.methodType(Long.TYPE, Class.class));
    private static final MethodHandle arrayIndexScale_72 = UnsafeAccess.tryGet(new String[]{"arrayIndexScale"}, MethodType.methodType(Integer.TYPE, Class.class));
    private static final MethodHandle allocateMemory_73 = UnsafeAccess.tryGet(new String[]{"allocateMemory"}, MethodType.methodType(Long.TYPE, Long.TYPE));
    private static final MethodHandle reallocateMemory_74 = UnsafeAccess.tryGet(new String[]{"reallocateMemory"}, MethodType.methodType(Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle addressSize_75 = UnsafeAccess.tryGet(new String[]{"addressSize"}, MethodType.methodType(Integer.TYPE));
    private static final MethodHandle pageSize_76 = UnsafeAccess.tryGet(new String[]{"pageSize"}, MethodType.methodType(Integer.TYPE));
    private static final MethodHandle getLoadAverage_77 = UnsafeAccess.tryGet(new String[]{"getLoadAverage"}, MethodType.methodType(Integer.TYPE, Double.TYPE, Integer.TYPE));
    private static final MethodHandle invokeCleaner_78 = UnsafeAccess.tryGet(new String[]{"invokeCleaner"}, MethodType.methodType(Void.TYPE, ByteBuffer.class));
    private static final MethodHandle getObject_79 = UnsafeAccess.tryGet(new String[]{"getObject", "getReference"}, MethodType.methodType(Object.class, Object.class, Long.TYPE));
    private static final MethodHandle getObjectVolatile_80 = UnsafeAccess.tryGet(new String[]{"getObjectVolatile", "getReferenceVolatile"}, MethodType.methodType(Object.class, Object.class, Long.TYPE));
    private static final MethodHandle putObject_81 = UnsafeAccess.tryGet(new String[]{"putObject", "putReference"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle putObjectVolatile_82 = UnsafeAccess.tryGet(new String[]{"putObjectVolatile", "putReferenceVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle getAndSetObject_83 = UnsafeAccess.tryGet(new String[]{"getAndSetObject", "getAndSetReference"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle compareAndSwapObject_84 = UnsafeAccess.tryGet(new String[]{"compareAndSwapObject"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle compareAndSwapInt_85 = UnsafeAccess.tryGet(new String[]{"compareAndSwapInt"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Integer.TYPE, Integer.TYPE));
    private static final MethodHandle compareAndSwapLong_86 = UnsafeAccess.tryGet(new String[]{"compareAndSwapLong"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle putOrderedObject_87 = UnsafeAccess.tryGet(new String[]{"putOrderedObject"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle putOrderedInt_88 = UnsafeAccess.tryGet(new String[]{"putOrderedInt"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle putOrderedLong_89 = UnsafeAccess.tryGet(new String[]{"putOrderedLong"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle compareAndSetBoolean_90 = UnsafeAccess.tryGet(new String[]{"compareAndSetBoolean"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE));
    private static final MethodHandle storeStoreFence_91 = UnsafeAccess.tryGet(new String[]{"storeStoreFence"}, MethodType.methodType(Void.TYPE));
    private static final MethodHandle getReference_92 = UnsafeAccess.tryGet(new String[]{"getReference"}, MethodType.methodType(Object.class, Object.class, Long.TYPE));
    private static final MethodHandle putReference_93 = UnsafeAccess.tryGet(new String[]{"putReference"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle getReferenceVolatile_94 = UnsafeAccess.tryGet(new String[]{"getReferenceVolatile"}, MethodType.methodType(Object.class, Object.class, Long.TYPE));
    private static final MethodHandle putReferenceVolatile_95 = UnsafeAccess.tryGet(new String[]{"putReferenceVolatile"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle getReferenceOpaque_96 = UnsafeAccess.tryGet(new String[]{"getReferenceOpaque"}, MethodType.methodType(Object.class, Object.class, Long.TYPE));
    private static final MethodHandle putReferenceOpaque_97 = UnsafeAccess.tryGet(new String[]{"putReferenceOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle getBooleanOpaque_98 = UnsafeAccess.tryGet(new String[]{"getBooleanOpaque"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putBooleanOpaque_99 = UnsafeAccess.tryGet(new String[]{"putBooleanOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getByteOpaque_100 = UnsafeAccess.tryGet(new String[]{"getByteOpaque"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putByteOpaque_101 = UnsafeAccess.tryGet(new String[]{"putByteOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getShortOpaque_102 = UnsafeAccess.tryGet(new String[]{"getShortOpaque"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putShortOpaque_103 = UnsafeAccess.tryGet(new String[]{"putShortOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getCharOpaque_104 = UnsafeAccess.tryGet(new String[]{"getCharOpaque"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putCharOpaque_105 = UnsafeAccess.tryGet(new String[]{"putCharOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getIntOpaque_106 = UnsafeAccess.tryGet(new String[]{"getIntOpaque"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putIntOpaque_107 = UnsafeAccess.tryGet(new String[]{"putIntOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getLongOpaque_108 = UnsafeAccess.tryGet(new String[]{"getLongOpaque"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putLongOpaque_109 = UnsafeAccess.tryGet(new String[]{"putLongOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getFloatOpaque_110 = UnsafeAccess.tryGet(new String[]{"getFloatOpaque"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putFloatOpaque_111 = UnsafeAccess.tryGet(new String[]{"putFloatOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle getDoubleOpaque_112 = UnsafeAccess.tryGet(new String[]{"getDoubleOpaque"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putDoubleOpaque_113 = UnsafeAccess.tryGet(new String[]{"putDoubleOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle getReferenceAcquire_114 = UnsafeAccess.tryGet(new String[]{"getReferenceAcquire"}, MethodType.methodType(Object.class, Object.class, Long.TYPE));
    private static final MethodHandle putReferenceRelease_115 = UnsafeAccess.tryGet(new String[]{"putReferenceRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle getBooleanAcquire_116 = UnsafeAccess.tryGet(new String[]{"getBooleanAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putBooleanRelease_117 = UnsafeAccess.tryGet(new String[]{"putBooleanRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getByteAcquire_118 = UnsafeAccess.tryGet(new String[]{"getByteAcquire"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putByteRelease_119 = UnsafeAccess.tryGet(new String[]{"putByteRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getShortAcquire_120 = UnsafeAccess.tryGet(new String[]{"getShortAcquire"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putShortRelease_121 = UnsafeAccess.tryGet(new String[]{"putShortRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getCharAcquire_122 = UnsafeAccess.tryGet(new String[]{"getCharAcquire"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putCharRelease_123 = UnsafeAccess.tryGet(new String[]{"putCharRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getIntAcquire_124 = UnsafeAccess.tryGet(new String[]{"getIntAcquire"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putIntRelease_125 = UnsafeAccess.tryGet(new String[]{"putIntRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getLongAcquire_126 = UnsafeAccess.tryGet(new String[]{"getLongAcquire"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putLongRelease_127 = UnsafeAccess.tryGet(new String[]{"putLongRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getFloatAcquire_128 = UnsafeAccess.tryGet(new String[]{"getFloatAcquire"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putFloatRelease_129 = UnsafeAccess.tryGet(new String[]{"putFloatRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle getDoubleAcquire_130 = UnsafeAccess.tryGet(new String[]{"getDoubleAcquire"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putDoubleRelease_131 = UnsafeAccess.tryGet(new String[]{"putDoubleRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle getShortUnaligned_132 = UnsafeAccess.tryGet(new String[]{"getShortUnaligned"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getShortUnaligned_133 = UnsafeAccess.tryGet(new String[]{"getShortUnaligned"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putShortUnaligned_134 = UnsafeAccess.tryGet(new String[]{"putShortUnaligned"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle putShortUnaligned_135 = UnsafeAccess.tryGet(new String[]{"putShortUnaligned"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Short.TYPE, Boolean.TYPE));
    private static final MethodHandle getCharUnaligned_136 = UnsafeAccess.tryGet(new String[]{"getCharUnaligned"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getCharUnaligned_137 = UnsafeAccess.tryGet(new String[]{"getCharUnaligned"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putCharUnaligned_138 = UnsafeAccess.tryGet(new String[]{"putCharUnaligned"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle putCharUnaligned_139 = UnsafeAccess.tryGet(new String[]{"putCharUnaligned"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Character.TYPE, Boolean.TYPE));
    private static final MethodHandle getIntUnaligned_140 = UnsafeAccess.tryGet(new String[]{"getIntUnaligned"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle getIntUnaligned_141 = UnsafeAccess.tryGet(new String[]{"getIntUnaligned"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle putIntUnaligned_142 = UnsafeAccess.tryGet(new String[]{"putIntUnaligned"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Integer.TYPE, Boolean.TYPE));
    private static final MethodHandle putIntUnaligned_143 = UnsafeAccess.tryGet(new String[]{"putIntUnaligned"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getLongUnaligned_144 = UnsafeAccess.tryGet(new String[]{"getLongUnaligned"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getLongUnaligned_145 = UnsafeAccess.tryGet(new String[]{"getLongUnaligned"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putLongUnaligned_146 = UnsafeAccess.tryGet(new String[]{"putLongUnaligned"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle putLongUnaligned_147 = UnsafeAccess.tryGet(new String[]{"putLongUnaligned"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle compareAndSetReference_148 = UnsafeAccess.tryGet(new String[]{"compareAndSetReference"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle compareAndExchangeReference_149 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeReference"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle compareAndExchangeReferenceAcquire_150 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeReferenceAcquire"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle compareAndExchangeReferenceRelease_151 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeReferenceRelease"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle compareAndSetLong_152 = UnsafeAccess.tryGet(new String[]{"compareAndSetLong"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle compareAndExchangeLong_153 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeLong"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle compareAndExchangeLongAcquire_154 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeLongAcquire"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle compareAndExchangeLongRelease_155 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeLongRelease"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle compareAndSetInt_156 = UnsafeAccess.tryGet(new String[]{"compareAndSetInt"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Integer.TYPE, Integer.TYPE));
    private static final MethodHandle compareAndExchangeInt_157 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeInt"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE, Integer.TYPE));
    private static final MethodHandle compareAndExchangeIntAcquire_158 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeIntAcquire"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE, Integer.TYPE));
    private static final MethodHandle compareAndExchangeIntRelease_159 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeIntRelease"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE, Integer.TYPE));
    private static final MethodHandle compareAndSetByte_160 = UnsafeAccess.tryGet(new String[]{"compareAndSetByte"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Byte.TYPE, Byte.TYPE));
    private static final MethodHandle compareAndExchangeByte_161 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeByte"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE, Byte.TYPE));
    private static final MethodHandle compareAndExchangeByteAcquire_162 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeByteAcquire"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE, Byte.TYPE));
    private static final MethodHandle compareAndExchangeByteRelease_163 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeByteRelease"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE, Byte.TYPE));
    private static final MethodHandle compareAndSetShort_164 = UnsafeAccess.tryGet(new String[]{"compareAndSetShort"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Short.TYPE, Short.TYPE));
    private static final MethodHandle compareAndExchangeShort_165 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeShort"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE, Short.TYPE));
    private static final MethodHandle compareAndExchangeShortAcquire_166 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeShortAcquire"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE, Short.TYPE));
    private static final MethodHandle compareAndExchangeShortRelease_167 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeShortRelease"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE, Short.TYPE));
    private static final MethodHandle weakCompareAndSetReferencePlain_168 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetReferencePlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle weakCompareAndSetReferenceAcquire_169 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetReferenceAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle weakCompareAndSetReferenceRelease_170 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetReferenceRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle weakCompareAndSetReference_171 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetReference"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle weakCompareAndSetLongPlain_172 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetLongPlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle weakCompareAndSetLongAcquire_173 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetLongAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle weakCompareAndSetLongRelease_174 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetLongRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle weakCompareAndSetLong_175 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetLong"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle weakCompareAndSetIntPlain_176 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetIntPlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Integer.TYPE, Integer.TYPE));
    private static final MethodHandle weakCompareAndSetIntAcquire_177 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetIntAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Integer.TYPE, Integer.TYPE));
    private static final MethodHandle weakCompareAndSetIntRelease_178 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetIntRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Integer.TYPE, Integer.TYPE));
    private static final MethodHandle weakCompareAndSetInt_179 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetInt"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Integer.TYPE, Integer.TYPE));
    private static final MethodHandle weakCompareAndSetBytePlain_180 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetBytePlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Byte.TYPE, Byte.TYPE));
    private static final MethodHandle weakCompareAndSetByteAcquire_181 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetByteAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Byte.TYPE, Byte.TYPE));
    private static final MethodHandle weakCompareAndSetByteRelease_182 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetByteRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Byte.TYPE, Byte.TYPE));
    private static final MethodHandle weakCompareAndSetByte_183 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetByte"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Byte.TYPE, Byte.TYPE));
    private static final MethodHandle weakCompareAndSetShortPlain_184 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetShortPlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Short.TYPE, Short.TYPE));
    private static final MethodHandle weakCompareAndSetShortAcquire_185 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetShortAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Short.TYPE, Short.TYPE));
    private static final MethodHandle weakCompareAndSetShortRelease_186 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetShortRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Short.TYPE, Short.TYPE));
    private static final MethodHandle weakCompareAndSetShort_187 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetShort"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Short.TYPE, Short.TYPE));
    private static final MethodHandle getAndAddByte_188 = UnsafeAccess.tryGet(new String[]{"getAndAddByte"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndAddShort_189 = UnsafeAccess.tryGet(new String[]{"getAndAddShort"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndSetByte_190 = UnsafeAccess.tryGet(new String[]{"getAndSetByte"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndSetShort_191 = UnsafeAccess.tryGet(new String[]{"getAndSetShort"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndSetReference_192 = UnsafeAccess.tryGet(new String[]{"getAndSetReference"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle defineClass_193 = UnsafeAccess.tryGet(new String[]{"defineClass"}, MethodType.methodType(Class.class, String.class, Byte.TYPE, Integer.TYPE, Integer.TYPE, ClassLoader.class, ProtectionDomain.class));
    private static final MethodHandle objectFieldOffset_194 = UnsafeAccess.tryGet(new String[]{"objectFieldOffset"}, MethodType.methodType(Long.TYPE, Class.class, String.class));
    private static final MethodHandle defineClass0_195 = UnsafeAccess.tryGet(new String[]{"defineClass0"}, MethodType.methodType(Class.class, String.class, Byte.TYPE, Integer.TYPE, Integer.TYPE, ClassLoader.class, ProtectionDomain.class));
    private static final MethodHandle getAndSetBoolean_196 = UnsafeAccess.tryGet(new String[]{"getAndSetBoolean"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle loadLoadFence_197 = UnsafeAccess.tryGet(new String[]{"loadLoadFence"}, MethodType.methodType(Void.TYPE));
    private static final MethodHandle getAddress_198 = UnsafeAccess.tryGet(new String[]{"getAddress"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE));
    private static final MethodHandle putAddress_199 = UnsafeAccess.tryGet(new String[]{"putAddress"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle copySwapMemory_200 = UnsafeAccess.tryGet(new String[]{"copySwapMemory"}, MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle copySwapMemory_201 = UnsafeAccess.tryGet(new String[]{"copySwapMemory"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle dataCacheLineAlignDown_202 = UnsafeAccess.tryGet(new String[]{"dataCacheLineAlignDown"}, MethodType.methodType(Long.TYPE, Long.TYPE));
    private static final MethodHandle dataCacheLineFlushSize_203 = UnsafeAccess.tryGet(new String[]{"dataCacheLineFlushSize"}, MethodType.methodType(Integer.TYPE));
    private static final MethodHandle getAndAddShortRelease_204 = UnsafeAccess.tryGet(new String[]{"getAndAddShortRelease"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndAddShortAcquire_205 = UnsafeAccess.tryGet(new String[]{"getAndAddShortAcquire"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndSetByteRelease_206 = UnsafeAccess.tryGet(new String[]{"getAndSetByteRelease"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndSetByteAcquire_207 = UnsafeAccess.tryGet(new String[]{"getAndSetByteAcquire"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndSetShortRelease_208 = UnsafeAccess.tryGet(new String[]{"getAndSetShortRelease"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndSetShortAcquire_209 = UnsafeAccess.tryGet(new String[]{"getAndSetShortAcquire"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndSetIntRelease_210 = UnsafeAccess.tryGet(new String[]{"getAndSetIntRelease"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndSetIntAcquire_211 = UnsafeAccess.tryGet(new String[]{"getAndSetIntAcquire"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndSetLongRelease_212 = UnsafeAccess.tryGet(new String[]{"getAndSetLongRelease"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndSetLongAcquire_213 = UnsafeAccess.tryGet(new String[]{"getAndSetLongAcquire"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndBitwiseOrByte_214 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrByte"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndBitwiseOrByteRelease_215 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrByteRelease"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndBitwiseOrByteAcquire_216 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrByteAcquire"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndBitwiseAndByte_217 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndByte"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndBitwiseAndByteRelease_218 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndByteRelease"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndBitwiseAndByteAcquire_219 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndByteAcquire"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndBitwiseXorByte_220 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorByte"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndBitwiseXorByteRelease_221 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorByteRelease"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndBitwiseXorByteAcquire_222 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorByteAcquire"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndBitwiseOrShort_223 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrShort"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndBitwiseOrShortRelease_224 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrShortRelease"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndBitwiseOrShortAcquire_225 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrShortAcquire"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndBitwiseAndShort_226 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndShort"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndBitwiseAndShortRelease_227 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndShortRelease"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndBitwiseAndShortAcquire_228 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndShortAcquire"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndBitwiseXorShort_229 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorShort"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndBitwiseXorShortRelease_230 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorShortRelease"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndBitwiseXorShortAcquire_231 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorShortAcquire"}, MethodType.methodType(Short.TYPE, Object.class, Long.TYPE, Short.TYPE));
    private static final MethodHandle getAndSetReferenceAcquire_232 = UnsafeAccess.tryGet(new String[]{"getAndSetReferenceAcquire"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle getAndSetReferenceRelease_233 = UnsafeAccess.tryGet(new String[]{"getAndSetReferenceRelease"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle getUncompressedObject_234 = UnsafeAccess.tryGet(new String[]{"getUncompressedObject"}, MethodType.methodType(Object.class, Long.TYPE));
    private static final MethodHandle writebackMemory_235 = UnsafeAccess.tryGet(new String[]{"writebackMemory"}, MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE));
    private static final MethodHandle allocateUninitializedArray_236 = UnsafeAccess.tryGet(new String[]{"allocateUninitializedArray"}, MethodType.methodType(Object.class, Class.class, Integer.TYPE));
    private static final MethodHandle compareAndSetChar_237 = UnsafeAccess.tryGet(new String[]{"compareAndSetChar"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Character.TYPE, Character.TYPE));
    private static final MethodHandle compareAndExchangeChar_238 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeChar"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE, Character.TYPE));
    private static final MethodHandle compareAndExchangeCharAcquire_239 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeCharAcquire"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE, Character.TYPE));
    private static final MethodHandle compareAndExchangeCharRelease_240 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeCharRelease"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE, Character.TYPE));
    private static final MethodHandle weakCompareAndSetChar_241 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetChar"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Character.TYPE, Character.TYPE));
    private static final MethodHandle weakCompareAndSetCharAcquire_242 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetCharAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Character.TYPE, Character.TYPE));
    private static final MethodHandle weakCompareAndSetCharRelease_243 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetCharRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Character.TYPE, Character.TYPE));
    private static final MethodHandle weakCompareAndSetCharPlain_244 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetCharPlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Character.TYPE, Character.TYPE));
    private static final MethodHandle compareAndExchangeBoolean_245 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeBoolean"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE));
    private static final MethodHandle compareAndExchangeBooleanAcquire_246 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeBooleanAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE));
    private static final MethodHandle compareAndExchangeBooleanRelease_247 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeBooleanRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE));
    private static final MethodHandle weakCompareAndSetBoolean_248 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetBoolean"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE));
    private static final MethodHandle weakCompareAndSetBooleanAcquire_249 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetBooleanAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE));
    private static final MethodHandle weakCompareAndSetBooleanRelease_250 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetBooleanRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE));
    private static final MethodHandle weakCompareAndSetBooleanPlain_251 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetBooleanPlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE));
    private static final MethodHandle compareAndSetFloat_252 = UnsafeAccess.tryGet(new String[]{"compareAndSetFloat"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Float.TYPE, Float.TYPE));
    private static final MethodHandle compareAndExchangeFloat_253 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeFloat"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE, Float.TYPE, Float.TYPE));
    private static final MethodHandle compareAndExchangeFloatAcquire_254 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeFloatAcquire"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE, Float.TYPE, Float.TYPE));
    private static final MethodHandle compareAndExchangeFloatRelease_255 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeFloatRelease"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE, Float.TYPE, Float.TYPE));
    private static final MethodHandle weakCompareAndSetFloatPlain_256 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetFloatPlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Float.TYPE, Float.TYPE));
    private static final MethodHandle weakCompareAndSetFloatAcquire_257 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetFloatAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Float.TYPE, Float.TYPE));
    private static final MethodHandle weakCompareAndSetFloatRelease_258 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetFloatRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Float.TYPE, Float.TYPE));
    private static final MethodHandle weakCompareAndSetFloat_259 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetFloat"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Float.TYPE, Float.TYPE));
    private static final MethodHandle compareAndSetDouble_260 = UnsafeAccess.tryGet(new String[]{"compareAndSetDouble"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Double.TYPE, Double.TYPE));
    private static final MethodHandle compareAndExchangeDouble_261 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeDouble"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE, Double.TYPE, Double.TYPE));
    private static final MethodHandle compareAndExchangeDoubleAcquire_262 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeDoubleAcquire"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE, Double.TYPE, Double.TYPE));
    private static final MethodHandle compareAndExchangeDoubleRelease_263 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeDoubleRelease"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE, Double.TYPE, Double.TYPE));
    private static final MethodHandle weakCompareAndSetDoublePlain_264 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetDoublePlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Double.TYPE, Double.TYPE));
    private static final MethodHandle weakCompareAndSetDoubleAcquire_265 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetDoubleAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Double.TYPE, Double.TYPE));
    private static final MethodHandle weakCompareAndSetDoubleRelease_266 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetDoubleRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Double.TYPE, Double.TYPE));
    private static final MethodHandle weakCompareAndSetDouble_267 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetDouble"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Double.TYPE, Double.TYPE));
    private static final MethodHandle getAndAddIntRelease_268 = UnsafeAccess.tryGet(new String[]{"getAndAddIntRelease"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndAddIntAcquire_269 = UnsafeAccess.tryGet(new String[]{"getAndAddIntAcquire"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndAddLongRelease_270 = UnsafeAccess.tryGet(new String[]{"getAndAddLongRelease"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndAddLongAcquire_271 = UnsafeAccess.tryGet(new String[]{"getAndAddLongAcquire"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndAddByteRelease_272 = UnsafeAccess.tryGet(new String[]{"getAndAddByteRelease"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndAddByteAcquire_273 = UnsafeAccess.tryGet(new String[]{"getAndAddByteAcquire"}, MethodType.methodType(Byte.TYPE, Object.class, Long.TYPE, Byte.TYPE));
    private static final MethodHandle getAndAddChar_274 = UnsafeAccess.tryGet(new String[]{"getAndAddChar"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndAddCharRelease_275 = UnsafeAccess.tryGet(new String[]{"getAndAddCharRelease"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndAddCharAcquire_276 = UnsafeAccess.tryGet(new String[]{"getAndAddCharAcquire"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndAddFloat_277 = UnsafeAccess.tryGet(new String[]{"getAndAddFloat"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle getAndAddFloatRelease_278 = UnsafeAccess.tryGet(new String[]{"getAndAddFloatRelease"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle getAndAddFloatAcquire_279 = UnsafeAccess.tryGet(new String[]{"getAndAddFloatAcquire"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle getAndAddDouble_280 = UnsafeAccess.tryGet(new String[]{"getAndAddDouble"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle getAndAddDoubleRelease_281 = UnsafeAccess.tryGet(new String[]{"getAndAddDoubleRelease"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle getAndAddDoubleAcquire_282 = UnsafeAccess.tryGet(new String[]{"getAndAddDoubleAcquire"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle getAndSetBooleanRelease_283 = UnsafeAccess.tryGet(new String[]{"getAndSetBooleanRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndSetBooleanAcquire_284 = UnsafeAccess.tryGet(new String[]{"getAndSetBooleanAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndSetChar_285 = UnsafeAccess.tryGet(new String[]{"getAndSetChar"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndSetCharRelease_286 = UnsafeAccess.tryGet(new String[]{"getAndSetCharRelease"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndSetCharAcquire_287 = UnsafeAccess.tryGet(new String[]{"getAndSetCharAcquire"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndSetFloat_288 = UnsafeAccess.tryGet(new String[]{"getAndSetFloat"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle getAndSetFloatRelease_289 = UnsafeAccess.tryGet(new String[]{"getAndSetFloatRelease"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle getAndSetFloatAcquire_290 = UnsafeAccess.tryGet(new String[]{"getAndSetFloatAcquire"}, MethodType.methodType(Float.TYPE, Object.class, Long.TYPE, Float.TYPE));
    private static final MethodHandle getAndSetDouble_291 = UnsafeAccess.tryGet(new String[]{"getAndSetDouble"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle getAndSetDoubleRelease_292 = UnsafeAccess.tryGet(new String[]{"getAndSetDoubleRelease"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle getAndSetDoubleAcquire_293 = UnsafeAccess.tryGet(new String[]{"getAndSetDoubleAcquire"}, MethodType.methodType(Double.TYPE, Object.class, Long.TYPE, Double.TYPE));
    private static final MethodHandle getAndBitwiseOrBoolean_294 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrBoolean"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndBitwiseOrBooleanRelease_295 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrBooleanRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndBitwiseOrBooleanAcquire_296 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrBooleanAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndBitwiseAndBoolean_297 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndBoolean"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndBitwiseAndBooleanRelease_298 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndBooleanRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndBitwiseAndBooleanAcquire_299 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndBooleanAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndBitwiseXorBoolean_300 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorBoolean"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndBitwiseXorBooleanRelease_301 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorBooleanRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndBitwiseXorBooleanAcquire_302 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorBooleanAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Boolean.TYPE));
    private static final MethodHandle getAndBitwiseOrChar_303 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrChar"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndBitwiseOrCharRelease_304 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrCharRelease"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndBitwiseOrCharAcquire_305 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrCharAcquire"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndBitwiseAndChar_306 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndChar"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndBitwiseAndCharRelease_307 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndCharRelease"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndBitwiseAndCharAcquire_308 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndCharAcquire"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndBitwiseXorChar_309 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorChar"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndBitwiseXorCharRelease_310 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorCharRelease"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndBitwiseXorCharAcquire_311 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorCharAcquire"}, MethodType.methodType(Character.TYPE, Object.class, Long.TYPE, Character.TYPE));
    private static final MethodHandle getAndBitwiseOrInt_312 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrInt"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndBitwiseOrIntRelease_313 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrIntRelease"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndBitwiseOrIntAcquire_314 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrIntAcquire"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndBitwiseAndInt_315 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndInt"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndBitwiseAndIntRelease_316 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndIntRelease"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndBitwiseAndIntAcquire_317 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndIntAcquire"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndBitwiseXorInt_318 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorInt"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndBitwiseXorIntRelease_319 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorIntRelease"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndBitwiseXorIntAcquire_320 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorIntAcquire"}, MethodType.methodType(Integer.TYPE, Object.class, Long.TYPE, Integer.TYPE));
    private static final MethodHandle getAndBitwiseOrLong_321 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrLong"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndBitwiseOrLongRelease_322 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrLongRelease"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndBitwiseOrLongAcquire_323 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseOrLongAcquire"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndBitwiseAndLong_324 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndLong"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndBitwiseAndLongRelease_325 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndLongRelease"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndBitwiseAndLongAcquire_326 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseAndLongAcquire"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndBitwiseXorLong_327 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorLong"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndBitwiseXorLongRelease_328 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorLongRelease"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle getAndBitwiseXorLongAcquire_329 = UnsafeAccess.tryGet(new String[]{"getAndBitwiseXorLongAcquire"}, MethodType.methodType(Long.TYPE, Object.class, Long.TYPE, Long.TYPE));
    private static final MethodHandle isBigEndian_330 = UnsafeAccess.tryGet(new String[]{"isBigEndian"}, MethodType.methodType(Boolean.TYPE));
    private static final MethodHandle unalignedAccess_331 = UnsafeAccess.tryGet(new String[]{"unalignedAccess"}, MethodType.methodType(Boolean.TYPE));
    private static final MethodHandle getObjectAcquire_332 = UnsafeAccess.tryGet(new String[]{"getObjectAcquire", "getReferenceAcquire"}, MethodType.methodType(Object.class, Object.class, Long.TYPE));
    private static final MethodHandle getObjectOpaque_333 = UnsafeAccess.tryGet(new String[]{"getObjectOpaque", "getReferenceOpaque"}, MethodType.methodType(Object.class, Object.class, Long.TYPE));
    private static final MethodHandle putObjectOpaque_334 = UnsafeAccess.tryGet(new String[]{"putObjectOpaque", "putReferenceOpaque"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle putObjectRelease_335 = UnsafeAccess.tryGet(new String[]{"putObjectRelease", "putReferenceRelease"}, MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle getAndSetObjectAcquire_336 = UnsafeAccess.tryGet(new String[]{"getAndSetObjectAcquire", "getAndSetReferenceAcquire"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle getAndSetObjectRelease_337 = UnsafeAccess.tryGet(new String[]{"getAndSetObjectRelease", "getAndSetReferenceRelease"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class));
    private static final MethodHandle compareAndSetObject_338 = UnsafeAccess.tryGet(new String[]{"compareAndSetObject", "compareAndSetReference"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle compareAndExchangeObject_339 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeObject", "compareAndExchangeReference"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle compareAndExchangeObjectAcquire_340 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeObjectAcquire", "compareAndExchangeReferenceAcquire"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle compareAndExchangeObjectRelease_341 = UnsafeAccess.tryGet(new String[]{"compareAndExchangeObjectRelease", "compareAndExchangeReferenceRelease"}, MethodType.methodType(Object.class, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle weakCompareAndSetObject_342 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetObject", "weakCompareAndSetReference"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle weakCompareAndSetObjectAcquire_343 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetObjectAcquire", "weakCompareAndSetReferenceAcquire"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle weakCompareAndSetObjectPlain_344 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetObjectPlain", "weakCompareAndSetReferencePlain"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));
    private static final MethodHandle weakCompareAndSetObjectRelease_345 = UnsafeAccess.tryGet(new String[]{"weakCompareAndSetObjectRelease", "weakCompareAndSetReferenceRelease"}, MethodType.methodType(Boolean.TYPE, Object.class, Long.TYPE, Object.class, Object.class));

    public static Object staticFieldBase(Field f) {
        if (staticFieldBase_1 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return staticFieldBase_1.invokeExact(f);
    }

    public static long staticFieldOffset(Field f) {
        if (staticFieldOffset_2 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return staticFieldOffset_2.invokeExact(f);
    }

    public static Object allocateInstance(Class arg0) {
        if (allocateInstance_3 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return allocateInstance_3.invokeExact(arg0);
    }

    public static void loadFence() {
        if (loadFence_4 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        loadFence_4.invokeExact();
    }

    public static void storeFence() {
        if (storeFence_5 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        storeFence_5.invokeExact();
    }

    public static void fullFence() {
        if (fullFence_6 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        fullFence_6.invokeExact();
    }

    public static boolean getBoolean(Object arg0, long arg1) {
        if (getBoolean_7 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getBoolean_7.invokeExact(arg0, arg1);
    }

    public static void putBoolean(Object arg0, long arg1, boolean arg2) {
        if (putBoolean_8 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putBoolean_8.invokeExact(arg0, arg1, arg2);
    }

    public static byte getByte(long address) {
        if (getByte_9 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getByte_9.invokeExact(address);
    }

    public static byte getByte(Object arg0, long arg1) {
        if (getByte_10 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getByte_10.invokeExact(arg0, arg1);
    }

    public static void putByte(Object arg0, long arg1, byte arg2) {
        if (putByte_11 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putByte_11.invokeExact(arg0, arg1, arg2);
    }

    public static void putByte(long address, byte x) {
        if (putByte_12 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putByte_12.invokeExact(address, x);
    }

    public static short getShort(long address) {
        if (getShort_13 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getShort_13.invokeExact(address);
    }

    public static short getShort(Object arg0, long arg1) {
        if (getShort_14 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getShort_14.invokeExact(arg0, arg1);
    }

    public static void putShort(long address, short x) {
        if (putShort_15 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putShort_15.invokeExact(address, x);
    }

    public static void putShort(Object arg0, long arg1, short arg2) {
        if (putShort_16 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putShort_16.invokeExact(arg0, arg1, arg2);
    }

    public static char getChar(Object arg0, long arg1) {
        if (getChar_17 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getChar_17.invokeExact(arg0, arg1);
    }

    public static char getChar(long address) {
        if (getChar_18 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getChar_18.invokeExact(address);
    }

    public static void putChar(long address, char x) {
        if (putChar_19 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putChar_19.invokeExact(address, x);
    }

    public static void putChar(Object arg0, long arg1, char arg2) {
        if (putChar_20 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putChar_20.invokeExact(arg0, arg1, arg2);
    }

    public static int getInt(long address) {
        if (getInt_21 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getInt_21.invokeExact(address);
    }

    public static int getInt(Object arg0, long arg1) {
        if (getInt_22 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getInt_22.invokeExact(arg0, arg1);
    }

    public static void putInt(long address, int x) {
        if (putInt_23 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putInt_23.invokeExact(address, x);
    }

    public static void putInt(Object arg0, long arg1, int arg2) {
        if (putInt_24 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putInt_24.invokeExact(arg0, arg1, arg2);
    }

    public static long getLong(Object arg0, long arg1) {
        if (getLong_25 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getLong_25.invokeExact(arg0, arg1);
    }

    public static long getLong(long address) {
        if (getLong_26 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getLong_26.invokeExact(address);
    }

    public static void putLong(Object arg0, long arg1, long arg2) {
        if (putLong_27 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putLong_27.invokeExact(arg0, arg1, arg2);
    }

    public static void putLong(long address, long x) {
        if (putLong_28 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putLong_28.invokeExact(address, x);
    }

    public static float getFloat(long address) {
        if (getFloat_29 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getFloat_29.invokeExact(address);
    }

    public static float getFloat(Object arg0, long arg1) {
        if (getFloat_30 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getFloat_30.invokeExact(arg0, arg1);
    }

    public static void putFloat(Object arg0, long arg1, float arg2) {
        if (putFloat_31 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putFloat_31.invokeExact(arg0, arg1, arg2);
    }

    public static void putFloat(long address, float x) {
        if (putFloat_32 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putFloat_32.invokeExact(address, x);
    }

    public static double getDouble(Object arg0, long arg1) {
        if (getDouble_33 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getDouble_33.invokeExact(arg0, arg1);
    }

    public static double getDouble(long address) {
        if (getDouble_34 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getDouble_34.invokeExact(address);
    }

    public static void putDouble(Object arg0, long arg1, double arg2) {
        if (putDouble_35 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putDouble_35.invokeExact(arg0, arg1, arg2);
    }

    public static void putDouble(long address, double x) {
        if (putDouble_36 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putDouble_36.invokeExact(address, x);
    }

    public static boolean getBooleanVolatile(Object arg0, long arg1) {
        if (getBooleanVolatile_37 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getBooleanVolatile_37.invokeExact(arg0, arg1);
    }

    public static void putBooleanVolatile(Object arg0, long arg1, boolean arg2) {
        if (putBooleanVolatile_38 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putBooleanVolatile_38.invokeExact(arg0, arg1, arg2);
    }

    public static byte getByteVolatile(Object arg0, long arg1) {
        if (getByteVolatile_39 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getByteVolatile_39.invokeExact(arg0, arg1);
    }

    public static void putByteVolatile(Object arg0, long arg1, byte arg2) {
        if (putByteVolatile_40 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putByteVolatile_40.invokeExact(arg0, arg1, arg2);
    }

    public static short getShortVolatile(Object arg0, long arg1) {
        if (getShortVolatile_41 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getShortVolatile_41.invokeExact(arg0, arg1);
    }

    public static void putShortVolatile(Object arg0, long arg1, short arg2) {
        if (putShortVolatile_42 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putShortVolatile_42.invokeExact(arg0, arg1, arg2);
    }

    public static char getCharVolatile(Object arg0, long arg1) {
        if (getCharVolatile_43 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getCharVolatile_43.invokeExact(arg0, arg1);
    }

    public static void putCharVolatile(Object arg0, long arg1, char arg2) {
        if (putCharVolatile_44 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putCharVolatile_44.invokeExact(arg0, arg1, arg2);
    }

    public static int getIntVolatile(Object arg0, long arg1) {
        if (getIntVolatile_45 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getIntVolatile_45.invokeExact(arg0, arg1);
    }

    public static void putIntVolatile(Object arg0, long arg1, int arg2) {
        if (putIntVolatile_46 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putIntVolatile_46.invokeExact(arg0, arg1, arg2);
    }

    public static long getLongVolatile(Object arg0, long arg1) {
        if (getLongVolatile_47 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getLongVolatile_47.invokeExact(arg0, arg1);
    }

    public static void putLongVolatile(Object arg0, long arg1, long arg2) {
        if (putLongVolatile_48 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putLongVolatile_48.invokeExact(arg0, arg1, arg2);
    }

    public static float getFloatVolatile(Object arg0, long arg1) {
        if (getFloatVolatile_49 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getFloatVolatile_49.invokeExact(arg0, arg1);
    }

    public static void putFloatVolatile(Object arg0, long arg1, float arg2) {
        if (putFloatVolatile_50 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putFloatVolatile_50.invokeExact(arg0, arg1, arg2);
    }

    public static double getDoubleVolatile(Object arg0, long arg1) {
        if (getDoubleVolatile_51 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getDoubleVolatile_51.invokeExact(arg0, arg1);
    }

    public static void putDoubleVolatile(Object arg0, long arg1, double arg2) {
        if (putDoubleVolatile_52 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putDoubleVolatile_52.invokeExact(arg0, arg1, arg2);
    }

    public static int getAndAddInt(Object o, long offset, int delta) {
        if (getAndAddInt_53 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddInt_53.invokeExact(o, offset, delta);
    }

    public static long getAndAddLong(Object o, long offset, long delta) {
        if (getAndAddLong_54 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddLong_54.invokeExact(o, offset, delta);
    }

    public static int getAndSetInt(Object o, long offset, int newValue) {
        if (getAndSetInt_55 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetInt_55.invokeExact(o, offset, newValue);
    }

    public static long getAndSetLong(Object o, long offset, long newValue) {
        if (getAndSetLong_56 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetLong_56.invokeExact(o, offset, newValue);
    }

    public static void park(boolean arg0, long arg1) {
        if (park_57 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        park_57.invokeExact(arg0, arg1);
    }

    public static void unpark(Object arg0) {
        if (unpark_58 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        unpark_58.invokeExact(arg0);
    }

    public static void throwException(Throwable arg0) {
        if (throwException_59 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        throwException_59.invokeExact(arg0);
    }

    public static long objectFieldOffset(Field f) {
        if (objectFieldOffset_60 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return objectFieldOffset_60.invokeExact(f);
    }

    public static void ensureClassInitialized(Class c) {
        if (ensureClassInitialized_61 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        ensureClassInitialized_61.invokeExact(c);
    }

    public static boolean shouldBeInitialized(Class c) {
        if (shouldBeInitialized_62 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return shouldBeInitialized_62.invokeExact(c);
    }

    public static long getAddress(long address) {
        if (getAddress_63 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAddress_63.invokeExact(address);
    }

    public static void putAddress(long address, long x) {
        if (putAddress_64 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putAddress_64.invokeExact(address, x);
    }

    public static void freeMemory(long address) {
        if (freeMemory_65 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        freeMemory_65.invokeExact(address);
    }

    public static void setMemory(long address, long bytes, byte value) {
        if (setMemory_66 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        setMemory_66.invokeExact(address, bytes, value);
    }

    public static void setMemory(Object o, long offset, long bytes, byte value) {
        if (setMemory_67 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        setMemory_67.invokeExact(o, offset, bytes, value);
    }

    public static void copyMemory(long srcAddress, long destAddress, long bytes) {
        if (copyMemory_68 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        copyMemory_68.invokeExact(srcAddress, destAddress, bytes);
    }

    public static void copyMemory(Object srcBase, long srcOffset, Object destBase, long destOffset, long bytes) {
        if (copyMemory_69 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        copyMemory_69.invokeExact(srcBase, srcOffset, destBase, destOffset, bytes);
    }

    public static int arrayBaseOffsetInt(Class arrayClass) {
        if (arrayBaseOffsetInt_70 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return arrayBaseOffsetInt_70.invokeExact(arrayClass);
    }

    public static long arrayBaseOffsetLong(Class arrayClass) {
        if (arrayBaseOffsetLong_71 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return arrayBaseOffsetLong_71.invokeExact(arrayClass);
    }

    public static int arrayIndexScale(Class arrayClass) {
        if (arrayIndexScale_72 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return arrayIndexScale_72.invokeExact(arrayClass);
    }

    public static long allocateMemory(long bytes) {
        if (allocateMemory_73 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return allocateMemory_73.invokeExact(bytes);
    }

    public static long reallocateMemory(long address, long bytes) {
        if (reallocateMemory_74 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return reallocateMemory_74.invokeExact(address, bytes);
    }

    public static int addressSize() {
        if (addressSize_75 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return addressSize_75.invokeExact();
    }

    public static int pageSize() {
        if (pageSize_76 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return pageSize_76.invokeExact();
    }

    public static int getLoadAverage(double loadavg, int nelems) {
        if (getLoadAverage_77 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getLoadAverage_77.invokeExact(loadavg, nelems);
    }

    public static void invokeCleaner(ByteBuffer directBuffer) {
        if (invokeCleaner_78 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        invokeCleaner_78.invokeExact(directBuffer);
    }

    public static Object getObject(Object o, long offset) {
        if (getObject_79 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getObject_79.invokeExact(o, offset);
    }

    public static Object getObjectVolatile(Object o, long offset) {
        if (getObjectVolatile_80 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getObjectVolatile_80.invokeExact(o, offset);
    }

    public static void putObject(Object o, long offset, Object x) {
        if (putObject_81 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putObject_81.invokeExact(o, offset, x);
    }

    public static void putObjectVolatile(Object o, long offset, Object x) {
        if (putObjectVolatile_82 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putObjectVolatile_82.invokeExact(o, offset, x);
    }

    public static Object getAndSetObject(Object o, long offset, Object newValue) {
        if (getAndSetObject_83 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetObject_83.invokeExact(o, offset, newValue);
    }

    public static boolean compareAndSwapObject(Object o, long offset, Object expected, Object x) {
        if (compareAndSwapObject_84 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSwapObject_84.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndSwapInt(Object o, long offset, int expected, int x) {
        if (compareAndSwapInt_85 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSwapInt_85.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndSwapLong(Object o, long offset, long expected, long x) {
        if (compareAndSwapLong_86 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSwapLong_86.invokeExact(o, offset, expected, x);
    }

    public static void putOrderedObject(Object o, long offset, Object x) {
        if (putOrderedObject_87 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putOrderedObject_87.invokeExact(o, offset, x);
    }

    public static void putOrderedInt(Object o, long offset, int x) {
        if (putOrderedInt_88 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putOrderedInt_88.invokeExact(o, offset, x);
    }

    public static void putOrderedLong(Object o, long offset, long x) {
        if (putOrderedLong_89 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putOrderedLong_89.invokeExact(o, offset, x);
    }

    public static boolean compareAndSetBoolean(Object o, long offset, boolean expected, boolean x) {
        if (compareAndSetBoolean_90 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetBoolean_90.invokeExact(o, offset, expected, x);
    }

    public static void storeStoreFence() {
        if (storeStoreFence_91 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        storeStoreFence_91.invokeExact();
    }

    public static Object getReference(Object arg0, long arg1) {
        if (getReference_92 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getReference_92.invokeExact(arg0, arg1);
    }

    public static void putReference(Object arg0, long arg1, Object arg2) {
        if (putReference_93 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putReference_93.invokeExact(arg0, arg1, arg2);
    }

    public static Object getReferenceVolatile(Object arg0, long arg1) {
        if (getReferenceVolatile_94 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getReferenceVolatile_94.invokeExact(arg0, arg1);
    }

    public static void putReferenceVolatile(Object arg0, long arg1, Object arg2) {
        if (putReferenceVolatile_95 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putReferenceVolatile_95.invokeExact(arg0, arg1, arg2);
    }

    public static Object getReferenceOpaque(Object o, long offset) {
        if (getReferenceOpaque_96 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getReferenceOpaque_96.invokeExact(o, offset);
    }

    public static void putReferenceOpaque(Object o, long offset, Object x) {
        if (putReferenceOpaque_97 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putReferenceOpaque_97.invokeExact(o, offset, x);
    }

    public static boolean getBooleanOpaque(Object o, long offset) {
        if (getBooleanOpaque_98 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getBooleanOpaque_98.invokeExact(o, offset);
    }

    public static void putBooleanOpaque(Object o, long offset, boolean x) {
        if (putBooleanOpaque_99 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putBooleanOpaque_99.invokeExact(o, offset, x);
    }

    public static byte getByteOpaque(Object o, long offset) {
        if (getByteOpaque_100 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getByteOpaque_100.invokeExact(o, offset);
    }

    public static void putByteOpaque(Object o, long offset, byte x) {
        if (putByteOpaque_101 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putByteOpaque_101.invokeExact(o, offset, x);
    }

    public static short getShortOpaque(Object o, long offset) {
        if (getShortOpaque_102 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getShortOpaque_102.invokeExact(o, offset);
    }

    public static void putShortOpaque(Object o, long offset, short x) {
        if (putShortOpaque_103 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putShortOpaque_103.invokeExact(o, offset, x);
    }

    public static char getCharOpaque(Object o, long offset) {
        if (getCharOpaque_104 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getCharOpaque_104.invokeExact(o, offset);
    }

    public static void putCharOpaque(Object o, long offset, char x) {
        if (putCharOpaque_105 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putCharOpaque_105.invokeExact(o, offset, x);
    }

    public static int getIntOpaque(Object o, long offset) {
        if (getIntOpaque_106 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getIntOpaque_106.invokeExact(o, offset);
    }

    public static void putIntOpaque(Object o, long offset, int x) {
        if (putIntOpaque_107 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putIntOpaque_107.invokeExact(o, offset, x);
    }

    public static long getLongOpaque(Object o, long offset) {
        if (getLongOpaque_108 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getLongOpaque_108.invokeExact(o, offset);
    }

    public static void putLongOpaque(Object o, long offset, long x) {
        if (putLongOpaque_109 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putLongOpaque_109.invokeExact(o, offset, x);
    }

    public static float getFloatOpaque(Object o, long offset) {
        if (getFloatOpaque_110 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getFloatOpaque_110.invokeExact(o, offset);
    }

    public static void putFloatOpaque(Object o, long offset, float x) {
        if (putFloatOpaque_111 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putFloatOpaque_111.invokeExact(o, offset, x);
    }

    public static double getDoubleOpaque(Object o, long offset) {
        if (getDoubleOpaque_112 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getDoubleOpaque_112.invokeExact(o, offset);
    }

    public static void putDoubleOpaque(Object o, long offset, double x) {
        if (putDoubleOpaque_113 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putDoubleOpaque_113.invokeExact(o, offset, x);
    }

    public static Object getReferenceAcquire(Object o, long offset) {
        if (getReferenceAcquire_114 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getReferenceAcquire_114.invokeExact(o, offset);
    }

    public static void putReferenceRelease(Object o, long offset, Object x) {
        if (putReferenceRelease_115 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putReferenceRelease_115.invokeExact(o, offset, x);
    }

    public static boolean getBooleanAcquire(Object o, long offset) {
        if (getBooleanAcquire_116 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getBooleanAcquire_116.invokeExact(o, offset);
    }

    public static void putBooleanRelease(Object o, long offset, boolean x) {
        if (putBooleanRelease_117 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putBooleanRelease_117.invokeExact(o, offset, x);
    }

    public static byte getByteAcquire(Object o, long offset) {
        if (getByteAcquire_118 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getByteAcquire_118.invokeExact(o, offset);
    }

    public static void putByteRelease(Object o, long offset, byte x) {
        if (putByteRelease_119 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putByteRelease_119.invokeExact(o, offset, x);
    }

    public static short getShortAcquire(Object o, long offset) {
        if (getShortAcquire_120 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getShortAcquire_120.invokeExact(o, offset);
    }

    public static void putShortRelease(Object o, long offset, short x) {
        if (putShortRelease_121 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putShortRelease_121.invokeExact(o, offset, x);
    }

    public static char getCharAcquire(Object o, long offset) {
        if (getCharAcquire_122 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getCharAcquire_122.invokeExact(o, offset);
    }

    public static void putCharRelease(Object o, long offset, char x) {
        if (putCharRelease_123 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putCharRelease_123.invokeExact(o, offset, x);
    }

    public static int getIntAcquire(Object o, long offset) {
        if (getIntAcquire_124 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getIntAcquire_124.invokeExact(o, offset);
    }

    public static void putIntRelease(Object o, long offset, int x) {
        if (putIntRelease_125 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putIntRelease_125.invokeExact(o, offset, x);
    }

    public static long getLongAcquire(Object o, long offset) {
        if (getLongAcquire_126 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getLongAcquire_126.invokeExact(o, offset);
    }

    public static void putLongRelease(Object o, long offset, long x) {
        if (putLongRelease_127 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putLongRelease_127.invokeExact(o, offset, x);
    }

    public static float getFloatAcquire(Object o, long offset) {
        if (getFloatAcquire_128 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getFloatAcquire_128.invokeExact(o, offset);
    }

    public static void putFloatRelease(Object o, long offset, float x) {
        if (putFloatRelease_129 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putFloatRelease_129.invokeExact(o, offset, x);
    }

    public static double getDoubleAcquire(Object o, long offset) {
        if (getDoubleAcquire_130 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getDoubleAcquire_130.invokeExact(o, offset);
    }

    public static void putDoubleRelease(Object o, long offset, double x) {
        if (putDoubleRelease_131 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putDoubleRelease_131.invokeExact(o, offset, x);
    }

    public static short getShortUnaligned(Object o, long offset, boolean bigEndian) {
        if (getShortUnaligned_132 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getShortUnaligned_132.invokeExact(o, offset, bigEndian);
    }

    public static short getShortUnaligned(Object o, long offset) {
        if (getShortUnaligned_133 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getShortUnaligned_133.invokeExact(o, offset);
    }

    public static void putShortUnaligned(Object o, long offset, short x) {
        if (putShortUnaligned_134 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putShortUnaligned_134.invokeExact(o, offset, x);
    }

    public static void putShortUnaligned(Object o, long offset, short x, boolean bigEndian) {
        if (putShortUnaligned_135 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putShortUnaligned_135.invokeExact(o, offset, x, bigEndian);
    }

    public static char getCharUnaligned(Object o, long offset, boolean bigEndian) {
        if (getCharUnaligned_136 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getCharUnaligned_136.invokeExact(o, offset, bigEndian);
    }

    public static char getCharUnaligned(Object o, long offset) {
        if (getCharUnaligned_137 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getCharUnaligned_137.invokeExact(o, offset);
    }

    public static void putCharUnaligned(Object o, long offset, char x) {
        if (putCharUnaligned_138 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putCharUnaligned_138.invokeExact(o, offset, x);
    }

    public static void putCharUnaligned(Object o, long offset, char x, boolean bigEndian) {
        if (putCharUnaligned_139 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putCharUnaligned_139.invokeExact(o, offset, x, bigEndian);
    }

    public static int getIntUnaligned(Object o, long offset) {
        if (getIntUnaligned_140 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getIntUnaligned_140.invokeExact(o, offset);
    }

    public static int getIntUnaligned(Object o, long offset, boolean bigEndian) {
        if (getIntUnaligned_141 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getIntUnaligned_141.invokeExact(o, offset, bigEndian);
    }

    public static void putIntUnaligned(Object o, long offset, int x, boolean bigEndian) {
        if (putIntUnaligned_142 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putIntUnaligned_142.invokeExact(o, offset, x, bigEndian);
    }

    public static void putIntUnaligned(Object o, long offset, int x) {
        if (putIntUnaligned_143 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putIntUnaligned_143.invokeExact(o, offset, x);
    }

    public static long getLongUnaligned(Object o, long offset, boolean bigEndian) {
        if (getLongUnaligned_144 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getLongUnaligned_144.invokeExact(o, offset, bigEndian);
    }

    public static long getLongUnaligned(Object o, long offset) {
        if (getLongUnaligned_145 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getLongUnaligned_145.invokeExact(o, offset);
    }

    public static void putLongUnaligned(Object o, long offset, long x) {
        if (putLongUnaligned_146 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putLongUnaligned_146.invokeExact(o, offset, x);
    }

    public static void putLongUnaligned(Object o, long offset, long x, boolean bigEndian) {
        if (putLongUnaligned_147 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putLongUnaligned_147.invokeExact(o, offset, x, bigEndian);
    }

    public static boolean compareAndSetReference(Object arg0, long arg1, Object arg2, Object arg3) {
        if (compareAndSetReference_148 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetReference_148.invokeExact(arg0, arg1, arg2, arg3);
    }

    public static Object compareAndExchangeReference(Object arg0, long arg1, Object arg2, Object arg3) {
        if (compareAndExchangeReference_149 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeReference_149.invokeExact(arg0, arg1, arg2, arg3);
    }

    public static Object compareAndExchangeReferenceAcquire(Object o, long offset, Object expected, Object x) {
        if (compareAndExchangeReferenceAcquire_150 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeReferenceAcquire_150.invokeExact(o, offset, expected, x);
    }

    public static Object compareAndExchangeReferenceRelease(Object o, long offset, Object expected, Object x) {
        if (compareAndExchangeReferenceRelease_151 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeReferenceRelease_151.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndSetLong(Object arg0, long arg1, long arg2, long arg3) {
        if (compareAndSetLong_152 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetLong_152.invokeExact(arg0, arg1, arg2, arg3);
    }

    public static long compareAndExchangeLong(Object arg0, long arg1, long arg2, long arg3) {
        if (compareAndExchangeLong_153 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeLong_153.invokeExact(arg0, arg1, arg2, arg3);
    }

    public static long compareAndExchangeLongAcquire(Object o, long offset, long expected, long x) {
        if (compareAndExchangeLongAcquire_154 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeLongAcquire_154.invokeExact(o, offset, expected, x);
    }

    public static long compareAndExchangeLongRelease(Object o, long offset, long expected, long x) {
        if (compareAndExchangeLongRelease_155 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeLongRelease_155.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndSetInt(Object arg0, long arg1, int arg2, int arg3) {
        if (compareAndSetInt_156 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetInt_156.invokeExact(arg0, arg1, arg2, arg3);
    }

    public static int compareAndExchangeInt(Object arg0, long arg1, int arg2, int arg3) {
        if (compareAndExchangeInt_157 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeInt_157.invokeExact(arg0, arg1, arg2, arg3);
    }

    public static int compareAndExchangeIntAcquire(Object o, long offset, int expected, int x) {
        if (compareAndExchangeIntAcquire_158 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeIntAcquire_158.invokeExact(o, offset, expected, x);
    }

    public static int compareAndExchangeIntRelease(Object o, long offset, int expected, int x) {
        if (compareAndExchangeIntRelease_159 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeIntRelease_159.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndSetByte(Object o, long offset, byte expected, byte x) {
        if (compareAndSetByte_160 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetByte_160.invokeExact(o, offset, expected, x);
    }

    public static byte compareAndExchangeByte(Object o, long offset, byte expected, byte x) {
        if (compareAndExchangeByte_161 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeByte_161.invokeExact(o, offset, expected, x);
    }

    public static byte compareAndExchangeByteAcquire(Object o, long offset, byte expected, byte x) {
        if (compareAndExchangeByteAcquire_162 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeByteAcquire_162.invokeExact(o, offset, expected, x);
    }

    public static byte compareAndExchangeByteRelease(Object o, long offset, byte expected, byte x) {
        if (compareAndExchangeByteRelease_163 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeByteRelease_163.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndSetShort(Object o, long offset, short expected, short x) {
        if (compareAndSetShort_164 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetShort_164.invokeExact(o, offset, expected, x);
    }

    public static short compareAndExchangeShort(Object o, long offset, short expected, short x) {
        if (compareAndExchangeShort_165 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeShort_165.invokeExact(o, offset, expected, x);
    }

    public static short compareAndExchangeShortAcquire(Object o, long offset, short expected, short x) {
        if (compareAndExchangeShortAcquire_166 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeShortAcquire_166.invokeExact(o, offset, expected, x);
    }

    public static short compareAndExchangeShortRelease(Object o, long offset, short expected, short x) {
        if (compareAndExchangeShortRelease_167 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeShortRelease_167.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetReferencePlain(Object o, long offset, Object expected, Object x) {
        if (weakCompareAndSetReferencePlain_168 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetReferencePlain_168.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetReferenceAcquire(Object o, long offset, Object expected, Object x) {
        if (weakCompareAndSetReferenceAcquire_169 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetReferenceAcquire_169.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetReferenceRelease(Object o, long offset, Object expected, Object x) {
        if (weakCompareAndSetReferenceRelease_170 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetReferenceRelease_170.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetReference(Object o, long offset, Object expected, Object x) {
        if (weakCompareAndSetReference_171 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetReference_171.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetLongPlain(Object o, long offset, long expected, long x) {
        if (weakCompareAndSetLongPlain_172 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetLongPlain_172.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetLongAcquire(Object o, long offset, long expected, long x) {
        if (weakCompareAndSetLongAcquire_173 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetLongAcquire_173.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetLongRelease(Object o, long offset, long expected, long x) {
        if (weakCompareAndSetLongRelease_174 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetLongRelease_174.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetLong(Object o, long offset, long expected, long x) {
        if (weakCompareAndSetLong_175 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetLong_175.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetIntPlain(Object o, long offset, int expected, int x) {
        if (weakCompareAndSetIntPlain_176 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetIntPlain_176.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetIntAcquire(Object o, long offset, int expected, int x) {
        if (weakCompareAndSetIntAcquire_177 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetIntAcquire_177.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetIntRelease(Object o, long offset, int expected, int x) {
        if (weakCompareAndSetIntRelease_178 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetIntRelease_178.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetInt(Object o, long offset, int expected, int x) {
        if (weakCompareAndSetInt_179 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetInt_179.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetBytePlain(Object o, long offset, byte expected, byte x) {
        if (weakCompareAndSetBytePlain_180 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetBytePlain_180.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetByteAcquire(Object o, long offset, byte expected, byte x) {
        if (weakCompareAndSetByteAcquire_181 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetByteAcquire_181.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetByteRelease(Object o, long offset, byte expected, byte x) {
        if (weakCompareAndSetByteRelease_182 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetByteRelease_182.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetByte(Object o, long offset, byte expected, byte x) {
        if (weakCompareAndSetByte_183 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetByte_183.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetShortPlain(Object o, long offset, short expected, short x) {
        if (weakCompareAndSetShortPlain_184 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetShortPlain_184.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetShortAcquire(Object o, long offset, short expected, short x) {
        if (weakCompareAndSetShortAcquire_185 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetShortAcquire_185.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetShortRelease(Object o, long offset, short expected, short x) {
        if (weakCompareAndSetShortRelease_186 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetShortRelease_186.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetShort(Object o, long offset, short expected, short x) {
        if (weakCompareAndSetShort_187 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetShort_187.invokeExact(o, offset, expected, x);
    }

    public static byte getAndAddByte(Object o, long offset, byte delta) {
        if (getAndAddByte_188 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddByte_188.invokeExact(o, offset, delta);
    }

    public static short getAndAddShort(Object o, long offset, short delta) {
        if (getAndAddShort_189 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddShort_189.invokeExact(o, offset, delta);
    }

    public static byte getAndSetByte(Object o, long offset, byte newValue) {
        if (getAndSetByte_190 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetByte_190.invokeExact(o, offset, newValue);
    }

    public static short getAndSetShort(Object o, long offset, short newValue) {
        if (getAndSetShort_191 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetShort_191.invokeExact(o, offset, newValue);
    }

    public static Object getAndSetReference(Object o, long offset, Object newValue) {
        if (getAndSetReference_192 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetReference_192.invokeExact(o, offset, newValue);
    }

    public static Class defineClass(String name, byte b, int off, int len, ClassLoader loader, ProtectionDomain protectionDomain) {
        if (defineClass_193 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return defineClass_193.invokeExact(name, b, off, len, loader, protectionDomain);
    }

    public static long objectFieldOffset(Class c, String name) {
        if (objectFieldOffset_194 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return objectFieldOffset_194.invokeExact(c, name);
    }

    public static Class defineClass0(String arg0, byte arg1, int arg2, int arg3, ClassLoader arg4, ProtectionDomain arg5) {
        if (defineClass0_195 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return defineClass0_195.invokeExact(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static boolean getAndSetBoolean(Object o, long offset, boolean newValue) {
        if (getAndSetBoolean_196 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetBoolean_196.invokeExact(o, offset, newValue);
    }

    public static void loadLoadFence() {
        if (loadLoadFence_197 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        loadLoadFence_197.invokeExact();
    }

    public static long getAddress(Object o, long offset) {
        if (getAddress_198 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAddress_198.invokeExact(o, offset);
    }

    public static void putAddress(Object o, long offset, long x) {
        if (putAddress_199 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putAddress_199.invokeExact(o, offset, x);
    }

    public static void copySwapMemory(long srcAddress, long destAddress, long bytes, long elemSize) {
        if (copySwapMemory_200 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        copySwapMemory_200.invokeExact(srcAddress, destAddress, bytes, elemSize);
    }

    public static void copySwapMemory(Object srcBase, long srcOffset, Object destBase, long destOffset, long bytes, long elemSize) {
        if (copySwapMemory_201 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        copySwapMemory_201.invokeExact(srcBase, srcOffset, destBase, destOffset, bytes, elemSize);
    }

    public static long dataCacheLineAlignDown(long address) {
        if (dataCacheLineAlignDown_202 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return dataCacheLineAlignDown_202.invokeExact(address);
    }

    public static int dataCacheLineFlushSize() {
        if (dataCacheLineFlushSize_203 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return dataCacheLineFlushSize_203.invokeExact();
    }

    public static short getAndAddShortRelease(Object o, long offset, short delta) {
        if (getAndAddShortRelease_204 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddShortRelease_204.invokeExact(o, offset, delta);
    }

    public static short getAndAddShortAcquire(Object o, long offset, short delta) {
        if (getAndAddShortAcquire_205 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddShortAcquire_205.invokeExact(o, offset, delta);
    }

    public static byte getAndSetByteRelease(Object o, long offset, byte newValue) {
        if (getAndSetByteRelease_206 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetByteRelease_206.invokeExact(o, offset, newValue);
    }

    public static byte getAndSetByteAcquire(Object o, long offset, byte newValue) {
        if (getAndSetByteAcquire_207 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetByteAcquire_207.invokeExact(o, offset, newValue);
    }

    public static short getAndSetShortRelease(Object o, long offset, short newValue) {
        if (getAndSetShortRelease_208 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetShortRelease_208.invokeExact(o, offset, newValue);
    }

    public static short getAndSetShortAcquire(Object o, long offset, short newValue) {
        if (getAndSetShortAcquire_209 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetShortAcquire_209.invokeExact(o, offset, newValue);
    }

    public static int getAndSetIntRelease(Object o, long offset, int newValue) {
        if (getAndSetIntRelease_210 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetIntRelease_210.invokeExact(o, offset, newValue);
    }

    public static int getAndSetIntAcquire(Object o, long offset, int newValue) {
        if (getAndSetIntAcquire_211 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetIntAcquire_211.invokeExact(o, offset, newValue);
    }

    public static long getAndSetLongRelease(Object o, long offset, long newValue) {
        if (getAndSetLongRelease_212 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetLongRelease_212.invokeExact(o, offset, newValue);
    }

    public static long getAndSetLongAcquire(Object o, long offset, long newValue) {
        if (getAndSetLongAcquire_213 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetLongAcquire_213.invokeExact(o, offset, newValue);
    }

    public static byte getAndBitwiseOrByte(Object o, long offset, byte mask) {
        if (getAndBitwiseOrByte_214 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrByte_214.invokeExact(o, offset, mask);
    }

    public static byte getAndBitwiseOrByteRelease(Object o, long offset, byte mask) {
        if (getAndBitwiseOrByteRelease_215 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrByteRelease_215.invokeExact(o, offset, mask);
    }

    public static byte getAndBitwiseOrByteAcquire(Object o, long offset, byte mask) {
        if (getAndBitwiseOrByteAcquire_216 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrByteAcquire_216.invokeExact(o, offset, mask);
    }

    public static byte getAndBitwiseAndByte(Object o, long offset, byte mask) {
        if (getAndBitwiseAndByte_217 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndByte_217.invokeExact(o, offset, mask);
    }

    public static byte getAndBitwiseAndByteRelease(Object o, long offset, byte mask) {
        if (getAndBitwiseAndByteRelease_218 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndByteRelease_218.invokeExact(o, offset, mask);
    }

    public static byte getAndBitwiseAndByteAcquire(Object o, long offset, byte mask) {
        if (getAndBitwiseAndByteAcquire_219 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndByteAcquire_219.invokeExact(o, offset, mask);
    }

    public static byte getAndBitwiseXorByte(Object o, long offset, byte mask) {
        if (getAndBitwiseXorByte_220 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorByte_220.invokeExact(o, offset, mask);
    }

    public static byte getAndBitwiseXorByteRelease(Object o, long offset, byte mask) {
        if (getAndBitwiseXorByteRelease_221 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorByteRelease_221.invokeExact(o, offset, mask);
    }

    public static byte getAndBitwiseXorByteAcquire(Object o, long offset, byte mask) {
        if (getAndBitwiseXorByteAcquire_222 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorByteAcquire_222.invokeExact(o, offset, mask);
    }

    public static short getAndBitwiseOrShort(Object o, long offset, short mask) {
        if (getAndBitwiseOrShort_223 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrShort_223.invokeExact(o, offset, mask);
    }

    public static short getAndBitwiseOrShortRelease(Object o, long offset, short mask) {
        if (getAndBitwiseOrShortRelease_224 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrShortRelease_224.invokeExact(o, offset, mask);
    }

    public static short getAndBitwiseOrShortAcquire(Object o, long offset, short mask) {
        if (getAndBitwiseOrShortAcquire_225 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrShortAcquire_225.invokeExact(o, offset, mask);
    }

    public static short getAndBitwiseAndShort(Object o, long offset, short mask) {
        if (getAndBitwiseAndShort_226 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndShort_226.invokeExact(o, offset, mask);
    }

    public static short getAndBitwiseAndShortRelease(Object o, long offset, short mask) {
        if (getAndBitwiseAndShortRelease_227 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndShortRelease_227.invokeExact(o, offset, mask);
    }

    public static short getAndBitwiseAndShortAcquire(Object o, long offset, short mask) {
        if (getAndBitwiseAndShortAcquire_228 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndShortAcquire_228.invokeExact(o, offset, mask);
    }

    public static short getAndBitwiseXorShort(Object o, long offset, short mask) {
        if (getAndBitwiseXorShort_229 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorShort_229.invokeExact(o, offset, mask);
    }

    public static short getAndBitwiseXorShortRelease(Object o, long offset, short mask) {
        if (getAndBitwiseXorShortRelease_230 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorShortRelease_230.invokeExact(o, offset, mask);
    }

    public static short getAndBitwiseXorShortAcquire(Object o, long offset, short mask) {
        if (getAndBitwiseXorShortAcquire_231 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorShortAcquire_231.invokeExact(o, offset, mask);
    }

    public static Object getAndSetReferenceAcquire(Object o, long offset, Object newValue) {
        if (getAndSetReferenceAcquire_232 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetReferenceAcquire_232.invokeExact(o, offset, newValue);
    }

    public static Object getAndSetReferenceRelease(Object o, long offset, Object newValue) {
        if (getAndSetReferenceRelease_233 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetReferenceRelease_233.invokeExact(o, offset, newValue);
    }

    public static Object getUncompressedObject(long arg0) {
        if (getUncompressedObject_234 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getUncompressedObject_234.invokeExact(arg0);
    }

    public static void writebackMemory(long address, long length) {
        if (writebackMemory_235 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        writebackMemory_235.invokeExact(address, length);
    }

    public static Object allocateUninitializedArray(Class componentType, int length) {
        if (allocateUninitializedArray_236 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return allocateUninitializedArray_236.invokeExact(componentType, length);
    }

    public static boolean compareAndSetChar(Object o, long offset, char expected, char x) {
        if (compareAndSetChar_237 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetChar_237.invokeExact(o, offset, expected, x);
    }

    public static char compareAndExchangeChar(Object o, long offset, char expected, char x) {
        if (compareAndExchangeChar_238 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeChar_238.invokeExact(o, offset, expected, x);
    }

    public static char compareAndExchangeCharAcquire(Object o, long offset, char expected, char x) {
        if (compareAndExchangeCharAcquire_239 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeCharAcquire_239.invokeExact(o, offset, expected, x);
    }

    public static char compareAndExchangeCharRelease(Object o, long offset, char expected, char x) {
        if (compareAndExchangeCharRelease_240 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeCharRelease_240.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetChar(Object o, long offset, char expected, char x) {
        if (weakCompareAndSetChar_241 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetChar_241.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetCharAcquire(Object o, long offset, char expected, char x) {
        if (weakCompareAndSetCharAcquire_242 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetCharAcquire_242.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetCharRelease(Object o, long offset, char expected, char x) {
        if (weakCompareAndSetCharRelease_243 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetCharRelease_243.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetCharPlain(Object o, long offset, char expected, char x) {
        if (weakCompareAndSetCharPlain_244 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetCharPlain_244.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndExchangeBoolean(Object o, long offset, boolean expected, boolean x) {
        if (compareAndExchangeBoolean_245 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeBoolean_245.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndExchangeBooleanAcquire(Object o, long offset, boolean expected, boolean x) {
        if (compareAndExchangeBooleanAcquire_246 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeBooleanAcquire_246.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndExchangeBooleanRelease(Object o, long offset, boolean expected, boolean x) {
        if (compareAndExchangeBooleanRelease_247 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeBooleanRelease_247.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetBoolean(Object o, long offset, boolean expected, boolean x) {
        if (weakCompareAndSetBoolean_248 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetBoolean_248.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetBooleanAcquire(Object o, long offset, boolean expected, boolean x) {
        if (weakCompareAndSetBooleanAcquire_249 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetBooleanAcquire_249.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetBooleanRelease(Object o, long offset, boolean expected, boolean x) {
        if (weakCompareAndSetBooleanRelease_250 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetBooleanRelease_250.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetBooleanPlain(Object o, long offset, boolean expected, boolean x) {
        if (weakCompareAndSetBooleanPlain_251 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetBooleanPlain_251.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndSetFloat(Object o, long offset, float expected, float x) {
        if (compareAndSetFloat_252 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetFloat_252.invokeExact(o, offset, expected, x);
    }

    public static float compareAndExchangeFloat(Object o, long offset, float expected, float x) {
        if (compareAndExchangeFloat_253 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeFloat_253.invokeExact(o, offset, expected, x);
    }

    public static float compareAndExchangeFloatAcquire(Object o, long offset, float expected, float x) {
        if (compareAndExchangeFloatAcquire_254 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeFloatAcquire_254.invokeExact(o, offset, expected, x);
    }

    public static float compareAndExchangeFloatRelease(Object o, long offset, float expected, float x) {
        if (compareAndExchangeFloatRelease_255 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeFloatRelease_255.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetFloatPlain(Object o, long offset, float expected, float x) {
        if (weakCompareAndSetFloatPlain_256 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetFloatPlain_256.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetFloatAcquire(Object o, long offset, float expected, float x) {
        if (weakCompareAndSetFloatAcquire_257 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetFloatAcquire_257.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetFloatRelease(Object o, long offset, float expected, float x) {
        if (weakCompareAndSetFloatRelease_258 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetFloatRelease_258.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetFloat(Object o, long offset, float expected, float x) {
        if (weakCompareAndSetFloat_259 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetFloat_259.invokeExact(o, offset, expected, x);
    }

    public static boolean compareAndSetDouble(Object o, long offset, double expected, double x) {
        if (compareAndSetDouble_260 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetDouble_260.invokeExact(o, offset, expected, x);
    }

    public static double compareAndExchangeDouble(Object o, long offset, double expected, double x) {
        if (compareAndExchangeDouble_261 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeDouble_261.invokeExact(o, offset, expected, x);
    }

    public static double compareAndExchangeDoubleAcquire(Object o, long offset, double expected, double x) {
        if (compareAndExchangeDoubleAcquire_262 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeDoubleAcquire_262.invokeExact(o, offset, expected, x);
    }

    public static double compareAndExchangeDoubleRelease(Object o, long offset, double expected, double x) {
        if (compareAndExchangeDoubleRelease_263 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeDoubleRelease_263.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetDoublePlain(Object o, long offset, double expected, double x) {
        if (weakCompareAndSetDoublePlain_264 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetDoublePlain_264.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetDoubleAcquire(Object o, long offset, double expected, double x) {
        if (weakCompareAndSetDoubleAcquire_265 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetDoubleAcquire_265.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetDoubleRelease(Object o, long offset, double expected, double x) {
        if (weakCompareAndSetDoubleRelease_266 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetDoubleRelease_266.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetDouble(Object o, long offset, double expected, double x) {
        if (weakCompareAndSetDouble_267 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetDouble_267.invokeExact(o, offset, expected, x);
    }

    public static int getAndAddIntRelease(Object o, long offset, int delta) {
        if (getAndAddIntRelease_268 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddIntRelease_268.invokeExact(o, offset, delta);
    }

    public static int getAndAddIntAcquire(Object o, long offset, int delta) {
        if (getAndAddIntAcquire_269 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddIntAcquire_269.invokeExact(o, offset, delta);
    }

    public static long getAndAddLongRelease(Object o, long offset, long delta) {
        if (getAndAddLongRelease_270 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddLongRelease_270.invokeExact(o, offset, delta);
    }

    public static long getAndAddLongAcquire(Object o, long offset, long delta) {
        if (getAndAddLongAcquire_271 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddLongAcquire_271.invokeExact(o, offset, delta);
    }

    public static byte getAndAddByteRelease(Object o, long offset, byte delta) {
        if (getAndAddByteRelease_272 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddByteRelease_272.invokeExact(o, offset, delta);
    }

    public static byte getAndAddByteAcquire(Object o, long offset, byte delta) {
        if (getAndAddByteAcquire_273 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddByteAcquire_273.invokeExact(o, offset, delta);
    }

    public static char getAndAddChar(Object o, long offset, char delta) {
        if (getAndAddChar_274 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddChar_274.invokeExact(o, offset, delta);
    }

    public static char getAndAddCharRelease(Object o, long offset, char delta) {
        if (getAndAddCharRelease_275 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddCharRelease_275.invokeExact(o, offset, delta);
    }

    public static char getAndAddCharAcquire(Object o, long offset, char delta) {
        if (getAndAddCharAcquire_276 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddCharAcquire_276.invokeExact(o, offset, delta);
    }

    public static float getAndAddFloat(Object o, long offset, float delta) {
        if (getAndAddFloat_277 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddFloat_277.invokeExact(o, offset, delta);
    }

    public static float getAndAddFloatRelease(Object o, long offset, float delta) {
        if (getAndAddFloatRelease_278 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddFloatRelease_278.invokeExact(o, offset, delta);
    }

    public static float getAndAddFloatAcquire(Object o, long offset, float delta) {
        if (getAndAddFloatAcquire_279 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddFloatAcquire_279.invokeExact(o, offset, delta);
    }

    public static double getAndAddDouble(Object o, long offset, double delta) {
        if (getAndAddDouble_280 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddDouble_280.invokeExact(o, offset, delta);
    }

    public static double getAndAddDoubleRelease(Object o, long offset, double delta) {
        if (getAndAddDoubleRelease_281 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddDoubleRelease_281.invokeExact(o, offset, delta);
    }

    public static double getAndAddDoubleAcquire(Object o, long offset, double delta) {
        if (getAndAddDoubleAcquire_282 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndAddDoubleAcquire_282.invokeExact(o, offset, delta);
    }

    public static boolean getAndSetBooleanRelease(Object o, long offset, boolean newValue) {
        if (getAndSetBooleanRelease_283 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetBooleanRelease_283.invokeExact(o, offset, newValue);
    }

    public static boolean getAndSetBooleanAcquire(Object o, long offset, boolean newValue) {
        if (getAndSetBooleanAcquire_284 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetBooleanAcquire_284.invokeExact(o, offset, newValue);
    }

    public static char getAndSetChar(Object o, long offset, char newValue) {
        if (getAndSetChar_285 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetChar_285.invokeExact(o, offset, newValue);
    }

    public static char getAndSetCharRelease(Object o, long offset, char newValue) {
        if (getAndSetCharRelease_286 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetCharRelease_286.invokeExact(o, offset, newValue);
    }

    public static char getAndSetCharAcquire(Object o, long offset, char newValue) {
        if (getAndSetCharAcquire_287 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetCharAcquire_287.invokeExact(o, offset, newValue);
    }

    public static float getAndSetFloat(Object o, long offset, float newValue) {
        if (getAndSetFloat_288 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetFloat_288.invokeExact(o, offset, newValue);
    }

    public static float getAndSetFloatRelease(Object o, long offset, float newValue) {
        if (getAndSetFloatRelease_289 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetFloatRelease_289.invokeExact(o, offset, newValue);
    }

    public static float getAndSetFloatAcquire(Object o, long offset, float newValue) {
        if (getAndSetFloatAcquire_290 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetFloatAcquire_290.invokeExact(o, offset, newValue);
    }

    public static double getAndSetDouble(Object o, long offset, double newValue) {
        if (getAndSetDouble_291 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetDouble_291.invokeExact(o, offset, newValue);
    }

    public static double getAndSetDoubleRelease(Object o, long offset, double newValue) {
        if (getAndSetDoubleRelease_292 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetDoubleRelease_292.invokeExact(o, offset, newValue);
    }

    public static double getAndSetDoubleAcquire(Object o, long offset, double newValue) {
        if (getAndSetDoubleAcquire_293 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetDoubleAcquire_293.invokeExact(o, offset, newValue);
    }

    public static boolean getAndBitwiseOrBoolean(Object o, long offset, boolean mask) {
        if (getAndBitwiseOrBoolean_294 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrBoolean_294.invokeExact(o, offset, mask);
    }

    public static boolean getAndBitwiseOrBooleanRelease(Object o, long offset, boolean mask) {
        if (getAndBitwiseOrBooleanRelease_295 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrBooleanRelease_295.invokeExact(o, offset, mask);
    }

    public static boolean getAndBitwiseOrBooleanAcquire(Object o, long offset, boolean mask) {
        if (getAndBitwiseOrBooleanAcquire_296 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrBooleanAcquire_296.invokeExact(o, offset, mask);
    }

    public static boolean getAndBitwiseAndBoolean(Object o, long offset, boolean mask) {
        if (getAndBitwiseAndBoolean_297 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndBoolean_297.invokeExact(o, offset, mask);
    }

    public static boolean getAndBitwiseAndBooleanRelease(Object o, long offset, boolean mask) {
        if (getAndBitwiseAndBooleanRelease_298 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndBooleanRelease_298.invokeExact(o, offset, mask);
    }

    public static boolean getAndBitwiseAndBooleanAcquire(Object o, long offset, boolean mask) {
        if (getAndBitwiseAndBooleanAcquire_299 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndBooleanAcquire_299.invokeExact(o, offset, mask);
    }

    public static boolean getAndBitwiseXorBoolean(Object o, long offset, boolean mask) {
        if (getAndBitwiseXorBoolean_300 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorBoolean_300.invokeExact(o, offset, mask);
    }

    public static boolean getAndBitwiseXorBooleanRelease(Object o, long offset, boolean mask) {
        if (getAndBitwiseXorBooleanRelease_301 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorBooleanRelease_301.invokeExact(o, offset, mask);
    }

    public static boolean getAndBitwiseXorBooleanAcquire(Object o, long offset, boolean mask) {
        if (getAndBitwiseXorBooleanAcquire_302 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorBooleanAcquire_302.invokeExact(o, offset, mask);
    }

    public static char getAndBitwiseOrChar(Object o, long offset, char mask) {
        if (getAndBitwiseOrChar_303 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrChar_303.invokeExact(o, offset, mask);
    }

    public static char getAndBitwiseOrCharRelease(Object o, long offset, char mask) {
        if (getAndBitwiseOrCharRelease_304 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrCharRelease_304.invokeExact(o, offset, mask);
    }

    public static char getAndBitwiseOrCharAcquire(Object o, long offset, char mask) {
        if (getAndBitwiseOrCharAcquire_305 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrCharAcquire_305.invokeExact(o, offset, mask);
    }

    public static char getAndBitwiseAndChar(Object o, long offset, char mask) {
        if (getAndBitwiseAndChar_306 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndChar_306.invokeExact(o, offset, mask);
    }

    public static char getAndBitwiseAndCharRelease(Object o, long offset, char mask) {
        if (getAndBitwiseAndCharRelease_307 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndCharRelease_307.invokeExact(o, offset, mask);
    }

    public static char getAndBitwiseAndCharAcquire(Object o, long offset, char mask) {
        if (getAndBitwiseAndCharAcquire_308 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndCharAcquire_308.invokeExact(o, offset, mask);
    }

    public static char getAndBitwiseXorChar(Object o, long offset, char mask) {
        if (getAndBitwiseXorChar_309 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorChar_309.invokeExact(o, offset, mask);
    }

    public static char getAndBitwiseXorCharRelease(Object o, long offset, char mask) {
        if (getAndBitwiseXorCharRelease_310 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorCharRelease_310.invokeExact(o, offset, mask);
    }

    public static char getAndBitwiseXorCharAcquire(Object o, long offset, char mask) {
        if (getAndBitwiseXorCharAcquire_311 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorCharAcquire_311.invokeExact(o, offset, mask);
    }

    public static int getAndBitwiseOrInt(Object o, long offset, int mask) {
        if (getAndBitwiseOrInt_312 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrInt_312.invokeExact(o, offset, mask);
    }

    public static int getAndBitwiseOrIntRelease(Object o, long offset, int mask) {
        if (getAndBitwiseOrIntRelease_313 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrIntRelease_313.invokeExact(o, offset, mask);
    }

    public static int getAndBitwiseOrIntAcquire(Object o, long offset, int mask) {
        if (getAndBitwiseOrIntAcquire_314 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrIntAcquire_314.invokeExact(o, offset, mask);
    }

    public static int getAndBitwiseAndInt(Object o, long offset, int mask) {
        if (getAndBitwiseAndInt_315 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndInt_315.invokeExact(o, offset, mask);
    }

    public static int getAndBitwiseAndIntRelease(Object o, long offset, int mask) {
        if (getAndBitwiseAndIntRelease_316 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndIntRelease_316.invokeExact(o, offset, mask);
    }

    public static int getAndBitwiseAndIntAcquire(Object o, long offset, int mask) {
        if (getAndBitwiseAndIntAcquire_317 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndIntAcquire_317.invokeExact(o, offset, mask);
    }

    public static int getAndBitwiseXorInt(Object o, long offset, int mask) {
        if (getAndBitwiseXorInt_318 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorInt_318.invokeExact(o, offset, mask);
    }

    public static int getAndBitwiseXorIntRelease(Object o, long offset, int mask) {
        if (getAndBitwiseXorIntRelease_319 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorIntRelease_319.invokeExact(o, offset, mask);
    }

    public static int getAndBitwiseXorIntAcquire(Object o, long offset, int mask) {
        if (getAndBitwiseXorIntAcquire_320 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorIntAcquire_320.invokeExact(o, offset, mask);
    }

    public static long getAndBitwiseOrLong(Object o, long offset, long mask) {
        if (getAndBitwiseOrLong_321 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrLong_321.invokeExact(o, offset, mask);
    }

    public static long getAndBitwiseOrLongRelease(Object o, long offset, long mask) {
        if (getAndBitwiseOrLongRelease_322 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrLongRelease_322.invokeExact(o, offset, mask);
    }

    public static long getAndBitwiseOrLongAcquire(Object o, long offset, long mask) {
        if (getAndBitwiseOrLongAcquire_323 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseOrLongAcquire_323.invokeExact(o, offset, mask);
    }

    public static long getAndBitwiseAndLong(Object o, long offset, long mask) {
        if (getAndBitwiseAndLong_324 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndLong_324.invokeExact(o, offset, mask);
    }

    public static long getAndBitwiseAndLongRelease(Object o, long offset, long mask) {
        if (getAndBitwiseAndLongRelease_325 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndLongRelease_325.invokeExact(o, offset, mask);
    }

    public static long getAndBitwiseAndLongAcquire(Object o, long offset, long mask) {
        if (getAndBitwiseAndLongAcquire_326 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseAndLongAcquire_326.invokeExact(o, offset, mask);
    }

    public static long getAndBitwiseXorLong(Object o, long offset, long mask) {
        if (getAndBitwiseXorLong_327 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorLong_327.invokeExact(o, offset, mask);
    }

    public static long getAndBitwiseXorLongRelease(Object o, long offset, long mask) {
        if (getAndBitwiseXorLongRelease_328 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorLongRelease_328.invokeExact(o, offset, mask);
    }

    public static long getAndBitwiseXorLongAcquire(Object o, long offset, long mask) {
        if (getAndBitwiseXorLongAcquire_329 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndBitwiseXorLongAcquire_329.invokeExact(o, offset, mask);
    }

    public static boolean isBigEndian() {
        if (isBigEndian_330 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return isBigEndian_330.invokeExact();
    }

    public static boolean unalignedAccess() {
        if (unalignedAccess_331 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return unalignedAccess_331.invokeExact();
    }

    public static Object getObjectAcquire(Object o, long offset) {
        if (getObjectAcquire_332 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getObjectAcquire_332.invokeExact(o, offset);
    }

    public static Object getObjectOpaque(Object o, long offset) {
        if (getObjectOpaque_333 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getObjectOpaque_333.invokeExact(o, offset);
    }

    public static void putObjectOpaque(Object o, long offset, Object x) {
        if (putObjectOpaque_334 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putObjectOpaque_334.invokeExact(o, offset, x);
    }

    public static void putObjectRelease(Object o, long offset, Object x) {
        if (putObjectRelease_335 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        putObjectRelease_335.invokeExact(o, offset, x);
    }

    public static Object getAndSetObjectAcquire(Object o, long offset, Object newValue) {
        if (getAndSetObjectAcquire_336 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetObjectAcquire_336.invokeExact(o, offset, newValue);
    }

    public static Object getAndSetObjectRelease(Object o, long offset, Object newValue) {
        if (getAndSetObjectRelease_337 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return getAndSetObjectRelease_337.invokeExact(o, offset, newValue);
    }

    public static boolean compareAndSetObject(Object o, long offset, Object expected, Object x) {
        if (compareAndSetObject_338 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndSetObject_338.invokeExact(o, offset, expected, x);
    }

    public static Object compareAndExchangeObject(Object o, long offset, Object expected, Object x) {
        if (compareAndExchangeObject_339 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeObject_339.invokeExact(o, offset, expected, x);
    }

    public static Object compareAndExchangeObjectAcquire(Object o, long offset, Object expected, Object x) {
        if (compareAndExchangeObjectAcquire_340 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeObjectAcquire_340.invokeExact(o, offset, expected, x);
    }

    public static Object compareAndExchangeObjectRelease(Object o, long offset, Object expected, Object x) {
        if (compareAndExchangeObjectRelease_341 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return compareAndExchangeObjectRelease_341.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetObject(Object o, long offset, Object expected, Object x) {
        if (weakCompareAndSetObject_342 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetObject_342.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetObjectAcquire(Object o, long offset, Object expected, Object x) {
        if (weakCompareAndSetObjectAcquire_343 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetObjectAcquire_343.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetObjectPlain(Object o, long offset, Object expected, Object x) {
        if (weakCompareAndSetObjectPlain_344 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetObjectPlain_344.invokeExact(o, offset, expected, x);
    }

    public static boolean weakCompareAndSetObjectRelease(Object o, long offset, Object expected, Object x) {
        if (weakCompareAndSetObjectRelease_345 == null) {
            throw new UnsupportedOperationException(UNAVAILABLE_MESSAGE);
        }
        return weakCompareAndSetObjectRelease_345.invokeExact(o, offset, expected, x);
    }

    public static long arrayBaseOffset(Class<?> arrayClass) {
        try {
            return UnsafeAccess.arrayBaseOffsetLong(arrayClass);
        }
        catch (UnsupportedOperationException e) {
            return UnsafeAccess.arrayBaseOffsetInt(arrayClass);
        }
    }

    @Nullable
    private static MethodHandle tryGet(String[] names, MethodType methodType) {
        MethodHandle handle;
        for (String name : names) {
            handle = UnsafeAccess.tryGet(JavaBypass.INTERNAL_UNSAFE, name, methodType);
            if (handle == null) continue;
            return handle;
        }
        for (String name : names) {
            handle = UnsafeAccess.tryGet(JavaBypass.UNSAFE, name, methodType);
            if (handle == null) continue;
            return handle;
        }
        return null;
    }

    @Nullable
    private static MethodHandle tryGet(Object instance, String name, MethodType methodType) {
        try {
            return JavaBypass.TRUSTED_LOOKUP.findVirtual(instance.getClass(), name, methodType).bindTo(instance);
        }
        catch (Throwable ignored) {
            return null;
        }
    }
}

