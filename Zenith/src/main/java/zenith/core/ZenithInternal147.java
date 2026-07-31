package zenith;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.packet.Packet;

@Deprecated
public class ZenithInternal147 implements ZenithInternal076 {
   private static final List<Packet<?>> llI1ll11II1l1 = new ArrayList<>();

   public static void EventImpl_13(Packet<?> Packet) {
      llI1ll11II1l1.add(Packet);
      l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendPacket(Packet);
   }

   public static void byteHolder_2(Packet<?> Packet) {
      l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendPacket(Packet);
   }

   public static List<Packet<?>> I1lI11I1lIIIllIIl1l1() {
      return llI1ll11II1l1;
   }

   public static void l1l1l11lIII11IIlIIlIllllll() {
      llI1ll11II1l1.clear();
   }
}
