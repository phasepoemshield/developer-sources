/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.ProjectionType
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.render.ProjectionMatrix2
 *  org.joml.Matrix4fStack
 *  org.joml.Vector3f
 */
package oxxxde;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.ProjectionType;
import com.mojang.blaze3d.systems.RenderSystem;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.render.ProjectionMatrix2;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import oxxxde.\u0632\u062b;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0003R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2={"Loxxxde/\u0628\u062f;", "", "<init>", "()V", "", "unscaledProjection", "scaledProjection", "", "x", "y", "scale", "startScale", "(FFF)V", "reset", "Lorg/joml/Vector3f;", "position", "transformPosition", "(Lorg/joml/Vector3f;)V", "pushMatrix", "popMatrix", "Lnet/minecraft/class_11278;", "matrix", "Lnet/minecraft/class_11278;", "Lorg/joml/Matrix4fStack;", "matrix4fStack", "Lorg/joml/Matrix4fStack;", "rain-visuals"})
public final class \u0628\u062f {
    @NotNull
    public static final \u0628\u062f INSTANCE;
    @NotNull
    @JvmField
    public static final Matrix4fStack matrix4fStack;
    @NotNull
    private static final ProjectionMatrix2 matrix;

    public final void scaledProjection() {
        float width = (float)\u0636\u0643.getMc().getWindow().getScaledWidth() / (float)2;
        float height = (float)\u0636\u0643.getMc().getWindow().getScaledHeight() / (float)2;
        RenderSystem.setProjectionMatrix((GpuBufferSlice)matrix.set(width, height), (ProjectionType)ProjectionType.PERSPECTIVE);
    }

    public final void popMatrix() {
        matrix4fStack.popMatrix();
    }

    public final void unscaledProjection() {
        float width = \u0636\u0643.getMc().getWindow().getScaledWidth();
        float height = \u0636\u0643.getMc().getWindow().getScaledHeight();
        RenderSystem.setProjectionMatrix((GpuBufferSlice)matrix.set(width, height), (ProjectionType)ProjectionType.ORTHOGRAPHIC);
    }

    private \u0628\u062f() {
    }

    public final void reset() {
        matrix4fStack.identity();
    }

    static {
        Matrix4fStack matrix4fStack;
        INSTANCE = new \u0628\u062f();
        matrix = new ProjectionMatrix2(\u0632\u062b.getCLIENT_ID() + "-projection-matrix", -1000.0f, 1000.0f, true);
        Matrix4fStack $this$matrix4fStack_u24lambda_u240 = matrix4fStack = new Matrix4fStack(16);
        boolean bl = false;
        $this$matrix4fStack_u24lambda_u240.identity();
        \u0628\u062f.matrix4fStack = matrix4fStack;
    }

    public final void transformPosition(@NotNull Vector3f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if ((matrix4fStack.properties() & 4) == 0) {
            matrix4fStack.transformPosition(position);
        }
    }

    public final void startScale(float x, float y, float scale) {
        matrix4fStack.translate(x, y, 0.0f);
        matrix4fStack.scale(scale, scale, 1.0f);
        matrix4fStack.translate(-x, -y, 0.0f);
    }

    public final void pushMatrix() {
        matrix4fStack.pushMatrix();
    }
}

