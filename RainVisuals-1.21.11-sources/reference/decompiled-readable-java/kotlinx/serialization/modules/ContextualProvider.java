/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u00a6\u0002\u00a2\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f\u00a8\u0006\r"}, d2={"Lkotlinx/serialization/modules/ContextualProvider;", "", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Argless", "WithTypeArguments", "Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "kotlinx-serialization-core"})
public abstract class ContextualProvider {
    @NotNull
    public abstract KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> var1);

    private ContextualProvider() {
    }

    public /* synthetic */ ContextualProvider(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B8\u0012/\u0010\b\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002\u00a2\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fR@\u0010\b\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "Lkotlinx/serialization/modules/ContextualProvider;", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Lkotlin/jvm/functions/Function1;", "getProvider", "()Lkotlin/jvm/functions/Function1;", "kotlinx-serialization-core"})
    public static final class WithTypeArguments
    extends ContextualProvider {
        @NotNull
        private final Function1<List<? extends KSerializer<?>>, KSerializer<?>> provider;

        public WithTypeArguments(@NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            super(null);
            this.provider = provider;
        }

        @Override
        @NotNull
        public KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.provider.invoke(typeArgumentsSerializers);
        }

        @NotNull
        public final Function1<List<? extends KSerializer<?>>, KSerializer<?>> getProvider() {
            return this.provider;
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000eH\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2={"Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider;", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "typeArgumentsSerializers", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/KSerializer;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"})
    public static final class Argless
    extends ContextualProvider {
        @NotNull
        private final KSerializer<?> serializer;

        @Override
        @NotNull
        public KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.serializer;
        }

        public Argless(@NotNull KSerializer<?> serializer2) {
            Intrinsics.checkNotNullParameter(serializer2, "serializer");
            super(null);
            this.serializer = serializer2;
        }

        public int hashCode() {
            return this.serializer.hashCode();
        }

        @NotNull
        public final KSerializer<?> getSerializer() {
            return this.serializer;
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof Argless && Intrinsics.areEqual(((Argless)other).serializer, this.serializer);
        }
    }
}

