package ru.metaculture.protection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Arrays;
import java.util.function.Supplier;

public class TextArraySetting extends Setting {
   private static final int O00000000000 = 9;
   private final String[] O000000000000 = new String[9];
   private final String[] O0000000000000 = new String[9];

   public TextArraySetting(String string) {
      this.O00000000 = string;
      Arrays.fill(this.O000000000000, "");
      Arrays.fill(this.O0000000000000, "");
   }

   public String O00000000(int i) {
      if (i >= 0 && i < 9) {
         return this.O000000000000[i] == null ? "" : this.O000000000000[i];
      } else {
         return "";
      }
   }

   public void O00000000(int i, String string) {
      if (i >= 0 && i < 9) {
         this.O000000000000[i] = string == null ? "" : string.trim();
      }
   }

   public void O000000000(int i) {
      this.O00000000(i, "");
   }

   public void O0000000000() {
      Arrays.fill(this.O000000000000, "");
   }

   public boolean O00000000000() {
      for (String var4 : this.O000000000000) {
         if (var4 != null && !var4.isBlank()) {
            return false;
         }
      }

      return true;
   }

   public String[] O000000000000() {
      return Arrays.copyOf(this.O000000000000, this.O000000000000.length);
   }

   public JsonArray O000000000000O() {
      JsonArray var1 = new JsonArray();

      for (String var5 : this.O000000000000) {
         var1.add(var5 == null ? "" : var5);
      }

      return var1;
   }

   public void O00000000(JsonElement jsonElement) {
      Arrays.fill(this.O000000000000, "");
      if (jsonElement != null && jsonElement.isJsonArray()) {
         JsonArray var2 = jsonElement.getAsJsonArray();

         for (int var3 = 0; var3 < Math.min(9, var2.size()); var3++) {
            try {
               this.O000000000000[var3] = var2.get(var3).getAsString();
            } catch (Throwable var5) {
               this.O000000000000[var3] = "";
            }
         }
      }
   }

   public TextArraySetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public void O000000000() {
      System.arraycopy(this.O0000000000000, 0, this.O000000000000, 0, 9);
   }
}
