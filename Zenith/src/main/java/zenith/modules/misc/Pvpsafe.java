// Module: PvpSafe
// Category: misc
// Original class: Pvpsafe
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import net.minecraft.network.packet.c2s.play.CommandExecutionC2SPacket;

@ModuleInfo(
   name = "PvpSafe",
   description = "Не дает ливнуть в кт с серва",
   category = Category.MISC
)
public final class Pvpsafe extends Module {
   public static final Pvpsafe II1111lI1ll1lIll1lIlI1lII1 = new Pvpsafe();

   @EventTarget
   public void byteHolder_2(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.Shaderfog()
         && ZenithClient.getInstance().SupplierHolder().I1l1Illl1l11()
         && ii1l11il1i1i.Swinganimation() instanceof CommandExecutionC2SPacket CommandExecutionC2SPacketx) {
         CommandExecutionC2SPacket CommandExecutionC2SPacketx = CommandExecutionC2SPacketx;

         try {
            s1 = CommandExecutionC2SPacketx.command();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         String s = s1;
         if (s.contains("hub")) {
            ii1l11il1i1i.EventBus(true);
         }
      }
   }
}
