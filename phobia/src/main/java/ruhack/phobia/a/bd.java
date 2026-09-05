/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_636
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.bj;
import ruhack.phobia.br;
import ruhack.phobia.ck;

@Mixin(value={class_636.class})
public class bd {
    @Inject(method={"method_2918"}, at={@At(value="HEAD")}, cancellable=true)
    public void attackEntityHook(class_1657 player, class_1297 target, CallbackInfo info) {
        ck event = new ck(target);
        ax.callEvent(event);
        if (event.isCancelled()) {
            info.cancel();
        }
    }

    @Inject(method={"method_2918"}, at={@At(value="HEAD")})
    private void onAttackEntity(class_1657 player, class_1297 target, CallbackInfo ci2) {
        bj event = new bj(target);
        ax.callEvent(event);
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

