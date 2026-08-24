/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.RenderTickCounter
 *  net.minecraft.client.render.SkyRendering
 *  net.minecraft.client.render.WorldRenderer
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.state.SkyRenderState
 *  net.minecraft.client.render.state.WorldRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.memory.ObjectAllocator
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import kotakbaz.rain.event.events.EntitySubmitEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.SkyRendering;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.state.SkyRenderState;
import net.minecraft.client.render.state.WorldRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.memory.ObjectAllocator;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u062b\u0627;
import oxxxde.\u0631\u0638;
import oxxxde.\u0639\u062c;

@Mixin(value={WorldRenderer.class})
public class MixinWorldRenderer {
    @Unique
    private float rain$partialTicks;

    @Inject(method={"method_22710"}, at={@At(value="RETURN")})
    private void rain$onRender(ObjectAllocator allocator, RenderTickCounter tickCounter, boolean renderBlockOutline, Camera camera, Matrix4f positionMatrix, Matrix4f projectionMatrix, Matrix4f projectionMatrixForCulling, GpuBufferSlice fog, Vector4f fogColor, boolean shouldRenderSky, CallbackInfo ci) {
        MatrixStack matrices = new MatrixStack();
        matrices.multiplyPositionMatrix((Matrix4fc)new Matrix4f((Matrix4fc)positionMatrix));
        \u0631\u0638.INSTANCE.post(new Render3DEvent(matrices, tickCounter.getTickProgress(false)));
    }

    @ModifyVariable(method={"method_22710"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private boolean rain$replaceVanillaBlockOutline(boolean renderBlockOutline) {
        return \u0639\u062c.INSTANCE.shouldReplaceVanillaOutline() ? false : renderBlockOutline;
    }

    @Inject(method={"method_62215"}, at={@At(value="HEAD")}, cancellable=true)
    private static void rain$renderCustomSky(GpuBufferSlice fog, SkyRenderState skyState, SkyRendering skyRenderer, CallbackInfo ci) {
        if (\u062b\u0627.INSTANCE.renderSky(skyState)) {
            ci.cancel();
        }
    }

    @Inject(method={"method_72916"}, at={@At(value="TAIL")})
    private void rain$onSubmitEntities(MatrixStack matrices, WorldRenderState levelRenderState, OrderedRenderCommandQueue collector, CallbackInfo ci) {
        \u0631\u0638.INSTANCE.post(new EntitySubmitEvent(matrices, levelRenderState.cameraRenderState, collector, this.rain$partialTicks));
    }

    @Inject(method={"method_22710"}, at={@At(value="HEAD")})
    private void rain$capturePartialTicks(ObjectAllocator allocator, RenderTickCounter tickCounter, boolean renderBlockOutline, Camera camera, Matrix4f positionMatrix, Matrix4f projectionMatrix, Matrix4f projectionMatrixForCulling, GpuBufferSlice fog, Vector4f fogColor, boolean shouldRenderSky, CallbackInfo ci) {
        this.rain$partialTicks = tickCounter.getTickProgress(false);
    }
}

