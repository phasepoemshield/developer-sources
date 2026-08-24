/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.ClickSlotEvent;
import kotakbaz.rain.event.events.ItemUseEvent;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u0627\u0625;
import oxxxde.\u0628\u0645;
import oxxxde.\u062b\u062b;
import oxxxde.\u0631\u0638;
import oxxxde.\u0634\u0652;
import oxxxde.\u0638\u0638;

@Mixin(value={ClientPlayerInteractionManager.class})
public class MixinClientPlayerInteractionManager {
    @Inject(method={"method_2906"}, at={@At(value="HEAD")}, cancellable=true)
    private void onClickSlot(int syncId, int slotId, int button, SlotActionType actionType, PlayerEntity player, CallbackInfo ci) {
        if (\u0638\u0638.INSTANCE.shouldBlockInventoryClick() || \u062b\u062b.INSTANCE.shouldBlockInventoryClick() || \u0628\u0645.INSTANCE.shouldBlockInventoryClick() || \u0634\u0652.INSTANCE.shouldBlockInventoryClick()) {
            ci.cancel();
            return;
        }
        ClickSlotEvent event = new ClickSlotEvent(actionType, slotId, button, syncId);
        \u0631\u0638.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
        }
    }

    @Inject(method={"method_2919"}, at={@At(value="RETURN")})
    private void onInteractItem(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        \u0631\u0638.INSTANCE.post(new ItemUseEvent(player, hand, (ActionResult)cir.getReturnValue()));
    }

    @Inject(method={"method_2918"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAttackEntity(PlayerEntity player, Entity target, CallbackInfo ci) {
        if (\u0627\u0625.INSTANCE.handleAttack(target)) {
            ci.cancel();
            return;
        }
        \u0631\u0638.INSTANCE.post(new AttackEvent(target));
    }

    @Inject(method={"method_2896"}, at={@At(value="RETURN")})
    private void onInteractBlock(ClientPlayerEntity player, Hand hand, BlockHitResult hitResult, CallbackInfoReturnable<ActionResult> cir) {
        \u0631\u0638.INSTANCE.post(new ItemUseEvent((PlayerEntity)player, hand, (ActionResult)cir.getReturnValue()));
    }
}

