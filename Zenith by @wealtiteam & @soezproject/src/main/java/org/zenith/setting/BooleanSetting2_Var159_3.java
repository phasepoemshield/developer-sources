package org.zenith.setting;

import org.zenith.event.ItemUseEvent;

import org.zenith.event.ItemUseEvent;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;


import java.util.function.Predicate;

class BooleanSetting2_Var159_3 extends BooleanSetting2_Var159 {
   public final Predicate val502;
   BooleanSetting2_Var159_3(int var1, Predicate var2) {
      super(var1);
      this.val502 = var2;
   }

   @Override
   public boolean ItemUseEvent(String var1) {
      return var1 != null && this.val502.test(var1);
   }
}
