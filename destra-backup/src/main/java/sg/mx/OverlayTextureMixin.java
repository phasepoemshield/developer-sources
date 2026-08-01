package sg.mx;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.module.HitColorModule;
import ru.destra.module.RenderTweaksModule;
import ru.destra.util.ColorUtil;

@Mixin(OverlayTexture.class)
public abstract class OverlayTextureMixin {
   private static final int DEFAULT_OVERLAY_COLOR = -1291911168;
   @Shadow
   @Final
   private NativeImageBackedTexture texture;
   @Unique
   private boolean destra$lastEnabled;
   @Unique
   private boolean destra$lastHideHurt;
   @Unique
   private int destra$lastColor;
   @Unique
   private float destra$lastOpacity;
   private static final int I弟 = 0;
   private static final float Iч = 0.5F;
   private static final float IО = 0.0F;
   private static final float IЭ = -255.0F;
   private static final int Iь = 0;

   public OverlayTextureMixin() {
      this.destra$lastColor = I弟;
      this.destra$lastOpacity = Float.NaN;
   }

   @Inject(method = "<init>", at = @At("TAIL"))
   private void onInit(CallbackInfo var1) {
      this.destra$reloadOverlay(true);
   }

   @Inject(method = "setupOverlayColor", at = @At("HEAD"))
   private void onSetupOverlayColor(CallbackInfo var1) {
      this.destra$reloadOverlay(false);
   }

   @Unique
   private void destra$reloadOverlay(boolean var1) {
      NativeImage var2 = this.texture.getImage();
      if (var2 != null) {
         HitColorModule var3 = null;
         RenderTweaksModule var4 = null;
         if (DestraClient.getInstance() != null && DestraClient.getInstance().getModuleManager() != null) {
            var3 = DestraClient.getInstance().getModuleManager().hitColor;
            var4 = DestraClient.getInstance().getModuleManager().renderTweaks;
         }

         boolean var5 = var4 != null && var4.shouldHideHurtFlash();
         boolean var6 = !var5 && var3 != null && ru.destra.misc.ModuleHelper.isEnabled(var3);
         int var7 = var6 ? var3.getColor() : 0;
         float var8 = var6 ? (Float)ru.destra.misc.ModuleHelper.getValue(var3.opacity) : Iч;
         if (var1
            || var6 != this.destra$lastEnabled
            || var5 != this.destra$lastHideHurt
            || var7 != this.destra$lastColor
            || Float.compare(var8, this.destra$lastOpacity) != 0) {
            if (var5) {
               destra$fillTopHalf(var2, 0);
            } else if (var6) {
               int var9 = MathHelper.clamp((int)(IО - IЭ * MathHelper.clamp(var8, 0.0F, 1.0F)), 0, 255);
               int var10 = destra$argb(ColorUtil.getRed(var7), ColorUtil.getGreen(var7), ColorUtil.getBlueAlt(var7), var9);
               destra$fillTopHalf(var2, var10);
            } else {
               destra$fillTopHalf(var2, DEFAULT_OVERLAY_COLOR);
            }

            this.texture.upload();
            this.destra$lastEnabled = var6;
            this.destra$lastHideHurt = var5;
            this.destra$lastColor = var7;
            this.destra$lastOpacity = var8;
         }
      }
   }

   @Unique
   private static void destra$fillTopHalf(NativeImage var0, int var1) {
      for (int var2 = 0; var2 < 8; var2++) {
         for (int var3 = 0; var3 < 16; var3++) {
            var0.setColorArgb(var3, var2, var1);
         }
      }
   }

   @Unique
   private static int destra$argb(int var0, int var1, int var2, int var3) {
      return var3 << 24 | var0 << 16 | var1 << 8 | var2;
   }

   static {}
}
