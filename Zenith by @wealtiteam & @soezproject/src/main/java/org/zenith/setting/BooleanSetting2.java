package org.zenith.setting;

import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.event.ItemUseEvent;
import org.zenith.core.EmotePlayback;
import org.zenith.core.CloudResponse;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BotFeatureRegistry;


import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class BooleanSetting2 extends Setting {
   public final String emptyText;
   public boolean secret;
   public final BooleanSetting2_Var159 validator;
   public String value;

   public BooleanSetting2(String var1, String var2, String var3) {
      this(var1, "", var2, var3);
   }

   public BooleanSetting2 secret() {
      this.secret = true;
      return this;
   }

   public BooleanSetting2(String var1, String var2, String var3, String var4) {
      super(var1, var2);
      this.value = var3;
      this.emptyText = var4;
      this.validator = BooleanSetting2_Var159.boolean120();
   }

   public BooleanSetting2(String var1, String var2, String var3, BooleanSetting2_Var159 var4) {
      this(var1, "", var2, var3, var4);
   }

   public BooleanSetting2(String var1, String var2, String var3, String var4, BooleanSetting2_Var159 var5) {
      super(var1, var2);
      this.value = var3;
      this.emptyText = var4;
      this.validator = var5 == null ? BooleanSetting2_Var159.boolean120() : var5;
   }

   public BooleanSetting2(String var1, String var2, String var3, Supplier<Boolean> var4) {
      this(var1, "", var2, var3, var4);
   }

   public BooleanSetting2(String var1, String var2, String var3, String var4, Supplier<Boolean> var5) {
      super(var1, var2);
      this.value = var3;
      this.emptyText = var4;
      this.validator = BooleanSetting2_Var159.boolean120();
      this.setVisible(var5);
   }

   public BooleanSetting2(String var1, String var2, String var3, Supplier<Boolean> var4, BooleanSetting2_Var159 var5) {
      this(var1, "", var2, var3, var4, var5);
   }

   public BooleanSetting2(String var1, String var2, String var3, String var4, Supplier<Boolean> var5, BooleanSetting2_Var159 var6) {
      super(var1, var2);
      this.value = var3;
      this.emptyText = var4;
      this.validator = var6 == null ? BooleanSetting2_Var159.boolean120() : var6;
      this.setVisible(var5);
   }

   public boolean setValueSafe(String var1) {
      if (this.validator.ItemUseEvent(var1)) {
         this.value = var1;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void safe(JsonObject var1) {
      var1.addProperty(String.valueOf(this.key), this.value);
   }

   @Override
   public void load(JsonObject var1) {
      if (var1.has(String.valueOf(this.key))) {
         String s = var1.get(String.valueOf(this.key)).getAsString();
         this.setValueSafe(s);
      }
   }

   public BooleanSetting2_Var159 getValidator() {
      return this.validator;
   }

   public String getValue() {
      return this.value;
   }

   public String getEmptyText() {
      return this.emptyText;
   }

   public boolean isSecret() {
      return this.secret;
   }

   public void setValue(String var1) {
      this.value = var1;
   }
}
