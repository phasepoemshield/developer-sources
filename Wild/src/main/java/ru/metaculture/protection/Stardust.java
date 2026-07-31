package ru.metaculture.protection;

import com.google.gson.JsonObject;
import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Stardust",
   O000000000 = "Цветное звездное небо и локальные светящиеся звезды",
   O0000000000 = Category.Visuals,
   O00000000000 = {O0000000OO0OOO.NEW}
)
public final class Stardust extends Module {
   private static final String O000000000OO0 = "Кастомные облака";
   private static final String O000000000OO00 = "Цвет облаков";
   public static final ColorSetting O000000000O = new ColorSetting("Цвет неба", 72.0F, 0.72F, 1.0F);
   public static final ModeSetting O000000000O0 = new ModeSetting("Шейдер неба", O00000O0OO00OO.AURORA.O00000000(), O00000O0OO00OO.O0000000000());
   public static final NumberSetting O000000000O00 = new NumberSetting("Плотность звёзд", 1880.0F, 220.0F, 3600.0F, 20.0F, false);
   public static final NumberSetting O000000000O000 = new NumberSetting("Яркость", 1.55F, 0.2F, 2.75F, 0.05F, false);
   public static final ModeSetting O000000000O00O = new ModeSetting("Время суток", "Ночь", "День", "Закат", "Рассвет", "Ночь", "Полночь", "Полдень");
   public static final GroupSetting O000000000O0O = new GroupSetting(
      "Настройки облаков", new BooleanSetting("Кастомные облака", false), new BooleanSetting("Цвет облаков", false)
   );
   public static final ColorSetting O000000000O0O0 = new ColorSetting("Цвет облаков", 0.0F, 0.0F, 1.0F, 1.0F).O000000000(() -> !O000000000O0O());
   public static final NumberSetting O000000000O0OO = new NumberSetting("Сила цвета облаков", 1.0F, 0.0F, 1.0F, 0.05F, true).O00000000(() -> !O000000000O0O());
   public static long O000000000OO = -1L;
   private static volatile boolean O000000000OO0O;
   private static final float O000000000OOO = (float) (Math.PI * 2);
   private static final float O000000000OOO0 = 16.0F;
   private static final float O000000000OOOO = 22.0F;
   private static final float O00000000O = 0.74F;
   private int O00000000O0;
   private int O00000000O00;
   private int O00000000O000;
   private int O00000000O0000 = Integer.MIN_VALUE;
   private int O00000000O000O = Integer.MIN_VALUE;
   private int O00000000O00O = Integer.MIN_VALUE;
   private static volatile int O00000000O00O0 = 7175679;
   private static volatile int O00000000O00OO = 5435580;

