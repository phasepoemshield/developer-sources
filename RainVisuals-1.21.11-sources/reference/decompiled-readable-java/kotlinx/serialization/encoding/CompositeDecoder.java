/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 62\u00020\u0001:\u00016J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0014\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u001e\u0010\u001fJG\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010 *\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00018\u0000H'\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\b&\u0010'J?\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0004\b(\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b0\u00101R\u0014\u00105\u001a\u0002028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u00104\u00a8\u00067"}, d2={"Lkotlinx/serialization/encoding/CompositeDecoder;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "decodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "", "decodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "", "decodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "decodeCollectionSize", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "decodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "decodeElementIndex", "", "decodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "Lkotlinx/serialization/encoding/Decoder;", "decodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "decodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "", "decodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "decodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeSequentially", "()Z", "decodeSerializableElement", "", "decodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "", "decodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Companion", "kotlinx-serialization-core"})
public interface CompositeDecoder {
    @NotNull
    public static final Companion Companion = kotlinx.serialization.encoding.CompositeDecoder$Companion.$$INSTANCE;
    public static final int DECODE_DONE = -1;
    public static final int UNKNOWN_NAME = -3;

    public char decodeCharElement(@NotNull SerialDescriptor var1, int var2);

    @NotNull
    public String decodeStringElement(@NotNull SerialDescriptor var1, int var2);

    public int decodeCollectionSize(@NotNull SerialDescriptor var1);

    public <T> T decodeSerializableElement(@NotNull SerialDescriptor var1, int var2, @NotNull DeserializationStrategy<? extends T> var3, @Nullable T var4);

    @ExperimentalSerializationApi
    @Nullable
    public <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor var1, int var2, @NotNull DeserializationStrategy<? extends T> var3, @Nullable T var4);

    public int decodeElementIndex(@NotNull SerialDescriptor var1);

    @ExperimentalSerializationApi
    public boolean decodeSequentially();

    public boolean decodeBooleanElement(@NotNull SerialDescriptor var1, int var2);

    public short decodeShortElement(@NotNull SerialDescriptor var1, int var2);

    public int decodeIntElement(@NotNull SerialDescriptor var1, int var2);

    @NotNull
    public Decoder decodeInlineElement(@NotNull SerialDescriptor var1, int var2);

    public byte decodeByteElement(@NotNull SerialDescriptor var1, int var2);

    @NotNull
    public SerializersModule getSerializersModule();

    public double decodeDoubleElement(@NotNull SerialDescriptor var1, int var2);

    public void endStructure(@NotNull SerialDescriptor var1);

    public float decodeFloatElement(@NotNull SerialDescriptor var1, int var2);

    public long decodeLongElement(@NotNull SerialDescriptor var1, int var2);

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        public static int decodeCollectionSize(@NotNull CompositeDecoder $this, @NotNull SerialDescriptor descriptor2) {
            Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
            return -1;
        }

        public static /* synthetic */ Object decodeNullableSerializableElement$default(CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor, int n, DeserializationStrategy deserializationStrategy, Object object, int n2, Object object2) {
            if (object2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
            }
            if ((n2 & 8) != 0) {
                object = null;
            }
            return compositeDecoder.decodeNullableSerializableElement(serialDescriptor, n, deserializationStrategy, object);
        }

        public static /* synthetic */ Object decodeSerializableElement$default(CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor, int n, DeserializationStrategy deserializationStrategy, Object object, int n2, Object object2) {
            if (object2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((n2 & 8) != 0) {
                object = null;
            }
            return compositeDecoder.decodeSerializableElement(serialDescriptor, n, deserializationStrategy, object);
        }

        @ExperimentalSerializationApi
        public static boolean decodeSequentially(@NotNull CompositeDecoder $this) {
            return false;
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0006\u00a8\u0006\b"}, d2={"Lkotlinx/serialization/encoding/CompositeDecoder$Companion;", "", "<init>", "()V", "", "DECODE_DONE", "I", "UNKNOWN_NAME", "kotlinx-serialization-core"})
    public static final class Companion {
        public static final int UNKNOWN_NAME = -3;
        static final /* synthetic */ Companion $$INSTANCE;
        public static final int DECODE_DONE = -1;

        private Companion() {
        }

        static {
            $$INSTANCE = new Companion();
        }
    }
}

