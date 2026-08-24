/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\f\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0087\b\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"", "", "hashCode", "(Ljava/lang/Object;)I", "kotlin-stdlib"})
public final class HashCodeKt {
    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final int hashCode(Object $this$hashCode) {
        Object object = $this$hashCode;
        return object != null ? object.hashCode() : 0;
    }
}

