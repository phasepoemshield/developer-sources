/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0004\b\n\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\t\u001a\u00020\b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010!\u00a8\u0006\""}, d2={"Lkotlinx/serialization/internal/EnumSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "", "values", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "createUnmarkedDescriptor", "(Ljava/lang/String;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "toString", "()Ljava/lang/String;", "descriptor$delegate", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "overriddenDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "[Ljava/lang/Enum;", "kotlinx-serialization-core"})
@PublishedApi
public final class EnumSerializer<T extends Enum<T>>
implements KSerializer<T> {
    @NotNull
    private final Lazy descriptor$delegate;
    @Nullable
    private SerialDescriptor overriddenDescriptor;
    @NotNull
    private final T[] values;

    @NotNull
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + this.getDescriptor().getSerialName() + '>';
    }

    @Override
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int index = ArraysKt.indexOf(this.values, value);
        if (index == -1) {
            StringBuilder stringBuilder = new StringBuilder().append(value).append(" is not a valid enum ").append(this.getDescriptor().getSerialName()).append(", must be one of ");
            String string = Arrays.toString(this.values);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            throw new SerializationException(stringBuilder.append(string).toString());
        }
        encoder.encodeEnum(this.getDescriptor(), index);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        void var2_2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int index = decoder.decodeEnum(this.getDescriptor());
        if (!(0 <= index ? index < this.values.length : false)) {
            throw new SerializationException(index + " is not among valid " + this.getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
        }
        return this.values[var2_2];
    }

    /*
     * WARNING - void declaration
     */
    private final SerialDescriptor createUnmarkedDescriptor(String serialName) {
        void var2_2;
        EnumDescriptor d = new EnumDescriptor(serialName, this.values.length);
        T[] $this$forEach$iv = this.values;
        boolean $i$f$forEach = false;
        int n = $this$forEach$iv.length;
        for (int i = 0; i < n; ++i) {
            T element$iv;
            T it = element$iv = $this$forEach$iv[i];
            boolean bl = false;
            PluginGeneratedSerialDescriptor.addElement$default(d, ((Enum)it).name(), false, 2, null);
        }
        return (SerialDescriptor)var2_2;
    }

    public static final /* synthetic */ SerialDescriptor access$createUnmarkedDescriptor(EnumSerializer $this, String serialName) {
        return $this.createUnmarkedDescriptor(serialName);
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        Lazy lazy = this.descriptor$delegate;
        return (SerialDescriptor)lazy.getValue();
    }

    public EnumSerializer(@NotNull String serialName, @NotNull T[] values2, @NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values2, "values");
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        this(serialName, (Enum[])values2);
        this.overriddenDescriptor = descriptor2;
    }

    public EnumSerializer(@NotNull String serialName, @NotNull T[] values2) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values2, "values");
        this.values = values2;
        this.descriptor$delegate = LazyKt.lazy((Function0)new Function0<SerialDescriptor>(this, serialName){
            final /* synthetic */ EnumSerializer<T> this$0;
            final /* synthetic */ String $serialName;

            @NotNull
            public final SerialDescriptor invoke() {
                SerialDescriptor serialDescriptor = EnumSerializer.access$getOverriddenDescriptor$p(this.this$0);
                if (serialDescriptor == null) {
                    serialDescriptor = EnumSerializer.access$createUnmarkedDescriptor(this.this$0, this.$serialName);
                }
                return serialDescriptor;
            }
            {
                this.this$0 = $receiver;
                this.$serialName = $serialName;
                super(0);
            }
        });
    }

    public static final /* synthetic */ SerialDescriptor access$getOverriddenDescriptor$p(EnumSerializer $this) {
        return $this.overriddenDescriptor;
    }
}

