/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_638$class_5271
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.r_0;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_638.class_5271.class})
public class MixinTimeChangerClientWorldProperties {
    public MixinTimeChangerClientWorldProperties() {
        super();
    }

    @Inject(method={"method_217"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$modifyClientTime(CallbackInfoReturnable<Long> cir) {
        cir.setReturnValue((Object)r_0.INSTANCE.modifyTime((Long)cir.getReturnValue()));
    }
}

