package org.wild.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.VvNUnuUUuN;
import ru.metaculture.protection.nVvVVUun;

@Mixin({class_408.class})
public abstract class ChatScreenMixin extends class_437 {
   protected ChatScreenMixin(class_2561 var1) {
      super(var1);
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelChatScreenRenderDuringCorruption(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var5.cancel();
      }
   }

   @Inject(
      method = {"renderBackground"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$cancelChatScreenBackgroundDuringCorruption(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var5.cancel();
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void litka$animateChat(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      nVvVVUun var6 = animations();
      if (var6 != null && var6.nuUnNvnuUu && var6.NVNnnvnuunNv.C00OOC00oO("Чат")) {
         if (var6.c0oOOCcCoC0 == null) {
            var6.UvnvNVnnnnNU();
         }

         if (!var6.NVNnnvnuunNv()) {
            var6.c0oOOCcCoC0.UuUVuuUu(1.0);
         } else {
            var6.c0oOOCcCoC0.UuUVuuUu(0.0);
         }

         float var7 = (float)var6.c0oOOCcCoC0.uVUuuVnNVU();
         float var8 = (1.0F - var7) * 30.0F;
         var1.method_51448().pushMatrix();
         var1.method_51448().translate(0.0F, var8);
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void litka$endChatAnimate(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      nVvVVUun var6 = animations();
      if (var6 != null && var6.nuUnNvnuUu && var6.NVNnnvnuunNv.C00OOC00oO("Чат")) {
         var1.method_51448().popMatrix();
      }
   }

   @Inject(
      method = {"keyPressed"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$interceptEscape(int var1, int var2, int var3, CallbackInfoReturnable<Boolean> var4) {
      if (var1 == 256) {
         nVvVVUun var5 = animations();
         if (var5 != null && var5.nuUnNvnuUu && var5.NVNnnvnuunNv.C00OOC00oO("Чат")) {
            if (!var5.NVNnnvnuunNv()) {
               var5.uVUVnuvnuVuv();
               var4.setReturnValue(true);
            } else if (!var5.uVunuUNVVUUV()) {
               class_310 var6 = class_310.method_1551();
               if (var6 != null) {
                  var5.uNnUnnuNUnNu();
                  var6.method_1507(null);
               }

               var4.setReturnValue(true);
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
   private void litka$deferEnterClose(class_310 var1, class_437 var2) {
      nVvVVUun var3 = animations();
      if (var3 != null && var3.nuUnNvnuUu && var3.NVNnnvnuunNv.C00OOC00oO("Чат") && var2 == null) {
         if (!var3.NVNnnvnuunNv()) {
            var3.uVUVnuvnuVuv();
         }
      } else {
         var1.method_1507(var2);
      }
   }

   @Inject(
      method = {"removed"},
      at = {@At("HEAD")}
   )
   private void litka$onChatClose(CallbackInfo var1) {
      nVvVVUun var2 = animations();
      if (var2 != null) {
         var2.uNnUnnuNUnNu();
      }
   }

   private static nVvVVUun animations() {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return null;
      } else {
         return NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null ? NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class) : null;
      }
   }
}
