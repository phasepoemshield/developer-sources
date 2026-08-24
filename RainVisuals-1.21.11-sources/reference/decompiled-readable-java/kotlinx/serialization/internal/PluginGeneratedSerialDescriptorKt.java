/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aP\u0010\n\u001a\u00020\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0080\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0011"}, d2={"Lkotlinx/serialization/descriptors/SerialDescriptor;", "SD", "", "other", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "otherDescriptor", "", "typeParamsAreEqual", "equalsImpl", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "", "typeParams", "", "hashCodeImpl", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "kotlinx-serialization-core"})
public final class PluginGeneratedSerialDescriptorKt {
    /*
     * WARNING - void declaration
     */
    public static final /* synthetic */ <SD extends SerialDescriptor> boolean equalsImpl(SD $this$equalsImpl, Object other, Function1<? super SD, Boolean> typeParamsAreEqual) {
        Intrinsics.checkNotNullParameter($this$equalsImpl, "<this>");
        Intrinsics.checkNotNullParameter(typeParamsAreEqual, "typeParamsAreEqual");
        boolean $i$f$equalsImpl = false;
        if ($this$equalsImpl == other) {
            return true;
        }
        Intrinsics.reifiedOperationMarker(3, "SD");
        if (!(other instanceof SerialDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual($this$equalsImpl.getSerialName(), ((SerialDescriptor)other).getSerialName())) {
            return false;
        }
        if (!typeParamsAreEqual.invoke(other).booleanValue()) {
            return false;
        }
        if ($this$equalsImpl.getElementsCount() != ((SerialDescriptor)other).getElementsCount()) {
            return false;
        }
        int index = 0;
        int n = $this$equalsImpl.getElementsCount();
        while (index < n) {
            void var4_4;
            if (!Intrinsics.areEqual($this$equalsImpl.getElementDescriptor(index).getSerialName(), ((SerialDescriptor)other).getElementDescriptor(index).getSerialName())) {
                return false;
            }
            if (!Intrinsics.areEqual($this$equalsImpl.getElementDescriptor(index).getKind(), ((SerialDescriptor)other).getElementDescriptor(index).getKind())) {
                return false;
            }
            ++var4_4;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static final int hashCodeImpl(@NotNull SerialDescriptor $this$hashCodeImpl, @NotNull SerialDescriptor[] typeParams) {
        void var5_5;
        void var4_27;
        int n;
        int n2;
        Object object;
        int n3;
        Intrinsics.checkNotNullParameter($this$hashCodeImpl, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int result = $this$hashCodeImpl.getSerialName().hashCode();
        result = 31 * result + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> elementDescriptors2 = SerialDescriptorKt.getElementDescriptors($this$hashCodeImpl);
        Iterable<SerialDescriptor> $this$elementsHashCodeBy$iv = elementDescriptors2;
        boolean $i$f$elementsHashCodeBy = false;
        Iterable<SerialDescriptor> $this$fold$iv$iv = $this$elementsHashCodeBy$iv;
        int initial$iv$iv = 1;
        boolean $i$f$fold = false;
        int accumulator$iv$iv = initial$iv$iv;
        Iterator<SerialDescriptor> iterator2 = $this$fold$iv$iv.iterator();
        while (iterator2.hasNext()) {
            SerialDescriptor element$iv$iv;
            SerialDescriptor element$iv = element$iv$iv = iterator2.next();
            int hash$iv = accumulator$iv$iv;
            boolean bl = false;
            SerialDescriptor it = element$iv;
            n3 = 31 * hash$iv;
            boolean bl2 = false;
            object = it.getSerialName();
            String string = object;
            accumulator$iv$iv = n3 + (string != null ? string.hashCode() : 0);
        }
        int namesHash = accumulator$iv$iv;
        Iterable<SerialDescriptor> $this$elementsHashCodeBy$iv2 = elementDescriptors2;
        boolean $i$f$elementsHashCodeBy2 = false;
        Iterable<SerialDescriptor> $this$fold$iv$iv2 = $this$elementsHashCodeBy$iv2;
        int initial$iv$iv2 = 1;
        boolean $i$f$fold2 = false;
        int accumulator$iv$iv2 = initial$iv$iv2;
        Iterator<SerialDescriptor> iterator3 = $this$fold$iv$iv2.iterator();
        while (iterator3.hasNext()) {
            void var17_24;
            SerialDescriptor element$iv$iv;
            SerialDescriptor element$iv = element$iv$iv = iterator3.next();
            int hash$iv = accumulator$iv$iv2;
            boolean bl = false;
            SerialDescriptor it = element$iv;
            n3 = 31 * hash$iv;
            boolean bl3 = false;
            Object object2 = object = var17_24.getKind();
            n2 = n3 + (object2 != null ? object2.hashCode() : 0);
        }
        void kindHash = n2;
        n = 31 * n + var4_27;
        n = 31 * n + var5_5;
        return n;
    }
}

