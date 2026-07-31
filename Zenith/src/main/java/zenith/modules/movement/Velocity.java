// Module: Velocity
// Category: movement
// Original class: Velocity
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;

@ModuleInfo(
   name = "Velocity",
   category = Category.MOVEMENT,
   description = ""
)
public final class Velocity extends Module {
   public static final Velocity l1I1111Il1lllI1111lIIl = new Velocity();

   private Velocity() {
   }

   @EventTarget
   public void StringHolder_4(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.Swinganimation() instanceof EntityVelocityUpdateS2CPacket EntityVelocityUpdateS2CPacket
         && EntityVelocityUpdateS2CPacket.getEntityId() == l11I1I1ll1Illll1I1l1111l1II.player.getId()) {
         l11I1I1ll1Illll1I1l1111l1II.player.setVelocityClient(EntityVelocityUpdateS2CPacket.getVelocityX(), EntityVelocityUpdateS2CPacket.getVelocityY() / 2.0, EntityVelocityUpdateS2CPacket.getVelocityZ());
      }
   }
}
