/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lkotlinx/serialization/StringFormat;", "Lkotlinx/serialization/SerialFormat;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "", "string", "decodeFromString", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "encodeToString", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "kotlinx-serialization-core"})
public interface StringFormat
extends SerialFormat {
    @NotNull
    public <T> String encodeToString(@NotNull SerializationStrategy<? super T> var1, T var2);

    public <T> T decodeFromString(@NotNull DeserializationStrategy<? extends T> var1, @NotNull String var2);
}

