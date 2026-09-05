/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1269$class_9860
 *  net.minecraft.class_1269$class_9861
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_3965
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_3965;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.ax;
import ruhack.phobia.bk;
import ruhack.phobia.br;
import ruhack.phobia.dg;
import ruhack.phobia.fd;

@Mixin(value={class_636.class})
public class o {
    @Inject(method={"method_2896"}, at={@At(value="HEAD")}, cancellable=true)
    private void blockSpherePlacement(class_746 player, class_1268 hand, class_3965 hitResult, CallbackInfoReturnable<class_1269> cir) {
        fd module = fd.getInstance();
        if (module != null && module.isState() && player.method_5998(hand).method_31574(class_1802.field_8575)) {
            cir.setReturnValue((Object)class_1269.field_5814);
        }
    }

    @Inject(method={"method_2919"}, at={@At(value="RETURN")})
    public void interactItemHook(class_1657 player, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
        class_1269.class_9860 success;
        Object object = cir.getReturnValue();
        if (object instanceof class_1269.class_9860 && !(success = (class_1269.class_9860)object).comp_2909().equals((Object)class_1269.class_9861.field_52427)) {
            dg event = new dg(0);
            ax.callEvent(event);
        }
    }

    @Inject(method={"method_2897"}, at={@At(value="HEAD")}, cancellable=true)
    public void stopUsingItemHook(CallbackInfo ci2) {
        dg event = new dg(2);
        ax.callEvent(event);
    }

    @Inject(method={"method_2919"}, at={@At(value="HEAD")}, cancellable=true)
    private void gameModeHook(class_1657 player, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
        dg event = new dg(-1);
        ax.callEvent(event);
        if (event.isCancelled()) {
            cir.setReturnValue((Object)class_1269.field_5811);
        }
    }

    @Inject(method={"method_2902"}, at={@At(value="HEAD")})
    private void injectBlockBreaking(class_2338 pos, class_2350 direction, CallbackInfoReturnable<Boolean> cir) {
        ax.callEvent(new bk(pos, direction));
    }

    @Inject(method={"method_2910"}, at={@At(value="HEAD")})
    private void injectInitialBlockBreaking(class_2338 pos, class_2350 direction, CallbackInfoReturnable<Boolean> cir) {
        ax.callEvent(new bk(pos, direction));
    }

    @Inject(method={"method_2906"}, at={@At(value="HEAD")}, cancellable=true)
    public void clickSlotHook(int syncId, int slotId, int button, class_1713 actionType, class_1657 player, CallbackInfo info) {
        br event = new br(syncId, slotId, button, actionType);
        ax.callEvent(event);
        if (event.isCancelled()) {
            info.cancel();
        }
    }
}

