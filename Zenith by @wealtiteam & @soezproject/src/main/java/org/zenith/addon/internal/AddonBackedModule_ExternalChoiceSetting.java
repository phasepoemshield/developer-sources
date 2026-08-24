package org.zenith.addon.internal;

import org.zenith.setting.Setting;

import org.zenith.setting.ModeSetting3;
import org.zenith.setting.ModeSetting3_Var159;

import org.zenith.setting.ModeSetting3;
import org.zenith.setting.ModeSetting3_Var159;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;













import java.util.List;

final class AddonBackedModule_ExternalChoiceSetting extends ModeSetting3 {
   public final AddonBackedModule this_0;
   public final String id;

   public AddonBackedModule_ExternalChoiceSetting(AddonBackedModule var1, String var2, String var3, String var4, String var5, List<String> var6) {
      super(var3, var4, var6.toArray(String[]::new));
      this.this_0 = var1;
      this.id = var2;
      super.set(var5);
   }

   @Override
   public void set(String var1) {
      super.set(var1);
      if (this.id != null) {
         this.this_0.registered.setting(this.id, var1);
      }
   }

   @Override
   public void setValue(ModeSetting3_Var159 var1) {
      super.setValue(var1);
      if (this.id != null && var1 != null) {
         this.this_0.registered.setting(this.id, var1.getKey());
      }
   }
}
