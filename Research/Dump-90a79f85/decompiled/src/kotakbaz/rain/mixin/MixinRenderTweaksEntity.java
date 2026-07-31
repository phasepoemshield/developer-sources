/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.s_0;
import net.minecraft.class_1297;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1297.class})
public class MixinRenderTweaksEntity {
    public MixinRenderTweaksEntity() {
        super();
    }

    @Inject(method={"method_5809"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelPlayerFireOverlay(CallbackInfoReturnable<Boolean> cir) {
        if (!(this instanceof class_746)) {
            return;
        }
        if (s_0.INSTANCE.isEnabled() && ((Boolean)s_0.INSTANCE.getNoFire().getValue()).booleanValue()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_5851"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelEntityGlow(CallbackInfoReturnable<Boolean> cir) {
        if (s_0.INSTANCE.isEnabled() && ((Boolean)s_0.INSTANCE.getNoGlow().getValue()).booleanValue()) {
            cir.setReturnValue((Object)false);
        }
    }
}

