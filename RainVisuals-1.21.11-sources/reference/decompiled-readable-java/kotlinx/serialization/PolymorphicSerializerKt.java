/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.AbstractPolymorphicSerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\b\b\u0010\u000e\u00a8\u0006\u000f"}, d2={"", "T", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializer", "(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"})
public final class PolymorphicSerializerKt {
    @InternalSerializationApi
    @NotNull
    public static final <T> DeserializationStrategy<T> findPolymorphicSerializer(@NotNull AbstractPolymorphicSerializer<T> $this$findPolymorphicSerializer, @NotNull CompositeDecoder decoder, @Nullable String klassName) {
        Intrinsics.checkNotNullParameter($this$findPolymorphicSerializer, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        DeserializationStrategy<T> deserializationStrategy = $this$findPolymorphicSerializer.findPolymorphicSerializerOrNull(decoder, klassName);
        if (deserializationStrategy == null) {
            AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(klassName, $this$findPolymorphicSerializer.getBaseClass());
            throw new KotlinNothingValueException();
        }
        return deserializationStrategy;
    }

    @InternalSerializationApi
    @NotNull
    public static final <T> SerializationStrategy<T> findPolymorphicSerializer(@NotNull AbstractPolymorphicSerializer<T> $this$findPolymorphicSerializer, @NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter($this$findPolymorphicSerializer, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerializationStrategy<T> serializationStrategy = $this$findPolymorphicSerializer.findPolymorphicSerializerOrNull(encoder, value);
        if (serializationStrategy == null) {
            AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(Reflection.getOrCreateKotlinClass(value.getClass()), $this$findPolymorphicSerializer.getBaseClass());
            throw new KotlinNothingValueException();
        }
        return serializationStrategy;
    }
}

