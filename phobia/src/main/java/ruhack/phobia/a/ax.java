/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_765
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.jf;
import ruhack.phobia.jk;

@Mixin(value={class_765.class})
public class ax {
    @ModifyExpressionValue(method={"method_3313"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_7172;method_41753()Ljava/lang/Object;")})
    private Object injectBrightness(Object original) {
        if (!(original instanceof Double)) {
            return original;
        }
        Double doubleValue = (Double)original;
        jf fullBright = jf.getInstance();
        if (fullBright != null && fullBright.isState()) {
            return Math.max(doubleValue, fullBright.getBrightness());
        }
        return original;
    }

    @Inject(method={"method_42596"}, at={@At(value="HEAD")}, cancellable=true)
    private void removeDarknessEffect(CallbackInfoReturnable<Float> cir) {
        jk noRender = jk.getInstance();
        if (noRender != null && noRender.isState() && noRender.modeSetting.isSelected("Darkness")) {
            cir.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }
}

