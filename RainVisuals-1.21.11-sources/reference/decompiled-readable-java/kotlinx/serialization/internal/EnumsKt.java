/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000$\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aq\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004H\u0001\u00a2\u0006\u0004\b\u000b\u0010\f\u001aa\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004H\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"", "T", "", "serialName", "", "values", "names", "", "entryAnnotations", "classAnnotations", "Lkotlinx/serialization/KSerializer;", "createAnnotatedEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "annotations", "createMarkedEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "createSimpleEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"})
public final class EnumsKt {
    /*
     * WARNING - void declaration
     */
    @InternalSerializationApi
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> createMarkedEnumSerializer(@NotNull String serialName, @NotNull T[] values2, @NotNull String[] names, @NotNull Annotation[][] annotations) {
        void var4_4;
        void var1_1;
        String string;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values2, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        EnumDescriptor descriptor2 = new EnumDescriptor(serialName, values2.length);
        T[] $this$forEachIndexed$iv = values2;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (T item$iv : $this$forEachIndexed$iv) {
            Annotation[] $this$forEach$iv;
            int n = index$iv++;
            T v = item$iv;
            int i = n;
            boolean bl = false;
            String string2 = ArraysKt.getOrNull(names, i);
            if (string2 == null) {
                string2 = ((Enum)v).name();
            }
            String elementName = string2;
            PluginGeneratedSerialDescriptor.addElement$default(descriptor2, elementName, false, 2, null);
            if ((Annotation[])ArraysKt.getOrNull((Object[])annotations, i) == null) continue;
            boolean $i$f$forEach = false;
            int n2 = $this$forEach$iv.length;
            for (int j = 0; j < n2; ++j) {
                Annotation element$iv;
                Annotation annotation = element$iv = $this$forEach$iv[j];
                boolean bl2 = false;
                descriptor2.pushAnnotation(annotation);
            }
        }
        return new EnumSerializer(string, (Enum[])var1_1, (SerialDescriptor)var4_4);
    }

    @InternalSerializationApi
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> createSimpleEnumSerializer(@NotNull String serialName, @NotNull T[] values2) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values2, "values");
        return new EnumSerializer(serialName, values2);
    }

    /*
     * WARNING - void declaration
     */
    @InternalSerializationApi
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> createAnnotatedEnumSerializer(@NotNull String serialName, @NotNull T[] values2, @NotNull String[] names, @NotNull Annotation[][] entryAnnotations, @Nullable Annotation[] classAnnotations) {
        void var5_5;
        void var1_1;
        String string;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values2, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        EnumDescriptor descriptor2 = new EnumDescriptor(serialName, values2.length);
        if (classAnnotations != null) {
            Annotation[] $this$forEach$iv = classAnnotations;
            boolean $i$f$forEach = false;
            int n = $this$forEach$iv.length;
            for (int i = 0; i < n; ++i) {
                Annotation element$iv;
                Annotation it = element$iv = $this$forEach$iv[i];
                boolean bl = false;
                descriptor2.pushClassAnnotation(it);
            }
        }
        T[] $this$forEachIndexed$iv = values2;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (T item$iv : $this$forEachIndexed$iv) {
            Annotation[] $this$forEach$iv;
            int n = index$iv++;
            T v = item$iv;
            int i = n;
            boolean bl = false;
            String string2 = ArraysKt.getOrNull(names, i);
            if (string2 == null) {
                string2 = ((Enum)v).name();
            }
            String elementName = string2;
            PluginGeneratedSerialDescriptor.addElement$default(descriptor2, elementName, false, 2, null);
            if ((Annotation[])ArraysKt.getOrNull((Object[])entryAnnotations, i) == null) continue;
            boolean $i$f$forEach = false;
            for (Annotation element$iv : $this$forEach$iv) {
                void var20_22;
                void var21_23 = var20_22;
                boolean bl2 = false;
                descriptor2.pushAnnotation((Annotation)var21_23);
            }
        }
        return new EnumSerializer(string, (Enum[])var1_1, (SerialDescriptor)var5_5);
    }
}

