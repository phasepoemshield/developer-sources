/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

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
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\b\u0011\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\b\t\u0010\nB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001b"}, d2={"Lkotlinx/serialization/PolymorphicSerializer;", "", "T", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "Lkotlin/reflect/KClass;", "baseClass", "", "", "classAnnotations", "<init>", "(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V", "(Lkotlin/reflect/KClass;)V", "", "toString", "()Ljava/lang/String;", "", "_annotations", "Ljava/util/List;", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"})
public final class PolymorphicSerializer<T>
extends AbstractPolymorphicSerializer<T> {
    @NotNull
    private final KClass<T> baseClass;
    @NotNull
    private final Lazy descriptor$delegate;
    @NotNull
    private List<? extends Annotation> _annotations;

    public PolymorphicSerializer(@NotNull KClass<T> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0)new Function0<SerialDescriptor>(this){
            final /* synthetic */ PolymorphicSerializer<T> this$0;

            @NotNull
            public final SerialDescriptor invoke() {
                return ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.INSTANCE, new SerialDescriptor[0], (Function1<? super ClassSerialDescriptorBuilder, Unit>)new Function1<ClassSerialDescriptorBuilder, Unit>(this.this$0){
                    final /* synthetic */ PolymorphicSerializer<T> this$0;

                    public final void invoke(@NotNull ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
                        Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
                        ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
                        ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "value", SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.Polymorphic<" + this.this$0.getBaseClass().getSimpleName() + '>', SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
                        $this$buildSerialDescriptor.setAnnotations(PolymorphicSerializer.access$get_annotations$p(this.this$0));
                    }
                    {
                        this.this$0 = $receiver;
                        super(1);
                    }
                }), this.this$0.getBaseClass());
            }
            {
                this.this$0 = $receiver;
                super(0);
            }
        });
    }

    @PublishedApi
    public PolymorphicSerializer(@NotNull KClass<T> baseClass, @NotNull Annotation[] classAnnotations) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this(baseClass);
        this._annotations = ArraysKt.asList(classAnnotations);
    }

    @Override
    @NotNull
    public KClass<T> getBaseClass() {
        return this.baseClass;
    }

    @NotNull
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.getBaseClass() + ')';
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        Lazy lazy = this.descriptor$delegate;
        return (SerialDescriptor)lazy.getValue();
    }

    public static final /* synthetic */ List access$get_annotations$p(PolymorphicSerializer $this) {
        return $this._annotations;
    }
}

