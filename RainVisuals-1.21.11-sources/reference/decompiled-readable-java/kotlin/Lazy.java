/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00028\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2={"Lkotlin/Lazy;", "T", "", "", "isInitialized", "()Z", "getValue", "()Ljava/lang/Object;", "value", "kotlin-stdlib"})
public interface Lazy<T> {
    public T getValue();

    public boolean isInitialized();
}

