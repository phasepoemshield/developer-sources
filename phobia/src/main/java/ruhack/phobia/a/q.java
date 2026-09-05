/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_638
 *  net.minecraft.class_638$class_5271
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_1297;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.bw;
import ruhack.phobia.c;
import ruhack.phobia.di;
import ruhack.phobia.iu;
import ruhack.phobia.pn;

@Mixin(value={class_638.class})
public class q
implements c {
    @Shadow
    @Final
    private class_638.class_5271 field_24430;

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    public void initHook(CallbackInfo info) {
        ax.callEvent(new di());
    }

    @Inject(method={"method_53875"}, at={@At(value="HEAD")}, cancellable=true)
    public void addEntityHook(class_1297 entity, CallbackInfo ci2) {
        if (pn.nullCheck()) {
            return;
        }
        bw event = new bw(entity);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_29090"}, at={@At(value="HEAD")}, cancellable=true)
    private void onTickTime(CallbackInfo ci2) {
        iu ambience = iu.getInstance();
        if (ambience != null && ambience.isState()) {
            this.field_24430.method_165(ambience.getInternalTime());
            ci2.cancel();
        }
    }
}

