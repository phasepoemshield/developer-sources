package l;

import java.util.Random;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

class Helper288 {
   final Particles this$0;
   Vec3d pos;
   Vec3d vel;
   int colorInt;
   boolean hitSurface;
   Random rnd;
   float viewFadeAlpha;
   private final long birthTime;
   private final int totalLife;

   Helper288(Particles var1, Vec3d var2, Vec3d var3, int var4, int var5) {
      this.this$0 = var1;
      this.hitSurface = false;
      this.rnd = new Random();
      this.viewFadeAlpha = 1.0F;
      this.pos = var2;
      this.vel = var3;
      this.colorInt = var5;
      this.birthTime = System.currentTimeMillis();
      this.totalLife = 2 * var4;
      this.viewFadeAlpha = 0.0F;
   }

   boolean method2822() {
      return System.currentTimeMillis() - this.birthTime >= this.totalLife;
   }

   float method2823() {
      long var1 = System.currentTimeMillis() - this.birthTime;
      float var3 = Math.min(1.0F, (float)var1 / this.totalLife);
      float var4;
      if (var3 <= 0.5F) {
         var4 = var3 * 2.0F;
      } else {
         var4 = 2.0F - var3 * 2.0F;
      }

      return var4 * this.viewFadeAlpha;
   }

   float method2824() {
      return this.this$0.scale.method2200() ? this.method2823() : 1.0F;
   }

   void method2825() {
      if (!this.method2822()) {
         float var1 = Helper146.INSTANCE.method1222();
         float var2 = var1 > 0.0F ? 1.0F / var1 : 0.016666668F;
         float var3 = var2 / 0.05F;
         float var4 = this.this$0.motionPower.method2082();
         float var5 = this.this$0.method2833();
         this.pos = this.pos.add(this.vel.multiply(var3 * var4, var3 * var4, var3 * var4));
         double var6 = Math.sin(Math.toRadians(var5));
         double var8 = -Math.cos(Math.toRadians(var5));
         double var10 = -Math.sin(Math.toRadians(var5 + 90.0F));
         double var12 = Math.cos(Math.toRadians(var5 + 90.0F));
         Vec3d var14 = new Vec3d(
            var6 * this.this$0.inclineZ.method2082() / 50.0 + var10 * this.this$0.inclineX.method2082() / 50.0,
            0.0,
            var8 * this.this$0.inclineZ.method2082() / 50.0 + var12 * this.this$0.inclineX.method2082() / 50.0
         );
         this.vel = this.vel.add(var14.x * var2 * var4, this.this$0.particleGravity.method2082() / 80.0F * var2 * var4, var14.z * var2 * var4);
         this.pos = this.pos.add(this.vel.multiply(var3, var3, var3));
         this.vel = this.vel.add(0.0, -2.0E-4, 0.0);
         if (this.this$0.collision.method2200()) {
            BlockPos var15 = BlockPos.ofFloored(this.pos);
            if (!Helper160.mc.world.getBlockState(var15).isAir()) {
               Vec3d var16 = new Vec3d(0.0, 1.0, 0.0);
               double var17 = this.vel.dotProduct(var16);
               Vec3d var19 = this.vel.subtract(var16.multiply(2.0 * var17));
               this.vel = var19.multiply(0.8);
            }
         }

         boolean var20 = this.this$0.method2835(this.pos);
         if (var20) {
            this.viewFadeAlpha += var2 * 2.0F;
            if (this.viewFadeAlpha > 1.0F) {
               this.viewFadeAlpha = 1.0F;
            }
         } else {
            this.viewFadeAlpha -= var2 * 1.0F;
            if (this.viewFadeAlpha < 0.0F) {
               this.viewFadeAlpha = 0.0F;
            }
         }
      }
   }
}
