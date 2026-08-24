/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0018\u00a2\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0018\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u001d\u00a2\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020(\u00a2\u0006\u0004\b)\u0010*J%\u0010+\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020(\u00a2\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f\u00a2\u0006\u0004\b1\u00102J%\u00103\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f\u00a2\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\f2\u0006\u0010\u000b\u001a\u000205\u00a2\u0006\u0004\b6\u00107J%\u00108\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u000205\u00a2\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b:\u0010\u0005J\u000f\u0010;\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b;\u0010\u0005JA\u0010@\u001a\u00020\f\"\b\b\u0001\u0010=*\u00020<2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010>2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0016\u00a2\u0006\u0004\b@\u0010AJ;\u0010B\u001a\u00020\f\"\u0004\b\u0001\u0010=2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010>2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\bB\u0010AJ\u0015\u0010D\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020C\u00a2\u0006\u0004\bD\u0010EJ%\u0010F\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020C\u00a2\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020H\u00a2\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020H\u00a2\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0013H\u0014\u00a2\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0018H\u0014\u00a2\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u001dH\u0014\u00a2\u0006\u0004\bT\u0010UJ'\u0010W\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\bW\u0010XJ\u001f\u0010Y\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020(H\u0014\u00a2\u0006\u0004\bY\u0010ZJ\u001f\u0010\\\u001a\u00020\u00022\u0006\u0010M\u001a\u00028\u00002\u0006\u0010[\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\\\u0010]J\u001f\u0010^\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\b^\u0010_J\u001f\u0010`\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u000205H\u0014\u00a2\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\bd\u0010cJ\u001f\u0010e\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020CH\u0014\u00a2\u0006\u0004\be\u0010fJ\u001f\u0010g\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020HH\u0014\u00a2\u0006\u0004\bg\u0010hJ\u001f\u0010i\u001a\u00020\f2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020<H\u0014\u00a2\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\bk\u0010lJ\u0015\u0010m\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\bm\u0010lJ\u000f\u0010n\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\bn\u0010oJ\u0017\u0010q\u001a\u00020\f2\u0006\u0010p\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\bq\u0010cJ\u001b\u0010r\u001a\u00028\u0000*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH$\u00a2\u0006\u0004\br\u0010sR\u0014\u0010u\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bt\u0010oR\u0016\u0010w\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bv\u0010oR\u0014\u0010{\u001a\u00020x8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\by\u0010zR$\u0010~\u001a\u0012\u0012\u0004\u0012\u00028\u00000|j\b\u0012\u0004\u0012\u00028\u0000`}8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b~\u0010\u007f\u00a8\u0006\u0080\u0001"}, d2={"Lkotlinx/serialization/internal/TaggedEncoder;", "Tag", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;", "", "value", "", "encodeBoolean", "(Z)V", "", "index", "encodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "", "encodeByte", "(B)V", "encodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "", "encodeChar", "(C)V", "encodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "", "encodeDouble", "(D)V", "encodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "desc", "encodeElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "enumDescriptor", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "", "encodeFloat", "(F)V", "encodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "encodeInt", "(I)V", "encodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "", "encodeLong", "(J)V", "encodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "encodeNotNullMark", "encodeNull", "", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeSerializableElement", "", "encodeShort", "(S)V", "encodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "", "encodeString", "(Ljava/lang/String;)V", "encodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "tag", "encodeTaggedBoolean", "(Ljava/lang/Object;Z)V", "encodeTaggedByte", "(Ljava/lang/Object;B)V", "encodeTaggedChar", "(Ljava/lang/Object;C)V", "encodeTaggedDouble", "(Ljava/lang/Object;D)V", "ordinal", "encodeTaggedEnum", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "encodeTaggedFloat", "(Ljava/lang/Object;F)V", "inlineDescriptor", "encodeTaggedInline", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeTaggedInt", "(Ljava/lang/Object;I)V", "encodeTaggedLong", "(Ljava/lang/Object;J)V", "encodeTaggedNonNullMark", "(Ljava/lang/Object;)V", "encodeTaggedNull", "encodeTaggedShort", "(Ljava/lang/Object;S)V", "encodeTaggedString", "(Ljava/lang/Object;Ljava/lang/String;)V", "encodeTaggedValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "endEncode", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "endStructure", "popTag", "()Ljava/lang/Object;", "name", "pushTag", "getTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "getCurrentTag", "currentTag", "getCurrentTagOrNull", "currentTagOrNull", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "tagStack", "Ljava/util/ArrayList;", "kotlinx-serialization-core"})
public abstract class TaggedEncoder<Tag>
implements Encoder,
CompositeEncoder {
    @NotNull
    private final ArrayList<Tag> tagStack = new ArrayList();

    @Override
    public final void encodeBooleanElement(@NotNull SerialDescriptor descriptor2, int index, boolean value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        this.encodeTaggedBoolean(this.getTag(descriptor2, index), value);
    }

    @Override
    public final void encodeLongElement(@NotNull SerialDescriptor descriptor2, int index, long value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        this.encodeTaggedLong(this.getTag(descriptor2, index), value);
    }

    @Override
    public final void encodeInt(int value) {
        this.encodeTaggedInt(this.popTag(), value);
    }

    @Override
    public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull SerializationStrategy<? super T> serializer2, @Nullable T value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeNullableSerializableValue(serializer2, value);
        }
    }

    protected void endEncode(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
    }

    protected void encodeTaggedFloat(Tag tag, float value) {
        this.encodeTaggedValue(tag, Float.valueOf(value));
    }

    @Override
    public final void encodeByteElement(@NotNull SerialDescriptor descriptor2, int index, byte value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        this.encodeTaggedByte(this.getTag(descriptor2, index), value);
    }

    protected final Tag getCurrentTag() {
        return (Tag)CollectionsKt.last((List)this.tagStack);
    }

    @Override
    public final void encodeChar(char value) {
        this.encodeTaggedChar(this.popTag(), value);
    }

    protected abstract Tag getTag(@NotNull SerialDescriptor var1, int var2);

    @Override
    @ExperimentalSerializationApi
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor2, int index) {
        return CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(this, descriptor2, index);
    }

    @Override
    public final void encodeByte(byte value) {
        this.encodeTaggedByte(this.popTag(), value);
    }

    @Override
    public final void encodeDoubleElement(@NotNull SerialDescriptor descriptor2, int index, double value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        this.encodeTaggedDouble(this.getTag(descriptor2, index), value);
    }

    protected void encodeTaggedInt(Tag tag, int value) {
        this.encodeTaggedValue(tag, value);
    }

    @Override
    public final void encodeIntElement(@NotNull SerialDescriptor descriptor2, int index, int value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        this.encodeTaggedInt(this.getTag(descriptor2, index), value);
    }

    @Override
    public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer2, T value) {
        Encoder.DefaultImpls.encodeSerializableValue(this, serializer2, value);
    }

    @Nullable
    protected final Tag getCurrentTagOrNull() {
        return (Tag)CollectionsKt.lastOrNull((List)this.tagStack);
    }

    protected void encodeTaggedBoolean(Tag tag, boolean value) {
        this.encodeTaggedValue(tag, value);
    }

    protected void encodeTaggedLong(Tag tag, long value) {
        this.encodeTaggedValue(tag, value);
    }

    protected void encodeTaggedNull(Tag tag) {
        throw new SerializationException("null is not supported");
    }

    private final boolean encodeElement(SerialDescriptor desc, int index) {
        Tag tag = this.getTag(desc, index);
        this.pushTag(tag);
        return true;
    }

    protected void encodeTaggedValue(Tag tag, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(this.getClass()) + " encoder");
    }

    @Override
    public final void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.encodeTaggedString(this.popTag(), value);
    }

    @NotNull
    protected Encoder encodeTaggedInline(Tag tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        TaggedEncoder taggedEncoder = this;
        TaggedEncoder $this$encodeTaggedInline_u24lambda_u240 = taggedEncoder;
        boolean bl = false;
        $this$encodeTaggedInline_u24lambda_u240.pushTag(tag);
        return taggedEncoder;
    }

    protected void encodeTaggedEnum(Tag tag, @NotNull SerialDescriptor enumDescriptor, int ordinal) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        this.encodeTaggedValue(tag, ordinal);
    }

    @Override
    @ExperimentalSerializationApi
    public <T> void encodeNullableSerializableValue(@NotNull SerializationStrategy<? super T> serializer2, @Nullable T value) {
        Encoder.DefaultImpls.encodeNullableSerializableValue(this, serializer2, value);
    }

    protected void encodeTaggedByte(Tag tag, byte value) {
        this.encodeTaggedValue(tag, value);
    }

    protected void encodeTaggedChar(Tag tag, char value) {
        this.encodeTaggedValue(tag, Character.valueOf(value));
    }

    protected void encodeTaggedShort(Tag tag, short value) {
        this.encodeTaggedValue(tag, value);
    }

    @Override
    public final void encodeShortElement(@NotNull SerialDescriptor descriptor2, int index, short value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        this.encodeTaggedShort(this.getTag(descriptor2, index), value);
    }

    protected final Tag popTag() {
        if (!(!((Collection)this.tagStack).isEmpty())) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return this.tagStack.remove(CollectionsKt.getLastIndex((List)this.tagStack));
    }

    @Override
    public final void encodeFloat(float value) {
        this.encodeTaggedFloat(this.popTag(), value);
    }

    @Override
    @NotNull
    public SerializersModule getSerializersModule() {
        return SerializersModuleBuildersKt.EmptySerializersModule();
    }

    protected void encodeTaggedNonNullMark(Tag tag) {
    }

    @Override
    @NotNull
    public final Encoder encodeInlineElement(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.encodeTaggedInline(this.getTag(descriptor2, index), descriptor2.getElementDescriptor(index));
    }

    protected void encodeTaggedDouble(Tag tag, double value) {
        this.encodeTaggedValue(tag, value);
    }

    @Override
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this.encodeTaggedInline(this.popTag(), descriptor2);
    }

    @Override
    public void encodeNull() {
        this.encodeTaggedNull(this.popTag());
    }

    protected void encodeTaggedString(Tag tag, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.encodeTaggedValue(tag, value);
    }

    protected final void pushTag(Tag name) {
        this.tagStack.add(name);
    }

    @Override
    public final void encodeShort(short value) {
        this.encodeTaggedShort(this.popTag(), value);
    }

    @Override
    public <T> void encodeSerializableElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull SerializationStrategy<? super T> serializer2, T value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        if (this.encodeElement(descriptor2, index)) {
            this.encodeSerializableValue(serializer2, value);
        }
    }

    @Override
    public final void encodeDouble(double value) {
        this.encodeTaggedDouble(this.popTag(), value);
    }

    @Override
    public final void encodeLong(long value) {
        this.encodeTaggedLong(this.popTag(), value);
    }

    @Override
    @NotNull
    public CompositeEncoder beginCollection(@NotNull SerialDescriptor descriptor2, int collectionSize) {
        return Encoder.DefaultImpls.beginCollection(this, descriptor2, collectionSize);
    }

    @Override
    @NotNull
    public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return this;
    }

    @Override
    public final void encodeFloatElement(@NotNull SerialDescriptor descriptor2, int index, float value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        this.encodeTaggedFloat(this.getTag(descriptor2, index), value);
    }

    @Override
    public final void encodeStringElement(@NotNull SerialDescriptor descriptor2, int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        this.encodeTaggedString(this.getTag(descriptor2, index), value);
    }

    @Override
    public final void encodeCharElement(@NotNull SerialDescriptor descriptor2, int index, char value) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        this.encodeTaggedChar(this.getTag(descriptor2, index), value);
    }

    @Override
    public final void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        this.encodeTaggedEnum(this.popTag(), enumDescriptor, index);
    }

    @Override
    public final void endStructure(@NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        boolean bl = !((Collection)this.tagStack).isEmpty();
        if (bl) {
            this.popTag();
        }
        this.endEncode(descriptor2);
    }

    @Override
    public void encodeNotNullMark() {
        this.encodeTaggedNonNullMark(this.getCurrentTag());
    }

    @Override
    public final void encodeBoolean(boolean value) {
        this.encodeTaggedBoolean(this.popTag(), value);
    }
}

