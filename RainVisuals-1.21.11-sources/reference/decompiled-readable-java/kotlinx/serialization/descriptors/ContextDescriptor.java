/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0097\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0097\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\f8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u001bR\u0014\u0010%\u001a\u00020\t8VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\t8VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b'\u0010&R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010,\u001a\u00020)8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0002\u0010-R\u001a\u0010.\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001f\u00a8\u00061"}, d2={"Lkotlinx/serialization/descriptors/ContextDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "Lkotlin/reflect/KClass;", "kClass", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KClass;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "hashCode", "()I", "isElementOptional", "(I)Z", "toString", "()Ljava/lang/String;", "getAnnotations", "()Ljava/util/List;", "annotations", "getElementsCount", "elementsCount", "isInline", "()Z", "isNullable", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "Ljava/lang/String;", "getSerialName", "kotlinx-serialization-core"})
final class ContextDescriptor
implements SerialDescriptor {
    @NotNull
    @JvmField
    public final KClass<?> kClass;
    @NotNull
    private final SerialDescriptor original;
    @NotNull
    private final String serialName;

    @Override
    public boolean isNullable() {
        return this.original.isNullable();
    }

    public int hashCode() {
        int result = ((Object)this.kClass).hashCode();
        result = 31 * result + this.getSerialName().hashCode();
        return result;
    }

    @Override
    @ExperimentalSerializationApi
    @NotNull
    public String getElementName(int index) {
        return this.original.getElementName(index);
    }

    @Override
    @ExperimentalSerializationApi
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        return this.original.getElementDescriptor(index);
    }

    @Override
    @ExperimentalSerializationApi
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.original.getElementIndex(name);
    }

    @Override
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override
    @ExperimentalSerializationApi
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        return this.original.getElementAnnotations(index);
    }

    @Override
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override
    @NotNull
    public SerialKind getKind() {
        return this.original.getKind();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ContextDescriptor)) return false;
        ContextDescriptor contextDescriptor = (ContextDescriptor)other;
        if (contextDescriptor == null) {
            return false;
        }
        ContextDescriptor another = contextDescriptor;
        if (!Intrinsics.areEqual(this.original, another.original)) return false;
        if (!Intrinsics.areEqual(another.kClass, this.kClass)) return false;
        return true;
    }

    public ContextDescriptor(@NotNull SerialDescriptor original, @NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.original = original;
        this.kClass = kClass;
        this.serialName = this.original.getSerialName() + '<' + this.kClass.getSimpleName() + '>';
    }

    @NotNull
    public String toString() {
        return "ContextDescriptor(kClass: " + this.kClass + ", original: " + this.original + ')';
    }

    @Override
    @ExperimentalSerializationApi
    public boolean isElementOptional(int index) {
        return this.original.isElementOptional(index);
    }

    @Override
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.original.getAnnotations();
    }
}

