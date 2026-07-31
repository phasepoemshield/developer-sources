// Module: AutoSprint
// Category: movement
// Original class: Autosprint
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

@ModuleInfo(
   name = "AutoSprint",
   category = Category.MOVEMENT,
   description = "Автоматически включает спринт"
)
public final class Autosprint extends Module {
   public static final Autosprint lIlIIlllIl11l111l1I1I11l = new Autosprint();
   private final BooleanSetting IlII11IIl1Ill11I1Ill1ll = new BooleanSetting(
      "module.autoSprint.keepSwing", "module.autoSprint.keepSwing.desc", false
   );
   private boolean I1l11I11IIIIl1I11l1llIIllII = false;

   public boolean ll1lllllllII1Il1l1() {
      return this.IlII11IIl1Ill11I1Ill1ll.Spider();
   }

   private Autosprint() {
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      l11I1I1ll1Illll1I1l1111l1II.options.sprintKey.setPressed(true);
      if (this.IlII11IIl1Ill11I1Ill1ll.Spider() && l11I1I1ll1Illll1I1l1111l1II.player.isSubmergedInWater()) {
         l11I1I1ll1Illll1I1l1111l1II.player.setSwimming(true);
      }
   }

   @EventTarget
   public void EventBus(EntityHolder i11l111illlill) {
      if (this.IlII11IIl1Ill11I1Ill1ll.Spider()) {
         if (i11l111illlill.AutoMine() == ZenithInternal005$Helper.IllIlIll11lIlI1) {
            this.I1l11I11IIIIl1I11l1llIIllII = l11I1I1ll1Illll1I1l1111l1II.player.isSprinting();
         } else if (this.I1l11I11IIIIl1I11l1llIIllII) {
            l11I1I1ll1Illll1I1l1111l1II.player.setSprinting(true);
         }
      }
   }

   public double IIIlIIlII() {
      return 1.0;
   }
}
