/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1536
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_1297;
import net.minecraft.class_1536;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.cz;
import ruhack.phobia.cz$Type;

@Mixin(value={class_1536.class})
public class ac {
    @Inject(method={"method_6954"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$preventFishingRodPull(class_1297 entity, CallbackInfo ci2) {
        if (entity != class_310.method_1551().field_1724) {
            return;
        }
        cz event = new cz(cz$Type.FISHING_ROD);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }
}

