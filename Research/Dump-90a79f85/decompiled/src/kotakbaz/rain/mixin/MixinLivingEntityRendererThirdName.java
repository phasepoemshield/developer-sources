/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_310
 *  net.minecraft.class_922
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.T;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_922.class})
public class MixinLivingEntityRendererThirdName {
    public MixinLivingEntityRendererThirdName() {
        super();
    }

    @Inject(method={"method_4055"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$showThirdName(class_1309 entity, double squaredDistanceToCamera, CallbackInfoReturnable<Boolean> cir) {
        if (!T.INSTANCE.isEnabled()) {
            return;
        }
        class_310 mc = class_310.method_1551();
        if (entity == mc.field_1724) {
            cir.setReturnValue((Object)(!mc.field_1690.method_31044().method_31034() ? 1 : 0));
        }
    }
}

