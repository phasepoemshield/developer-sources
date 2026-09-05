package ru.metaculture.protection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public final class nuVVnvn {
   private final Map<String, VUnvuNuVUUn> UuUVuuUu = new LinkedHashMap<>();
   private final List<nNuNNVuNUu> C00OOC00oO = new ArrayList<>();
   private final UVVNvnVNvN uUnuvNvvNU = new UVVNvnVNvN();
   private int vVvUvVVuuNvV;
   private String uNNnnnuuuN = "preview";

   public UVVNvnVNvN UuUVuuUu() {
      return this.uUnuvNvvNU;
   }

   public void UuUVuuUu(UVVNvnVNvN var1) {
      this.uUnuvNvvNU.UuUVuuUu(var1);
      this.vVvUvVVuuNvV++;
   }

   public String C00OOC00oO() {
      return this.uNNnnnuuuN;
   }

   public void UuUVuuUu(String var1) {
      if (var1 != null && !var1.isBlank() && !this.uNNnnnuuuN.equals(var1)) {
         this.uNNnnnuuuN = var1;
         this.vVvUvVVuuNvV++;
      }
   }

   public VUnvuNuVUUn UuUVuuUu(String var1, float var2, float var3, nvvuUNnNvN var4) {
      String var5 = nuUnNvnuUu(var1);
      VUnvuNuVUUn var6 = new VUnvuNuVUUn(var5, var1, var2, var3);
      uuUnNVuuVUu var7 = var4.UuUVuuUu(var1);
      if (var7 != null) {
         var6.UuUVuuUu(var7.vVvUvVVuuNvV());
      }

      this.UuUVuuUu.put(var5, var6);
      this.vVvUvVVuuNvV++;
      return var6;
   }

   public void UuUVuuUu(VUnvuNuVUUn var1, nvvuUNnNvN var2) {
      Objects.requireNonNull(var1, "node");
      uuUnNVuuVUu var3 = var2.UuUVuuUu(var1.C00OOC00oO());
      if (var3 != null) {
         var1.UuUVuuUu(var3.vVvUvVVuuNvV());
      }

      this.UuUVuuUu.put(var1.UuUVuuUu(), var1);
      this.vVvUvVVuuNvV++;
   }

   public boolean C00OOC00oO(String var1) {
      VUnvuNuVUUn var2 = this.UuUVuuUu.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         this.C00OOC00oO.removeIf(var1x -> var1x.UuUVuuUu().equals(var1) || var1x.uUnuvNvvNU().equals(var1));
         this.vVvUvVVuuNvV++;
         return true;
      }
   }

   public boolean UuUVuuUu(String var1, String var2, String var3, String var4, nvvuUNnNvN var5) {
      VUnvuNuVUUn var6 = this.UuUVuuUu.get(var1);
      VUnvuNuVUUn var7 = this.UuUVuuUu.get(var3);
      if (var6 != null && var7 != null && var6 != var7) {
         uuUnNVuuVUu var8 = var5.UuUVuuUu(var6.C00OOC00oO());
         uuUnNVuuVUu var9 = var5.UuUVuuUu(var7.C00OOC00oO());
         if (var8 != null && var9 != null) {
            NUuvnUuVU var10 = var8.C00OOC00oO(var2);
            NUuvnUuVU var11 = var9.UuUVuuUu(var4);
            if (var10 == null || var11 == null || var10.type() != var11.type()) {
               return false;
            } else if (this.uUnuvNvvNU(var1, var3)) {
               return false;
            } else {
               this.C00OOC00oO.removeIf(var2x -> var2x.uUnuvNvvNU().equals(var3) && var2x.vVvUvVVuuNvV().equals(var4));
               this.C00OOC00oO.add(new nNuNNVuNUu(var1, var2, var3, var4));
               this.vVvUvVVuuNvV++;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean UuUVuuUu(String var1, String var2) {
      boolean var3 = this.C00OOC00oO.removeIf(var2x -> var2x.uUnuvNvvNU().equals(var1) && var2x.vVvUvVVuuNvV().equals(var2));
      if (var3) {
         this.vVvUvVVuuNvV++;
      }

      return var3;
   }

   public Collection<VUnvuNuVUUn> uUnuvNvvNU() {
      return this.UuUVuuUu.values();
   }

   public List<nNuNNVuNUu> vVvUvVVuuNvV() {
      return this.C00OOC00oO;
   }

   public VUnvuNuVUUn uUnuvNvvNU(String var1) {
      return this.UuUVuuUu.get(var1);
   }

   public nNuNNVuNUu C00OOC00oO(String var1, String var2) {
      for (nNuNNVuNUu var4 : this.C00OOC00oO) {
         if (var4.uUnuvNvvNU().equals(var1) && var4.vVvUvVVuuNvV().equals(var2)) {
            return var4;
         }
      }

      return null;
   }

   public List<nNuNNVuNUu> vVvUvVVuuNvV(String var1) {
      ArrayList var2 = new ArrayList();

      for (nNuNNVuNUu var4 : this.C00OOC00oO) {
         if (var4.UuUVuuUu().equals(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public nuVVnvn uNNnnnuuuN(String var1) {
      nuVVnvn var2 = new nuVVnvn();
      var2.uNNnnnuuuN = this.uNNnnnuuuN;
      var2.uUnuvNvvNU.UuUVuuUu(this.uUnuvNvvNU);
      if (var1 != null && this.UuUVuuUu.containsKey(var1)) {
         LinkedHashSet var3 = new LinkedHashSet();
         ArrayDeque var4 = new ArrayDeque();
         var4.push(var1);

         while (!var4.isEmpty()) {
            String var5 = (String)var4.pop();
            if (var3.add(var5)) {
               for (nNuNNVuNUu var7 : this.C00OOC00oO) {
                  if (var7.uUnuvNvvNU().equals(var5)) {
                     var4.push(var7.UuUVuuUu());
                  }
               }
            }
         }

         for (String var11 : var3) {
            VUnvuNuVUUn var13 = this.UuUVuuUu.get(var11);
            if (var13 != null) {
               VUnvuNuVUUn var8 = new VUnvuNuVUUn(var13.UuUVuuUu(), var13.C00OOC00oO(), var13.uUnuvNvvNU(), var13.vVvUvVVuuNvV());
               var8.UuUVuuUu(var13.uNNnnnuuuN());
               var8.nuUnNvnuUu().putAll(var13.nuUnNvnuUu());
               var8.VVuuUN().putAll(var13.VVuuUN());
               var2.UuUVuuUu.put(var8.UuUVuuUu(), var8);
            }
         }

         for (nNuNNVuNUu var12 : this.C00OOC00oO) {
            if (var3.contains(var12.UuUVuuUu()) && var3.contains(var12.uUnuvNvvNU())) {
               var2.C00OOC00oO.add(new nNuNNVuNUu(var12.UuUVuuUu(), var12.C00OOC00oO(), var12.uUnuvNvvNU(), var12.vVvUvVVuuNvV()));
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public int uNNnnnuuuN() {
      return this.vVvUvVVuuNvV;
   }

   public void nuUnNvnuUu() {
      this.vVvUvVVuuNvV++;
   }

   public void VVuuUN() {
      this.UuUVuuUu.clear();
      this.C00OOC00oO.clear();
      this.vVvUvVVuuNvV++;
   }

   public boolean uUnuvNvvNU(String var1, String var2) {
      if (var1.equals(var2)) {
         return true;
      } else {
         LinkedHashSet var3 = new LinkedHashSet();
         ArrayDeque var4 = new ArrayDeque();
         var4.push(var2);

         while (!var4.isEmpty()) {
            String var5 = (String)var4.pop();
            if (var3.add(var5)) {
               if (var5.equals(var1)) {
                  return true;
               }

               for (nNuNNVuNUu var7 : this.C00OOC00oO) {
                  if (var7.UuUVuuUu().equals(var5)) {
                     var4.push(var7.uUnuvNvvNU());
                  }
               }
            }
         }

         return false;
      }
   }

   private static String nuUnNvnuUu(String var0) {
      String var1 = var0 != null && !var0.isBlank() ? var0.toLowerCase().replaceAll("[^a-z0-9]+", "_") : "node";
      return var1 + "_" + UUID.randomUUID().toString().replace("-", "").substring(0, 10);
   }
}
