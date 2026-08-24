/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0014\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\u0001\u0010\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\u0006\u0010\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\u0007\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\b\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\t\u0010\u0005\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\n\u0010\u0005\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u000bH\u0087\b\u00a2\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\f\u0010\u0010\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0011H\u0087\b\u00a2\u0006\u0004\b\f\u0010\u0012\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\f\u0010\u0013\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0014H\u0087\b\u00a2\u0006\u0004\b\f\u0010\u0015\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\f\u0010\u0016\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0017H\u0087\b\u00a2\u0006\u0004\b\f\u0010\u0018\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\f\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0000*\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\u001a\u0010\u0002\u00a8\u0006\u001b"}, d2={"Ljava/math/BigDecimal;", "dec", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", "other", "div", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", "inc", "minus", "plus", "rem", "times", "", "toBigDecimal", "(D)Ljava/math/BigDecimal;", "Ljava/math/MathContext;", "mathContext", "(DLjava/math/MathContext;)Ljava/math/BigDecimal;", "", "(F)Ljava/math/BigDecimal;", "(FLjava/math/MathContext;)Ljava/math/BigDecimal;", "", "(I)Ljava/math/BigDecimal;", "(ILjava/math/MathContext;)Ljava/math/BigDecimal;", "", "(J)Ljava/math/BigDecimal;", "(JLjava/math/MathContext;)Ljava/math/BigDecimal;", "unaryMinus", "kotlin-stdlib"}, xs="kotlin/NumbersKt")
class NumbersKt__BigDecimalsKt {
    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final BigDecimal toBigDecimal(int $this$toBigDecimal) {
        BigDecimal bigDecimal = BigDecimal.valueOf($this$toBigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "valueOf(...)");
        return bigDecimal;
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final BigDecimal toBigDecimal(long $this$toBigDecimal, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal($this$toBigDecimal, mathContext);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final BigDecimal toBigDecimal(int $this$toBigDecimal, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal($this$toBigDecimal, mathContext);
    }

    @InlineOnly
    private static final BigDecimal minus(BigDecimal $this$minus, BigDecimal other) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimal = $this$minus.subtract(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "subtract(...)");
        return bigDecimal;
    }

    @InlineOnly
    private static final BigDecimal unaryMinus(BigDecimal $this$unaryMinus) {
        Intrinsics.checkNotNullParameter($this$unaryMinus, "<this>");
        BigDecimal bigDecimal = $this$unaryMinus.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "negate(...)");
        return bigDecimal;
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final BigDecimal toBigDecimal(float $this$toBigDecimal, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf($this$toBigDecimal), mathContext);
    }

    @InlineOnly
    private static final BigDecimal rem(BigDecimal $this$rem, BigDecimal other) {
        Intrinsics.checkNotNullParameter($this$rem, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimal = $this$rem.remainder(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "remainder(...)");
        return bigDecimal;
    }

    @InlineOnly
    private static final BigDecimal div(BigDecimal $this$div, BigDecimal other) {
        Intrinsics.checkNotNullParameter($this$div, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimal = $this$div.divide(other, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "divide(...)");
        return bigDecimal;
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(double $this$toBigDecimal) {
        return new BigDecimal(String.valueOf($this$toBigDecimal));
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(double $this$toBigDecimal, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf($this$toBigDecimal), mathContext);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(float $this$toBigDecimal) {
        return new BigDecimal(String.valueOf($this$toBigDecimal));
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final BigDecimal inc(BigDecimal $this$inc) {
        Intrinsics.checkNotNullParameter($this$inc, "<this>");
        BigDecimal bigDecimal = $this$inc.add(BigDecimal.ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "add(...)");
        return bigDecimal;
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final BigDecimal dec(BigDecimal $this$dec) {
        Intrinsics.checkNotNullParameter($this$dec, "<this>");
        BigDecimal bigDecimal = $this$dec.subtract(BigDecimal.ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "subtract(...)");
        return bigDecimal;
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(long $this$toBigDecimal) {
        BigDecimal bigDecimal = BigDecimal.valueOf($this$toBigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "valueOf(...)");
        return bigDecimal;
    }

    @InlineOnly
    private static final BigDecimal plus(BigDecimal $this$plus, BigDecimal other) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimal = $this$plus.add(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "add(...)");
        return bigDecimal;
    }

    @InlineOnly
    private static final BigDecimal times(BigDecimal $this$times, BigDecimal other) {
        Intrinsics.checkNotNullParameter($this$times, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimal = $this$times.multiply(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "multiply(...)");
        return bigDecimal;
    }
}

