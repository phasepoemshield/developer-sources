/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CoreFriendModuleApi;
import org.jetbrains.annotations.NotNull;

@CoreFriendModuleApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u001c\u00a8\u0006\u001e"}, d2={"Lkotlinx/serialization/internal/ElementMarker;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function2;)V", "index", "", "mark", "(I)V", "markHigh", "nextUnmarkedHighIndex", "()I", "nextUnmarkedIndex", "elementsCount", "", "prepareHighMarksArray", "(I)[J", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "highMarksArray", "[J", "", "lowerMarks", "J", "Lkotlin/jvm/functions/Function2;", "Companion", "kotlinx-serialization-core"})
public final class ElementMarker {
    @NotNull
    private static final Companion Companion = new Companion(null);
    @NotNull
    private final Function2<SerialDescriptor, Integer, Boolean> readIfAbsent;
    private long lowerMarks;
    @NotNull
    private static final long[] EMPTY_HIGH_MARKS = new long[0];
    @NotNull
    private final SerialDescriptor descriptor;
    @NotNull
    private final long[] highMarksArray;

    /*
     * WARNING - void declaration
     */
    public ElementMarker(@NotNull SerialDescriptor descriptor2, @NotNull Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.descriptor = descriptor2;
        this.readIfAbsent = readIfAbsent;
        int elementsCount = this.descriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.lowerMarks = elementsCount == 64 ? 0L : -1L << elementsCount;
            this.highMarksArray = EMPTY_HIGH_MARKS;
        } else {
            void var3_3;
            this.lowerMarks = 0L;
            this.highMarksArray = this.prepareHighMarksArray((int)var3_3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final int nextUnmarkedIndex() {
        int elementsCount = this.descriptor.getElementsCount();
        while (this.lowerMarks != -1L) {
            void var2_2;
            int index = Long.numberOfTrailingZeros(this.lowerMarks ^ 0xFFFFFFFFFFFFFFFFL);
            this.lowerMarks |= 1L << index;
            if (!this.readIfAbsent.invoke(this.descriptor, index).booleanValue()) continue;
            return (int)var2_2;
        }
        if (elementsCount > 64) {
            return this.nextUnmarkedHighIndex();
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private final void markHigh(int index) {
        void var3_3;
        int slot = (index >>> 6) - 1;
        int offsetInSlot = index & 0x3F;
        this.highMarksArray[slot] = this.highMarksArray[slot] | 1L << var3_3;
    }

    public final void mark(int index) {
        if (index < 64) {
            this.lowerMarks |= 1L << index;
        } else {
            this.markHigh(index);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final int nextUnmarkedHighIndex() {
        int n = this.highMarksArray.length;
        for (int slot = 0; slot < n; ++slot) {
            void var4_4;
            int indexInSlot;
            int slotOffset = (slot + 1) * 64;
            for (long slotMarks = this.highMarksArray[slot]; slotMarks != -1L; slotMarks |= 1L << indexInSlot) {
                void var7_6;
                indexInSlot = Long.numberOfTrailingZeros(slotMarks ^ 0xFFFFFFFFFFFFFFFFL);
                int index = slotOffset + indexInSlot;
                if (!this.readIfAbsent.invoke(this.descriptor, index).booleanValue()) continue;
                this.highMarksArray[slot] = slotMarks;
                return (int)var7_6;
            }
            this.highMarksArray[slot] = var4_4;
        }
        return -1;
    }

    private final long[] prepareHighMarksArray(int elementsCount) {
        int slotsCount = elementsCount + -1 >>> 6;
        int elementsInLastSlot = elementsCount & 0x3F;
        long[] highMarks = new long[slotsCount];
        if (elementsInLastSlot != 0) {
            highMarks[ArraysKt.getLastIndex((long[])highMarks)] = -1L << elementsCount;
        }
        return highMarks;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlinx/serialization/internal/ElementMarker$Companion;", "", "<init>", "()V", "", "EMPTY_HIGH_MARKS", "[J", "kotlinx-serialization-core"})
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

