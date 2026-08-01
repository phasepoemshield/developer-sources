package zenith.zov.client.screens.autobuy.items;

import zenith.hud.*;

import com.google.gson.JsonObject;
import java.util.List;
import net.minecraft.item.ItemStack;
import zenith.NumberSetting;
import zenith.GetDisplayNameHandler_2;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuSliderSetting;

public class AutoInventoryHelmetEternity extends ExtendAutoInventoryItem {
   private MenuSliderSetting maxDamage = new MenuSliderSetting(new NumberSetting("Мин. прочность", 0.8F, 0.0F, 1.0F, 0.1F));

   public AutoInventoryHelmetEternity(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      super(li1ll11ilil1ii1lilll1i);
   }

   public AutoInventoryHelmetEternity copy() {
      AutoInventoryHelmetEternity autoinventoryhelmeteternity1 = new AutoInventoryHelmetEternity(this.getItemBuy());
      autoinventoryhelmeteternity1.maxDamage.getSetting().longHolder_4(this.maxDamage.getSetting().lll1lI1llll1IIllIIIII1lll());
      return autoinventoryhelmeteternity1;
   }

   @Override
   public List<MenuSetting> getEnchants() {
      return List.of(this.maxDamage);
   }

   @Override
   public boolean isBuy(ItemStack ItemStack) {
      return super.isBuy(ItemStack) && !(this.getDurabilityPercent(ItemStack) < this.maxDamage.getSetting().lll1lI1llll1IIllIIIII1lll());
   }

   private float getDurabilityPercent(ItemStack ItemStack) {
      int i = ItemStack.getDamage();
      int j = ItemStack.getMaxDamage();
      return j == 0 ? 1.0F : (float)(j - i) / (float)j;
   }

   @Override
   public void load(JsonObject jsonobject) {
      super.load(jsonobject);
      if (jsonobject.has("maxDamage")) {
         float f = jsonobject.get("maxDamage").getAsFloat();
         this.maxDamage.getSetting().longHolder_4(f);
      }
   }

   @Override
   public JsonObject save() {
      JsonObject jsonobject = super.save();
      jsonobject.addProperty("maxDamage", this.maxDamage.getSetting().lll1lI1llll1IIllIIIII1lll());
      return jsonobject;
   }

   public MenuSliderSetting getMaxDamage() {
      return this.maxDamage;
   }

   public void setMaxDamage(MenuSliderSetting menuslidersetting) {
      this.maxDamage = menuslidersetting;
   }
}
