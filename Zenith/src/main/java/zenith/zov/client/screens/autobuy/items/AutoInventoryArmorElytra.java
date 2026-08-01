package zenith.zov.client.screens.autobuy.items;

import zenith.hud.*;

import com.google.gson.JsonObject;
import java.util.List;
import net.minecraft.item.ItemStack;
import zenith.BooleanSetting;
import zenith.NumberSetting;
import zenith.GetDisplayNameHandler_2;
import zenith.ZenithInternal150;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuBooleanSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuSliderSetting;

public class AutoInventoryArmorElytra extends ExtendAutoInventoryItem {
   private ZenithInternal150 enchantVanilla = new ZenithInternal150("Прочность", "minecraft:unbreaking", 0);
   private ZenithInternal150 meding = new ZenithInternal150("Починка", "minecraft:mending", 1);
   private MenuSliderSetting maxDamage = new MenuSliderSetting(new NumberSetting("Мин. прочность", 0.8F, 0.0F, 1.0F, 0.1F));
   private MenuSliderSetting unBrekingSetting = new MenuSliderSetting(
      new NumberSetting("Прочность лвл", 0.0F, 0.0F, 8.0F, 1.0F, (f1, f) -> this.enchantVanilla.FinishThread((int)f))
   );
   private MenuBooleanSetting meddingState = new MenuBooleanSetting(new BooleanSetting("Починка", false));

   public AutoInventoryArmorElytra(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      super(li1ll11ilil1ii1lilll1i);
   }

   public AutoInventoryArmorElytra copy() {
      AutoInventoryArmorElytra autoinventoryarmorelytra1 = new AutoInventoryArmorElytra(this.getItemBuy());
      autoinventoryarmorelytra1.enchantVanilla = new ZenithInternal150(
         this.enchantVanilla.getName(), this.enchantVanilla.Staffs(), this.enchantVanilla.TargetHud()
      );
      autoinventoryarmorelytra1.meding = new ZenithInternal150(this.meding.getName(), this.meding.Staffs(), this.meding.TargetHud());
      autoinventoryarmorelytra1.maxDamage.getSetting().longHolder_4(this.maxDamage.getSetting().lll1lI1llll1IIllIIIII1lll());
      autoinventoryarmorelytra1.unBrekingSetting.getSetting().longHolder_4(this.unBrekingSetting.getSetting().lll1lI1llll1IIllIIIII1lll());
      autoinventoryarmorelytra1.meddingState.getSetting().StringHolder_11(this.meddingState.getSetting().Spider());
      return autoinventoryarmorelytra1;
   }

   @Override
   public List<MenuSetting> getEnchants() {
      return List.of(this.maxDamage, this.unBrekingSetting, this.meddingState);
   }

   @Override
   public boolean isBuy(ItemStack ItemStack) {
      if (!super.isBuy(ItemStack) || this.getDurabilityPercent(ItemStack) < this.maxDamage.getSetting().lll1lI1llll1IIllIIIII1lll()) {
         return false;
      } else {
         return !this.enchantVanilla.StringHolder_8(ItemStack)
            ? false
            : !this.meddingState.getSetting().Spider() || this.meding.StringHolder_8(ItemStack);
      }
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

      if (jsonobject.has("unbreakingLevel")) {
         float f1 = jsonobject.get("unbreakingLevel").getAsFloat();
         this.unBrekingSetting.getSetting().longHolder_4(f1);
         this.enchantVanilla.FinishThread((int)f1);
      }

      if (jsonobject.has("mendingEnabled")) {
         boolean flag = jsonobject.get("mendingEnabled").getAsBoolean();
         this.meddingState.getSetting().StringHolder_11(flag);
      }

      if (jsonobject.has("unbreaking")) {
         JsonObject jsonobject1 = jsonobject.getAsJsonObject("unbreaking");
         if (jsonobject1.has("minLevel")) {
            int i = jsonobject1.get("minLevel").getAsInt();
            this.enchantVanilla.FinishThread(i);
            this.unBrekingSetting.getSetting().longHolder_4((float)i);
         }
      }

      if (jsonobject.has("mending")) {
         JsonObject jsonobject2 = jsonobject.getAsJsonObject("mending");
         if (jsonobject2.has("minLevel")) {
            this.meding.FinishThread(jsonobject2.get("minLevel").getAsInt());
         }
      }
   }

   @Override
   public JsonObject save() {
      JsonObject jsonobject = super.save();
      jsonobject.addProperty("maxDamage", this.maxDamage.getSetting().lll1lI1llll1IIllIIIII1lll());
      jsonobject.addProperty("unbreakingLevel", this.unBrekingSetting.getSetting().lll1lI1llll1IIllIIIII1lll());
      jsonobject.addProperty("mendingEnabled", this.meddingState.getSetting().Spider());
      JsonObject jsonobject1 = new JsonObject();
      jsonobject1.addProperty("name", this.enchantVanilla.getName());
      jsonobject1.addProperty("minLevel", this.enchantVanilla.TargetHud());
      jsonobject.add("unbreaking", jsonobject1);
      JsonObject jsonobject2 = new JsonObject();
      jsonobject2.addProperty("name", this.meding.getName());
      jsonobject2.addProperty("minLevel", this.meding.TargetHud());
      jsonobject.add("mending", jsonobject2);
      return jsonobject;
   }

   public ZenithInternal150 getEnchantVanilla() {
      return this.enchantVanilla;
   }

   public ZenithInternal150 getMeding() {
      return this.meding;
   }

   public MenuSliderSetting getMaxDamage() {
      return this.maxDamage;
   }

   public MenuSliderSetting getUnBrekingSetting() {
      return this.unBrekingSetting;
   }

   public MenuBooleanSetting getMeddingState() {
      return this.meddingState;
   }

   public void setEnchantVanilla(ZenithInternal150 llliliiiii1l) {
      this.enchantVanilla = llliliiiii1l;
   }

   public void setMeding(ZenithInternal150 llliliiiii1l) {
      this.meding = llliliiiii1l;
   }

   public void setMaxDamage(MenuSliderSetting menuslidersetting) {
      this.maxDamage = menuslidersetting;
   }

   public void setUnBrekingSetting(MenuSliderSetting menuslidersetting) {
      this.unBrekingSetting = menuslidersetting;
   }

   public void setMeddingState(MenuBooleanSetting menubooleansetting) {
      this.meddingState = menubooleansetting;
   }
}
