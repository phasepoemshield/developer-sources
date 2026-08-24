package org.zenith.setting;

import org.zenith.core.BooleanValue;
import org.zenith.core.NpcCloneManager;
import org.zenith.ZenithClient;
import org.zenith.core.EmotePlayback;
import org.zenith.core.Easing;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;


import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class BooleanSetting extends Setting {
   public boolean enabled;
   public final String description;

   @Override
   public String getDescription() {
      return ZenithClient.on23().Easing().translate(this.description);
   }

   public BooleanSetting(String var1, boolean var2) {
      super(var1, "");
      this.enabled = var2;
      this.description = "";
   }

   public BooleanSetting(String var1, String var2, boolean var3) {
      super(var1, var2);
      this.enabled = var3;
      this.description = var2;
   }

   public BooleanSetting(String var1, String var2, boolean var3, Supplier<Boolean> var4) {
      super(var1, var2);
      this.enabled = var3;
      this.setVisible(var4);
      this.description = var2;
   }

   public BooleanSetting(String var1, boolean var2, Supplier<Boolean> var3) {
      super(var1, "");
      this.enabled = var2;
      this.setVisible(var3);
      this.description = "";
   }

   public static BooleanSetting of(String var0, boolean var1) {
      return new BooleanSetting(var0, var1);
   }

   public static BooleanSetting of(String var0) {
      return new BooleanSetting(var0, true);
   }

   public void toggle() {
      this.enabled = !this.enabled;
   }

   @Override
   public void safe(JsonObject var1) {
      var1.addProperty(String.valueOf(this.key), this.isEnabled());
   }

   @Override
   public void load(JsonObject var1) {
      this.setEnabled(var1.get(String.valueOf(this.key)).getAsBoolean());
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean var1) {
      this.enabled = var1;
   }
}
