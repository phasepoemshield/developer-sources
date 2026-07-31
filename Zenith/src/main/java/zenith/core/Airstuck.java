package zenith;

import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

@ModuleInfo(
   name = "AirStuck",
   description = "",
   category = Category.MOVEMENT
)
public final class Airstuck extends Module {
   public static final Airstuck lIl1lIIIll11I1l111IIl1I1I = new Airstuck();

   private Airstuck() {
   }

   @EventTarget
   public void StringHolder_8(Vec3dHolder_2 ll1lii1ii1l11ii11lil111lili11) {
      ll1lii1ii1l11ii11lil111lili11.StringHolder_8(net.minecraft.util.math.Vec3d.ZERO);
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.Swinganimation() instanceof PlayerMoveC2SPacket) {
         ii1l11il1i1i.EventBus(true);
      }
   }
}
