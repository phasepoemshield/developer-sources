/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000B\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0000H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\n0\u0000H\u0007\u00a2\u0006\u0004\b\u000b\u0010\u0004\u001a\u0019\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00020\fH\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00070\fH\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0017\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\n0\fH\u0007\u00a2\u0006\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2={"", "Lkotlin/UByte;", "Lkotlin/UInt;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sum", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "", "Lkotlin/UByteArray;", "toUByteArray", "(Ljava/util/Collection;)[B", "Lkotlin/UIntArray;", "toUIntArray", "(Ljava/util/Collection;)[I", "Lkotlin/ULongArray;", "toULongArray", "(Ljava/util/Collection;)[J", "Lkotlin/UShortArray;", "toUShortArray", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, xs="kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.3")
    @NotNull
    @ExperimentalUnsignedTypes
    public static final int[] toUIntArray(@NotNull Collection<UInt> $this$toUIntArray) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$toUIntArray, "<this>");
        int[] result = UIntArray.constructor-impl($this$toUIntArray.size());
        int index = 0;
        Iterator<UInt> iterator2 = $this$toUIntArray.iterator();
        while (iterator2.hasNext()) {
            int element = iterator2.next().unbox-impl();
            UIntArray.set-VXSXFK8(result, index++, element);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.3")
    @NotNull
    @ExperimentalUnsignedTypes
    public static final byte[] toUByteArray(@NotNull Collection<UByte> $this$toUByteArray) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$toUByteArray, "<this>");
        byte[] result = UByteArray.constructor-impl($this$toUByteArray.size());
        int index = 0;
        Iterator<UByte> iterator2 = $this$toUByteArray.iterator();
        while (iterator2.hasNext()) {
            byte element = iterator2.next().unbox-impl();
            UByteArray.set-VurrAj0(result, index++, element);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.5")
    @JvmName(name="sumOfULong")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final long sumOfULong(@NotNull Iterable<ULong> $this$sum) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        long sum = 0L;
        Iterator<ULong> iterator2 = $this$sum.iterator();
        while (iterator2.hasNext()) {
            long element = iterator2.next().unbox-impl();
            sum = ULong.constructor-impl(sum + element);
        }
        return (long)var1_1;
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    @JvmName(name="sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable<UShort> $this$sum) {
        int n;
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        Iterator<UShort> iterator2 = $this$sum.iterator();
        while (iterator2.hasNext()) {
            short element = iterator2.next().unbox-impl();
            n = UInt.constructor-impl(sum + UInt.constructor-impl(element & 0xFFFF));
        }
        return n;
    }

    @JvmName(name="sumOfUByte")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final int sumOfUByte(@NotNull Iterable<UByte> $this$sum) {
        int n;
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        Iterator<UByte> iterator2 = $this$sum.iterator();
        while (iterator2.hasNext()) {
            byte element = iterator2.next().unbox-impl();
            n = UInt.constructor-impl(sum + UInt.constructor-impl(element & 0xFF));
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    public static final long[] toULongArray(@NotNull Collection<ULong> $this$toULongArray) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$toULongArray, "<this>");
        long[] result = ULongArray.constructor-impl($this$toULongArray.size());
        int index = 0;
        Iterator<ULong> iterator2 = $this$toULongArray.iterator();
        while (iterator2.hasNext()) {
            long element = iterator2.next().unbox-impl();
            ULongArray.set-k8EXiF4(result, index++, element);
        }
        return var1_1;
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    @JvmName(name="sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<UInt> $this$sum) {
        int n;
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        Iterator<UInt> iterator2 = $this$sum.iterator();
        while (iterator2.hasNext()) {
            int element = iterator2.next().unbox-impl();
            n = UInt.constructor-impl(sum + element);
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.3")
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> $this$toUShortArray) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$toUShortArray, "<this>");
        short[] result = UShortArray.constructor-impl($this$toUShortArray.size());
        int index = 0;
        Iterator<UShort> iterator2 = $this$toUShortArray.iterator();
        while (iterator2.hasNext()) {
            short element = iterator2.next().unbox-impl();
            UShortArray.set-01HTLdE(result, index++, element);
        }
        return var1_1;
    }
}

