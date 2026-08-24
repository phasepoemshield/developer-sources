package org.zenith.setting;

import org.zenith.event.EventImpl;

import org.zenith.core.NpcCloneManager;
import org.zenith.ZenithClient;
import org.zenith.core.EmotePlayback;
import org.zenith.core.Easing;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.UiAnimation;
import org.zenith.event.EventImpl;


public class ModeSetting_Var159 {
   public boolean enabled;
   public final String string17;

   public String getName() {
      return ZenithClient.on23().Easing().translate(this.string17);
   }

   public String getKey() {
      return this.string17;
   }

   public ModeSetting_Var159(String var1, boolean var2) {
      this.enabled = var2;
      this.string17 = var1;
   }

   public ModeSetting_Var159(ModeSetting var1, String var2, boolean var3) {
      this.enabled = var3;
      this.string17 = var2;
      var1.list57.add(this);
   }

   public static ModeSetting_Var159 UiAnimation(String var0, boolean var1) {
      return new ModeSetting_Var159(var0, var1);
   }

   public static ModeSetting_Var159 EventImpl(String var0) {
      return new ModeSetting_Var159(var0, true);
   }

   public void toggle() {
      this.enabled = !this.enabled;
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean var1) {
      this.enabled = var1;
   }
}
