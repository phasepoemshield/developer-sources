package fat.releon.mixins.player.item;

import l.Helper336;
import l.Helper351;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({Item.class})
public class ItemMixin {
   public ItemMixin() {
   }

   @Redirect(
      method = {"raycast"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;getRotationVector(FF)Lnet/minecraft/util/math/Vec3d;"
      )
   )
   private static Vec3d raycastHook(PlayerEntity var0, float var1, float var2) {
      Helper351 var3 = Helper351.INSTANCE;
      return var3.method3486() ? new Helper336(var3.method3484(), var3.method3485()).method3329() : var0.getRotationVector(var1, var2);
   }
}
