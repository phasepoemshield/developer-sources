/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\t\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2={"Lkotlinx/serialization/descriptors/SerialKind;", "", "<init>", "()V", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "CONTEXTUAL", "ENUM", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"})
public abstract class SerialKind {
    private SerialKind() {
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    @NotNull
    public String toString() {
        String string = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public /* synthetic */ SerialKind(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/SerialKind;", "<init>", "()V", "kotlinx-serialization-core"})
    @ExperimentalSerializationApi
    public static final class ENUM
    extends SerialKind {
        @NotNull
        public static final ENUM INSTANCE = new ENUM();

        private ENUM() {
            super(null);
        }
    }

    @ExperimentalSerializationApi
    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind;", "<init>", "()V", "kotlinx-serialization-core"})
    public static final class CONTEXTUAL
    extends SerialKind {
        @NotNull
        public static final CONTEXTUAL INSTANCE = new CONTEXTUAL();

        private CONTEXTUAL() {
            super(null);
        }
    }
}

