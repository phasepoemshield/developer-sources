package fun.nexisdlc.mixins.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.entity.EntityRenderEvent;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.player.rotation.LivingEntityRenderRotation;
import fun.nexisdlc.modules.impl.render.SeeInvisibles;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererMixin<T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>> implements IMinecraft {

    @Shadow
    public abstract M getModel();

    @Shadow
    public abstract Identifier getTexture(S state);

    @Unique
    private final EntityRenderEvent nexis$entityRenderEvent = new EntityRenderEvent();
    @Unique
    private float nexis$origBodyYaw;
    @Unique
    private float nexis$origLastBodyYaw;

    @Unique
    private boolean nexis$seeInvisiblesRendering;

    @Inject(
            method = "updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V",
            at = @At("HEAD")
    )
    private void onUpdateRenderStatePre(T livingEntity, S state, float tickDelta, CallbackInfo ci) {
        NexisClient.getEventBus().post(nexis$entityRenderEvent);
        nexis$entityRenderEvent.setDelta(tickDelta);

        if (livingEntity == mc.player && !LivingEntityRenderRotation.shouldUseOriginalRotation()) {
            nexis$origBodyYaw = livingEntity.bodyYaw;
            nexis$origLastBodyYaw = livingEntity.lastBodyYaw;
            livingEntity.bodyYaw = nexis$entityRenderEvent.getBodyYaw();
            livingEntity.lastBodyYaw = nexis$entityRenderEvent.getPrevBodyYaw();
        }
    }

    @Inject(
            method = "updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V",
            at = @At("TAIL")
    )
    private void onUpdateRenderStatePost(T livingEntity, S state, float tickDelta, CallbackInfo ci) {
        if (livingEntity == mc.player && !LivingEntityRenderRotation.shouldUseOriginalRotation()) {
            livingEntity.bodyYaw = nexis$origBodyYaw;
            livingEntity.lastBodyYaw = nexis$origLastBodyYaw;
        }
    }

    @ModifyExpressionValue(method = "updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;lerpAngleDegrees(FFF)F", ordinal = 0))
    private float getLerpedYawHook(float original, @Local(ordinal = 0, argsOnly = true) LivingEntity entity) {
        if (entity.equals(mc.player)) {
            return LivingEntityRenderRotation.getYaw(nexis$entityRenderEvent);
        }
        return original;
    }

    @ModifyExpressionValue(method = "updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;getLerpedPitch(F)F"))
    private float getLerpedPitchHook(float original, @Local(ordinal = 0, argsOnly = true) LivingEntity entity) {
        if (entity.equals(mc.player)) {
            return LivingEntityRenderRotation.getPitch(nexis$entityRenderEvent);
        }
        return original;
    }


    @Inject(
            method = "updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V",
            at = @At("TAIL")
    )
    private void onUpdateRenderStateSeeInvisibles(T livingEntity, S state, float tickDelta, CallbackInfo ci) {
        SeeInvisibles seeInvisibles = NexisClient.getFunctionManager().getSeeInvisibles();
        if (seeInvisibles != null && seeInvisibles.isState() && state.invisible && livingEntity instanceof PlayerEntity) {
            if (((Object) this) instanceof PlayerEntityRenderer) {
                state.invisibleToPlayer = false;
            }
        }
    }

    @Inject(method = "hasLabel(Lnet/minecraft/entity/LivingEntity;D)Z", at = @At("HEAD"), cancellable = true)
    private void forceNametagAlways(T livingEntity, double d, CallbackInfoReturnable<Boolean> cir) {
        if (livingEntity == MinecraftClient.getInstance().getCameraEntity()) {
            cir.setReturnValue(MinecraftClient.isHudEnabled());
        }

        if (NexisClient.getFunctionManager().getNameTags().isState()) {
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "isVisible(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;)Z",
            at = @At("RETURN"), cancellable = true)
    private void modifyVisibility(S state, CallbackInfoReturnable<Boolean> cir) {
        SeeInvisibles seeInvisibles = NexisClient.getFunctionManager().getSeeInvisibles();
        if (seeInvisibles != null && seeInvisibles.isState() && state.invisible) {
            if (((Object) this) instanceof PlayerEntityRenderer) {
                cir.setReturnValue(true);
            }
        }
    }

    @Inject(method = "getRenderLayer(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;ZZZ)Lnet/minecraft/client/render/RenderLayer;",
            at = @At("RETURN"), cancellable = true)
    private void modifyRenderLayer(S state, boolean visible, boolean translucent, boolean hasOutline, CallbackInfoReturnable<RenderLayer> cir) {
        SeeInvisibles seeInvisibles = NexisClient.getFunctionManager().getSeeInvisibles();
        if (seeInvisibles != null && seeInvisibles.isState() && state.invisible) {
            if (((Object) this) instanceof PlayerEntityRenderer) {
                Identifier texture = this.getTexture(state);
                cir.setReturnValue(RenderLayers.entityTranslucent(texture, true));
            }
        }
    }

    @Inject(
            method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/command/OrderedRenderCommandQueue;Lnet/minecraft/client/render/state/CameraRenderState;)V",
            at = @At("HEAD"), cancellable = true
    )
    private void onRenderHead(S state, MatrixStack matrixStack, OrderedRenderCommandQueue commandQueue, CameraRenderState cameraRenderState, CallbackInfo ci) {
        SeeInvisibles seeInvisibles = NexisClient.getFunctionManager().getSeeInvisibles();
        nexis$seeInvisiblesRendering = seeInvisibles != null && seeInvisibles.isState()
                && state.invisible
                && ((Object) this) instanceof PlayerEntityRenderer;
    }

    @Redirect(
            method = "render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/command/OrderedRenderCommandQueue;Lnet/minecraft/client/render/state/CameraRenderState;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/ColorHelper;mix(II)I")
    )
    private int nexis$modifySeeInvisiblesAlpha(int a, int b) {
        int result = ColorHelper.mix(a, b);
        if (nexis$seeInvisiblesRendering) {
            SeeInvisibles seeInvisibles = NexisClient.getFunctionManager().getSeeInvisibles();
            float opacity = seeInvisibles.opacity.get();
            int colorValue;
            if (seeInvisibles.colorMode.is("От темы")) {
                colorValue = ClientColors.ICON.getRGB();
                int colorAlpha = (colorValue >> 24) & 0xFF;
                int alphaInt = Math.round(colorAlpha * opacity) << 24;
                colorValue = (colorValue & 0x00FFFFFF) | alphaInt;
            } else {
                colorValue = seeInvisibles.color.get();
                int colorAlpha = (colorValue >> 24) & 0xFF;
                int alphaInt = Math.round(colorAlpha * opacity) << 24;
                colorValue = (colorValue & 0x00FFFFFF) | alphaInt;
            }
            return colorValue;
        }
        return result;
    }
}
