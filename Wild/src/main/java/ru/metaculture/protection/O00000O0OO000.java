package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
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
import net.minecraft.util.math.Vec3d;

public final class O00000O0OO000 extends SpriteBillboardParticle {
   public static SimpleParticleType O00000000 = O00000O0OO000O.O0000000000;
   private static int O000000000;
   private static int O0000000000;
   private static final float O00000000000 = 0.035F;
   private static final float O000000000000 = 0.0238F;
   private static final float O0000000000000 = (float)Math.sin(0.035F);
   private static final float O000000000000O = (float)Math.cos(0.035F);
   private static final float O00000000000O = (float)Math.sin(0.0238F);
   private static final float O00000000000O0 = (float)Math.cos(0.0238F);
   private static ClientWorld O00000000000OO;
   private static long O0000000000O = Long.MIN_VALUE;
   private static double O0000000000O0;
   private static double O0000000000O00;
   private static double O0000000000O0O;
   private static double O0000000000OO;
   private static float O0000000000OO0;
   private static boolean O0000000000OOO;
   private final int O000000000O;
   private final float O000000000O0;
   private final float O000000000O00;
   private final float O000000000O000;
   private final float O000000000O00O;
   private final int O000000000O0O;
   private final int O000000000O0O0;
   private final int O000000000O0OO;
   private float O000000000OO;
   private float O000000000OO0;
   private float O000000000OO00;
   private float O000000000OO0O;
   private float O000000000OOO;
   private float O000000000OOO0;
   private float O000000000OOOO;
   private float O00000000O;
   private float O00000000O0;
   private boolean O00000000O00 = true;

   public O00000O0OO000(ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
      super(clientWorld, d, e, f, 0.0, 0.0, 0.0);
      float var14 = O000000000((float)(d * 0.071 + e * 0.113 + f * 0.197));
      float var15 = O000000000(var14 * 37.13F + (float)e * 0.021F);
      float var16 = O000000000(var15 * 51.73F + (float)f * 0.017F);
      float var17 = var14 * (float) (Math.PI * 2);
      float var18 = var15 * (float) (Math.PI * 2);
      this.O000000000O00 = var15;
      this.O000000000O0 = 0.092F + var16 * 0.244F + O000000000(0.74F, 1.0F, var15) * 0.306F;
      float var19 = (1.0F + var14 * 60.0F) * 0.035F;
      float var20 = var19 * 0.68F;
      this.O000000000OO = (float)Math.sin(var19 + var17);
      this.O000000000OO0 = (float)Math.cos(var19 + var17);
      this.O000000000OO00 = (float)Math.sin(var20 + var18);
      this.O000000000OO0O = (float)Math.cos(var20 + var18);
      this.O000000000OOO = (float)Math.sin(var19 + var18);
      this.O000000000OOO0 = (float)Math.cos(var19 + var18);
      float var21 = 0.085F + var14 * 0.075F;
      this.O000000000O000 = (float)Math.sin(var21);
      this.O000000000O00O = (float)Math.cos(var21);
      this.O000000000OOOO = (float)Math.sin(var17);
      this.O00000000O = (float)Math.cos(var17);
      this.O000000000000();
      int var22 = var14 < 0.58F ? Stardust.O0000000000OOO() : Stardust.O000000000O();
      float var23 = 0.36F + var15 * 0.36F;
      float var24 = O000000000(0.84F, 1.0F, var16);
      this.O000000000O0O = O00000000(O00000000(184.0F + var24 * 48.0F, O00000000(var22, 16), var23) + var14 * 18.0F);
      this.O000000000O0O0 = O00000000(O00000000(218.0F + var24 * 30.0F, O00000000(var22, 8), var23) + var15 * 14.0F);
      this.O000000000O0OO = O00000000(O00000000(246.0F, O00000000(var22, 0), var23) + var16 * 10.0F);
      this.O000000000O = O0000000000;
      this.maxAge = 142 + (int)(var15 * 138.0F);
      this.collidesWithWorld = false;
      this.gravityStrength = 0.0F;
      this.velocityMultiplier = 0.99F;
      this.setVelocity(g, h, i);
      this.scale = this.O000000000O0;
      O000000000++;
   }

   public ParticleTextureSheet getType() {
      return ParticleTextureSheet.CUSTOM;
   }

