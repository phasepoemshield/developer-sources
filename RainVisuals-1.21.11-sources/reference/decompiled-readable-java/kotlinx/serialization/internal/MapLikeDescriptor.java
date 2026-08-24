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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\r8\u0016X\u0096D\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b,\u0010%\u0082\u0001\u0002-.\u00a8\u0006/"}, d2={"Lkotlinx/serialization/internal/MapLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", "keyDescriptor", "valueDescriptor", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "hashCode", "()I", "isElementOptional", "(I)Z", "toString", "()Ljava/lang/String;", "elementsCount", "I", "getElementsCount", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKeyDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Ljava/lang/String;", "getSerialName", "getValueDescriptor", "Lkotlinx/serialization/internal/HashMapClassDesc;", "Lkotlinx/serialization/internal/LinkedHashMapClassDesc;", "kotlinx-serialization-core"})
public abstract class MapLikeDescriptor
implements SerialDescriptor {
    private final int elementsCount;
    @NotNull
    private final String serialName;
    @NotNull
    private final SerialDescriptor keyDescriptor;
    @NotNull
    private final SerialDescriptor valueDescriptor;

    @Override
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    public /* synthetic */ MapLikeDescriptor(String serialName, SerialDescriptor keyDescriptor, SerialDescriptor valueDescriptor, DefaultConstructorMarker $constructor_marker) {
        this(serialName, keyDescriptor, valueDescriptor);
    }

    @Override
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @NotNull
    public final SerialDescriptor getValueDescriptor() {
        return this.valueDescriptor;
    }

    @Override
    @NotNull
    public String getElementName(int index) {
        return String.valueOf(index);
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
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer n = StringsKt.toIntOrNull(name);
        if (n == null) {
            throw new IllegalArgumentException(name + " is not a valid map index");
        }
        return n;
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

    public int hashCode() {
        int result = this.getSerialName().hashCode();
        result = 31 * result + this.keyDescriptor.hashCode();
        result = 31 * result + this.valueDescriptor.hashCode();
        return result;
    }

    @NotNull
    public final SerialDescriptor getKeyDescriptor() {
        return this.keyDescriptor;
    }

    @NotNull
    public String toString() {
        return this.getSerialName() + '(' + this.keyDescriptor + ", " + this.valueDescriptor + ')';
    }

    @Override
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        SerialDescriptor serialDescriptor;
        if (!(index >= 0)) {
            boolean bl = false;
            String string = "Illegal index " + index + ", " + this.getSerialName() + " expects only non-negative indices";
            throw new IllegalArgumentException(string.toString());
        }
        switch (index % 2) {
            case 0: {
                serialDescriptor = this.keyDescriptor;
                break;
            }
            case 1: {
                serialDescriptor = this.valueDescriptor;
                break;
            }
            default: {
                throw new IllegalStateException("Unreached".toString());
            }
        }
        return serialDescriptor;
    }

    @Override
    @NotNull
    public SerialKind getKind() {
        return StructureKind.MAP.INSTANCE;
    }

    private MapLikeDescriptor(String serialName, SerialDescriptor keyDescriptor, SerialDescriptor valueDescriptor) {
        this.serialName = serialName;
        this.keyDescriptor = keyDescriptor;
        this.valueDescriptor = valueDescriptor;
        this.elementsCount = 2;
    }

    @Override
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.DefaultImpls.getAnnotations(this);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapLikeDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getSerialName(), ((MapLikeDescriptor)other).getSerialName())) {
            return false;
        }
        if (!Intrinsics.areEqual(this.keyDescriptor, ((MapLikeDescriptor)other).keyDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.valueDescriptor, ((MapLikeDescriptor)other).valueDescriptor)) {
            return false;
        }
        return true;
    }
}

