/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000J\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b\u0011\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0019\u001a\u00020\u0002*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010 \u001a\u00020\u001f*\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\u00020\u0002*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\"\u0010#\u001a\u001b\u0010$\u001a\u00020\u0002*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b$\u0010%\u001a1\u0010)\u001a\u00020(*\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020&H\u0003\u00a2\u0006\u0004\b)\u0010*\u001a\u001d\u0010)\u001a\u00020(*\u00020\u00142\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b)\u0010+\u001a1\u0010-\u001a\u00020,*\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020&H\u0003\u00a2\u0006\u0004\b-\u0010.\u001a\u001d\u0010-\u001a\u00020,*\u00020\u00142\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b-\u0010/\u001a1\u00100\u001a\u00020\u0002*\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020&H\u0003\u00a2\u0006\u0004\b0\u00101\u001a\u001d\u00100\u001a\u00020\u0002*\u00020\u00142\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b0\u00102\u001a1\u00103\u001a\u00020\u0000*\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020&H\u0003\u00a2\u0006\u0004\b3\u00104\u001a\u001d\u00103\u001a\u00020\u0000*\u00020\u00142\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b3\u00105\u001a7\u00106\u001a\u00020\u0000*\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\b6\u00107\u001a1\u00109\u001a\u000208*\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020&H\u0003\u00a2\u0006\u0004\b9\u0010:\u001a\u001d\u00109\u001a\u000208*\u00020\u00142\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b9\u0010;\u001a\u001d\u0010<\u001a\u00020\u0014*\u00020(2\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b<\u0010=\u001a1\u0010<\u001a\u00020\u0014*\u00020,2\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b<\u0010>\u001a\u001d\u0010<\u001a\u00020\u0014*\u00020,2\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b<\u0010?\u001a\u001d\u0010<\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b<\u0010@\u001a\u001d\u0010<\u001a\u00020\u0014*\u00020\u00002\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b<\u0010A\u001a\u001d\u0010<\u001a\u00020\u0014*\u0002082\b\b\u0002\u0010'\u001a\u00020&H\u0007\u00a2\u0006\u0004\b<\u0010B\u001a#\u0010D\u001a\u00020\u0014*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010C\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\bD\u0010E\"\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bG\u0010H\"\u0014\u0010I\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bI\u0010J\"\u0014\u0010K\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010J\u00a8\u0006L"}, d2={"", "charsPerElement", "", "elementsPerSet", "elementSeparatorLength", "charsPerSet", "(JII)J", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "formattedStringLength", "(IIIIIII)I", "stringLength", "parsedByteArrayMaxSize", "wholeElementsPerSet", "(JJI)J", "", "part", "index", "endIndex", "partName", "checkContainsAt", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)I", "startIndex", "maxDigits", "", "requireMaxLength", "", "checkHexLength", "(Ljava/lang/String;IIIZ)V", "checkNewLineAt", "(Ljava/lang/String;II)I", "decimalFromHexDigitAt", "(Ljava/lang/String;I)I", "Lkotlin/text/HexFormat;", "format", "", "hexToByte", "(Ljava/lang/String;IILkotlin/text/HexFormat;)B", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "", "hexToByteArray", "(Ljava/lang/String;IILkotlin/text/HexFormat;)[B", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "hexToInt", "(Ljava/lang/String;IILkotlin/text/HexFormat;)I", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "hexToLong", "(Ljava/lang/String;IILkotlin/text/HexFormat;)J", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "hexToLongImpl", "(Ljava/lang/String;IILkotlin/text/HexFormat;I)J", "", "hexToShort", "(Ljava/lang/String;IILkotlin/text/HexFormat;)S", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "toHexString", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "bits", "toHexStringImpl", "(JLkotlin/text/HexFormat;I)Ljava/lang/String;", "", "HEX_DIGITS_TO_DECIMAL", "[I", "LOWER_CASE_HEX_DIGITS", "Ljava/lang/String;", "UPPER_CASE_HEX_DIGITS", "kotlin-stdlib"})
public final class HexExtensionsKt {
    @NotNull
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    @NotNull
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    @NotNull
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    @SinceKotlin(version="1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(long $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexStringImpl($this$toHexString, format, 64);
    }

    private static final void checkHexLength(String $this$checkHexLength, int startIndex, int endIndex, int maxDigits, boolean requireMaxLength) {
        int digitsLength = endIndex - startIndex;
        boolean isCorrectLength = requireMaxLength ? digitsLength == maxDigits : digitsLength <= maxDigits;
        if (!isCorrectLength) {
            String specifier = requireMaxLength ? "exactly" : "at most";
            String string = $this$checkHexLength;
            Intrinsics.checkNotNull(string, "null cannot be cast to non-null type java.lang.String");
            String string2 = string.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
            String substring = string2;
            throw new NumberFormatException("Expected " + specifier + ' ' + maxDigits + " hexadecimal digits at index " + startIndex + ", but was " + substring + " of length " + digitsLength);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final long wholeElementsPerSet(long charsPerSet, long charsPerElement, int elementSeparatorLength) {
        if (charsPerSet <= 0L) return 0L;
        if (charsPerElement <= 0L) {
            return 0L;
        }
        long l = (charsPerSet + (long)elementSeparatorLength) / (charsPerElement + (long)elementSeparatorLength);
        return l;
    }

    @SinceKotlin(version="1.9")
    @ExperimentalStdlibApi
    public static final int hexToInt(@NotNull String $this$hexToInt, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToInt, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.hexToInt($this$hexToInt, 0, $this$hexToInt.length(), format);
    }

    public static /* synthetic */ String toHexString$default(int n, HexFormat hexFormat, int n2, Object object) {
        if ((n2 & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(n, hexFormat);
    }

    static /* synthetic */ long hexToLong$default(String string, int n, int n2, HexFormat hexFormat, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = string.length();
        }
        if ((n3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToLong(string, n, n2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s, HexFormat hexFormat, int n, Object object) {
        if ((n & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(s, hexFormat);
    }

    static /* synthetic */ byte hexToByte$default(String string, int n, int n2, HexFormat hexFormat, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = string.length();
        }
        if ((n3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToByte(string, n, n2, hexFormat);
    }

    public static /* synthetic */ byte hexToByte$default(String string, HexFormat hexFormat, int n, Object object) {
        if ((n & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToByte(string, hexFormat);
    }

    public static /* synthetic */ int hexToInt$default(String string, HexFormat hexFormat, int n, Object object) {
        if ((n & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToInt(string, hexFormat);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version="1.9")
    public static final long hexToLong(@NotNull String $this$hexToLong, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToLong, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.hexToLong($this$hexToLong, 0, $this$hexToLong.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String string, HexFormat hexFormat, int n, Object object) {
        if ((n & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToLong(string, hexFormat);
    }

    static /* synthetic */ byte[] hexToByteArray$default(String string, int n, int n2, HexFormat hexFormat, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = string.length();
        }
        if ((n3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToByteArray(string, n, n2, hexFormat);
    }

    public static /* synthetic */ short hexToShort$default(String string, HexFormat hexFormat, int n, Object object) {
        if ((n & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToShort(string, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final int hexToInt(String $this$hexToInt, int startIndex, int endIndex, HexFormat format) {
        return (int)HexExtensionsKt.hexToLongImpl($this$hexToInt, startIndex, endIndex, format, 8);
    }

    @SinceKotlin(version="1.9")
    @ExperimentalStdlibApi
    public static final short hexToShort(@NotNull String $this$hexToShort, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToShort, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.hexToShort($this$hexToShort, 0, $this$hexToShort.length(), format);
    }

    static /* synthetic */ int hexToInt$default(String string, int n, int n2, HexFormat hexFormat, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = string.length();
        }
        if ((n3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToInt(string, n, n2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte by, HexFormat hexFormat, int n, Object object) {
        if ((n & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(by, hexFormat);
    }

    static /* synthetic */ long hexToLongImpl$default(String string, int n, int n2, HexFormat hexFormat, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n = 0;
        }
        if ((n4 & 2) != 0) {
            n2 = string.length();
        }
        return HexExtensionsKt.hexToLongImpl(string, n, n2, hexFormat, n3);
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalStdlibApi
    private static final byte[] hexToByteArray(String $this$hexToByteArray, int startIndex, int endIndex, HexFormat format) {
        byte[] byArray;
        void var12_12;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToByteArray.length());
        if (startIndex == endIndex) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytesFormat = format.getBytes();
        int bytesPerLine = bytesFormat.getBytesPerLine();
        int bytesPerGroup = bytesFormat.getBytesPerGroup();
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        String groupSeparator = bytesFormat.getGroupSeparator();
        int resultCapacity = HexExtensionsKt.parsedByteArrayMaxSize(endIndex - startIndex, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] result = new byte[resultCapacity];
        int i = startIndex;
        int byteIndex = 0;
        int indexInLine = 0;
        int indexInGroup = 0;
        while (i < endIndex) {
            if (indexInLine == bytesPerLine) {
                i = HexExtensionsKt.checkNewLineAt($this$hexToByteArray, i, endIndex);
                indexInLine = 0;
                indexInGroup = 0;
            } else if (indexInGroup == bytesPerGroup) {
                i = HexExtensionsKt.checkContainsAt($this$hexToByteArray, groupSeparator, i, endIndex, "group separator");
                indexInGroup = 0;
            } else if (indexInGroup != 0) {
                i = HexExtensionsKt.checkContainsAt($this$hexToByteArray, byteSeparator, i, endIndex, "byte separator");
            }
            ++indexInLine;
            ++indexInGroup;
            i = HexExtensionsKt.checkContainsAt($this$hexToByteArray, bytePrefix, i, endIndex, "byte prefix");
            HexExtensionsKt.checkHexLength($this$hexToByteArray, i, RangesKt.coerceAtMost(i + 2, endIndex), 2, true);
            int n = byteIndex++;
            int n2 = i++;
            result[n] = (byte)(HexExtensionsKt.decimalFromHexDigitAt($this$hexToByteArray, n2) << 4 | HexExtensionsKt.decimalFromHexDigitAt($this$hexToByteArray, i++));
            i = HexExtensionsKt.checkContainsAt($this$hexToByteArray, byteSuffix, i, endIndex, "byte suffix");
        }
        if (byteIndex == result.length) {
            byArray = var12_12;
        } else {
            void var14_14;
            byte[] byArray2 = Arrays.copyOf((byte[])var12_12, (int)var14_14);
            byArray = byArray2;
            Intrinsics.checkNotNullExpressionValue(byArray2, "copyOf(...)");
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    static {
        char item$iv;
        int n;
        void $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242;
        void var0_1;
        int n2 = 0;
        int[] nArray = new int[128];
        while (n2 < 128) {
            int n3 = n2++;
            nArray[n3] = -1;
        }
        $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242 = var0_1 = $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242;
        boolean bl = false;
        CharSequence $this$forEachIndexed$iv = LOWER_CASE_HEX_DIGITS;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (n = 0; n < $this$forEachIndexed$iv.length(); ++n) {
            item$iv = $this$forEachIndexed$iv.charAt(n);
            int n4 = index$iv++;
            char c = item$iv;
            int index = n4;
            boolean bl2 = false;
            $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[c] = index;
        }
        $this$forEachIndexed$iv = UPPER_CASE_HEX_DIGITS;
        $i$f$forEachIndexed = false;
        index$iv = 0;
        for (n = 0; n < $this$forEachIndexed$iv.length(); ++n) {
            item$iv = $this$forEachIndexed$iv.charAt(n);
            int n5 = index$iv++;
            char c = item$iv;
            int n6 = n5;
            boolean bl3 = false;
            nArray[c] = n6;
        }
        HEX_DIGITS_TO_DECIMAL = var0_1;
    }

    static /* synthetic */ short hexToShort$default(String string, int n, int n2, HexFormat hexFormat, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = string.length();
        }
        if ((n3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToShort(string, n, n2, hexFormat);
    }

    @NotNull
    @SinceKotlin(version="1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(@NotNull byte[] $this$toHexString, int startIndex, int endIndex, @NotNull HexFormat format) {
        int n;
        StringBuilder stringBuilder;
        Intrinsics.checkNotNullParameter($this$toHexString, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$toHexString.length);
        if (startIndex == endIndex) {
            return "";
        }
        String digits = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytesFormat = format.getBytes();
        int bytesPerLine = bytesFormat.getBytesPerLine();
        int bytesPerGroup = bytesFormat.getBytesPerGroup();
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        String groupSeparator = bytesFormat.getGroupSeparator();
        int formatLength = HexExtensionsKt.formattedStringLength(endIndex - startIndex, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        int indexInLine = 0;
        int indexInGroup = 0;
        StringBuilder $this$toHexString_u24lambda_u243 = stringBuilder = new StringBuilder(formatLength);
        boolean bl = false;
        int i = startIndex;
        while (i < endIndex) {
            int n2 = $this$toHexString[i] & 0xFF;
            if (indexInLine == bytesPerLine) {
                $this$toHexString_u24lambda_u243.append('\n');
                indexInLine = 0;
                indexInGroup = 0;
            } else if (indexInGroup == bytesPerGroup) {
                $this$toHexString_u24lambda_u243.append(groupSeparator);
                indexInGroup = 0;
            }
            if (indexInGroup != 0) {
                $this$toHexString_u24lambda_u243.append(byteSeparator);
            }
            $this$toHexString_u24lambda_u243.append(bytePrefix);
            $this$toHexString_u24lambda_u243.append(digits.charAt(n2 >> 4));
            $this$toHexString_u24lambda_u243.append(digits.charAt(n2 & 0xF));
            $this$toHexString_u24lambda_u243.append(byteSuffix);
            ++indexInGroup;
            ++indexInLine;
            ++n;
        }
        n = formatLength == $this$toHexString_u24lambda_u243.length() ? 1 : 0;
        if (n == 0) {
            String string = "Check failed.";
            throw new IllegalStateException(string.toString());
        }
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public static final int parsedByteArrayMaxSize(int stringLength, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        void var21_19;
        void var19_18;
        void var2_2;
        void var17_17;
        long l;
        boolean bl = stringLength > 0;
        if (!bl) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        long charsPerByte = (long)bytePrefixLength + 2L + (long)byteSuffixLength;
        long charsPerGroup = HexExtensionsKt.charsPerSet(charsPerByte, bytesPerGroup, byteSeparatorLength);
        if (bytesPerLine <= bytesPerGroup) {
            l = HexExtensionsKt.charsPerSet(charsPerByte, bytesPerLine, byteSeparatorLength);
        } else {
            long l2;
            int groupsPerLine = bytesPerLine / bytesPerGroup;
            long result = HexExtensionsKt.charsPerSet(charsPerGroup, groupsPerLine, groupSeparatorLength);
            int bytesPerLastGroupInLine = bytesPerLine % bytesPerGroup;
            if (bytesPerLastGroupInLine != 0) {
                l2 = (result += (long)groupSeparatorLength) + HexExtensionsKt.charsPerSet(charsPerByte, bytesPerLastGroupInLine, byteSeparatorLength);
            }
            l = l2;
        }
        long charsPerLine = l;
        long numberOfChars = stringLength;
        long wholeLines = HexExtensionsKt.wholeElementsPerSet(numberOfChars, charsPerLine, 1);
        long wholeGroupsInLastLine = HexExtensionsKt.wholeElementsPerSet(numberOfChars -= wholeLines * (charsPerLine + 1L), charsPerGroup, groupSeparatorLength);
        long wholeBytesInLastGroup = HexExtensionsKt.wholeElementsPerSet(numberOfChars -= wholeGroupsInLastLine * (charsPerGroup + (long)groupSeparatorLength), charsPerByte, byteSeparatorLength);
        boolean spare = (numberOfChars -= wholeBytesInLastGroup * (charsPerByte + (long)byteSeparatorLength)) > 0L;
        return (int)(wholeLines * (long)bytesPerLine + var17_17 * (long)var2_2 + var19_18 + (long)var21_19);
    }

    @ExperimentalStdlibApi
    private static final byte hexToByte(String $this$hexToByte, int startIndex, int endIndex, HexFormat format) {
        return (byte)HexExtensionsKt.hexToLongImpl($this$hexToByte, startIndex, endIndex, format, 2);
    }

    @SinceKotlin(version="1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(@NotNull byte[] $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$toHexString, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString, 0, $this$toHexString.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] byArray, int n, int n2, HexFormat hexFormat, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = byArray.length;
        }
        if ((n3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(byArray, n, n2, hexFormat);
    }

    private static final long charsPerSet(long charsPerElement, int elementsPerSet, int elementSeparatorLength) {
        boolean bl = elementsPerSet > 0;
        if (!bl) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        return charsPerElement * (long)elementsPerSet + (long)elementSeparatorLength * ((long)elementsPerSet - 1L);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version="1.9")
    public static final byte hexToByte(@NotNull String $this$hexToByte, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToByte, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.hexToByte($this$hexToByte, 0, $this$hexToByte.length(), format);
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalStdlibApi
    private static final long hexToLongImpl(String $this$hexToLongImpl, int startIndex, int endIndex, HexFormat format, int maxDigits) {
        long l;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToLongImpl.length());
        String prefix = format.getNumber().getPrefix();
        String suffix = format.getNumber().getSuffix();
        if (prefix.length() + suffix.length() >= endIndex - startIndex) {
            StringBuilder stringBuilder = new StringBuilder().append("Expected a hexadecimal number with prefix \"").append(prefix).append("\" and suffix \"").append(suffix).append("\", but was ");
            String string = $this$hexToLongImpl;
            Intrinsics.checkNotNull(string, "null cannot be cast to non-null type java.lang.String");
            String string2 = string.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
            throw new NumberFormatException(stringBuilder.append(string2).toString());
        }
        int digitsStartIndex = HexExtensionsKt.checkContainsAt($this$hexToLongImpl, prefix, startIndex, endIndex, "prefix");
        int digitsEndIndex = endIndex - suffix.length();
        HexExtensionsKt.checkContainsAt($this$hexToLongImpl, suffix, digitsEndIndex, endIndex, "suffix");
        HexExtensionsKt.checkHexLength($this$hexToLongImpl, digitsStartIndex, digitsEndIndex, maxDigits, false);
        long result = 0L;
        int i = digitsStartIndex;
        while (i < digitsEndIndex) {
            void var11_10;
            l = result << 4 | (long)HexExtensionsKt.decimalFromHexDigitAt($this$hexToLongImpl, i);
            ++var11_10;
        }
        return l;
    }

    /*
     * WARNING - void declaration
     */
    private static final int checkContainsAt(String $this$checkContainsAt, String part, int index, int endIndex, String partName) {
        void var5_5;
        block3: {
            int end;
            block2: {
                end = index + part.length();
                if (end > endIndex) break block2;
                if (StringsKt.regionMatches($this$checkContainsAt, index, part, 0, part.length(), true)) break block3;
            }
            StringBuilder stringBuilder = new StringBuilder().append("Expected ").append(partName).append(" \"").append(part).append("\" at index ").append(index).append(", but was ");
            String string = $this$checkContainsAt;
            int n = RangesKt.coerceAtMost(end, endIndex);
            Intrinsics.checkNotNull(string, "null cannot be cast to non-null type java.lang.String");
            String string2 = string.substring(index, n);
            Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
            throw new NumberFormatException(stringBuilder.append(string2).toString());
        }
        return (int)var5_5;
    }

    @NotNull
    @ExperimentalStdlibApi
    @SinceKotlin(version="1.9")
    public static final byte[] hexToByteArray(@NotNull String $this$hexToByteArray, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToByteArray, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.hexToByteArray($this$hexToByteArray, 0, $this$hexToByteArray.length(), format);
    }

    @NotNull
    @SinceKotlin(version="1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(byte $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexStringImpl($this$toHexString, format, 8);
    }

    /*
     * WARNING - void declaration
     */
    public static final int formattedStringLength(int totalBytes, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        void var10_12;
        void var12_14;
        int n;
        boolean bl = totalBytes > 0;
        if (!bl) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        int lineSeparators = (totalBytes + -1) / bytesPerLine;
        boolean bl2 = false;
        int groupSeparatorsPerLine = (bytesPerLine + -1) / bytesPerGroup;
        int it = n = totalBytes % bytesPerLine;
        boolean bl3 = false;
        int bytesInLastLine = it == 0 ? bytesPerLine : var12_14;
        int groupSeparatorsInLastLine = (bytesInLastLine - 1) / bytesPerGroup;
        int groupSeparators = lineSeparators * groupSeparatorsPerLine + n;
        int byteSeparators = totalBytes + -1 - lineSeparators - groupSeparators;
        long totalLength = (long)lineSeparators + (long)groupSeparators * (long)groupSeparatorLength + (long)byteSeparators * (long)byteSeparatorLength + (long)totalBytes * ((long)bytePrefixLength + 2L + (long)byteSuffixLength);
        if (!RangesKt.intRangeContains((ClosedRange<Integer>)new IntRange(0, Integer.MAX_VALUE), totalLength)) {
            throw new IllegalArgumentException("The resulting string length is too big: " + ULong.toString-impl(ULong.constructor-impl(totalLength)));
        }
        return (int)var10_12;
    }

    @SinceKotlin(version="1.9")
    @ExperimentalStdlibApi
    @NotNull
    public static final String toHexString(int $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexStringImpl($this$toHexString, format, 32);
    }

    @ExperimentalStdlibApi
    private static final short hexToShort(String $this$hexToShort, int startIndex, int endIndex, HexFormat format) {
        return (short)HexExtensionsKt.hexToLongImpl($this$hexToShort, startIndex, endIndex, format, 4);
    }

    public static /* synthetic */ String toHexString$default(long l, HexFormat hexFormat, int n, Object object) {
        if ((n & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(l, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] byArray, HexFormat hexFormat, int n, Object object) {
        if ((n & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.toHexString(byArray, hexFormat);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String string, HexFormat hexFormat, int n, Object object) {
        if ((n & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return HexExtensionsKt.hexToByteArray(string, hexFormat);
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalStdlibApi
    private static final String toHexStringImpl(long $this$toHexStringImpl, HexFormat format, int bits) {
        void var12_12;
        StringBuilder stringBuilder;
        boolean bl = (bits & 3) == 0;
        if (!bl) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        String digits = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        long value = $this$toHexStringImpl;
        String prefix = format.getNumber().getPrefix();
        String suffix = format.getNumber().getSuffix();
        int formatLength = prefix.length() + (bits >> 2) + suffix.length();
        boolean removeZeros = false;
        removeZeros = format.getNumber().getRemoveLeadingZeros();
        StringBuilder $this$toHexStringImpl_u24lambda_u246 = stringBuilder = new StringBuilder(formatLength);
        boolean bl2 = false;
        $this$toHexStringImpl_u24lambda_u246.append(prefix);
        int shift = bits;
        while (shift > 0) {
            void var15_15;
            int decimal = (int)(value >> (shift -= 4) & 0xFL);
            if (removeZeros = removeZeros && decimal == 0 && shift > 0) continue;
            $this$toHexStringImpl_u24lambda_u246.append(digits.charAt((int)var15_15));
        }
        var12_12.append(suffix);
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /*
     * WARNING - void declaration
     */
    private static final int decimalFromHexDigitAt(String $this$decimalFromHexDigitAt, int index) {
        void var2_2;
        block3: {
            block2: {
                char code = $this$decimalFromHexDigitAt.charAt(index);
                if (code > '\u007f') break block2;
                if (HEX_DIGITS_TO_DECIMAL[code] >= 0) break block3;
            }
            throw new NumberFormatException("Expected a hexadecimal digit at index " + index + ", but was " + $this$decimalFromHexDigitAt.charAt(index));
        }
        return HEX_DIGITS_TO_DECIMAL[var2_2];
    }

    @ExperimentalStdlibApi
    @NotNull
    @SinceKotlin(version="1.9")
    public static final String toHexString(short $this$toHexString, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexStringImpl($this$toHexString, format, 16);
    }

    @ExperimentalStdlibApi
    private static final long hexToLong(String $this$hexToLong, int startIndex, int endIndex, HexFormat format) {
        return HexExtensionsKt.hexToLongImpl($this$hexToLong, startIndex, endIndex, format, 16);
    }

    private static final int checkNewLineAt(String $this$checkNewLineAt, int index, int endIndex) {
        int n;
        if ($this$checkNewLineAt.charAt(index) == '\r') {
            n = index + 1 < endIndex && $this$checkNewLineAt.charAt(index + 1) == '\n' ? index + 2 : index + 1;
        } else if ($this$checkNewLineAt.charAt(index) == '\n') {
            n = index + 1;
        } else {
            throw new NumberFormatException("Expected a new line at index " + index + ", but was " + $this$checkNewLineAt.charAt(index));
        }
        return n;
    }
}

