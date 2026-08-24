package org.zenith.utility.mixin.render;

import org.zenith.core.VisualSettingsStore;
import org.zenith.event.PacketReceiveEvent;
import org.zenith.event.PacketSendEvent;
import org.zenith.module.ItemUseController;
import org.zenith.module.Module;
import org.zenith.module.Timer;
import org.zenith.util.Item;

import org.zenith.module.NoRender;

import org.zenith.event.EventGetFogColorHook;

import org.zenith.util.ColorUtils;
import org.zenith.event.EventGetFogColorHook;
import org.zenith.module.NoRender;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
















import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.FogShape;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BackgroundRenderer.class})
public class MixinBackGroundRenderer {
   public MixinBackGroundRenderer() {
   }

   @Inject(
      method = {"getFogModifier(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/client/render/BackgroundRenderer$StatusEffectFogModifier;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void onGetFogModifier(Entity var0, float var1, CallbackInfoReturnable<Object> var2) {
      NoRender ll1ll1l1lll1il11i1i = NoRender.noRender;
      if (ll1ll1l1lll1il11i1i.float380()) {
         var2.setReturnValue(null);
      }
   }

   @Inject(
      method = {"getFogColor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void getFogColorHook(Camera var0, float var1, ClientWorld var2, int var3, float var4, CallbackInfoReturnable<Vector4f> var5) {
      EventGetFogColorHook i1lllii11il = new EventGetFogColorHook();
      EventManager.call(i1lllii11il);
      if (i1lllii11il.isCancelled()) {
         int i = i1lllii11il.ItemUseController();
         var5.setReturnValue(
            new Vector4f(
               ColorUtils.PacketReceiveEvent(i),
               ColorUtils.PacketSendEvent(i),
               ColorUtils.VisualSettingsStore(i),
               ColorUtils.Item(i)
            )
         );
      }
   }

   @Inject(
      method = {"applyFog"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void modifyFog(Camera var0, FogType var1, Vector4f var2, float var3, boolean var4, float var5, CallbackInfoReturnable<Fog> var6) {
      EventGetFogColorHook i1lllii11il = new EventGetFogColorHook();
      EventManager.call(i1lllii11il);
      if (i1lllii11il.isCancelled()) {
         int i = i1lllii11il.ItemUseController();
         var6.setReturnValue(
            new Fog(
               2.0F,
               i1lllii11il.Timer(),
               FogShape.CYLINDER,
               ColorUtils.PacketReceiveEvent(i),
               ColorUtils.PacketSendEvent(i),
               ColorUtils.VisualSettingsStore(i),
               ColorUtils.Item(i)
            )
         );
      }
   }
}
