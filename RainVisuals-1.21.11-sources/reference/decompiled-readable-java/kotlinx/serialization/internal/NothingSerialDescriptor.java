/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001bR\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001f\u00a8\u0006*"}, d2={"Lkotlinx/serialization/internal/NothingSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "error", "()Ljava/lang/Void;", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "hashCode", "()I", "isElementOptional", "(I)Z", "toString", "()Ljava/lang/String;", "getElementsCount", "elementsCount", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "serialName", "Ljava/lang/String;", "getSerialName", "kotlinx-serialization-core"})
public final class NothingSerialDescriptor
implements SerialDescriptor {
    @NotNull
    private static final String serialName;
    @NotNull
    private static final SerialKind kind;
    @NotNull
    public static final NothingSerialDescriptor INSTANCE;

    @Override
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        this.error();
        throw new KotlinNothingValueException();
    }

    public boolean equals(@Nullable Object other) {
        return this == other;
    }

    public int hashCode() {
        return this.getSerialName().hashCode() + 31 * this.getKind().hashCode();
    }

    @Override
    @NotNull
    public String getSerialName() {
        return serialName;
    }

    @Override
    @NotNull
    public String getElementName(int index) {
        this.error();
        throw new KotlinNothingValueException();
    }

    @Override
    @NotNull
    public SerialKind getKind() {
        return kind;
    }

    @Override
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        this.error();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public String toString() {
        return "NothingSerialDescriptor";
    }

    @Override
    public boolean isElementOptional(int index) {
        this.error();
        throw new KotlinNothingValueException();
    }

    private final Void error() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.DefaultImpls.getAnnotations(this);
    }

    static {
        INSTANCE = new NothingSerialDescriptor();
        kind = StructureKind.OBJECT.INSTANCE;
        serialName = "kotlin.Nothing";
    }

    @Override
    public int getElementsCount() {
        return 0;
    }

    @Override
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    private NothingSerialDescriptor() {
    }
}

