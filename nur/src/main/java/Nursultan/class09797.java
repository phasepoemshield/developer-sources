package Nursultan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

final class class09797 {
   private final class10021 N;
   private final class09798 y;
   private final class09810 L;
   private final class09715 u;
   private final Set<class10021> i = Collections.newSetFromMap(new IdentityHashMap<>());

   private void L(class10021 var1) {
      if (var1 != null && !this.u(var1)) {
         this.i.add(var1);
      }
   }

   class09797(class10021 var1, class09798 var2, class09810 var3, class09715 var4) {
      this.N = Objects.requireNonNull(var1, "root");
      this.y = Objects.requireNonNull(var2, "spec");
      this.L = Objects.requireNonNull(var3, "options");
      this.u = Objects.requireNonNull(var4, "animationManager");
   }

   private boolean u(class10021 var1) {
      for (class10021 var2 = var1; var2 != null; var2 = var2.X()) {
         if (this.i.contains(var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean y(class10021 var1) {
      return !this.N(var1);
   }

   private void N(class10021 var1, class09798 var2, Set<class10021> var3, Set<class10021> var4, List<class10021> var5) {
      String var6 = class09800.N(var2);
      if (var6 != null) {
         for (int var7 = var1.u() - 1; var7 >= 0; var7--) {
            class10021 var8 = var1.N(var7);
            if (class09774.N(var8)
               && !var3.contains(var8)
               && !var4.contains(var8)
               && !this.u(var8)
               && var6.equals(class09800.N(var8))
               && !class09800.N(var8, var2)) {
               this.N(var8, var4, var5);
            }
         }
      }
   }

   private class10021 N(class10021 var1, int var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var1.u(); var4++) {
         class10021 var5 = var1.N(var4);
         if (class09774.y(var5) && !this.u(var5)) {
            if (var3 == var2) {
               return var5;
            }

            var3++;
         }
      }

      return null;
   }

   private boolean N(class10021 var1) {
      return this.L.L() != class09787.REMOVE_IMMEDIATELY && class09771.N(var1, this.u);
   }

   private void N(class10021 var1, Set<class10021> var2, List<class10021> var3) {
      if (var2.add(var1)) {
         var3.add(var1);
         this.L(var1);
      }
   }

   class09811 N() {
      class09799 var1 = class09800.N(this.N, this.y) ? this.N(this.N, this.y) : this.N(this.y);
      if (!var1.R()) {
         this.L(this.N);
      }

      return new class09811(var1);
   }

   private class09799 N(class09798 var1) {
      class09799 var2 = new class09799(var1, null, class09790.INSERT);
      ArrayList var3 = new ArrayList(var1.L().size());

      for (class09798 var5 : var1.L()) {
         var3.add(this.N(var5));
      }

      var2.N(new class09779(var3, List.of(), List.of()));
      return var2;
   }

   private class09779 N(class10021 var1, List<class09798> var2) {
      int var3 = var1.u();
      if (var2.isEmpty() && var3 == 0) {
         return class09779.N();
      } else {
         Set var4 = Collections.newSetFromMap(new IdentityHashMap(var2.size()));
         Set var5 = Collections.newSetFromMap(new IdentityHashMap(var3));
         Set var6 = Collections.newSetFromMap(new IdentityHashMap(var3));
         ArrayList var7 = new ArrayList();
         ArrayList var8 = new ArrayList();
         ArrayList var9 = new ArrayList(var2.size());

         for (int var10 = 0; var10 < var2.size(); var10++) {
            class09798 var11 = (class09798)var2.get(var10);
            this.N(var1, var11, var4, var5, var7);
            class10021 var12 = this.N(var1, var11, var10, var4);
            if (var12 == null) {
               var9.add(this.N(var11));
            } else {
               var4.add(var12);
               var6.add(var12);
               var9.add(this.N(var12, var11));
            }
         }

         this.N(var1, var4, var5, var6, var7, var8);
         this.N(var1, var6);
         return new class09779(var9, var7, var8);
      }
   }

   private void N(class10021 var1, Set<class10021> var2, Set<class10021> var3, Set<class10021> var4, List<class10021> var5, List<class10021> var6) {
      for (int var7 = 0; var7 < var1.u(); var7++) {
         class10021 var8 = var1.N(var7);
         if (class09774.N(var8) && !var2.contains(var8) && !var3.contains(var8) && !this.u(var8)) {
            if (this.y(var8)) {
               this.N(var8, var3, var5);
               var4.add(var8);
            } else {
               if (!var8.T()) {
                  var6.add(var8);
               }

               var4.add(var8);
            }
         }
      }
   }

   private void N(class10021 var1, Set<class10021> var2) {
      for (int var3 = 0; var3 < var1.u(); var3++) {
         class10021 var4 = var1.N(var3);
         if (class09774.N(var4) && !this.u(var4) && !var2.contains(var4)) {
            throw new IllegalStateException("Unplanned normal child during reconciliation: " + var4);
         }
      }
   }

   private class09799 N(class10021 var1, class09798 var2) {
      class09799 var3 = new class09799(var2, var1, class09790.REUSE);
      var3.N(this.N(var1, var2.L()));
      return var3;
   }

   private class10021 N(class10021 var1, class09798 var2, int var3, Set<class10021> var4) {
      if (class09800.N(var2) != null) {
         for (int var7 = 0; var7 < var1.u(); var7++) {
            class10021 var6 = var1.N(var7);
            if (class09774.N(var6) && !var4.contains(var6) && !this.u(var6) && class09800.N(var6, var2)) {
               return var6;
            }
         }

         return null;
      } else {
         class10021 var5 = this.N(var1, var3);
         return var5 != null && !var4.contains(var5) && class09800.N(var5, var2) ? var5 : null;
      }
   }
}
