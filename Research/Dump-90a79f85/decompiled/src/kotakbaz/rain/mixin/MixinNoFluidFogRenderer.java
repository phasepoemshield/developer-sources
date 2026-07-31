/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4184
 *  net.minecraft.class_5636
 *  net.minecraft.class_758
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.d_0;
import net.minecraft.class_4184;
import net.minecraft.class_5636;
import net.minecraft.class_758;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_758.class})
public class MixinNoFluidFogRenderer {
    public MixinNoFluidFogRenderer() {
        super();
    }

    @Inject(method={"method_71652"}, at={@At(value="RETURN")}, cancellable=true)
    private void rain$clearFluidFog(class_4184 camera, boolean thickFog, CallbackInfoReturnable<class_5636> cir) {
        boolean clearLava;
        class_5636 current = (class_5636)cir.getReturnValue();
        boolean clearWater = current == class_5636.field_27886 && d_0.INSTANCE.shouldClearWaterFog();
        boolean bl = clearLava = current == class_5636.field_27885 && d_0.INSTANCE.shouldClearLavaFog();
        if (!clearWater && !clearLava) {
            return;
        }
        cir.setReturnValue((Object)(thickFog ? class_5636.field_60562 : class_5636.field_60563));
    }
}

