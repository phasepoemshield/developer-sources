package org.zenith.render;

import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.NbtEditor;
import org.zenith.core.ColorAnimator;
import org.zenith.core.TextScanner;
import org.zenith.core.Easing;

import org.zenith.util.ArgbColor;
import org.zenith.ZenithClient;
import org.zenith.util.ColorUtils;
import org.zenith.util.MathUtils;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.ClientProvider;
import org.zenith.core.AvatarRenderer;



import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;

class WorldRender_Var143 {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   double x;
   double y;
   double z;
   double val175;
   double val176;
   double val177;
   double val095;
   double val060;
   double val096;
   long long91;
   float val528 = 0.0F;
   float val529 = 0.0F;
   float val530 = 0.0F;

   public WorldRender_Var143(double var1, double var3, double var5) {
      this.x = var1;
      this.y = var3;
      this.z = var5;
      this.val175 = var1;
      this.val176 = var3;
      this.val177 = var5;
      this.val095 = 0.0;
      this.val060 = (double)((float)(-MathUtils.SimpleItemBuilder(0.0, 0.1)));
      this.val096 = 0.0;
      this.long91 = System.currentTimeMillis();
      this.val175 = var1;
      this.val176 = var3;
      this.val177 = var5;
   }

   public long getTime() {
      return this.long91;
   }

   public boolean var1434() {
      this.val175 = this.x;
      this.val176 = this.y;
      this.val177 = this.z;
      this.x = this.x + this.val095;
      this.y = this.y + this.val060;
      this.z = this.z + this.val096;
      return System.currentTimeMillis() - this.getTime() > 250L;
   }

   public void on23(MatrixStack var1, float var2, float var3, BufferBuilder var4) {
      try {
         float f = 1.0F;
         float f1 = 0.03F;
         Camera camera = ClientProvider.minecraftClient3.getEntityRenderDispatcher().camera;
         double d0 = AvatarRenderer.NbtEditor(this.val175, this.x, (double)WorldRender.getTickDelta())
            - ClientProvider.minecraftClient3.getEntityRenderDispatcher().camera.getPos().x;
         double d1 = AvatarRenderer.NbtEditor(this.val176, this.y, (double)WorldRender.getTickDelta())
            - ClientProvider.minecraftClient3.getEntityRenderDispatcher().camera.getPos().y;
         double d2 = AvatarRenderer.NbtEditor(this.val177, this.z, (double)WorldRender.getTickDelta())
            - ClientProvider.minecraftClient3.getEntityRenderDispatcher().camera.getPos().z;
         MatrixStack matrixstack = new MatrixStack();
         matrixstack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
         matrixstack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(camera.getYaw() + 180.0F));
         matrixstack.translate(d0, d1, d2);
         matrixstack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
         matrixstack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
         Matrix4f matrix4f = matrixstack.peek().getPositionMatrix();
         long i = System.currentTimeMillis() - this.long91;
         long j = 200L;
         float f2 = (float)i / (float)j;
         float f3;
         if (f2 < 0.2F) {
            f3 = f2 / 0.2F;
         } else if (f2 > 0.8F) {
            f3 = (1.0F - f2) / 0.2F;
         } else {
            f3 = 1.0F;
         }

         f3 = Math.max(0.0F, Math.min(f3, 1.0F));
         int k = ColorUtils.ColorAnimator(
            ZenithClient.on23().TextScanner().getClientColor(90).Easing(ArgbColor.var11937, var2).call001(),
            f3 * var3
         );
         if (var3 == 0.0F) {
            this.long91 = System.currentTimeMillis() - 260L;
         }

         AvatarRenderer.Easing(matrix4f, var4, -f1 / 2.0F, -f1 / 2.0F, f1, f1, k);
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }
}
