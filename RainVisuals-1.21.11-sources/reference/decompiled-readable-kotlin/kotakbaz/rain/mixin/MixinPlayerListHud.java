package kotakbaz.rain.mixin;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.PlayerSkinDrawer;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.حغ;
import oxxxde.ذج;
import oxxxde.را;
import oxxxde.طئ;

// $VF: Compiled from MixinPlayerListHud.java
@Mixin(PlayerListHud.class)
public class MixinPlayerListHud {
   @Unique
   private int rain$fadeColor(int color) {
      float alpha = this.rain$tabAlpha();
      if (alpha >= 0.999F) {
         return color;
      }

      int fadedAlpha = MathHelper.clamp(Math.round((color >>> 24 & 0xFF) * alpha), 0, 255);
      return color & 16777215 | fadedAlpha << 24;
   }

   @Redirect(
      method = "method_1919",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_7532;method_44445(Lnet/minecraft/class_332;Lnet/minecraft/class_2960;IIIZZI)V")
   )
   private void rain$fadeTabSkin(DrawContext size, Identifier color, int hatVisible, int upsideDown, int x, boolean y, boolean texture, int context) {
      PlayerSkinDrawer.draw(context, texture, x, y, size, hatVisible, upsideDown, this.rain$fadeColor(color));
   }

   @Unique
   private float rain$tabAlpha() {
      return ذج.INSTANCE.isEnabled() && ذج.INSTANCE.getSmoothTab().getValue() ? ذج.INSTANCE.getTabProgress() : 1.0F;
   }

   @Redirect(
      method = {"method_1919", "method_1922", "method_45590"},
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_332;method_27535(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;III)V")
   )
   private void rain$fadeTabText(DrawContext y, TextRenderer color, Text x, int context, int renderer, int text) {
      int fadedColor = this.rain$fadeColor(color);
      if (را.isMarked(text)) {
         طئ.enqueueA(x + 4.0F, y, 9.0F, this.rain$fadeColor(-1));
      }

      context.drawTextWithShadow(renderer, text, x, y, fadedColor);
   }

   @Inject(method = "method_1918", at = @At("RETURN"), cancellable = true)
   private void rain$addSocialMarker(PlayerListEntry playerInfo, CallbackInfoReturnable<Text> cir) {
      Text displayName = (Text)cir.getReturnValue();
      if (displayName != null && !را.isMarked(displayName) && حغ.INSTANCE.isRainUser(playerInfo.getProfile().id())) {
         cir.setReturnValue(را.markForTab(displayName));
      }
   }

   @Redirect(
      method = "method_1919",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_332;method_35720(Lnet/minecraft/class_327;Lnet/minecraft/class_5481;III)V")
   )
   private void rain$fadeTabOrderedText(DrawContext context, TextRenderer color, OrderedText x, int y, int renderer, int text) {
      context.drawTextWithShadow(renderer, text, x, y, this.rain$fadeColor(color));
   }

   @Redirect(method = "method_1919", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_332;method_25294(IIIII)V"))
   private void rain$fadeTabFill(DrawContext context, int color, int y2, int y1, int x1, int x2) {
      context.fill(x1, y1, x2, y2, this.rain$fadeColor(color));
   }

   @Redirect(
      method = {"method_1923", "method_45590"},
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_332;method_52706(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIII)V")
   )
   private void rain$fadeTabTexture(DrawContext height, RenderPipeline width, Identifier context, int pipeline, int x, int texture, int y) {
      context.drawGuiTexture(pipeline, texture, x, y, width, height, this.rain$tabAlpha());
   }
}
