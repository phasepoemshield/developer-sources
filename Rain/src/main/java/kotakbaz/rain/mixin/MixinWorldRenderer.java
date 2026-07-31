/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import kotakbaz.rain.client.waypoint.WayPointManager;
import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.Render3DEvent;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.ObjectAllocator;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={WorldRenderer.class})
public class MixinWorldRenderer {
    @Inject(method={"method_22710"}, at={@At(value="RETURN")})
    private void rain$onRender(ObjectAllocator allocator, RenderTickCounter tickCounter, boolean renderBlockOutline, Camera camera, Matrix4f positionMatrix, Matrix4f projectionMatrix, GpuBufferSlice fog, Vector4f fogColor, boolean shouldRenderSky, CallbackInfo ci) {
        WayPointManager.INSTANCE.captureProjectionMatrices(new Matrix4f((Matrix4fc)positionMatrix), new Matrix4f((Matrix4fc)projectionMatrix));
        MatrixStack matrices = new MatrixStack();
        matrices.multiplyPositionMatrix((Matrix4fc)new Matrix4f((Matrix4fc)positionMatrix));
        EventManager.INSTANCE.post(new Render3DEvent(matrices, tickCounter.getTickProgress(false)));
    }
}

