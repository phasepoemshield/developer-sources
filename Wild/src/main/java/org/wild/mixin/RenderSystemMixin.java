package org.wild.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.util.tracy.TracyFrameCapturer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.O00000000OO0;
import ru.metaculture.protection.O00000000OO0OO;
import ru.metaculture.protection.O0000O0O00O0O0;
import ru.metaculture.protection.PrismaticChamsRenderer;
import ru.metaculture.protection.WildClient;

@Mixin({RenderSystem.class})
public class RenderSystemMixin {
   @Inject(
      method = {"flipFrame(JLnet/minecraft/client/util/tracy/TracyFrameCapturer;)V"},
      at = {@At("HEAD")}
   )
   private static void flipFrame(long l, TracyFrameCapturer tracyFrameCapturer, CallbackInfo callbackInfo) {
      WildClient.O00000000000O0();
   }

   @Inject(
      method = {"flipFrame(JLnet/minecraft/client/util/tracy/TracyFrameCapturer;)V"},
      at = {@At("TAIL")}
   )
   private static void wild$clearChamsUniforms(long l, TracyFrameCapturer tracyFrameCapturer, CallbackInfo callbackInfo) {
      PrismaticChamsRenderer.O000000000000();
      O0000O0O00O0O0.O0000000000();
      int var4 = O00000000OO0.O00000000000();
      if (var4 != 0) {
         O00000000OO0OO.O00000000().O00000000("RenderSystem.flipFrame", var4);
      }
   }
}
