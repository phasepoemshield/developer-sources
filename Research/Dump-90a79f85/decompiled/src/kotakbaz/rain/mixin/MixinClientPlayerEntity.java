/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.D;
import kotakbaz.rain.event.events.a_0;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_746.class})
public class MixinClientPlayerEntity {
    public MixinClientPlayerEntity() {
        super();
    }

    @Inject(method={"method_5773"}, at={@At(value="HEAD")})
    public void tickHook(CallbackInfo ci) {
        a.INSTANCE.post(new D());
    }

    @Inject(method={"method_7290"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$lockSlotOnDrop(boolean entireStack, CallbackInfoReturnable<Boolean> cir) {
        class_746 player = (class_746)this;
        a_0 event = new a_0(player.method_31548().method_67532(), entireStack);
        a.INSTANCE.post(event);
        if (event.getCancel()) {
            cir.setReturnValue((Object)false);
        }
    }
}

