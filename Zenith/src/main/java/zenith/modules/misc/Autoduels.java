// Module: AutoDuels
// Category: misc
// Original class: Autoduels
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

@ModuleInfo(
   name = "AutoDuels",
   category = Category.MISC,
   description = "Кидает дуэль на RW"
)
public final class Autoduels extends Module {
   public static final Autoduels IlII1l11I11lIll11l1I1lII = new Autoduels();
   private final ModeSetting lI1III11lIII1IIllllIl = new ModeSetting("module.autoDuels.mode", "module.autoDuels.mode.desc");
   private final ModeOption lIll1lIll111111I1l111 = new ModeOption(
      this.lI1III11lIII1IIllllIl, "module.autoDuels.shield"
   );
   private final ModeOption Il1Il1llI = new ModeOption(
      this.lI1III11lIII1IIllllIl, "module.autoDuels.shipi"
   );
   private final ModeOption I1I1lIll1lIII1III1I1l11Ill1II = new ModeOption(
      this.lI1III11lIII1IIllllIl, "module.autoDuels.bow"
   );
   private final ModeOption I1I1I1l1lI = new ModeOption(
      this.lI1III11lIII1IIllllIl, "module.autoDuels.totem"
   );
   private final ModeOption I1ll1I1II11l1lIIlI1I1lIIl = new ModeOption(
      this.lI1III11lIII1IIllllIl, "module.autoDuels.noDebuff"
   );
   private final ModeOption lII1l1lI1lII11IlII = new ModeOption(
      this.lI1III11lIII1IIllllIl, "module.autoDuels.balls"
   );
   private final ModeOption lll1l1lllIII1ll1I11lI1I1 = new ModeOption(
         this.lI1III11lIII1IIllllIl, "module.autoDuels.classik"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption lIllIIIllIlII1ll1I1llI = new ModeOption(
      this.lI1III11lIII1IIllllIl, "module.autoDuels.cheats"
   );
   private final ModeOption I1lIlIIllIl1lI11I1III1I1l1 = new ModeOption(
      this.lI1III11lIII1IIllllIl, "module.autoDuels.nezer"
   );
   private final longHolder lIIII1I11lI11I11l1ll1Il = new longHolder();
   private final List<String> llI1l11l11l1l1l1111IIlIlI1 = new ArrayList<>();

   private Autoduels() {
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      ArrayList arraylist = new ArrayList();
      Collections.shuffle(arraylist);

      for (PlayerListEntry PlayerListEntry : l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.getPlayerList()) {
         arraylist.add(PlayerListEntry.getProfile().getName());
      }

      for (String s1 : arraylist) {
         if (this.lIIII1I11lI11I11l1ll1Il.HostnameVerifierImpl(750L)
            && !this.llI1l11l11l1l1l1111IIlIlI1.contains(s1)
            && !s1.equals(l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard())) {
            l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand("duel " + s1);
            this.llI1l11l11l1l1l1111IIlIlI1.add(s1);
            this.lIIII1I11lI11I11l1ll1Il.reset();
         }
      }

      if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof GenericContainerScreenHandler) {
         String s = l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle().getString();
         if (s.contains("Выбор набора")) {
            l11I1I1ll1Illll1I1l1111l1II.interactionManager
               .clickSlot(
                  l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId,
                  this.lI1III11lIII1IIllllIl.ll1lIIIIlII().indexOf(this.lI1III11lIII1IIllllIl.lIll1llIl11()),
                  0,
                  SlotActionType.PICKUP,
                  l11I1I1ll1Illll1I1l1111l1II.player
               );
         } else if (s.contains("Настройка поединка")) {
            l11I1I1ll1Illll1I1l1111l1II.interactionManager
               .clickSlot(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.syncId, 0, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
         }
      }
   }

   @EventTarget
   public void EventImpl_21(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8()) {
         if (ii1l11il1i1i.Swinganimation() instanceof GameMessageS2CPacket GameMessageS2CPacket) {
            String s = GameMessageS2CPacket.content().getString();
            if (s.contains("Принял") && !s.contains("не принял")) {
               this.llI1l11l11l1l1l1111IIlIlI1.clear();
               this.lI1Il11I1l1III11IIlI1lI1II11I();
            }

            if (s.contains("дуэль") && (s.contains("найдена") || s.contains("началась") || s.contains("старт"))) {
               this.llI1l11l11l1l1l1111IIlIlI1.clear();
               this.lI1Il11I1l1III11IIlI1lI1II11I();
            }

            if (s.contains("победил") || s.contains("проиграл") || s.contains("ничья")) {
               this.llI1l11l11l1l1l1111IIlIlI1.clear();
               this.lI1Il11I1l1III11IIlI1lI1II11I();
            }

            if (s.contains("Баланс") || s.contains("отключил запросы")) {
               ii1l11il1i1i.ZenithInternal069();
            }
         }
      }
   }

   @Override
   public void onEnable() {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         this.StringHolder_11(false);
      } else {
         this.lIIII1I11lI11I11l1ll1Il.reset();
         super.l11l1lII();
      }
   }
}
