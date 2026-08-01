package zenith;

import net.minecraft.util.math.MathHelper;

public final class ZenithInternal131 implements ZenithInternal076 {
   public static floatHolder_6 ll1II1l1lII11IlII1() {
      return new floatHolder_6(l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch());
   }

   public static floatHolder_6 ZenithInternal070(net.minecraft.util.math.Vec3d Vec3d) {
      return new floatHolder_6(
         (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(Vec3d.z, Vec3d.x)) - 90.0),
         (float)MathHelper.wrapDegrees(Math.toDegrees(-Math.atan2(Vec3d.y, Math.hypot(Vec3d.x, Vec3d.z))))
      );
   }

   public static floatHolder_6 longHolder_6(net.minecraft.util.math.Vec3d Vec3d) {
      return ZenithInternal070(Vec3d.subtract(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos()));
   }

   private ZenithInternal131() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
