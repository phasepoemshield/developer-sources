package org.wild.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.Animations;
import ru.metaculture.protection.O0000000000OO0;
import ru.metaculture.protection.WildClient;

@Mixin({ChatScreen.class})
public abstract class ChatScreenMixin extends Screen {
   protected ChatScreenMixin(Text text) {
      super(text);
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelChatScreenRenderDuringCorruption(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelChatScreenBackgroundDuringCorruption(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      if (O0000000000OO0.O000000000000()) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void litka$animateChat(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      Animations var6 = animations();
      if (var6 != null && var6.O0000000000000 && var6.O000000000O.O000000000("Чат")) {
         if (var6.O000000000OO0 == null) {
            var6.O0000000000OO0();
         }

         if (!var6.O000000000O()) {
            var6.O000000000OO0.O00000000(1.0);
         } else {
            var6.O000000000OO0.O00000000(0.0);
         }

         float var7 = (float)var6.O000000000OO0.O00000000000O0();
         float var8 = (1.0F - var7) * 30.0F;
         drawContext.getMatrices().pushMatrix();
         drawContext.getMatrices().translate(0.0F, var8);
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void litka$endChatAnimate(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      Animations var6 = animations();
      if (var6 != null && var6.O0000000000000 && var6.O000000000O.O000000000("Чат")) {
         drawContext.getMatrices().popMatrix();
      }
   }

   @Inject(
      method = {"keyPressed"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$interceptEscape(int i, int j, int k, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
      if (i == 256) {
         Animations var5 = animations();
         if (var5 != null && var5.O0000000000000 && var5.O000000000O.O000000000("Чат")) {
            if (!var5.O000000000O()) {
               var5.O0000000000OOO();
               callbackInfoReturnable.setReturnValue(true);
            } else if (!var5.O000000000O0()) {
               MinecraftClient var6 = MinecraftClient.getInstance();
               if (var6 != null) {
                  var5.O000000000O000();
                  var6.setScreen(null);
               }

               callbackInfoReturnable.setReturnValue(true);
            }
         }
      }
   }

   @Redirect(
      method = {"keyPressed"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/MinecraftClient;setScreen(Lnet/minecraft/client/gui/screen/Screen;)V"
      ),
      require = 0
   )
   private void litka$deferEnterClose(MinecraftClient minecraftClient, Screen screen) {
      Animations var3 = animations();
      if (var3 != null && var3.O0000000000000 && var3.O000000000O.O000000000("Чат") && screen == null) {
         if (!var3.O000000000O()) {
            var3.O0000000000OOO();
         }
      } else {
         minecraftClient.setScreen(screen);
      }
   }

   @Inject(
      method = {"removed"},
      at = {@At("HEAD")}
   )
   private void litka$onChatClose(CallbackInfo callbackInfo) {
      Animations var2 = animations();
      if (var2 != null) {
         var2.O000000000O000();
      }
   }

   private static Animations animations() {
      return WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(Animations.class) : null;
   }
}
