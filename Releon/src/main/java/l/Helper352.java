package l;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Helper352 implements Helper160 {
   private final Helper336 angle;
   private final Vec3d vec3d;
   private final Entity entity;
   private final Helper353 angleSmooth;
   private final int ticksUntilReset;
   private final float resetThreshold;
   public final boolean moveCorrection;
   public final boolean freeCorrection;
   public boolean changeLook = false;

   public Helper336 method3539(Helper336 var1, boolean var2) {
      return var2
         ? this.angleSmooth.method3552(var1, Helper349.method3467(mc.player.getRotationClient()))
         : this.angleSmooth.method3146(var1, this.angle, this.vec3d, this.entity);
   }

   public void method3540(boolean var1) {
      this.changeLook = var1;
   }

   public Helper336 method3541() {
      return this.angle;
   }

   public Vec3d method3542() {
      return this.vec3d;
   }

   public Entity method3543() {
      return this.entity;
   }

   public Helper353 method3544() {
      return this.angleSmooth;
   }

   public int method3545() {
      return this.ticksUntilReset;
   }

   public float method3546() {
      return this.resetThreshold;
   }

   public boolean method3547() {
      return this.moveCorrection;
   }

   public boolean method3548() {
      return this.changeLook;
   }

   public Helper352(Helper336 var1, Vec3d var2, Entity var3, Helper353 var4, int var5, float var6, boolean var7, boolean var8) {
      this.angle = var1;
      this.vec3d = var2;
      this.entity = var3;
      this.angleSmooth = var4;
      this.ticksUntilReset = var5;
      this.resetThreshold = var6;
      this.moveCorrection = var7;
      this.freeCorrection = var8;
   }

   public boolean method3549() {
      return this.freeCorrection;
   }
}
