package fat.releon.mixins.player.entity;

import l.Helper351;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PlayerInteractItemC2SPacket.class})
public class PlayerInteractItemC2SPacketMixin {
   @Mutable
   @Shadow
   @Final
   private float yaw;
   @Mutable
   @Shadow
   @Final
   private float pitch;

   public PlayerInteractItemC2SPacketMixin() {
   }

   @Inject(
      method = {"<init>(Lnet/minecraft/util/Hand;IFF)V"},
      at = {@At("RETURN")}
   )
   private void modifyRotation(Hand var1, int var2, float var3, float var4, CallbackInfo var5) {
      Helper351 var6 = Helper351.INSTANCE;
      if (var6.method3486()) {
         this.yaw = var6.method3484();
         this.pitch = var6.method3485();
      }
   }
}
