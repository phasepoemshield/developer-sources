package zenith.zov.utility.mixin.world;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.world.RaycastContext.class_242;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import zenith.ZenithClient;
import zenith.floatHolder_6;

@Mixin({Item.class})
public class MixinItem {
   @ModifyExpressionValue(
      method = {"raycast"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;getRotationVector(FF)Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   private static Vec3d hookFixRotation(Vec3d Vec3d, World World, PlayerEntity PlayerEntity, class_242 class_242) {
      floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl();
      return PlayerEntity == MinecraftClient.getInstance().player && il1ll111liili1ll11liil != null ? il1ll111liili1ll11liil.lllIl11IIIlIIlI1() : Vec3d;
   }
}
