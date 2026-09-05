package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NNnnunNVu {
   private final ArrayList<nvUuvVvuuN> UuUVuuUu = new ArrayList<>();

   public final void UuUVuuUu(nvUuvVvuuN... var1) {
      this.UuUVuuUu.addAll(Arrays.asList(var1));
   }

   public final void UuUVuuUu(Collection<nvUuvVvuuN> var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.UuUVuuUu.removeAll(var1);
      }
   }

   public List<nvUuvVvuuN> nuUnNvnuUu() {
      return this.UuUVuuUu.stream().filter(var0 -> {
         try {
            return !var0.C00OOC00oO.get();
         } catch (Throwable var2) {
            return false;
         }
      }).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
   }

   public final List<nvUuvVvuuN> nvUVNnuu() {
      return this.UuUVuuUu;
   }
}
