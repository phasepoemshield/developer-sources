/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.item.HeldItemRenderer
 *  net.minecraft.client.render.item.ItemRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.ItemDisplayContext
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Arm
 *  net.minecraft.util.Hand
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import kotakbaz.rain.event.events.HandOffsetEvent;
import kotakbaz.rain.event.events.HandSwingEvent;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u062b\u0650;
import oxxxde.\u0631\u0638;
import oxxxde.\u0632\u0623;
import oxxxde.\u0635\u0650;
import oxxxde.\u0637\u0642;

@Mixin(value={HeldItemRenderer.class})
public abstract class MixinHeldItemRenderer {
    @ModifyArg(method={"method_22976"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_7833;rotationDegrees(F)Lorg/joml/Quaternionf;", ordinal=0), index=0)
    private float rain$removeVerticalHandSway(float degrees) {
        return this.rain$shouldRemoveHandSway() ? 0.0f : degrees;
    }

    private boolean rain$shouldRemoveHandSway() {
        return \u0635\u0650.INSTANCE.isEnabled() && (Boolean)\u0635\u0650.INSTANCE.getNoHandSway().getValue() != false;
    }

    @ModifyArg(method={"method_22976"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_7833;rotationDegrees(F)Lorg/joml/Quaternionf;", ordinal=1), index=0)
    private float rain$removeHorizontalHandSway(float degrees) {
        return this.rain$shouldRemoveHandSway() ? 0.0f : degrees;
    }

    @WrapOperation(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_759;method_3224(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V", ordinal=4)})
    private void rain$skipVanillaEquipOffsetForSwingAnimation(HeldItemRenderer instance, MatrixStack poseStack, Arm arm, float equipProgress, Operation<Void> original) {
        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        if (!\u062b\u0650.INSTANCE.isEnabled() || player == null || !arm.equals((Object)player.getMainArm())) {
            original.call(new Object[]{instance, poseStack, arm, Float.valueOf(equipProgress)});
        }
    }

    @Inject(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_4587;method_22903()V", shift=At.Shift.AFTER, ordinal=0)})
    private void onRenderFirstPersonItem(AbstractClientPlayerEntity player, float tickProgress, float pitch, Hand hand, float swingProgress, ItemStack item, float equipProgress, MatrixStack matrices, OrderedRenderCommandQueue submitter, int light, CallbackInfo ci) {
        \u0632\u0623.INSTANCE.captureHandOffsetBase(hand, matrices.peek());
        \u0631\u0638.INSTANCE.post(new HandOffsetEvent(matrices, item, hand));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @WrapOperation(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V")})
    private void rain$scaleFirstPersonItem(HeldItemRenderer instance, LivingEntity entity, ItemStack stack, ItemDisplayContext displayContext, MatrixStack poseStack, OrderedRenderCommandQueue submitter, int light, Operation<Void> original, AbstractClientPlayerEntity player, float tickProgress, float pitch, Hand hand) {
        float scale = \u0632\u0623.INSTANCE.animatedScale(hand);
        \u0632\u0623.INSTANCE.beginItemBoundsCapture(hand, tickProgress);
        try {
            if (scale == 1.0f) {
                original.call(new Object[]{instance, entity, stack, displayContext, poseStack, submitter, light});
                return;
            }
            poseStack.push();
            poseStack.scale(scale, scale, scale);
            try {
                original.call(new Object[]{instance, entity, stack, displayContext, poseStack, submitter, light});
            }
            finally {
                poseStack.pop();
            }
        }
        finally {
            \u0632\u0623.INSTANCE.endItemBoundsCapture(hand);
        }
    }

    @WrapOperation(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_759;method_65816(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V", ordinal=2)})
    private void rain$dispatchSwingAnimation(HeldItemRenderer instance, float swingProgress, MatrixStack poseStack, int armX, Arm arm, Operation<Void> original) {
        HandSwingEvent event = new HandSwingEvent(poseStack, arm, swingProgress, 0.0f);
        \u0631\u0638.INSTANCE.post(event);
        if (!event.getCancel()) {
            original.call(new Object[]{instance, Float.valueOf(swingProgress), poseStack, armX, arm});
        }
    }

    @WrapOperation(method={"method_3233"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_10444;method_65604(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;III)V")})
    private void rain$captureViewModelItemBounds(ItemRenderState state, MatrixStack poseStack, OrderedRenderCommandQueue submitter, int light, int overlay, int seed, Operation<Void> original) {
        \u0632\u0623.INSTANCE.captureRenderedBounds(state, poseStack.peek());
        original.call(new Object[]{state, poseStack, submitter, light, overlay, seed});
    }

    @Inject(method={"method_3219"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$hideVanillaArmsWhileApplyingAvatar(MatrixStack matrices, OrderedRenderCommandQueue submitter, int light, float equipProgress, float swingProgress, Arm arm, CallbackInfo ci) {
        if (\u0637\u0642.isApplyingAnyAvatar()) {
            ci.cancel();
        }
    }
}

