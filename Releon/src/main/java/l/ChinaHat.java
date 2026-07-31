package l;

import java.awt.Color;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.ModelWithHead;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;

public class ChinaHat extends Helper242 {
   private static final float PI = 0.06981317F;
   private final Setting3 viewOnFriends;
   private final Setting7 customColor = new Setting7("Цвет", "Кастомный цвет шляпы").method2550(new Color(255, 101, 57, 255).getRGB());

   public ChinaHat() {
      super("ChinaHat", "ChinaHat", Helper269.RENDER);
      this.viewOnFriends = new Setting3("Показывать на друзьях", "View on Friends").method2201(true);
      this.setup(new Helper264[]{this.viewOnFriends, this.customColor});
   }

   public void method2233(MatrixStack var1, VertexConsumerProvider var2, PlayerEntity var3, ModelWithHead var4) {
      boolean var5 = Helper309.method3075(var3);
      boolean var6 = var3 == mc.player;
      if (var6 || var5 && this.viewOnFriends.method2200()) {
         if (var4 instanceof BipedEntityModel var7) {
            Box var8 = var3.getBoundingBox();
            double var9 = var8.maxX - var8.minX;
            byte var11 = 39;
            ItemStack var12 = var3.getInventory().getStack(var11);
            boolean var13 = !var12.isEmpty();
            float var14 = var13 ? 0.48F : 0.42F;
            var1.push();
            var7.head.rotate(var1);
            var1.translate(0.0F, -var14, 0.0F);
            var1.multiply(RotationAxis.NEGATIVE_Z.rotationDegrees(180.0F));
            var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90.0F));
            Matrix4f var15 = var1.peek().getPositionMatrix();
            int var16;
            int var17;
            if (var5) {
               var16 = new Color(0, 255, 0, 255).getRGB();
               var17 = new Color(0, 170, 0, 255).getRGB();
            } else {
               var16 = this.customColor.method2553();
               var17 = this.method2235(var16, 0.5F);
            }

            float var18 = 0.0F;
            float var19 = -0.01F;
            float var20 = 0.01F;
            float var21 = 0.01F;
            float var22 = (float)(var9 + var21);
            float var23 = (float)(var9 - var21);
            VertexConsumer var24 = var2.getBuffer(RenderLayer.getDebugQuads());
            long var25 = System.currentTimeMillis();

            for (int var27 = 0; var27 < 360; var27++) {
               float var28 = var27 * 0.06981317F;
               float var29 = (var27 + 1) * 0.06981317F;
               int var30 = var27 * 8;
               float var31 = (float)(MathHelper.sin(var28) * var9);
               float var32 = (float)(MathHelper.cos(var28) * var9);
               float var33 = (float)(MathHelper.sin(var29) * var9);
               float var34 = (float)(MathHelper.cos(var29) * var9);
               int var35 = this.method2237(3, var30, var16, var17, var25);
               this.method2234(var24, var15, var31, var18, var32, var35);
               this.method2234(var24, var15, var33, var18, var34, var35);
               this.method2234(var24, var15, 0.0F, 0.3F, 0.0F, var16);
               this.method2234(var24, var15, 0.0F, 0.3F, 0.0F, var16);
            }

            float var39 = MathHelper.sin(0.0F) * var22;
            float var40 = MathHelper.cos(0.0F) * var22;
            float var41 = MathHelper.sin(0.0F) * var23;
            float var42 = MathHelper.cos(0.0F) * var23;

            for (int var43 = 1; var43 <= 181; var43++) {
               float var45 = var43 * 0.06981317F;
               int var46 = (var43 - 1) * 8;
               float var47 = MathHelper.sin(var45) * var22;
               float var48 = MathHelper.cos(var45) * var22;
               float var36 = MathHelper.sin(var45) * var23;
               float var37 = MathHelper.cos(var45) * var23;
               int var38 = this.method2237(3, var46, var16, var17, var25);
               this.method2234(var24, var15, var39, var19, var40, var38);
               this.method2234(var24, var15, var39, var19 + var20, var40, var38);
               this.method2234(var24, var15, var47, var19 + var20, var48, var38);
               this.method2234(var24, var15, var47, var19, var48, var38);
               this.method2234(var24, var15, var41, var19 + var20, var42, var38);
               this.method2234(var24, var15, var36, var19 + var20, var37, var38);
               this.method2234(var24, var15, var47, var19 + var20, var48, var38);
               this.method2234(var24, var15, var39, var19 + var20, var40, var38);
               var39 = var47;
               var40 = var48;
               var41 = var36;
               var42 = var37;
            }

            var1.pop();
            if (var2 instanceof Immediate var44) {
               var44.draw();
            }
         }
      }
   }

   private void method2234(VertexConsumer var1, Matrix4f var2, float var3, float var4, float var5, int var6) {
      var1.vertex(var2, var3, var4, var5).color(this.method2238(var6), this.method2239(var6), this.method2240(var6), this.method2241(var6));
   }

   private int method2235(int var1, float var2) {
      int var3 = (int)((var1 >> 16 & 0xFF) * var2);
      int var4 = (int)((var1 >> 8 & 0xFF) * var2);
      int var5 = (int)((var1 & 0xFF) * var2);
      return 0xFF000000 | var3 << 16 | var4 << 8 | var5;
   }

   private int method2236(int var1, int var2, int var3, int var4) {
      float var5 = var2 % 360 / 360.0F;
      var5 = (float)((Math.sin(var5 * Math.PI * 2.0 * var1) + 1.0) / 2.0);
      return Helper133.method1142(var3, var4, var5);
   }

   private int method2237(int var1, int var2, int var3, int var4, long var5) {
      float var7 = (float)((var2 + var5 / 10L) % 360L);
      float var8 = var7 / 360.0F;
      var8 = (float)((Math.sin(var8 * Math.PI * 2.0 * var1) + 1.0) / 2.0);
      return Helper133.method1142(var3, var4, var8);
   }

   private int method2238(int var1) {
      return var1 >> 16 & 0xFF;
   }

   private int method2239(int var1) {
      return var1 >> 8 & 0xFF;
   }

   private int method2240(int var1) {
      return var1 & 0xFF;
   }

   private int method2241(int var1) {
      return var1 >> 24 & 0xFF;
   }

   public static ChinaHat method2242() {
      return Helper222.method1979(ChinaHat.class);
   }
}
