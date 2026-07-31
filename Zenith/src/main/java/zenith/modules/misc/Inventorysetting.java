// Module: InventorySetting
// Category: misc
// Original class: Inventorysetting
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import zenith.hud.*;

@ModuleInfo(
   name = "InventorySetting",
   description = "",
   category = Category.MISC
)
public final class Inventorysetting extends Module {
   private final BooleanSetting lIllIIlI11l = new BooleanSetting(
      "module.inventorySetting.stoping", "module.inventorySetting.stoping.desc", true
   );
   private final BooleanSetting lI1lllIIl1l1I111IllIlII1l1lI = new BooleanSetting(
      "module.inventorySetting.delayMoveItem", "module.inventorySetting.delayMoveItem.desc", true
   );
   private final BooleanSetting ll1llI11I1lI11lIl1Il = new BooleanSetting(
      "module.inventorySetting.updateSlot", "module.inventorySetting.updateSlot.desc", false
   );
   public static final Inventorysetting ll11II1111ll11I1llI = new Inventorysetting();

   private Inventorysetting() {
   }

   @Override
   public boolean Spider() {
      return true;
   }

   @Override
   public void onEnable() {
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
   }

   public boolean lIlI1I11111I11lI1() {
      return !this.lI1lllIIl1l1I111IllIlII1l1lI.Spider();
   }

   public boolean lII1llIIlII11Ill1I1IlIlIl() {
      return this.lIllIIlI11l.Spider();
   }

   public boolean I111lII1() {
      return this.ll1llI11I1lI11lIl1Il.Spider();
   }
}
