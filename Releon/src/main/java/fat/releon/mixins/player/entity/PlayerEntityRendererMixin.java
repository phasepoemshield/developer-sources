package fat.releon.mixins.player.entity;

import l.Cosmetic;
import l.Speed;
import l.Helper309;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.entity.EntityPose;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PlayerEntityRenderer.class})
public class PlayerEntityRendererMixin {
   public PlayerEntityRendererMixin() {
   }

   @Inject(
      method = {"updateRenderState(Lnet/minecraft/client/network/AbstractClientPlayerEntity;Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;F)V"},
      at = {@At("TAIL")}
   )
   private void releon$forceSpookyPose(AbstractClientPlayerEntity var1, PlayerEntityRenderState var2, float var3, CallbackInfo var4) {
      MinecraftClient var5 = MinecraftClient.getInstance();
      if (var5.player != null && var1.getId() == var5.player.getId()) {
         Speed var6 = Speed.method2390();
         if (var6 != null && var6.method2391()) {
            var2.pose = EntityPose.GLIDING;
            var2.isGliding = true;
            var2.isSwimming = false;
            var2.leaningPitch = 0.0F;
            var2.glidingTicks = Math.max(var2.glidingTicks, 10.0F);
            var2.applyFlyingRotation = false;
         }
      }
   }

   @Inject(
      method = {"updateRenderState(Lnet/minecraft/client/network/AbstractClientPlayerEntity;Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;F)V"},
      at = {@At("TAIL")}
   )
   private void releon$mirrorSkinToFriends(AbstractClientPlayerEntity var1, PlayerEntityRenderState var2, float var3, CallbackInfo var4) {
      MinecraftClient var5 = MinecraftClient.getInstance();
      Cosmetic var6 = Cosmetic.method1873();
      if (var5.player != null && var6 != null && var6.isState()) {
         if (var1.getId() != var5.player.getId() && Helper309.method3075(var1) && var6.method1878(var1)) {
            var2.skinTextures = var5.player.getSkinTextures();
         }
      }
   }
}
