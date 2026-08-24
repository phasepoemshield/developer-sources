package org.zenith.addon.internal;

import org.zenith.core.TradeGuardService;
import org.zenith.setting.Setting;

import org.zenith.setting.BooleanSetting2;
import org.zenith.setting.BooleanSetting2_Var159;

import org.zenith.setting.BooleanSetting2;
import org.zenith.setting.BooleanSetting2_Var159;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;














final class AddonBackedModule_ExternalStringSetting extends BooleanSetting2 {
   public final AddonBackedModule this_0;
   public final String id;

   public AddonBackedModule_ExternalStringSetting(
      AddonBackedModule var1, String var2, String var3, String var4, String var5, String var6, int var7, boolean var8
   ) {
      super(var3, var4, var5, var6, BooleanSetting2_Var159.TradeGuardService(var7));
      this.this_0 = var1;
      this.id = var2;
      if (var8) {
         this.secret();
      }
   }

   @Override
   public boolean setValueSafe(String var1) {
      boolean flag = super.setValueSafe(var1);
      if (flag && this.id != null) {
         this.this_0.registered.setting(this.id, var1);
      }

      return flag;
   }
}
