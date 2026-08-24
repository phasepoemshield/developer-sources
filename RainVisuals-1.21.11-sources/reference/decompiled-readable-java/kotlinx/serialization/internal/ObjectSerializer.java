/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\n\u0010\u000bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010 \u00a8\u0006!"}, d2={"Lkotlinx/serialization/internal/ObjectSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "objectInstance", "", "", "classAnnotations", "<init>", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "", "_annotations", "Ljava/util/List;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Ljava/lang/Object;", "kotlinx-serialization-core"})
@PublishedApi
public final class ObjectSerializer<T>
implements KSerializer<T> {
    @NotNull
    private final Lazy descriptor$delegate;
    @NotNull
    private final T objectInstance;
    @NotNull
    private List<? extends Annotation> _annotations;

    @PublishedApi
    public ObjectSerializer(@NotNull String serialName, @NotNull T objectInstance, @NotNull Annotation[] classAnnotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this(serialName, objectInstance);
        this._annotations = ArraysKt.asList(classAnnotations);
    }

    public ObjectSerializer(@NotNull String serialName, @NotNull T objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0)new Function0<SerialDescriptor>(serialName, this){
            final /* synthetic */ ObjectSerializer<T> this$0;
            final /* synthetic */ String $serialName;
            {
                this.$serialName = $serialName;
                this.this$0 = $receiver;
                super(0);
            }

            @NotNull
            public final SerialDescriptor invoke() {
                return SerialDescriptorsKt.buildSerialDescriptor(this.$serialName, StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], (Function1<? super ClassSerialDescriptorBuilder, Unit>)new Function1<ClassSerialDescriptorBuilder, Unit>(this.this$0){
                    final /* synthetic */ ObjectSerializer<T> this$0;
                    {
                        this.this$0 = $receiver;
                        super(1);
                    }

                    public final void invoke(@NotNull ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
                        Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
                        $this$buildSerialDescriptor.setAnnotations(ObjectSerializer.access$get_annotations$p(this.this$0));
                    }
                });
            }
        });
    }

    public static final /* synthetic */ List access$get_annotations$p(ObjectSerializer $this) {
        return $this._annotations;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        void $this$decodeStructure$iv;
        CompositeDecoder composite$iv;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Decoder decoder2 = decoder;
        SerialDescriptor descriptor$iv = this.getDescriptor();
        boolean $i$f$decodeStructure = false;
        CompositeDecoder $this$deserialize_u24lambda_u240 = composite$iv = $this$decodeStructure$iv.beginStructure(descriptor$iv);
        boolean bl = false;
        if (!$this$deserialize_u24lambda_u240.decodeSequentially()) {
            int index = $this$deserialize_u24lambda_u240.decodeElementIndex(this.getDescriptor());
            if (index != -1) {
                throw new SerializationException("Unexpected index " + index);
            }
        }
        Unit result$iv = Unit.INSTANCE;
        composite$iv.endStructure(descriptor$iv);
        return this.objectInstance;
    }

    @Override
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.beginStructure(this.getDescriptor()).endStructure(this.getDescriptor());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        Lazy lazy = this.descriptor$delegate;
        return (SerialDescriptor)lazy.getValue();
    }
}

