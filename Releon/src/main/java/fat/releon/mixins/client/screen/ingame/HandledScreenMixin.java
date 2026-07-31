package fat.releon.mixins.client.screen.ingame;

import l.Helper124;
import l.Event5;
import l.AutoBuy;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.screen.slot.Slot;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({HandledScreen.class})
public abstract class HandledScreenMixin {
   @Shadow
   public int backgroundWidth;
   @Shadow
   public int backgroundHeight;
   @Shadow
   @Nullable
   protected Slot focusedSlot;

   public HandledScreenMixin() {
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   public void render(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      Helper124.method1026(new Event5(var1, this.focusedSlot, this.backgroundWidth, this.backgroundHeight));
      AutoBuy.method3834(var1, this.backgroundWidth, this.backgroundHeight);
   }

   @Inject(
      method = {"mouseClicked"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseClicked(double var1, double var3, int var5, CallbackInfoReturnable<Boolean> var6) {
      if (AutoBuy.method3836(var1, var3, var5)) {
         var6.setReturnValue(true);
      }
   }

   @Inject(
      method = {"mouseDragged"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseDragged(double var1, double var3, int var5, double var6, double var8, CallbackInfoReturnable<Boolean> var10) {
      if (AutoBuy.method3837(var1, var3, var5)) {
         var10.setReturnValue(true);
      }
   }

   @Inject(
      method = {"mouseReleased"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseReleased(double var1, double var3, int var5, CallbackInfoReturnable<Boolean> var6) {
      if (AutoBuy.method3838(var1, var3, var5)) {
         var6.setReturnValue(true);
      }
   }

   @Inject(
      method = {"mouseScrolled"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseScrolled(double var1, double var3, double var5, double var7, CallbackInfoReturnable<Boolean> var9) {
      if (AutoBuy.method3835(var7)) {
         var9.setReturnValue(true);
      }
   }
}
