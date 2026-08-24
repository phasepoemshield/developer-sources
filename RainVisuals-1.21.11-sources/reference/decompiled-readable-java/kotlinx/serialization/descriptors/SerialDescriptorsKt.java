/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.descriptors.WrappedSerialDescriptor;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.HashMapClassDesc;
import kotlinx.serialization.internal.HashSetClassDesc;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000P\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001aD\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\n\"\u00020\u00042\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\u0002\b\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001aN\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00132\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\n\"\u00020\u00042\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\u0002\b\u000fH\u0007\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0018\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0017\u0018\u0001H\u0087\b\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u001b\u001a \u0010\u001e\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001H\u0087\b\u00a2\u0006\u0004\b\u001e\u0010\u0019\u001a\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u001e\u0010!\u001a\u0018\u0010\"\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0017\u0018\u0001H\u0086\b\u00a2\u0006\u0004\b\"\u0010\u0019\u001a\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\b\"\u0010%\u001a\u0018\u0010&\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0017\u0018\u0001H\u0087\b\u00a2\u0006\u0004\b&\u0010\u0019\u001a\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b&\u0010\u001b\u001a>\u0010-\u001a\u00020\u000e\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\r2\u0006\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010,\u001a\u00020+H\u0086\b\u00a2\u0006\u0004\b-\u0010.\"\u001b\u00102\u001a\u00020\u0004*\u00020\u00048F\u00a2\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001b\u00a8\u00063"}, d2={"", "serialName", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "PrimitiveSerialDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/PrimitiveKind;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "SerialDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "typeParameters", "Lkotlin/Function1;", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildClassSerialDescriptor", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialKind;", "builder", "buildSerialDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "listSerialDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "K", "V", "mapSerialDescriptor", "keyDescriptor", "valueDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDescriptor", "Lkotlin/reflect/KType;", "type", "(Lkotlin/reflect/KType;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "setSerialDescriptor", "elementName", "", "", "annotations", "", "isOptional", "element", "(Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;Ljava/lang/String;Ljava/util/List;Z)V", "getNullable", "getNullable$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "nullable", "kotlinx-serialization-core"})
public final class SerialDescriptorsKt {
    @ExperimentalSerializationApi
    @NotNull
    public static final SerialDescriptor listSerialDescriptor(@NotNull SerialDescriptor elementDescriptor2) {
        Intrinsics.checkNotNullParameter(elementDescriptor2, "elementDescriptor");
        return new ArrayListClassDesc(elementDescriptor2);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final SerialDescriptor mapSerialDescriptor(@NotNull SerialDescriptor keyDescriptor, @NotNull SerialDescriptor valueDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        Intrinsics.checkNotNullParameter(valueDescriptor, "valueDescriptor");
        return new HashMapClassDesc(keyDescriptor, valueDescriptor);
    }

    public static final /* synthetic */ <T> SerialDescriptor serialDescriptor() {
        boolean $i$f$serialDescriptor = false;
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return SerializersKt.serializer(null).getDescriptor();
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalSerializationApi
    @NotNull
    public static final SerialDescriptor SerialDescriptor(@NotNull String serialName, @NotNull SerialDescriptor original) {
        void var1_1;
        String string;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        if (!(!StringsKt.isBlank(serialName))) {
            boolean $i$a$-require-SerialDescriptorsKt$SerialDescriptor$42 = false;
            String $i$a$-require-SerialDescriptorsKt$SerialDescriptor$42 = "Blank serial names are prohibited";
            throw new IllegalArgumentException($i$a$-require-SerialDescriptorsKt$SerialDescriptor$42.toString());
        }
        if (!(!(original.getKind() instanceof PrimitiveKind))) {
            boolean $i$a$-require-SerialDescriptorsKt$SerialDescriptor$52 = false;
            String $i$a$-require-SerialDescriptorsKt$SerialDescriptor$52 = "For primitive descriptors please use 'PrimitiveSerialDescriptor' instead";
            throw new IllegalArgumentException($i$a$-require-SerialDescriptorsKt$SerialDescriptor$52.toString());
        }
        if (!(!Intrinsics.areEqual(serialName, original.getSerialName()))) {
            boolean bl = false;
            String string2 = "The name of the wrapped descriptor (" + serialName + ") cannot be the same as the name of the original descriptor (" + original.getSerialName() + ')';
            throw new IllegalArgumentException(string2.toString());
        }
        return new WrappedSerialDescriptor(string, (SerialDescriptor)var1_1);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final SerialDescriptor setSerialDescriptor(@NotNull SerialDescriptor elementDescriptor2) {
        Intrinsics.checkNotNullParameter(elementDescriptor2, "elementDescriptor");
        return new HashSetClassDesc(elementDescriptor2);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <K, V> SerialDescriptor mapSerialDescriptor() {
        boolean $i$f$mapSerialDescriptor = false;
        Intrinsics.reifiedOperationMarker(6, "K");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        SerialDescriptor serialDescriptor = SerializersKt.serializer(null).getDescriptor();
        Intrinsics.reifiedOperationMarker(6, "V");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return SerialDescriptorsKt.mapSerialDescriptor(serialDescriptor, SerializersKt.serializer(null).getDescriptor());
    }

    @NotNull
    public static final SerialDescriptor getNullable(@NotNull SerialDescriptor $this$nullable) {
        Intrinsics.checkNotNullParameter($this$nullable, "<this>");
        if ($this$nullable.isNullable()) {
            return $this$nullable;
        }
        return new SerialDescriptorForNullable($this$nullable);
    }

    public static /* synthetic */ SerialDescriptor buildSerialDescriptor$default(String string, SerialKind serialKind, SerialDescriptor[] serialDescriptorArray, Function1 function1, int n, Object object) {
        if ((n & 8) != 0) {
            function1 = buildSerialDescriptor.1.INSTANCE;
        }
        return SerialDescriptorsKt.buildSerialDescriptor(string, serialKind, serialDescriptorArray, function1);
    }

    /*
     * WARNING - void declaration
     */
    public static final /* synthetic */ <T> void element(ClassSerialDescriptorBuilder $this$element, String elementName, List<? extends Annotation> annotations, boolean isOptional) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$element, "<this>");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        boolean $i$f$element = false;
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        SerialDescriptor descriptor2 = SerializersKt.serializer(null).getDescriptor();
        $this$element.element(elementName, descriptor2, annotations, (boolean)var3_3);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> SerialDescriptor listSerialDescriptor() {
        boolean $i$f$listSerialDescriptor = false;
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return SerialDescriptorsKt.listSerialDescriptor(SerializersKt.serializer(null).getDescriptor());
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final SerialDescriptor PrimitiveSerialDescriptor(@NotNull String serialName, @NotNull PrimitiveKind kind) {
        void var1_1;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (!(!StringsKt.isBlank(serialName))) {
            boolean bl = false;
            String string = "Blank serial names are prohibited";
            throw new IllegalArgumentException(string.toString());
        }
        return PrimitivesKt.PrimitiveDescriptorSafe(serialName, (PrimitiveKind)var1_1);
    }

    public static /* synthetic */ void getNullable$annotations(SerialDescriptor serialDescriptor) {
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> SerialDescriptor setSerialDescriptor() {
        boolean $i$f$setSerialDescriptor = false;
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return SerialDescriptorsKt.setSerialDescriptor(SerializersKt.serializer(null).getDescriptor());
    }

    /*
     * WARNING - void declaration
     */
    @InternalSerializationApi
    @NotNull
    public static final SerialDescriptor buildSerialDescriptor(@NotNull String serialName, @NotNull SerialKind kind, @NotNull SerialDescriptor[] typeParameters, @NotNull Function1<? super ClassSerialDescriptorBuilder, Unit> builder) {
        void var4_8;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!(!StringsKt.isBlank(serialName))) {
            boolean $i$a$-require-SerialDescriptorsKt$buildSerialDescriptor$32 = false;
            String $i$a$-require-SerialDescriptorsKt$buildSerialDescriptor$32 = "Blank serial names are prohibited";
            throw new IllegalArgumentException($i$a$-require-SerialDescriptorsKt$buildSerialDescriptor$32.toString());
        }
        if (!(!Intrinsics.areEqual(kind, StructureKind.CLASS.INSTANCE))) {
            boolean bl = false;
            String string = "For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead";
            throw new IllegalArgumentException(string.toString());
        }
        ClassSerialDescriptorBuilder sdBuilder = new ClassSerialDescriptorBuilder(serialName);
        builder.invoke(sdBuilder);
        return new SerialDescriptorImpl(serialName, kind, sdBuilder.getElementNames$kotlinx_serialization_core().size(), ArraysKt.toList(typeParameters), (ClassSerialDescriptorBuilder)var4_8);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void element$default(ClassSerialDescriptorBuilder $this$element_u24default, String elementName, List annotations, boolean isOptional, int n, Object object) {
        void var3_3;
        void var2_2;
        if ((n & 2) != 0) {
            annotations = CollectionsKt.emptyList();
        }
        if ((n & 4) != 0) {
            isOptional = false;
        }
        Intrinsics.checkNotNullParameter($this$element_u24default, "<this>");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        boolean $i$f$element = false;
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        SerialDescriptor descriptor2 = SerializersKt.serializer(null).getDescriptor();
        $this$element_u24default.element(elementName, descriptor2, (List<? extends Annotation>)var2_2, (boolean)var3_3);
    }

    @NotNull
    public static final SerialDescriptor serialDescriptor(@NotNull KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(type).getDescriptor();
    }

    public static /* synthetic */ SerialDescriptor buildClassSerialDescriptor$default(String string, SerialDescriptor[] serialDescriptorArray, Function1 function1, int n, Object object) {
        if ((n & 4) != 0) {
            function1 = buildClassSerialDescriptor.1.INSTANCE;
        }
        return SerialDescriptorsKt.buildClassSerialDescriptor(string, serialDescriptorArray, function1);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final SerialDescriptor buildClassSerialDescriptor(@NotNull String serialName, @NotNull SerialDescriptor[] typeParameters, @NotNull Function1<? super ClassSerialDescriptorBuilder, Unit> builderAction) {
        void var3_5;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (!(!StringsKt.isBlank(serialName))) {
            boolean bl = false;
            String string = "Blank serial names are prohibited";
            throw new IllegalArgumentException(string.toString());
        }
        ClassSerialDescriptorBuilder sdBuilder = new ClassSerialDescriptorBuilder(serialName);
        builderAction.invoke(sdBuilder);
        return new SerialDescriptorImpl(serialName, StructureKind.CLASS.INSTANCE, sdBuilder.getElementNames$kotlinx_serialization_core().size(), ArraysKt.toList(typeParameters), (ClassSerialDescriptorBuilder)var3_5);
    }
}

