package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Helper322 {
   private static final Helper322 INSTANCE = new Helper322();
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   private static final double MAX_RENDER_DISTANCE = 64.0;
   private static final double MAX_RENDER_DISTANCE_SQ = 4096.0;
   private int lastFrustumCheck = 0;

   private Helper322() {
   }

   public static Helper322 method3199() {
      return INSTANCE;
   }

   public boolean method3200(Entity var1) {
      if (var1 != null && mc.player != null) {
         double var2 = mc.player.squaredDistanceTo(var1);
         return var2 > 4096.0 ? false : this.method3201(var1.getPos());
      } else {
         return false;
      }
   }

   private boolean method3201(Vec3d var1) {
      if (mc.player == null) {
         return false;
      } else {
         Vec3d var2 = mc.player.getPos().add(0.0, mc.player.getEyeHeight(mc.player.getPose()), 0.0);
         Vec3d var3 = var1.subtract(var2).normalize();
         Vec3d var4 = mc.player.getRotationVec(1.0F);
         double var5 = var3.dotProduct(var4);
         return var5 > -0.2;
      }
   }

   public int method3202(Entity var1) {
      if (var1 != null && mc.player != null) {
         double var2 = mc.player.distanceTo(var1);
         if (var2 < 16.0) {
            return 0;
         } else {
            return var2 < 32.0 ? 1 : 2;
         }
      } else {
         return 2;
      }
   }

   public boolean method3203(Entity var1) {
      return var1 != null && mc.player != null ? mc.player.distanceTo(var1) < 32.0 : false;
   }

   public boolean method3204(Entity var1) {
      return var1 != null && mc.player != null ? mc.player.distanceTo(var1) < 24.0 : false;
   }
}
