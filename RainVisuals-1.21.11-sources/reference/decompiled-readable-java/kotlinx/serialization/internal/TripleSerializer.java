/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.TuplesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2={"Lkotlinx/serialization/internal/TripleSerializer;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Lkotlin/Triple;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "composite", "decodeSequentially", "(Lkotlinx/serialization/encoding/CompositeDecoder;)Lkotlin/Triple;", "decodeStructure", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlin/Triple;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlin/Triple;)V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"})
@PublishedApi
public final class TripleSerializer<A, B, C>
implements KSerializer<Triple<? extends A, ? extends B, ? extends C>> {
    @NotNull
    private final KSerializer<B> bSerializer;
    @NotNull
    private final KSerializer<C> cSerializer;
    @NotNull
    private final SerialDescriptor descriptor;
    @NotNull
    private final KSerializer<A> aSerializer;

    @Override
    @NotNull
    public Triple<A, B, C> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        CompositeDecoder composite = decoder.beginStructure(this.getDescriptor());
        if (composite.decodeSequentially()) {
            return this.decodeSequentially(composite);
        }
        return this.decodeStructure(composite);
    }

    public static final /* synthetic */ KSerializer access$getASerializer$p(TripleSerializer $this) {
        return $this.aSerializer;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void serialize(@NotNull Encoder encoder, @NotNull Triple<? extends A, ? extends B, ? extends C> value) {
        void var3_3;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        CompositeEncoder structuredEncoder = encoder.beginStructure(this.getDescriptor());
        structuredEncoder.encodeSerializableElement(this.getDescriptor(), 0, (SerializationStrategy)this.aSerializer, value.getFirst());
        structuredEncoder.encodeSerializableElement(this.getDescriptor(), 1, (SerializationStrategy)this.bSerializer, value.getSecond());
        structuredEncoder.encodeSerializableElement(this.getDescriptor(), 2, (SerializationStrategy)this.cSerializer, value.getThird());
        var3_3.endStructure(this.getDescriptor());
    }

    /*
     * WARNING - void declaration
     */
    private final Triple<A, B, C> decodeSequentially(CompositeDecoder composite) {
        void var4_4;
        void var3_3;
        void var2_2;
        Object a2 = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.getDescriptor(), 0, this.aSerializer, null, 8, null);
        Object b2 = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.getDescriptor(), 1, this.bSerializer, null, 8, null);
        Object c = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.getDescriptor(), 2, this.cSerializer, null, 8, null);
        composite.endStructure(this.getDescriptor());
        return new Triple<void, void, void>(var2_2, var3_3, var4_4);
    }

    public static final /* synthetic */ KSerializer access$getCSerializer$p(TripleSerializer $this) {
        return $this.cSerializer;
    }

    public TripleSerializer(@NotNull KSerializer<A> aSerializer, @NotNull KSerializer<B> bSerializer, @NotNull KSerializer<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.aSerializer = aSerializer;
        this.bSerializer = bSerializer;
        this.cSerializer = cSerializer;
        this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Triple", new SerialDescriptor[0], (Function1<? super ClassSerialDescriptorBuilder, Unit>)new Function1<ClassSerialDescriptorBuilder, Unit>(this){
            final /* synthetic */ TripleSerializer<A, B, C> this$0;

            public final void invoke(@NotNull ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
                Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "first", TripleSerializer.access$getASerializer$p(this.this$0).getDescriptor(), null, false, 12, null);
                ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "second", TripleSerializer.access$getBSerializer$p(this.this$0).getDescriptor(), null, false, 12, null);
                ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "third", TripleSerializer.access$getCSerializer$p(this.this$0).getDescriptor(), null, false, 12, null);
            }
            {
                this.this$0 = $receiver;
                super(1);
            }
        });
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public static final /* synthetic */ KSerializer access$getBSerializer$p(TripleSerializer $this) {
        return $this.bSerializer;
    }

    private final Triple<A, B, C> decodeStructure(CompositeDecoder composite) {
        Object a2 = TuplesKt.access$getNULL$p();
        Object b2 = TuplesKt.access$getNULL$p();
        Object c = TuplesKt.access$getNULL$p();
        block6: while (true) {
            int index = composite.decodeElementIndex(this.getDescriptor());
            switch (index) {
                case -1: {
                    break block6;
                }
                case 0: {
                    a2 = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.getDescriptor(), 0, this.aSerializer, null, 8, null);
                    continue block6;
                }
                case 1: {
                    b2 = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.getDescriptor(), 1, this.bSerializer, null, 8, null);
                    continue block6;
                }
                case 2: {
                    c = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(composite, this.getDescriptor(), 2, this.cSerializer, null, 8, null);
                    continue block6;
                }
                default: {
                    throw new SerializationException("Unexpected index " + index);
                }
            }
            break;
        }
        composite.endStructure(this.getDescriptor());
        if (a2 == TuplesKt.access$getNULL$p()) {
            throw new SerializationException("Element 'first' is missing");
        }
        if (b2 == TuplesKt.access$getNULL$p()) {
            throw new SerializationException("Element 'second' is missing");
        }
        if (c == TuplesKt.access$getNULL$p()) {
            throw new SerializationException("Element 'third' is missing");
        }
        return new Triple<Object, Object, Object>(a2, b2, c);
    }
}

