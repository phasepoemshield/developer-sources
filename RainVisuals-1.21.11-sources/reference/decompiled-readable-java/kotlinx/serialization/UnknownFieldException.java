/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0004\u0010\b\u00a8\u0006\t"}, d2={"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", "", "index", "<init>", "(I)V", "", "message", "(Ljava/lang/String;)V", "kotlinx-serialization-core"})
@PublishedApi
public final class UnknownFieldException
extends SerializationException {
    public UnknownFieldException(@Nullable String message) {
        super(message);
    }

    public UnknownFieldException(int index) {
        this("An unknown field for index " + index);
    }
}

