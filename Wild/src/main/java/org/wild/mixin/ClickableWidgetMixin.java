package org.wild.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ClickableWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Animations;
import ru.metaculture.protection.O0000O000O00O;
import ru.metaculture.protection.O0000O000O0O00;
import ru.metaculture.protection.WildClient;

@Mixin({ClickableWidget.class})
public abstract class ClickableWidgetMixin {
   @Unique
   private O0000O000O00O litka$buttonMotion;
   @Unique
   private boolean litka$buttonScaled;

   @Shadow
   public abstract int getX();

   @Shadow
   public abstract int getY();

   @Shadow
   public abstract int getWidth();

   @Shadow
   public abstract int getHeight();

   @Shadow
   public abstract boolean isHovered();

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/widget/ClickableWidget;renderWidget(Lnet/minecraft/client/gui/DrawContext;IIF)V"
      )}
   )
   private void litka$preRenderWidget(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      this.litka$buttonScaled = false;
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         Animations var6 = WildClient.O00000000.O000000000.O00000000(Animations.class);
         if (var6 != null && var6.O0000000000000 && var6.O000000000O.O000000000("Кнопки")) {
            if (this.litka$buttonMotion == null) {
               this.litka$buttonMotion = new O0000O000O00O(1.0F);
            }

            float var7 = this.litka$buttonMotion.O00000000(this.isHovered() ? 1.03F : 1.0F, this.litka$buttonSpring(var6));
            float var8 = this.getX() + this.getWidth() * 0.5F;
            float var9 = this.getY() + this.getHeight() * 0.5F;
            drawContext.getMatrices().pushMatrix();
            drawContext.getMatrices().translate(var8, var9);
            drawContext.getMatrices().scale(var7, var7);
            drawContext.getMatrices().translate(-var8, -var9);
            this.litka$buttonScaled = true;
         }
      }
   }

   @Unique
   private O0000O000O0O00 litka$buttonSpring(Animations o00000O00O) {
      O0000O000O0O00 var2 = O0000O000O0O00.O00000000000OO();
      float var3 = o00000O00O.O0000000000OO();
      return new O0000O000O0O00(var2.O000000000O() * var3, var2.O000000000O0(), var2.O000000000O00(), var2.O000000000O000());
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/widget/ClickableWidget;renderWidget(Lnet/minecraft/client/gui/DrawContext;IIF)V",
         shift = Shift.AFTER
      )}
   )
   private void litka$postRenderWidget(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      if (this.litka$buttonScaled) {
         drawContext.getMatrices().popMatrix();
         this.litka$buttonScaled = false;
      }
   }
}
