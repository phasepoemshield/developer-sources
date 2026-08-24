/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH'\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H'\u00a2\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00028&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00108VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010$\u001a\u00020 8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b#\u0010\u0016\u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020\n8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b'\u0010\u0016\u001a\u0004\b%\u0010&\u00a8\u0006)"}, d2={"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "", "isElementOptional", "(I)Z", "getAnnotations", "()Ljava/util/List;", "getAnnotations$annotations", "()V", "annotations", "getElementsCount", "()I", "getElementsCount$annotations", "elementsCount", "isInline", "()Z", "isNullable", "isNullable$annotations", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "getKind$annotations", "kind", "getSerialName", "()Ljava/lang/String;", "getSerialName$annotations", "serialName", "kotlinx-serialization-core"})
public interface SerialDescriptor {
    @ExperimentalSerializationApi
    @NotNull
    public String getElementName(int var1);

    @NotNull
    public SerialKind getKind();

    public boolean isInline();

    public int getElementsCount();

    @NotNull
    public String getSerialName();

    @ExperimentalSerializationApi
    @NotNull
    public SerialDescriptor getElementDescriptor(int var1);

    @NotNull
    public List<Annotation> getAnnotations();

    @ExperimentalSerializationApi
    @NotNull
    public List<Annotation> getElementAnnotations(int var1);

    @ExperimentalSerializationApi
    public int getElementIndex(@NotNull String var1);

    @ExperimentalSerializationApi
    public boolean isElementOptional(int var1);

    public boolean isNullable();

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @NotNull
        public static List<Annotation> getAnnotations(@NotNull SerialDescriptor $this) {
            return CollectionsKt.emptyList();
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getElementsCount$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getKind$annotations() {
        }

        public static boolean isInline(@NotNull SerialDescriptor $this) {
            return false;
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSerialName$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void isNullable$annotations() {
        }

        public static boolean isNullable(@NotNull SerialDescriptor $this) {
            return false;
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getAnnotations$annotations() {
        }
    }
}

