/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0097\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000b8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001aR\u0014\u0010$\u001a\u00020\b8VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010%R\u0014\u0010*\u001a\u00020'8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001eR \u00102\u001a\b\u0012\u0004\u0012\u00020\u0013018\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\u00a8\u00066"}, d2={"Lkotlinx/serialization/internal/SerialDescriptorForNullable;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "original", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "hashCode", "()I", "isElementOptional", "(I)Z", "toString", "()Ljava/lang/String;", "getAnnotations", "()Ljava/util/List;", "annotations", "getElementsCount", "elementsCount", "isInline", "()Z", "isNullable", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getOriginal$kotlinx_serialization_core", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "Ljava/lang/String;", "getSerialName", "", "serialNames", "Ljava/util/Set;", "getSerialNames", "()Ljava/util/Set;", "kotlinx-serialization-core"})
public final class SerialDescriptorForNullable
implements SerialDescriptor,
CachedNames {
    @NotNull
    private final Set<String> serialNames;
    @NotNull
    private final String serialName;
    @NotNull
    private final SerialDescriptor original;

    @Override
    @NotNull
    public Set<String> getSerialNames() {
        return this.serialNames;
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

    @NotNull
    public final SerialDescriptor getOriginal$kotlinx_serialization_core() {
        return this.original;
    }

    @Override
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override
    @ExperimentalSerializationApi
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        return this.original.getElementDescriptor(index);
    }

    @Override
    @ExperimentalSerializationApi
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        return this.original.getElementAnnotations(index);
    }

    @Override
    public boolean isNullable() {
        return true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerialDescriptorForNullable)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.original, ((SerialDescriptorForNullable)other).original)) {
            return false;
        }
        return true;
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
    public String getElementName(int index) {
        return this.original.getElementName(index);
    }

    public int hashCode() {
        return this.original.hashCode() * 31;
    }

    @NotNull
    public String toString() {
        return "" + this.original + '?';
    }

    @Override
    @NotNull
    public SerialKind getKind() {
        return this.original.getKind();
    }

    public SerialDescriptorForNullable(@NotNull SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.original = original;
        this.serialName = this.original.getSerialName() + '?';
        this.serialNames = Platform_commonKt.cachedSerialNames(this.original);
    }

    @Override
    @ExperimentalSerializationApi
    public boolean isElementOptional(int index) {
        return this.original.isElementOptional(index);
    }
}

