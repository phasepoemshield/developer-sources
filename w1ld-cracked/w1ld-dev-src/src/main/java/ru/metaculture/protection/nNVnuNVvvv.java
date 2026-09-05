package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public interface nNVnuNVvvv<T> {
   T UuUVuuUu();

   void UuUVuuUu(T var1);

   T C00OOC00oO();

   void uUnuvNvvNU();

   static nNVnuNVvvv<?> UuUVuuUu(nvUuvVvuuN var0) {
      Objects.requireNonNull(var0, "setting");
      if (var0 instanceof vvNnnUNnVvn var1) {
         return new nNVnuNVvvv<Boolean>() {
            public Boolean vVvUvVVuuNvV() {
               return var1.uUnuvNvvNU();
            }

            public void UuUVuuUu(Boolean var1x) {
               if (var1x != null) {
                  var1.C00OOC00oO(var1x);
               }
            }

            public Boolean uNNnnnuuuN() {
               return false;
            }

            @Override
            public void uUnuvNvvNU() {
               var1.C00OOC00oO(false);
            }
         };
      } else if (var0 instanceof nNUuNvVn var2) {
         return new nNVnuNVvvv<Double>() {
            public Double vVvUvVVuuNvV() {
               return (double)var2.uUnuvNvvNU();
            }

            public void UuUVuuUu(Double var1) {
               if (var1 != null) {
                  var2.vVvUvVVuuNvV = var1.floatValue();
               }
            }

            public Double uNNnnnuuuN() {
               return (double)var2.uNNnnnuuuN;
            }

            @Override
            public void uUnuvNvvNU() {
               var2.vVvUvVVuuNvV = var2.uNNnnnuuuN;
            }
         };
      } else if (var0 instanceof UvNnUnuNUUU var3) {
         return new nNVnuNVvvv<String>() {
            public String vVvUvVVuuNvV() {
               return var3.uUnuvNvvNU();
            }

            public void UuUVuuUu(String var1) {
               if (var3.vVvUvVVuuNvV.contains(var1)) {
                  var3.uNNnnnuuuN = var1;
                  var3.vNUvnnVnUvu = var3.vVvUvVVuuNvV.indexOf(var1);
               }
            }

            public String uNNnnnuuuN() {
               return var3.vVvUvVVuuNvV.isEmpty() ? "" : var3.vVvUvVVuuNvV.get(0);
            }

            @Override
            public void uUnuvNvvNU() {
               if (!var3.vVvUvVVuuNvV.isEmpty()) {
                  var3.uNNnnnuuuN = var3.vVvUvVVuuNvV.get(0);
                  var3.vNUvnnVnUvu = 0;
               }
            }
         };
      } else if (var0 instanceof nuunVnvU var4) {
         return new nNVnuNVvvv<Set<String>>() {
            public Set<String> vVvUvVVuuNvV() {
               return new LinkedHashSet<>(var4.VVuuUN != null ? var4.VVuuUN : List.of());
            }

            public void UuUVuuUu(Set<String> var1) {
               if (var1 != null) {
                  var4.VVuuUN = new ArrayList<>(var1);
               } else {
                  var4.VVuuUN = new ArrayList<>();
               }
            }

            public Set<String> uNNnnnuuuN() {
               return new LinkedHashSet<>();
            }

            @Override
            public void uUnuvNvvNU() {
               var4.VVuuUN = new ArrayList<>();
            }
         };
      } else {
         return var0 instanceof VnnUvVNuNuVv var5 ? new nNVnuNVvvv<NUvuNUvvUvvN>() {
            public NUvuNUvvUvvN vVvUvVVuuNvV() {
               return NUvuNUvvUvvN.UuUVuuUu(var5.uNNnnnuuuN(), var5.nUUVuvU, var5.UnUNVVVNuv, var5.vNVuvnUUnuUn);
            }

            public void UuUVuuUu(NUvuNUvvUvvN var1) {
               if (var1 != null) {
                  var5.UuUVuuUu(var1.UuUVuuUu());
                  var5.nUUVuvU = var1.C00OOC00oO();
                  var5.UnUNVVVNuv = var1.uUnuvNvvNU();
                  var5.vNVuvnUUnuUn = var1.vVvUvVVuuNvV();
               }
            }

            public NUvuNUvvUvvN uNNnnnuuuN() {
               return NUvuNUvvUvvN.UuUVuuUu(0.0F, 1.0F, 1.0F, 1.0F);
            }

            @Override
            public void uUnuvNvvNU() {
               var5.uNNnnnuuuN = 0.0F;
               var5.nUUVuvU = 1.0F;
               var5.UnUNVVVNuv = 1.0F;
               var5.vNVuvnUUnuUn = 1.0F;
            }
         } : new nNVnuNVvvv<Object>() {
            @Override
            public Object UuUVuuUu() {
               return null;
            }

            @Override
            public void UuUVuuUu(Object var1) {
            }

            @Override
            public Object C00OOC00oO() {
               return null;
            }

            @Override
            public void uUnuvNvvNU() {
            }
         };
      }
   }
}
