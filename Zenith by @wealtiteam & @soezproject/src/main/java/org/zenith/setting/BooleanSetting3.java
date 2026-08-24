package org.zenith.setting;

import org.zenith.core.BooleanValue;
import org.zenith.ZenithClient;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BotFeaturesDto;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;


import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BooleanSetting3 extends Setting {
   public final List<Setting> list11;
   public boolean active;

   public BooleanSetting3(String var1, Setting... var2) {
      this(var1, "", () -> true, var2);
   }

   public BooleanSetting3(String var1, String var2, Setting... var3) {
      this(var1, var2, () -> true, var3);
   }

   public BooleanSetting3(String var1, Supplier<Boolean> var2, Setting... var3) {
      this(var1, "", var2, var3);
   }

   public BooleanSetting3(String var1, String var2, Supplier<Boolean> var3, Setting... var4) {
      super(var1, var2);
      this.setVisible(var3);
      this.list11 = Lists.newArrayList(Arrays.asList(var4));
      this.active = false;
   }

   public <T extends Setting> T BotFeaturesDto(int var1) {
      return (T)this.list11.get(var1);
   }

   public void toggle() {
      this.active = !this.active;
   }

   public void on23(Consumer<Setting> var1) {
      this.list11.forEach(var1);
   }

   @Override
   public void safe(JsonObject var1) {
      this.on23(var1x -> var1x.safe(var1));
   }

   @Override
   public void load(JsonObject var1) {
      this.on23(var1x -> {
         if (var1.has(var1x.getKey())) {
            var1x.load(var1);
         }
      });
   }

   public List<Setting> getSettings() {
      return this.list11;
   }

   public boolean isActive() {
      return this.active;
   }
}
