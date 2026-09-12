package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

final class class09972 {
   private static final int N = 1;
   private static final int y = 2;
   private static final int L = 4;
   private final class09917 u;
   private final class10007 i;
   private final class09929 R;
   private final class09897 M;
   private final class09890 B;
   private final class09928 Z;
   private class09887 z;

   private static boolean L(class09980 var0) {
      return var0.C() > 0.0F;
   }

   class09972(class09781 var1) {
      class09781 var2 = Objects.requireNonNull(var1, "context");
      this.u = new class09917(var2);
      this.i = new class10007(var2);
      this.R = new class09929(this.u, this.i);
      this.M = new class09897(this.i);
      this.B = new class09890();
      this.Z = new class09928(this.i, this.u);
   }

   private static boolean u(class09980 var0) {
      return !var0.g() || var0.f() <= 0.0F;
   }

   private static boolean y(List<class10021> var0) {
      Iterator var1 = var0.iterator();

      while (var1.hasNext()) {
         if (((class10021)var1.next()).R(1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean y(class09980 var0) {
      return var0.f() > 0.0F && var0.f() < 1.0F;
   }

   private static List<class10021> N(List<class10021> var0) {
      boolean var1 = false;

      for (class10021 var3 : var0) {
         if (class10019.N(var3)) {
            var1 = true;
            break;
         }
      }

      if (!var1) {
         return var0;
      } else {
         ArrayList var5 = new ArrayList(var0.size());

         for (class10021 var4 : var0) {
            if (!class10019.N(var4)) {
               var5.add(var4);
            }
         }

         return var5;
      }
   }

   private class09895 N(class10021 var1, class09895 var2, List<String> var3, class09896 var4) {
      if (var1.K() != null && var1.K().i()) {
         List<class10021> var5 = var1.K().u();
         if (var5.isEmpty()) {
            return var2;
         } else {
            ArrayList var6 = null;
            int var7 = var2.y();

            for (class10021 var9 : var5) {
               class09895 var10 = this.N(var9, var3, var4, 0.0F, this.z);
               if (!var10.N().isEmpty()) {
                  if (var6 == null) {
                     var6 = new ArrayList(var2.N().size() + var5.size());
                     var6.addAll(var2.N());
                  }

                  var6.addAll(var10.N());
                  var7 += var10.y();
               }
            }

            return var6 == null ? var2 : new class09895(var6, var7);
         }
      } else {
         return var2;
      }
   }

   private static boolean N(class09916 var0, class09916 var1) {
      return var0.y() < var1.y() + var1.u() && var1.y() < var0.y() + var0.u() && var0.L() < var1.L() + var1.i() && var1.L() < var0.L() + var0.i();
   }

   private static boolean N(List<class09922> var0, class09916 var1) {
      for (int var2 = 0; var2 < var0.size(); var2++) {
         if (N(((class09922)var0.get(var2)).N(), var1)) {
            return true;
         }
      }

      return false;
   }

   private static int N(List<class09935> var0, List<class09922> var1, int var2) {
      if (var1 != null && !var1.isEmpty()) {
         int var3 = var1.size();
         if (var3 == 1) {
            var0.add((class09935)var1.get(0));
            var1.clear();
            return var2;
         } else {
            class09922 var4 = (class09922)var1.get(0);
            int var5 = 0;

            for (int var6 = 0; var6 < var3; var6++) {
               var5 += ((class09922)var1.get(var6)).L().size();
            }

            ArrayList var15 = new ArrayList(var5);
            class09916 var7 = var4.N();
            float var8 = var7.y();
            float var9 = var7.L();
            float var10 = var7.y() + var7.u();
            float var11 = var7.L() + var7.i();
            var15.addAll(var4.L());

            for (int var12 = 1; var12 < var3; var12++) {
               class09922 var13 = (class09922)var1.get(var12);
               var15.addAll(var13.L());
               class09916 var14 = var13.N();
               var8 = Math.min(var8, var14.y());
               var9 = Math.min(var9, var14.L());
               var10 = Math.max(var10, var14.y() + var14.u());
               var11 = Math.max(var11, var14.L() + var14.i());
            }

            var0.add(new class09922(new class09916(var8, var9, var10 - var8, var11 - var9), var4.y(), var15));
            var1.clear();
            return var2;
         }
      } else {
         return 0;
      }
   }

   private static boolean N(class10021 var0, class09908 var1, int var2, int var3) {
      return !var0.R(1) && var1.N(var2, var3);
   }

   private static boolean N(class10021 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, List<class10021> var9) {
      boolean var10 = var0.M(1);
      boolean var11 = y(var9);
      return !var10 && !var11 && var0.q().N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private static boolean N(class09980 var0, List<class10021> var1, boolean var2) {
      return var1.isEmpty() ? !var2 : var0.d() != class09976.NONE && !var2;
   }

   private static void N(class10021 var0, List<String> var1) {
      String var2 = var0.N();
      if (var2 != null && !var2.isBlank()) {
         var1.add(var2);
      }
   }

   private static boolean N(class10021 var0, int var1, int var2, int var3, int var4, int var5) {
      return !var0.M(1) && var0.q().N(var1, var2, var3, var4, var5);
   }

   private static class09895 N(class09908 var0) {
      return new class09895(var0.B(), var0.Z());
   }

   private int N(class10021 var1, class09980 var2, class09887 var3, float var4, class09887 var5) {
      float var6 = class09929.N(var2);
      boolean var7 = var6 > 0.0F;
      boolean var8 = var3 != null && var3.N();
      if (!var8 && !var7) {
         return 0;
      } else {
         boolean var9 = var2.d() == class09976.SELF;
         boolean var10 = var9 && var8 && var2.W().y();
         boolean var11 = var8 && class09918.y(var3, var4, var5);
         boolean var12 = false;
         boolean var13 = false;
         boolean var14 = var1.c().P() > 0.0F;
         boolean var15 = var9 && var8 && (!var11 || var10) && !var14;
         if (var15 || var7) {
            class09916 var16 = this.Z.L(var1);
            if (var16.N()) {
               if (var15) {
                  var11 = true;
                  var12 = var10;
               }
            } else {
               float var17 = var16.y();
               float var18 = var16.L();
               float var19 = var16.y() + var16.u();
               float var20 = var16.L() + var16.i();
               if (var15 && !var11 && class09918.N(var3, var17, var18, var19, var20)) {
                  var11 = true;
               }

               if (var15
                  && var10
                  && class09918.N(var3, var2.W().u() + var6, var2.W().i() + var6, var2.W().R() + var6, var2.W().M() + var6, var17, var18, var19, var20)) {
                  var12 = true;
               }

               if (var7) {
                  var13 = N(var1, var2, var6, var17, var18, var19, var20);
               }
            }
         }

         byte var21 = 0;
         if (var11) {
            var21 |= 1;
         }

         if (var12) {
            var21 |= 2;
         }

         if (var13) {
            var21 |= 4;
         }

         return var21;
      }
   }

   private static boolean N(class10021 var0, class09980 var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var0.c().y();
      float var8 = var0.c().L();
      float var9 = Math.max(0.0F, var0.c().u());
      float var10 = Math.max(0.0F, var0.c().i());
      float var11 = var7 + var2;
      float var12 = var8 + var2;
      float var13 = var7 + Math.max(var2, var9 - var2);
      float var14 = var8 + Math.max(var2, var10 - var2);
      return !class09918.N(
         new class09887(var11, var12, Math.max(var11, var13), Math.max(var12, var14)),
         var1.W().u(),
         var1.W().i(),
         var1.W().R(),
         var1.W().M(),
         var3,
         var4,
         var5,
         var6
      );
   }

   private static class09895 N(class09908 var0, class09980 var1, class09887 var2, int var3, class09895 var4) {
      boolean var5 = (var3 & 4) != 0;
      List<class09935> var6 = var5 ? var0.L() : var0.y();
      List var7 = var5 ? var0.u() : List.of();
      List<class09935> var8 = var0.i();
      List<class09935> var9 = var0.R();
      class09926 var10 = (var3 & 2) != 0 ? null : var0.M();
      boolean var12 = var1.d() != class09976.PARENT;
      boolean var13 = var2 != null && var2.N() && (var3 & 1) == 0 && var10 == null;
      int var14 = var8.size() + var4.y() + (var12 ? var9.size() : 0);
      int var15 = var6.size() + var14 + (var12 ? 0 : var9.size()) + var7.size();
      ArrayList var16 = new ArrayList(var6.size() + var8.size() + var4.N().size() + var9.size() + var7.size() + 1);
      var16.addAll(var6);
      if (var14 > 0) {
         if (var10 == null && !var13) {
            var16.addAll(var8);
            var16.addAll(var4.N());
            if (var12) {
               var16.addAll(var9);
            }
         } else {
            ArrayList var17 = new ArrayList(var8.size() + var4.N().size() + (var12 ? var9.size() : 0));
            var17.addAll(var8);
            var17.addAll(var4.N());
            if (var12) {
               var17.addAll(var9);
            }

            class09934 var18 = var10 != null ? new class09934(var10, var17) : null;
            if (var13) {
               Object var19 = var18 != null ? List.of(var18) : var17;
               var16.add(new class09903(var2.y(), var2.L(), var2.u() - var2.y(), var2.i() - var2.L(), (List<class09935>)var19));
            } else {
               var16.add(var18);
            }
         }
      }

      if (!var12) {
         var16.addAll(var9);
      }

      var16.addAll(var7);
      return var16.isEmpty() ? class09895.N : new class09895(var16, var15);
   }

   private class09895 N(class10021 var1, List<String> var2, class09896 var3, float var4, class09887 var5) {
      class09908 var6 = var1.q();
      if (class09918.N(var5)) {
         return class09895.N;
      } else {
         int var7 = var6.y(var5, var4);
         int var8 = var1.O();
         if (N(var1, var6, var7, var8)) {
            var3.N++;
            return N(var6);
         } else {
            class09980 var9 = var1.o();
            class09830 var10 = this.i.N(var1, var9);
            List<class10021> var11 = class10047.N(var1);
            class09887 var12 = class09918.N(var1, var9);
            class09887 var13 = class09918.N(var12, var4, var5);
            boolean var14 = class09918.N(var5, var1, var4);
            if (N(var9, var11, var14)) {
               return class09895.N;
            } else if (u(var9)) {
               return class09895.N;
            } else {
               class09915 var15 = this.u.N(var1);
               int var16 = var6.N(var15);
               int var17 = var6.N(var12);
               int var18 = var6.N(var13, var4);
               int var19 = var1.G();
               int var20 = var1.c().W();
               int var21 = var1.w();
               int var22 = this.N(var1, var9, var12, var4, var5);
               if (N(var1, var8, var19, var20, var21, var16, var17, var18, var22, var11)) {
                  var3.N++;
                  var6.N(var7);
                  return N(var6);
               } else {
                  var3.y++;
                  N(var1, var2);
                  if (!N(var1, var19, var20, var21, var16, var17)) {
                     this.R.N(var1, var9, var10, var15, var12, var19, var20, var21, var16, var17);
                     var3.L++;
                  }

                  class09895 var23 = this.N(N(var11), var2, var3, var4, var13, class09918.N(var1));
                  if ((!var14 || !this.M.N(var1, var9, var10, var15)) && var23.y() == 0) {
                     return class09895.N;
                  } else {
                     class09895 var25 = N(var6, var9, var12, var22, var23);
                     var25 = this.N(var1, var9, var25);
                     var6.N(var25.N(), var25.y(), var8, var18, var22, var7);
                     return N(var6);
                  }
               }
            }
         }
      }
   }

   class09936 N(class10021 var1, float var2, float var3, class09770 var4, boolean var5) {
      if (var1 == null) {
         return class09936.N();
      } else {
         class09770 var6 = var4 == null ? class09770.N : var4;
         class09896 var7 = new class09896();
         ArrayList var8 = new ArrayList();
         class09887 var9 = class09918.N(var2, var3);
         this.z = var9;
         class09895 var10 = this.N(var1, var8, var7, 0.0F, var9);
         var1.I();
         class09895 var11 = this.N(var1, var10, var8, var7);
         this.B.N(var1, var11.y(), var7, var6);
         return this.B.N(var1, var11, var8, var5);
      }
   }

   class09936 N(class10021 var1, float var2, float var3) {
      return this.N(var1, var2, var3, class09770.N, false);
   }

   private class09895 N(class10021 var1, class09895 var2, class09914 var3, float var4) {
      class09916 var5 = N(this.Z.y(var1), var3.N() + var4);
      if (var5.N()) {
         return class09895.N;
      } else {
         List var6 = List.of(new class09922(var5, var3, var2.N()));
         return new class09895(var6, var2.y());
      }
   }

   private static class09916 N(class09916 var0, float var1) {
      return var1 <= 0.0F ? var0 : new class09916(var0.y() - var1, var0.L() - var1, var0.u() + var1 * 2.0F, var0.i() + var1 * 2.0F);
   }

   private class09895 N(List<class10021> var1, List<String> var2, class09896 var3, float var4, class09887 var5, float var6) {
      if (var1.isEmpty()) {
         return class09895.N;
      } else {
         boolean var7 = var6 > 0.0F;
         ArrayList var8 = new ArrayList(var1.size() + 1);
         int var9 = 0;
         ArrayList var10 = null;
         int var11 = 0;
         ArrayList var12 = null;
         float var13 = 0.0F;
         int var14 = 0;

         for (class10021 var16 : var1) {
            boolean var17 = class10019.y(var16);
            float var18 = !var17 ? var4 : var4 - var6;
            class09895 var19 = this.N(var16, var2, var3, var18, var5);
            if (!var19.N().isEmpty()) {
               if (var7 && var17) {
                  var9 += N(var8, var12, var14);
                  var14 = 0;
                  if (var10 == null) {
                     var10 = new ArrayList();
                  }

                  var10.addAll(var19.N());
                  var11 += var19.y();
               } else {
                  if (var10 != null) {
                     var8.add(class09919.N(0.0F, -var6, var10));
                     var9 += var11;
                     var10 = null;
                     var11 = 0;
                  }

                  class09922 var20 = N(var19);
                  if (var20 == null) {
                     var9 += N(var8, var12, var14);
                     var14 = 0;
                     var8.addAll(var19.N());
                     var9 += var19.y();
                  } else {
                     float var21 = ((class09932)var20.y()).y();
                     if (var12 == null || var12.isEmpty() || var21 != var13 || N(var12, var20.N())) {
                        var9 += N(var8, var12, var14);
                        var14 = 0;
                        if (var12 == null) {
                           var12 = new ArrayList();
                        }

                        var13 = var21;
                     }

                     var12.add(var20);
                     var14 += var19.y();
                  }
               }
            }
         }

         var9 += N(var8, var12, var14);
         if (var10 != null) {
            var8.add(class09919.N(0.0F, -var6, var10));
            var9 += var11;
         }

         return var8.isEmpty() ? class09895.N : new class09895(var8, var9);
      }
   }

   private static class09922 N(class09895 var0) {
      List<class09935> var1 = var0.N();
      return var1.size() == 1 && var1.get(0) instanceof class09922 var2 && var2.y() instanceof class09932 ? var2 : null;
   }

   private static class09895 N(float var0, class09895 var1) {
      List var2 = List.of(new class09899(var0, var1.N()));
      return new class09895(var2, var1.y());
   }

   private static boolean N(class09980 var0) {
      return var0.G() != 1.0F || var0.l() != 0.0F;
   }

   private class09895 N(class10021 var1, class09980 var2, class09895 var3) {
      if (var3.y() == 0) {
         return var3;
      } else {
         float var4 = 0.0F;
         boolean var5 = L(var2);
         if (var5) {
            class09888 var6 = new class09888(var2.C());
            var3 = this.N(var1, var3, var6, var4);
            if (var3.y() == 0) {
               return var3;
            }

            var4 += var6.N();
         }

         if (y(var2)) {
            if (!var5 && this.Z.N(var1)) {
               var3 = N(var2.f(), var3);
            } else {
               var3 = this.N(var1, var3, new class09932(var2.f()), var4);
            }
         }

         if (N(var2) && var3.y() > 0) {
            float var8 = var1.c().y() + var1.c().u() / 2.0F;
            float var7 = var1.c().L() + var1.c().i() / 2.0F;
            var3 = this.N(var1, var3, new class09901(var8, var7, var2.G(), var2.l()), var4);
         }

         return var3;
      }
   }
}
