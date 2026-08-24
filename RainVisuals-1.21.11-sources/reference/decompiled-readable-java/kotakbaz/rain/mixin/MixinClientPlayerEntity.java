/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.events.DropEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0631\u0638;

@Mixin(value={ClientPlayerEntity.class})
public class MixinClientPlayerEntity {
    @Inject(method={"method_5773"}, at={@At(value="HEAD")})
    public void tickHook(CallbackInfo ci) {
        \u0631\u0638.INSTANCE.post(new PlayerUpdateEvent());
    }

    @Inject(method={"method_7290"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$lockSlotOnDrop(boolean entireStack, CallbackInfoReturnable<Boolean> cir) {
        ClientPlayerEntity player = (ClientPlayerEntity)this;
        DropEvent event = new DropEvent(player.getInventory().getSelectedSlot(), entireStack);
        \u0631\u0638.INSTANCE.post(event);
        if (event.getCancel()) {
            cir.setReturnValue((Object)false);
        }
    }
}

