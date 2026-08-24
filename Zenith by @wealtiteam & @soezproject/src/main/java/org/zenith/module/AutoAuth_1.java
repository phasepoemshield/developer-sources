package org.zenith.module;

import org.zenith.setting.Setting;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;

import org.zenith.setting.BooleanSetting2;



import com.google.gson.JsonObject;

class AutoAuth_1 extends BooleanSetting2 {
   public final AutoAuth val504;
   AutoAuth_1(AutoAuth var1, String var2, String var3, String var4, String var5) {
      super(var2, var3, var4, var5);
      this.val504 = var1;
   }

   @Override
   public void safe(JsonObject var1) {
   }

   @Override
   public void load(JsonObject var1) {
   }

   @Override
   public boolean setValueSafe(String var1) {
      boolean flag = !var1.equals(this.getValue());
      if (!super.setValueSafe(var1)) {
         return false;
      } else {
         if (flag) {
            this.val504.int344();
         }

         return true;
      }
   }
}
