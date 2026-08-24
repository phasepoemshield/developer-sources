package org.zenith.addon.internal;

import org.zenith.setting.Setting;

import org.zenith.setting.BooleanSetting;

import org.zenith.setting.BooleanSetting;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
















final class AddonBackedModule_ExternalBooleanSetting extends BooleanSetting {
   public final AddonBackedModule this_0;
   public final String id;

   public AddonBackedModule_ExternalBooleanSetting(AddonBackedModule var1, String var2, String var3, String var4, boolean var5) {
      super(var3, var4, var5);
      this.this_0 = var1;
      this.id = var2;
   }

   @Override
   public void toggle() {
      super.toggle();
      this.this_0.registered.setting(this.id, this.isEnabled());
   }

   @Override
   public void setEnabled(boolean var1) {
      super.setEnabled(var1);
      if (this.id != null) {
         this.this_0.registered.setting(this.id, var1);
      }
   }
}
