/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\tB\u0011\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\nB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\u0006\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "", "", "missingFields", "serialName", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "missingField", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "message", "", "cause", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/util/List;", "getMissingFields", "()Ljava/util/List;", "kotlinx-serialization-core"})
public final class MissingFieldException
extends SerializationException {
    @NotNull
    private final List<String> missingFields;

    public MissingFieldException(@NotNull String missingField, @NotNull String serialName) {
        Intrinsics.checkNotNullParameter(missingField, "missingField");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required for type with serial name '" + serialName + "', but it was missing", null);
    }

    @NotNull
    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    public MissingFieldException(@NotNull List<String> missingFields, @NotNull String serialName) {
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this(missingFields, missingFields.size() == 1 ? "Field '" + missingFields.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing" : "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    @PublishedApi
    public MissingFieldException(@NotNull String missingField) {
        Intrinsics.checkNotNullParameter(missingField, "missingField");
        this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required, but it was missing", null);
    }

    public MissingFieldException(@NotNull List<String> missingFields, @Nullable String message, @Nullable Throwable cause) {
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        super(message, cause);
        this.missingFields = missingFields;
    }
}

