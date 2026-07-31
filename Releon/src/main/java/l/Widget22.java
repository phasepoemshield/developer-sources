package l;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class Widget22 extends Screen {
   private final AutoSwap autoSwap;
   private int hoveredSlot = -1;
   private int lastHoveredSlot = -1;
   private long hoverStartMs = 0L;
   private boolean hoverSwapTriggered = false;
   private static final float SECTOR_SIZE = 120.0F;
   private static final float START_ANGLE = -150.0F;
   private static final int SECTORS = 3;
   private static final long HOVER_SWAP_DELAY_MS = 120L;

   public Widget22(AutoSwap var1) {
      super(Text.literal("AutoSwap Wheel"));
      this.autoSwap = var1;
   }

   @Override
   public boolean shouldPause() {
      return false;
   }

   @Override
   public void close() {
      if (this.client != null) {
         this.client.setScreen(null);
      }
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      this.renderBackground(context, mouseX, mouseY, delta);
      if (this.client != null && this.client.player != null) {
         float var5 = this.width / 2.0F;
         float var6 = this.height / 2.0F;
         float var7 = Math.min(this.width, this.height);
         float var8 = var7 * 0.2F;
         float var9 = var8 - 24.0F;
         float var10 = (var9 + var8) * 0.5F;
         this.hoveredSlot = this.method3745(mouseX, mouseY, var5, var6, var9, var8);
         this.method3744();
         int var11 = 1358954495;
         int var12 = 1895786086;

         for (int var13 = 0; var13 < 3; var13++) {
            float var14 = -150.0F + var13 * 120.0F;
            float var15 = var14 + 120.0F;
            this.method3746(context, var5, var6, var9, var8, var14, var15, var13 == this.hoveredSlot ? var12 : var11);
         }

         int var21 = -855638017;

         for (int var22 = 0; var22 < 3; var22++) {
            float var24 = -150.0F + var22 * 120.0F;
            this.method3747(context, var5, var6, var9, var8, var24, var21);
         }

         for (int var23 = 0; var23 < 3; var23++) {
            ItemStack var25 = this.autoSwap.method4475(var23);
            float var16 = -150.0F + var23 * 120.0F + 60.0F;
            double var17 = Math.toRadians(var16);
            int var19 = (int)(var5 + var10 * Math.cos(var17)) - 8;
            int var20 = (int)(var6 + var10 * Math.sin(var17)) - 8;
            if (!var25.isEmpty()) {
               context.drawItem(var25, var19, var20);
            }
         }
      }
   }

   @Override
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 256) {
         this.close();
         return true;
      } else {
         return super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   @Override
   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (this.hoveredSlot < 0 || this.hoveredSlot >= 3) {
         return super.mouseClicked(mouseX, mouseY, button);
      } else if (button == 0) {
         ItemStack var6 = this.autoSwap.method4475(this.hoveredSlot);
         this.close();
         if (!var6.isEmpty()) {
            this.autoSwap.method4476(var6);
         }

         return true;
      } else if (button == 1) {
         this.close();
         this.autoSwap.method4473(this.hoveredSlot);
         return true;
      } else {
         return super.mouseClicked(mouseX, mouseY, button);
      }
   }

   private void method3744() {
      if (!this.hoverSwapTriggered) {
         long var1 = System.currentTimeMillis();
         if (this.hoveredSlot != this.lastHoveredSlot) {
            this.lastHoveredSlot = this.hoveredSlot;
            this.hoverStartMs = var1;
         } else if (this.hoveredSlot >= 0 && this.hoveredSlot < 3) {
            if (var1 - this.hoverStartMs >= 120L) {
               ItemStack var3 = this.autoSwap.method4475(this.hoveredSlot);
               this.hoverSwapTriggered = true;
               this.close();
               if (!var3.isEmpty()) {
                  this.autoSwap.method4476(var3);
               }
            }
         }
      }
   }

   private int method3745(double var1, double var3, float var5, float var6, float var7, float var8) {
      float var9 = (float)var1 - var5;
      float var10 = (float)var3 - var6;
      float var11 = (float)Math.sqrt(var9 * var9 + var10 * var10);
      if (!(var11 < var7) && !(var11 > var8)) {
         float var12 = (float)Math.toDegrees(Math.atan2(var10, var9));
         if (var12 < 0.0F) {
            var12 += 360.0F;
         }

         float var13 = -150.0F;

         while (var13 < 0.0F) {
            var13 += 360.0F;
         }

         while (var13 >= 360.0F) {
            var13 -= 360.0F;
         }

         float var14 = var12 - var13;
         if (var14 < 0.0F) {
            var14 += 360.0F;
         }

         int var15 = (int)(var14 / 120.0F);
         return var15 >= 0 && var15 < 3 ? var15 : -1;
      } else {
         return -1;
      }
   }

   private void method3746(DrawContext var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      Matrix4f var9 = var1.getMatrices().peek().getPositionMatrix();
      boolean var10 = GL11.glIsEnabled(2884);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      Tessellator var11 = Tessellator.getInstance();
      BufferBuilder var12 = var11.begin(DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);
      byte var13 = 90;
      float var14 = (float)Math.toRadians(var6);
      float var15 = (float)Math.toRadians(var7);
      float var16 = (var15 - var14) / var13;

      for (int var17 = 0; var17 < var13; var17++) {
         float var18 = var14 + var16 * var17;
         float var19 = var14 + var16 * (var17 + 1);
         float var20 = MathHelper.cos(var18);
         float var21 = MathHelper.sin(var18);
         float var22 = MathHelper.cos(var19);
         float var23 = MathHelper.sin(var19);
         float var24 = var2 + var5 * var20;
         float var25 = var3 + var5 * var21;
         float var26 = var2 + var5 * var22;
         float var27 = var3 + var5 * var23;
         float var28 = var2 + var4 * var20;
         float var29 = var3 + var4 * var21;
         float var30 = var2 + var4 * var22;
         float var31 = var3 + var4 * var23;
         var12.vertex(var9, var24, var25, 0.0F).color(var8);
         var12.vertex(var9, var26, var27, 0.0F).color(var8);
         var12.vertex(var9, var30, var31, 0.0F).color(var8);
         var12.vertex(var9, var24, var25, 0.0F).color(var8);
         var12.vertex(var9, var30, var31, 0.0F).color(var8);
         var12.vertex(var9, var28, var29, 0.0F).color(var8);
      }

      BufferRenderer.drawWithGlobalProgram(var12.end());
      if (var10) {
         RenderSystem.enableCull();
      } else {
         RenderSystem.disableCull();
      }

      RenderSystem.disableBlend();
   }

   private void method3747(DrawContext var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = (float)Math.toRadians(var6);
      float var9 = MathHelper.cos(var8);
      float var10 = MathHelper.sin(var8);
      float var11 = var2 + var4 * var9;
      float var12 = var3 + var4 * var10;
      float var13 = var2 + var5 * var9;
      float var14 = var3 + var5 * var10;
      float var15 = 0.9F;
      float var16 = var13 - var11;
      float var17 = var14 - var12;
      float var18 = (float)Math.sqrt(var16 * var16 + var17 * var17);
      if (!(var18 <= 0.0F)) {
         float var19 = -var17 / var18 * var15;
         float var20 = var16 / var18 * var15;
         float var21 = var11 + var19;
         float var22 = var12 + var20;
         float var23 = var11 - var19;
         float var24 = var12 - var20;
         float var25 = var13 + var19;
         float var26 = var14 + var20;
         float var27 = var13 - var19;
         float var28 = var14 - var20;
         Matrix4f var29 = var1.getMatrices().peek().getPositionMatrix();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableCull();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         Tessellator var30 = Tessellator.getInstance();
         BufferBuilder var31 = var30.begin(DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);
         var31.vertex(var29, var21, var22, 0.0F).color(var7);
         var31.vertex(var29, var25, var26, 0.0F).color(var7);
         var31.vertex(var29, var23, var24, 0.0F).color(var7);
         var31.vertex(var29, var23, var24, 0.0F).color(var7);
         var31.vertex(var29, var25, var26, 0.0F).color(var7);
         var31.vertex(var29, var27, var28, 0.0F).color(var7);
         BufferRenderer.drawWithGlobalProgram(var31.end());
         RenderSystem.disableBlend();
      }
   }
}
