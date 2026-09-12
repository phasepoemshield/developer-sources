package Nursultan;

import java.util.ArrayList;

final class class10020 {
   private final class10052 N;
   private final class10040 y;
   private final ArrayList<class10021> L = new ArrayList<>();
   private final ArrayList<class10021> u = new ArrayList<>();
   private final ArrayList<class10021> i = new ArrayList<>();

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void L(class10021 var1, class10036 var2, float var3) {
      for (int var4 = 0; var4 < var1.u(); var4++) {
         class10021 var5 = var1.N(var4);
         if (!class10048.N(var5)) {
            class10061 var6 = this.N.N(var5);
            class09980 var7 = var5.o();
            class09962 var8 = class10048.y(var7, var2);
            float var9 = class10019.N(var5) ? (var2 == class10036.WIDTH ? this.N.y() : this.N.L()) : var3;

            var6.N(var2, switch (class10038.N[var8.u().ordinal()]) {
               case 1 -> class10048.N(var7, var2, var8.M());
               case 2 -> this.N(var7, var2, var9);
               case 3 -> class10048.L(var7, var2, var9);
               case 4 -> class10048.L(var7, var2, var6.u(var2));
               default -> throw new MatchException(null, null);
            });
            this.y(var5, var2);
         }
      }
   }

   class10020(class10052 var1) {
      this.N = var1;
      this.y = new class10040(var1);
   }

   private void y(class10021 var1, class10036 var2) {
      class10061 var3 = this.N.N(var1);
      var3.y(var2, var3.L(var2));
      var3.N(var2, this.N.N(var1, var2, var3.L(var2)));
      var3.i(var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void y(class10021 var1, class10036 var2, float var3) {
      for (int var4 = 0; var4 < var1.u(); var4++) {
         class10021 var5 = var1.N(var4);
         if (class10048.N(var5)) {
            class10061 var6 = this.N.N(var5);
            class09980 var7 = var5.o();
            class09962 var8 = class10048.y(var7, var2);

            float var9 = switch (class10038.N[var8.u().ordinal()]) {
               case 1 -> Math.min(class10048.N(var7, var2, var8.M()), var3);
               case 2 -> class10048.i(var7, var2, var3);
               case 3 -> class10048.L(var7, var2, var3);
               case 4 -> class10048.L(var7, var2, Math.min(var6.u(var2), var3));
               default -> throw new MatchException(null, null);
            };
            var6.N(var2, Math.max(var6.N(var2), var9));
            this.y(var5, var2);
         }
      }
   }

   private float N(class09980 var1, class10036 var2, float var3) {
      float var4 = Math.max(0.0F, var3 - class10048.R(var1, var2));
      float var5 = class10048.y(var1, var2).i(var4);
      return class10048.N(var1, var2, var5);
   }

   private static boolean N(class09980 var0, class10036 var1) {
      return var1 == class10036.HEIGHT && var0.y();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   void N(class10021 var1, class10036 var2, float var3) {
      class10061 var4 = this.N.N(var1);
      class09980 var5 = var1.o();
      class09962 var6 = class10048.y(var5, var2);
      float var7 = var4.u(var2);

      var4.N(var2, switch (class10038.N[var6.u().ordinal()]) {
         case 1 -> class10048.N(var5, var2, var6.M());
         case 2 -> class10048.i(var5, var2, var3);
         case 3 -> class10048.L(var5, var2, var3);
         case 4 -> class10048.R(var5, var2, var7);
         default -> throw new MatchException(null, null);
      });
      var4.y(var2, var4.L(var2));
      this.y(var1, var2);
   }

   void N(class10021 var1, class10036 var2) {
      this.N(var1, var2, false);
   }

   private void N(class10021 var1, class10036 var2, boolean var3) {
      if (var2 == class10036.WIDTH) {
         this.N.i().L++;
      } else {
         this.N.i().u++;
      }

      class09980 var4 = var1.o();
      float var6 = class10048.N(this.N.N(var1), var4, var2);
      if (class10048.N(var4, var2)) {
         this.N(var1, var4, var2, var6, var3);
      } else {
         this.y(var1, var2, var6);
      }

      this.L(var1, var2, var6);
      boolean var7 = var3 || N(var4, var2);

      for (int var8 = 0; var8 < var1.u(); var8++) {
         class10021 var9 = var1.N(var8);
         this.N(var9, var2, var7);
      }
   }

   private void N(class10021 var1, class09980 var2, class10036 var3, float var4, boolean var5) {
      ArrayList<class10021> var6 = this.L;
      ArrayList<class10021> var7 = this.u;
      ArrayList<class10021> var8 = this.i;
      var6.clear();
      var7.clear();
      var8.clear();
      int var9 = 0;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;

      for (int var13 = 0; var13 < var1.u(); var13++) {
         class10021 var14 = var1.N(var13);
         if (class10048.N(var14)) {
            var9++;
            class10061 var15 = this.N.N(var14);
            class09980 var16 = var14.o();
            class09962 var17 = class10048.y(var16, var3);
            if (var17.u() == class09982.PERCENT) {
               var8.add(var14);
               var11 += var17.M();
               var12 += class10048.R(var16, var3);
            } else {
               var10 += var15.L(var3);
            }

            if (var17.u() != class09982.FIXED) {
               var6.add(var14);
            }

            if (var17.u() == class09982.GROW) {
               var7.add(var14);
            }
         }
      }

      if (var9 != 0) {
         var10 += class10048.N(var9, var2.E());
         if (!var8.isEmpty()) {
            float var23 = Math.max(0.0F, var4 - var10);
            float var25 = Math.max(0.0F, var23 - var12);
            float var26 = var11 > 100.01F ? var11 : 100.0F;

            for (int var27 = 0; var27 < var8.size(); var27++) {
               class10021 var28 = var8.get(var27);
               class10061 var18 = this.N.N(var28);
               class09980 var19 = var28.o();
               class09962 var20 = class10048.y(var19, var3);
               float var21 = var25 * var20.M() / var26;
               var18.N(var3, class10048.N(var19, var3, var21));
               var10 += var18.L(var3);
            }
         }

         float var24 = var4 - var10;
         if (var24 < -0.01F) {
            if (!var5 && !N(var2, var3)) {
               if (!var6.isEmpty()) {
                  this.y.N(var6, var3, var24);
               }
            }
         } else {
            if (var24 > 0.01F && !var7.isEmpty()) {
               this.y.y(var7, var3, var24);
            }
         }
      }
   }
}
