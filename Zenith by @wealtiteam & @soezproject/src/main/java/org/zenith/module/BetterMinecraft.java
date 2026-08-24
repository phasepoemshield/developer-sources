package org.zenith.module;

import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.managers.EmoteManager;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.managers.EmoteMetadata;
import org.zenith.core.EmotePlayback;

import org.zenith.event.Event09;
import org.zenith.event.Event20;

import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting_Var159;



@ModuleInfo(
   name = "BetterMinecraft",
   description = "",
   category = Category.RENDER
)
public final class BetterMinecraft extends Module {
   public static final BetterMinecraft betterMinecraft = new BetterMinecraft();
   public static final long long74 = 130L;
   public static final long long75 = 110L;
   public static final float float11 = 0.86F;
   public final ModeSetting u0410U043dU0438U043cU0438U0440U043eU0432U0430U0442U044c = new ModeSetting("\u0410\u043d\u0438\u043c\u0438\u0440\u043e\u0432\u0430\u0442\u044c");
   public final ModeSetting_Var159 modeSettingVar1595 = new ModeSetting_Var159(
      this.u0410U043dU0438U043cU0438U0440U043eU0432U0430U0442U044c, "\u0425\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0430", true
   );
   public final ModeSetting_Var159 modeSettingVar1596 = new ModeSetting_Var159(
      this.u0410U043dU0438U043cU0438U0440U043eU0432U0430U0442U044c, "\u0418\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u044c", true
   );

   public BetterMinecraft() {
   }

   public boolean float318() {
      return this.isEnabled() && this.modeSettingVar1595.isEnabled();
   }

   public boolean int423() {
      return this.isEnabled() && this.modeSettingVar1596.isEnabled();
   }

   public float EmoteMetadata(long var1) {
      float f = this.Event20((float)(System.currentTimeMillis() - var1) / 130.0F);
      return 0.86F + 0.13999999F * this.Event09(f);
   }

   public float on23(long var1, float var3) {
      float f = this.Event20((float)(System.currentTimeMillis() - var1) / 110.0F);
      return var3 * (1.0F - this.Event09(f));
   }

   public boolean EmoteManager(long var1) {
      return System.currentTimeMillis() - var1 >= 110L;
   }

   public float Event20(float var1) {
      return Math.clamp(var1, 0.0F, 1.0F);
   }

   public float Event09(float var1) {
      return var1 < 0.5F ? 2.0F * var1 * var1 : 1.0F - (float)Math.pow((double)(-2.0F * var1 + 2.0F), 2.0) / 2.0F;
   }
}
