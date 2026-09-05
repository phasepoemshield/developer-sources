/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.ax;
import ruhack.phobia.c;
import ruhack.phobia.cw;
import ruhack.phobia.cz;
import ruhack.phobia.cz$Type;
import ruhack.phobia.dc;

@Mixin(value={class_1657.class})
public abstract class bn
implements c {
    @Inject(method={"method_5675"}, at={@At(value="HEAD")}, cancellable=true)
    public void isPushedByFluids(CallbackInfoReturnable<Boolean> cir) {
        cz event = new cz(cz$Type.WATER);
        ax.callEvent(event);
        if (event.isCancelled()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_6091"}, at={@At(value="HEAD")}, cancellable=true)
    private void onTravelPre(class_243 movementInput, CallbackInfo ci2) {
        if (bn.mc.field_1724 == null) {
            return;
        }
        cw event = new cw(movementInput, true);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }

    @ModifyExpressionValue(method={"method_6091"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_5720()Lnet/minecraft/class_243;")})
    public class_243 travelHook(class_243 vec3d) {
        dc event = new dc(vec3d);
        ax.callEvent(event);
        return event.getVector();
    }

    @Inject(method={"method_6091"}, at={@At(value="RETURN")})
    private void onTravelPost(class_243 movementInput, CallbackInfo ci2) {
        if (bn.mc.field_1724 == null) {
            return;
        }
        cw event = new cw(movementInput, false);
        ax.callEvent(event);
    }
}

