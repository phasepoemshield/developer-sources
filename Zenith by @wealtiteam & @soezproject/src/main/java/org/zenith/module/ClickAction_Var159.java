package org.zenith.module;

import org.zenith.setting.Setting;




import org.zenith.core.BooleanValue;

import org.zenith.setting.StringSetting2;



import net.minecraft.item.Item;

public record ClickAction_Var159(Item item5, StringSetting2 stringSetting22, BooleanValue var42) {

   public Item double21() {
      return this.item5;
   }

   public StringSetting2 double22() {
      return this.stringSetting22;
   }

   public BooleanValue double23() {
      return this.var42;
   }
}
