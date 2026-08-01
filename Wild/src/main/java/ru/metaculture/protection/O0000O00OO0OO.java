package ru.metaculture.protection;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screen.Screen;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.slf4j.Logger;

public final class O0000O00OO0OO {
   private static final Logger O00000000 = LogUtils.getLogger();
   private static final boolean O000000000 = Boolean.parseBoolean(System.getProperty("wild.debug.screenRender.enable", "false"));
   private static final long O0000000000 = 2000000000L;
   private static volatile String O00000000000 = "unknown";
   private static volatile boolean O000000000000;
   private static long O0000000000000;
   private static long O000000000000O;

   private O0000O00OO0OO() {
   }

   public static boolean O00000000() {
      return O000000000;
   }

   public static void O00000000(Screen screen, Screen screen2) {
      O000000000000O = 0L;
      O0000000000000 = 0L;
      O0000000000();
      O00000000.info("[ScreenRender] screen={} kind={} from={} gpu={}", new Object[]{O00000000(screen2), O000000000(screen2), O00000000(screen), O00000000000});
   }

   public static void O00000000(Object object, String string) {
      O00000000(object, string, null);
   }

   public static void O00000000(Object object, String string, String string2) {
      O000000000000O++;
      long var3 = System.nanoTime();
      boolean var5 = var3 - O0000000000000 >= 2000000000L;
      if (O000000000 || var5) {
         O0000000000000 = var3;
         O0000O00OO0OO.W385 var6 = O000000000();
         if (string2 != null && !string2.isBlank()) {
            O00000000.info(
               "[ScreenRender] phase={} screen={} kind={} frame={} detail={} gl={}",
               new Object[]{string, O00000000(object), O000000000(object), O000000000000O, string2, var6}
            );
         } else {
            O00000000.info(
               "[ScreenRender] phase={} screen={} kind={} frame={} gl={}", new Object[]{string, O00000000(object), O000000000(object), O000000000000O, var6}
            );
         }
      }
   }

   public static void O00000000(Object object, String string, boolean bl, String string2) {
      if (!bl || O000000000) {
         O00000000.info(
            "[ScreenRender] backdrop={} success={} screen={} kind={} detail={} gl={}",
            new Object[]{string, bl, O00000000(object), O000000000(object), string2 == null ? "" : string2, O000000000()}
         );
      }
   }

   public static void O00000000(Object object, String string, boolean bl, String string2, Throwable throwable) {
      if (!bl || O000000000) {
         if (throwable != null) {
            O00000000.warn(
               "[ScreenRender] postRender={} success={} screen={} kind={} detail={} gl={}",
               new Object[]{string, false, O00000000(object), O000000000(object), string2 == null ? "" : string2, O000000000(), throwable}
            );
         } else {
            O00000000.info(
               "[ScreenRender] postRender={} success={} screen={} kind={} detail={} gl={}",
               new Object[]{string, bl, O00000000(object), O000000000(object), string2 == null ? "" : string2, O000000000()}
            );
         }
      }
   }

   public static void O00000000(String string, Object object, String string2, Throwable throwable) {
      if (throwable != null) {
         O00000000.warn(
            "[ScreenRender] failure={} screen={} kind={} reason={} gl={}",
            new Object[]{string, O00000000(object), O000000000(object), string2, O000000000(), throwable}
         );
      } else {
         O00000000.warn(
            "[ScreenRender] failure={} screen={} kind={} reason={} gl={}", new Object[]{string, O00000000(object), O000000000(object), string2, O000000000()}
         );
      }
   }

   public static O0000O00OO0OO.W385 O000000000() {
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
         return new O0000O00OO0OO.W385(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      } catch (Throwable var9) {
         return new O0000O00OO0OO.W385(-1, -1, -1, new int[4], -1, false, false, false, false);
      }
   }

   private static void O0000000000() {
      if (!O000000000000) {
         synchronized (O0000O00OO0OO.class) {
            if (!O000000000000) {
               try {
                  String var1 = GL11.glGetString(7936);
                  String var2 = GL11.glGetString(7937);
                  String var3 = GL11.glGetString(7938);
                  O00000000000 = "vendor=" + O00000000(var1) + " renderer=" + O00000000(var2) + " version=" + O00000000(var3);
               } catch (Throwable var5) {
                  O00000000000 = "unavailable";
               }

               O000000000000 = true;
            }
         }
      }
   }

   private static String O00000000(Object object) {
      return object == null ? "<none>" : object.getClass().getSimpleName();
   }

   private static String O000000000(Object object) {
      if (object == null) {
         return "none";
      } else if (object instanceof O00000OO0OOOO) {
         return "raw-overlay";
      } else if (object instanceof Screen) {
         String var1 = object.getClass().getName();
         if (var1.startsWith("org.wild.")) {
            return "wild-custom";
         } else {
            return var1.startsWith("net.minecraft.") ? "vanilla" : "external";
         }
      } else {
         return "external";
      }
   }

   private static String O00000000(String string) {
      return string == null ? "?" : string.replace('\n', ' ').trim();
   }

   public record W385(
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
