package org.zenith.setting;







import org.zenith.core.BooleanValue;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;

import org.zenith.core.EmotePlayback;
import org.zenith.core.Easing;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.UiAnimation;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModeSetting2 extends Setting {
   public List<String> list58;
   public static final Gson gson = new Gson();

   public void ItemRegistry(List<String> var1) {
      this.list58 = var1;
   }

   public ModeSetting2(String var1, List<String> var2) {
      this(var1, "", var2, () -> true);
   }

   public ModeSetting2(String var1, List<String> var2, Supplier<Boolean> var3) {
      this(var1, "", var2, var3);
   }

   public ModeSetting2(String var1, String var2, List<String> var3, Supplier<Boolean> var4) {
      super(var1, var2);
      this.list58 = var3;
   }

   public List<String> queue4() {
      return this.list58;
   }

   public void add(String var1) {
      this.list58.add(var1);
   }

   public void remove(String var1) {
      this.list58.remove(var1);
   }

   public boolean contains(String var1) {
      return this.list58.contains(var1);
   }

   public void on23(Block var1) {
      this.add(var1.getTranslationKey().replace("block.minecraft.", ""));
   }

   public void on23(Item var1) {
      this.add(var1.getTranslationKey().replace("item.minecraft.", ""));
   }

   public void UiAnimation(Block var1) {
      this.remove(var1.getTranslationKey().replace("block.minecraft.", ""));
   }

   public void UiAnimation(Item var1) {
      this.remove(var1.getTranslationKey().replace("item.minecraft.", ""));
   }

   public boolean Easing(Block var1) {
      return this.contains(var1.getTranslationKey().replace("block.minecraft.", ""));
   }

   public boolean Easing(Item var1) {
      return this.contains(var1.getTranslationKey().replace("item.minecraft.", ""));
   }

   public void clear() {
      this.list58.clear();
   }

   @Override
   public void safe(JsonObject var1) {
      var1.add(String.valueOf(this.key), gson.toJsonTree(this.queue4()));
   }

   @Override
   public void load(JsonObject var1) {
      Type type = new ModeSetting2_1(this).getType();
      JsonElement jsonelement = var1.get(String.valueOf(this.key));
      if (jsonelement != null && jsonelement.isJsonArray()) {
         List<String> list = gson.fromJson(jsonelement, type);
         this.ItemRegistry(list);
      }
   }
}
