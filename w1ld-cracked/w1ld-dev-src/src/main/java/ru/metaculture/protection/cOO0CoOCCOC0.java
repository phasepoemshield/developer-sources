package ru.metaculture.protection;

import com.mojang.logging.LogUtils;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Optional;
import javax.imageio.ImageIO;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

final class cOO0CoOCCOC0 {
   private static final class_2960 UuUVuuUu = class_2960.method_60655("wild", "textures/profile/gigachad.jpg");
   private static final int C00OOC00oO = 256;
   private static final float uUnuvNvvNU = 0.45F;
   private static final float vVvUvVVuuNvV = 0.27F;
   private static final float uNNnnnuuuN = 0.42F;
   private static int nuUnNvnuUu;
   private static boolean VVuuUN;

   private cOO0CoOCCOC0() {
   }

   static int UuUVuuUu() {
      if (!VVuuUN) {
         VVuuUN = true;
         nuUnNvnuUu = C00OOC00oO();
      }

      return nuUnNvnuUu;
   }

   private static int C00OOC00oO() {
      class_310 var0 = class_310.method_1551();
      if (var0 != null && var0.method_1478() != null) {
         Optional var1 = var0.method_1478().method_14486(UuUVuuUu);
         if (var1.isEmpty()) {
            return -1;
         } else {
            try {
               int var6;
               try (InputStream var2 = ((class_3298)var1.get()).method_14482()) {
                  BufferedImage var3 = ImageIO.read(var2);
                  if (var3 == null) {
                     return -1;
                  }

                  BufferedImage var4 = UuUVuuUu(var3);
                  ByteBuffer var5 = C00OOC00oO(var4);
                  var6 = UuUVuuUu(var5, var4.getWidth(), var4.getHeight());
               }

               return var6;
            } catch (Throwable var9) {
               LogUtils.getLogger().error("[WildClient] failed to load profile avatar texture", var9);
               return -1;
            }
         }
      } else {
         return -1;
      }
   }

   private static BufferedImage UuUVuuUu(BufferedImage var0) {
      int var1 = var0.getWidth();
      int var2 = var0.getHeight();
      int var3 = Math.max(1, Math.min(Math.min(var1, var2), Math.round(0.42F * var2)));
      int var4 = Math.max(0, Math.min(var1 - var3, Math.round(0.45F * var1) - var3 / 2));
      int var5 = Math.max(0, Math.min(var2 - var3, Math.round(0.27F * var2) - var3 / 2));
      BufferedImage var6 = new BufferedImage(256, 256, 2);
      Graphics2D var7 = var6.createGraphics();
      var7.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
      var7.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      var7.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var7.drawImage(var0, 0, 0, 256, 256, var4, var5, var4 + var3, var5 + var3, null);
      var7.dispose();
      return var6;
   }

   private static ByteBuffer C00OOC00oO(BufferedImage var0) {
      int var1 = var0.getWidth();
      int var2 = var0.getHeight();
      int[] var3 = new int[var1 * var2];
      var0.getRGB(0, 0, var1, var2, var3, 0, var1);
      ByteBuffer var4 = BufferUtils.createByteBuffer(var1 * var2 * 4);

      for (int var5 = 0; var5 < var2; var5++) {
         for (int var6 = 0; var6 < var1; var6++) {
            int var7 = var3[var5 * var1 + var6];
            var4.put((byte)(var7 >> 16 & 0xFF));
            var4.put((byte)(var7 >> 8 & 0xFF));
            var4.put((byte)(var7 & 0xFF));
            var4.put((byte)(var7 >> 24 & 0xFF));
         }
      }

      var4.flip();
      return var4;
   }

   private static int UuUVuuUu(ByteBuffer var0, int var1, int var2) {
      VvuuVNVUn.NVnVnNnN var3 = VvuuVNVUn.UuUVuuUu();

      int var5;
      try {
         int var4 = GL11.glGenTextures();
         GL11.glBindTexture(3553, var4);
         GL11.glPixelStorei(3317, 1);
         GL11.glTexParameteri(3553, 10241, 9987);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         GL11.glTexImage2D(3553, 0, 32856, var1, var2, 0, 6408, 5121, var0);
         GL30.glGenerateMipmap(3553);
         var5 = var4;
      } finally {
         VvuuVNVUn.uUnuvNvvNU(var3);
      }

      return var5;
   }
}
