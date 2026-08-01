// Module: Criticals
// Category: combat
// Original class: Criticals
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.combat;

import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;

@ModuleInfo(
   name = "Criticals",
   category = Category.COMBAT,
   description = ""
)
public final class Criticals extends Module {
   public static final Criticals ll1llII11IIlIl1I1l1I1l1l = new Criticals();

   private Criticals() {
   }

   @EventTarget
   public void EventImpl_24(PacketHolder ii1l11il1i1i) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && !l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()
         && l11I1I1ll1Illll1I1l1111l1II.player.fallDistance == 0.0F
         && ii1l11il1i1i.Swinganimation() instanceof PlayerInteractEntityC2SPacket PlayerInteractEntityC2SPacket
         && PlayerInteractEntityC2SPacket.isPlayerSneaking()) {
         ZenithInternal066.StringHolder_8(
            (double)(-(l11I1I1ll1Illll1I1l1111l1II.player.fallDistance = (float)doubleHolder_3.EventImpl_21(1.0E-5F, 1.0E-4F))),
            ZenithClient.getInstance()
               .ZenithInternal057()
               .ll1ll1l11l1lllIIIIl1()
               .StringHolder_8(
                  new floatHolder_9((float)doubleHolder_3.EventImpl_21(-0.001F, 0.001F), (float)doubleHolder_3.EventImpl_21(-0.001F, 0.001F))
               )
         );
      }
   }

   public boolean l111l1IllIlI1l1() {
      return !l11I1I1ll1Illll1I1l1111l1II.player.isOnGround();
   }
}
