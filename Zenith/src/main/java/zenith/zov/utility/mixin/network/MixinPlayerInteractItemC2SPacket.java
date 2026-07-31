package zenith.zov.utility.mixin.network;

import net.minecraft.util.Hand;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.ZenithClient;
import zenith.floatHolder_6;

@Mixin({PlayerInteractItemC2SPacket.class})
public class MixinPlayerInteractItemC2SPacket {
   @Shadow
   public float yaw;
   @Shadow
   public float pitch;

   @Inject(
      method = {"<init>(Lnet/minecraft/util/Hand;IFF)V"},
      at = {@At("RETURN")}
   )
   private void modifyRotation(Hand Hand, int i, float f, float f1, CallbackInfo callbackinfo) {
      if (ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl() != null) {
         floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance()
            .ZenithInternal057()
            .I111Ill1lIllIIIl();
         this.yaw = il1ll111liili1ll11liil.AutoBrewing();
         this.pitch = il1ll111liili1ll11liil.Basefinder();
      }
   }
}
