// Module: BoatHighJump
// Category: movement
// Original class: Boathighjump
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

import net.minecraft.entity.Entity;
import net.minecraft.entity.vehicle.BoatEntity;

@ModuleInfo(
   name = "BoatHighJump",
   category = Category.MOVEMENT,
   description = "HighJump bypass"
)
public final class Boathighjump extends Module {
   public static final Boathighjump Il1I11Il11lII11II111IllI = new Boathighjump();
   private boolean l11llll1ll1 = false;

   private Boathighjump() {
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.getVehicle() == null) {
            Entity Entity = this.I11111lIIll11Il1();
            if (l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()) {
               if (l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.isPressed() && Entity != null && !this.l11llll1ll1) {
                  l11I1I1ll1Illll1I1l1111l1II.player
                     .setVelocity(
                        l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().x,
                        0.82,
                        l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().z
                     );
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
