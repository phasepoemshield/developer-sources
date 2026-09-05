package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

public class ili11Iii1Ii extends nuunVnvU {
   public static final String uVUuuVnNVU = "None";
   private static final List<ili11Iii1Ii> nvUVNnuu = new CopyOnWriteArrayList<>();
   public final VnuVUNUv vuuuNvNuv;
   private final Supplier<List<String>> UuuNnUvUuv;

   public ili11Iii1Ii(String var1, VnuVUNUv var2) {
      this(var1, var2, () -> uNNnUu.UuUVuuUu().vuuuNvNuv(var2));
   }

   public ili11Iii1Ii(String var1, VnuVUNUv var2, Supplier<List<String>> var3) {
      super(var1, "None");
      this.vuuuNvNuv = var2;
      this.UuuNnUvUuv = var3;
      this.VVuuUN = new ArrayList<>();
      this.VVuuUN.add("None");
      this.uUnuvNvvNU();
      this.vVvUvVVuuNvV();
      nvUVNnuu.add(this);
   }

   public static void UuUVuuUu(VnuVUNUv var0, String var1) {
      if (var0 != null && var1 != null && !var1.isBlank()) {
         for (ili11Iii1Ii var3 : nvUVNnuu) {
            if (var3.vuuuNvNuv == var0) {
               var3.uUnuvNvvNU(var1);
            }
         }
      }
   }

   public static void UuUVuuUu(VnuVUNUv var0) {
      if (var0 != null) {
         for (ili11Iii1Ii var2 : nvUVNnuu) {
            if (var2.vuuuNvNuv == var0) {
               var2.uUnuvNvvNU("None");
            }
         }
      }
   }

   public ili11Iii1Ii uUnuvNvvNU(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   @Override
   public List<String> uUnuvNvvNU() {
      List var1;
      try {
         var1 = this.UuuNnUvUuv == null ? Collections.emptyList() : this.UuuNnUvUuv.get();
      } catch (Throwable var5) {
         var1 = Collections.emptyList();
      }

      ArrayList var2 = new ArrayList();
      var2.add("None");
      if (var1 != null) {
         for (String var4 : var1) {
            if (var4 != null && !var4.isBlank() && !UuUVuuUu(var2, var4)) {
               var2.add(var4.trim());
            }
         }
      }

      if (var2.size() > 2) {
         var2.subList(1, var2.size()).sort((var0, var1x) -> {
            int var2x = nuUnNvnuUu(var0);
            int var3 = nuUnNvnuUu(var1x);
            return var2x != var3 ? Integer.compare(var2x, var3) : var0.compareToIgnoreCase(var1x);
         });
      }

      this.vVvUvVVuuNvV = var2;
      if (this.VVuuUN == null) {
         this.VVuuUN = new ArrayList<>();
      }

      if (this.VVuuUN.isEmpty()) {
         this.VVuuUN.add("None");
      } else {
         String var6 = this.VVuuUN.get(this.VVuuUN.size() - 1);
         this.VVuuUN.clear();
         this.VVuuUN.add(vVvUvVVuuNvV(var6));
      }

      return this.vVvUvVVuuNvV;
   }

   public String VVuuUN() {
      this.uUnuvNvvNU();
      return this.VVuuUN.isEmpty() ? "None" : this.VVuuUN.get(this.VVuuUN.size() - 1);
   }

   public String vNUvnnVnUvu() {
      String var1 = this.VVuuUN();
      return uNNnnnuuuN(var1) ? "None" : var1;
   }

   public void uUnuvNvvNU(String var1) {
      if (this.VVuuUN == null) {
         this.VVuuUN = new ArrayList<>();
      }

      this.VVuuUN.clear();
      this.VVuuUN.add(vVvUvVVuuNvV(var1));
      this.uUnuvNvvNU();
   }

   public void UuUVuuUu(int var1) {
      this.uUnuvNvvNU();
      if (var1 >= 0 && var1 < this.vVvUvVVuuNvV.size()) {
         this.uUnuvNvvNU(this.vVvUvVVuuNvV.get(var1));
      }
   }

   public int uVUuuVnNVU() {
      String var1 = this.VVuuUN();

      for (int var2 = 0; var2 < this.vVvUvVVuuNvV.size(); var2++) {
         if (this.vVvUvVVuuNvV.get(var2).equalsIgnoreCase(var1)) {
            return var2;
         }
      }

      return -1;
   }

   public boolean vuuuNvNuv() {
      String var1 = this.VVuuUN();
      return !uNNnnnuuuN(var1) && !UuUVuuUu(this.vVvUvVVuuNvV, var1);
   }

   public String UuuNnUvUuv() {
      return this.UnUNVVVNuv();
   }

   public boolean nUUVuvU() {
      return uNNnnnuuuN(this.VVuuUN());
   }

   public String UnUNVVVNuv() {
      String var1 = this.VVuuUN();
      if (uNNnnnuuuN(var1)) {
         return "";
      } else {
         return uNNnUu.UuUVuuUu().uNNnnnuuuN(var1) ? var1 : "";
      }
   }

   public String vNVuvnUUnuUn() {
      if (this.vuuuNvNuv != null && this.vuuuNvNuv != VnuVUNUv.PREVIEW_ONLY) {
         try {
            VUvUNNUvvNVN var1 = lllilIiI11l.UuUVuuUu().uUnuvNvvNU(this.vuuuNvNuv);
            if (var1 != null && uNNnUu.UuUVuuUu().uNNnnnuuuN(var1.C00OOC00oO())) {
               return var1.C00OOC00oO();
            }
         } catch (Throwable var2) {
         }

         return "";
      } else {
         return "";
      }
   }

   @Override
   public boolean C00OOC00oO(String var1) {
      return var1 != null && var1.equalsIgnoreCase(this.VVuuUN());
   }

   private static String vVvUvVVuuNvV(String var0) {
      return var0 != null && !var0.isBlank() && !uNNnnnuuuN(var0) ? var0.trim() : "None";
   }

   private static boolean uNNnnnuuuN(String var0) {
      return var0 == null || var0.isBlank() || "None".equalsIgnoreCase(var0.trim());
   }

   private static int nuUnNvnuUu(String var0) {
      uNNnUu.nvnNNunvv var1 = uNNnUu.UuUVuuUu().nuUnNvnuUu(var0);

      return switch (var1) {
         case PRESET -> 0;
         case USER -> 1;
         case IMPORTED -> 2;
         case RUNTIME -> 3;
      };
   }

   private static boolean UuUVuuUu(List<String> var0, String var1) {
      if (var0 != null && var1 != null) {
         for (String var3 : var0) {
            if (var3 != null && var3.equalsIgnoreCase(var1.trim())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
