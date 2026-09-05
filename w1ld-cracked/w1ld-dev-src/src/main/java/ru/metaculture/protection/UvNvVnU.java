package ru.metaculture.protection;

import java.util.HashMap;

public final class UvNvVnU extends HashMap<Class<? extends nvnnUuNnUvUN>, nvnnUuNnUvUN> {
   public void UuUVuuUu() {
      this.UuUVuuUu(new NNvvnnunn(), new COC0OCc(), new nuNvuvVvuNUn(), new VNnNUNVV());
      this.values().forEach(var0 -> NUvnVVNvvu.UuUVuuUu(var0));
   }

   public void UuUVuuUu(nvnnUuNnUvUN... var1) {
      for (nvnnUuNnUvUN var5 : var1) {
         this.put((Class<? extends nvnnUuNnUvUN>)var5.getClass(), var5);
      }
   }

   public void C00OOC00oO(nvnnUuNnUvUN... var1) {
      for (nvnnUuNnUvUN var5 : var1) {
         NUvnVVNvvu.C00OOC00oO(var5);
         this.remove(var5.getClass());
      }
   }

   public <T extends nvnnUuNnUvUN> T UuUVuuUu(Class<T> var1) {
      return this.values().stream().filter(var1x -> var1x.getClass() == var1).map(var1::cast).findFirst().orElse(null);
   }
}
