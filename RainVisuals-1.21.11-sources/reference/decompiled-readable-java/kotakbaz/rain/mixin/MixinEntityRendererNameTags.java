/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.EntityRenderer
 *  net.minecraft.client.render.state.CameraRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.text.Text
 *  net.minecraft.util.math.Vec3d
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u062d\u063a;
import oxxxde.\u0631\u0627;

@Mixin(value={EntityRenderer.class})
public class MixinEntityRendererNameTags {
    @Inject(method={"method_62426"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$addSocialMarker(Entity entity, CallbackInfoReturnable<Text> cir) {
        if (!(entity instanceof PlayerEntity) || !\u062d\u063a.INSTANCE.isRainUser(entity.getUuid())) {
            return;
        }
        cir.setReturnValue((Object)\u0631\u0627.mark((Text)cir.getReturnValue()));
    }

    @Redirect(method={"method_3926"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11659;method_73482(Lnet/minecraft/class_4587;Lnet/minecraft/class_243;ILnet/minecraft/class_2561;ZIDLnet/minecraft/class_12075;)V"))
    private void rain$redirectLabelDraw(OrderedRenderCommandQueue collector, MatrixStack poseStack, Vec3d attachment, int yOffset, Text text, boolean showBackground, int light, double distanceToCameraSq, CameraRenderState cameraState) {
        collector.submitLabel(poseStack, attachment, yOffset, text, showBackground, light, distanceToCameraSq, cameraState);
    }
}

