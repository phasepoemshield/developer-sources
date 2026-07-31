package fun.wonderful.mixin;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.Event3DRender;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.impl.render.Chams;
import fun.wonderful.client.modules.impl.render.Removals;
import net.minecraft.util.profiler.Profilers;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.option.CloudRenderMode;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.client.util.ObjectAllocator;
import net.minecraft.client.render.Fog;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={WorldRenderer.class})
public class WorldRendererMixin
implements QClient {
    @Inject(method={"renderParticles"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$renderParticles(FrameGraphBuilder frameGraphBuilder, Camera camera, float tickDelta, Fog fog, CallbackInfo ci) {
        if (ModuleClass.INSTANCE == null) {
            return;
        }
        Removals removals = ModuleClass.removals;
        if (removals != null && removals.isParticlesDisabled()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderWeather"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$renderWeather(FrameGraphBuilder frameGraphBuilder, Vec3d pos, float tickDelta, Fog fog, CallbackInfo ci) {
        if (ModuleClass.INSTANCE == null) {
            return;
        }
        Removals removals = ModuleClass.removals;
        if (removals != null && removals.isWeatherDisabled()) {
            ci.cancel();
        }
    }

    @Inject(method={"addWeatherParticlesAndSound"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$addWeatherParticlesAndSound(Camera camera, CallbackInfo ci) {
        if (ModuleClass.INSTANCE == null) {
            return;
        }
        Removals removals = ModuleClass.removals;
        if (removals != null && removals.isWeatherDisabled()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderClouds"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$renderClouds(FrameGraphBuilder frameGraphBuilder, Matrix4f positionMatrix, Matrix4f projectionMatrix, CloudRenderMode renderMode, Vec3d cameraPos, float ticks, int color, float cloudHeight, CallbackInfo ci) {
        if (ModuleClass.INSTANCE == null) {
            return;
        }
        Removals removals = ModuleClass.removals;
        if (removals != null && removals.isCloudsDisabled()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderBlockEntities"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$renderBlockEntities(MatrixStack matrices, VertexConsumerProvider.class_4598 mainConsumers, VertexConsumerProvider.class_4598 translucentConsumers, Camera camera, float tickDelta, CallbackInfo ci) {
        if (ModuleClass.INSTANCE == null) {
            return;
        }
        Removals removals = ModuleClass.removals;
        if (removals != null && removals.isBlockEntitiesDisabled()) {
            ci.cancel();
        }
    }

    @Inject(method={"render"}, at={@At(value="RETURN")})
    private void render(ObjectAllocator allocator, RenderTickCounter tickCounter, boolean renderBlockOutline, Camera camera, GameRenderer gameRenderer, Matrix4f positionMatrix, Matrix4f projectionMatrix, CallbackInfo ci) {
        boolean has3DListeners = EventInvoker.hasListeners(Event3DRender.class);
        if (!has3DListeners) {
            return;
        }
        Profilers.get().swap("wonderful_renderWorld");
        MatrixStack matrices = new MatrixStack();
        matrices.multiplyPositionMatrix(positionMatrix);
        new Event3DRender(matrices, positionMatrix, projectionMatrix, camera, tickCounter.getTickDelta(false)).call();
    }

    @Inject(method={"drawEntityOutlinesFramebuffer"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$drawEntityOutlinesFramebuffer(CallbackInfo ci) {
        if (ModuleClass.INSTANCE == null) {
            return;
        }
        Chams chams = ModuleClass.chams;
        if (chams != null && chams.shouldHideOutlineFramebuffer()) {
            ci.cancel();
        }
    }

    @Inject(method={"drawBlockOutline"}, at={@At(value="HEAD")}, cancellable=true)
    public void onDrawBlockOutline(CallbackInfo ci) {
        if (ModuleClass.blockOverlay.isEnable()) {
            ci.cancel();
        }
    }
}