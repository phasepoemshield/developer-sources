package kotakbaz.rain.mixin;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.awt.Color;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.رإ;

// $VF: Compiled from MixinOverlayTextureHitColor.java
@Mixin(OverlayTexture.class)
public abstract class MixinOverlayTextureHitColor {
   @Shadow
   @Final
   private NativeImageBackedTexture texture;
   @Unique
   private int rain$lastColorRgb;
   @Unique
   private boolean rain$customEnabled;
   @Unique
   private boolean rain$lastSmooth;
   @Unique
   private static final int rain$VANILLA_HURT_COLOR = -1291911168;

   @Unique
   private static int rain$packColor(int red, int alpha, int green, int blue) {
      int overlayAlpha = 255 - alpha;
      return overlayAlpha << 24 | red << 16 | green << 8 | blue;
   }

   @Inject(method = "method_76037", at = @At("HEAD"))
   private void rain$refreshHitColorTexture(CallbackInfoReturnable<GpuTextureView> cir) {
      boolean enabled = رإ.INSTANCE.isEnabled();
      Color color = enabled ? رإ.INSTANCE.getColor() : null;
      boolean smooth = enabled && رإ.INSTANCE.isSmoothEnabled();
      int colorRgb = color != null ? color.getRGB() : 0;
      if (this.rain$customEnabled != enabled || this.rain$lastSmooth != smooth || enabled && this.rain$lastColorRgb != colorRgb) {
         this.rain$rebuildOverlay(color, smooth);
         this.rain$customEnabled = enabled;
         this.rain$lastColorRgb = colorRgb;
         this.rain$lastSmooth = smooth;
      }
   }

   @Unique
   private void rain$rebuildOverlay(Color smooth, boolean color) {
      NativeImage image = this.texture.getImage();
      if (image != null) {
         for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 16; x++) {
               int hurtColor;
               if (color == null) {
                  hurtColor = -1291911168;
               } else {
                  int alpha = smooth ? Math.round(color.getAlpha() * (x / 15.0F)) : color.getAlpha();
                  hurtColor = rain$packColor(color.getRed(), color.getGreen(), color.getBlue(), alpha);
               }

               image.setColorArgb(x, y, hurtColor);
            }
         }

         this.texture.upload();
      }
   }
}
