package moscow.rockstar.module.misc;

import lombok.Generated;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.StringSetting;
import moscow.rockstar.util.game.EntityUtility;
@ModuleInfo(name = "Name Protect", category = ModuleCategory.OTHER, desc = "Визуально скрывает ник игрока")
public class NameProtect extends BaseModule {
   private final StringSetting fakeName = new StringSetting(this, "Фальшивое имя").text("Player");

   public String patchName(String text) {
      String clientUsername = mc.getSession().getUsername();
      if (EntityUtility.isInGame()) {
         text = text.replace(mc.player.getDisplayName().getString(), this.fakeName.getText());
      }

      return text.replace(clientUsername, this.fakeName.getText());
   }

   @Generated
   public StringSetting getFakeName() {
      return this.fakeName;
   }
}
