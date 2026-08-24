/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u001e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"", "seenArray", "goldenMaskArray", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "throwArrayMissingFieldException", "([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "seen", "goldenMask", "throwMissingFieldException", "(IILkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"})
public final class PluginExceptionsKt {
    /*
     * WARNING - void declaration
     */
    @InternalSerializationApi
    public static final void throwArrayMissingFieldException(@NotNull int[] seenArray, @NotNull int[] goldenMaskArray, @NotNull SerialDescriptor descriptor2) {
        void var2_2;
        Intrinsics.checkNotNullParameter(seenArray, "seenArray");
        Intrinsics.checkNotNullParameter(goldenMaskArray, "goldenMaskArray");
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        List missingFields = new ArrayList();
        int maskSlot = 0;
        int n = goldenMaskArray.length;
        while (maskSlot < n) {
            void var4_4;
            int missingFieldsBits = goldenMaskArray[maskSlot] & ~seenArray[maskSlot];
            if (missingFieldsBits != 0) {
                int i = 0;
                while (i < 32) {
                    void var7_7;
                    if ((missingFieldsBits & 1) != 0) {
                        ((Collection)missingFields).add(descriptor2.getElementName(maskSlot * 32 + i));
                    }
                    int n2 = missingFieldsBits >>> 1;
                    ++var7_7;
                }
            }
            ++var4_4;
        }
        throw new MissingFieldException(missingFields, var2_2.getSerialName());
    }

    /*
     * WARNING - void declaration
     */
    @InternalSerializationApi
    public static final void throwMissingFieldException(int seen, int goldenMask, @NotNull SerialDescriptor descriptor2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        List missingFields = new ArrayList();
        int missingFieldsBits = goldenMask & ~seen;
        int i = 0;
        while (i < 32) {
            void var5_5;
            if ((missingFieldsBits & 1) != 0) {
                ((Collection)missingFields).add(descriptor2.getElementName(i));
            }
            missingFieldsBits >>>= 1;
            ++var5_5;
        }
        throw new MissingFieldException(missingFields, descriptor2.getSerialName());
    }
}

