package org.wild.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.O00000OOO0000;
import ru.metaculture.protection.O0000O00OO0OO;

@Mixin({ConnectScreen.class})
public abstract class ConnectScreenMixin extends Screen {
   @Shadow
   private Text status;
   @Shadow
   private long lastNarrationTime;

   protected ConnectScreenMixin(Text text) {
      super(text);
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$renderPremiumConnect(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      MinecraftClient var6 = MinecraftClient.getInstance();
      ConnectScreen var7 = (ConnectScreen)(Object)this;
      if (var6 == null) {
         O0000O00OO0OO.O00000000("ConnectScreen.render", var7, "client missing", null);
      } else {
         if (!O00000OOO0000.O00000000().O00000000(var6, i, j, 1.0F, var7)) {
            int var8 = var6.getWindow() != null ? var6.getWindow().getScaledWidth() : this.width;
            int var9 = var6.getWindow() != null ? var6.getWindow().getScaledHeight() : this.height;
            drawContext.fillGradient(0, 0, var8, var9, -16447732, -15658213);
            O0000O00OO0OO.O00000000(var7, "render.safe-fallback", "backdrop unavailable");
         } else {
            O0000O00OO0OO.O00000000(var7, "render.custom", "connect-status overlay");
         }

         long var10 = Util.getMeasuringTimeMs();
         if (var10 - this.lastNarrationTime > 2000L && var6.getNarratorManager() != null) {
            this.lastNarrationTime = var10;
            var6.getNarratorManager().narrateSystemImmediately(Text.translatable("narrator.joining"));
         }

         super.render(drawContext, i, j, f);
         O00000OOO0000.O00000000().O00000000(var6, this.status);
         callbackInfo.cancel();
      }
   }
}
