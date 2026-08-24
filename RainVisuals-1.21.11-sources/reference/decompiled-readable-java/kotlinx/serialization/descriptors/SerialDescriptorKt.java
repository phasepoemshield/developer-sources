/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\"$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00008FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\b\u0010\u0003\u00a8\u0006\u000b"}, d2={"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "getElementDescriptors", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Iterable;", "getElementDescriptors$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "elementDescriptors", "", "getElementNames", "getElementNames$annotations", "elementNames", "kotlinx-serialization-core"})
public final class SerialDescriptorKt {
    @NotNull
    public static final Iterable<String> getElementNames(@NotNull SerialDescriptor $this$elementNames) {
        Intrinsics.checkNotNullParameter($this$elementNames, "<this>");
        return new Iterable<String>($this$elementNames){
            final /* synthetic */ SerialDescriptor $this_elementNames$inlined;

            @NotNull
            public Iterator<String> iterator() {
                boolean bl = false;
                return new Iterator<String>(this.$this_elementNames$inlined){
                    final /* synthetic */ SerialDescriptor $this_elementNames;
                    private int elementsLeft;

                    public void remove() {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }

                    @NotNull
                    public String next() {
                        int n = this.elementsLeft;
                        this.elementsLeft = n + -1;
                        return this.$this_elementNames.getElementName(this.$this_elementNames.getElementsCount() - n);
                    }
                    {
                        this.$this_elementNames = $receiver;
                        this.elementsLeft = $receiver.getElementsCount();
                    }

                    public boolean hasNext() {
                        return this.elementsLeft > 0;
                    }
                };
            }
            {
                this.$this_elementNames$inlined = serialDescriptor;
            }
        };
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getElementDescriptors$annotations(SerialDescriptor serialDescriptor) {
    }

    @NotNull
    public static final Iterable<SerialDescriptor> getElementDescriptors(@NotNull SerialDescriptor $this$elementDescriptors) {
        Intrinsics.checkNotNullParameter($this$elementDescriptors, "<this>");
        return new Iterable<SerialDescriptor>($this$elementDescriptors){
            final /* synthetic */ SerialDescriptor $this_elementDescriptors$inlined;
            {
                this.$this_elementDescriptors$inlined = serialDescriptor;
            }

            @NotNull
            public Iterator<SerialDescriptor> iterator() {
                boolean bl = false;
                return new Iterator<SerialDescriptor>(this.$this_elementDescriptors$inlined){
                    final /* synthetic */ SerialDescriptor $this_elementDescriptors;
                    private int elementsLeft;

                    public boolean hasNext() {
                        return this.elementsLeft > 0;
                    }

                    public void remove() {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                    {
                        this.$this_elementDescriptors = $receiver;
                        this.elementsLeft = $receiver.getElementsCount();
                    }

                    @NotNull
                    public SerialDescriptor next() {
                        int n = this.elementsLeft;
                        this.elementsLeft = n + -1;
                        return this.$this_elementDescriptors.getElementDescriptor(this.$this_elementDescriptors.getElementsCount() - n);
                    }
                };
            }
        };
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getElementNames$annotations(SerialDescriptor serialDescriptor) {
    }
}

