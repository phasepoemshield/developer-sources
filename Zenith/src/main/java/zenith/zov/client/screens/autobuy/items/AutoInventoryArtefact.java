package zenith.zov.client.screens.autobuy.items;

import zenith.hud.*;

import com.google.gson.JsonObject;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.DataComponentTypes;
import zenith.BooleanSetting;
import zenith.PatternHolder_2;
import zenith.GetDisplayNameHandler_2;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuBooleanSetting;

public class AutoInventoryArtefact extends ExtendAutoInventoryItem {
   private MenuBooleanSetting expDropperSetting = new MenuBooleanSetting(new BooleanSetting("Охотник", false));
   private MenuBooleanSetting vampirismSetting = new MenuBooleanSetting(new BooleanSetting("Вампиризм", false));
   private MenuBooleanSetting gravitySetting = new MenuBooleanSetting(new BooleanSetting("Гравитация", false));
   private MenuBooleanSetting endermanSetting = new MenuBooleanSetting(new BooleanSetting("Эндермен", false));
   private MenuBooleanSetting justiceSetting = new MenuBooleanSetting(new BooleanSetting("Справедливость", false));
   private MenuBooleanSetting antiPhantomSetting = new MenuBooleanSetting(new BooleanSetting("Анти-фантом", false));
   private MenuBooleanSetting telekinesisSetting = new MenuBooleanSetting(new BooleanSetting("Телекинез", false));
   private MenuBooleanSetting blindnessSetting = new MenuBooleanSetting(new BooleanSetting("Снеговик", false));
   private MenuBooleanSetting portholeSetting = new MenuBooleanSetting(new BooleanSetting("Иллюминатор", false));

   public AutoInventoryArtefact(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      super(li1ll11ilil1ii1lilll1i);
   }

   public AutoInventoryArtefact copy() {
      AutoInventoryArtefact autoinventoryartefact1 = new AutoInventoryArtefact(this.getItemBuy());
      autoinventoryartefact1.expDropperSetting.getSetting().StringHolder_11(this.expDropperSetting.getSetting().Spider());
      autoinventoryartefact1.vampirismSetting.getSetting().StringHolder_11(this.vampirismSetting.getSetting().Spider());
      autoinventoryartefact1.gravitySetting.getSetting().StringHolder_11(this.gravitySetting.getSetting().Spider());
      autoinventoryartefact1.endermanSetting.getSetting().StringHolder_11(this.endermanSetting.getSetting().Spider());
      autoinventoryartefact1.justiceSetting.getSetting().StringHolder_11(this.justiceSetting.getSetting().Spider());
      autoinventoryartefact1.antiPhantomSetting.getSetting().StringHolder_11(this.antiPhantomSetting.getSetting().Spider());
      autoinventoryartefact1.telekinesisSetting.getSetting().StringHolder_11(this.telekinesisSetting.getSetting().Spider());
      autoinventoryartefact1.blindnessSetting.getSetting().StringHolder_11(this.blindnessSetting.getSetting().Spider());
      autoinventoryartefact1.portholeSetting.getSetting().StringHolder_11(this.portholeSetting.getSetting().Spider());
      return autoinventoryartefact1;
   }

   @Override
   public List<MenuSetting> getEnchants() {
      return List.of(
         this.expDropperSetting,
         this.vampirismSetting,
         this.gravitySetting,
         this.endermanSetting,
         this.justiceSetting,
         this.antiPhantomSetting,
         this.telekinesisSetting,
         this.blindnessSetting,
         this.portholeSetting
      );
   }

   @Override
   public boolean isBuy(ItemStack ItemStack) {
      if (!super.isBuy(ItemStack)) {
         return false;
      } else {
         String s = this.getLoreText(ItemStack);
         if (s.isEmpty()) {
            return false;
         } else {
            boolean flag = true;
            if (this.expDropperSetting.getSetting().Spider() && !s.contains("EXP_DROPPER")) {
               flag = false;
            }

            if (this.vampirismSetting.getSetting().Spider() && !s.contains("VAMPIRISM")) {
               flag = false;
            }

            if (this.gravitySetting.getSetting().Spider() && !s.contains("GRAVITY")) {
               flag = false;
            }

            if (this.endermanSetting.getSetting().Spider() && !s.contains("ENDERMAN")) {
               flag = false;
            }

            if (this.justiceSetting.getSetting().Spider() && !s.contains("JUSTICE")) {
               flag = false;
            }

            if (this.antiPhantomSetting.getSetting().Spider() && !s.contains("ANTI_PHANTOM")) {
               flag = false;
            }

            if (this.telekinesisSetting.getSetting().Spider() && !s.contains("TELEKINESIS")) {
               flag = false;
            }

            if (this.blindnessSetting.getSetting().Spider() && !s.contains("BLINDNESS")) {
               flag = false;
            }

            if (this.portholeSetting.getSetting().Spider() && !s.contains("PORTHOLE")) {
               flag = false;
            }

            return flag;
         }
      }
   }

   private String getLoreText(ItemStack ItemStack) {
      try {
         String s = PatternHolder_2.SecureRandomHolder_2(ItemStack);
         if (s.contains("kringeEffect")) {
            int i = s.indexOf("kringeEffect:{type:\"") + "kringeEffect:{type:\"".length();
            int j = s.indexOf("\"}", i);
            if (i > "kringeEffect:{type:\"".length() - 1 && j > i) {
               return s.substring(i, j);
            }
         }
      } catch (Exception exception) {
      }

      LoreComponent LoreComponent = (LoreComponent)ItemStack.get(DataComponentTypes.LORE);
      if (LoreComponent == null) {
         return "";
      } else {
         StringBuilder stringbuilder = new StringBuilder();

         for (Text Text : LoreComponent.lines()) {
            stringbuilder.append(Text.getString()).append(" ");
         }

         return stringbuilder.toString();
      }
   }

