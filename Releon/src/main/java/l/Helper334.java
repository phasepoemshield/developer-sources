package l;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Helper334 {
   public static Helper334 DEFAULT = new Helper334(new Linear(), true, true, false);
   public static boolean moveCorrection;
   public static boolean freeCorrection;
   private final Helper353 angleSmooth;
   private final int resetThreshold = 1;
   private final boolean changeLook;

   public Helper334(boolean var1, boolean var2) {
      this(new Linear(), var1, var2, false);
   }

   public Helper334(boolean var1) {
      this(new Linear(), var1, true, false);
   }

   public Helper334(Helper353 var1, boolean var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public Helper334(Helper353 var1, boolean var2, boolean var3, boolean var4) {
      this.angleSmooth = var1;
      moveCorrection = var2;
      freeCorrection = var3;
      this.changeLook = var4;
   }

   public Helper352 method3321(Helper336 var1, Vec3d var2, Entity var3, int var4) {
      Helper352 var5 = new Helper352(var1, var2, var3, this.angleSmooth, var4, 1.0F, moveCorrection, freeCorrection);
      var5.method3540(this.changeLook);
      return var5;
   }

   public Helper352 method3322(Helper336 var1, Vec3d var2, Entity var3, boolean var4, boolean var5) {
      Helper352 var6 = new Helper352(var1, var2, var3, this.angleSmooth, 1, 1.0F, var4, var5);
      var6.method3540(this.changeLook);
      return var6;
   }
}
