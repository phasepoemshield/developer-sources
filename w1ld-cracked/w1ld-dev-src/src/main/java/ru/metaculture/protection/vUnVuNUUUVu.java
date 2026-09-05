package ru.metaculture.protection;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.wild.module.api.Module;

public final class vUnVuNUUUVu {
   private static final vUnVuNUUUVu UuUVuuUu = new vUnVuNUUUVu();
   private final List<vUnVuNUUUVu.NVnVnNnN> C00OOC00oO = new CopyOnWriteArrayList<>();

   private vUnVuNUUUVu() {
      uNNnUu.UuUVuuUu().UuUVuuUu(this::UuUVuuUu);
      uNNnUu.UuUVuuUu().C00OOC00oO(this::UuUVuuUu);
   }

   public static vUnVuNUUUVu UuUVuuUu() {
      return UuUVuuUu;
   }

   public synchronized void UuUVuuUu(Module var1, uvVVuUNNunn var2) {
      this.UuUVuuUu((Object)var1, var2);
   }

   public synchronized void UuUVuuUu(vVvnUVnUvv var1, uvVVuUNNunn var2) {
      this.UuUVuuUu((Object)var1, var2);
   }

   private void UuUVuuUu(Object var1, uvVVuUNNunn var2) {
      if (var1 != null && var2 != null) {
         this.uUnuvNvvNU(var1);
         vUnVuNUUUVu.NVnVnNnN var3 = new vUnVuNUUUVu.NVnVnNnN(var1, var2);
         this.C00OOC00oO.add(var3);
         this.UuUVuuUu(var3);
      }
   }

   public synchronized void UuUVuuUu(Module var1) {
      this.UuUVuuUu((Object)var1);
   }

   public synchronized void UuUVuuUu(vVvnUVnUvv var1) {
      this.UuUVuuUu((Object)var1);
   }

   private void UuUVuuUu(Object var1) {
      if (var1 != null) {
         this.uUnuvNvvNU(var1);
         C00OOC00oO();
      }
   }

   public void C00OOC00oO(Module var1, uvVVuUNNunn var2) {
      this.C00OOC00oO((Object)var1, var2);
   }

   public void C00OOC00oO(vVvnUVnUvv var1, uvVVuUNNunn var2) {
      this.C00OOC00oO((Object)var1, var2);
   }

   private void C00OOC00oO(Object var1, uvVVuUNNunn var2) {
      if (var1 != null && var2 != null) {
         vUnVuNUUUVu.NVnVnNnN var3 = this.C00OOC00oO(var1);
         if (var3 != null) {
            this.UuUVuuUu(var3);
         }

         ArrayList var4 = new ArrayList();

         for (nvUuvVvuuN var6 : vVvUvVVuuNvV(var1)) {
            if (var6 != null && var6.uUnuvNvvNU) {
               var4.add(var6);
            }
         }

         if (!var4.isEmpty()) {
            if (var2.uNNnnnuuuN()) {
               String var7 = var2.vVvUvVVuuNvV();
               if (var7 != null && !var7.isBlank() && !"None".equalsIgnoreCase(var7)) {
                  vvVvVNN.UuUVuuUu(var7, var4);
               }
            } else {
               VnuVUNUv var8 = var2.uUnuvNvvNU();
               if (var8 != null) {
                  vvVvVNN.UuUVuuUu(var8, var4);
               }
            }
         }
      }
   }

   private vUnVuNUUUVu.NVnVnNnN C00OOC00oO(Object var1) {
      for (vUnVuNUUUVu.NVnVnNnN var3 : this.C00OOC00oO) {
         Object var4 = var3.UuUVuuUu.get();
         if (var4 == var1) {
            return var3;
         }
      }

      return null;
   }

   private void UuUVuuUu(VnuVUNUv var1) {
      if (var1 != null) {
         for (vUnVuNUUUVu.NVnVnNnN var3 : this.C00OOC00oO) {
            uvVVuUNNunn var4 = var3.C00OOC00oO;
            if (var4 != null && !var4.uNNnnnuuuN() && var4.uUnuvNvvNU() == var1) {
               this.UuUVuuUu(var3);
            }
         }
      }
   }

   private void UuUVuuUu(String var1) {
      if (var1 != null) {
         String var2 = uNNnUu.vuuuNvNuv(var1);

         for (vUnVuNUUUVu.NVnVnNnN var4 : this.C00OOC00oO) {
            uvVVuUNNunn var5 = var4.C00OOC00oO;
            if (var5 != null && var5.uNNnnnuuuN()) {
               String var6 = var5.vVvUvVVuuNvV();
               if (var6 != null && var2.equals(uNNnUu.vuuuNvNuv(var6))) {
                  this.UuUVuuUu(var4);
               }
            }
         }
      }
   }

