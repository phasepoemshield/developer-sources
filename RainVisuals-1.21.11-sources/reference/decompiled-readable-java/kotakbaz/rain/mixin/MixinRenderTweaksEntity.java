/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0635\u0650;

@Mixin(value={Entity.class})
public class MixinRenderTweaksEntity {
    @Inject(method={"method_5809"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelPlayerFireOverlay(CallbackInfoReturnable<Boolean> cir) {
        if (!(this instanceof ClientPlayerEntity)) {
            return;
        }
        if (\u0635\u0650.INSTANCE.isEnabled() && ((Boolean)\u0635\u0650.INSTANCE.getNoFire().getValue()).booleanValue()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_5851"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelEntityGlow(CallbackInfoReturnable<Boolean> cir) {
        if (\u0635\u0650.INSTANCE.isEnabled() && ((Boolean)\u0635\u0650.INSTANCE.getNoGlow().getValue()).booleanValue()) {
            cir.setReturnValue((Object)false);
        }
    }
}

