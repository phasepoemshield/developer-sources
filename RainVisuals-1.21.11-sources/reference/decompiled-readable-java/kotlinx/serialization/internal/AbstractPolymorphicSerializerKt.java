/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001\u00a2\u0006\u0004\b\u0005\u0010\b\u00a8\u0006\t"}, d2={"", "subClassName", "Lkotlin/reflect/KClass;", "baseClass", "", "throwSubtypeNotRegistered", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Void;", "subClass", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Ljava/lang/Void;", "kotlinx-serialization-core"})
public final class AbstractPolymorphicSerializerKt {
    @JvmName(name="throwSubtypeNotRegistered")
    @NotNull
    public static final Void throwSubtypeNotRegistered(@NotNull KClass<?> subClass, @NotNull KClass<?> baseClass) {
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String string = subClass.getSimpleName();
        if (string == null) {
            string = String.valueOf(subClass);
        }
        AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(string, baseClass);
        throw new KotlinNothingValueException();
    }

    @JvmName(name="throwSubtypeNotRegistered")
    @NotNull
    public static final Void throwSubtypeNotRegistered(@Nullable String subClassName, @NotNull KClass<?> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String scope = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        throw new SerializationException(subClassName == null ? "Class discriminator was missing and no default serializers were registered " + scope + '.' : "Serializer for subclass '" + subClassName + "' is not found " + scope + ".\nCheck if class with serial name '" + subClassName + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + subClassName + "' has to be '@Serializable', and the base class '" + baseClass.getSimpleName() + "' has to be sealed and '@Serializable'.");
    }
}

