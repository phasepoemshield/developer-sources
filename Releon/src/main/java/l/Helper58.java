package l;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import org.joml.Matrix4f;

public class Helper58 implements Helper171 {
   private final Helper115 size;
   private final Helper127 radius;
   private final Helper172 color;
   private final float smoothness;
   private final float blurRadius;
   private static final ShaderProgramKey BLUR_SHADER_KEY = new ShaderProgramKey(Helper134.method1170("blur"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
   private static final Supplier<SimpleFramebuffer> TEMP_FBO_SUPPLIER = Suppliers.memoize(() -> new SimpleFramebuffer(1, 1, true));

   public Helper58(Helper115 var1, Helper127 var2, Helper172 var3, float var4, float var5) {
      this.size = var1;
      this.radius = var2;
      this.color = var3;
      this.smoothness = var4;
      this.blurRadius = var5;
   }

   @Override
   public void method591(Matrix4f var1, float var2, float var3, float var4) {
      Framebuffer var5 = MinecraftClient.getInstance().getFramebuffer();
      if (var5 != null && var5.textureWidth > 0 && var5.textureHeight > 0) {
         SimpleFramebuffer var6 = (SimpleFramebuffer)TEMP_FBO_SUPPLIER.get();
         if (var6.textureWidth != var5.textureWidth || var6.textureHeight != var5.textureHeight) {
            var6.resize(var5.textureWidth, var5.textureHeight);
         }

         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableCull();
         var6.beginWrite(false);
         var5.draw(var5.textureWidth, var5.textureHeight);
         var5.beginWrite(false);
         RenderSystem.setShaderTexture(0, var6.getColorAttachment());
         float var7 = this.size.method953();
         float var8 = this.size.method954();
         ShaderProgram var9 = RenderSystem.setShader(BLUR_SHADER_KEY);
         var9.getUniform("Size").set(var7, var8);
         var9.getUniform("Radius").set(this.radius.method1039(), this.radius.method1040(), this.radius.method1041(), this.radius.method1042());
         var9.getUniform("Smoothness").set(this.smoothness);
         var9.getUniform("BlurRadius").set(this.blurRadius);
         BufferBuilder var10 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         var10.vertex(var1, var2, var3, var4).color(this.color.method1462());
         var10.vertex(var1, var2, var3 + var8, var4).color(this.color.method1463());
         var10.vertex(var1, var2 + var7, var3 + var8, var4).color(this.color.method1464());
         var10.vertex(var1, var2 + var7, var3, var4).color(this.color.method1465());
         BufferRenderer.drawWithGlobalProgram(var10.end());
         RenderSystem.setShaderTexture(0, 0);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
      }
   }

   public Helper115 method648() {
      return this.size;
   }

   public Helper127 method649() {
      return this.radius;
   }

   public Helper172 method650() {
      return this.color;
   }

   public float method651() {
      return this.smoothness;
   }

   public float method652() {
      return this.blurRadius;
   }
}
