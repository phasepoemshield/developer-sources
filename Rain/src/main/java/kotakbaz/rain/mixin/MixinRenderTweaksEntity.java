/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.RenderTweaksModule;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Entity.class})
public class MixinRenderTweaksEntity {
    @Inject(method={"method_5809"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelPlayerFireOverlay(CallbackInfoReturnable<Boolean> cir) {
        if (!(this instanceof ClientPlayerEntity)) {
            return;
        }
        if (RenderTweaksModule.INSTANCE.isEnabled() && ((Boolean)RenderTweaksModule.INSTANCE.getNoFire().getValue()).booleanValue()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_5851"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelEntityGlow(CallbackInfoReturnable<Boolean> cir) {
        if (RenderTweaksModule.INSTANCE.isEnabled() && ((Boolean)RenderTweaksModule.INSTANCE.getNoGlow().getValue()).booleanValue()) {
            cir.setReturnValue((Object)false);
        }
    }
}

