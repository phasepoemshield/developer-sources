package sg.mx;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.destra.core.DestraClient;
import ru.destra.event.EntityPredicateEvent;

@Mixin(ClientPlayerInteractionManager.class)
public class PlayerControllerMixin {
   @Inject(method = "attackEntity", at = @At("HEAD"), cancellable = true)
   public void asd(PlayerEntity var1, Entity var2, CallbackInfo var3) {
      EntityPredicateEvent var4 = new EntityPredicateEvent(var2);
      DestraClient.getInstance().getEventBus().post(var4);
   }

   @Inject(method = "attackBlock", at = @At("HEAD"), cancellable = true)
   private void destra$protectPickaxeOnAttackBlock(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      if (this.shouldCancelMining()) {
         var3.setReturnValue(false);
      }
   }

   @Inject(method = "updateBlockBreakingProgress", at = @At("HEAD"), cancellable = true)
   private void destra$protectPickaxeOnBreakingProgress(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      if (this.shouldCancelMining()) {
         var3.setReturnValue(false);
      }
   }

   private boolean shouldCancelMining() {
      return DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null
         ? DestraClient.getInstance().getModuleManager().mineHelper.checkAndHandleLowPickaxe()
         : false;
   }
}
