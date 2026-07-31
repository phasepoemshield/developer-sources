package l;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.awt.Color;
import java.awt.Font;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

public class Helper175 implements Helper160 {
   private final Object2ObjectMap<Identifier, ObjectList<Helper99>> GLYPH_PAGE_CACHE = new Object2ObjectOpenHashMap();
   private final ObjectList<Helper186> maps = new ObjectArrayList();
   private Font font;

   public Helper175(Font var1, float var2) {
      this.method1468(var1, var2);
   }

   private void method1468(Font var1, float var2) {
      this.font = var1.deriveFont(var2 * 2.0F);
   }

   private Helper186 method1469(char var1, char var2) {
      Helper186 var3 = new Helper186(var1, var2, this.font, method1489(), 5);
      this.maps.add(var3);
      return var3;
   }

   Helper100 method1470(char var1) {
      ObjectListIterator var2 = this.maps.iterator();

      while (var2.hasNext()) {
         Helper186 var3 = (Helper186)var2.next();
         if (var3.method1602(var1)) {
            return var3.method1601(var1);
         }
      }

      char var4 = (char)Helper147.method1236(var1, 128);
      return this.method1469(var4, (char)(var4 + 128)).method1601(var1);
   }

   public void method1471(MatrixStack var1, Text var2, double var3, double var5) {
      StringBuilder var7 = new StringBuilder();
      this.method1472(var7, var2);
      this.method1474(var1, var7.toString(), var3, var5, Helper133.method1160());
   }

   public void method1472(StringBuilder var1, Text var2) {
      Style var3 = var2.getStyle();
      if (var2.getSiblings().isEmpty()) {
         if (var3.getColor() != null) {
            var1.append(Helper133.method1152(var3.getColor().getRgb()));
         }

         var1.append(var2.getString()).append(Formatting.RESET);
      } else {
         var2.getWithStyle(var3).forEach(var2x -> this.method1472(var1, var2x));
      }
   }

   public void method1473(MatrixStack var1, String var2, double var3, double var5, float var7, int var8) {
      String var9 = "  |  ";
      float var10 = this.method1479(var2 + var9);
      if (var10 - var7 < 10.0F) {
         this.method1474(var1, var2, var3, var5, var8);
      } else {
         this.method1474(var1, var2 + var9 + var2, var3 - Helper147.method1232(var10), var5, var8);
      }
   }

   public void method1474(MatrixStack var1, String var2, double var3, double var5, int var7) {
      if (!(mc.currentScreen instanceof Widget16)) {
         Event7 var8 = new Event7(var2);
         Helper124.method1026(var8);
         var2 = var8.method3676();
      }

      char[] var9 = var2.toCharArray();
      float var10 = 0.0F;
      float var11 = 0.0F;
      int var12 = 0;
      StringBuilder var13 = new StringBuilder();
      boolean var14 = false;
      boolean var15 = false;
      int var16 = var7;

      for (int var17 = 0; var17 < var9.length; var17++) {
         char var18 = var9[var17];
         if (var18 == 167) {
            var14 = true;
         } else if (var14) {
            var14 = false;
            char var19 = Character.toUpperCase(var18);
            if (Helper133.colorCodes.containsKey(var19)) {
               var16 = new Color(Helper133.colorCodes.get(var19)).getRGB();
            } else if (var19 == 'R') {
               var16 = var7;
            }
         } else if (var18 == 9167) {
            if (var15) {
               var16 = new Color(Integer.parseInt(var13.toString())).getRGB();
               var13.setLength(0);
            }

            var15 = !var15;
         } else if (var15) {
            var13.append(var18);
         } else if (var18 == '\n') {
            var11 += this.method1481(var2.substring(var12, var17)) - 2.0F;
            var10 = 0.0F;
            var12 = var17 + 1;
         } else {
            Helper100 var23 = this.method1470(var18);
            if (var23 != null) {
               if (var23.method919() != ' ') {
                  Identifier var20 = var23.method920().bindToTexture;
                  Helper99 var21 = new Helper99(var10, var11, var16, var23);
                  ((ObjectList)this.GLYPH_PAGE_CACHE.computeIfAbsent(var20, var0 -> new ObjectArrayList())).add(var21);
               }

               var10 += var23.method917();
            }
         }
      }

      if (!this.GLYPH_PAGE_CACHE.isEmpty()) {
         this.method1476(var1, var3, var5);
      }

      this.GLYPH_PAGE_CACHE.clear();
   }

