/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aL\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\"\u0004\b\u0000\u0010\u00002\u001e\b\b\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0087\b\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"R", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "suspend", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"})
public final class SuspendKt {
    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final <R> Function1<Continuation<? super R>, Object> suspend(Function1<? super Continuation<? super R>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block;
    }
}

