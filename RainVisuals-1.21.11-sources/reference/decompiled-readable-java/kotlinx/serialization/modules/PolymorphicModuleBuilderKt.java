/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.PolymorphicModuleBuilder;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0086\b\u00a2\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0086\b\u00a2\u0006\u0004\b\u0007\u0010\u000b\u00a8\u0006\f"}, d2={"", "Base", "T", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "Lkotlin/reflect/KClass;", "clazz", "", "subclass", "(Lkotlinx/serialization/modules/PolymorphicModuleBuilder;Lkotlin/reflect/KClass;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "(Lkotlinx/serialization/modules/PolymorphicModuleBuilder;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"})
public final class PolymorphicModuleBuilderKt {
    public static final /* synthetic */ <Base, T extends Base> void subclass(PolymorphicModuleBuilder<? super Base> $this$subclass, KClass<T> clazz) {
        Intrinsics.checkNotNullParameter($this$subclass, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        boolean $i$f$subclass = false;
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        $this$subclass.subclass(clazz, SerializersKt.serializer(null));
    }

    public static final /* synthetic */ <Base, T extends Base> void subclass(PolymorphicModuleBuilder<? super Base> $this$subclass, KSerializer<T> serializer2) {
        Intrinsics.checkNotNullParameter($this$subclass, "<this>");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        boolean $i$f$subclass = false;
        Intrinsics.reifiedOperationMarker(4, "T");
        $this$subclass.subclass(Reflection.getOrCreateKotlinClass(Object.class), serializer2);
    }
}

