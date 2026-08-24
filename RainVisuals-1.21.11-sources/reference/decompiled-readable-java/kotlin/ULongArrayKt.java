/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\u000b\u001a\u00020\u00052\n\u0010\b\u001a\u00020\u0005\"\u00020\u0003H\u0087\b\u00a2\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\f"}, d2={"", "size", "Lkotlin/Function1;", "Lkotlin/ULong;", "init", "Lkotlin/ULongArray;", "ULongArray", "(ILkotlin/jvm/functions/Function1;)[J", "elements", "ulongArrayOf-QwZRm1k", "([J)[J", "ulongArrayOf", "kotlin-stdlib"})
public final class ULongArrayKt {
    @InlineOnly
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    private static final long[] ulongArrayOf-QwZRm1k(long ... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final long[] ULongArray(int size, Function1<? super Integer, ULong> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        int n = 0;
        long[] lArray = new long[size];
        while (n < size) {
            int n2 = n++;
            lArray[n2] = init.invoke((Integer)n2).unbox-impl();
        }
        return ULongArray.constructor-impl(lArray);
    }
}