   public void method1475(MatrixStack var1, String var2, double var3, double var5, int var7, int var8) {
      if (!(mc.currentScreen instanceof Widget16)) {
         Event7 var9 = new Event7(var2);
         Helper124.method1026(var9);
         var2 = var9.method3676();
      }

      char[] var10 = var2.toCharArray();
      float var11 = 0.0F;
      float var12 = 0.0F;
      int var13 = 0;
      int var14 = var2.length();

      for (int var15 = 0; var15 < var10.length; var15++) {
         char var16 = var10[var15];
         if (var16 == '\n') {
            var12 += this.method1481(var2.substring(var13, var15)) - 2.0F;
            var11 = 0.0F;
            var13 = var15 + 1;
         } else {
            Helper100 var17 = this.method1470(var16);
            if (var17 != null) {
               if (var17.method919() != ' ') {
                  float var18 = (float)var15 / (var14 - 1);
                  int var19 = this.method1487(var7, var8, var18);
                  Identifier var20 = var17.method920().bindToTexture;
                  Helper99 var21 = new Helper99(var11, var12, var19, var17);
                  ((ObjectList)this.GLYPH_PAGE_CACHE.computeIfAbsent(var20, var0 -> new ObjectArrayList())).add(var21);
               }

               var11 += var17.method917();
            }
         }
      }

      if (!this.GLYPH_PAGE_CACHE.isEmpty()) {
         this.method1476(var1, var3, var5);
      }

      this.GLYPH_PAGE_CACHE.clear();
   }

   private void method1476(MatrixStack var1, double var2, double var4) {
      var1.push();
      var1.translate(var2, var4 - 3.0, 0.0);
      var1.scale(0.5F, 0.5F, 1.0F);
      Matrix4f var6 = var1.peek().getPositionMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      ObjectIterator var7 = this.GLYPH_PAGE_CACHE.keySet().iterator();

      while (var7.hasNext()) {
         Identifier var8 = (Identifier)var7.next();
         RenderSystem.setShaderTexture(0, var8);
         BufferBuilder var9 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         ObjectListIterator var10 = ((ObjectList)this.GLYPH_PAGE_CACHE.get(var8)).iterator();

         while (var10.hasNext()) {
            Helper99 var11 = (Helper99)var10.next();
            float var12 = var11.method911();
            float var13 = var11.method912();
            Helper100 var14 = var11.method914();
            Helper186 var15 = var14.method920();
            float var16 = var14.method917();
            float var17 = var14.method918();
            float var18 = (float)var14.method915() / var15.width;
            float var19 = (float)var14.method916() / var15.height;
            float var20 = (float)(var14.method915() + var14.method917()) / var15.width;
            float var21 = (float)(var14.method916() + var14.method918()) / var15.height;
            int var22 = var11.method913();
            var9.vertex(var6, var12 + 0.0F, var13 + var17, 0.0F).texture(var18, var21).color(var22);
            var9.vertex(var6, var12 + var16, var13 + var17, 0.0F).texture(var20, var21).color(var22);
            var9.vertex(var6, var12 + var16, var13 + 0.0F, 0.0F).texture(var20, var19).color(var22);
            var9.vertex(var6, var12 + 0.0F, var13 + 0.0F, 0.0F).texture(var18, var19).color(var22);
         }

         BufferRenderer.drawWithGlobalProgram(var9.end());
      }

      RenderSystem.disableBlend();
      var1.pop();
   }

   public void method1477(MatrixStack var1, String var2, double var3, double var5, int var7) {
      this.method1474(var1, var2, (int)(var3 - this.method1479(var2) / 2.0F), (float)var5, var7);
   }

   public float method1478(Text var1) {
      return var1 != null ? this.method1479(var1.getString()) : 0.0F;
   }