   @Override
   public void load(JsonObject jsonobject) {
      super.load(jsonobject);
      if (jsonobject.has("expDropperEnabled")) {
         this.expDropperSetting.getSetting().StringHolder_11(jsonobject.get("expDropperEnabled").getAsBoolean());
      }

      if (jsonobject.has("vampirismEnabled")) {
         this.vampirismSetting.getSetting().StringHolder_11(jsonobject.get("vampirismEnabled").getAsBoolean());
      }

      if (jsonobject.has("gravityEnabled")) {
         this.gravitySetting.getSetting().StringHolder_11(jsonobject.get("gravityEnabled").getAsBoolean());
      }

      if (jsonobject.has("endermanEnabled")) {
         this.endermanSetting.getSetting().StringHolder_11(jsonobject.get("endermanEnabled").getAsBoolean());
      }

      if (jsonobject.has("justiceEnabled")) {
         this.justiceSetting.getSetting().StringHolder_11(jsonobject.get("justiceEnabled").getAsBoolean());
      }

      if (jsonobject.has("antiPhantomEnabled")) {
         this.antiPhantomSetting.getSetting().StringHolder_11(jsonobject.get("antiPhantomEnabled").getAsBoolean());
      }

      if (jsonobject.has("telekinesisEnabled")) {
         this.telekinesisSetting.getSetting().StringHolder_11(jsonobject.get("telekinesisEnabled").getAsBoolean());
      }

      if (jsonobject.has("blindnessEnabled")) {
         this.blindnessSetting.getSetting().StringHolder_11(jsonobject.get("blindnessEnabled").getAsBoolean());
      }

      if (jsonobject.has("portholeEnabled")) {
         this.portholeSetting.getSetting().StringHolder_11(jsonobject.get("portholeEnabled").getAsBoolean());
      }
   }

   @Override
   public JsonObject save() {
      JsonObject jsonobject = super.save();
      jsonobject.addProperty("expDropperEnabled", this.expDropperSetting.getSetting().Spider());
      jsonobject.addProperty("vampirismEnabled", this.vampirismSetting.getSetting().Spider());
      jsonobject.addProperty("gravityEnabled", this.gravitySetting.getSetting().Spider());
      jsonobject.addProperty("endermanEnabled", this.endermanSetting.getSetting().Spider());
      jsonobject.addProperty("justiceEnabled", this.justiceSetting.getSetting().Spider());
      jsonobject.addProperty("antiPhantomEnabled", this.antiPhantomSetting.getSetting().Spider());
      jsonobject.addProperty("telekinesisEnabled", this.telekinesisSetting.getSetting().Spider());
      jsonobject.addProperty("blindnessEnabled", this.blindnessSetting.getSetting().Spider());
      jsonobject.addProperty("portholeEnabled", this.portholeSetting.getSetting().Spider());
      return jsonobject;
   }

   public MenuBooleanSetting getExpDropperSetting() {
      return this.expDropperSetting;
   }

   public MenuBooleanSetting getVampirismSetting() {
      return this.vampirismSetting;
   }

   public MenuBooleanSetting getGravitySetting() {
      return this.gravitySetting;
   }

   public MenuBooleanSetting getEndermanSetting() {
      return this.endermanSetting;
   }

   public MenuBooleanSetting getJusticeSetting() {
      return this.justiceSetting;
   }

   public MenuBooleanSetting getAntiPhantomSetting() {
      return this.antiPhantomSetting;
   }

   public MenuBooleanSetting getTelekinesisSetting() {
      return this.telekinesisSetting;
   }

   public MenuBooleanSetting getBlindnessSetting() {
      return this.blindnessSetting;
   }

   public MenuBooleanSetting getPortholeSetting() {
      return this.portholeSetting;
   }

   public void setExpDropperSetting(MenuBooleanSetting menubooleansetting) {
      this.expDropperSetting = menubooleansetting;
   }

   public void setVampirismSetting(MenuBooleanSetting menubooleansetting) {
      this.vampirismSetting = menubooleansetting;
   }

   public void setGravitySetting(MenuBooleanSetting menubooleansetting) {
      this.gravitySetting = menubooleansetting;
   }

   public void setEndermanSetting(MenuBooleanSetting menubooleansetting) {
      this.endermanSetting = menubooleansetting;
   }

   public void setJusticeSetting(MenuBooleanSetting menubooleansetting) {
      this.justiceSetting = menubooleansetting;
   }

   public void setAntiPhantomSetting(MenuBooleanSetting menubooleansetting) {
      this.antiPhantomSetting = menubooleansetting;
   }

   public void setTelekinesisSetting(MenuBooleanSetting menubooleansetting) {
      this.telekinesisSetting = menubooleansetting;
   }

   public void setBlindnessSetting(MenuBooleanSetting menubooleansetting) {
      this.blindnessSetting = menubooleansetting;
   }

   public void setPortholeSetting(MenuBooleanSetting menubooleansetting) {
      this.portholeSetting = menubooleansetting;
   }
}
