/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.ClickSlotEvent;
import kotakbaz.rain.module.modules.player.FakePlayerModule;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ClientPlayerInteractionManager.class})
public class MixinClientPlayerInteractionManager {
    @Inject(method={"method_2906"}, at={@At(value="HEAD")}, cancellable=true)
    private void onClickSlot(int syncId, int slotId, int button, SlotActionType actionType, PlayerEntity player, CallbackInfo ci) {
        ClickSlotEvent event = new ClickSlotEvent(actionType, slotId, button, syncId);
        EventManager.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
        }
    }

    @Inject(method={"method_2918"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAttackEntity(PlayerEntity player, Entity target, CallbackInfo ci) {
        if (FakePlayerModule.INSTANCE.handleAttack(target)) {
            ci.cancel();
            return;
        }
        EventManager.INSTANCE.post(new AttackEvent(target));
    }
}

