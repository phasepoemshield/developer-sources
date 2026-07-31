package l;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector4i;

public class JumpCircle extends Helper242 {
   private final List<Helper249> circles = new ArrayList<>();
   private final Identifier circleTexture = Identifier.of("textures/circle2.png");
   private final Setting2 maxSize = new Setting2("Размер ", "Максимальный размер круга").method2086(2.5F).method2078(1.0F, 3.0F);
   private final Setting2 speed = new Setting2("Скорость", "Скорость анимации").method2086(1000.0F).method2078(500.0F, 5000.0F);
   private final Setting7 color = new Setting7("Цвет", "Цвет круга").method2550(Helper133.method1148(225, 225, 255, 255));

   public JumpCircle() {
      super("JumpCircle", "Jump Circle", Helper269.RENDER);
      this.setup(new Helper264[]{this.maxSize, this.speed, this.color});
   }

   @Helper104
   public void method2416(Helper372 var1) {
      if (mc.player != null && var1.method3660() == mc.player) {
         Vec3d var2 = new Vec3d(mc.player.getX(), Math.floor(mc.player.getY()) + 0.001, mc.player.getZ());
         this.circles.add(new Helper249(var2, new Helper166()));
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      this.circles.removeIf(var1x -> var1x.timer.method1379((long)this.speed.method2082()));
      this.method2417();
   }

   private void method2417() {
      if (!this.circles.isEmpty()) {
         for (Helper249 var2 : this.circles) {
            this.method2418(var2);
         }
      }
   }

   private void method2418(Helper249 var1) {
      float var2 = (float)var1.timer.method1376();
      float var3 = this.speed.method2082();
      float var4 = Math.min(var2 / var3, 1.0F);
      if (!(var4 >= 1.0F)) {
         float var5 = this.method2419(var4);
         float var6 = var5 * this.maxSize.method2082();
         float var7 = 0.15F;
         float var8 = 0.65F;
         float var9 = 0.85F;
         float var10;
         if (var4 < var7) {
            var10 = var4 / var7;
         } else if (var4 >= var9) {
            float var11 = (var4 - var9) / (1.0F - var9);
            var10 = 1.0F - var11;
            if (var4 > var8) {
               float var12 = (var4 - var8) / (var9 - var8);
               float var13 = (float)(Math.sin(var12 * Math.PI * 3.0) * 0.3 + 0.3);
               var10 += var13 * (1.0F - var11);
            }
         } else if (var4 > var8) {
            float var19 = (var4 - var8) / (var9 - var8);
            float var21 = (float)(Math.sin(var19 * Math.PI * 3.0) * 0.3 + 0.3);
            var10 = 1.0F + var21;
         } else {
            var10 = 1.0F;
         }

         var10 = Math.max(0.0F, Math.min(1.0F, var10));
         int var20 = Helper133.method1108(this.color.method2553(), var10);
         Camera var22 = mc.getEntityRenderDispatcher().camera;
         Vec3d var23 = var22.getPos();
         Vec3d var14 = var1.method2414();
         MatrixStack var15 = new MatrixStack();
         var15.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var22.getPitch()));
         var15.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var22.getYaw() + 180.0F));
         var15.translate(var14.x - var23.x, var14.y - var23.y, var14.z - var23.z);
         var15.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var22.getYaw()));
         var15.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
         Entry var16 = var15.peek();
         Vector4i var17 = new Vector4i(var20, var20, var20, var20);
         Helper183.method1568(var16, this.circleTexture, -var6 / 2.0F, -var6 / 2.0F, var6, var6, var17, true);
      }
   }

   private float method2419(float var1) {
      float var2 = 7.5625F;
      float var3 = 2.75F;
      if (var1 < 1.0F / var3) {
         return var2 * var1 * var1;
      } else if (var1 < 2.0F / var3) {
         float var6;
         return var2 * (var6 = var1 - 1.5F / var3) * var6 + 0.75F;
      } else {
         float var4;
         float var5;
         return var1 < 2.5F / var3 ? var2 * (var4 = var1 - 2.25F / var3) * var4 + 0.9375F : var2 * (var5 = var1 - 2.625F / var3) * var5 + 0.984375F;
      }
   }
}
