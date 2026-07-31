/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_638
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.A;
import net.minecraft.class_243;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_638.class})
public class MixinCustomFogClientWorld {
    public MixinCustomFogClientWorld() {
        super();
    }

    @Inject(method={"method_23777"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$modifySkyColor(class_243 cameraPos, float tickProgress, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue((Object)A.INSTANCE.fogSkyArgb((Integer)cir.getReturnValue()));
    }
}

