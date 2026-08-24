/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.render.entity.LivingEntityRenderer
 *  net.minecraft.entity.LivingEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0631\u0648;

@Mixin(value={LivingEntityRenderer.class})
public class MixinLivingEntityRendererThirdName {
    @Inject(method={"method_4055"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$showThirdName(LivingEntity entity, double squaredDistanceToCamera, CallbackInfoReturnable<Boolean> cir) {
        if (!\u0631\u0648.INSTANCE.isEnabled()) {
            return;
        }
        MinecraftClient mc = MinecraftClient.getInstance();
        if (entity == mc.player) {
            cir.setReturnValue((Object)(!mc.options.getPerspective().isFirstPerson() ? 1 : 0));
        }
    }
}

