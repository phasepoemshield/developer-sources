/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.util.math.MatrixStack
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.util.math.MatrixStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u0012H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u00020\u0015H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\u00a8\u0006\u001c"}, d2={"Loxxxde/\u0634\u062b;", "", "Lnet/minecraft/class_4587;", "matrices", "", "partialTicks", "<init>", "(Lnet/minecraft/class_4587;F)V", "component1", "()Lnet/minecraft/class_4587;", "component2", "()F", "copy", "(Lnet/minecraft/class_4587;F)Lkotakbaz/rain/event/events/Render3DEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lnet/minecraft/class_4587;", "getMatrices", "F", "getPartialTicks", "rain-visuals"})
public final class Render3DEvent {
    private final float partialTicks;
    @NotNull
    private final MatrixStack matrices;

    public int hashCode() {
        int result = this.matrices.hashCode();
        result = result * 31 + Float.hashCode(this.partialTicks);
        return result;
    }

    public final float component2() {
        return this.partialTicks;
    }

    @NotNull
    public String toString() {
        return "Render3DEvent(matrices=" + this.matrices + ", partialTicks=" + this.partialTicks + ")";
    }

    @NotNull
    public final Render3DEvent copy(@NotNull MatrixStack matrices, float partialTicks) {
        Intrinsics.checkNotNullParameter(matrices, "matrices");
        return new Render3DEvent(matrices, partialTicks);
    }

    @NotNull
    public final MatrixStack component1() {
        return this.matrices;
    }

    @NotNull
    public final MatrixStack getMatrices() {
        return this.matrices;
    }

    public final float getPartialTicks() {
        return this.partialTicks;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Render3DEvent)) {
            return false;
        }
        Render3DEvent render3DEvent = (Render3DEvent)other;
        if (!Intrinsics.areEqual(this.matrices, render3DEvent.matrices)) {
            return false;
        }
        if (Float.compare(this.partialTicks, render3DEvent.partialTicks) != 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Render3DEvent copy$default(Render3DEvent render3DEvent, MatrixStack matrixStack, float f, int n, Object object) {
        if ((n & 1) != 0) {
            matrixStack = render3DEvent.matrices;
        }
        if ((n & 2) != 0) {
            f = render3DEvent.partialTicks;
        }
        return render3DEvent.copy(matrixStack, f);
    }

    public Render3DEvent(@NotNull MatrixStack matrices, float partialTicks) {
        Intrinsics.checkNotNullParameter(matrices, "matrices");
        this.matrices = matrices;
        this.partialTicks = partialTicks;
    }
}

