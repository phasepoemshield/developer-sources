/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u0006\u0010\n\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u000b\u0010\r\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0015\u00a8\u0006\u0016"}, d2={"", "input", "", "numberFormatError", "(Ljava/lang/String;)Ljava/lang/Void;", "", "toByteOrNull", "(Ljava/lang/String;)Ljava/lang/Byte;", "", "radix", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "toLongOrNull", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "", "toShortOrNull", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsKt
extends StringsKt__StringNumberConversionsJVMKt {
    @SinceKotlin(version="1.1")
    @Nullable
    public static final Short toShortOrNull(@NotNull String $this$toShortOrNull) {
        Intrinsics.checkNotNullParameter($this$toShortOrNull, "<this>");
        return StringsKt.toShortOrNull($this$toShortOrNull, 10);
    }

    @SinceKotlin(version="1.1")
    @Nullable
    public static final Long toLongOrNull(@NotNull String $this$toLongOrNull) {
        Intrinsics.checkNotNullParameter($this$toLongOrNull, "<this>");
        return StringsKt.toLongOrNull($this$toLongOrNull, 10);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    @SinceKotlin(version="1.1")
    public static final Long toLongOrNull(@NotNull String $this$toLongOrNull, int radix) {
        void var12_9;
        void var4_4;
        long limitForMaxRadix;
        Intrinsics.checkNotNullParameter($this$toLongOrNull, "<this>");
        CharsKt.checkRadix(radix);
        int length = $this$toLongOrNull.length();
        if (length == 0) {
            return null;
        }
        int start = 0;
        boolean isNegative = false;
        long limit = 0L;
        char firstChar = $this$toLongOrNull.charAt(0);
        if (Intrinsics.compare(firstChar, 48) < 0) {
            if (length == 1) {
                return null;
            }
            start = 1;
            if (firstChar == '-') {
                isNegative = true;
                limit = Long.MIN_VALUE;
            } else {
                if (firstChar != '+') return null;
                isNegative = false;
                limit = -9223372036854775807L;
            }
        } else {
            start = 0;
            isNegative = false;
            limit = -9223372036854775807L;
        }
        long limitBeforeMul = limitForMaxRadix = -256204778801521550L;
        long result = 0L;
        int i = start;
        while (i < length) {
            void var14_10;
            void var15_11;
            int digit = CharsKt.digitOf($this$toLongOrNull.charAt(i), radix);
            if (digit < 0) {
                return null;
            }
            if (result < limitBeforeMul) {
                if (limitBeforeMul != limitForMaxRadix) return null;
                limitBeforeMul = limit / (long)radix;
                if (result < limitBeforeMul) {
                    return null;
                }
            }
            if ((result *= (long)radix) < limit + (long)var15_11) {
                return null;
            }
            result -= (long)var15_11;
            ++var14_10;
        }
        return var4_4 != false ? Long.valueOf((long)var12_9) : Long.valueOf((long)(-var12_9));
    }

    @SinceKotlin(version="1.1")
    @Nullable
    public static final Byte toByteOrNull(@NotNull String $this$toByteOrNull, int radix) {
        int n;
        block5: {
            block4: {
                Intrinsics.checkNotNullParameter($this$toByteOrNull, "<this>");
                Integer n2 = StringsKt.toIntOrNull($this$toByteOrNull, radix);
                if (n2 == null) {
                    return null;
                }
                n = n2;
                if (n < -128) break block4;
                if (n <= 127) break block5;
            }
            return null;
        }
        return (byte)n;
    }

    @SinceKotlin(version="1.1")
    @Nullable
    public static final Byte toByteOrNull(@NotNull String $this$toByteOrNull) {
        Intrinsics.checkNotNullParameter($this$toByteOrNull, "<this>");
        return StringsKt.toByteOrNull($this$toByteOrNull, 10);
    }

    @NotNull
    public static final Void numberFormatError(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @SinceKotlin(version="1.1")
    @Nullable
    public static final Integer toIntOrNull(@NotNull String $this$toIntOrNull) {
        Intrinsics.checkNotNullParameter($this$toIntOrNull, "<this>");
        return StringsKt.toIntOrNull($this$toIntOrNull, 10);
    }

    @SinceKotlin(version="1.1")
    @Nullable
    public static final Short toShortOrNull(@NotNull String $this$toShortOrNull, int radix) {
        int n;
        block5: {
            block4: {
                Intrinsics.checkNotNullParameter($this$toShortOrNull, "<this>");
                Integer n2 = StringsKt.toIntOrNull($this$toShortOrNull, radix);
                if (n2 == null) {
                    return null;
                }
                n = n2;
                if (n < Short.MIN_VALUE) break block4;
                if (n <= Short.MAX_VALUE) break block5;
            }
            return null;
        }
        return (short)n;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    @SinceKotlin(version="1.1")
    public static final Integer toIntOrNull(@NotNull String $this$toIntOrNull, int radix) {
        void var9_9;
        void var4_4;
        int limitForMaxRadix;
        Intrinsics.checkNotNullParameter($this$toIntOrNull, "<this>");
        CharsKt.checkRadix(radix);
        int length = $this$toIntOrNull.length();
        if (length == 0) {
            return null;
        }
        int start = 0;
        boolean isNegative = false;
        int limit = 0;
        char firstChar = $this$toIntOrNull.charAt(0);
        if (Intrinsics.compare(firstChar, 48) < 0) {
            if (length == 1) {
                return null;
            }
            start = 1;
            if (firstChar == '-') {
                isNegative = true;
                limit = Integer.MIN_VALUE;
            } else {
                if (firstChar != '+') return null;
                isNegative = false;
                limit = -2147483647;
            }
        } else {
            start = 0;
            isNegative = false;
            limit = -2147483647;
        }
        int limitBeforeMul = limitForMaxRadix = -59652323;
        int result = 0;
        int i = start;
        while (i < length) {
            void var10_10;
            void var11_11;
            int digit = CharsKt.digitOf($this$toIntOrNull.charAt(i), radix);
            if (digit < 0) {
                return null;
            }
            if (result < limitBeforeMul) {
                if (limitBeforeMul != limitForMaxRadix) return null;
                limitBeforeMul = limit / radix;
                if (result < limitBeforeMul) {
                    return null;
                }
            }
            if ((result *= radix) < limit + var11_11) {
                return null;
            }
            result -= var11_11;
            ++var10_10;
        }
        return var4_4 != false ? Integer.valueOf((int)var9_9) : Integer.valueOf((int)(-var9_9));
    }
}

