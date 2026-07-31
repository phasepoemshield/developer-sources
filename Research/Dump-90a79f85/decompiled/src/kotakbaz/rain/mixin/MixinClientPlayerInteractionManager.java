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
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.F;
import kotakbaz.rain.event.events.d_0;
import kotakbaz.rain.module.modules.player.e_0;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_636.class})
public class MixinClientPlayerInteractionManager {
    public MixinClientPlayerInteractionManager() {
        super();
    }

    @Inject(method={"method_2906"}, at={@At(value="HEAD")}, cancellable=true)
    private void onClickSlot(int syncId, int slotId, int button, class_1713 actionType, class_1657 player, CallbackInfo ci) {
        F event = new F(actionType, slotId, button, syncId);
        a.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
        }
    }

    @Inject(method={"method_2918"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAttackEntity(class_1657 player, class_1297 target, CallbackInfo ci) {
        if (e_0.INSTANCE.handleAttack(target)) {
            ci.cancel();
            return;
        }
        a.INSTANCE.post(new d_0(target));
    }
}

