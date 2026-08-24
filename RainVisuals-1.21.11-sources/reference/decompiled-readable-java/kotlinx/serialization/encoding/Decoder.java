/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H&\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H'\u00a2\u0006\u0004\b!\u0010\tJ\u0011\u0010#\u001a\u0004\u0018\u00010\"H'\u00a2\u0006\u0004\b#\u0010$J+\u0010(\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010%*\u00020\u00012\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000&H\u0017\u00a2\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016\u00a2\u0006\u0004\b*\u0010)J\u000f\u0010,\u001a\u00020+H&\u00a2\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H&\u00a2\u0006\u0004\b/\u00100R\u0014\u00104\u001a\u0002018&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00103\u00a8\u00065"}, d2={"Lkotlinx/serialization/encoding/Decoder;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "decodeBoolean", "()Z", "", "decodeByte", "()B", "", "decodeChar", "()C", "", "decodeDouble", "()D", "enumDescriptor", "", "decodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "decodeFloat", "()F", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeInt", "()I", "", "decodeLong", "()J", "decodeNotNullMark", "", "decodeNull", "()Ljava/lang/Void;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeNullableSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeSerializableValue", "", "decodeShort", "()S", "", "decodeString", "()Ljava/lang/String;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "kotlinx-serialization-core"})
public interface Decoder {
    public int decodeEnum(@NotNull SerialDescriptor var1);

    @ExperimentalSerializationApi
    public boolean decodeNotNullMark();

    public byte decodeByte();

    public float decodeFloat();

    public short decodeShort();

    @ExperimentalSerializationApi
    @Nullable
    public Void decodeNull();

    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor var1);

    public double decodeDouble();

    @ExperimentalSerializationApi
    @Nullable
    public <T> T decodeNullableSerializableValue(@NotNull DeserializationStrategy<? extends T> var1);

    public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> var1);

    public int decodeInt();

    @NotNull
    public SerializersModule getSerializersModule();

    public long decodeLong();

    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor var1);

    @NotNull
    public String decodeString();

    public boolean decodeBoolean();

    public char decodeChar();

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        public static <T> T decodeSerializableValue(@NotNull Decoder $this, @NotNull DeserializationStrategy<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return deserializer.deserialize($this);
        }

        /*
         * Enabled aggressive block sorting
         */
        @ExperimentalSerializationApi
        @Nullable
        public static <T> T decodeNullableSerializableValue(@NotNull Decoder $this, @NotNull DeserializationStrategy<? extends T> deserializer) {
            Object object;
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            Decoder $this$decodeIfNullable$iv = $this;
            boolean $i$f$decodeIfNullable = false;
            boolean isNullabilitySupported$iv = deserializer.getDescriptor().isNullable();
            if (!isNullabilitySupported$iv) {
                if (!$this$decodeIfNullable$iv.decodeNotNullMark()) {
                    object = $this$decodeIfNullable$iv.decodeNull();
                    return object;
                }
            }
            boolean bl = false;
            object = $this.decodeSerializableValue(deserializer);
            return object;
        }
    }
}

