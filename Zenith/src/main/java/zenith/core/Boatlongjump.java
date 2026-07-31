package zenith;

import net.minecraft.entity.Entity;
import net.minecraft.entity.vehicle.BoatEntity;

@ModuleInfo(
   name = "BoatLongJump",
   category = Category.MOVEMENT,
   description = "LongJump bypass"
)
public final class Boatlongjump extends Module {
   public static final Boatlongjump I1lIIl1111lIIIl1II = new Boatlongjump();
   private boolean l11llll1ll1 = false;

   private Boatlongjump() {
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.getVehicle() == null) {
            Entity Entity = this.I11111lIIll11Il1();
            if (l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()) {
               if (l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.isPressed()
                  && Entity != null
                  && !this.l11llll1ll1
                  && l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()) {
                  float f = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
                  double d0 = l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().x + -Math.sin(Math.toRadians((double)f)) * 0.9F;
                  double d1 = l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().z + Math.cos(Math.toRadians((double)f)) * 0.9F;
                  l11I1I1ll1Illll1I1l1111l1II.player.setVelocity(d0, l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().y, d1);
                  this.l11llll1ll1 = true;
               }
            } else {
               this.l11llll1ll1 = false;
            }
         }
      }
   }

   private Entity I11111lIIll11Il1() {
      net.minecraft.util.math.Box Box = l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().expand(1.0);

      for (Entity Entity : l11I1I1ll1Illll1I1l1111l1II.world.getEntities()) {
         if (Entity instanceof BoatEntity BoatEntity
            && !BoatEntity.hasPassenger(l11I1I1ll1Illll1I1l1111l1II.player)
            && BoatEntity.getBoundingBox().intersects(Box)) {
            return BoatEntity;
         }
      }

      return null;
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.l11llll1ll1 = false;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }
}
