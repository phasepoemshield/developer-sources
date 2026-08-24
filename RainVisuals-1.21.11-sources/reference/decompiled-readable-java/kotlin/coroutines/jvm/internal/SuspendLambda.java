/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bB!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u00a2\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Lkotlin/coroutines/jvm/internal/SuspendLambda;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/jvm/internal/FunctionBase;", "", "Lkotlin/coroutines/jvm/internal/SuspendFunction;", "", "arity", "<init>", "(I)V", "Lkotlin/coroutines/Continuation;", "completion", "(ILkotlin/coroutines/Continuation;)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract class SuspendLambda
extends ContinuationImpl
implements FunctionBase<Object>,
SuspendFunction {
    private final int arity;

    public SuspendLambda(int arity) {
        this(arity, null);
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    @NotNull
    public String toString() {
        String string;
        if (this.getCompletion() == null) {
            String string2 = Reflection.renderLambdaToString(this);
            string = string2;
            Intrinsics.checkNotNullExpressionValue(string2, "renderLambdaToString(...)");
        } else {
            string = super.toString();
        }
        return string;
    }

    public SuspendLambda(int arity, @Nullable Continuation<Object> completion) {
        super(completion);
        this.arity = arity;
    }
}

