/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_852
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_2338;
import net.minecraft.class_852;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.bq;

@Mixin(value={class_852.class})
public abstract class j {
    @Inject(method={"method_3682"}, at={@At(value="HEAD")}, cancellable=true)
    private void onMarkClosed(class_2338 pos, CallbackInfo info) {
        bq event = bq.get();
        ax.callEvent(event);
        if (event.isCancelled()) {
            info.cancel();
        }
    }
}

