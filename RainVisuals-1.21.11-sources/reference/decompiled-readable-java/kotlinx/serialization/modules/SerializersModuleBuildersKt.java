/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.PolymorphicModuleBuilder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import kotlinx.serialization.modules.SerializersModuleKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\b\u0001\u0010\u0002\u001a,\u0010\b\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0010\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a*\u0010\u0010\u001a\u00020\u0000\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\b\u00a2\u0006\u0004\b\u0010\u0010\u0012\u001a.\u0010\u0013\u001a\u00020\u0005\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\n*\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\b\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001ab\u0010\u0019\u001a\u00020\u0005\"\b\b\u0000\u0010\u0015*\u00020\n*\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u001f\b\u0002\u0010\u0007\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001b"}, d2={"Lkotlinx/serialization/modules/SerializersModule;", "EmptySerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "SerializersModule", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/modules/SerializersModule;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "serializersModuleOf", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/modules/SerializersModule;", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/modules/SerializersModule;", "contextual", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;Lkotlinx/serialization/KSerializer;)V", "Base", "baseClass", "baseSerializer", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "polymorphic", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-core"})
public final class SerializersModuleBuildersKt {
    public static final /* synthetic */ <T> SerializersModule serializersModuleOf(KSerializer<T> serializer2) {
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        boolean $i$f$serializersModuleOf = false;
        Intrinsics.reifiedOperationMarker(4, "T");
        return SerializersModuleBuildersKt.serializersModuleOf(Reflection.getOrCreateKotlinClass(Object.class), serializer2);
    }

    public static final <Base> void polymorphic(@NotNull SerializersModuleBuilder $this$polymorphic, @NotNull KClass<Base> baseClass, @Nullable KSerializer<Base> baseSerializer, @NotNull Function1<? super PolymorphicModuleBuilder<? super Base>, Unit> builderAction) {
        SerializersModuleBuilder serializersModuleBuilder;
        Intrinsics.checkNotNullParameter($this$polymorphic, "<this>");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        boolean $i$f$polymorphic = false;
        PolymorphicModuleBuilder<Base> builder = new PolymorphicModuleBuilder<Base>(baseClass, baseSerializer);
        builderAction.invoke(builder);
        builder.buildTo(serializersModuleBuilder);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <T> SerializersModule serializersModuleOf(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer2) {
        void var3_3;
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        boolean $i$f$SerializersModule = false;
        SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
        SerializersModuleBuilder $this$serializersModuleOf_u24lambda_u240 = builder$iv;
        boolean bl = false;
        $this$serializersModuleOf_u24lambda_u240.contextual(kClass, serializer2);
        return var3_3.build();
    }

    @NotNull
    public static final SerializersModule EmptySerializersModule() {
        return SerializersModuleKt.getEmptySerializersModule();
    }

    public static final /* synthetic */ <T> void contextual(SerializersModuleBuilder $this$contextual, KSerializer<T> serializer2) {
        Intrinsics.checkNotNullParameter($this$contextual, "<this>");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        boolean $i$f$contextual = false;
        Intrinsics.reifiedOperationMarker(4, "T");
        $this$contextual.contextual(Reflection.getOrCreateKotlinClass(Object.class), serializer2);
    }

    @NotNull
    public static final SerializersModule SerializersModule(@NotNull Function1<? super SerializersModuleBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        boolean $i$f$SerializersModule = false;
        SerializersModuleBuilder builder = new SerializersModuleBuilder();
        builderAction.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ void polymorphic$default(SerializersModuleBuilder $this$polymorphic_u24default, KClass baseClass, KSerializer baseSerializer, Function1 builderAction, int n, Object object) {
        SerializersModuleBuilder serializersModuleBuilder;
        if ((n & 2) != 0) {
            baseSerializer = null;
        }
        if ((n & 4) != 0) {
            builderAction = polymorphic.1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter($this$polymorphic_u24default, "<this>");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        boolean $i$f$polymorphic = false;
        PolymorphicModuleBuilder builder = new PolymorphicModuleBuilder(baseClass, baseSerializer);
        builderAction.invoke(builder);
        ((PolymorphicModuleBuilder)object).buildTo(serializersModuleBuilder);
    }
}

