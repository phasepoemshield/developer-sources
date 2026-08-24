/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0007\u00a8\u0006\b"}, d2={"Lkotlinx/serialization/internal/CacheEntry;", "T", "", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"})
final class CacheEntry<T> {
    @JvmField
    @Nullable
    public final KSerializer<T> serializer;

    public CacheEntry(@Nullable KSerializer<T> serializer2) {
        this.serializer = serializer2;
    }
}

