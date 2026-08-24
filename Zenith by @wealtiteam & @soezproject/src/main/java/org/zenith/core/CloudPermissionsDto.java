package org.zenith.core;

import org.zenith.setting.Setting;

import org.zenith.setting.ColorSetting;
import org.zenith.setting.ModeSetting2;





import java.util.List;

public record CloudPermissionsDto(List<String> BotGuardEntity, List<String> SelectionOutline) implements CloudResponse {

   public CloudPermissionsDto(List<String> BotGuardEntity, List<String> SelectionOutline) {
      BotGuardEntity = List.copyOf(BotGuardEntity);
      SelectionOutline = List.copyOf(SelectionOutline);
      this.BotGuardEntity = BotGuardEntity;
      this.SelectionOutline = SelectionOutline;
   }

   @Override
   public String type() {
      return "cosmetics.access";
   }

   public List<String> ColorSetting() {
      return this.BotGuardEntity;
   }

   public List<String> ModeSetting2() {
      return this.SelectionOutline;
   }
}