   public Stardust() {
      O00000O0OO00O0.O00000000();
      O00000O0OO0O.O00000000();
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00, O000000000O000, O000000000O00O, O000000000O0O, O000000000O0O0, O000000000O0OO});
   }

   @Override
   public void O00000000() {
      this.O00000000O0 = 0;
      this.O00000000O00 = 0;
      this.O00000000O000 = 8;
      this.O00000000O0000 = Integer.MIN_VALUE;
      this.O00000000O000O = Integer.MIN_VALUE;
      this.O00000000O00O = Integer.MIN_VALUE;
      O000000000OO0O = true;
      O000000000O00O();
      O00000O0OO000.O000000000();
      O00000O0OO0000.O000000000();
      super.O00000000();
   }

   @Override
   public void O000000000() {
      O000000000OO0O = false;
      O000000000OO = -1L;
      O00000O0OO000.O000000000();
      O00000O0OO0000.O000000000();
      super.O000000000();
   }

   @Override
   public void O00000000(JsonObject jsonObject) {
      O000000000(jsonObject);
      super.O00000000(jsonObject);
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      MinecraftClient var2 = o0000000O0O0O0.O0000000000();
      if (var2 != null && var2.world != null && var2.player != null && var2.gameRenderer != null) {
         O000000000O00O();
         O000000000O0O0();
         int var3 = Math.max(0, Math.round(O000000000O00.O0000000000()));
         int var4 = O00000000O00O0;
         int var5 = O000000000O0().O000000000();
         if (var3 != this.O00000000O0000 || var4 != this.O00000000O000O || var5 != this.O00000000O00O) {
            this.O00000000O0 = 0;
            this.O00000000O0000 = var3;
            this.O00000000O000O = var4;
            this.O00000000O00O = var5;
            O00000O0OO000.O000000000();
            O00000O0OO0000.O000000000();
         }

         Camera var6 = var2.gameRenderer.getCamera();
         if (var6 != null) {
            Vec3d var7 = var6.getPos();
            ClientWorld var8 = var2.world;
            int var9 = O00000O0OO000.O00000000();
            int var10 = var3 - var9;
            if (var10 > 0) {
               int var11 = Math.min(var10, var9 == 0 ? Math.min(var3, 760) : 188);

               for (int var12 = 0; var12 < var11; var12++) {
                  this.O00000000(var8, var7, 16.0F, 22.0F);
               }
            }

            int var13 = O00000O0OO0000.O00000000();
            if (var13 < Math.max(2, Math.round(O000000000O000.O0000000000() * 2.6F))) {
               this.O00000000O000--;
               if (this.O00000000O000 <= 0) {
                  this.O00000000(var8, var7);
                  float var14 = O000000000((this.O00000000O00 + 1) * 0.618034F + 0.491F);
                  this.O00000000O000 = Math.max(14, 64 - Math.round(O000000000O000.O0000000000() * 14.0F) + (int)(var14 * 46.0F));
               }
            }
         }
      }
   }

   private void O00000000(ClientWorld clientWorld, Vec3d vec3d, float f, float g) {
      float var5 = O000000000((this.O00000000O0 + 1) * 0.618034F + 0.173F);
      float var6 = O000000000((this.O00000000O0 + 1) * 0.7548777F + 0.419F);
      float var7 = O000000000((this.O00000000O0 + 1) * 0.5698403F + 0.271F);
      float var8 = O000000000((this.O00000000O0 + 1) * 0.4386875F + 0.617F);
      float var9 = O000000000((this.O00000000O0 + 1) * 0.3271949F + 0.383F);
      float var10 = O000000000((this.O00000000O0 + 1) * 0.27917233F + 0.719F);
      float var11 = O000000000((this.O00000000O0 + 1) * 0.21132487F + 0.127F);
      float var12 = var5 * (float) (Math.PI * 2) + (var9 - 0.5F) * 0.42F;
      float var13 = (float)Math.sqrt(var8);
      float var14 = 1.4F + var13 * Math.max(1.0F, g - 1.4F);
      float var16;
      if (var10 < 0.12F) {
         var16 = 0.55F + var6 * 3.15F;
         var14 = 2.2F + var13 * Math.max(1.0F, g - 2.2F);
      } else if (var10 < 0.42F) {
         var16 = 2.2F + (float)Math.pow(var6, 0.76F) * (f * 0.58F);
      } else if (var10 < 0.84F) {
         var16 = 4.2F + (float)Math.pow(var6, 0.48F) * f;
      } else {
         var16 = f * (0.7F + var6 * 0.44F) + var11 * 4.5F;
         var14 = 1.8F + (float)Math.sqrt(var9) * Math.max(1.0F, g * 0.82F - 1.8F);
      }

      float var17 = O00000000(0.58F, 1.0F, var11);
      var14 *= 1.0F - var17 * 0.16F;
      var16 += (var9 - 0.44F) * var17 * 2.8F;
      double var18 = Math.cos(var12);
      double var20 = Math.sin(var12);
      double var22 = (var7 - 0.5F) * 0.0013;
      double var24 = (var5 - 0.5F) * 0.001;
      double var26 = (var6 - 0.5F) * 0.0013;
      clientWorld.addImportantParticleClient(
         O00000O0OO000.O00000000, true, vec3d.x + var18 * var14, vec3d.y + var16, vec3d.z + var20 * var14, var22, var24, var26
      );
      this.O00000000O0++;
   }

   private void O00000000(ClientWorld clientWorld, Vec3d vec3d) {
      float var3 = O000000000((this.O00000000O00 + 1) * 0.7548777F + 0.137F);
      float var4 = O000000000((this.O00000000O00 + 1) * 0.5698403F + 0.671F);
      float var5 = O000000000((this.O00000000O00 + 1) * 0.4386875F + 0.293F);
      float var6 = O000000000((this.O00000000O00 + 1) * 0.3271949F + 0.811F);
      float var7 = O000000000((this.O00000000O00 + 1) * 0.27917233F + 0.357F);
      float var8 = var3 * (float) (Math.PI * 2);
      float var9 = var8 + 2.1F + (var4 - 0.5F) * 0.86F;
      float var10 = 12.0F + var5 * 18.92F;
      float var11 = 16.0F * (0.64F + var6 * 0.78F) + 2.0F;
      double var12 = Math.cos(var8) * var10;
      double var14 = Math.sin(var8) * var10;
      double var16 = 0.118 + var7 * 0.092 + Math.min(0.08F, O000000000O000.O0000000000() * 0.018F);
      double var18 = Math.cos(var9) * var16;
      double var20 = Math.sin(var9) * var16;
      double var22 = -0.03 - var4 * 0.052;
      clientWorld.addImportantParticleClient(O00000O0OO0000.O00000000, true, vec3d.x + var12, vec3d.y + var11, vec3d.z + var14, var18, var22, var20);
      this.O00000000O00++;
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O00000000O0 = 0;
      this.O00000000O00 = 0;
      this.O00000000O000 = 8;
      O00000O0OO000.O000000000();
      O00000O0OO0000.O000000000();
   }

   public static boolean O0000000000O0() {
      return O000000000OO0O;
   }

   public static float O0000000000O00() {
      return O000000000O000.O0000000000();
   }

   public static float O0000000000O0O() {
      return Math.min(O000000000O000.O0000000000() * 0.74F, 1.65F);
   }

   public static float O0000000000OO() {
      return 22.0F;
   }

   public static float O0000000000OO0() {
      return 23.0F;
   }

   public static int O0000000000OOO() {
      return O00000000O00O0;
   }

   public static int O000000000O() {
      return O00000000O00OO;
   }

   public static O00000O0OO00OO O000000000O0() {
      return O00000O0OO00OO.O00000000(O000000000O0.O0000000000());
   }

   public static int O000000000O00() {
      return O000000000O0().O000000000();
   }

   public static boolean O000000000O000() {
      return O000000000OO0O && O000000000OO >= 0L;
   }

   public static int O00000000(int i) {
      return !O000000000O0O() ? i : O00000000(i, O000000000O0O0.O0000000000(), O000000000O0OO.O0000000000());
   }

   private static void O000000000O00O() {
      String var0 = O000000000O00O.O0000000000();
      switch (var0) {
         case "День":
            O000000000OO = 1000L;
            break;
         case "Закат":
            O000000000OO = 12000L;
            break;
         case "Рассвет":
            O000000000OO = 23000L;
            break;
         case "Полночь":
            O000000000OO = 13000L;
            break;
         case "Ночь":
            O000000000OO = 18000L;
            break;
         case "Полдень":
            O000000000OO = 6000L;
            break;
         default:
            O000000000OO = 0L;
      }
   }

   private static boolean O000000000O0O() {
      return O000000000OO0O && O000000000O0O.O000000000("Кастомные облака") && O000000000O0O.O000000000("Цвет облаков");
   }

   private static void O000000000O0O0() {
      int var0 = O000000000O.O00000000000O() & 16777215;
      int var1 = O00000000(var0, O000000000O0());
      if (var0 != O00000000O00O0 || var1 != O00000000O00OO) {
         O00000000O00O0 = var0;
         O00000000O00OO = var1;
      }
   }

   private static int O00000000(int i, O00000O0OO00OO o00000O0OO00OO) {
      return switch (o00000O0OO00OO) {
         case STARDUST -> O00000000(i, 0.34F, 0.68F, 1.08F);
         case TWILIGHT_RAYLEIGH -> O00000000(i, 0.08F, 0.72F, 1.14F);
         case QUANTUM_NEBULA -> O00000000(i, 0.5F, 0.86F, 1.2F);
         case CHRONOS_SINGULARITY -> O00000000(i, 0.7F, 0.92F, 1.08F);
         default -> O000000000(i);
      };
   }

   private static void O000000000(JsonObject jsonObject) {
      if (jsonObject != null && jsonObject.has("Settings")) {
         try {
            JsonObject var1 = jsonObject.getAsJsonObject("Settings");
            if (var1 == null || !var1.has(O000000000O0.O00000000)) {
               return;
            }

            String var2 = var1.get(O000000000O0.O00000000).getAsString();
            O00000O0OO00OO var3 = O00000O0OO00OO.O00000000(var2);
            if (!var3.O00000000().equals(var2)) {
               var1.addProperty(O000000000O0.O00000000, var3.O00000000());
            }
         } catch (Throwable var4) {
         }
      }
   }

   private static int O000000000(int i) {
      return O00000000(i, 0.32F, 0.74F, 0.92F);
   }

   private static int O00000000(int i, float f, float g, float h) {
      int var4 = i >>> 16 & 0xFF;
      int var5 = i >>> 8 & 0xFF;
      int var6 = i & 0xFF;
      float[] var7 = Color.RGBtoHSB(var4, var5, var6, null);
      float var8 = O000000000(var7[0] + f);
      float var9 = O000000000(g + var7[1] * 0.2F, 0.0F, 1.0F);
      float var10 = O000000000(h + var7[2] * 0.1F, 0.0F, 1.0F);
      return Color.HSBtoRGB(var8, var9, var10) & 16777215;
   }

   private static float O00000000(float f, float g, float h) {
      float var3 = (h - f) / (g - f);
      if (var3 <= 0.0F) {
         return 0.0F;
      } else {
         return var3 >= 1.0F ? 1.0F : var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private static float O000000000(float f, float g, float h) {
      if (f < g) {
         return g;
      } else {
         return f > h ? h : f;
      }
   }

   private static float O00000000(float f) {
      return !Float.isFinite(f) ? 0.0F : Math.max(0.0F, Math.min(1.0F, f));
   }

   private static float O0000000000(float f, float g, float h) {
      return f + (g - f) * h;
   }

   private static int O00000000(int i, Color color, float f) {
      float var3 = O00000000(f * (color.getAlpha() / 255.0F));
      if (var3 <= 0.0F) {
         return i;
      } else {
         int var4 = i >>> 24 & 0xFF;
         int var5 = i >>> 16 & 0xFF;
         int var6 = i >>> 8 & 0xFF;
         int var7 = i & 0xFF;
         int var8 = Math.round(O0000000000(var5, color.getRed(), var3));
         int var9 = Math.round(O0000000000(var6, color.getGreen(), var3));
         int var10 = Math.round(O0000000000(var7, color.getBlue(), var3));
         return var4 << 24 | var8 << 16 | var9 << 8 | var10;
      }
   }

   private static float O000000000(float f) {
      return f - (float)Math.floor(f);
   }
}
