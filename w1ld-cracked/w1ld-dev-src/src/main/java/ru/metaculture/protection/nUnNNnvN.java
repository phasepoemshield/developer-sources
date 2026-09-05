package ru.metaculture.protection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public final class nUnNNnvN extends nNUVNNNvN<Set<String>> {
   public nUnNNnvN(unNVnvNVNvVV var1, nuunVnvU var2) {
      super(Objects.requireNonNull(var1, "model"), UuUVuuUu(var1, Objects.requireNonNull(var2, "setting")));
   }

   private static UNUNvVNuuN UuUVuuUu(unNVnvNVNvVV var0, nuunVnvU var1) {
      final LinkedHashSet var2 = new LinkedHashSet<>(var1.VVuuUN != null ? var1.VVuuUN : Collections.emptyList());
      nNVnuNVvvv var3 = UuUVuuUu(var0, var2, new nNUVNNNvN.NVnVnNnN<Set<String>>() {
         public Set<String> C00OOC00oO(unNVnvNVNvVV var1) {
            Object var2x = var1.nNvNUVU();
            return this.UuUVuuUu(var2x, var2);
         }

         public void UuUVuuUu(unNVnvNVNvVV var1, Set<String> var2x) {
            var1.C00OOC00oO(this.UuUVuuUu(var2x, var2));
         }

         private LinkedHashSet<String> UuUVuuUu(Object var1, Set<String> var2x) {
            LinkedHashSet var3x = new LinkedHashSet();
            Object var4 = null;
            boolean var5 = false;
            if (var1 instanceof Collection var6) {
               var4 = var6;
               var5 = true;
            } else if (var1 instanceof Set var7) {
               var4 = var7;
               var5 = true;
            }

            if (var4 != null) {
               for (Object var8 : var4) {
                  if (var8 != null) {
                     var3x.add(var8.toString());
                  }
               }
            } else if (var1 instanceof Object[] var11) {
               var5 = true;

               for (Object var10 : var11) {
                  if (var10 != null) {
                     var3x.add(var10.toString());
                  }
               }
            }

            if (!var5 && var2x != null) {
               var3x.addAll(var2x);
            }

            return var3x;
         }
      });
      return new UNUNvVNuuN(UuUVuuUu(var0), vVvUvVVuuNvV(), var1, var3, "New Value");
   }
}
