/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002H\u0097\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00078\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00148VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00148VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&\u00a8\u0006'"}, d2={"Lkotlinx/serialization/descriptors/WrappedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", "original", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "", "isElementOptional", "(I)Z", "getAnnotations", "()Ljava/util/List;", "annotations", "getElementsCount", "()I", "elementsCount", "isInline", "()Z", "isNullable", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "kotlinx-serialization-core"})
public final class WrappedSerialDescriptor
implements SerialDescriptor {
    @NotNull
    private final String serialName;
    private final /* synthetic */ SerialDescriptor $$delegate_0;

    @Override
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @Override
    @ExperimentalSerializationApi
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        return this.$$delegate_0.getElementDescriptor(index);
    }

    @Override
    @ExperimentalSerializationApi
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.$$delegate_0.getElementIndex(name);
    }

    public WrappedSerialDescriptor(@NotNull String serialName, @NotNull SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        this.serialName = serialName;
        this.$$delegate_0 = original;
    }

    @Override
    @ExperimentalSerializationApi
    public boolean isElementOptional(int index) {
        return this.$$delegate_0.isElementOptional(index);
    }

    @Override
    public int getElementsCount() {
        return this.$$delegate_0.getElementsCount();
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.$$delegate_0.getAnnotations();
    }

    @Override
    public boolean isInline() {
        return this.$$delegate_0.isInline();
    }

    @Override
    @ExperimentalSerializationApi
    @NotNull
    public String getElementName(int index) {
        return this.$$delegate_0.getElementName(index);
    }

    @Override
    public boolean isNullable() {
        return this.$$delegate_0.isNullable();
    }

    @Override
    @ExperimentalSerializationApi
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        return this.$$delegate_0.getElementAnnotations(index);
    }

    @Override
    @NotNull
    public SerialKind getKind() {
        return this.$$delegate_0.getKind();
    }
}

