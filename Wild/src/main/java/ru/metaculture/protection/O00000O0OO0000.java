package ru.metaculture.protection;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;

public final class O00000O0OO0000 extends SpriteBillboardParticle {
   public static SimpleParticleType O00000000 = O00000O0OO000O.O00000000000;
   private static int O000000000;
   private static int O0000000000;
   private final int O00000000000;
   private final float O000000000000;
   private final float O0000000000000;
   private final float O000000000000O;
   private final float O00000000000O;
   private final float O00000000000O0;
   private final float O00000000000OO;
   private final float O0000000000O;
   private final int O0000000000O0;
   private final int O0000000000O00;
   private final int O0000000000O0O;
   private float O0000000000OO;
   private float O0000000000OO0;
   private float O0000000000OOO;
   private boolean O000000000O = true;

   public O00000O0OO0000(ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
      super(clientWorld, d, e, f, 0.0, 0.0, 0.0);
      float var14 = O000000000((float)(d * 0.047 + e * 0.131 + f * 0.089));
      float var15 = O000000000(var14 * 43.19F + (float)g * 7.71F);
      float var16 = O000000000((float)g, (float)h, (float)i);
      if (var16 <= 0.0F) {
         g = 0.028;
         h = -0.07;
         i = 0.018;
         var16 = O000000000((float)g, (float)h, (float)i);
      }

      this.O000000000000 = 0.036F + var14 * 0.026F;
      this.O0000000000000 = 3.4F + var15 * 3.2F;
      this.O000000000000O = (float)g * var16;
      this.O00000000000O = (float)h * var16;
      this.O00000000000O0 = (float)i * var16;
      float var17 = 0.2F + var14 * 0.18F;
      this.O00000000000OO = (float)Math.sin(var17);
      this.O0000000000O = (float)Math.cos(var17);
      this.O0000000000OO = 0.0F;
      this.O0000000000OO0 = 1.0F;
      this.O00000000000();
      int var18 = var14 < 0.5F ? Stardust.O0000000000OOO() : Stardust.O000000000O();
      this.O0000000000O0 = O00000000(O00000000(214.0F, O00000000(var18, 16), 0.44F + var14 * 0.28F) + 18.0F);
      this.O0000000000O00 = O00000000(O00000000(236.0F, O00000000(var18, 8), 0.38F + var15 * 0.3F) + 12.0F);
      this.O0000000000O0O = O00000000(O00000000(255.0F, O00000000(var18, 0), 0.32F + var15 * 0.24F));
      this.O00000000000 = O0000000000;
      this.maxAge = 34 + (int)(var15 * 28.0F);
      this.collidesWithWorld = false;
      this.gravityStrength = 0.0F;
      this.velocityMultiplier = 0.986F;
      this.setVelocity(g, h, i);
      O000000000++;
   }

   public ParticleTextureSheet getType() {
      return ParticleTextureSheet.CUSTOM;
   }

   public void tick() {
      this.lastX = this.x;
      this.lastY = this.y;
      this.lastZ = this.z;
      if (Stardust.O0000000000O0() && this.O00000000000 == O0000000000 && this.age++ < this.maxAge) {
         this.x = this.x + this.velocityX;
         this.y = this.y + this.velocityY;
         this.z = this.z + this.velocityZ;
         this.velocityX *= 0.985;
         this.velocityY *= 0.985;
         this.velocityZ *= 0.985;
         this.O0000000000();
      } else {
         this.markDead();
      }
   }

   public void render(VertexConsumer vertexConsumer, Camera camera, float tickProgress) {
   }

