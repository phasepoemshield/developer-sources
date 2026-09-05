package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class vVvnUVnUvv {
   private static final String UuUVuuUu = "Сброс настроек";
   private static final String C00OOC00oO = "До заводских";
   private final List<nvUuvVvuuN> uUnuvNvvNU = new ArrayList<>();
   private final UNNVUuvVNNuv vVvUvVVuuNvV = new UNNVUuvVNNuv("Сброс настроек", 0, () -> "До заводских").C00OOC00oO(this::C00OOC00oO);

   public void UuUVuuUu(nvUuvVvuuN var1) {
      this.uUnuvNvvNU.add(var1);
   }

   public void UuUVuuUu(nvUuvVvuuN... var1) {
      if (var1 != null) {
         for (nvUuvVvuuN var5 : var1) {
            this.UuUVuuUu(var5);
         }
      }
   }

   public void UuUVuuUu(Collection<nvUuvVvuuN> var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.uUnuvNvvNU.removeAll(var1);
      }
   }

   public List<nvUuvVvuuN> UuUVuuUu() {
      if (!this.uUnuvNvvNU()) {
         return this.uUnuvNvvNU;
      } else {
         ArrayList var1 = new ArrayList<>(this.uUnuvNvvNU);
         var1.add(this.vVvUvVVuuNvV);
         return var1;
      }
   }

   private void C00OOC00oO() {
      for (nvUuvVvuuN var2 : this.uUnuvNvvNU) {
         if (this.C00OOC00oO(var2)) {
            var2.C00OOC00oO();
         }
      }

      uNvNvUNUnuu.vVvUvVVuuNvV();
   }

   private boolean uUnuvNvvNU() {
      for (nvUuvVvuuN var2 : this.uUnuvNvvNU) {
         if (this.C00OOC00oO(var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean C00OOC00oO(nvUuvVvuuN var1) {
      return var1 != null && !var1.uUnuvNvvNU && !(var1 instanceof vNnVvvNU) && !(var1 instanceof VnnUVUVvV);
   }
}
