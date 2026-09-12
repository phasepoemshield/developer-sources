package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.net.http.HttpClient;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL12;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class11883 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2 = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(20L)).executor((Executor)class11938.L_1).build();

   private class11883() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      u();
   }

   private static List<String> B(String var0) {
      return Arrays.asList(var0.substring(1, var0.length() - 1).split("\\s*,\\s*"));
   }

   private static void l(String var0) {
   }

   private static void u() {
   }

   private static void y(class11914 var0) {
      ByteBuffer var1 = null;
      int var2 = 0;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;

      try {
         var1 = MemoryUtil.memAlloc(var0.y().length);
         var1.put(var0.y()).flip();
         var3 = GL12.glGetInteger(32873);
         var4 = true;
         var2 = GL12.glGenTextures();
         if (var2 != 0) {
            GlStateManager._bindTexture(var2);
            GlStateManager._texParameter(3553, 10240, 9729);
            GlStateManager._texParameter(3553, 10241, 9729);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL12.glTexImage2D(3553, 0, 32856, var0.L(), var0.N(), 0, 6408, 5121, var1);
            int var6 = ((class11472)class11938.L_2).U();
            GlStateManager._bindTexture(var3 == var6 ? 0 : var3);
            var5 = true;
            ((class11472)class11938.L_2).N(var2);
            var2 = 0;
            if (var6 > 0) {
               GL12.glDeleteTextures(var6);
            }

            return;
         }

         ((Logger)N_0).warn("Failed to allocate avatar GL texture");
      } catch (Exception var11) {
         ((Logger)N_0).error("Failed to upload avatar texture", var11);
         return;
      } finally {
         if (var4 && !var5) {
            GlStateManager._bindTexture(var3);
         }

         if (var2 != 0) {
            GL12.glDeleteTextures(var2);
         }

         if (var1 != null) {
            MemoryUtil.memFree(var1);
         }
      }
   }

   public static void N(String[] var0, OptionParser var1) {
      N_1 = System.nanoTime();
      var1.allowsUnrecognizedOptions();
      ArgumentAcceptingOptionSpec<Long> var2 = var1.accepts("subscribeTimeLeft").withRequiredArg().ofType(Long.class);
      ArgumentAcceptingOptionSpec<String> var3 = var1.accepts("login").withRequiredArg();
      ArgumentAcceptingOptionSpec<Integer> var4 = var1.accepts("uid").withRequiredArg().ofType(Integer.class);
      ArgumentAcceptingOptionSpec<String> var5 = var1.accepts("role").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> var6 = var1.accepts("hash").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> var7 = var1.accepts("avatar").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> var8 = var1.accepts("boughtProducts").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> var9 = var1.accepts("apiToken").withRequiredArg();
      var1.accepts("debug");
      var1.accepts("checkLocalization");
      OptionSet var10 = var1.parse(var0);
      ((class11472)class11938.L_2).N(N(var10, var3, "No such userdata: login!"));
      ((class11472)class11938.L_2).y(N(var10, var4, "No such userdata: uid!"));
      ((class11472)class11938.L_2).N(N(var10, var2, "No such userdata: subscribe time left!") / 60L);
      ((class11472)class11938.L_2).N(new class11802(N(var10, var5, "No such userdata: role!")));
      ((class11472)class11938.L_2).u(N(var10, var6, "No such userdata: hash!"));
      ((class11472)class11938.L_2).L(N(var10, var9, "No such userdata: api token!"));
      List<String> var12 = B(N(var10, var8, "No such userdata: bought products!"));
      ((class11472)class11938.L_2).N(var12.contains("premium"));
      l(N(var10, var7, "No such userdata: user avatar!"));
      if (var10.has("debug")) {
         class11938.L_3 = true;
      }

      if (var10.has("checkLocalization")) {
         class11938.L_4 = true;
      }
   }

   private static class11914 N(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         ByteBuffer var1 = null;
         ByteBuffer var2 = null;

         try {
            MemoryStack var3 = MemoryStack.stackPush();

            Object var19;
            label226: {
               Object var22;
               label227: {
                  class11914 var10;
                  label228: {
                     try {
                        var1 = MemoryUtil.memAlloc(var0.length);
                        var1.put(var0).flip();
                        IntBuffer var4 = var3.mallocInt(1);
                        IntBuffer var5 = var3.mallocInt(1);
                        IntBuffer var6 = var3.mallocInt(1);
                        if (!STBImage.stbi_info_from_memory(var1, var4, var5, var6)) {
                           ((Logger)N_0).warn("Failed to read avatar texture info: {}", STBImage.stbi_failure_reason());
                           var19 = null;
                           break label226;
                        }

                        int var7 = var4.get(0);
                        int var8 = var5.get(0);
                        if (var7 > 0 && var8 > 0) {
                           var1.position(0);
                           var2 = STBImage.stbi_load_from_memory(var1, var4, var5, var6, 4);
                           if (var2 == null) {
                              ((Logger)N_0).warn("Failed to decode avatar texture: {}", STBImage.stbi_failure_reason());
                              var22 = null;
                              break label227;
                           }

                           int var18 = var4.get(0);
                           var8 = var5.get(0);
                           byte[] var21 = new byte[var18 * var8 * 4];
                           var2.get(var21);
                           var10 = new class11914(var18, var8, var21);
                           break label228;
                        }

                        ((Logger)N_0).warn("Failed to load avatar texture: invalid dimensions {}x{}", var7, var8);
                        var22 = null;
                     } catch (Throwable var16) {
                        if (var3 != null) {
                           try {
                              var3.close();
                           } catch (Throwable var15) {
                              var16.addSuppressed(var15);
                           }
                        }

                        throw var16;
                     }

                     if (var3 != null) {
                        var3.close();
                     }

                     return (class11914)var22;
                  }

                  if (var3 != null) {
                     var3.close();
                  }

                  return var10;
               }

               if (var3 != null) {
                  var3.close();
               }

               return (class11914)var22;
            }

            if (var3 != null) {
               var3.close();
            }

            return (class11914)var19;
         } finally {
            if (var2 != null) {
               STBImage.stbi_image_free(var2);
            }

            if (var1 != null) {
               MemoryUtil.memFree(var1);
            }
         }
      } else {
         ((Logger)N_0).warn("Failed to load avatar texture: empty response body");
         return null;
      }
   }

   private static <T> T N(OptionSet var0, OptionSpec<T> var1, String var2) {
      return (T)nursultan.NursultanUserDataFix.resolve(var0, var1, var2);
   }

   public static long N() {
      return (Long)N_1;
   }
}
