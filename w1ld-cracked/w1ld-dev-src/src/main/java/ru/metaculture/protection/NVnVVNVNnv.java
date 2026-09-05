package ru.metaculture.protection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Arrays;
import java.util.function.Supplier;

public class NVnVVNVNnv extends nvUuvVvuuN {
   private static final int vVvUvVVuuNvV = 9;
   private final String[] uNNnnnuuuN = new String[9];
   private final String[] nuUnNvnuUu = new String[9];

   public NVnVVNVNnv(String var1) {
      this.UuUVuuUu = var1;
      Arrays.fill(this.uNNnnnuuuN, "");
      Arrays.fill(this.nuUnNvnuUu, "");
   }

   public String UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 < 9) {
         return this.uNNnnnuuuN[var1] == null ? "" : this.uNNnnnuuuN[var1];
      } else {
         return "";
      }
   }

   public void UuUVuuUu(int var1, String var2) {
      if (var1 >= 0 && var1 < 9) {
         this.uNNnnnuuuN[var1] = var2 == null ? "" : var2.trim();
      }
   }

   public void C00OOC00oO(int var1) {
      this.UuUVuuUu(var1, "");
   }

   public void uUnuvNvvNU() {
      Arrays.fill(this.uNNnnnuuuN, "");
   }

   public boolean vVvUvVVuuNvV() {
      for (String var4 : this.uNNnnnuuuN) {
         if (var4 != null && !var4.isBlank()) {
            return false;
         }
      }

      return true;
   }

   public String[] uNNnnnuuuN() {
      return Arrays.copyOf(this.uNNnnnuuuN, this.uNNnnnuuuN.length);
   }

   public JsonArray VVuuUN() {
      JsonArray var1 = new JsonArray();

      for (String var5 : this.uNNnnnuuuN) {
         var1.add(var5 == null ? "" : var5);
      }

      return var1;
   }

   public void UuUVuuUu(JsonElement var1) {
      Arrays.fill(this.uNNnnnuuuN, "");
      if (var1 != null && var1.isJsonArray()) {
         JsonArray var2 = var1.getAsJsonArray();

         for (int var3 = 0; var3 < Math.min(9, var2.size()); var3++) {
            try {
               this.uNNnnnuuuN[var3] = var2.get(var3).getAsString();
            } catch (Throwable var5) {
               this.uNNnnnuuuN[var3] = "";
            }
         }
      }
   }

   public NVnVVNVNnv UuUVuuUu(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   @Override
   public void C00OOC00oO() {
      System.arraycopy(this.nuUnNvnuUu, 0, this.uNNnnnuuuN, 0, 9);
   }
}
