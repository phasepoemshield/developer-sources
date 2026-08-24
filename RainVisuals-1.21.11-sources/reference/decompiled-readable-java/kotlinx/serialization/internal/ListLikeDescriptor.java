/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0002\u001a\u00020\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0002\u0010\u001e\u001a\u0004\b\u0010\u0010\u001fR\u001a\u0010 \u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0001\u0005'()*+\u00a8\u0006,"}, d2={"Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "hashCode", "()I", "isElementOptional", "(I)Z", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementsCount", "I", "getElementsCount", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Lkotlinx/serialization/internal/ArrayClassDesc;", "Lkotlinx/serialization/internal/ArrayListClassDesc;", "Lkotlinx/serialization/internal/HashSetClassDesc;", "Lkotlinx/serialization/internal/LinkedHashSetClassDesc;", "Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "kotlinx-serialization-core"})
@ExperimentalSerializationApi
public abstract class ListLikeDescriptor
implements SerialDescriptor {
    private final int elementsCount;
    @NotNull
    private final SerialDescriptor elementDescriptor;

    private ListLikeDescriptor(SerialDescriptor elementDescriptor2) {
        this.elementDescriptor = elementDescriptor2;
        this.elementsCount = 1;
    }

    @Override
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        if (!(index >= 0)) {
            boolean bl = false;
            String string = "Illegal index " + index + ", " + this.getSerialName() + " expects only non-negative indices";
            throw new IllegalArgumentException(string.toString());
        }
        return CollectionsKt.emptyList();
    }

    @Override
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        if (!(index >= 0)) {
            boolean bl = false;
            String string = "Illegal index " + index + ", " + this.getSerialName() + " expects only non-negative indices";
            throw new IllegalArgumentException(string.toString());
        }
        return this.elementDescriptor;
    }

    @Override
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    @NotNull
    public String toString() {
        return this.getSerialName() + '(' + this.elementDescriptor + ')';
    }

    @Override
    public boolean isElementOptional(int index) {
        if (!(index >= 0)) {
            boolean bl = false;
            String string = "Illegal index " + index + ", " + this.getSerialName() + " expects only non-negative indices";
            throw new IllegalArgumentException(string.toString());
        }
        return false;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListLikeDescriptor)) {
            return false;
        }
        if (Intrinsics.areEqual(this.elementDescriptor, ((ListLikeDescriptor)other).elementDescriptor) && Intrinsics.areEqual(this.getSerialName(), ((ListLikeDescriptor)other).getSerialName())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.elementDescriptor.hashCode() * 31 + this.getSerialName().hashCode();
    }

    @Override
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    public /* synthetic */ ListLikeDescriptor(SerialDescriptor elementDescriptor2, DefaultConstructorMarker $constructor_marker) {
        this(elementDescriptor2);
    }

    @Override
    @NotNull
    public String getElementName(int index) {
        return String.valueOf(index);
    }

    @Override
    @NotNull
    public SerialKind getKind() {
        return StructureKind.LIST.INSTANCE;
    }

    @NotNull
    public final SerialDescriptor getElementDescriptor() {
        return this.elementDescriptor;
    }

    @Override
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer n = StringsKt.toIntOrNull(name);
        if (n == null) {
            throw new IllegalArgumentException(name + " is not a valid list index");
        }
        return n;
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.DefaultImpls.getAnnotations(this);
    }

    @Override
    public int getElementsCount() {
        return this.elementsCount;
    }
}

