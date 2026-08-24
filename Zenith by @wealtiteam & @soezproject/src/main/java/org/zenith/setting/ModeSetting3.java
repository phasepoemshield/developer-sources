package org.zenith.setting;

import org.zenith.core.BooleanValue;
import org.zenith.core.EmotePlayback;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;


import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ModeSetting3 extends Setting {
   public final List<ModeSetting3_Var159> values = new ArrayList<>();
   public ModeSetting3_Var159 value;

   public ModeSetting3(String var1, String var2) {
      super(var1, var2);
   }

   public ModeSetting3(String var1, String var2, String... var3) {
      super(var1, var2);

      for (String s : var3) {
         if (!s.isEmpty()) {
            new ModeSetting3_Var159(this, s);
         }
      }

      if (!this.values.isEmpty()) {
         this.value = this.values.getFirst();
      }
   }

   public ModeSetting3(String var1, Supplier<Boolean> var2, String... var3) {
      this(var1, "", var2, var3);
   }

   public ModeSetting3(String var1, String var2, Supplier<Boolean> var3, String... var4) {
      super(var1, var2);

      for (String s : var4) {
         if (!s.isEmpty()) {
            new ModeSetting3_Var159(this, s);
         }
      }

      if (!this.values.isEmpty()) {
         this.value = this.values.getFirst();
      }

      this.setVisible(var3);
   }

   public void set(String var1) {
      this.values.stream().filter(var1x -> var1x.getKey().equals(var1)).findFirst().ifPresent(var1x -> this.value = var1x);
   }

   public String get() {
      return this.value != null ? this.value.getKey() : "";
   }

   public boolean is(int var1) {
      return this.values.get(var1).isSelected();
   }

   public boolean is(String var1) {
      return this.value.getKey().equals(var1);
   }

   public ModeSetting3_Var159 getRandomEnabledElement() {
      var list = this.values.stream().filter(ModeSetting3_Var159::isSelected).toList();
      return !list.isEmpty() ? (ModeSetting3_Var159)list.get(new Random().nextInt(list.size())) : null;
   }

   @Override
   public void safe(JsonObject var1) {
      var1.addProperty(String.valueOf(this.key), this.get());
   }

   @Override
   public void load(JsonObject var1) {
      this.set(var1.get(String.valueOf(this.key)).getAsString());
   }

   public int getIndex() {
      return this.values.indexOf(this.value);
   }

   public List<ModeSetting3_Var159> getValues() {
      return this.values;
   }

   public ModeSetting3_Var159 getValue() {
      return this.value;
   }

   public void setValue(ModeSetting3_Var159 var1) {
      this.value = var1;
   }
}
