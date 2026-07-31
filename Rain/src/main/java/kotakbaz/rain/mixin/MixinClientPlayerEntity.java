/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.DropEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={ClientPlayerEntity.class})
public class MixinClientPlayerEntity {
    @Inject(method={"method_5773"}, at={@At(value="HEAD")})
    public void tickHook(CallbackInfo ci) {
        EventManager.INSTANCE.post(new PlayerUpdateEvent());
    }

    @Inject(method={"method_7290"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$lockSlotOnDrop(boolean entireStack, CallbackInfoReturnable<Boolean> cir) {
        ClientPlayerEntity player = (ClientPlayerEntity)this;
        DropEvent event = new DropEvent(player.getInventory().getSelectedSlot(), entireStack);
        EventManager.INSTANCE.post(event);
        if (event.getCancel()) {
            cir.setReturnValue((Object)false);
        }
    }
}

