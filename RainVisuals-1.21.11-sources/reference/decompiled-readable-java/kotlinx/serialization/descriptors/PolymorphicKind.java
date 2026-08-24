/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2={"Lkotlinx/serialization/descriptors/PolymorphicKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "<init>", "()V", "OPEN", "SEALED", "Lkotlinx/serialization/descriptors/PolymorphicKind$OPEN;", "Lkotlinx/serialization/descriptors/PolymorphicKind$SEALED;", "kotlinx-serialization-core"})
@ExperimentalSerializationApi
public abstract class PolymorphicKind
extends SerialKind {
    public /* synthetic */ PolymorphicKind(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    private PolymorphicKind() {
        super(null);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlinx/serialization/descriptors/PolymorphicKind$OPEN;", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "<init>", "()V", "kotlinx-serialization-core"})
    public static final class OPEN
    extends PolymorphicKind {
        @NotNull
        public static final OPEN INSTANCE = new OPEN();

        private OPEN() {
            super(null);
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlinx/serialization/descriptors/PolymorphicKind$SEALED;", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "<init>", "()V", "kotlinx-serialization-core"})
    public static final class SEALED
    extends PolymorphicKind {
        @NotNull
        public static final SEALED INSTANCE = new SEALED();

        private SEALED() {
            super(null);
        }
    }
}

