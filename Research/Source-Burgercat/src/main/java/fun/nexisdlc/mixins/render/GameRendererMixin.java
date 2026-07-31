package fun.nexisdlc.mixins.render;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.render.EventAspectRatio;
import fun.nexisdlc.client.events.impl.render.EventFov;
import fun.nexisdlc.client.utils.math.ProjectionUtil;
import fun.nexisdlc.client.utils.render3d.ColorGradingRenderer;
import fun.nexisdlc.client.utils.render3d.HandGlowRenderer;
import fun.nexisdlc.client.utils.render3d.ShaderHandsRenderer;
import fun.nexisdlc.modules.impl.render.Beautifully;
import fun.nexisdlc.modules.impl.render.HandGlow;
import fun.nexisdlc.modules.impl.render.ShaderHands;
import net.minecraft.client.gui.screen.ProgressScreen;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Inject(method = "render", at = @At("HEAD"))
    private void nexis$resetHandGlow(RenderTickCounter tickCounter, boolean tick, CallbackInfo ci) {
        HandGlowRenderer.resetOverrides();
        ShaderHandsRenderer.resetOverrides();
    }

    @Inject(method = "render", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/hud/InGameHud;render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V",
            shift = At.Shift.BEFORE))
    public void hookRender(RenderTickCounter tickCounter, boolean tick, CallbackInfo ci) {
        if (mc.currentScreen instanceof ProgressScreen) {
            return;
        }

        if (tick && mc.world != null && mc.player != null) {
            ShaderHands shaderHands = NexisClient.getFunctionManager().getShaderHands();
            if (shaderHands != null && shaderHands.isState() && ShaderHandsRenderer.needsPost()) {
                ShaderHandsRenderer.postHandsRender(shaderHands);
            } else {
                HandGlow handGlow = NexisClient.getFunctionManager().getHandGlow();
                if (handGlow != null && handGlow.isState() && HandGlowRenderer.needsPost()) {
                    HandGlowRenderer.postHandsRender(
                            handGlow.getIntensity(),
                            handGlow.getRadius(),
                            handGlow.getFlamePower(),
                            handGlow.getFlameSpeed(),
                            handGlow.isRainbowFlame()
                    );
                }
            }
        }

        if (Beautifully.shouldApplyColorGrading()) {
            ColorGradingRenderer.applyColorGrading(Beautifully.getSaturation(), Beautifully.getWarmth());
        }

        if (!(mc.options.hudHidden)) {
            NexisClient.hookRenderHud();
        }
    }

    @Inject(method = "renderHand", at = @At("HEAD"))
    private void nexis$preHandGlow(float tickDelta, boolean notAffectingFov, Matrix4f viewMatrix, CallbackInfo ci) {
        ShaderHands shaderHands = NexisClient.getFunctionManager().getShaderHands();
        if (shaderHands != null && shaderHands.isState()) {
            ShaderHandsRenderer.preHandCapture();
            return;
        }

        HandGlow handGlow = NexisClient.getFunctionManager().getHandGlow();
        if (handGlow != null && handGlow.isState() && handGlow.getIntensity() > 0.01f && handGlow.getRadius() > 0.5f) {
            HandGlowRenderer.preHandCapture();
        }
    }

    @Inject(method = "renderHand", at = @At("TAIL"))
    private void nexis$postHandGlow(float tickDelta, boolean notAffectingFov, Matrix4f viewMatrix, CallbackInfo ci) {
        ShaderHands shaderHands = NexisClient.getFunctionManager().getShaderHands();
        if (shaderHands != null && shaderHands.isState()) {
            ShaderHandsRenderer.postHandCapture();
            return;
        }

        HandGlow handGlow = NexisClient.getFunctionManager().getHandGlow();
        if (handGlow != null && handGlow.isState() && handGlow.getIntensity() > 0.01f && handGlow.getRadius() > 0.5f) {
            HandGlowRenderer.postHandCapture();
        }
    }

    private static final EventFov NEXIS$EVENT_FOV = new EventFov();
    private static final EventAspectRatio NEXIS$EVENT_ASPECT = new EventAspectRatio();

    @Inject(method = "getFov", at = @At("RETURN"), cancellable = true)
    private void onGetFov(Camera camera, float tickDelta, boolean changingFov, CallbackInfoReturnable<Float> cir) {
        if (NexisClient.getEventBus() == null) return;
        if (mc.currentScreen != null) return;
        NEXIS$EVENT_FOV.setFov((int) (float) cir.getReturnValue());
        NEXIS$EVENT_FOV.setTickDelta(tickDelta);
        NEXIS$EVENT_FOV.setChangingFov(changingFov);
        NEXIS$EVENT_FOV.setCancelled(false);
        NexisClient.getEventBus().post(NEXIS$EVENT_FOV);
        if (NEXIS$EVENT_FOV.isCancelled()) {
            cir.setReturnValue((float) NEXIS$EVENT_FOV.getFov());
        }
    }

    @Inject(method = "getBasicProjectionMatrix", at = @At("RETURN"), cancellable = true)
    private void onGetProjectionMatrix(float fov, CallbackInfoReturnable<Matrix4f> cir) {
        if (NexisClient.getEventBus() == null) return;
        NEXIS$EVENT_ASPECT.setValue(1.0f);
        NEXIS$EVENT_ASPECT.setCancelled(false);
        NexisClient.getEventBus().post(NEXIS$EVENT_ASPECT);
        if (NEXIS$EVENT_ASPECT.isCancelled()) {
            float value = NEXIS$EVENT_ASPECT.getValue();
            ProjectionUtil.currentAspectMultiplier = value;
            Matrix4f mat = new Matrix4f(cir.getReturnValue());
            mat.scale(value, 1.0f, 1.0f);
            cir.setReturnValue(mat);
        } else {
            ProjectionUtil.currentAspectMultiplier = 1.0f;
        }
    }
}
