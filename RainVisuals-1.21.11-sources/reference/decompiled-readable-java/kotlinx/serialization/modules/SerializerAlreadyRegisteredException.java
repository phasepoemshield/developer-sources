/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B!\b\u0010\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\u0006\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "Lkotlin/reflect/KClass;", "baseClass", "concreteClass", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)V", "", "msg", "(Ljava/lang/String;)V", "kotlinx-serialization-core"})
final class SerializerAlreadyRegisteredException
extends IllegalArgumentException {
    public SerializerAlreadyRegisteredException(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super(msg);
    }

    public SerializerAlreadyRegisteredException(@NotNull KClass<?> baseClass, @NotNull KClass<?> concreteClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
    }
}

