package org.zenith.setting;

import org.zenith.ZenithClient;
import org.zenith.core.Easing;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;


import com.google.gson.JsonObject;
import java.util.function.Supplier;

public abstract class Setting {
   protected final String key;
   protected final String description;
   protected Supplier<Boolean> visible;

   public Setting(String var1) {
      this(var1, "");
   }

   public Setting(String var1, String var2) {
      this.key = var1;
      this.description = var2 != null ? var2 : "";
      this.setVisible(() -> true);
   }

   public String getName() {
      return ZenithClient.on23().Easing().translate(this.key);
   }

   public String getDescription() {
      return ZenithClient.on23().Easing().translate(this.description);
   }

   public abstract void safe(JsonObject var1);

   public abstract void load(JsonObject var1);

   public boolean isVisible() {
      return this.visible.get();
   }

   public String getKey() {
      return this.key;
   }

   public Supplier<Boolean> getVisible() {
      return this.visible;
   }

   public void setVisible(Supplier<Boolean> var1) {
      this.visible = var1;
   }
}
