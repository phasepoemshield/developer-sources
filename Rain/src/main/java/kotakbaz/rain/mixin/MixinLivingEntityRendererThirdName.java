/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.ThirdNameModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={LivingEntityRenderer.class})
public class MixinLivingEntityRendererThirdName {
    @Inject(method={"method_4055"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$showThirdName(LivingEntity entity, double squaredDistanceToCamera, CallbackInfoReturnable<Boolean> cir) {
        if (!ThirdNameModule.INSTANCE.isEnabled()) {
            return;
        }
        MinecraftClient mc = MinecraftClient.getInstance();
        if (entity == mc.player) {
            cir.setReturnValue((Object)(!mc.options.getPerspective().isFirstPerson() ? 1 : 0));
        }
    }
}

