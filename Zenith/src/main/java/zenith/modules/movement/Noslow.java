// Module: NoSlow
// Category: movement
// Original class: Noslow
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

import net.minecraft.util.Hand;

@ModuleInfo(
   name = "NoSlow",
   category = Category.MOVEMENT,
   description = "Убирает замедление во время еды"
)
public final class Noslow extends Module {
   public static final Noslow l1l1lII1Il1ll = new Noslow();
   private final ModeSetting l1l1I1lII1II = new ModeSetting("module.noSlow.mode", "module.noSlow.mode.desc");
   private final ModeOption lIll1llIlIll11 = new ModeOption(
      this.l1l1I1lII1II, "module.noSlow.mode.grimNew"
   );
   private final ModeOption l111IlIIlll1IlIIIIIII1lllI1 = new ModeOption(
         this.l1l1I1lII1II, "module.noSlow.mode.grimOld"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final BooleanSetting I1II1lI11l1111IIl = new BooleanSetting(
      "module.noSlow.sprint", "module.noSlow.sprint.desc", true, this.l111IlIIlll1IlIIIIIII1lllI1::isSelected
   );

   private Noslow() {
   }

   @EventTarget
   public void StringHolder_8(ZenithInternal078 l1i1liliili) {
      if (this.lIll1llIlIll11.isSelected() && l11I1I1ll1Illll1I1l1111l1II.player.getItemUseTime() % 2 == 0) {
         l1i1liliili.EventBus(true);
      }

      if (this.l111IlIIlll1IlIIIIIII1lllI1.isSelected()) {
         Hand Hand = l11I1I1ll1Illll1I1l1111l1II.player.getActiveHand();
         if (this.I1II1lI11l1111IIl.Spider()) {
            l11I1I1ll1Illll1I1l1111l1II.player
               .setSprinting(
                  l11I1I1ll1Illll1I1l1111l1II.player.canSprint()
                     && l11I1I1ll1Illll1I1l1111l1II.player.isWalking()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.isBlind()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.isGliding()
                     && (!l11I1I1ll1Illll1I1l1111l1II.player.shouldSlowDown() || l11I1I1ll1Illll1I1l1111l1II.player.isSubmergedInWater())
               );
         }

         ZenithInternal066.EventBus(Hand.equals(Hand.MAIN_HAND) ? Hand.OFF_HAND : Hand.MAIN_HAND);
         l1i1liliili.EventBus(true);
      }
   }
}