   private synchronized void uUnuvNvvNU(Object var1) {
      for (vUnVuNUUUVu.NVnVnNnN var3 : this.C00OOC00oO) {
         Object var4 = var3.UuUVuuUu.get();
         if (var4 == null) {
            this.C00OOC00oO.remove(var3);
         } else if (var4 == var1) {
            if (!var3.uUnuvNvvNU.isEmpty()) {
               C00OOC00oO(var4, var3.uUnuvNvvNU);
            }

            this.C00OOC00oO.remove(var3);
         }
      }
   }

   private synchronized void UuUVuuUu(vUnVuNUUUVu.NVnVnNnN var1) {
      Object var2 = var1.UuUVuuUu.get();
      if (var2 == null) {
         this.C00OOC00oO.remove(var1);
      } else {
         String var3;
         List var4;
         if (var1.C00OOC00oO.uNNnnnuuuN()) {
            String var5 = var1.C00OOC00oO.vVvUvVVuuNvV();
            if (var5 == null || var5.isBlank() || "None".equalsIgnoreCase(var5)) {
               UuUVuuUu(var2, var1);
               var1.vVvUvVVuuNvV = "";
               var1.uNNnnnuuuN = "";
               return;
            }

            var3 = vvVvVNN.uUnuvNvvNU(var5);
            var4 = vvVvVNN.nuUnNvnuUu(var5);
            String var6 = "name:" + uNNnUu.vuuuNvNuv(var5);
            if (Objects.equals(var1.vVvUvVVuuNvV, var3) && Objects.equals(var1.uNNnnnuuuN, var6)) {
               return;
            }

            var1.uNNnnnuuuN = var6;
         } else {
            VnuVUNUv var7 = var1.C00OOC00oO.uUnuvNvvNU();
            if (var7 == null) {
               UuUVuuUu(var2, var1);
               var1.vVvUvVVuuNvV = "";
               var1.uNNnnnuuuN = "";
               return;
            }

            var3 = vvVvVNN.uUnuvNvvNU(var7);
            var4 = vvVvVNN.nuUnNvnuUu(var7);
            String var9 = "target:" + var7.UuUVuuUu();
            if (Objects.equals(var1.vVvUvVVuuNvV, var3) && Objects.equals(var1.uNNnnnuuuN, var9)) {
               return;
            }

            var1.uNNnnnuuuN = var9;
         }

         var1.vVvUvVVuuNvV = var3 == null ? "" : var3;
         UuUVuuUu(var2, var1);
         if (var4 != null && !var4.isEmpty()) {
            for (nvUuvVvuuN var10 : var4) {
               if (var10 != null) {
                  var10.uUnuvNvvNU = true;
               }
            }

            var1.uUnuvNvvNU.addAll(var4);
            UuUVuuUu(var2, var4);
            C00OOC00oO();
         }
      }
   }

   private static void UuUVuuUu(Object var0, vUnVuNUUUVu.NVnVnNnN var1) {
      if (!var1.uUnuvNvvNU.isEmpty()) {
         C00OOC00oO(var0, var1.uUnuvNvvNU);
         var1.uUnuvNvvNU.clear();
         C00OOC00oO();
      }
   }

   private static List<nvUuvVvuuN> vVvUvVVuuNvV(Object var0) {
      if (var0 instanceof Module var2) {
         return var2.nvUVNnuu();
      } else {
         return var0 instanceof vVvnUVnUvv var1 ? var1.UuUVuuUu() : List.of();
      }
   }

   private static void UuUVuuUu(Object var0, List<nvUuvVvuuN> var1) {
      if (var0 instanceof Module var2) {
         var2.UuUVuuUu(var1.toArray(new nvUuvVvuuN[0]));
      } else if (var0 instanceof vVvnUVnUvv var3) {
         var3.UuUVuuUu(var1.toArray(new nvUuvVvuuN[0]));
      }
   }

   private static void C00OOC00oO(Object var0, List<nvUuvVvuuN> var1) {
      if (var0 instanceof Module var2) {
         var2.UuUVuuUu(var1);
      } else if (var0 instanceof vVvnUVnUvv var3) {
         var3.UuUVuuUu(var1);
      }
   }

   private static void C00OOC00oO() {
      try {
         if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null) {
            UnUvnuVNNN var0 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.uVUuuVnNVU();
            if (var0 != null) {
               var0.nuUnNvnuUu();
            }
         }
      } catch (Throwable var1) {
      }
   }

   static final class NVnVnNnN {
      final WeakReference<Object> UuUVuuUu;
      final uvVVuUNNunn C00OOC00oO;
      final List<nvUuvVvuuN> uUnuvNvvNU = new ArrayList<>();
      String vVvUvVVuuNvV = "";
      String uNNnnnuuuN = "";

      NVnVnNnN(Object var1, uvVVuUNNunn var2) {
         this.UuUVuuUu = new WeakReference<>(var1);
         this.C00OOC00oO = var2;
      }
   }
}
