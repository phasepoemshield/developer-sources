/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\"\u00a8\u0006*"}, d2={"Lkotlinx/serialization/internal/PrimitiveSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kind", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/PrimitiveKind;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "error", "()Ljava/lang/Void;", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "hashCode", "()I", "isElementOptional", "(I)Z", "toString", "()Ljava/lang/String;", "getElementsCount", "elementsCount", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "getKind", "()Lkotlinx/serialization/descriptors/PrimitiveKind;", "Ljava/lang/String;", "getSerialName", "kotlinx-serialization-core"})
public final class PrimitiveSerialDescriptor
implements SerialDescriptor {
    @NotNull
    private final String serialName;
    @NotNull
    private final PrimitiveKind kind;

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.DefaultImpls.getAnnotations(this);
    }

    @NotNull
    public String toString() {
        return "PrimitiveDescriptor(" + this.getSerialName() + ')';
    }

    @Override
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @Override
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.error();
        throw new KotlinNothingValueException();
    }

    private final Void error() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    @NotNull
    public String getElementName(int index) {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    @Override
    public boolean isElementOptional(int index) {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        this.error();
        throw new KotlinNothingValueException();
    }

    public PrimitiveSerialDescriptor(@NotNull String serialName, @NotNull PrimitiveKind kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.serialName = serialName;
        this.kind = kind;
    }

    @Override
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    public int getElementsCount() {
        return 0;
    }

    @Override
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimitiveSerialDescriptor)) {
            return false;
        }
        if (Intrinsics.areEqual(this.getSerialName(), ((PrimitiveSerialDescriptor)other).getSerialName()) && Intrinsics.areEqual(this.getKind(), ((PrimitiveSerialDescriptor)other).getKind())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.getSerialName().hashCode() + 31 * this.getKind().hashCode();
    }

    @Override
    @NotNull
    public PrimitiveKind getKind() {
        return this.kind;
    }
}

