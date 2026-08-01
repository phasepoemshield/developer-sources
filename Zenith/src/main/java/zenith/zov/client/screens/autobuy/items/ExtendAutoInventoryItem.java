package zenith.zov.client.screens.autobuy.items;

import zenith.hud.*;

import java.util.List;
import zenith.GetDisplayNameHandler_2;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;

public abstract class ExtendAutoInventoryItem extends AutoInventoryItem {
   public ExtendAutoInventoryItem(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      super(li1ll11ilil1ii1lilll1i);
   }

   public abstract List<MenuSetting> getEnchants();
}