   public float method1479(String var1) {
      if (!(mc.currentScreen instanceof Widget16)) {
         Event7 var2 = new Event7(var1);
         Helper124.method1026(var2);
         var1 = var2.method3676();
      }

      float var3 = 0.0F;
      float var4 = 0.0F;
      boolean var5 = false;

      for (char var9 : var1.toCharArray()) {
         if (var5) {
            var5 = false;
         } else if (var9 == 167) {
            var5 = true;
         } else if (var9 == '\n') {
            var4 = Math.max(var3, var4);
            var3 = 0.0F;
         } else {
            Helper100 var10 = this.method1470(var9);
            var3 += var10 == null ? 0.0F : var10.method917();
         }
      }

      return Math.max(var3, var4) / 2.0F;
   }

   public float method1480(Text var1) {
      return this.method1481(var1.getString());
   }

   public float method1481(String var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for (char var7 : (var1.isEmpty() ? " " : var1).toCharArray()) {
         if (var7 == '\n') {
            var2 = var2 == 0.0F ? this.method1470(' ').method918() : var2;
            var3 += var2;
            var2 = 0.0F;
         } else {
            Helper100 var8 = this.method1470(var7);
            var2 = Math.max(var8 == null ? 0.0F : var8.method918(), var2);
         }
      }

      return var2 + var3;
   }

   public String method1482(String var1, int var2, boolean var3) {
      return var3 ? this.method1485(var1, var2) : this.method1483(var1, var2);
   }

   public String method1483(String var1, int var2) {
      return var1.substring(0, this.method1484(var1, var2));
   }

   private int method1484(String var1, int var2) {
      Helper173 var3 = new Helper173(this, var2);
      this.method1486(var1, var3);
      return var3.method1467();
   }

   public String method1485(String var1, int var2) {
      MutableFloat var3 = new MutableFloat(var2);
      MutableInt var4 = new MutableInt(var1.length());

      for (int var5 = var1.length() - 1; var5 >= 0; var5--) {
         char var6 = var1.charAt(var5);
         Helper100 var7 = this.method1470(var6);
         if (var7 != null) {
            var3.subtract(var7.method917());
            if (var3.floatValue() < 0.0F) {
               var4.setValue(var5 + 1);
               break;
            }
         }
      }

      return var1.substring(var4.intValue());
   }

   private boolean method1486(String var1, Helper174 var2) {
      int var3 = var1.length();

      for (int var4 = 0; var4 < var3; var4++) {
         char var5 = var1.charAt(var4);
         if (!var2.method1466(var4, var5)) {
            return false;
         }
      }

      return true;
   }

   private int method1487(int var1, int var2, float var3) {
      float var4 = (var1 >> 24 & 0xFF) / 255.0F;
      float var5 = (var1 >> 16 & 0xFF) / 255.0F;
      float var6 = (var1 >> 8 & 0xFF) / 255.0F;
      float var7 = (var1 & 0xFF) / 255.0F;
      float var8 = (var2 >> 24 & 0xFF) / 255.0F;
      float var9 = (var2 >> 16 & 0xFF) / 255.0F;
      float var10 = (var2 >> 8 & 0xFF) / 255.0F;
      float var11 = (var2 & 0xFF) / 255.0F;
      float var12 = var4 + var3 * (var8 - var4);
      float var13 = var5 + var3 * (var9 - var5);
      float var14 = var6 + var3 * (var10 - var6);
      float var15 = var7 + var3 * (var11 - var7);
      return (int)(var12 * 255.0F) << 24 | (int)(var13 * 255.0F) << 16 | (int)(var14 * 255.0F) << 8 | (int)(var15 * 255.0F);
   }

   public void method1488(MatrixStack var1, Text var2, int var3, int var4, int var5) {
   }

   @Contract(
      value = "-> new",
      pure = true
   )
   @NotNull
   public static Identifier method1489() {
      return Identifier.of("rich", "temp/" + Helper209.method1790(32));
   }

   @Contract(
      value = "_ -> new",
      pure = true
   )
   @NotNull
   public static int[] method1490(int var0) {
      int var1 = var0 >> 16 & 0xFF;
      int var2 = var0 >> 8 & 0xFF;
      int var3 = var0 & 0xFF;
      return new int[]{var1, var2, var3};
   }

   public Helper175 method1491(Font var1) {
      this.font = var1;
      return this;
   }

   public Font method1492() {
      return this.font;
   }
}
