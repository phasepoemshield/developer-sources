package org.zenith.setting;

import org.zenith.event.ItemUseEvent;

import org.zenith.event.ItemUseEvent;
import org.zenith.core.BotFeatureRegistry;


class BooleanSetting2_Var159_1 extends BooleanSetting2_Var159 {
   BooleanSetting2_Var159_1(int var1) {
      super(var1);
   }

   @Override
   public boolean ItemUseEvent(String var1) {
      return var1 != null;
   }
}
