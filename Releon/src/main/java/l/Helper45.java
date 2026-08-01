package l;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import org.joml.Matrix4f;

public class Helper45 implements Helper171 {
   private final Helper110 font;
   private final String text;
   private final float size;
   private final float thickness;
   private final int color;
   private final float smoothness;
   private final float spacing;
   private final int outlineColor;
   private final float outlineThickness;
   private static final ShaderProgramKey MSDF_FONT_SHADER_KEY = new ShaderProgramKey(
      Helper134.method1170("msdf_font"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY
   );

   public Helper45(Helper110 var1, String var2, float var3, float var4, int var5, float var6, float var7, int var8, float var9) {
      this.font = var1;
      this.text = var2;
      this.size = var3;
      this.thickness = var4;
      this.color = var5;
      this.smoothness = var6;
      this.spacing = var7;
      this.outlineColor = var8;
      this.outlineThickness = var9;
   }

   @Override
   public void method591(Matrix4f var1, float var2, float var3, float var4) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.setShaderTexture(0, this.font.method943());
      boolean var5 = this.outlineThickness > 0.0F;
      ShaderProgram var6 = RenderSystem.setShader(MSDF_FONT_SHADER_KEY);
      var6.getUniform("Range").set(this.font.method946().method621());
      var6.getUniform("Thickness").set(this.thickness);
      var6.getUniform("Smoothness").set(this.smoothness);
      var6.getUniform("Outline").set(var5 ? 1 : 0);
      if (var5) {
         var6.getUniform("OutlineThickness").set(this.outlineThickness);
         float[] var7 = Helper142.method1215(this.outlineColor);
         var6.getUniform("OutlineColor").set(var7[0], var7[1], var7[2], var7[3]);
      }

      BufferBuilder var8 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      this.font
         .method944(
            var1,
            var8,
            this.text,
            this.size,
            (this.thickness + this.outlineThickness * 0.5F) * 0.5F * this.size,
            this.spacing,
            var2,
            var3 + this.font.method947().method613() * this.size,
            var4,
            this.color
         );
      BufferRenderer.drawWithGlobalProgram(var8.end());
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   public Helper110 method592() {
      return this.font;
   }

   public String method593() {
      return this.text;
   }

   public float method594() {
      return this.size;
   }

   public float method595() {
      return this.thickness;
   }

   public int method596() {
      return this.color;
   }

   public float method597() {
      return this.smoothness;
   }

   public float method598() {
      return this.spacing;
   }

   public int method599() {
      return this.outlineColor;
   }

   public float method600() {
      return this.outlineThickness;
   }
}
