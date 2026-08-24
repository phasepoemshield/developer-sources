/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\nH\u0007\u00a2\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0018\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u0018\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u0018\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u0018\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\"\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013H\u0087\b\u00a2\u0006\u0004\b \u0010!\u001a\u001c\u0010\"\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0013H\u0087\b\u00a2\u0006\u0004\b#\u0010$\u001a\u001c\u0010\"\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0013H\u0087\b\u00a2\u0006\u0004\b%\u0010&\u001a\u001c\u0010\"\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0087\b\u00a2\u0006\u0004\b'\u0010(\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\u0002*\u00020\u0000H\u0007\u00a2\u0006\u0004\b)\u0010*\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007\u00a2\u0006\u0004\b,\u0010-\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0007\u00a2\u0006\u0004\b.\u0010/\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007\u00a2\u0006\u0004\b0\u00101\u001a=\u00108\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u000004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b6\u00107\u001a=\u00108\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u000004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b9\u0010:\u001a=\u00108\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\n2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u000004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b;\u0010<\u001a=\u00108\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u000e2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u000004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b=\u0010>\u001a1\u0010D\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020?j\n\u0012\u0006\b\u0000\u0012\u00020\u0002`@H\u0007\u00a2\u0006\u0004\bB\u0010C\u001a1\u0010D\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070?j\n\u0012\u0006\b\u0000\u0012\u00020\u0007`@H\u0007\u00a2\u0006\u0004\bE\u0010F\u001a1\u0010D\u001a\u0004\u0018\u00010\u000b*\u00020\n2\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0?j\n\u0012\u0006\b\u0000\u0012\u00020\u000b`@H\u0007\u00a2\u0006\u0004\bG\u0010H\u001a1\u0010D\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0?j\n\u0012\u0006\b\u0000\u0012\u00020\u000f`@H\u0007\u00a2\u0006\u0004\bI\u0010J\u001a\u0015\u0010L\u001a\u0004\u0018\u00010\u0002*\u00020\u0000H\u0007\u00a2\u0006\u0004\bK\u0010*\u001a\u0015\u0010L\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0007\u00a2\u0006\u0004\bM\u0010-\u001a\u0015\u0010L\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0007\u00a2\u0006\u0004\bN\u0010/\u001a\u0015\u0010L\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007\u00a2\u0006\u0004\bO\u00101\u001a=\u0010Q\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u000004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bP\u00107\u001a=\u0010Q\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u000004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bR\u0010:\u001a=\u0010Q\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\n2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u000004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bS\u0010<\u001a=\u0010Q\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u00028\u000002*\u00020\u000e2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u000004H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bT\u0010>\u001a1\u0010V\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020?j\n\u0012\u0006\b\u0000\u0012\u00020\u0002`@H\u0007\u00a2\u0006\u0004\bU\u0010C\u001a1\u0010V\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070?j\n\u0012\u0006\b\u0000\u0012\u00020\u0007`@H\u0007\u00a2\u0006\u0004\bW\u0010F\u001a1\u0010V\u001a\u0004\u0018\u00010\u000b*\u00020\n2\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0?j\n\u0012\u0006\b\u0000\u0012\u00020\u000b`@H\u0007\u00a2\u0006\u0004\bX\u0010H\u001a1\u0010V\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u001a\u0010A\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0?j\n\u0012\u0006\b\u0000\u0012\u00020\u000f`@H\u0007\u00a2\u0006\u0004\bY\u0010J\u001a+\u0010]\u001a\u00020Z*\u00020\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020Z04H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b[\u0010\\\u001a+\u0010]\u001a\u00020^*\u00020\u00002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020^04H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b_\u0010`\u001a+\u0010]\u001a\u00020Z*\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Z04H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b[\u0010a\u001a+\u0010]\u001a\u00020^*\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020^04H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b_\u0010b\u001a+\u0010]\u001a\u00020Z*\u00020\n2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020Z04H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b[\u0010c\u001a+\u0010]\u001a\u00020^*\u00020\n2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020^04H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b_\u0010d\u001a+\u0010]\u001a\u00020Z*\u00020\u000e2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Z04H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b[\u0010e\u001a+\u0010]\u001a\u00020^*\u00020\u000e2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020^04H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b_\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006g"}, d2={"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "asList-GBYM_sE", "([B)Ljava/util/List;", "asList", "Lkotlin/UIntArray;", "Lkotlin/UInt;", "asList--ajY-9A", "([I)Ljava/util/List;", "Lkotlin/ULongArray;", "Lkotlin/ULong;", "asList-QwZRm1k", "([J)Ljava/util/List;", "Lkotlin/UShortArray;", "Lkotlin/UShort;", "asList-rL5Bavg", "([S)Ljava/util/List;", "element", "", "fromIndex", "toIndex", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-EtDCXyQ", "([SSII)I", "index", "elementAt-PpDY95g", "([BI)B", "elementAt", "elementAt-qFRl0hI", "([II)I", "elementAt-r7IrZao", "([JI)J", "elementAt-nggk6HY", "([SI)S", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max", "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "", "R", "Lkotlin/Function1;", "selector", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min-GBYM_sE", "min", "min--ajY-9A", "min-QwZRm1k", "min-rL5Bavg", "minBy-JOV_ifY", "minBy", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-xTcfx_M", "minWith-XMRcp5o", "minWith", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-eOHTfZs", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "sumOf", "Ljava/math/BigInteger;", "sumOfBigInteger", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, xs="kotlin/collections/unsigned/UArraysKt", pn="")
class UArraysKt___UArraysJvmKt {
    @ExperimentalUnsignedTypes
    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final short elementAt-nggk6HY(short[] $this$elementAt_u2dnggk6HY, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt_u2dnggk6HY, "$this$elementAt");
        return UShortArray.get-Mh2AYeg($this$elementAt_u2dnggk6HY, index);
    }

    @Deprecated(message="Use minWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.minWithOrNull(comparator)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final /* synthetic */ UByte minWith-XMRcp5o(byte[] $this$minWith_u2dXMRcp5o, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith_u2dXMRcp5o, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.minWithOrNull-XMRcp5o($this$minWith_u2dXMRcp5o, comparator);
    }

    @Deprecated(message="Use maxWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxWithOrNull(comparator)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ ULong maxWith-zrEWJaI(long[] $this$maxWith_u2dzrEWJaI, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith_u2dzrEWJaI, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.maxWithOrNull-zrEWJaI($this$maxWith_u2dzrEWJaI, comparator);
    }

    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ UShort max-rL5Bavg(short[] $this$max_u2drL5Bavg) {
        Intrinsics.checkNotNullParameter($this$max_u2drL5Bavg, "$this$max");
        return UArraysKt.maxOrNull-rL5Bavg($this$max_u2drL5Bavg);
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @JvmName(name="sumOfBigInteger")
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final BigInteger sumOfBigInteger(long[] $this$sumOf_u2dMShoTSo, Function1<? super ULong, ? extends BigInteger> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf_u2dMShoTSo, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigInteger = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "valueOf(...)");
        BigInteger sum = bigInteger;
        int n = ULongArray.getSize-impl($this$sumOf_u2dMShoTSo);
        for (int i = 0; i < n; ++i) {
            long element = ULongArray.get-s-VKNKU($this$sumOf_u2dMShoTSo, i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(ULong.box-impl(element))), "add(...)");
        }
        return var2_2;
    }

    @Deprecated(message="Use minWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.minWithOrNull(comparator)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ UInt minWith-YmdZ_VM(int[] $this$minWith_u2dYmdZ_VM, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith_u2dYmdZ_VM, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.minWithOrNull-YmdZ_VM($this$minWith_u2dYmdZ_VM, comparator);
    }

    @Deprecated(message="Use maxWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxWithOrNull(comparator)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ UInt maxWith-YmdZ_VM(int[] $this$maxWith_u2dYmdZ_VM, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith_u2dYmdZ_VM, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.maxWithOrNull-YmdZ_VM($this$maxWith_u2dYmdZ_VM, comparator);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ UInt min--ajY-9A(int[] $this$min_u2d_u2dajY_u2d9A) {
        Intrinsics.checkNotNullParameter($this$min_u2d_u2dajY_u2d9A, "$this$min");
        return UArraysKt.minOrNull--ajY-9A($this$min_u2d_u2dajY_u2d9A);
    }

    @Deprecated(message="Use maxWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxWithOrNull(comparator)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final /* synthetic */ UByte maxWith-XMRcp5o(byte[] $this$maxWith_u2dXMRcp5o, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith_u2dXMRcp5o, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.maxWithOrNull-XMRcp5o($this$maxWith_u2dXMRcp5o, comparator);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxByOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxByOrNull(selector)", imports={}))
    @SinceKotlin(version="1.3")
    @InlineOnly
    @ExperimentalUnsignedTypes
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong maxBy-MShoTSo(long[] $this$maxBy_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
        ULong uLong;
        Intrinsics.checkNotNullParameter($this$maxBy_u2dMShoTSo, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long[] lArray = $this$maxBy_u2dMShoTSo;
        if (ULongArray.isEmpty-impl(lArray)) {
            uLong = null;
        } else {
            long l = ULongArray.get-s-VKNKU(lArray, 0);
            Object object = lArray;
            int n = ArraysKt.getLastIndex(object);
            if (n == 0) {
                uLong = ULong.box-impl(l);
            } else {
                object = (Comparable)selector.invoke(ULong.box-impl(l));
                IntIterator intIterator = new IntRange(1, n).iterator();
                while (intIterator.hasNext()) {
                    int n2 = intIterator.nextInt();
                    long l2 = ULongArray.get-s-VKNKU(lArray, n2);
                    Comparable comparable = (Comparable)selector.invoke(ULong.box-impl(l2));
                    if (object.compareTo(comparable) >= 0) continue;
                    l = l2;
                    object = comparable;
                }
                uLong = ULong.box-impl(l);
            }
        }
        return uLong;
    }

    @NotNull
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final List<UInt> asList--ajY-9A(@NotNull int[] $this$asList_u2d_u2dajY_u2d9A) {
        Intrinsics.checkNotNullParameter($this$asList_u2d_u2dajY_u2d9A, "$this$asList");
        return (List)((Object)new RandomAccess($this$asList_u2d_u2dajY_u2d9A){
            final /* synthetic */ int[] $this_asList;

            public int getSize() {
                return UIntArray.getSize-impl(this.$this_asList);
            }

            public int get-pVg5ArA(int index) {
                return UIntArray.get-pVg5ArA(this.$this_asList, index);
            }

            public boolean contains-WZ4Q5Ns(int element) {
                return UIntArray.contains-WZ4Q5Ns(this.$this_asList, element);
            }

            public int lastIndexOf-WZ4Q5Ns(int element) {
                return ArraysKt.lastIndexOf(this.$this_asList, element);
            }

            public boolean isEmpty() {
                return UIntArray.isEmpty-impl(this.$this_asList);
            }

            public int indexOf-WZ4Q5Ns(int element) {
                return ArraysKt.indexOf(this.$this_asList, element);
            }
            {
                this.$this_asList = $receiver;
            }
        });
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @InlineOnly
    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    @JvmName(name="sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(byte[] $this$sumOf_u2dJOV_ifY, Function1<? super UByte, ? extends BigInteger> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf_u2dJOV_ifY, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigInteger = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "valueOf(...)");
        BigInteger sum = bigInteger;
        int n = UByteArray.getSize-impl($this$sumOf_u2dJOV_ifY);
        for (int i = 0; i < n; ++i) {
            byte element = UByteArray.get-w2LRezQ($this$sumOf_u2dJOV_ifY, i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(UByte.box-impl(element))), "add(...)");
        }
        return var2_2;
    }

    @Deprecated(message="Use minByOrNull instead.", replaceWith=@ReplaceWith(expression="this.minByOrNull(selector)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt minBy-jgv0xPQ(int[] $this$minBy_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
        UInt uInt;
        Intrinsics.checkNotNullParameter($this$minBy_u2djgv0xPQ, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int[] nArray = $this$minBy_u2djgv0xPQ;
        if (UIntArray.isEmpty-impl(nArray)) {
            uInt = null;
        } else {
            int n = UIntArray.get-pVg5ArA(nArray, 0);
            Object object = nArray;
            int n2 = ArraysKt.getLastIndex(object);
            if (n2 == 0) {
                uInt = UInt.box-impl(n);
            } else {
                object = (Comparable)selector.invoke(UInt.box-impl(n));
                IntIterator intIterator = new IntRange(1, n2).iterator();
                while (intIterator.hasNext()) {
                    int n3 = intIterator.nextInt();
                    int n4 = UIntArray.get-pVg5ArA(nArray, n3);
                    Comparable comparable = (Comparable)selector.invoke(UInt.box-impl(n4));
                    if (object.compareTo(comparable) <= 0) continue;
                    n = n4;
                    object = comparable;
                }
                uInt = UInt.box-impl(n);
            }
        }
        return uInt;
    }

    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final /* synthetic */ ULong max-QwZRm1k(long[] $this$max_u2dQwZRm1k) {
        Intrinsics.checkNotNullParameter($this$max_u2dQwZRm1k, "$this$max");
        return UArraysKt.maxOrNull-QwZRm1k($this$max_u2dQwZRm1k);
    }

    public static /* synthetic */ int binarySearch-2fe2U9s$default(int[] nArray, int n, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = UIntArray.getSize-impl(nArray);
        }
        return UArraysKt.binarySearch-2fe2U9s(nArray, n, n2, n3);
    }

    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ UShort min-rL5Bavg(short[] $this$min_u2drL5Bavg) {
        Intrinsics.checkNotNullParameter($this$min_u2drL5Bavg, "$this$min");
        return UArraysKt.minOrNull-rL5Bavg($this$min_u2drL5Bavg);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.minWithOrNull(comparator)", imports={}))
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final /* synthetic */ UShort minWith-eOHTfZs(short[] $this$minWith_u2deOHTfZs, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith_u2deOHTfZs, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.minWithOrNull-eOHTfZs($this$minWith_u2deOHTfZs, comparator);
    }

    @NotNull
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final List<UByte> asList-GBYM_sE(@NotNull byte[] $this$asList_u2dGBYM_sE) {
        Intrinsics.checkNotNullParameter($this$asList_u2dGBYM_sE, "$this$asList");
        return (List)((Object)new RandomAccess($this$asList_u2dGBYM_sE){
            final /* synthetic */ byte[] $this_asList;

            public byte get-w2LRezQ(int index) {
                return UByteArray.get-w2LRezQ(this.$this_asList, index);
            }
            {
                this.$this_asList = $receiver;
            }

            public int lastIndexOf-7apg3OU(byte element) {
                return ArraysKt.lastIndexOf(this.$this_asList, element);
            }

            public int indexOf-7apg3OU(byte element) {
                return ArraysKt.indexOf(this.$this_asList, element);
            }

            public boolean isEmpty() {
                return UByteArray.isEmpty-impl(this.$this_asList);
            }

            public boolean contains-7apg3OU(byte element) {
                return UByteArray.contains-7apg3OU(this.$this_asList, element);
            }

            public int getSize() {
                return UByteArray.getSize-impl(this.$this_asList);
            }
        });
    }

    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final List<UShort> asList-rL5Bavg(@NotNull short[] $this$asList_u2drL5Bavg) {
        Intrinsics.checkNotNullParameter($this$asList_u2drL5Bavg, "$this$asList");
        return (List)((Object)new RandomAccess($this$asList_u2drL5Bavg){
            final /* synthetic */ short[] $this_asList;

            public int indexOf-xj2QHRw(short element) {
                return ArraysKt.indexOf(this.$this_asList, element);
            }

            public boolean contains-xj2QHRw(short element) {
                return UShortArray.contains-xj2QHRw(this.$this_asList, element);
            }
            {
                this.$this_asList = $receiver;
            }

            public int getSize() {
                return UShortArray.getSize-impl(this.$this_asList);
            }

            public boolean isEmpty() {
                return UShortArray.isEmpty-impl(this.$this_asList);
            }

            public short get-Mh2AYeg(int index) {
                return UShortArray.get-Mh2AYeg(this.$this_asList, index);
            }

            public int lastIndexOf-xj2QHRw(short element) {
                return ArraysKt.lastIndexOf(this.$this_asList, element);
            }
        });
    }

    public static /* synthetic */ int binarySearch-K6DWlUc$default(long[] lArray, long l, int n, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            n2 = ULongArray.getSize-impl(lArray);
        }
        return UArraysKt.binarySearch-K6DWlUc(lArray, l, n, n2);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.minWithOrNull(comparator)", imports={}))
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ ULong minWith-zrEWJaI(long[] $this$minWith_u2dzrEWJaI, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$minWith_u2dzrEWJaI, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.minWithOrNull-zrEWJaI($this$minWith_u2dzrEWJaI, comparator);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minByOrNull instead.", replaceWith=@ReplaceWith(expression="this.minByOrNull(selector)", imports={}))
    @ExperimentalUnsignedTypes
    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte minBy-JOV_ifY(byte[] $this$minBy_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
        UByte uByte;
        Intrinsics.checkNotNullParameter($this$minBy_u2dJOV_ifY, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        byte[] byArray = $this$minBy_u2dJOV_ifY;
        if (UByteArray.isEmpty-impl(byArray)) {
            uByte = null;
        } else {
            byte by = UByteArray.get-w2LRezQ(byArray, 0);
            Object object = byArray;
            int n = ArraysKt.getLastIndex(object);
            if (n == 0) {
                uByte = UByte.box-impl(by);
            } else {
                object = (Comparable)selector.invoke(UByte.box-impl(by));
                IntIterator intIterator = new IntRange(1, n).iterator();
                while (intIterator.hasNext()) {
                    int n2 = intIterator.nextInt();
                    byte by2 = UByteArray.get-w2LRezQ(byArray, n2);
                    Comparable comparable = (Comparable)selector.invoke(UByte.box-impl(by2));
                    if (object.compareTo(comparable) <= 0) continue;
                    by = by2;
                    object = comparable;
                }
                uByte = UByte.box-impl(by);
            }
        }
        return uByte;
    }

    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final List<ULong> asList-QwZRm1k(@NotNull long[] $this$asList_u2dQwZRm1k) {
        Intrinsics.checkNotNullParameter($this$asList_u2dQwZRm1k, "$this$asList");
        return (List)((Object)new RandomAccess($this$asList_u2dQwZRm1k){
            final /* synthetic */ long[] $this_asList;
            {
                this.$this_asList = $receiver;
            }

            public int getSize() {
                return ULongArray.getSize-impl(this.$this_asList);
            }

            public int lastIndexOf-VKZWuLQ(long element) {
                return ArraysKt.lastIndexOf(this.$this_asList, element);
            }

            public int indexOf-VKZWuLQ(long element) {
                return ArraysKt.indexOf(this.$this_asList, element);
            }

            public boolean contains-VKZWuLQ(long element) {
                return ULongArray.contains-VKZWuLQ(this.$this_asList, element);
            }

            public long get-s-VKNKU(int index) {
                return ULongArray.get-s-VKNKU(this.$this_asList, index);
            }

            public boolean isEmpty() {
                return ULongArray.isEmpty-impl(this.$this_asList);
            }
        });
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    @ExperimentalUnsignedTypes
    private static final int elementAt-qFRl0hI(int[] $this$elementAt_u2dqFRl0hI, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt_u2dqFRl0hI, "$this$elementAt");
        return UIntArray.get-pVg5ArA($this$elementAt_u2dqFRl0hI, index);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final /* synthetic */ ULong min-QwZRm1k(long[] $this$min_u2dQwZRm1k) {
        Intrinsics.checkNotNullParameter($this$min_u2dQwZRm1k, "$this$min");
        return UArraysKt.minOrNull-QwZRm1k($this$min_u2dQwZRm1k);
    }

    @Deprecated(message="Use minByOrNull instead.", replaceWith=@ReplaceWith(expression="this.minByOrNull(selector)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort minBy-xTcfx_M(short[] $this$minBy_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
        UShort uShort;
        Intrinsics.checkNotNullParameter($this$minBy_u2dxTcfx_M, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        short[] sArray = $this$minBy_u2dxTcfx_M;
        if (UShortArray.isEmpty-impl(sArray)) {
            uShort = null;
        } else {
            short s = UShortArray.get-Mh2AYeg(sArray, 0);
            Object object = sArray;
            int n = ArraysKt.getLastIndex(object);
            if (n == 0) {
                uShort = UShort.box-impl(s);
            } else {
                object = (Comparable)selector.invoke(UShort.box-impl(s));
                IntIterator intIterator = new IntRange(1, n).iterator();
                while (intIterator.hasNext()) {
                    int n2 = intIterator.nextInt();
                    short s2 = UShortArray.get-Mh2AYeg(sArray, n2);
                    Comparable comparable = (Comparable)selector.invoke(UShort.box-impl(s2));
                    if (object.compareTo(comparable) <= 0) continue;
                    s = s2;
                    object = comparable;
                }
                uShort = UShort.box-impl(s);
            }
        }
        return uShort;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    @ExperimentalUnsignedTypes
    @JvmName(name="sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(byte[] $this$sumOf_u2dJOV_ifY, Function1<? super UByte, ? extends BigDecimal> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf_u2dJOV_ifY, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "valueOf(...)");
        BigDecimal sum = bigDecimal;
        int n = UByteArray.getSize-impl($this$sumOf_u2dJOV_ifY);
        for (int i = 0; i < n; ++i) {
            byte element = UByteArray.get-w2LRezQ($this$sumOf_u2dJOV_ifY, i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(UByte.box-impl(element))), "add(...)");
        }
        return var2_2;
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    private static final byte elementAt-PpDY95g(byte[] $this$elementAt_u2dPpDY95g, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt_u2dPpDY95g, "$this$elementAt");
        return UByteArray.get-w2LRezQ($this$elementAt_u2dPpDY95g, index);
    }

    @Deprecated(message="Use maxByOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxByOrNull(selector)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @InlineOnly
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte maxBy-JOV_ifY(byte[] $this$maxBy_u2dJOV_ifY, Function1<? super UByte, ? extends R> selector) {
        UByte uByte;
        Intrinsics.checkNotNullParameter($this$maxBy_u2dJOV_ifY, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        byte[] byArray = $this$maxBy_u2dJOV_ifY;
        if (UByteArray.isEmpty-impl(byArray)) {
            uByte = null;
        } else {
            byte by = UByteArray.get-w2LRezQ(byArray, 0);
            Object object = byArray;
            int n = ArraysKt.getLastIndex(object);
            if (n == 0) {
                uByte = UByte.box-impl(by);
            } else {
                object = (Comparable)selector.invoke(UByte.box-impl(by));
                IntIterator intIterator = new IntRange(1, n).iterator();
                while (intIterator.hasNext()) {
                    int n2 = intIterator.nextInt();
                    byte by2 = UByteArray.get-w2LRezQ(byArray, n2);
                    Comparable comparable = (Comparable)selector.invoke(UByte.box-impl(by2));
                    if (object.compareTo(comparable) >= 0) continue;
                    by = by2;
                    object = comparable;
                }
                uByte = UByte.box-impl(by);
            }
        }
        return uByte;
    }

    @Deprecated(message="Use maxWithOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxWithOrNull(comparator)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ UShort maxWith-eOHTfZs(short[] $this$maxWith_u2deOHTfZs, Comparator comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith_u2deOHTfZs, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.maxWithOrNull-eOHTfZs($this$maxWith_u2deOHTfZs, comparator);
    }

    @Deprecated(message="Use maxByOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxByOrNull(selector)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt maxBy-jgv0xPQ(int[] $this$maxBy_u2djgv0xPQ, Function1<? super UInt, ? extends R> selector) {
        UInt uInt;
        Intrinsics.checkNotNullParameter($this$maxBy_u2djgv0xPQ, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int[] nArray = $this$maxBy_u2djgv0xPQ;
        if (UIntArray.isEmpty-impl(nArray)) {
            uInt = null;
        } else {
            int n = UIntArray.get-pVg5ArA(nArray, 0);
            Object object = nArray;
            int n2 = ArraysKt.getLastIndex(object);
            if (n2 == 0) {
                uInt = UInt.box-impl(n);
            } else {
                object = (Comparable)selector.invoke(UInt.box-impl(n));
                IntIterator intIterator = new IntRange(1, n2).iterator();
                while (intIterator.hasNext()) {
                    int n3 = intIterator.nextInt();
                    int n4 = UIntArray.get-pVg5ArA(nArray, n3);
                    Comparable comparable = (Comparable)selector.invoke(UInt.box-impl(n4));
                    if (object.compareTo(comparable) >= 0) continue;
                    n = n4;
                    object = comparable;
                }
                uInt = UInt.box-impl(n);
            }
        }
        return uInt;
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ UByte max-GBYM_sE(byte[] $this$max_u2dGBYM_sE) {
        Intrinsics.checkNotNullParameter($this$max_u2dGBYM_sE, "$this$max");
        return UArraysKt.maxOrNull-GBYM_sE($this$max_u2dGBYM_sE);
    }

    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @Deprecated(message="Use maxByOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxByOrNull(selector)", imports={}))
    @InlineOnly
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort maxBy-xTcfx_M(short[] $this$maxBy_u2dxTcfx_M, Function1<? super UShort, ? extends R> selector) {
        UShort uShort;
        Intrinsics.checkNotNullParameter($this$maxBy_u2dxTcfx_M, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        short[] sArray = $this$maxBy_u2dxTcfx_M;
        if (UShortArray.isEmpty-impl(sArray)) {
            uShort = null;
        } else {
            short s = UShortArray.get-Mh2AYeg(sArray, 0);
            Object object = sArray;
            int n = ArraysKt.getLastIndex(object);
            if (n == 0) {
                uShort = UShort.box-impl(s);
            } else {
                object = (Comparable)selector.invoke(UShort.box-impl(s));
                IntIterator intIterator = new IntRange(1, n).iterator();
                while (intIterator.hasNext()) {
                    int n2 = intIterator.nextInt();
                    short s2 = UShortArray.get-Mh2AYeg(sArray, n2);
                    Comparable comparable = (Comparable)selector.invoke(UShort.box-impl(s2));
                    if (object.compareTo(comparable) >= 0) continue;
                    s = s2;
                    object = comparable;
                }
                uShort = UShort.box-impl(s);
            }
        }
        return uShort;
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final int binarySearch-K6DWlUc(@NotNull long[] $this$binarySearch_u2dK6DWlUc, long element, int fromIndex, int toIndex) {
        void var7_5;
        Intrinsics.checkNotNullParameter($this$binarySearch_u2dK6DWlUc, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, ULongArray.getSize-impl($this$binarySearch_u2dK6DWlUc));
        long signedElement = element;
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            void var9_7;
            int mid = low + high >>> 1;
            long midVal = $this$binarySearch_u2dK6DWlUc[mid];
            int cmp = UnsignedKt.ulongCompare(midVal, signedElement);
            if (cmp < 0) {
                low = mid + 1;
                continue;
            }
            if (cmp > 0) {
                high = mid - 1;
                continue;
            }
            return (int)var9_7;
        }
        return (int)(-(var7_5 + true));
    }

    public static /* synthetic */ int binarySearch-EtDCXyQ$default(short[] sArray, short s, int n, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            n2 = UShortArray.getSize-impl(sArray);
        }
        return UArraysKt.binarySearch-EtDCXyQ(sArray, s, n, n2);
    }

    /*
     * WARNING - void declaration
     */
    @JvmName(name="sumOfBigDecimal")
    @SinceKotlin(version="1.4")
    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final BigDecimal sumOfBigDecimal(short[] $this$sumOf_u2dxTcfx_M, Function1<? super UShort, ? extends BigDecimal> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf_u2dxTcfx_M, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "valueOf(...)");
        BigDecimal sum = bigDecimal;
        int n = UShortArray.getSize-impl($this$sumOf_u2dxTcfx_M);
        for (int i = 0; i < n; ++i) {
            short element = UShortArray.get-Mh2AYeg($this$sumOf_u2dxTcfx_M, i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(UShort.box-impl(element))), "add(...)");
        }
        return var2_2;
    }

    @InlineOnly
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    private static final long elementAt-r7IrZao(long[] $this$elementAt_u2dr7IrZao, int index) {
        Intrinsics.checkNotNullParameter($this$elementAt_u2dr7IrZao, "$this$elementAt");
        return ULongArray.get-s-VKNKU($this$elementAt_u2dr7IrZao, index);
    }

    public static /* synthetic */ int binarySearch-WpHrYlw$default(byte[] byArray, byte by, int n, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            n2 = UByteArray.getSize-impl(byArray);
        }
        return UArraysKt.binarySearch-WpHrYlw(byArray, by, n, n2);
    }

    @Deprecated(message="Use minByOrNull instead.", replaceWith=@ReplaceWith(expression="this.minByOrNull(selector)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @InlineOnly
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong minBy-MShoTSo(long[] $this$minBy_u2dMShoTSo, Function1<? super ULong, ? extends R> selector) {
        ULong uLong;
        Intrinsics.checkNotNullParameter($this$minBy_u2dMShoTSo, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long[] lArray = $this$minBy_u2dMShoTSo;
        if (ULongArray.isEmpty-impl(lArray)) {
            uLong = null;
        } else {
            long l = ULongArray.get-s-VKNKU(lArray, 0);
            Object object = lArray;
            int n = ArraysKt.getLastIndex(object);
            if (n == 0) {
                uLong = ULong.box-impl(l);
            } else {
                object = (Comparable)selector.invoke(ULong.box-impl(l));
                IntIterator intIterator = new IntRange(1, n).iterator();
                while (intIterator.hasNext()) {
                    int n2 = intIterator.nextInt();
                    long l2 = ULongArray.get-s-VKNKU(lArray, n2);
                    Comparable comparable = (Comparable)selector.invoke(ULong.box-impl(l2));
                    if (object.compareTo(comparable) <= 0) continue;
                    l = l2;
                    object = comparable;
                }
                uLong = ULong.box-impl(l);
            }
        }
        return uLong;
    }

    @Deprecated(message="Use maxOrNull instead.", replaceWith=@ReplaceWith(expression="this.maxOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final /* synthetic */ UInt max--ajY-9A(int[] $this$max_u2d_u2dajY_u2d9A) {
        Intrinsics.checkNotNullParameter($this$max_u2d_u2dajY_u2d9A, "$this$max");
        return UArraysKt.maxOrNull--ajY-9A($this$max_u2d_u2dajY_u2d9A);
    }

    @Deprecated(message="Use minOrNull instead.", replaceWith=@ReplaceWith(expression="this.minOrNull()", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.4", errorSince="1.5", hiddenSince="1.6")
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final /* synthetic */ UByte min-GBYM_sE(byte[] $this$min_u2dGBYM_sE) {
        Intrinsics.checkNotNullParameter($this$min_u2dGBYM_sE, "$this$min");
        return UArraysKt.minOrNull-GBYM_sE($this$min_u2dGBYM_sE);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.3")
    @ExperimentalUnsignedTypes
    public static final int binarySearch-EtDCXyQ(@NotNull short[] $this$binarySearch_u2dEtDCXyQ, short element, int fromIndex, int toIndex) {
        void var5_5;
        Intrinsics.checkNotNullParameter($this$binarySearch_u2dEtDCXyQ, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UShortArray.getSize-impl($this$binarySearch_u2dEtDCXyQ));
        int signedElement = element & 0xFFFF;
        int low = fromIndex;
        int high = toIndex + -1;
        while (low <= high) {
            void var7_7;
            int mid = low + high >>> 1;
            short midVal = $this$binarySearch_u2dEtDCXyQ[mid];
            int cmp = UnsignedKt.uintCompare(midVal, signedElement);
            if (cmp < 0) {
                low = mid + 1;
                continue;
            }
            if (cmp > 0) {
                high = mid - 1;
                continue;
            }
            return (int)var7_7;
        }
        return (int)(-(var5_5 + true));
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name="sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(int[] $this$sumOf_u2djgv0xPQ, Function1<? super UInt, ? extends BigDecimal> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf_u2djgv0xPQ, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "valueOf(...)");
        BigDecimal sum = bigDecimal;
        int n = UIntArray.getSize-impl($this$sumOf_u2djgv0xPQ);
        for (int i = 0; i < n; ++i) {
            int element = UIntArray.get-pVg5ArA($this$sumOf_u2djgv0xPQ, i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(UInt.box-impl(element))), "add(...)");
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final int binarySearch-WpHrYlw(@NotNull byte[] $this$binarySearch_u2dWpHrYlw, byte element, int fromIndex, int toIndex) {
        void var5_5;
        Intrinsics.checkNotNullParameter($this$binarySearch_u2dWpHrYlw, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UByteArray.getSize-impl($this$binarySearch_u2dWpHrYlw));
        int signedElement = element & 0xFF;
        int low = fromIndex;
        int high = toIndex + -1;
        while (low <= high) {
            void var7_7;
            int mid = low + high >>> 1;
            byte midVal = $this$binarySearch_u2dWpHrYlw[mid];
            int cmp = UnsignedKt.uintCompare(midVal, signedElement);
            if (cmp < 0) {
                low = mid + 1;
                continue;
            }
            if (cmp > 0) {
                high = mid - 1;
                continue;
            }
            return (int)var7_7;
        }
        return (int)(-(var5_5 + true));
    }

    /*
     * WARNING - void declaration
     */
    @JvmName(name="sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final BigInteger sumOfBigInteger(short[] $this$sumOf_u2dxTcfx_M, Function1<? super UShort, ? extends BigInteger> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf_u2dxTcfx_M, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigInteger = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "valueOf(...)");
        BigInteger sum = bigInteger;
        int n = UShortArray.getSize-impl($this$sumOf_u2dxTcfx_M);
        for (int i = 0; i < n; ++i) {
            short element = UShortArray.get-Mh2AYeg($this$sumOf_u2dxTcfx_M, i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(UShort.box-impl(element))), "add(...)");
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @InlineOnly
    @SinceKotlin(version="1.4")
    @JvmName(name="sumOfBigInteger")
    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(int[] $this$sumOf_u2djgv0xPQ, Function1<? super UInt, ? extends BigInteger> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf_u2djgv0xPQ, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigInteger = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "valueOf(...)");
        BigInteger sum = bigInteger;
        int n = UIntArray.getSize-impl($this$sumOf_u2djgv0xPQ);
        for (int i = 0; i < n; ++i) {
            int element = UIntArray.get-pVg5ArA($this$sumOf_u2djgv0xPQ, i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(UInt.box-impl(element))), "add(...)");
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    @InlineOnly
    @JvmName(name="sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(long[] $this$sumOf_u2dMShoTSo, Function1<? super ULong, ? extends BigDecimal> selector) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$sumOf_u2dMShoTSo, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "valueOf(...)");
        BigDecimal sum = bigDecimal;
        int n = ULongArray.getSize-impl($this$sumOf_u2dMShoTSo);
        for (int i = 0; i < n; ++i) {
            long element = ULongArray.get-s-VKNKU($this$sumOf_u2dMShoTSo, i);
            Intrinsics.checkNotNullExpressionValue(sum.add(selector.invoke(ULong.box-impl(element))), "add(...)");
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final int binarySearch-2fe2U9s(@NotNull int[] $this$binarySearch_u2d2fe2U9s, int element, int fromIndex, int toIndex) {
        void var5_5;
        Intrinsics.checkNotNullParameter($this$binarySearch_u2d2fe2U9s, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UIntArray.getSize-impl($this$binarySearch_u2d2fe2U9s));
        int signedElement = element;
        int low = fromIndex;
        int high = toIndex + -1;
        while (low <= high) {
            void var7_7;
            int mid = low + high >>> 1;
            int midVal = $this$binarySearch_u2d2fe2U9s[mid];
            int cmp = UnsignedKt.uintCompare(midVal, signedElement);
            if (cmp < 0) {
                low = mid + 1;
                continue;
            }
            if (cmp > 0) {
                high = mid - 1;
                continue;
            }
            return (int)var7_7;
        }
        return (int)(-(var5_5 + true));
    }
}

