package l;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.chars.Char2IntArrayMap;
import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector4i;
import org.lwjgl.opengl.GL11;

public final class Helper133 {
   public static final int green = new Color(64, 255, 64).getRGB();
   public static final int yellow = new Color(255, 255, 64).getRGB();
   public static final int orange = new Color(255, 128, 32).getRGB();
   public static final int red = new Color(255, 64, 64).getRGB();
   private static final long CACHE_EXPIRATION_TIME = 60000L;
   private static final ConcurrentHashMap<Helper131, Helper132> colorCache = new ConcurrentHashMap<>();
   private static final ScheduledExecutorService cacheCleaner = Executors.newScheduledThreadPool(1);
   private static final DelayQueue<Helper132> cleanupQueue = new DelayQueue<>();
   public static final Pattern FORMATTING_CODE_PATTERN = Pattern.compile("(?i)§[0-9a-f-or]");
   public static Char2IntArrayMap colorCodes = new Helper92();
   public static final int RED = method1149(255, 0, 0);
   public static final int GREEN = method1149(0, 255, 0);
   public static final int BLUE = method1149(0, 0, 255);
   public static final int YELLOW = method1149(255, 255, 0);
   public static final int WHITE = method1105(255);
   public static final int BLACK = method1105(0);
   public static final int HALF_BLACK = method1104(0, 0.5F);
   public static final int LIGHT_RED = method1149(255, 85, 85);

   public static int method1084() {
      return new Color(91, 63, 212, 255).getRGB();
   }

   public static int method1085() {
      return new Color(26, 26, 26, 255).getRGB();
   }

   public static int method1086() {
      return new Color(255, 255, 255, 255).getRGB();
   }

   public static int method1087() {
      return new Color(130, 100, 210, 255).getRGB();
   }

