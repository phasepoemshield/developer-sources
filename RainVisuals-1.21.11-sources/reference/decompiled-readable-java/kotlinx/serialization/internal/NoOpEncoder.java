/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b \u0010\u0003J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020!H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020$H\u0016\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020'H\u0016\u00a2\u0006\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u00a8\u0006/"}, d2={"Lkotlinx/serialization/internal/NoOpEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "<init>", "()V", "", "value", "", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeChar", "(C)V", "", "encodeDouble", "(D)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "", "index", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "", "encodeFloat", "(F)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "encodeNull", "", "encodeShort", "(S)V", "", "encodeString", "(Ljava/lang/String;)V", "", "encodeValue", "(Ljava/lang/Object;)V", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "kotlinx-serialization-core"})
public final class NoOpEncoder
extends AbstractEncoder {
    @NotNull
    private static final SerializersModule serializersModule;
    @NotNull
    public static final NoOpEncoder INSTANCE;

    @Override
    public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
    }

    @Override
    public void encodeValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override
    public void encodeInt(int value) {
    }

    private NoOpEncoder() {
    }

    @Override
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    static {
        INSTANCE = new NoOpEncoder();
        serializersModule = SerializersModuleBuildersKt.EmptySerializersModule();
    }

    @Override
    @NotNull
    public SerializersModule getSerializersModule() {
        return serializersModule;
    }

    @Override
    public void encodeBoolean(boolean value) {
    }

    @Override
    public void encodeDouble(double value) {
    }

    @Override
    public void encodeChar(char value) {
    }

    @Override
    public void encodeLong(long value) {
    }

    @Override
    public void encodeByte(byte value) {
    }

    @Override
    public void encodeShort(short value) {
    }

    @Override
    public void encodeFloat(float value) {
    }

    @Override
    public void encodeNull() {
    }
}

