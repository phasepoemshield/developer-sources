package fat.releon.mixins.player.entity;

import l.Helper124;
import l.Helper187;
import l.Helper371;
import l.Event16;
import l.Helper401;
import l.Event24;
import l.Helper429;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult.Success;
import net.minecraft.util.ActionResult.SwingSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ClientPlayerInteractionManager.class})
public class ClientPlayerInteractionManagerMixin {
   public ClientPlayerInteractionManagerMixin() {
   }

   @Inject(
      method = {"attackEntity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void attackEntityHook(PlayerEntity var1, Entity var2, CallbackInfo var3) {
      Helper401 var4 = new Helper401(var2);
      Helper124.method1026(var4);
      if (var4.method581()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"interactItem"},
      at = {@At("RETURN")}
   )
   public void interactItemHook(PlayerEntity var1, Hand var2, CallbackInfoReturnable<ActionResult> var3) {
      if (var3.getReturnValue() instanceof Success var4 && !var4.swingSource().equals(SwingSource.CLIENT)) {
         Helper429 var6 = new Helper429((byte)0);
         Helper124.method1026(var6);
      }
   }

   @Inject(
      method = {"stopUsingItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void stopUsingItemHook(CallbackInfo var1) {
      Helper429 var2 = new Helper429((byte)2);
      Helper124.method1026(var2);
      if (Helper187.INSTANCE.method1617()) {
         Helper187.INSTANCE.method1615(false);
         var1.cancel();
      }
   }

   @Inject(
      method = {"interactItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void gameModeHook(PlayerEntity var1, Hand var2, CallbackInfoReturnable<ActionResult> var3) {
      Helper429 var4 = new Helper429((byte)-1);
      Helper124.method1026(var4);
      if (var4.method581()) {
         var3.setReturnValue(ActionResult.PASS);
      }
   }

   @Inject(
      method = {"clickSlot"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void clickSlotHook(int var1, int var2, int var3, SlotActionType var4, PlayerEntity var5, CallbackInfo var6) {
      Helper371 var7 = new Helper371(var1, var2, var3, var4);
      Helper124.method1026(var7);
      if (var7.method581()) {
         var6.cancel();
      }
   }

   @Inject(
      method = {"updateBlockBreakingProgress"},
      at = {@At("HEAD")}
   )
   private void injectBlockBreaking(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      Helper124.method1026(new Event16(var1, var2));
   }

   @Inject(
      method = {"breakBlock"},
      at = {@At("RETURN")}
   )
   private void injectBreakBlock(BlockPos var1, CallbackInfoReturnable<Boolean> var2) {
      Helper124.method1026(new Event24(var1));
   }
}
