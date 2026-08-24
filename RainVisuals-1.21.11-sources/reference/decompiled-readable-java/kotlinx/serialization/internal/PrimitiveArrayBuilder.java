/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0000\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00028\u0000H \u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\bH \u00a2\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\b8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2={"Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Array", "", "<init>", "()V", "build$kotlinx_serialization_core", "()Ljava/lang/Object;", "build", "", "requiredCapacity", "", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "getPosition$kotlinx_serialization_core", "()I", "position", "kotlinx-serialization-core"})
@PublishedApi
public abstract class PrimitiveArrayBuilder<Array> {
    public static /* synthetic */ void ensureCapacity$kotlinx_serialization_core$default(PrimitiveArrayBuilder primitiveArrayBuilder, int n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((n2 & 1) != 0) {
            n = primitiveArrayBuilder.getPosition$kotlinx_serialization_core() + 1;
        }
        primitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core(n);
    }

    public abstract Array build$kotlinx_serialization_core();

    public abstract int getPosition$kotlinx_serialization_core();

    public abstract void ensureCapacity$kotlinx_serialization_core(int var1);
}

