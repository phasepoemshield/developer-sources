/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlinx.serialization.BinaryFormat;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.internal.InternalHexConverter;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b\u00a2\u0006\u0004\b\b\u0010\t\u001a-\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\f\u001a$\u0010\u000f\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\b\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a$\u0010\u0012\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a$\u0010\u0014\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0014\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0011\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b\u00a2\u0006\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"T", "Lkotlinx/serialization/BinaryFormat;", "", "bytes", "decodeFromByteArray", "(Lkotlinx/serialization/BinaryFormat;[B)Ljava/lang/Object;", "", "hex", "decodeFromHexString", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/StringFormat;", "string", "decodeFromString", "(Lkotlinx/serialization/StringFormat;Ljava/lang/String;)Ljava/lang/Object;", "value", "encodeToByteArray", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)[B", "encodeToHexString", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "encodeToString", "(Lkotlinx/serialization/StringFormat;Ljava/lang/Object;)Ljava/lang/String;", "kotlinx-serialization-core"})
public final class SerialFormatKt {
    @NotNull
    public static final <T> String encodeToHexString(@NotNull BinaryFormat $this$encodeToHexString, @NotNull SerializationStrategy<? super T> serializer2, T value) {
        Intrinsics.checkNotNullParameter($this$encodeToHexString, "<this>");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        return InternalHexConverter.INSTANCE.printHexBinary($this$encodeToHexString.encodeToByteArray(serializer2, value), true);
    }

    public static final /* synthetic */ <T> T decodeFromByteArray(BinaryFormat $this$decodeFromByteArray, byte[] bytes) {
        Intrinsics.checkNotNullParameter($this$decodeFromByteArray, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        boolean $i$f$decodeFromByteArray = false;
        SerializersModule serializersModule = $this$decodeFromByteArray.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return $this$decodeFromByteArray.decodeFromByteArray((DeserializationStrategy)SerializersKt.serializer(serializersModule, null), bytes);
    }

    /*
     * WARNING - void declaration
     */
    public static final /* synthetic */ <T> T decodeFromHexString(BinaryFormat $this$decodeFromHexString, String hex) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$decodeFromHexString, "<this>");
        Intrinsics.checkNotNullParameter(hex, "hex");
        boolean $i$f$decodeFromHexString = false;
        SerializersModule serializersModule = $this$decodeFromHexString.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return SerialFormatKt.decodeFromHexString($this$decodeFromHexString, (DeserializationStrategy)SerializersKt.serializer(serializersModule, null), (String)var1_1);
    }

    /*
     * WARNING - void declaration
     */
    public static final /* synthetic */ <T> String encodeToHexString(BinaryFormat $this$encodeToHexString, T value) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$encodeToHexString, "<this>");
        boolean $i$f$encodeToHexString = false;
        SerializersModule serializersModule = $this$encodeToHexString.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return SerialFormatKt.encodeToHexString($this$encodeToHexString, (SerializationStrategy)SerializersKt.serializer(serializersModule, null), var1_1);
    }

    public static final /* synthetic */ <T> String encodeToString(StringFormat $this$encodeToString, T value) {
        Intrinsics.checkNotNullParameter($this$encodeToString, "<this>");
        boolean $i$f$encodeToString = false;
        SerializersModule serializersModule = $this$encodeToString.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return $this$encodeToString.encodeToString((SerializationStrategy)SerializersKt.serializer(serializersModule, null), value);
    }

    public static final <T> T decodeFromHexString(@NotNull BinaryFormat $this$decodeFromHexString, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull String hex) {
        Intrinsics.checkNotNullParameter($this$decodeFromHexString, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(hex, "hex");
        return $this$decodeFromHexString.decodeFromByteArray(deserializer, InternalHexConverter.INSTANCE.parseHexBinary(hex));
    }

    public static final /* synthetic */ <T> T decodeFromString(StringFormat $this$decodeFromString, String string) {
        Intrinsics.checkNotNullParameter($this$decodeFromString, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        boolean $i$f$decodeFromString = false;
        SerializersModule serializersModule = $this$decodeFromString.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return $this$decodeFromString.decodeFromString((DeserializationStrategy)SerializersKt.serializer(serializersModule, null), string);
    }

    public static final /* synthetic */ <T> byte[] encodeToByteArray(BinaryFormat $this$encodeToByteArray, T value) {
        Intrinsics.checkNotNullParameter($this$encodeToByteArray, "<this>");
        boolean $i$f$encodeToByteArray = false;
        SerializersModule serializersModule = $this$encodeToByteArray.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return $this$encodeToByteArray.encodeToByteArray((SerializationStrategy)SerializersKt.serializer(serializersModule, null), value);
    }
}

