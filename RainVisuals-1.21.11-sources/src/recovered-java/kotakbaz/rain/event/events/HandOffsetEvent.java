/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Hand
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2={"Loxxxde/\u0633\u0639;", "", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_1799;", "stack", "Lnet/minecraft/class_1268;", "hand", "<init>", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_1799;Lnet/minecraft/class_1268;)V", "Lnet/minecraft/class_4587;", "getMatrices", "()Lnet/minecraft/class_4587;", "Lnet/minecraft/class_1799;", "getStack", "()Lnet/minecraft/class_1799;", "Lnet/minecraft/class_1268;", "getHand", "()Lnet/minecraft/class_1268;", "rain-visuals"})
public final class HandOffsetEvent {
    @NotNull
    private final Hand hand;
    @NotNull
    private final ItemStack stack;
    @NotNull
    private final MatrixStack matrices;

    @NotNull
    public final MatrixStack getMatrices() {
        return this.matrices;
    }

    @NotNull
    public final ItemStack getStack() {
        return this.stack;
    }

    @NotNull
    public final Hand getHand() {
        return this.hand;
    }

    public HandOffsetEvent(@NotNull MatrixStack matrices, @NotNull ItemStack stack, @NotNull Hand hand) {
        Intrinsics.checkNotNullParameter(matrices, "matrices");
        Intrinsics.checkNotNullParameter(stack, "stack");
        Intrinsics.checkNotNullParameter(hand, "hand");
        this.matrices = matrices;
        this.stack = stack;
        this.hand = hand;
    }
}

