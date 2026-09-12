package Nursultan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class class09792 {
   private final class09812 N;
   private final class09769 y;

   private class10021 L(class09799 var1) {
      return Objects.requireNonNull(var1.i(), "resolvedElement");
   }

   class09792(class09812 var1, class09769 var2) {
      this.N = Objects.requireNonNull(var1, "nodeSpecCompiler");
      this.y = var2 == null ? class09769.N : var2;
   }

   private void y(class10021 var1, List<class09799> var2) {
      if (var1.u() != 0) {
         ArrayList var3 = new ArrayList(var1.u());
         ArrayList var4 = new ArrayList();
         int var5 = 0;

         for (int var6 = 0; var6 < var1.u(); var6++) {
            class10021 var7 = var1.N(var6);
            if (!class09774.N(var7)) {
               var4.add(var7);
            } else if (var7.T()) {
               var3.add(var7);
            } else {
               if (var5 >= var2.size()) {
                  throw new IllegalStateException("Unplanned active child during reorder: " + var7);
               }

               var3.add(Objects.requireNonNull(((class09799)var2.get(var5)).i(), "resolvedElement"));
               var5++;
            }
         }

         while (var5 < var2.size()) {
            var3.add(Objects.requireNonNull(((class09799)var2.get(var5)).i(), "resolvedElement"));
            var5++;
         }

         var3.addAll(var4);
         var1.y(var3);
      }
   }

   private class10021 y(class09799 var1, class09810 var2) {
      if (!var1.R()) {
         return this.L(var1);
      } else {
         class10021 var3 = Objects.requireNonNull(var1.y(), "existing");
         var3.j();
         var1.N(var3);
         this.N(var3, var1, var2);
         return var3;
      }
   }

   private void y(class09799 var1) {
      if (!var1.R()) {
         if (var1.i() == null) {
            this.N(var1);
         }
      } else {
         for (class09799 var3 : var1.u().y()) {
            this.y(var3);
         }
      }
   }

   class10021 N(class09799 var1, class09810 var2) {
      Objects.requireNonNull(var1, "plan");
      Objects.requireNonNull(var2, "options");
      if (!var1.R()) {
         return this.L(var1);
      } else {
         class10021 var3 = Objects.requireNonNull(var1.y(), "existing");
         var1.N(var3);
         this.N(var3, var1, var2);
         return var3;
      }
   }

   private class10021 N(class09799 var1) {
      class10021 var2 = this.N.N(var1.N());
      this.N(var1, var2);
      return var2;
   }

   void N(class09811 var1) {
      Objects.requireNonNull(var1, "plan");
      this.y(var1.N());
   }

   class10021 N(class09798 var1) {
      return this.N.N(var1);
   }

   private void N(class09799 var1, class10021 var2) {
      var1.N(var2);
      List<class09799> var3 = var1.u().y();

      for (int var4 = 0; var4 < var3.size(); var4++) {
         this.N(var3.get(var4), var2.N(var4));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void N(class10021 var1, class09798 var2) {
      switch (class09795.N[var2.y().ordinal()]) {
         case 1:
            var1.N(var2.M());
            break;
         case 2:
            var1.N(var2.M());
            var1.y(var2.B());
            break;
         case 3:
            var1.L(var2.Z());
            break;
         case 4:
            var1.N(var2.z());
         case 5:
      }
   }

   private void N(class10021 var1, class09779 var2, class09810 var3) {
      this.N(var1, var2.L());

      for (class09799 var5 : var2.y()) {
         class10021 var6 = this.y(var5, var3);
         if (!var5.R()) {
            var1.N(var6);
         }
      }

      for (class10021 var8 : var2.u()) {
         if (var8.X() == var1 && !var8.T()) {
            var8.b();
         }
      }

      this.y(var1, var2.y());
   }

   private void N(class10021 var1, class09799 var2, class09810 var3) {
      class09798 var4 = var2.N();
      class09793<class09904> var5 = class09817.y(var4);
      if (var5 != null) {
         var5.N(var1);
      }

      var1.N(var4.R());
      var1.N(var4.i());
      var1.V();

      for (class09816 var7 : var4.u()) {
         var1.N(var7.N(), var7.y(), var7.L());
      }

      this.N(var1, var4);
      this.N(var1, var2.u(), var3);
   }

   private void N(class10021 var1, List<class10021> var2) {
      for (class10021 var4 : var2) {
         if (var4.X() == var1) {
            this.y.beforeDetach(var4);
            var1.y(var4);
         }
      }
   }
}
