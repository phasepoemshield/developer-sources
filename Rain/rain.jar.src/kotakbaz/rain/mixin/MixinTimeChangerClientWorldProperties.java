/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.ModuleTimeChanger;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={ClientWorld.Properties.class})
public class MixinTimeChangerClientWorldProperties {
    @Inject(method={"method_217"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$modifyClientTime(CallbackInfoReturnable<Long> cir) {
        cir.setReturnValue((Object)ModuleTimeChanger.INSTANCE.modifyTime((Long)cir.getReturnValue()));
    }
}

