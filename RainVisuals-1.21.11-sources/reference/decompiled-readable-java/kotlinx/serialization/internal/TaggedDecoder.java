/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0004\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0006\u00a2\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'\u00a2\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0011\u00a2\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b2\u00103J\r\u00105\u001a\u000204\u00a2\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b9\u0010\u0010J\u000f\u0010;\u001a\u0004\u0018\u00010:\u00a2\u0006\u0004\b;\u0010<JC\u0010B\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010>*\u00020=2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010?2\b\u0010A\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0004\bB\u0010CJ;\u0010D\u001a\u00028\u0001\"\u0004\b\u0001\u0010>2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00010?2\b\u0010A\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0004\bD\u0010CJ-\u0010E\u001a\u00028\u0001\"\u0004\b\u0001\u0010>2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00010?2\b\u0010A\u001a\u0004\u0018\u00018\u0001H\u0014\u00a2\u0006\u0004\bE\u0010FJ\r\u0010H\u001a\u00020G\u00a2\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020G2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\bJ\u0010KJ\r\u0010M\u001a\u00020L\u00a2\u0006\u0004\bM\u0010NJ\u001d\u0010O\u001a\u00020L2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00152\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u001f2\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bX\u0010YJ\u001f\u0010Z\u001a\u00020\u00112\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020'2\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\\\u0010]J\u001f\u0010_\u001a\u00020\u00022\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010^\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u00112\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u0002042\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\be\u0010SJ\u0019\u0010f\u001a\u0004\u0018\u00010:2\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020G2\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020L2\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020=2\u0006\u0010Q\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\u000b2\u0006\u0010r\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\bs\u0010tJ+\u0010x\u001a\u00028\u0001\"\u0004\b\u0001\u0010u2\u0006\u0010Q\u001a\u00028\u00002\f\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00010vH\u0002\u00a2\u0006\u0004\bx\u0010yJ\u001b\u0010z\u001a\u00028\u0000*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H$\u00a2\u0006\u0004\bz\u0010{R\u0014\u0010}\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b|\u0010qR\u0016\u0010\u007f\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b~\u0010qR\u0019\u0010\u0080\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018VX\u0096\u0004\u00a2\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R)\u0010\u0088\u0001\u001a\u0014\u0012\u0004\u0012\u00028\u00000\u0086\u0001j\t\u0012\u0004\u0012\u00028\u0000`\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u00a8\u0006\u008a\u0001"}, d2={"Lkotlinx/serialization/internal/TaggedDecoder;", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "other", "", "copyTagsTo", "(Lkotlinx/serialization/internal/TaggedDecoder;)V", "", "decodeBoolean", "()Z", "", "index", "decodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "", "decodeByte", "()B", "decodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "", "decodeChar", "()C", "decodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "", "decodeDouble", "()D", "decodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "enumDescriptor", "decodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "decodeFloat", "()F", "decodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "decodeInt", "()I", "decodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "", "decodeLong", "()J", "decodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "decodeNotNullMark", "", "decodeNull", "()Ljava/lang/Void;", "", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "decodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeSerializableElement", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "", "decodeShort", "()S", "decodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "", "decodeString", "()Ljava/lang/String;", "decodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "tag", "decodeTaggedBoolean", "(Ljava/lang/Object;)Z", "decodeTaggedByte", "(Ljava/lang/Object;)B", "decodeTaggedChar", "(Ljava/lang/Object;)C", "decodeTaggedDouble", "(Ljava/lang/Object;)D", "decodeTaggedEnum", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "decodeTaggedFloat", "(Ljava/lang/Object;)F", "inlineDescriptor", "decodeTaggedInline", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeTaggedInt", "(Ljava/lang/Object;)I", "decodeTaggedLong", "(Ljava/lang/Object;)J", "decodeTaggedNotNullMark", "decodeTaggedNull", "(Ljava/lang/Object;)Ljava/lang/Void;", "decodeTaggedShort", "(Ljava/lang/Object;)S", "decodeTaggedString", "(Ljava/lang/Object;)Ljava/lang/String;", "decodeTaggedValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "popTag", "()Ljava/lang/Object;", "name", "pushTag", "(Ljava/lang/Object;)V", "E", "Lkotlin/Function0;", "block", "tagBlock", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "getCurrentTag", "currentTag", "getCurrentTagOrNull", "currentTagOrNull", "flag", "Z", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "tagStack", "Ljava/util/ArrayList;", "kotlinx-serialization-core"})
@InternalSerializationApi
public abstract class TaggedDecoder<Tag>
implements Decoder,
CompositeDecoder {
    @NotNull
    private final ArrayList<Tag> tagStack = new ArrayList();
    private boolean flag;

    protected byte decodeTaggedByte(Tag tag) {
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Byte");
        return (Byte)object;
    }

    @Override
    @NotNull
    public final Decoder decodeInlineElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedInline(this.getTag(descriptor2, index), descriptor2.getElementDescriptor(index));
    }

    @Override
    @Nullable
    public final Void decodeNull() {
        return null;
    }

    @Override
    public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
        return Decoder.DefaultImpls.decodeSerializableValue(this, deserializer);
    }

    @Override
    public final short decodeShortElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedShort(this.getTag(descriptor2, index));
    }

    protected boolean decodeTaggedBoolean(Tag tag) {
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean)object;
    }

    @Override
    public final int decodeInt() {
        return this.decodeTaggedInt(this.popTag());
    }

    @Nullable
    protected Void decodeTaggedNull(Tag tag) {
        return null;
    }

    @Override
    @Nullable
    public final <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T)this.tagBlock(this.getTag(descriptor2, index), new Function0<T>(this, deserializer, previousValue){
            final /* synthetic */ T $previousValue;
            final /* synthetic */ TaggedDecoder<Tag> this$0;
            final /* synthetic */ DeserializationStrategy<T> $deserializer;
            {
                this.this$0 = $receiver;
                this.$deserializer = $deserializer;
                this.$previousValue = $previousValue;
                super(0);
            }

            /*
             * WARNING - void declaration
             * Enabled aggressive block sorting
             */
            @Nullable
            public final T invoke() {
                Void void_;
                void $this$decodeIfNullable$iv;
                void deserializer$iv;
                Decoder decoder = this.this$0;
                DeserializationStrategy<T> deserializationStrategy = this.$deserializer;
                TaggedDecoder<Tag> taggedDecoder = this.this$0;
                DeserializationStrategy<T> deserializationStrategy2 = this.$deserializer;
                T t = this.$previousValue;
                boolean $i$f$decodeIfNullable = false;
                boolean isNullabilitySupported$iv = deserializer$iv.getDescriptor().isNullable();
                if (!isNullabilitySupported$iv && !$this$decodeIfNullable$iv.decodeNotNullMark()) {
                    void_ = decoder.decodeNull();
                    return (T)void_;
                }
                boolean bl = false;
                void_ = taggedDecoder.decodeSerializableValue(deserializationStrategy2, t);
                return (T)void_;
            }
        });
    }

    /*
     * WARNING - void declaration
     */
    private final <E> E tagBlock(Tag tag, Function0<? extends E> block) {
        void var3_3;
        this.pushTag(tag);
        E r = block.invoke();
        if (!this.flag) {
            this.popTag();
        }
        this.flag = false;
        return var3_3;
    }

    protected <T> T decodeSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return this.decodeSerializableValue(deserializer);
    }

    @Override
    public final double decodeDoubleElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedDouble(this.getTag(descriptor2, index));
    }

    protected int decodeTaggedEnum(Tag tag, @NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
        return (Integer)object;
    }

    @Override
    public final float decodeFloatElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedFloat(this.getTag(descriptor2, index));
    }

    @Override
    public final boolean decodeBoolean() {
        return this.decodeTaggedBoolean(this.popTag());
    }

    protected double decodeTaggedDouble(Tag tag) {
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Double");
        return (Double)object;
    }

    @Override
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this;
    }

    protected boolean decodeTaggedNotNullMark(Tag tag) {
        return true;
    }

    @Override
    @ExperimentalSerializationApi
    @Nullable
    public <T> T decodeNullableSerializableValue(@NotNull DeserializationStrategy<? extends T> deserializer) {
        return Decoder.DefaultImpls.decodeNullableSerializableValue(this, deserializer);
    }

    @Override
    public int decodeCollectionSize(@NotNull SerialDescriptor descriptor2) {
        return CompositeDecoder.DefaultImpls.decodeCollectionSize(this, descriptor2);
    }

    protected final void copyTagsTo(@NotNull TaggedDecoder<Tag> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.tagStack.addAll((Collection)this.tagStack);
    }

    @Override
    public final double decodeDouble() {
        return this.decodeTaggedDouble(this.popTag());
    }

    @NotNull
    protected String decodeTaggedString(Tag tag) {
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
        return (String)object;
    }

    @Override
    public final boolean decodeBooleanElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedBoolean(this.getTag(descriptor2, index));
    }

    @Override
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedInline(this.popTag(), descriptor2);
    }

    @Override
    public final int decodeIntElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedInt(this.getTag(descriptor2, index));
    }

    @Override
    public final char decodeCharElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedChar(this.getTag(descriptor2, index));
    }

    @Override
    @NotNull
    public SerializersModule getSerializersModule() {
        return SerializersModuleBuildersKt.EmptySerializersModule();
    }

    @Override
    public void endStructure(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
    }

    protected final void pushTag(Tag name) {
        this.tagStack.add(name);
    }

    @Override
    public final <T> T decodeSerializableElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull DeserializationStrategy<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T)this.tagBlock(this.getTag(descriptor2, index), new Function0<T>(this, deserializer, previousValue){
            final /* synthetic */ DeserializationStrategy<T> $deserializer;
            final /* synthetic */ TaggedDecoder<Tag> this$0;
            final /* synthetic */ T $previousValue;

            public final T invoke() {
                return this.this$0.decodeSerializableValue(this.$deserializer, this.$previousValue);
            }
            {
                this.this$0 = $receiver;
                this.$deserializer = $deserializer;
                this.$previousValue = $previousValue;
                super(0);
            }
        });
    }

    @NotNull
    protected Decoder decodeTaggedInline(Tag tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        TaggedDecoder taggedDecoder = this;
        TaggedDecoder $this$decodeTaggedInline_u24lambda_u240 = taggedDecoder;
        boolean bl = false;
        $this$decodeTaggedInline_u24lambda_u240.pushTag(tag);
        return taggedDecoder;
    }

    protected final Tag getCurrentTag() {
        return (Tag)CollectionsKt.last((List)this.tagStack);
    }

    protected float decodeTaggedFloat(Tag tag) {
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Float");
        return ((Float)object).floatValue();
    }

    protected long decodeTaggedLong(Tag tag) {
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Long");
        return (Long)object;
    }

    @Override
    public final float decodeFloat() {
        return this.decodeTaggedFloat(this.popTag());
    }

    /*
     * WARNING - void declaration
     */
    protected final Tag popTag() {
        void var1_1;
        Tag r = this.tagStack.remove(CollectionsKt.getLastIndex((List)this.tagStack));
        this.flag = true;
        return var1_1;
    }

    @Override
    public final byte decodeByteElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedByte(this.getTag(descriptor2, index));
    }

    protected char decodeTaggedChar(Tag tag) {
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Char");
        return ((Character)object).charValue();
    }

    protected short decodeTaggedShort(Tag tag) {
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Short");
        return (Short)object;
    }

    @Override
    public boolean decodeNotNullMark() {
        Tag Tag = this.getCurrentTagOrNull();
        if (Tag == null) {
            return false;
        }
        Tag currentTag = Tag;
        return this.decodeTaggedNotNullMark(currentTag);
    }

    @Override
    @NotNull
    public final String decodeStringElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedString(this.getTag(descriptor2, index));
    }

    @Override
    @NotNull
    public final String decodeString() {
        return this.decodeTaggedString(this.popTag());
    }

    @Override
    public final char decodeChar() {
        return this.decodeTaggedChar(this.popTag());
    }

    protected abstract Tag getTag(@NotNull SerialDescriptor var1, int var2);

    @Override
    public final byte decodeByte() {
        return this.decodeTaggedByte(this.popTag());
    }

    protected int decodeTaggedInt(Tag tag) {
        Object object = this.decodeTaggedValue(tag);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
        return (Integer)object;
    }

    @Nullable
    protected final Tag getCurrentTagOrNull() {
        return (Tag)CollectionsKt.lastOrNull((List)this.tagStack);
    }

    @Override
    @ExperimentalSerializationApi
    public boolean decodeSequentially() {
        return CompositeDecoder.DefaultImpls.decodeSequentially(this);
    }

    @Override
    public final long decodeLongElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.decodeTaggedLong(this.getTag(descriptor2, index));
    }

    @Override
    public final long decodeLong() {
        return this.decodeTaggedLong(this.popTag());
    }

    @Override
    public final short decodeShort() {
        return this.decodeTaggedShort(this.popTag());
    }

    @Override
    public final int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return this.decodeTaggedEnum(this.popTag(), enumDescriptor);
    }

    @NotNull
    protected Object decodeTaggedValue(Tag tag) {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(this.getClass()) + " can't retrieve untyped values");
    }
}

