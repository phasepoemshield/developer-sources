package l;

import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Vec3d;

class Helper253 extends HitResult {
   Helper253(Predictions var1, Vec3d var2) {
      super(var2);
   }

   @Override
   public Type getType() {
      return Type.ENTITY;
   }
}