   public void tick() {
      this.lastX = this.x;
      this.lastY = this.y;
      this.lastZ = this.z;
      if (Stardust.O0000000000O0() && this.O000000000O == O0000000000 && this.age++ < this.maxAge) {
         if (O00000000(this.world)) {
            double var1 = this.x - O0000000000O0;
            double var3 = this.y - O0000000000O00;
            double var5 = this.z - O0000000000O0O;
            if (var1 * var1 + var5 * var5 > O0000000000OO || var3 < -2.4 || var3 > O0000000000OO0) {
               this.markDead();
               return;
            }
         }

         this.x = this.x + (this.velocityX + this.O000000000OO * 0.0028);
         this.y = this.y + (this.velocityY + this.O000000000OO00 * 0.0022);
         this.z = this.z + (this.velocityZ + this.O000000000OOO0 * 0.0028);
         this.velocityX *= 0.973;
         this.velocityY *= 0.97;
         this.velocityZ *= 0.973;
         this.O0000000000();
         this.O00000000000();
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
         float var6 = O000000000(0.0F, 0.18F, var5) * (1.0F - O000000000(0.76F, 1.0F, var5));
         float var7 = this.O000000000OOOO + (this.O00000000O0 - this.O000000000OOOO) * tickProgress;
         float var8 = 0.76F + 0.24F * var7;
         var6 *= var8 * Stardust.O0000000000O00() * (0.68F + this.O000000000O00 * 0.48F);
         if (!(var6 <= 0.003F)) {
            O00000O0OO00O.O00000000(camera);
            double var9 = this.lastX + (this.x - this.lastX) * tickProgress;
            double var11 = this.lastY + (this.y - this.lastY) * tickProgress;
            double var13 = this.lastZ + (this.z - this.lastZ) * tickProgress;
            float var15 = (float)(var9 - O00000O0OO00O.O00000000());
            float var16 = (float)(var11 - O00000O0OO00O.O000000000());
            float var17 = (float)(var13 - O00000O0OO00O.O0000000000());
            float var18 = O00000O0OO00O.O00000000000();
            float var19 = O00000O0OO00O.O000000000000();
            float var20 = O00000O0OO00O.O0000000000000();
            float var21 = O00000O0OO00O.O000000000000O();
            float var22 = O00000O0OO00O.O00000000000O();
            float var23 = O00000O0OO00O.O00000000000O0();
            float var24 = (float)Math.sqrt(var15 * var15 + var16 * var16 + var17 * var17);
            float var25 = 1.0F - O000000000(2.8F, 24.0F, var24);
            float var26 = this.O000000000O0 * (0.9F + var8 * 0.24F + var25 * 0.88F);
            float var27 = var26 * 0.5F;
            int var28 = O00000000(var6 * 255.0F);
            VertexConsumer var29 = vertexConsumers.getBuffer(O00000O0OO00O0.O000000000());
            float var30 = var18 * var27;
            float var31 = var19 * var27;
            float var32 = var20 * var27;
            float var33 = var21 * var27;
            float var34 = var22 * var27;
            float var35 = var23 * var27;
            this.O00000000(var29, var15 - var30 - var33, var16 - var31 - var34, var17 - var32 - var35, 0.0F, 1.0F, var28);
            this.O00000000(var29, var15 + var30 - var33, var16 + var31 - var34, var17 + var32 - var35, 1.0F, 1.0F, var28);
            this.O00000000(var29, var15 + var30 + var33, var16 + var31 + var34, var17 + var32 + var35, 1.0F, 0.0F, var28);
            this.O00000000(var29, var15 - var30 + var33, var16 - var31 + var34, var17 - var32 + var35, 0.0F, 0.0F, var28);
         }
      }
   }

   private static boolean O00000000(ClientWorld clientWorld) {
      if (clientWorld == null) {
         O0000000000OOO = false;
         return false;
      } else {
         long var1 = clientWorld.getTime();
         if (clientWorld == O00000000000OO && var1 == O0000000000O) {
            return O0000000000OOO;
         } else {
            O00000000000OO = clientWorld;
            O0000000000O = var1;
            MinecraftClient var3 = MinecraftClient.getInstance();
            if (var3 != null && var3.gameRenderer != null && var3.gameRenderer.getCamera() != null) {
               Vec3d var4 = var3.gameRenderer.getCamera().getPos();
               double var5 = Stardust.O0000000000OO() + 5.0F;
               O0000000000O0 = var4.x;
               O0000000000O00 = var4.y;
               O0000000000O0O = var4.z;
               O0000000000OO = var5 * var5;
               O0000000000OO0 = Stardust.O0000000000OO0();
               O0000000000OOO = true;
               return true;
            } else {
               O0000000000OOO = false;
               return false;
            }
         }
      }
   }

   private void O0000000000() {
      float var1 = this.O000000000OO * O000000000000O + this.O000000000OO0 * O0000000000000;
      this.O000000000OO0 = this.O000000000OO0 * O000000000000O - this.O000000000OO * O0000000000000;
      this.O000000000OO = var1;
      var1 = this.O000000000OO00 * O00000000000O0 + this.O000000000OO0O * O00000000000O;
      this.O000000000OO0O = this.O000000000OO0O * O00000000000O0 - this.O000000000OO00 * O00000000000O;
      this.O000000000OO00 = var1;
      var1 = this.O000000000OOO * O000000000000O + this.O000000000OOO0 * O0000000000000;
      this.O000000000OOO0 = this.O000000000OOO0 * O000000000000O - this.O000000000OOO * O0000000000000;
      this.O000000000OOO = var1;
   }

   private void O00000000000() {
      float var1 = this.O00000000O0;
      float var2 = this.O00000000O * this.O000000000O00O - this.O000000000OOOO * this.O000000000O000;
      this.O000000000OOOO = var1;
      this.O00000000O = var2;
      this.O000000000000();
   }

   private void O000000000000() {
      this.O00000000O0 = this.O000000000OOOO * this.O000000000O00O + this.O00000000O * this.O000000000O000;
   }

   public void markDead() {
      if (this.O00000000O00) {
         this.O00000000O00 = false;
         if (this.O000000000O == O0000000000 && O000000000 > 0) {
            O000000000--;
         }
      }

      super.markDead();
   }

   private void O00000000(VertexConsumer vertexConsumer, float f, float g, float h, float i, float j, int k) {
      vertexConsumer.vertex(f, g, h).texture(i, j).color(this.O000000000O0O, this.O000000000O0O0, this.O000000000O0OO, k).normal(0.0F, 1.0F, 0.0F);
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

   public static final class W192 implements ParticleFactory<SimpleParticleType> {
      @Override
      public Particle createParticle(SimpleParticleType simpleParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
         return new O00000O0OO000(clientWorld, d, e, f, g, h, i);
      }
   }
}