   public void renderCustom(MatrixStack matrices, VertexConsumerProvider vertexConsumers, Camera camera, float tickProgress) {
      if (!Stardust.O0000000000O0()) {
         this.markDead();
      } else {
         float var5 = (this.age + tickProgress) / this.maxAge;
         float var6 = O0000000000(0.0F, 0.12F, var5) * (1.0F - O0000000000(0.7F, 1.0F, var5)) * Stardust.O0000000000O00() * 0.92F;
         if (!(var6 <= 0.003F)) {
            O00000O0OO00O.O00000000(camera);
            double var7 = this.lastX + (this.x - this.lastX) * tickProgress;
            double var9 = this.lastY + (this.y - this.lastY) * tickProgress;
            double var11 = this.lastZ + (this.z - this.lastZ) * tickProgress;
            float var13 = (float)(var7 - O00000O0OO00O.O00000000());
            float var14 = (float)(var9 - O00000O0OO00O.O000000000());
            float var15 = (float)(var11 - O00000O0OO00O.O0000000000());
            float var16 = O00000O0OO00O.O00000000000();
            float var17 = O00000O0OO00O.O000000000000();
            float var18 = O00000O0OO00O.O0000000000000();
            float var19 = O00000O0OO00O.O000000000000O();
            float var20 = O00000O0OO00O.O00000000000O();
            float var21 = O00000O0OO00O.O00000000000O0();
            float var22 = this.O000000000000O;
            float var23 = this.O00000000000O;
            float var24 = this.O00000000000O0;
            float var25 = var22 * var16 + var23 * var17 + var24 * var18;
            float var26 = var22 * var19 + var23 * var20 + var24 * var21;
            float var27 = O000000000(var25, var26, 0.0F);
            if (var27 <= 0.0F) {
               var25 = 1.0F;
               var26 = 0.0F;
               var27 = 1.0F;
            }

            var25 *= var27;
            var26 *= var27;
            float var28 = var16 * var25 + var19 * var26;
            float var29 = var17 * var25 + var20 * var26;
            float var30 = var18 * var25 + var21 * var26;
            float var31 = var16 * -var26 + var19 * var25;
            float var32 = var17 * -var26 + var20 * var25;
            float var33 = var18 * -var26 + var21 * var25;
            float var34 = this.O0000000000OO + (this.O0000000000OOO - this.O0000000000OO) * tickProgress;
            float var35 = 0.84F + 0.16F * var34;
            float var36 = this.O000000000000 * var35;
            float var37 = this.O000000000000 * 0.26F;
            float var38 = this.O0000000000000 * (0.86F + var35 * 0.24F);
            float var39 = var28 * var36;
            float var40 = var29 * var36;
            float var41 = var30 * var36;
            float var42 = var28 * var38;
            float var43 = var29 * var38;
            float var44 = var30 * var38;
            float var45 = var31 * var36;
            float var46 = var32 * var36;
            float var47 = var33 * var36;
            float var48 = var31 * var37;
            float var49 = var32 * var37;
            float var50 = var33 * var37;
            int var51 = O00000000(var6 * 255.0F);
            VertexConsumer var52 = vertexConsumers.getBuffer(O00000O0OO00O0.O000000000());
            this.O00000000(var52, var13 - var42 - var48, var14 - var43 - var49, var15 - var44 - var50, 0.0F, 1.0F, var51);
            this.O00000000(var52, var13 + var39 - var45, var14 + var40 - var46, var15 + var41 - var47, 1.0F, 0.0F, var51);
            this.O00000000(var52, var13 + var39 + var45, var14 + var40 + var46, var15 + var41 + var47, 1.0F, 0.0F, var51);
            this.O00000000(var52, var13 - var42 + var48, var14 - var43 + var49, var15 - var44 + var50, 0.0F, 1.0F, var51);
         }
      }
   }

   private void O0000000000() {
      float var1 = this.O0000000000OOO;
      float var2 = this.O0000000000OO0 * this.O0000000000O - this.O0000000000OO * this.O00000000000OO;
      this.O0000000000OO = var1;
      this.O0000000000OO0 = var2;
      this.O00000000000();
   }

   private void O00000000000() {
      this.O0000000000OOO = this.O0000000000OO * this.O0000000000O + this.O0000000000OO0 * this.O00000000000OO;
   }

   public void markDead() {
      if (this.O000000000O) {
         this.O000000000O = false;
         if (this.O00000000000 == O0000000000 && O000000000 > 0) {
            O000000000--;
         }
      }

      super.markDead();
   }

   private void O00000000(VertexConsumer vertexConsumer, float f, float g, float h, float i, float j, int k) {
      vertexConsumer.vertex(f, g, h).texture(i, j).color(this.O0000000000O0, this.O0000000000O00, this.O0000000000O0O, k).normal(1.0F, 0.0F, 0.0F);
   }

   public static int O00000000() {
      return O000000000;
   }

   public static void O000000000() {
      O000000000 = 0;
      O0000000000++;
   }

   private static int O00000000(float f) {
      if (f <= 0.0F) {
         return 0;
      } else {
         return f >= 255.0F ? 255 : (int)f;
      }
   }

   private static float O00000000(float f, float g, float h) {
      return f + (g - f) * h;
   }

   private static int O00000000(int i, int j) {
      return i >>> j & 0xFF;
   }

   private static float O000000000(float f, float g, float h) {
      float var3 = f * f + g * g + h * h;
      return var3 <= 1.0E-8F ? 0.0F : (float)(1.0 / Math.sqrt(var3));
   }

   private static float O0000000000(float f, float g, float h) {
      float var3 = (h - f) / (g - f);
      if (var3 <= 0.0F) {
         return 0.0F;
      } else {
         return var3 >= 1.0F ? 1.0F : var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private static float O000000000(float f) {
      return O0000000000((float)Math.sin(f * 12.9898F + 78.233F) * 43758.547F);
   }

   private static float O0000000000(float f) {
      return f - (float)Math.floor(f);
   }

   public static final class W193 implements ParticleFactory<SimpleParticleType> {
      @Override
      public Particle createParticle(SimpleParticleType simpleParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
         return new O00000O0OO0000(clientWorld, d, e, f, g, h, i);
      }
   }
}
