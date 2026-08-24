/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0010\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\u0007*\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0016\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0007*\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0007*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u0019\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\n*\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001c\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u001c\u0010\u001e\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\n*\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\u001f\u001a\u0004\u0018\u00010\n*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\u001f\u0010!\u001a\u0013\u0010\"\u001a\u00020\r*\u00020\u0003H\u0007\u00a2\u0006\u0004\b\"\u0010#\u001a\u001b\u0010\"\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\"\u0010$\u001a\u0015\u0010%\u001a\u0004\u0018\u00010\r*\u00020\u0003H\u0007\u00a2\u0006\u0004\b%\u0010&\u001a\u001d\u0010%\u001a\u0004\u0018\u00010\r*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b%\u0010'\u00a8\u0006("}, d2={"Lkotlin/UByte;", "", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "toString", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "(Ljava/lang/String;)Lkotlin/UByte;", "(Ljava/lang/String;I)Lkotlin/UByte;", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "(Ljava/lang/String;)Lkotlin/UInt;", "(Ljava/lang/String;I)Lkotlin/UInt;", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "(Ljava/lang/String;)Lkotlin/ULong;", "(Ljava/lang/String;I)Lkotlin/ULong;", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "(Ljava/lang/String;)Lkotlin/UShort;", "(Ljava/lang/String;I)Lkotlin/UShort;", "kotlin-stdlib"})
@JvmName(name="UStringsKt")
public final class UStringsKt {
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @Nullable
    @SinceKotlin(version="1.5")
    public static final UByte toUByteOrNull(@NotNull String $this$toUByteOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toUByteOrNull, "<this>");
        UInt uInt = UStringsKt.toUIntOrNull($this$toUByteOrNull, radix);
        if (uInt == null) {
            return null;
        }
        int n = uInt.unbox-impl();
        int n2 = -1;
        if (Integer.compareUnsigned(n, UInt.constructor-impl(n2 & 0xFF)) > 0) {
            return null;
        }
        return UByte.box-impl(UByte.constructor-impl((byte)n));
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final short toUShort(@NotNull String $this$toUShort) {
        Intrinsics.checkNotNullParameter($this$toUShort, "<this>");
        UShort uShort = UStringsKt.toUShortOrNull($this$toUShort);
        if (uShort == null) {
            StringsKt.numberFormatError($this$toUShort);
            throw new KotlinNothingValueException();
        }
        return uShort.unbox-impl();
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final long toULong(@NotNull String $this$toULong, int radix) {
        Intrinsics.checkNotNullParameter($this$toULong, "<this>");
        ULong uLong = UStringsKt.toULongOrNull($this$toULong, radix);
        if (uLong == null) {
            StringsKt.numberFormatError($this$toULong);
            throw new KotlinNothingValueException();
        }
        return uLong.unbox-impl();
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @NotNull
    @SinceKotlin(version="1.5")
    public static final String toString-olVBNx4(short $this$toString_u2dolVBNx4, int radix) {
        String string = Integer.toString($this$toString_u2dolVBNx4 & 0xFFFF, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @Nullable
    public static final UInt toUIntOrNull(@NotNull String $this$toUIntOrNull) {
        Intrinsics.checkNotNullParameter($this$toUIntOrNull, "<this>");
        return UStringsKt.toUIntOrNull($this$toUIntOrNull, 10);
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final UInt toUIntOrNull(@NotNull String $this$toUIntOrNull, int radix) {
        void var9_9;
        int limitForMaxRadix;
        int start;
        int limit;
        int length;
        block15: {
            block12: {
                block14: {
                    block13: {
                        Intrinsics.checkNotNullParameter($this$toUIntOrNull, "<this>");
                        CharsKt.checkRadix(radix);
                        length = $this$toUIntOrNull.length();
                        if (length == 0) {
                            return null;
                        }
                        limit = -1;
                        start = 0;
                        char firstChar = $this$toUIntOrNull.charAt(0);
                        if (Intrinsics.compare(firstChar, 48) >= 0) break block12;
                        if (length == 1) break block13;
                        if (firstChar == '+') break block14;
                    }
                    return null;
                }
                start = 1;
                break block15;
            }
            start = 0;
        }
        int limitBeforeMul = limitForMaxRadix = 0x71C71C7;
        int uradix = UInt.constructor-impl(radix);
        int result = 0;
        int i = start;
        while (i < length) {
            void var10_10;
            void var12_12;
            int digit = CharsKt.digitOf($this$toUIntOrNull.charAt(i), radix);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(result, limitBeforeMul) > 0) {
                if (limitBeforeMul == limitForMaxRadix) {
                    limitBeforeMul = Integer.divideUnsigned(limit, uradix);
                    if (Integer.compareUnsigned(result, limitBeforeMul) > 0) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            int beforeAdding = result = UInt.constructor-impl(result * uradix);
            if (Integer.compareUnsigned(result = UInt.constructor-impl(result + UInt.constructor-impl(digit)), (int)var12_12) < 0) {
                return null;
            }
            ++var10_10;
        }
        return UInt.box-impl((int)var9_9);
    }

    @Nullable
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final UShort toUShortOrNull(@NotNull String $this$toUShortOrNull, int radix) {
        Intrinsics.checkNotNullParameter($this$toUShortOrNull, "<this>");
        UInt uInt = UStringsKt.toUIntOrNull($this$toUShortOrNull, radix);
        if (uInt == null) {
            return null;
        }
        int n = uInt.unbox-impl();
        int n2 = -1;
        if (Integer.compareUnsigned(n, UInt.constructor-impl(n2 & 0xFFFF)) > 0) {
            return null;
        }
        return UShort.box-impl(UShort.constructor-impl((short)n));
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    @NotNull
    public static final String toString-JSWoG40(long $this$toString_u2dJSWoG40, int radix) {
        return UnsignedKt.ulongToString($this$toString_u2dJSWoG40, CharsKt.checkRadix(radix));
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final int toUInt(@NotNull String $this$toUInt) {
        Intrinsics.checkNotNullParameter($this$toUInt, "<this>");
        UInt uInt = UStringsKt.toUIntOrNull($this$toUInt);
        if (uInt == null) {
            StringsKt.numberFormatError($this$toUInt);
            throw new KotlinNothingValueException();
        }
        return uInt.unbox-impl();
    }

    @NotNull
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final String toString-LxnNnR4(byte $this$toString_u2dLxnNnR4, int radix) {
        String string = Integer.toString($this$toString_u2dLxnNnR4 & 0xFF, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final int toUInt(@NotNull String $this$toUInt, int radix) {
        Intrinsics.checkNotNullParameter($this$toUInt, "<this>");
        UInt uInt = UStringsKt.toUIntOrNull($this$toUInt, radix);
        if (uInt == null) {
            StringsKt.numberFormatError($this$toUInt);
            throw new KotlinNothingValueException();
        }
        return uInt.unbox-impl();
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final long toULong(@NotNull String $this$toULong) {
        Intrinsics.checkNotNullParameter($this$toULong, "<this>");
        ULong uLong = UStringsKt.toULongOrNull($this$toULong);
        if (uLong == null) {
            StringsKt.numberFormatError($this$toULong);
            throw new KotlinNothingValueException();
        }
        return uLong.unbox-impl();
    }

    @SinceKotlin(version="1.5")
    @Nullable
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final UShort toUShortOrNull(@NotNull String $this$toUShortOrNull) {
        Intrinsics.checkNotNullParameter($this$toUShortOrNull, "<this>");
        return UStringsKt.toUShortOrNull($this$toUShortOrNull, 10);
    }

    /*
     * WARNING - void declaration
     */
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @Nullable
    @SinceKotlin(version="1.5")
    public static final ULong toULongOrNull(@NotNull String $this$toULongOrNull, int radix) {
        void var13_9;
        long limitForMaxRadix;
        int start;
        long limit;
        int length;
        block15: {
            block12: {
                block14: {
                    block13: {
                        Intrinsics.checkNotNullParameter($this$toULongOrNull, "<this>");
                        CharsKt.checkRadix(radix);
                        length = $this$toULongOrNull.length();
                        if (length == 0) {
                            return null;
                        }
                        limit = -1L;
                        start = 0;
                        char firstChar = $this$toULongOrNull.charAt(0);
                        if (Intrinsics.compare(firstChar, 48) >= 0) break block12;
                        if (length == 1) break block13;
                        if (firstChar == '+') break block14;
                    }
                    return null;
                }
                start = 1;
                break block15;
            }
            start = 0;
        }
        long limitBeforeMul = limitForMaxRadix = 0x71C71C71C71C71CL;
        long uradix = ULong.constructor-impl(radix);
        long result = 0L;
        int i = start;
        while (i < length) {
            void var15_10;
            void var17_12;
            int digit = CharsKt.digitOf($this$toULongOrNull.charAt(i), radix);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(result, limitBeforeMul) > 0) {
                if (limitBeforeMul == limitForMaxRadix) {
                    limitBeforeMul = Long.divideUnsigned(limit, uradix);
                    if (Long.compareUnsigned(result, limitBeforeMul) > 0) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            long beforeAdding = result = ULong.constructor-impl(result * uradix);
            int n = UInt.constructor-impl(digit);
            if (Long.compareUnsigned(result = ULong.constructor-impl(result + ULong.constructor-impl((long)n & 0xFFFFFFFFL)), (long)var17_12) < 0) {
                return null;
            }
            ++var15_10;
        }
        return ULong.box-impl((long)var13_9);
    }

    @Nullable
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final UByte toUByteOrNull(@NotNull String $this$toUByteOrNull) {
        Intrinsics.checkNotNullParameter($this$toUByteOrNull, "<this>");
        return UStringsKt.toUByteOrNull($this$toUByteOrNull, 10);
    }

    @Nullable
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final ULong toULongOrNull(@NotNull String $this$toULongOrNull) {
        Intrinsics.checkNotNullParameter($this$toULongOrNull, "<this>");
        return UStringsKt.toULongOrNull($this$toULongOrNull, 10);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final short toUShort(@NotNull String $this$toUShort, int radix) {
        Intrinsics.checkNotNullParameter($this$toUShort, "<this>");
        UShort uShort = UStringsKt.toUShortOrNull($this$toUShort, radix);
        if (uShort == null) {
            StringsKt.numberFormatError($this$toUShort);
            throw new KotlinNothingValueException();
        }
        return uShort.unbox-impl();
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final byte toUByte(@NotNull String $this$toUByte, int radix) {
        Intrinsics.checkNotNullParameter($this$toUByte, "<this>");
        UByte uByte = UStringsKt.toUByteOrNull($this$toUByte, radix);
        if (uByte == null) {
            StringsKt.numberFormatError($this$toUByte);
            throw new KotlinNothingValueException();
        }
        return uByte.unbox-impl();
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final byte toUByte(@NotNull String $this$toUByte) {
        Intrinsics.checkNotNullParameter($this$toUByte, "<this>");
        UByte uByte = UStringsKt.toUByteOrNull($this$toUByte);
        if (uByte == null) {
            StringsKt.numberFormatError($this$toUByte);
            throw new KotlinNothingValueException();
        }
        return uByte.unbox-impl();
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @NotNull
    public static final String toString-V7xB4Y4(int $this$toString_u2dV7xB4Y4, int radix) {
        String string = Long.toString((long)$this$toString_u2dV7xB4Y4 & 0xFFFFFFFFL, CharsKt.checkRadix(radix));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

