package l;

import com.google.common.collect.Maps;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWImage.Buffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public final class Helper208 implements Helper160 {
   private static final Map<String, Integer> dynamicIdCounters = Maps.newHashMap();

   public static NativeImageBackedTexture method1781(String var0) throws java.io.IOException {
      return var0 != null && !var0.isEmpty() ? new NativeImageBackedTexture(method1782(NativeImage.read(new URL(var0).openStream()))) : null;
   }

   public static NativeImage method1782(NativeImage var0) {
      if (var0 == null) {
         return null;
      } else {
         byte var1 = 22;
         byte var2 = 22;
         int var3 = var0.getWidth();
         int var4 = var0.getHeight();

         for (int var5 = var0.getHeight(); var1 < var3 || var2 < var5; var2 *= 2) {
            var1 *= 2;
         }

         NativeImage var8 = new NativeImage(var1, var2, true);

         for (int var6 = 0; var6 < var3; var6++) {
            for (int var7 = 0; var7 < var4; var7++) {
               var8.setColorArgb(var6, var7, var0.getColorArgb(var6, var7));
            }
         }

         var0.close();
         return var8;
      }
   }

   public static void method1783(Identifier var0, BufferedImage var1) {
      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         ImageIO.write(var1, "png", var2);
         byte[] var3 = var2.toByteArray();
         method1784(var0, var3);
      } catch (Exception var4) {
      }
   }

   public static void method1784(Identifier var0, byte[] var1) {
      try {
         ByteBuffer var2 = BufferUtils.createByteBuffer(var1.length).put(var1);
         var2.flip();
         NativeImageBackedTexture var3 = new NativeImageBackedTexture(NativeImage.read(var2));
         mc.execute(() -> mc.getTextureManager().registerTexture(var0, var3));
      } catch (Exception var4) {
      }
   }

   public static void method1785(InputStream var0, InputStream var1) {
      try {
         MemoryStack var2 = MemoryStack.stackPush();

         try {
            Buffer var3 = GLFWImage.malloc(2, var2);
            List var4 = List.of(var0, var1);
            ArrayList<java.nio.ByteBuffer> var5 = new ArrayList<>();

            for (int var6 = 0; var6 < var4.size(); var6++) {
               NativeImage var7 = NativeImage.read((InputStream)var4.get(var6));
               ByteBuffer var8 = MemoryUtil.memAlloc(var7.getWidth() * var7.getHeight() * 4);
               var8.asIntBuffer().put(var7.copyPixelsAbgr());
               var3.position(var6);
               var3.width(var7.getWidth());
               var3.height(var7.getHeight());
               var3.pixels(var8);
               var5.add(var8);
            }

            if (GLFW.glfwGetPlatform() != 393219) {
               GLFW.glfwSetWindowIcon(MinecraftClient.getInstance().getWindow().getHandle(), var3);
            }

            var5.forEach(MemoryUtil::memFree);
         } catch (Throwable var10) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var9) {
                  var10.addSuppressed(var9);
               }
            }

            throw var10;
         }

         if (var2 != null) {
            var2.close();
         }
      } catch (Exception var11) {
      }
   }

   public static Identifier method1786(String var0, NativeImageBackedTexture var1) {
      Integer var2 = dynamicIdCounters.get(var0);
      if (var2 == null) {
         var2 = 1;
      } else {
         var2 = var2 + 1;
      }

      dynamicIdCounters.put(var0, var2);
      Identifier var3 = Identifier.ofVanilla(String.format(Locale.ROOT, "dynamic/%s_%d", var0, var2));
      mc.getTextureManager().registerTexture(var3, var1);
      return var3;
   }

   private Helper208() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
