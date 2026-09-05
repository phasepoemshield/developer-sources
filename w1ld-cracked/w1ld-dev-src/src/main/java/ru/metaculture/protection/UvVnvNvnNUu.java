package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import net.minecraft.class_10799;
import net.minecraft.class_1921;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4588;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class UvVnvNvnNUu extends UNUuvUN {
   private static final int UuUVuuUu = 16777215;
   private static final int C00OOC00oO = 12;
   private static final int uUnuvNvvNU = 1;
   private static final int vVvUvVVuuNvV = 64;
   private static final long uNNnnnuuuN = 250L;
   private static final int nuUnNvnuUu = 4096;
   private static final List<String> VVuuUN = List.of("clear", "off", "reset", "help");
   private boolean vNUvnnVnUvu;
   private class_2248 uVUuuVnNVU;
   private class_2960 vuuuNvNuv;
   private int nUUVuvU = 16777215;
   private int UnUNVVVNuv = 12;
   private long vNVuvnUUnuUn;
   private final List<class_2338> UvnvNVnnnnNU = new ArrayList<>();
   private static final RenderPipeline uVUVnuvnuVuv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "xray_box"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 NVNnnvnuunNv = class_1921.method_24049(
      "xray_box", 4096, false, true, uVUVnuvnuVuv, class_4688.method_23598().method_23617(false)
   );

   public UvVnvNvnNUu() {
      super("xray", "Подсветка блока в заданном радиусе", ".xray <block|clear/off/reset/help> [r,g,b] [radius]");
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         this.nuUnNvnuUu();
      } else {
         String var2 = var1[0];
         Locale var3 = Locale.ROOT;
         if (var2 != null) {
            var2 = var2.toLowerCase(var3);
         }

         String var4 = "help";
         if (var2 != null && var2.equals(var4)) {
            this.nuUnNvnuUu();
         } else if (this.UuUVuuUu(var2)) {
            this.uNNnnnuuuN();
         } else {
            class_2960 var5 = this.C00OOC00oO(var1[0]);
            if (var5 == null) {
               String var15 = var1[0];
               vVnvuVVUunuv.UuUVuuUu("§cНекорректный id блока: §f" + var15);
            } else {
               class_7922 var6 = class_7923.field_41175;
               Optional var7 = var6 == null ? null : var6.method_17966(var5);
               if (var7 != null && var7.isEmpty()) {
                  String var16 = String.valueOf(var5);
                  vVnvuVVUunuv.UuUVuuUu("§cБлок не найден: §f" + var16);
               } else {
                  int var8 = this.nUUVuvU;
                  int var9 = this.UnUNVVVNuv;
                  if (var1.length >= 2) {
                     String var10 = var1[1];
                     if (var10 != null && var10.contains(",")) {
                        Integer var19 = this.uUnuvNvvNU(var1[1]);
                        if (var19 == null) {
                           vVnvuVVUunuv.UuUVuuUu("§cЦвет указывается в RGB: §f255,255,255");
                           return;
                        }

                        var8 = var19;
                     } else {
                        Integer var11 = this.vVvUvVVuuNvV(var1[1]);
                        if (var11 == null) {
                           vVnvuVVUunuv.UuUVuuUu("§cРадиус должен быть числом от 1 до 64.");
                           return;
                        }

                        var9 = var11;
                     }
                  }

                  if (var1.length >= 3) {
                     Integer var17 = this.vVvUvVVuuNvV(var1[2]);
                     if (var17 == null) {
                        vVnvuVVUunuv.UuUVuuUu("§cРадиус должен быть числом от 1 до 64.");
                        return;
                     }

                     var9 = var17;
                  }

                  class_2248 var18 = var7 == null ? null : (class_2248)var7.get();
                  this.uVUuuVnNVU = var18;
                  this.vuuuNvNuv = var5;
                  this.nUUVuvU = var8;
                  this.UnUNVVVNuv = var9;
                  this.vNUvnnVnUvu = true;
                  this.vNVuvnUUnuUn = 0L;
                  List var20 = this.UvnvNVnnnnNU;
                  if (var20 != null) {
                     var20.clear();
                  }

                  String var12 = this.UuUVuuUu(this.vuuuNvNuv);
                  String var13 = this.UuUVuuUu(this.nUUVuvU);
                  int var14 = this.UnUNVVVNuv;
                  vVnvuVVUunuv.UuUVuuUu("§aXRay: §f" + var12 + " §7RGB " + var13 + " §7радиус " + var14);
               }
            }
         }
      }
   }

   @Override
   public List<String> UuUVuuUu(String[] var1) {
      if (var1.length != 2) {
         if (var1.length == 3 && !this.UuUVuuUu(var1[1].toLowerCase(Locale.ROOT))) {
            String var8 = var1[2].toLowerCase(Locale.ROOT);
            return List.of("255,255,255", "255,0,0", "0,255,0", "0,128,255", String.valueOf(12)).stream().filter(var1x -> var1x.startsWith(var8)).toList();
         } else if (var1.length == 4 && !this.UuUVuuUu(var1[1].toLowerCase(Locale.ROOT))) {
            String var7 = var1[3].toLowerCase(Locale.ROOT);
            return List.of("8", "12", "15", "24", "32", "64").stream().filter(var1x -> var1x.startsWith(var7)).toList();
         } else {
            return List.of();
         }
      } else {
         String var2 = var1[1].toLowerCase(Locale.ROOT);
         ArrayList var3 = new ArrayList();

         for (String var5 : VVuuUN) {
            if (var5.startsWith(var2)) {
               var3.add(var5);
            }
         }

         for (class_2960 var10 : class_7923.field_41175.method_10235()) {
            String var6 = this.UuUVuuUu(var10);
            if (var6.startsWith(var2)) {
               var3.add(var6);
               if (var3.size() < 30) {
                  continue;
               }
               break;
            }
         }

         return var3;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (this.vNUvnnVnUvu && this.uVUuuVnNVU != null && a_.field_1687 != null && a_.field_1724 != null) {
         this.vVvUvVVuuNvV();
         if (!this.UvnvNVnnnnNU.isEmpty()) {
            class_4598 var2 = nNNnNvVVv.UuUVuuUu();

            try {
               class_243 var3 = a_.field_1773.method_19418().method_19326();
               Matrix4f var4 = var1.uUnuvNvvNU().method_23760().method_23761();
               class_4588 var5 = var2.getBuffer(NVNnnvnuunNv);
               Color var6 = new Color(this.nUUVuvU);
               Color var7 = new Color(var6.getRed(), var6.getGreen(), var6.getBlue(), 120);
               Color var8 = new Color(var6.getRed(), var6.getGreen(), var6.getBlue(), 0);

               for (class_2338 var10 : this.UvnvNVnnnnNU) {
                  if (a_.field_1687.method_8320(var10).method_27852(this.uVUuuVnNVU)) {
                     float var11 = (float)(var10.method_10263() - var3.field_1352);
                     float var12 = (float)(var10.method_10264() - var3.field_1351);
                     float var13 = (float)(var10.method_10260() - var3.field_1350);
                     float var14 = var11 + 1.0F;
                     float var15 = var12 + 1.0F;
                     float var16 = var13 + 1.0F;
                     this.UuUVuuUu(var5, var4, var11, var12, var13, var14, var15, var16, var7, var8);
                  }
               }
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }
         }
      }
   }

   private void vVvUvVVuuNvV() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.vNVuvnUUnuUn >= 250L) {
         this.vNVuvnUUnuUn = var1;
         this.UvnvNVnnnnNU.clear();
         class_2338 var3 = a_.field_1724.method_24515();
         class_2339 var4 = new class_2339();
         int var5 = Math.max(a_.field_1687.method_31607(), var3.method_10264() - this.UnUNVVVNuv);
         int var6 = Math.min(a_.field_1687.method_31600(), var3.method_10264() + this.UnUNVVVNuv);

         for (int var7 = var3.method_10263() - this.UnUNVVVNuv; var7 <= var3.method_10263() + this.UnUNVVVNuv; var7++) {
            for (int var8 = var5; var8 <= var6; var8++) {
               for (int var9 = var3.method_10260() - this.UnUNVVVNuv; var9 <= var3.method_10260() + this.UnUNVVVNuv; var9++) {
                  var4.method_10103(var7, var8, var9);
                  if (a_.field_1687.method_8320(var4).method_27852(this.uVUuuVnNVU)) {
                     this.UvnvNVnnnnNU.add(var4.method_10062());
                  }
               }
            }
         }
      }
   }

   private void uNNnnnuuuN() {
      this.vNUvnnVnUvu = false;
      this.uVUuuVnNVU = null;
      this.vuuuNvNuv = null;
      this.UvnvNVnnnnNU.clear();
      vVnvuVVUunuv.UuUVuuUu("§7XRay выключен.");
   }

   private void nuUnNvnuUu() {
      vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.uUnuvNvvNU());
      vVnvuVVUunuv.UuUVuuUu("§7Пример: §f.xray diamond_ore 255,255,255 15");
      vVnvuVVUunuv.UuUVuuUu("§7Команды: §f.xray clear §7/ §f.xray off §7/ §f.xray reset");
   }

   private boolean UuUVuuUu(String var1) {
      return var1 != null && (var1.equals("off") || var1.equals("clear") || var1.equals("reset") || var1.equals("help"));
   }

   private class_2960 C00OOC00oO(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         if (!var2.contains(":")) {
            var2 = "minecraft:" + var2;
         }

         return class_2960.method_12829(var2);
      } else {
         return null;
      }
   }

   private Integer uUnuvNvvNU(String var1) {
      String[] var2 = var1.split(",");
      if (var2.length != 3) {
         return null;
      } else {
         int[] var3 = new int[3];

         for (int var4 = 0; var4 < 3; var4++) {
            try {
               var3[var4] = Integer.parseInt(var2[var4].trim());
            } catch (NumberFormatException var6) {
               return null;
            }

            if (var3[var4] < 0 || var3[var4] > 255) {
               return null;
            }
         }

         return var3[0] << 16 | var3[1] << 8 | var3[2];
      }
   }

   private Integer vVvUvVVuuNvV(String var1) {
      try {
         int var2 = Integer.parseInt(var1.trim());
         return var2 >= 1 && var2 <= 64 ? var2 : null;
      } catch (NumberFormatException var3) {
         return null;
      }
   }

   private String UuUVuuUu(int var1) {
      return (var1 >> 16 & 0xFF) + "," + (var1 >> 8 & 0xFF) + "," + (var1 & 0xFF);
   }

   private String UuUVuuUu(class_2960 var1) {
      if (var1 == null) {
         return "";
      } else {
         return "minecraft".equals(var1.method_12836()) ? var1.method_12832() : var1.toString();
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, Color var9, Color var10) {
      int var11 = var9.getRed();
      int var12 = var9.getGreen();
      int var13 = var9.getBlue();
      int var14 = var9.getAlpha();
      int var15 = var10.getRed();
      int var16 = var10.getGreen();
      int var17 = var10.getBlue();
      int var18 = var10.getAlpha();
      var1.method_22918(var2, var3, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var8).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var6, var4, var5).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var3, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var5).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var6, var7, var8).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var7, var8).method_1336(var15, var16, var17, var18);
   }

   static {
      Loader.initialize();
   }
}
