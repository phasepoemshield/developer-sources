package ru.metaculture.protection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class VUVnvvnNN extends nvUuvVvuuN {
   public List<vvNnnUNnVvn> vVvUvVVuuNvV;
   public boolean uNNnnnuuuN;
   public boolean nuUnNvnuUu = false;
   public VVnnnnN VVuuUN = new VVnnnnN();

   public VUVnvvnNN(String var1, vvNnnUNnVvn... var2) {
      this.UuUVuuUu = var1;
      this.vVvUvVVuuNvV = Arrays.asList(var2);
   }

   public VUVnvvnNN C00OOC00oO(boolean var1) {
      this.nuUnNvnuUu = var1;
      return this;
   }

   public int uUnuvNvvNU() {
      int var1 = 0;

      for (vvNnnUNnVvn var3 : this.vVvUvVVuuNvV) {
         if (var3.vVvUvVVuuNvV()) {
            var1++;
         }
      }

      return var1;
   }

   public boolean C00OOC00oO(String var1) {
      for (vvNnnUNnVvn var3 : this.vVvUvVVuuNvV) {
         if (var3.UuUVuuUu.equals(var1)) {
            return var3.uUnuvNvvNU();
         }
      }

      return false;
   }

   public boolean UuUVuuUu(int var1) {
      return var1 >= 0 && var1 < this.vVvUvVVuuNvV.size() ? this.vVvUvVVuuNvV.get(var1).uUnuvNvvNU() : false;
   }

   public VUVnvvnNN UuUVuuUu(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   @Override
   public void C00OOC00oO() {
      this.uNNnnnuuuN = false;

      for (vvNnnUNnVvn var2 : this.vVvUvVVuuNvV) {
         if (var2 != null) {
            var2.C00OOC00oO();
         }
      }
   }
}
