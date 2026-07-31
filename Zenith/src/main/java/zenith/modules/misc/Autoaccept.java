// Module: AutoAccept
// Category: misc
// Original class: Autoaccept
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.util.Locale;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

@ModuleInfo(
   name = "AutoAccept",
   category = Category.MISC,
   description = "Автоматически принимает телепортацию"
)
public final class Autoaccept extends Module {
   public static final Autoaccept l1l1ll11lIl11I11I11I1 = new Autoaccept();
   private final BooleanSetting l1I1ll111Illl11lIlll = new BooleanSetting(
      "module.autoAccept.onlyFriend", "module.autoAccept.onlyFriend.desc", false
   );

   private Autoaccept() {
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (ii1l11il1i1i.longHolder_8()) {
            if (ii1l11il1i1i.Swinganimation() instanceof GameMessageS2CPacket GameMessageS2CPacket) {
               String s1 = GameMessageS2CPacket.content().getString().toLowerCase(Locale.ROOT);
               if (s1.contains("телепортироваться") || s1.contains("has requested teleport") || s1.contains("просит к вам телепортироваться")) {
                  if (this.l1I1ll111Illl11lIlll.Spider()) {
                     boolean flag = false;

                     for (String s : ZenithClient.getInstance().StringHolder_26().getItems()) {
                        if (s1.contains(s.toLowerCase(Locale.ROOT))) {
                           flag = true;
                           break;
                        }
                     }

                     if (!flag) {
                        return;
                     }
                  }

                  l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand("tpaccept");
               }
            }
         }
      }
   }
}