   public static int method1088(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int method1089(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int method1090(int var0) {
      return var0 & 0xFF;
   }

   public static int method1091(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static float method1092(int var0) {
      return method1088(var0) / 255.0F;
   }

   public static float method1093(int var0) {
      return method1089(var0) / 255.0F;
   }

   public static float method1094(int var0) {
      return method1090(var0) / 255.0F;
   }

   public static float method1095(int var0) {
      return method1091(var0) / 255.0F;
   }

   public static int[] method1096(int var0) {
      return new int[]{method1088(var0), method1089(var0), method1090(var0), method1091(var0)};
   }

   public static int[] method1097(int var0) {
      return new int[]{method1088(var0), method1089(var0), method1090(var0)};
   }

   public static float[] method1098(int var0) {
      return new float[]{method1092(var0), method1093(var0), method1094(var0), method1095(var0)};
   }

   public static float[] method1099(int var0) {
      return new float[]{method1092(var0), method1093(var0), method1094(var0)};
   }

   public static int method1100(float var0, float var1, float var2, float var3) {
      return method1148(Math.round(var0 * 255.0F), Math.round(var1 * 255.0F), Math.round(var2 * 255.0F), Math.round(var3 * 255.0F));
   }

   public static int method1101(int var0, int var1, int var2, float var3) {
      return method1148(var0, var1, var2, Math.round(var3 * 255.0F));
   }

   public static int method1102(float var0, float var1, float var2) {
      return method1100(var0, var1, var2, 1.0F);
   }

   public static int method1103(int var0, int var1) {
      return method1148(var0, var0, var0, var1);
   }

   public static int method1104(int var0, float var1) {
      return method1103(var0, Math.round(var1 * 255.0F));
   }

   public static int method1105(int var0) {
      return method1149(var0, var0, var0);
   }

   public static int method1106(int var0, int var1) {
      return method1148(method1088(var0), method1089(var0), method1090(var0), var1);
   }

   public static int method1107(int var0, float var1) {
      return method1101(method1088(var0), method1089(var0), method1090(var0), var1);
   }

   public static int method1108(int var0, float var1) {
      return method1148(method1088(var0), method1089(var0), method1090(var0), Math.round(method1091(var0) * var1));
   }

   public static int method1109(int var0, int var1) {
      return method1110(var0, 2.55F * Math.min(var1, 100));
   }

   public static int method1110(int var0, float var1) {
      return ColorHelper.getArgb(
         (int)(ColorHelper.getAlpha(var0) * (var1 / 255.0F)), ColorHelper.getRed(var0), ColorHelper.getGreen(var0), ColorHelper.getBlue(var0)
      );
   }

   public static int method1111(float var0, int var1, int var2) {
      return ColorHelper.lerp(var0, var1, var2);
   }

   public static int method1112(int var0, int var1) {
      ByteBuffer var2 = ByteBuffer.allocateDirect(4);
      GL11.glReadPixels(var0, var1, 1, 1, 6408, 5121, var2);
      return ColorHelper.getArgb(method1126(var2.get()), method1127(var2.get()), method1128(var2.get()));
   }

   public static int method1113(int var0, int var1) {
      long var2 = System.currentTimeMillis();
      long var4 = (var2 / var0 + var1) % 360L;
      return (int)var4;
   }

   public static int method1114(int var0, int var1) {
      return Math.clamp((long)var1, 0, 255) << 24 | var0 & 16777215;
   }

   public static int method1115(int var0, int var1, float var2, float var3, float var4) {
      float var5 = 90.0F;
      float var6 = method1113(var0, var1);
      float var7 = (var6 + var1 * var5) % 360.0F;
      var7 /= 360.0F;
      var2 = Math.clamp(var2, 0.0F, 1.0F);
      var3 = Math.clamp(var3, 0.0F, 1.0F);
      int var8 = Color.HSBtoRGB(var7, var2, var3);
      int var9 = Math.max(0, Math.min(255, (int)(var4 * 255.0F)));
      return method1114(var8, var9);
   }

   public static int method1116(int var0, int var1, int var2) {
      return 0xFF000000 | var0 << 16 | var1 << 8 | var2;
   }

   public static void method1117(int var0, float var1) {
      float var2 = (var0 >> 16 & 0xFF) / 255.0F;
      float var3 = (var0 >> 8 & 0xFF) / 255.0F;
      float var4 = (var0 & 0xFF) / 255.0F;
      RenderSystem.setShaderColor(var2, var3, var4, var1);
   }

   public static void method1118(int var0) {
      method1117(var0, (var0 >> 24 & 0xFF) / 255.0F);
   }

   public static int method1119(String var0) {
      int var1 = Integer.parseInt(var0.substring(1), 16);
      return method1120(var1, 255);
   }

   public static int method1120(int var0, int var1) {
      return var0 & 16777215 | var1 << 24;
   }

   public static int method1121(int var0, int var1, int var2, int var3) {
      int var4 = (int)((System.currentTimeMillis() / var3 + var2) % 360L);
      var4 = (var4 > 180 ? 360 - var4 : var4) + 180;
      int var5 = method1142(var0, var1, Math.clamp(var4 / 180.0F - 1.0F, 0.0F, 1.0F));
      float[] var6 = method1141(var5);
      float[] var7 = Color.RGBtoHSB((int)(var6[0] * 255.0F), (int)(var6[1] * 255.0F), (int)(var6[2] * 255.0F), null);
      var7[1] *= 1.5F;
      var7[1] = Math.min(var7[1], 1.0F);
      return Color.HSBtoRGB(var7[0], var7[1], var7[2]);
   }

   public static int method1122(int var0, int var1, int... var2) {
      int var3 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
      var3 = (var3 > 180 ? 360 - var3 : var3) + 180;
      int var4 = (int)(var3 / 360.0F * var2.length);
      if (var4 == var2.length) {
         var4--;
      }

      int var5 = var2[var4];
      int var6 = var2[var4 == var2.length - 1 ? 0 : var4 + 1];
      return method1142(var5, var6, var3 / 360.0F * var2.length - var4);
   }

   public static int method1123(int var0, int var1, float var2) {
      var2 = Math.min(1.0F, Math.max(0.0F, var2));
      int var3 = method1126(var0);
      int var4 = method1127(var0);
      int var5 = method1128(var0);
      int var6 = method1129(var0);
      int var7 = method1126(var1);
      int var8 = method1127(var1);
      int var9 = method1128(var1);
      int var10 = method1129(var1);
      int var11 = method1125(var3, var7, var2);
      int var12 = method1125(var4, var8, var2);
      int var13 = method1125(var5, var9, var2);
      int var14 = method1125(var6, var10, var2);
      return var14 << 24 | var11 << 16 | var12 << 8 | var13;
   }

   public static Double method1124(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static int method1125(int var0, int var1, double var2) {
      return method1124(var0, var1, (float)var2).intValue();
   }

   public static int method1126(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int method1127(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int method1128(int var0) {
      return var0 & 0xFF;
   }

   public static int method1129(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static int method1130(int var0, int var1, float var2) {
      return method1148(
         Math.round(method1088(var0) * (method1092(var1) * var2)),
         Math.round(method1089(var0) * (method1093(var1) * var2)),
         Math.round(method1090(var0) * (method1094(var1) * var2)),
         Math.round(method1091(var0) * (method1095(var1) * var2))
      );
   }

   public static int method1131(int var0, int var1, float var2) {
      return method1148(
         Math.round(method1088(var0) * (method1092(var1) * var2)),
         Math.round(method1089(var0) * (method1093(var1) * var2)),
         Math.round(method1090(var0) * (method1094(var1) * var2)),
         Math.round(method1091(var0) * (method1095(var1) * var2))
      );
   }

   public static int method1132(int var0, float var1) {
      return method1148(Math.round(method1088(var0) * var1), Math.round(method1089(var0) * var1), Math.round(method1090(var0) * var1), method1091(var0));
   }

   public static int method1133(int var0, float var1) {
      return method1148(
         Math.min(255, Math.round(method1088(var0) / var1)),
         Math.min(255, Math.round(method1089(var0) / var1)),
         Math.min(255, Math.round(method1090(var0) / var1)),
         method1091(var0)
      );
   }

   public static int method1134(int var0, int var1, float var2) {
      float var3 = MathHelper.clamp(var2, 0.0F, 1.0F);
      return method1148(
         MathHelper.lerp(var3, method1088(var0), method1088(var1)),
         MathHelper.lerp(var3, method1089(var0), method1089(var1)),
         MathHelper.lerp(var3, method1090(var0), method1090(var1)),
         MathHelper.lerp(var3, method1091(var0), method1091(var1))
      );
   }

   public static Vector4i method1135(Vector4i var0, float var1, float var2) {
      return new Vector4i(method1136(var0.x, var1, var2), method1136(var0.y, var1, var2), method1136(var0.w, var1, var2), method1136(var0.z, var1, var2));
   }

   public static int method1136(int var0, float var1, float var2) {
      return method1148(
         method1088(var0),
         Math.min(255, Math.round(method1089(var0) / var1)),
         Math.min(255, Math.round(method1090(var0) / var1)),
         Math.round(method1091(var0) * var2)
      );
   }

   public static int method1137(int var0, float var1) {
      return method1148(
         method1088(var0), Math.min(255, Math.round(method1089(var0) / var1)), Math.min(255, Math.round(method1090(var0) / var1)), method1091(var0)
      );
   }

   public static int method1138(int var0, float var1) {
      return method1148(
         Math.min(255, Math.round(method1089(var0) / var1)), method1089(var0), Math.min(255, Math.round(method1090(var0) / var1)), method1091(var0)
      );
   }

   public static int method1139(int var0, int var1, int var2, int var3) {
      return method1148(var0, var1, var2, var3);
   }

   public static int[] method1140(int var0, int var1, int var2) {
      int[] var3 = new int[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         float var5 = (float)var4 / (var2 - 1);
         var3[var4] = method1134(var0, var1, var5);
      }

      return var3;
   }

   public static float[] method1141(int var0) {
      return new float[]{(var0 >> 16 & 0xFF) / 255.0F, (var0 >> 8 & 0xFF) / 255.0F, (var0 & 0xFF) / 255.0F, (var0 >> 24 & 0xFF) / 255.0F};
   }

   public static int method1142(int var0, int var1, float var2) {
      float[] var3 = method1141(var0);
      float[] var4 = method1141(var1);
      return method1139(
         (int)Helper147.method1245(var3[0] * 255.0F, var4[0] * 255.0F, var2),
         (int)Helper147.method1245(var3[1] * 255.0F, var4[1] * 255.0F, var2),
         (int)Helper147.method1245(var3[2] * 255.0F, var4[2] * 255.0F, var2),
         (int)Helper147.method1245(var3[3] * 255.0F, var4[3] * 255.0F, var2)
      );
   }

   public static int method1143(int var0, int var1, float var2, float var3, float var4) {
      int var5 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
      float var6 = var5 / 360.0F;
      int var7 = Color.HSBtoRGB(var6, var2, var3);
      return method1148(method1088(var7), method1089(var7), method1090(var7), Math.round(var4 * 255.0F));
   }

   public static int method1144(int var0, int var1, int var2, int var3) {
      int var4 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
      var4 = var4 >= 180 ? 360 - var4 : var4;
      return method1134(var2, var3, var4 / 180.0F);
   }

   public static int method1145(float var0, float var1, float var2, float var3) {
      return (int)(MathHelper.clamp(var3, 0.0F, 1.0F) * 255.0F) << 24
         | (int)(MathHelper.clamp(var0, 0.0F, 1.0F) * 255.0F) << 16
         | (int)(MathHelper.clamp(var1, 0.0F, 1.0F) * 255.0F) << 8
         | (int)(MathHelper.clamp(var2, 0.0F, 1.0F) * 255.0F);
   }

   public static int method1146(int var0) {
      new Color(method1162());
      return method1144(8, var0, method1162(), -1);
   }

   public static Vector4i method1147(float var0) {
      return new Vector4i(
         method1108(method1146(270), var0), method1108(method1146(0), var0), method1108(method1146(180), var0), method1108(method1146(90), var0)
      );
   }

   public static int method1148(int var0, int var1, int var2, int var3) {
      Helper131 var4 = new Helper131(var0, var1, var2, var3);
      Helper132 var5 = colorCache.computeIfAbsent(var4, var4x -> {
         Helper132 var5x = new Helper132(var4x, method1150(var0, var1, var2, var3), 60000L);
         cleanupQueue.offer(var5x);
         return var5x;
      });
      return var5.method1082();
   }

   public static int method1149(int var0, int var1, int var2) {
      return method1148(var0, var1, var2, 255);
   }

   private static int method1150(int var0, int var1, int var2, int var3) {
      return MathHelper.clamp(var3, 0, 255) << 24 | MathHelper.clamp(var0, 0, 255) << 16 | MathHelper.clamp(var1, 0, 255) << 8 | MathHelper.clamp(var2, 0, 255);
   }

   private static String method1151(int var0, int var1, int var2, int var3) {
      return var0 + "," + var1 + "," + var2 + "," + var3;
   }

   public static String method1152(int var0) {
      return "⏏" + var0 + "⏏";
   }

   public static String method1153(String var0) {
      return var0 != null && !var0.isEmpty() ? FORMATTING_CODE_PATTERN.matcher(var0).replaceAll("") : null;
   }

   public static int method1154() {
      return new Color(20, 20, 24, 255).getRGB();
   }

   public static int method1155(float var0) {
      return method1108(new Color(1710623).getRGB(), var0);
   }

   public static int method1156(float var0) {
      return method1108(new Color(1973798).getRGB(), var0);
   }

   public static int method1157(float var0) {
      return method1108(new Color(0, 0, 0, 228).getRGB(), var0);
   }

   public static int method1158(float var0) {
      return method1108(new Color(1579038).getRGB(), var0);
   }

   public static int method1159(float var0) {
      return method1108(method1160(), var0);
   }

   public static int method1160() {
      return new Color(255, 255, 255, 255).getRGB();
   }

   public static int method1161() {
      return new Color(175, 175, 175, 255).getRGB();
   }

   public static int method1162() {
      return Hud.method1824().method1827();
   }

   public static int method1163(float var0) {
      return method1108(method1162(), var0);
   }

   public static int method1164() {
      return new Color(5635925).getRGB();
   }

   public static int method1165(float var0, float var1) {
      return method1133(method1108(method1167(), var0), var1);
   }

   public static int method1166(float var0) {
      return method1108(method1167(), var0);
   }

   public static int method1167() {
      return new Color(3618630).getRGB();
   }

   private Helper133() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      cacheCleaner.scheduleWithFixedDelay(() -> {
         for (Helper132 var0 = cleanupQueue.poll(); var0 != null; var0 = cleanupQueue.poll()) {
            if (var0.method1080()) {
               colorCache.remove(var0.method1081());
            }
         }
      }, 0L, 1L, TimeUnit.SECONDS);
   }
}
