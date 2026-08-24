/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2={"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "index", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "elementDescriptors$delegate", "Lkotlin/Lazy;", "getElementDescriptors", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-core"})
@PublishedApi
public final class EnumDescriptor
extends PluginGeneratedSerialDescriptor {
    @NotNull
    private final SerialKind kind;
    @NotNull
    private final Lazy elementDescriptors$delegate;

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        void var1_1;
        SerialDescriptor[] $this$getChecked$iv = this.getElementDescriptors();
        boolean $i$f$getChecked = false;
        return $this$getChecked$iv[var1_1];
    }

    public EnumDescriptor(@NotNull String name, int elementsCount) {
        Intrinsics.checkNotNullParameter(name, "name");
        super(name, null, elementsCount, 2, null);
        this.kind = SerialKind.ENUM.INSTANCE;
        this.elementDescriptors$delegate = LazyKt.lazy((Function0)new Function0<SerialDescriptor[]>(elementsCount, name, this){
            final /* synthetic */ int $elementsCount;
            final /* synthetic */ String $name;
            final /* synthetic */ EnumDescriptor this$0;
            {
                this.$elementsCount = $elementsCount;
                this.$name = $name;
                this.this$0 = $receiver;
                super(0);
            }

            @NotNull
            public final SerialDescriptor[] invoke() {
                int n = 0;
                int n2 = this.$elementsCount;
                SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[n2];
                while (n < n2) {
                    int n3 = n++;
                    serialDescriptorArray[n3] = SerialDescriptorsKt.buildSerialDescriptor$default(this.$name + '.' + this.this$0.getElementName(n3), StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], null, 8, null);
                }
                return serialDescriptorArray;
            }
        });
    }

    @Override
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof SerialDescriptor)) {
            return false;
        }
        if (((SerialDescriptor)other).getKind() != SerialKind.ENUM.INSTANCE) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getSerialName(), ((SerialDescriptor)other).getSerialName())) {
            return false;
        }
        if (!Intrinsics.areEqual(Platform_commonKt.cachedSerialNames(this), Platform_commonKt.cachedSerialNames((SerialDescriptor)other))) {
            return false;
        }
        return true;
    }

    @Override
    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(SerialDescriptorKt.getElementNames(this), ", ", this.getSerialName() + '(', ")", 0, null, null, 56, null);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int hashCode() {
        void var2_17;
        int n;
        int n2;
        void $this$fold$iv$iv;
        int result = this.getSerialName().hashCode();
        Iterable<String> $this$elementsHashCodeBy$iv = SerialDescriptorKt.getElementNames(this);
        boolean $i$f$elementsHashCodeBy = false;
        Iterable<String> iterable = $this$elementsHashCodeBy$iv;
        int initial$iv$iv = 1;
        boolean $i$f$fold = false;
        int accumulator$iv$iv = initial$iv$iv;
        Iterator iterator2 = $this$fold$iv$iv.iterator();
        while (iterator2.hasNext()) {
            void var14_13;
            void var17_16;
            Object element$iv$iv;
            Object element$iv = element$iv$iv = iterator2.next();
            int hash$iv = accumulator$iv$iv;
            boolean bl = false;
            String it = (String)element$iv;
            int n3 = 31 * hash$iv;
            boolean bl2 = false;
            void v0 = var17_16 = var14_13;
            n2 = n3 + (v0 != null ? v0.hashCode() : 0);
        }
        void elementsHashCode = n2;
        n = 31 * n + var2_17;
        return n;
    }

    @Override
    @NotNull
    public SerialKind getKind() {
        return this.kind;
    }

    private final SerialDescriptor[] getElementDescriptors() {
        Lazy lazy = this.elementDescriptors$delegate;
        return (SerialDescriptor[])lazy.getValue();
    }
}

