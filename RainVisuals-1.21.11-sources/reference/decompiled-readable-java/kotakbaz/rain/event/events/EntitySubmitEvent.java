/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.state.CameraRenderState
 *  net.minecraft.client.util.math.MatrixStack
 */
package kotakbaz.rain.event.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u00020\u001aH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u00020\u001dH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013\u00a8\u0006("}, d2={"Loxxxde/\u0628\u0629;", "", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_12075;", "cameraState", "Lnet/minecraft/class_11659;", "collector", "", "partialTicks", "<init>", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_12075;Lnet/minecraft/class_11659;F)V", "component1", "()Lnet/minecraft/class_4587;", "component2", "()Lnet/minecraft/class_12075;", "component3", "()Lnet/minecraft/class_11659;", "component4", "()F", "copy", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_12075;Lnet/minecraft/class_11659;F)Lkotakbaz/rain/event/events/EntitySubmitEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lnet/minecraft/class_4587;", "getMatrices", "Lnet/minecraft/class_12075;", "getCameraState", "Lnet/minecraft/class_11659;", "getCollector", "F", "getPartialTicks", "rain-visuals"})
public final class EntitySubmitEvent {
    @NotNull
    private final CameraRenderState cameraState;
    private final float partialTicks;
    @NotNull
    private final OrderedRenderCommandQueue collector;
    @NotNull
    private final MatrixStack matrices;

    public EntitySubmitEvent(@NotNull MatrixStack matrices, @NotNull CameraRenderState cameraState, @NotNull OrderedRenderCommandQueue collector, float partialTicks) {
        Intrinsics.checkNotNullParameter(matrices, "matrices");
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.matrices = matrices;
        this.cameraState = cameraState;
        this.collector = collector;
        this.partialTicks = partialTicks;
    }

    @NotNull
    public final MatrixStack getMatrices() {
        return this.matrices;
    }

    @NotNull
    public String toString() {
        return "EntitySubmitEvent(matrices=" + this.matrices + ", cameraState=" + this.cameraState + ", collector=" + this.collector + ", partialTicks=" + this.partialTicks + ")";
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntitySubmitEvent)) {
            return false;
        }
        EntitySubmitEvent entitySubmitEvent = (EntitySubmitEvent)other;
        if (!Intrinsics.areEqual(this.matrices, entitySubmitEvent.matrices)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cameraState, entitySubmitEvent.cameraState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.collector, entitySubmitEvent.collector)) {
            return false;
        }
        if (Float.compare(this.partialTicks, entitySubmitEvent.partialTicks) != 0) {
            return false;
        }
        return true;
    }

    @NotNull
    public final CameraRenderState component2() {
        return this.cameraState;
    }

    public int hashCode() {
        int result = this.matrices.hashCode();
        result = result * 31 + this.cameraState.hashCode();
        result = result * 31 + this.collector.hashCode();
        result = result * 31 + Float.hashCode(this.partialTicks);
        return result;
    }

    @NotNull
    public final EntitySubmitEvent copy(@NotNull MatrixStack matrices, @NotNull CameraRenderState cameraState, @NotNull OrderedRenderCommandQueue collector, float partialTicks) {
        Intrinsics.checkNotNullParameter(matrices, "matrices");
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        Intrinsics.checkNotNullParameter(collector, "collector");
        return new EntitySubmitEvent(matrices, cameraState, collector, partialTicks);
    }

    @NotNull
    public final OrderedRenderCommandQueue component3() {
        return this.collector;
    }

    @NotNull
    public final MatrixStack component1() {
        return this.matrices;
    }

    public final float component4() {
        return this.partialTicks;
    }

    public static /* synthetic */ EntitySubmitEvent copy$default(EntitySubmitEvent entitySubmitEvent, MatrixStack matrixStack, CameraRenderState cameraRenderState, OrderedRenderCommandQueue orderedRenderCommandQueue, float f, int n, Object object) {
        if ((n & 1) != 0) {
            matrixStack = entitySubmitEvent.matrices;
        }
        if ((n & 2) != 0) {
            cameraRenderState = entitySubmitEvent.cameraState;
        }
        if ((n & 4) != 0) {
            orderedRenderCommandQueue = entitySubmitEvent.collector;
        }
        if ((n & 8) != 0) {
            f = entitySubmitEvent.partialTicks;
        }
        return entitySubmitEvent.copy(matrixStack, cameraRenderState, orderedRenderCommandQueue, f);
    }

    @NotNull
    public final OrderedRenderCommandQueue getCollector() {
        return this.collector;
    }

    public final float getPartialTicks() {
        return this.partialTicks;
    }

    @NotNull
    public final CameraRenderState getCameraState() {
        return this.cameraState;
    }
}

