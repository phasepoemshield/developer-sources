package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public final class uVvVnUU {
   private static final uVvVnUU UuUVuuUu = new uVvVnUU();
   private static final String C00OOC00oO = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private final Map<VnuVUNUv, uVvVnUU.NVnVnNnN> uUnuvNvvNU = new EnumMap<>(VnuVUNUv.class);
   private final Map<String, uVvVnUU.NVnVnNnN> vVvUvVVuuNvV = new HashMap<>();
   private nnUnNnuvvN uNNnnnuuuN;
   private String nuUnNvnuUu;
   private long VVuuUN;
   private int vNUvnnVnUvu;

   private uVvVnUU() {
   }

   public static uVvVnUU UuUVuuUu() {
      return UuUVuuUu;
   }

   public nnUnNnuvvN C00OOC00oO() {
      if (this.uNNnnnuuuN == null) {
         this.uNNnnnuuuN = new nnUnNnuvvN();
      }

      return this.uNNnnnuuuN;
   }

   public float uUnuvNvvNU() {
      if (this.VVuuUN == 0L) {
         this.VVuuUN = System.nanoTime();
         return 0.0F;
      } else {
         return (float)(System.nanoTime() - this.VVuuUN) / 1.0E9F % 720.0F;
      }
   }

   public synchronized vVvUNNUVVnNn UuUVuuUu(VnuVUNUv var1, NNnUUVVnuUV var2) {
      if (var1 != null && var2 != null && var2.fragmentSource() != null) {
         uVvVnUU.NVnVnNnN var3 = this.uUnuvNvvNU.get(var1);
         String var4 = var2.hash();
         if (var3 != null && var3.UuUVuuUu != null && var3.C00OOC00oO.equals(var4)) {
            return var3.UuUVuuUu;
         } else {
            if (var3 != null && var3.UuUVuuUu != null) {
               var3.UuUVuuUu.C00OOC00oO();
               var3.UuUVuuUu = null;
            }

            if (var3 == null) {
               var3 = new uVvVnUU.NVnVnNnN();
               this.uUnuvNvvNU.put(var1, var3);
            }

            try {
               String var5 = this.nuUnNvnuUu();
               var3.UuUVuuUu = new vVvUNNUVVnNn(var5, var2.fragmentSource());
               var3.C00OOC00oO = var4;
               var3.uUnuvNvvNU = var2.error();
               return var3.UuUVuuUu;
            } catch (Throwable var6) {
               var3.uUnuvNvvNU = var6.getMessage() == null ? var6.getClass().getSimpleName() : var6.getMessage();
               var3.UuUVuuUu = null;
               var3.C00OOC00oO = "";
               vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("ThemeShaderProgramCache.acquire:" + var1.UuUVuuUu(), var6);
               throw new IllegalStateException("unreachable shader failure", var6);
            }
         }
      } else {
         return null;
      }
   }

   public synchronized vVvUNNUVVnNn UuUVuuUu(String var1, NNnUUVVnuUV var2) {
      String var3 = uNNnUu.vuuuNvNuv(var1);
      if (!var3.isBlank() && var2 != null && var2.fragmentSource() != null) {
         uVvVnUU.NVnVnNnN var4 = this.vVvUvVVuuNvV.get(var3);
         String var5 = var2.hash();
         if (var4 != null && var4.UuUVuuUu != null && var4.C00OOC00oO.equals(var5)) {
            return var4.UuUVuuUu;
         } else {
            if (var4 != null && var4.UuUVuuUu != null) {
               var4.UuUVuuUu.C00OOC00oO();
               var4.UuUVuuUu = null;
            }

            if (var4 == null) {
               var4 = new uVvVnUU.NVnVnNnN();
               this.vVvUvVVuuNvV.put(var3, var4);
            }

            try {
               String var6 = this.nuUnNvnuUu();
               var4.UuUVuuUu = new vVvUNNUVVnNn(var6, var2.fragmentSource());
               var4.C00OOC00oO = var5;
               var4.uUnuvNvvNU = var2.error();
               return var4.UuUVuuUu;
            } catch (Throwable var7) {
               var4.uUnuvNvvNU = var7.getMessage() == null ? var7.getClass().getSimpleName() : var7.getMessage();
               var4.UuUVuuUu = null;
               var4.C00OOC00oO = "";
               vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("ThemeShaderProgramCache.acquire:" + var3, var7);
               throw new IllegalStateException("unreachable shader failure", var7);
            }
         }
      } else {
         return null;
      }
   }

   public synchronized String UuUVuuUu(VnuVUNUv var1) {
      uVvVnUU.NVnVnNnN var2 = this.uUnuvNvvNU.get(var1);
      return var2 != null && var2.uUnuvNvvNU != null ? var2.uUnuvNvvNU : "";
   }

   public synchronized String UuUVuuUu(String var1) {
      uVvVnUU.NVnVnNnN var2 = this.vVvUvVVuuNvV.get(uNNnUu.vuuuNvNuv(var1));
      return var2 != null && var2.uUnuvNvvNU != null ? var2.uUnuvNvvNU : "";
   }

   public synchronized String C00OOC00oO(VnuVUNUv var1) {
      uVvVnUU.NVnVnNnN var2 = this.uUnuvNvvNU.get(var1);
      return var2 == null ? "" : var2.C00OOC00oO;
   }

   public synchronized String C00OOC00oO(String var1) {
      uVvVnUU.NVnVnNnN var2 = this.vVvUvVVuuNvV.get(uNNnUu.vuuuNvNuv(var1));
      return var2 == null ? "" : var2.C00OOC00oO;
   }

   public synchronized void uUnuvNvvNU(VnuVUNUv var1) {
      uVvVnUU.NVnVnNnN var2 = this.uUnuvNvvNU.remove(var1);
      if (var2 != null && var2.UuUVuuUu != null && VVuuUN()) {
         var2.UuUVuuUu.C00OOC00oO();
         var2.UuUVuuUu = null;
      }
   }

   public synchronized void uUnuvNvvNU(String var1) {
      uVvVnUU.NVnVnNnN var2 = this.vVvUvVVuuNvV.remove(uNNnUu.vuuuNvNuv(var1));
      if (var2 != null && var2.UuUVuuUu != null && VVuuUN()) {
         var2.UuUVuuUu.C00OOC00oO();
         var2.UuUVuuUu = null;
      }
   }

   public synchronized void vVvUvVVuuNvV() {
      boolean var1 = VVuuUN();

      for (uVvVnUU.NVnVnNnN var3 : this.uUnuvNvvNU.values()) {
         if (var3.UuUVuuUu != null && var1) {
            var3.UuUVuuUu.C00OOC00oO();
         }

         var3.UuUVuuUu = null;
      }

      for (uVvVnUU.NVnVnNnN var5 : this.vVvUvVVuuNvV.values()) {
         if (var5.UuUVuuUu != null && var1) {
            var5.UuUVuuUu.C00OOC00oO();
         }

         var5.UuUVuuUu = null;
      }

      this.uUnuvNvvNU.clear();
      this.vVvUvVVuuNvV.clear();
      if (this.uNNnnnuuuN != null && var1) {
         this.uNNnnnuuuN.close();
      }

      this.uNNnnnuuuN = null;
      if (this.vNUvnnVnUvu > 0 && var1) {
         GL11.glDeleteTextures(this.vNUvnnVnUvu);
      }

      this.vNUvnnVnUvu = 0;
      this.VVuuUN = 0L;
      this.nuUnNvnuUu = null;
   }

   public synchronized int uNNnnnuuuN() {
      if (this.vNUvnnVnUvu > 0) {
         return this.vNUvnnVnUvu;
      } else {
         ByteBuffer var1 = BufferUtils.createByteBuffer(4);
         var1.put((byte)-1).put((byte)-1).put((byte)-1).put((byte)-1).flip();
         this.vNUvnnVnUvu = GL11.glGenTextures();
         GL11.glBindTexture(3553, this.vNUvnnVnUvu);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         GL11.glTexImage2D(3553, 0, 32856, 1, 1, 0, 6408, 5121, var1);
         GL11.glBindTexture(3553, 0);
         return this.vNUvnnVnUvu;
      }
   }

   private String nuUnNvnuUu() {
      if (this.nuUnNvnuUu == null) {
         this.nuUnNvnuUu = UvnUNnnVnu.UuUVuuUu("assets/wild/shaders/mainmenu/menu_quad.vert");
      }

      return this.nuUnNvnuUu;
   }

   private static boolean VVuuUN() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   static final class NVnVnNnN {
      vVvUNNUVVnNn UuUVuuUu;
      String C00OOC00oO = "";
      String uUnuvNvvNU = "";
   }
}
