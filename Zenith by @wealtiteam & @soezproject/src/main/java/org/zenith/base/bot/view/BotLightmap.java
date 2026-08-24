package org.zenith.base.bot.view;

import org.zenith.module.Bot;

import org.zenith.base.bot.world.BotWorld;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;














import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;

final class BotLightmap {
   public final NativeImage image = new NativeImage(16, 16, false);
   public final NativeImageBackedTexture texture = new NativeImageBackedTexture(this.image);
   public boolean uploaded;

   BotLightmap() {
   }

   int getGlId() {
      return this.texture.getGlId();
   }

   void update(BotWorld var1) {
      if (!this.uploaded) {
         this.uploaded = true;
         int i = ColorHelper.getArgb(255, 255, 255, 255);

         for (int j = 0; j < 16; j++) {
            for (int k = 0; k < 16; k++) {
               this.image.setColorArgb(k, j, i);
            }
         }

         this.texture.upload();
      }
   }

   static float getSkyBrightness(BotWorld var0) {
      float f = var0.getSkyAngle(1.0F);
      float f1 = 1.0F - (MathHelper.cos(f * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      f1 = MathHelper.clamp(f1, 0.0F, 1.0F);
      f1 = 1.0F - f1;
      f1 *= 1.0F - var0.getRainGradient(1.0F) * 5.0F / 16.0F;
      f1 *= 1.0F - var0.getThunderGradient(1.0F) * 5.0F / 16.0F;
      return f1 * 0.8F + 0.2F;
   }

   public void close() {
      this.texture.close();
   }
}
