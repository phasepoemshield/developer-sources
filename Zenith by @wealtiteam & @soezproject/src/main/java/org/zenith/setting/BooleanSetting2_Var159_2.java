package org.zenith.setting;

import org.zenith.event.ItemUseEvent;

import org.zenith.event.ItemUseEvent;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;


class BooleanSetting2_Var159_2 extends BooleanSetting2_Var159 {
   public final int val501;
   BooleanSetting2_Var159_2(int var1, int var2) {
      super(var1);
      this.val501 = var2;
   }

   @Override
   public boolean ItemUseEvent(String var1) {
      return var1 != null && var1.length() <= this.val501;
   }
}
