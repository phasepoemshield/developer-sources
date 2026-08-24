/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH&\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0011H&\u00a2\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014H&\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001cH&\u00a2\u0006\u0004\b\u001d\u0010\u001eJA\u0010\"\u001a\u00020\b\"\b\b\u0000\u0010\u001f*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H'\u00a2\u0006\u0004\b\"\u0010#J;\u0010$\u001a\u00020\b\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0004\b$\u0010#J'\u0010&\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020%H&\u00a2\u0006\u0004\b&\u0010'J'\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020(H&\u00a2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u00101\u00a8\u00063"}, d2={"Lkotlinx/serialization/encoding/CompositeEncoder;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "value", "", "encodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "", "encodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "", "encodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "", "encodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "", "encodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "Lkotlinx/serialization/encoding/Encoder;", "encodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "encodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "", "encodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeSerializableElement", "", "encodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "", "encodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "shouldEncodeElementDefault", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "kotlinx-serialization-core"})
public interface CompositeEncoder {
    public void encodeStringElement(@NotNull SerialDescriptor var1, int var2, @NotNull String var3);

    @ExperimentalSerializationApi
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor var1, int var2);

    public void encodeShortElement(@NotNull SerialDescriptor var1, int var2, short var3);

    public <T> void encodeSerializableElement(@NotNull SerialDescriptor var1, int var2, @NotNull SerializationStrategy<? super T> var3, T var4);

    public void endStructure(@NotNull SerialDescriptor var1);

    public void encodeByteElement(@NotNull SerialDescriptor var1, int var2, byte var3);

    @NotNull
    public SerializersModule getSerializersModule();

    public void encodeFloatElement(@NotNull SerialDescriptor var1, int var2, float var3);

    public void encodeLongElement(@NotNull SerialDescriptor var1, int var2, long var3);

    @ExperimentalSerializationApi
    public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor var1, int var2, @NotNull SerializationStrategy<? super T> var3, @Nullable T var4);

    public void encodeCharElement(@NotNull SerialDescriptor var1, int var2, char var3);

    public void encodeDoubleElement(@NotNull SerialDescriptor var1, int var2, double var3);

    @NotNull
    public Encoder encodeInlineElement(@NotNull SerialDescriptor var1, int var2);

    public void encodeBooleanElement(@NotNull SerialDescriptor var1, int var2, boolean var3);

    public void encodeIntElement(@NotNull SerialDescriptor var1, int var2, int var3);

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @ExperimentalSerializationApi
        public static boolean shouldEncodeElementDefault(@NotNull CompositeEncoder $this, @NotNull SerialDescriptor descriptor2, int index) {
            Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
            return true;
        }
    }
}

