/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000f\u0010\u0010R.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\b\u000b\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00188\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013R(\u0010!\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b&\u0010\u0017\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,\u00a8\u0006-"}, d2={"Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "", "serialName", "<init>", "(Ljava/lang/String;)V", "elementName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "annotations", "", "isOptional", "", "element", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;Z)V", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "setAnnotations", "(Ljava/util/List;)V", "getAnnotations$annotations", "()V", "", "elementAnnotations", "getElementAnnotations$kotlinx_serialization_core", "elementDescriptors", "getElementDescriptors$kotlinx_serialization_core", "elementNames", "getElementNames$kotlinx_serialization_core", "elementOptionality", "getElementOptionality$kotlinx_serialization_core", "isNullable", "Z", "()Z", "setNullable", "(Z)V", "isNullable$annotations", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "", "uniqueNames", "Ljava/util/Set;", "kotlinx-serialization-core"})
public final class ClassSerialDescriptorBuilder {
    @NotNull
    private final List<Boolean> elementOptionality;
    @NotNull
    private final List<SerialDescriptor> elementDescriptors;
    @NotNull
    private final List<String> elementNames;
    @NotNull
    private final String serialName;
    private boolean isNullable;
    @NotNull
    private List<? extends Annotation> annotations;
    @NotNull
    private final List<List<Annotation>> elementAnnotations;
    @NotNull
    private final Set<String> uniqueNames;

    public final void element(@NotNull String elementName, @NotNull SerialDescriptor descriptor2, @NotNull List<? extends Annotation> annotations, boolean isOptional) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!this.uniqueNames.add(elementName)) {
            boolean bl = false;
            String string = "Element with name '" + elementName + "' is already registered in " + this.serialName;
            throw new IllegalArgumentException(string.toString());
        }
        ((Collection)this.elementNames).add(elementName);
        ((Collection)this.elementDescriptors).add(descriptor2);
        ((Collection)this.elementAnnotations).add(annotations);
        Boolean bl = isOptional;
        ((Collection)this.elementOptionality).add(bl);
    }

    @NotNull
    public final List<Boolean> getElementOptionality$kotlinx_serialization_core() {
        return this.elementOptionality;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    public ClassSerialDescriptorBuilder(@NotNull String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.annotations = CollectionsKt.emptyList();
        this.elementNames = new ArrayList();
        this.uniqueNames = new HashSet();
        this.elementDescriptors = new ArrayList();
        this.elementAnnotations = new ArrayList();
        this.elementOptionality = new ArrayList();
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAnnotations$annotations() {
    }

    @NotNull
    public final List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final List<SerialDescriptor> getElementDescriptors$kotlinx_serialization_core() {
        return this.elementDescriptors;
    }

    @Deprecated(message="isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.", level=DeprecationLevel.ERROR)
    @ExperimentalSerializationApi
    public static /* synthetic */ void isNullable$annotations() {
    }

    public final void setNullable(boolean bl) {
        this.isNullable = bl;
    }

    @NotNull
    public final List<List<Annotation>> getElementAnnotations$kotlinx_serialization_core() {
        return this.elementAnnotations;
    }

    public static /* synthetic */ void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String string, SerialDescriptor serialDescriptor, List list, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((n & 8) != 0) {
            bl = false;
        }
        classSerialDescriptorBuilder.element(string, serialDescriptor, list, bl);
    }

    @NotNull
    public final String getSerialName() {
        return this.serialName;
    }

    @NotNull
    public final List<String> getElementNames$kotlinx_serialization_core() {
        return this.elementNames;
    }

    public final void setAnnotations(@NotNull List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.annotations = list;
    }
}

