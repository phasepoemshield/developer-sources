/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0010H&\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0013H&\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0016H&\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u001dH&\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\f\u001a\u00020$H&\u00a2\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0017\u00a2\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\rH'\u00a2\u0006\u0004\b)\u0010(J1\u0010-\u001a\u00020\r\"\b\b\u0000\u0010**\u00020\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0004\b-\u0010.J+\u0010/\u001a\u00020\r\"\u0004\b\u0000\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b/\u0010.J\u0017\u00101\u001a\u00020\r2\u0006\u0010\f\u001a\u000200H&\u00a2\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\r2\u0006\u0010\f\u001a\u000203H&\u00a2\u0006\u0004\b4\u00105R\u0014\u00109\u001a\u0002068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u00108\u00a8\u0006:"}, d2={"Lkotlinx/serialization/encoding/Encoder;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "collectionSize", "Lkotlinx/serialization/encoding/CompositeEncoder;", "beginCollection", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/CompositeEncoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;", "", "value", "", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeChar", "(C)V", "", "encodeDouble", "(D)V", "enumDescriptor", "index", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "", "encodeFloat", "(F)V", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "encodeNotNullMark", "()V", "encodeNull", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeNullableSerializableValue", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeSerializableValue", "", "encodeShort", "(S)V", "", "encodeString", "(Ljava/lang/String;)V", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "kotlinx-serialization-core"})
public interface Encoder {
    @NotNull
    public CompositeEncoder beginStructure(@NotNull SerialDescriptor var1);

    @ExperimentalSerializationApi
    public void encodeNull();

    public void encodeEnum(@NotNull SerialDescriptor var1, int var2);

    @ExperimentalSerializationApi
    public <T> void encodeNullableSerializableValue(@NotNull SerializationStrategy<? super T> var1, @Nullable T var2);

    public void encodeByte(byte var1);

    public void encodeShort(short var1);

    public void encodeLong(long var1);

    public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> var1, T var2);

    public void encodeFloat(float var1);

    public void encodeString(@NotNull String var1);

    public void encodeBoolean(boolean var1);

    public void encodeChar(char var1);

    @ExperimentalSerializationApi
    public void encodeNotNullMark();

    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor var1);

    public void encodeDouble(double var1);

    public void encodeInt(int var1);

    @NotNull
    public SerializersModule getSerializersModule();

    @NotNull
    public CompositeEncoder beginCollection(@NotNull SerialDescriptor var1, int var2);

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @NotNull
        public static CompositeEncoder beginCollection(@NotNull Encoder $this, @NotNull SerialDescriptor descriptor2, int collectionSize) {
            Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
            return $this.beginStructure(descriptor2);
        }

        @ExperimentalSerializationApi
        public static void encodeNotNullMark(@NotNull Encoder $this) {
        }

        @ExperimentalSerializationApi
        public static <T> void encodeNullableSerializableValue(@NotNull Encoder $this, @NotNull SerializationStrategy<? super T> serializer2, @Nullable T value) {
            Intrinsics.checkNotNullParameter(serializer2, "serializer");
            boolean isNullabilitySupported = serializer2.getDescriptor().isNullable();
            if (isNullabilitySupported) {
                $this.encodeSerializableValue(serializer2, value);
                return;
            }
            if (value == null) {
                $this.encodeNull();
            } else {
                $this.encodeNotNullMark();
                $this.encodeSerializableValue(serializer2, value);
            }
        }

        public static <T> void encodeSerializableValue(@NotNull Encoder $this, @NotNull SerializationStrategy<? super T> serializer2, T value) {
            Intrinsics.checkNotNullParameter(serializer2, "serializer");
            serializer2.serialize($this, value);
        }
    }
}

