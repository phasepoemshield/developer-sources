package ru.metaculture.protection;

import com.mojang.logging.LogUtils;
import net.minecraft.class_437;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.slf4j.Logger;

public final class VNNUVUuN {
   private static final Logger UuUVuuUu = LogUtils.getLogger();
   private static final boolean C00OOC00oO = Boolean.parseBoolean(System.getProperty("wild.debug.screenRender.enable", "false"));
   private static final long uUnuvNvvNU = 2000000000L;
   private static volatile String vVvUvVVuuNvV = "unknown";
   private static volatile boolean uNNnnnuuuN;
   private static long nuUnNvnuUu;
   private static long VVuuUN;

   private VNNUVUuN() {
   }

   public static boolean UuUVuuUu() {
      return C00OOC00oO;
   }

   public static void UuUVuuUu(class_437 var0, class_437 var1) {
      VVuuUN = 0L;
      nuUnNvnuUu = 0L;
      uUnuvNvvNU();
      UuUVuuUu.info("[ScreenRender] screen={} kind={} from={} gpu={}", new Object[]{UuUVuuUu(var1), C00OOC00oO(var1), UuUVuuUu(var0), vVvUvVVuuNvV});
   }

   public static void UuUVuuUu(Object var0, String var1) {
      UuUVuuUu(var0, var1, null);
   }

   public static void UuUVuuUu(Object var0, String var1, String var2) {
      if (C00OOC00oO) {
         VVuuUN++;
         long var3 = System.nanoTime();
         boolean var5 = var3 - nuUnNvnuUu >= 2000000000L;
         if (C00OOC00oO || var5) {
            nuUnNvnuUu = var3;
            VNNUVUuN.NVnVnNnN var6 = C00OOC00oO();
            if (var2 != null && !var2.isBlank()) {
               UuUVuuUu.info(
                  "[ScreenRender] phase={} screen={} kind={} frame={} detail={} gl={}",
                  new Object[]{var1, UuUVuuUu(var0), C00OOC00oO(var0), VVuuUN, var2, var6}
               );
            } else {
               UuUVuuUu.info("[ScreenRender] phase={} screen={} kind={} frame={} gl={}", new Object[]{var1, UuUVuuUu(var0), C00OOC00oO(var0), VVuuUN, var6});
            }
         }
      }
   }

   public static void UuUVuuUu(Object var0, String var1, boolean var2, String var3) {
      if (!var2 || C00OOC00oO) {
         UuUVuuUu.info(
            "[ScreenRender] backdrop={} success={} screen={} kind={} detail={} gl={}",
            new Object[]{var1, var2, UuUVuuUu(var0), C00OOC00oO(var0), var3 == null ? "" : var3, C00OOC00oO()}
         );
      }
   }

   public static void UuUVuuUu(Object var0, String var1, boolean var2, String var3, Throwable var4) {
      if (!var2 || C00OOC00oO) {
         if (var4 != null) {
            UuUVuuUu.warn(
               "[ScreenRender] postRender={} success={} screen={} kind={} detail={} gl={}",
               new Object[]{var1, false, UuUVuuUu(var0), C00OOC00oO(var0), var3 == null ? "" : var3, C00OOC00oO(), var4}
            );
         } else {
            UuUVuuUu.info(
               "[ScreenRender] postRender={} success={} screen={} kind={} detail={} gl={}",
               new Object[]{var1, var2, UuUVuuUu(var0), C00OOC00oO(var0), var3 == null ? "" : var3, C00OOC00oO()}
            );
         }
      }
   }

   public static void UuUVuuUu(String var0, Object var1, String var2, Throwable var3) {
      if (var3 != null) {
         UuUVuuUu.warn(
            "[ScreenRender] failure={} screen={} kind={} reason={} gl={}", new Object[]{var0, UuUVuuUu(var1), C00OOC00oO(var1), var2, C00OOC00oO(), var3}
         );
      } else {
         UuUVuuUu.warn("[ScreenRender] failure={} screen={} kind={} reason={} gl={}", new Object[]{var0, UuUVuuUu(var1), C00OOC00oO(var1), var2, C00OOC00oO()});
      }
   }

   public static VNNUVUuN.NVnVnNnN C00OOC00oO() {
      try {
         int var0 = GL11.glGetInteger(36006);
         int var1 = GL11.glGetInteger(36010);
         int var2 = GL11.glGetInteger(35725);
         int[] var3 = new int[4];
         GL11.glGetIntegerv(2978, var3);
         int var4 = var0 == 0 ? '賕' : GL30.glCheckFramebufferStatus(36009);
         boolean var5 = GL11.glGetBoolean(3107);
         boolean var6 = GL11.glGetBoolean(3042);
         boolean var7 = GL11.glGetBoolean(2929);
         boolean var8 = GL11.glGetBoolean(3089);
         return new VNNUVUuN.NVnVnNnN(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      } catch (Throwable var9) {
         return new VNNUVUuN.NVnVnNnN(-1, -1, -1, new int[4], -1, false, false, false, false);
      }
   }

   private static void uUnuvNvvNU() {
      if (!uNNnnnuuuN) {
         synchronized (VNNUVUuN.class) {
            if (!uNNnnnuuuN) {
               try {
                  String var1 = GL11.glGetString(7936);
                  String var2 = GL11.glGetString(7937);
                  String var3 = GL11.glGetString(7938);
                  vVvUvVVuuNvV = "vendor=" + UuUVuuUu(var1) + " renderer=" + UuUVuuUu(var2) + " version=" + UuUVuuUu(var3);
               } catch (Throwable var5) {
                  vVvUvVVuuNvV = "unavailable";
               }

               uNNnnnuuuN = true;
            }
         }
      }
   }

   private static String UuUVuuUu(Object var0) {
      return var0 == null ? "<none>" : var0.getClass().getSimpleName();
   }

   private static String C00OOC00oO(Object var0) {
      if (var0 == null) {
         return "none";
      } else if (var0 instanceof uNVUuVuNNUvn) {
         return "raw-overlay";
      } else if (var0 instanceof class_437) {
         String var1 = var0.getClass().getName();
         if (var1.startsWith("org.wild.")) {
            return "wild-custom";
         } else {
            return var1.startsWith("net.minecraft.") ? "vanilla" : "external";
         }
      } else {
         return "external";
      }
   }

   private static String UuUVuuUu(String var0) {
      return var0 == null ? "?" : var0.replace('\n', ' ').trim();
   }

   public record NVnVnNnN(
      int drawFbo, int readFbo, int program, int[] viewport, int drawFramebufferStatus, boolean colorMask, boolean blend, boolean depthTest, boolean scissor
   ) {
      @Override
      public String toString() {
         return "drawFbo="
            + this.drawFbo
            + " readFbo="
            + this.readFbo
            + " program="
            + this.program
            + " viewport="
            + this.viewport[0]
            + "x"
            + this.viewport[1]
            + "+"
            + this.viewport[2]
            + "x"
            + this.viewport[3]
            + " fbStatus=0x"
            + Integer.toHexString(this.drawFramebufferStatus)
            + " colorMask="
            + this.colorMask
            + " blend="
            + this.blend
            + " depth="
            + this.depthTest
            + " scissor="
            + this.scissor;
      }
   }
}
