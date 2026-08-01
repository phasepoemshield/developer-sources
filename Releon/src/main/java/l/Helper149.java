package l;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Helper149 {
   public Helper149() {
   }

   public static Vec3d method1259(Entity var0) {
      float var1 = Helper160.mc.getRenderTickCounter().getTickDelta(true);
      return new Vec3d(
         var0.prevX + (var0.getX() - var0.prevX) * var1, var0.prevY + (var0.getY() - var0.prevY) * var1, var0.prevZ + (var0.getZ() - var0.prevZ) * var1
      );
   }
}
