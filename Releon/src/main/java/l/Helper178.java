package l;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;

public final class Helper178 implements Helper160 {
   private static final List<Helper177> QUAD = new ArrayList<>();

   public static void method1501(DrawContext var0) {
      MatrixStack var1 = var0.getMatrices();
      Matrix4f var2 = var1.peek().getPositionMatrix();
      if (!QUAD.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         BufferBuilder var3 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         QUAD.forEach(var2x -> drawEngine.method1433(var2, var3, var2x.x, var2x.y, var2x.width, var2x.height, var2x.color));
         BufferRenderer.drawWithGlobalProgram(var3.end());
         RenderSystem.disableBlend();
         QUAD.clear();
      }
   }

   public static void method1502(DrawContext var0, ItemStack var1, float var2, float var3, boolean var4, boolean var5, float var6) {
      MatrixStack var7 = var0.getMatrices();
      if (var4) {
         blur.method677(
            Helper80.method841(var7, var2, var3, 16.0F * var6 + 2.0F, 16.0F * var6 + 2.0F).method826(2.0F).method823(Helper133.HALF_BLACK).method840()
         );
      }

      var7.push();
      var7.translate(var2 + 1.0F, var3 + 1.0F, 0.0F);
      var7.scale(var6, var6, 1.0F);
      var0.drawItem(var1, 0, 0);
      if (var5) {
         var0.drawStackOverlay(mc.textRenderer, var1, 0, 0);
      }

      var7.pop();
   }

   public static void method1503(MatrixStack var0, ItemStack var1, float var2, float var3, boolean var4, float var5) {
      float var6 = var2 + 1.0F;
      float var7 = var3 + 1.0F;
      float var8 = 1.0F;
      var0.push();
      var0.translate(var6, var7, 0.0F);
      if (var4) {
         blur.method677(
            Helper80.method841(var0, -var8, -var8, 16.0F * var5 + var8 * 2.0F, 16.0F * var5 + var8 * 2.0F)
               .method826(1.5F)
               .method823(Helper133.HALF_BLACK)
               .method840()
         );
      }

      var0.scale(var5, var5, 1.0F);
      Helper162.method1337(var0, var1, 0.0F, 0.0F, true, true);
      var0.pop();
   }

   public static void method1504(DrawContext var0, Identifier var1, float var2, float var3, int var4) {
      MatrixStack var5 = var0.getMatrices();
      if (var1 != null) {
         var5.push();
         var5.translate(var2, var3, 0.0F);
         var5.scale(var4, var4, 1.0F);
         RenderSystem.enableBlend();
         method1511(var5, var1, 0, 0, 1.0F, 1.0F, var4, var4, var4, var4, var4, var4, -1);
         RenderSystem.disableBlend();
         var5.translate(-var2, -var3, 0.0F);
         var5.pop();
      }
   }

   public static Color method1505(Color var0, float var1) {
      var1 = Math.min(1.0F, Math.max(0.0F, var1));
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), (int)(var0.getAlpha() * var1));
   }

   public static int method1506(int var0, float var1) {
      var1 = Math.min(1.0F, Math.max(0.0F, var1));
      Color var2 = new Color(var0);
      return new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), (int)(var2.getAlpha() * var1)).getRGB();
   }

   public static void method1507(DrawContext var0, Identifier var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      method1508(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, -1);
   }

   public static void method1508(
      DrawContext var0, Identifier var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10
   ) {
      MatrixStack var11 = var0.getMatrices();
      rectangle.method677(Helper80.method841(var11, var2, var3, var4, var4).method826(var5).method823(var9).method840());
      if (var1 != null) {
         var11.push();
         var11.translate(var2, var3, 0.0F);
         var11.scale(var4, var4, 1.0F);
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(772, 773);
         method1511(var11, var1, 0, 0, 1.0F, 1.0F, var6, var6, var7, var7, var8, var8, var10);
         RenderSystem.disableBlend();
         var11.translate(-var2, -var3, 0.0F);
         var11.pop();
      }
   }

   public static void method1509(MatrixStack var0, Sprite var1, float var2, float var3, float var4, int var5) {
      if (var4 != 0.0F && var5 != 0) {
         method1513(var0, var1.getAtlasId(), var2, var2 + var4, var3, var3 + var5, var1.getMinU(), var1.getMaxU(), var1.getMinV(), var1.getMaxV(), -1);
      }
   }

   public static void method1510(MatrixStack var0, Sprite var1, float var2, float var3, float var4, int var5, int var6) {
      if (var4 != 0.0F && var5 != 0) {
         method1513(var0, var1.getAtlasId(), var2, var2 + var4, var3, var3 + var5, var1.getMinU(), var1.getMaxU(), var1.getMinV(), var1.getMaxV(), var6);
      }
   }

   public static void method1511(
      MatrixStack var0,
      Identifier var1,
      int var2,
      int var3,
      float var4,
      float var5,
      float var6,
      float var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12
   ) {
      method1512(var0, var1, var2, var2 + var4, var3, var3 + var5, 0.0F, var8, var9, var6, var7, var10, var11, var12);
   }

   public static void method1512(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13
   ) {
      method1513(var0, var1, var2, var3, var4, var5, (var9 + 0.0F) / var11, (var9 + var7) / var11, (var10 + 0.0F) / var12, (var10 + var8) / var12, var13);
   }

   public static void method1513(
      MatrixStack var0, Identifier var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10
   ) {
      RenderSystem.setShaderTexture(0, var1);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      BufferBuilder var11 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      Matrix4f var12 = var0.peek().getPositionMatrix();
      var11.vertex(var12, var2, var4, 0.0F).texture(var6, var8).color(var10);
      var11.vertex(var12, var2, var5, 0.0F).texture(var6, var9).color(var10);
      var11.vertex(var12, var3, var5, 0.0F).texture(var7, var9).color(var10);
      var11.vertex(var12, var3, var4, 0.0F).texture(var7, var8).color(var10);
      BufferRenderer.drawWithGlobalProgram(var11.end());
   }

   public static void method1514(MatrixStack var0, float var1, float var2, float var3, int var4) {
      byte var5 = 16;
      float var6 = (float)((Math.PI * 2) / var5);
      Matrix4f var7 = var0.peek().getPositionMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder var8 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);

      for (int var9 = 0; var9 < var5; var9++) {
         float var10 = var9 * var6;
         float var11 = (var9 + 1) * var6;
         float var12 = var1 + var3 * (float)Math.cos(var10);
         float var13 = var2 + var3 * (float)Math.sin(var10);
         float var14 = var1 + var3 * (float)Math.cos(var11);
         float var15 = var2 + var3 * (float)Math.sin(var11);
         var8.vertex(var7, var1, var2, 0.0F).color(var4);
         var8.vertex(var7, var12, var13, 0.0F).color(var4);
         var8.vertex(var7, var14, var15, 0.0F).color(var4);
         var8.vertex(var7, var1, var2, 0.0F).color(var4);
      }

      BufferRenderer.drawWithGlobalProgram(var8.end());
      RenderSystem.disableBlend();
   }

   public static void method1515(BufferBuilder var0) {
      BuiltBuffer var1 = var0.endNullable();
      if (var1 != null) {
         BufferRenderer.drawWithGlobalProgram(var1);
      }
   }

   public static void method1516(float var0, float var1, float var2, float var3, int var4) {
      QUAD.add(new Helper177(var0, var1, var2, var3, Helper133.method1108(var4, RenderSystem.getShaderColor()[3])));
   }

   private Helper178() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
