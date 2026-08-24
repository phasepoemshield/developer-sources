/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000:\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b\u00a2\u0006\u0004\b\u0001\u0010\u0005\u001a:\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00a2\u0006\u0004\b\u000b\u0010\f\u001a4\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\r2\u0006\u0010\u0013\u001a\u00028\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u00a2\u0006\u0002\b\u0014H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a>\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0012*\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0017\u0010\u0016\u001aC\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0012*\u00028\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\b\u0014H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0018\u0010\u0016\u001aD\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\r*\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0019\u0010\u0016\u001aI\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\r*\u00028\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u00a2\u0006\u0002\b\u0014H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0010\u0010\u0016\u001a@\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0012*\u00028\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u001c\u0010\u0016\u001a@\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0012*\u00028\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\bH\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u001d\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001e"}, d2={"", "TODO", "()Ljava/lang/Void;", "", "reason", "(Ljava/lang/String;)Ljava/lang/Void;", "", "times", "Lkotlin/Function1;", "", "action", "repeat", "(ILkotlin/jvm/functions/Function1;)V", "R", "Lkotlin/Function0;", "block", "run", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/ExtensionFunctionType;", "with", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "also", "apply", "let", "", "predicate", "takeIf", "takeUnless", "kotlin-stdlib"}, xs="kotlin/StandardKt")
class StandardKt__StandardKt {
    @InlineOnly
    private static final <T> T apply(T $this$apply, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke($this$apply);
        return $this$apply;
    }

    @InlineOnly
    private static final Void TODO(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        throw new NotImplementedError("An operation is not implemented: " + reason);
    }

    @InlineOnly
    private static final <T, R> R let(T $this$let, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke($this$let);
    }

    @InlineOnly
    private static final void repeat(int times, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        for (int index = 0; index < times; ++index) {
            action.invoke((Integer)index);
        }
    }

    @InlineOnly
    private static final Void TODO() {
        throw new NotImplementedError(null, 1, null);
    }

    @InlineOnly
    private static final <T, R> R with(T receiver, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(receiver);
    }

    @InlineOnly
    private static final <R> R run(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke();
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final <T> T also(T $this$also, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke($this$also);
        return $this$also;
    }

    @InlineOnly
    private static final <T, R> R run(T $this$run, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke($this$run);
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final <T> T takeUnless(T $this$takeUnless, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (T)(!predicate.invoke($this$takeUnless).booleanValue() ? $this$takeUnless : null);
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final <T> T takeIf(T $this$takeIf, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (T)(predicate.invoke($this$takeIf).booleanValue() ? $this$takeIf : null);
    }
}

