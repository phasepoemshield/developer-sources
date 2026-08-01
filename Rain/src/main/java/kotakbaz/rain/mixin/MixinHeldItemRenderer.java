/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.HandOffsetEvent;
import kotakbaz.rain.event.events.HandSwingEvent;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={HeldItemRenderer.class})
public abstract class MixinHeldItemRenderer {
    @Inject(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_4587;method_22903()V", shift=At.Shift.AFTER, ordinal=0)})
    private void onRenderFirstPersonItem(AbstractClientPlayerEntity player, float tickProgress, float pitch, Hand hand, float swingProgress, ItemStack item, float equipProgress, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci) {
        EventManager.INSTANCE.post(new HandOffsetEvent(matrices, item, hand));
    }

    @Inject(method={"method_65816"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSwingArm(float swingProgress, float equipProgress, MatrixStack matrices, int armX, Arm arm, CallbackInfo ci) {
        HandSwingEvent event = new HandSwingEvent(matrices, arm, swingProgress, equipProgress);
        EventManager.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
        }
    }
}

