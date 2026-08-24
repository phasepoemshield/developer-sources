/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.world.ClientWorld$Properties
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0631\u0632;

@Mixin(value={ClientWorld.Properties.class})
public class MixinTimeChangerClientWorldProperties {
    @Inject(method={"method_217"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$modifyClientTime(CallbackInfoReturnable<Long> cir) {
        cir.setReturnValue((Object)\u0631\u0632.INSTANCE.modifyTime((Long)cir.getReturnValue()));
    }
}

