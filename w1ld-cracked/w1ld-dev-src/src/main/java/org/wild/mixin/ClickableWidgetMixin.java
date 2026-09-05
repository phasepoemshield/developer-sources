package org.wild.mixin;

import net.minecraft.class_332;
import net.minecraft.class_339;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Cc0cOoOcC0o;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UUNnvUVnnnnN;
import ru.metaculture.protection.nVvVVUun;

@Mixin({class_339.class})
public abstract class ClickableWidgetMixin {
   @Unique
   private UUNnvUVnnnnN litka$buttonMotion;
   @Unique
   private boolean litka$buttonScaled;

   @Shadow
   public abstract int method_46426();

   @Shadow
   public abstract int method_46427();

   @Shadow
   public abstract int method_25368();

   @Shadow
   public abstract int method_25364();

   @Shadow
   public abstract boolean method_49606();

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/widget/ClickableWidget;renderWidget(Lnet/minecraft/client/gui/DrawContext;IIF)V"
      )}
   )
   private void litka$preRenderWidget(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         this.litka$buttonScaled = false;
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            nVvVVUun var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
            if (var6 != null && var6.nuUnNvnuUu && var6.NVNnnvnuunNv.C00OOC00oO("Кнопки")) {
               if (this.litka$buttonMotion == null) {
                  this.litka$buttonMotion = new UUNnvUVnnnnN(1.0F);
               }

               float var7 = this.litka$buttonMotion.UuUVuuUu(this.method_49606() ? 1.03F : 1.0F, this.litka$buttonSpring(var6));
               float var8 = this.method_46426() + this.method_25368() * 0.5F;
               float var9 = this.method_46427() + this.method_25364() * 0.5F;
               var1.method_51448().pushMatrix();
               var1.method_51448().translate(var8, var9);
               var1.method_51448().scale(var7, var7);
               var1.method_51448().translate(-var8, -var9);
               this.litka$buttonScaled = true;
            }
         }
      }
   }

   @Unique
   private Cc0cOoOcC0o litka$buttonSpring(nVvVVUun var1) {
      Cc0cOoOcC0o var2 = Cc0cOoOcC0o.vuuuNvNuv();
      float var3 = var1.vNVuvnUUnuUn();
      return new Cc0cOoOcC0o(var2.NVNnnvnuunNv() * var3, var2.uVunuUNVVUUV(), var2.UNnVVNvvnVvU(), var2.uNnUnnuNUnNu());
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/widget/ClickableWidget;renderWidget(Lnet/minecraft/client/gui/DrawContext;IIF)V",
         shift = Shift.AFTER
      )}
   )
   private void litka$postRenderWidget(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.litka$buttonScaled) {
         var1.method_51448().popMatrix();
         this.litka$buttonScaled = false;
      }
   }
}
