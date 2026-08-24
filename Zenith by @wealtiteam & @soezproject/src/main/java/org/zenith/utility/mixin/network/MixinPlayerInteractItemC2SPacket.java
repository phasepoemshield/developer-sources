package org.zenith.utility.mixin.network;

import org.zenith.core.CloudRouter;
import org.zenith.module.GrimGlide;
import org.zenith.module.GuiWalk;

import org.zenith.ZenithClient;
import org.zenith.rotation.Rotation;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;















import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PlayerInteractItemC2SPacket.class})
public class MixinPlayerInteractItemC2SPacket {
   @Shadow
   public float field_51930;
   @Shadow
   public float field_51931;

   public MixinPlayerInteractItemC2SPacket() {
   }

   @Inject(
      method = {"<init>(Lnet/minecraft/util/Hand;IFF)V"},
      at = {@At("RETURN")}
   )
   public void modifyRotation(Hand var1, int var2, float var3, float var4, CallbackInfo var5) {
      if (ZenithClient.on23().CloudRouter().ZClass092() != null) {
         Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().ZClass092();
         this.field_51930 = ililiiili1ll1li11.GrimGlide();
         this.field_51931 = ililiiili1ll1li11.GuiWalk();
      }
   }
}
