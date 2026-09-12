package Nursultan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class class10021 implements class09904 {
   private final String N;
   private final class10049 y;
   private final List<class10021> L = new ArrayList<>();
   private final List<class10021> u = Collections.unmodifiableList(this.L);
   private Map<class09867, List<class10016>> i;
   private final class09937 R = new class09937(this);
   private final class09908 M = new class09908();
   private final class10034 B;
   private class09841 Z;
   private class10021 z;
   private int U = -1;
   private boolean E;
   private boolean W;
   private boolean m;
   private boolean P;
   private String s;
   private int T = 3;
   private int b = 3;
   private int j = 1;
   private class09991 v = class09991.N;
   private List<class09992> n = List.of();
   private class09980 t = class09968.N();
   private class10002 G;
   private class09980 l;
   private boolean d;
   private int w;
   private int k;
   private int Y;
   private int Q;
   private int O;
   private int g;
   private int I;
   private int J;

   public int w() {
      return this.Q;
   }

   public void L(int var1) {
      this.z(var1);
   }

   @Override
   public void L(String var1) {
      String var2 = var1 == null ? "" : var1;
      if (!this.B.u().equals(var2)) {
         this.B.L(var2);
         this.p();
         this.i(1);
      }
   }

   private static boolean L(class09980 var0, class09980 var1) {
      return var0.M() == var1.M()
         && var0.w() == var1.w()
         && var0.k() == var1.k()
         && N(var0.Y().N(), var1.Y().N())
         && N(var0.Y().y(), var1.Y().y())
         && N(var0.Y().L(), var1.Y().L())
         && N(var0.Y().u(), var1.Y().u());
   }

   private boolean L(List<class10021> var1) {
      for (int var2 = 0; var2 < this.L.size(); var2++) {
         if (this.L.get(var2) != var1.get(var2)) {
            return false;
         }
      }

      return true;
   }

   public void L(boolean var1) {
      this.m = var1;
   }

   @Override
   public List<class10021> L() {
      return this.u;
   }

   public int M() {
      return this.U;
   }

   public boolean M(int var1) {
      return var1 == 1 ? this.x() : class10057.N(this.T, var1);
   }

   @Override
   public boolean P() {
      return this.E;
   }

   @Override
   public class09841 K() {
      return this.Z;
   }

   public boolean T() {
      return this.d;
   }

   public int Q() {
      return this.I;
   }

   public class10021(class10049 var1) {
      this(null, var1);
   }

   public class10021(String var1, class10049 var2) {
      this.N = var1 != null && !var1.isBlank() ? var1 : null;
      this.y = Objects.requireNonNull(var2, "type");
      this.B = class10034.N(var2);
   }

   public class10021 B(int var1) {
      if (var1 >= 0 && var1 < this.L.size()) {
         class10021 var2 = this.L.remove(var1);
         if (var2 != null) {
            if (var2.j > 0) {
               this.U(-var2.j);
            }

            var2.z = null;
            var2.a();
            var2.N(null);
         }

         this.A();
         this.i(2);
         return var2;
      } else {
         return null;
      }
   }

   @Override
   public String B() {
      return this.B.y();
   }

   private void C() {
      for (class10021 var1 = this; var1 != null; var1 = var1.z) {
         var1.J++;
      }
   }

   private void D() {
      if (this.j > 0) {
         this.b |= 1;
      } else {
         this.b &= -2;
      }
   }

   private void F() {
      this.Q++;
      this.O++;
      this.C();
   }

   public void I() {
      this.S();
   }

   public class09937 c() {
      return this.R;
   }

   private int S() {
      if (this.j == 0) {
         return 0;
      } else {
         boolean var1 = this.x();
         this.T &= -2;
         int var2 = var1 && !this.x() ? 1 : 0;

         for (class10021 var4 : this.L) {
            if (var4.j != 0) {
               var2 += var4.S();
            }
         }

         if (var2 > 0) {
            this.j -= var2;
         }

         this.D();
         return var2;
      }
   }

   @Override
   public String Z() {
      return this.B.L();
   }

   private int Z(int var1) {
      boolean var2 = this.x();
      this.T = class10057.y(this.T, var1);
      this.b = class10057.y(this.b, var1);
      this.M.U();
      this.M.E();
      int var3 = !var2 && this.x() ? 1 : 0;

      for (class10021 var5 : this.L) {
         var3 += var5.Z(var1);
      }

      if (var3 > 0) {
         this.j += var3;
      }

      return var3;
   }

   public void V() {
      if (this.i != null) {
         Iterator<List<class10016>> var1 = this.i.values().iterator();

         while (var1.hasNext()) {
            Iterator<class10016> var3 = var1.next().iterator();

            while (var3.hasNext()) {
               var3.next().L = true;
            }
         }

         this.i = null;
      }
   }

   void e() {
      this.C();
   }

   @Override
   public class09991 i() {
      return this.v;
   }

   public void i(int var1) {
      int var2 = class10057.y(0, var1);
      boolean var3 = this.x();
      this.T = class10057.y(this.T, var2);
      this.b = class10057.y(this.b, var2);
      if (!var3 && this.x()) {
         this.U(1);
      }

      this.M.U();
      this.M.E();

      for (class10021 var4 = this.z; var4 != null; var4 = var4.z) {
         var4.b = class10057.y(var4.b, var2);
         var4.M.E();
      }
   }

   public void b() {
      if (!this.d) {
         this.d = true;
         this.u(1);
      }
   }

   private boolean x() {
      return class10057.N(this.T, 1) || class10057.N(this.T, 2) || class10057.N(this.T, 4) || class10057.N(this.T, 8);
   }

   String s() {
      return this.s;
   }

   public class10002 n() {
      return this.G;
   }

   private void f() {
      this.I++;
   }

   public int l() {
      return this.k;
   }

   public int d() {
      return this.Y;
   }

   private void a() {
      this.U = -1;
      Iterator<class10021> var1 = this.L.iterator();

      while (var1.hasNext()) {
         var1.next().a();
      }
   }

   @Override
   public boolean m() {
      return this.P;
   }

   public class09980 o() {
      return this.t;
   }

   private void p() {
      this.Q++;
      this.C();
   }

   public int k() {
      return this.O;
   }

   public class09980 t() {
      return this.l;
   }

   public int g() {
      return this.b;
   }

   public List<class09992> v() {
      return this.n;
   }

   public void j() {
      if (this.d) {
         this.d = false;
         this.u(1);
      }
   }

   public class09908 q() {
      return this.M;
   }

   @Override
   public class09938 U() {
      return this.B.N();
   }

   private void U(int var1) {
      if (var1 != 0) {
         for (class10021 var2 = this; var2 != null; var2 = var2.z) {
            var2.j += var1;
            var2.D();
         }
      }
   }

   private int z(int var1) {
      boolean var2 = this.x();
      this.T &= ~var1;
      int var3 = (var1 & 1) != 0 && var2 && !this.x() ? 1 : 0;

      for (class10021 var5 : this.L) {
         var3 += var5.z(var1);
      }

      this.b &= ~var1;
      if ((var1 & 1) != 0 && var3 > 0) {
         this.j -= var3;
      }

      this.D();
      return var3;
   }

   @Override
   public String z() {
      return this.B.u();
   }

   public int u() {
      return this.L.size();
   }

   private void u(List<class10021> var1) {
      IdentityHashMap var2 = new IdentityHashMap();

      for (class10021 var4 : this.L) {
         var2.put(var4, Boolean.TRUE);
      }

      IdentityHashMap var6 = new IdentityHashMap();

      for (class10021 var5 : var1) {
         if (var5 == null || var5.z != this || !var2.containsKey(var5)) {
            throw new IllegalArgumentException("Reordered child list contains an element outside this parent");
         }

         if (var6.put(var5, Boolean.TRUE) != null) {
            throw new IllegalArgumentException("Reordered child list contains duplicate elements");
         }
      }
   }

   public void u(boolean var1) {
      this.P = var1;
   }

   void u(String var1) {
      this.s = var1 != null && !var1.isBlank() ? var1 : null;
   }

   private static boolean u(class09980 var0, class09980 var1) {
      return var0.s() == var1.s() && var0.T() == var1.T() && var0.b() == var1.b();
   }

   public void u(int var1) {
      int var2 = class10057.y(0, var1);
      int var3 = this.Z(var2);

      for (class10021 var4 = this.z; var4 != null; var4 = var4.z) {
         var4.b = class10057.y(var4.b, var2);
         if (var3 > 0) {
            var4.j += var3;
         }

         var4.M.E();
      }
   }

   public boolean y(class10021 var1) {
      if (var1 == null) {
         return false;
      } else {
         int var2 = this.L.indexOf(var1);
         if (var2 < 0) {
            return false;
         } else {
            this.B(var2);
            return true;
         }
      }
   }

   @Override
   public void y(class09867 var1, class09836 var2) {
      if (var1 != null && var2 != null && this.i != null) {
         List<class10016> var3 = this.i.get(var1);
         if (var3 != null) {
            var3.removeIf(var1x -> {
               if (var1x.N != var2) {
                  return false;
               } else {
                  var1x.L = true;
                  return true;
               }
            });
            if (var3.isEmpty()) {
               this.i.remove(var1);
            }
         }
      }
   }

   @Override
   public class10049 y() {
      return this.y;
   }

   public void y(int var1) {
      this.U = Math.max(-1, var1);
   }

   private static boolean y(class09980 var0, class09980 var1) {
      return N(var0.c(), var1.c()) && Objects.equals(var0.X(), var1.X());
   }

   @Override
   public void y(String var1) {
      String var2 = var1 == null ? "" : var1;
      if (!this.B.L().equals(var2)) {
         this.B.y(var2);
         this.p();
         this.i(1);
      }
   }

   public void y(List<class10021> var1) {
      if (var1 == null || var1.size() != this.L.size()) {
         throw new IllegalArgumentException("Reordered child list must contain every current child exactly once");
      } else if (!this.L(var1)) {
         this.u(var1);
         this.L.clear();
         this.L.addAll(var1);
         this.A();
         this.i(2);
      }
   }

   public void y(boolean var1) {
      this.W = var1;
   }

   @Override
   public boolean E() {
      return this.W;
   }

   private void A() {
      this.g++;
      this.I++;
      this.C();
   }

   public boolean N(class09992 var1) {
      return var1 != null && class09963.N(this.n, var1);
   }

   @Override
   public void N(String var1) {
      String var2 = var1 == null ? "" : var1;
      if (!this.B.y().equals(var2)) {
         this.B.N(var2);
         if (this.y == class10049.TEXT) {
            this.R.N("");
         }

         this.F();
         this.i(this.y == class10049.TEXT ? 2 : 1);
      }
   }

   public void N(class09991 var1) {
      this.v = var1 == null ? class09991.N : var1;
   }

   public void N(boolean var1) {
      this.E = var1;
   }

   private static boolean N(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   public class10021 N(int var1) {
      return this.L.get(var1);
   }

   public void N(class10002 var1, class09980 var2) {
      this.G = var1;
      this.l = var2;
   }

   public void N(class09980 var1) {
      class09980 var2 = var1 == null ? class09968.N() : var1;
      class09980 var3 = this.t;
      if (!Objects.equals(var3, var2)) {
         boolean var4 = var3 != null && var3.s() == class09969.FIXED;
         boolean var5 = var2.s() == class09969.FIXED;
         if (this.Z != null && var4 != var5) {
            this.Z.N(var5 ? 1 : -1);
         }

         boolean var6 = var3 != null && var3.L();
         boolean var7 = var2.L();
         if (this.Z != null && var6 != var7) {
            this.Z.y(var7 ? 1 : -1);
         }

         this.t = var2;
         this.N(var3, var2);
      }
   }

   @Override
   public String N() {
      return this.N;
   }

   public void N(List<class09992> var1) {
      this.n = class09963.N(var1);
   }

   @Override
   public void N(class09938 var1) {
      if (this.B.N() != var1) {
         this.B.N(var1);
         this.p();
         this.i(1);
      }
   }

   @Override
   public void N(class09867 var1, class09836 var2, class09876 var3) {
      if (var1 != null && var2 != null) {
         class09876 var4 = var3 == null ? class09876.N : var3;
         if (this.i == null) {
            this.i = new EnumMap<>(class09867.class);
         }

         this.i.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(new class10016(var2, var4));
      }
   }

   public void N(class09860 var1, boolean var2) {
      if (var1 != null && var1.i() != null && this.i != null) {
         List<class10016> var3 = this.i.get(var1.i());
         if (var3 != null && !var3.isEmpty()) {
            for (class10016 var6 : List.copyOf(var3)) {
               if (!var6.L && var6.y.u() == var2) {
                  var1.N(var6.y.R());

                  try {
                     var6.N.handle(var1);
                  } finally {
                     var1.v();
                  }

                  if (var6.y.i()) {
                     var6.L = true;
                     var3.remove(var6);
                  }

                  if (var1.W()) {
                     break;
                  }
               }
            }

            if (var3.isEmpty()) {
               this.i.remove(var1.i());
            }
         }
      }
   }

   public boolean N(class09867 var1) {
      if (var1 != null && this.i != null) {
         List<class10016> var2 = this.i.get(var1);
         if (var2 != null && !var2.isEmpty()) {
            Iterator<class10016> var3 = var2.iterator();

            while (var3.hasNext()) {
               if (!var3.next().L) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void N(int var1, class10021 var2) {
      if (var2 != null) {
         if (this.y == class10049.CANVAS) {
            throw new IllegalStateException("Element type '" + this.y + "' cannot have children");
         } else {
            int var3 = class09693.N(var1, 0, this.L.size());
            var2.z = this;
            var2.a();
            var2.N(this.Z);
            this.L.add(var3, var2);
            if (var2.j > 0) {
               this.U(var2.j);
            }

            this.A();
            this.i(2);
         }
      }
   }

   public void N(class09841 var1) {
      class09841 var2 = this.Z;
      if (var2 != var1 && this.t != null && this.t.s() == class09969.FIXED) {
         if (var2 != null) {
            var2.N(-1);
         }

         if (var1 != null) {
            var1.N(1);
         }
      }

      if (var2 != var1 && this.t != null && this.t.L()) {
         if (var2 != null) {
            var2.y(-1);
         }

         if (var1 != null) {
            var1.y(1);
         }
      }

      this.Z = var1;
      Iterator<class10021> var3 = this.L.iterator();

      while (var3.hasNext()) {
         var3.next().N(var1);
      }
   }

   private void N(class09980 var1, class09980 var2) {
      this.w++;
      if (!y(var1, var2)) {
         this.k++;
      }

      if (!L(var1, var2)) {
         this.Y++;
      }

      this.C();
      if (!u(var1, var2)) {
         this.H();
      }
   }

   public void N(class10021 var1) {
      this.N(this.L.size(), var1);
   }

   @Override
   public void N(class09867 var1, class09836 var2) {
      this.N(var1, var2, class09876.N);
   }

   @Override
   public boolean W() {
      return this.m;
   }

   public boolean R(int var1) {
      return var1 == 1 ? this.j > 0 : class10057.N(this.b, var1);
   }

   public class10021 X() {
      return this.z;
   }

   public int O() {
      return this.J;
   }

   void H() {
      if (this.z != null) {
         this.z.f();
      }
   }

   public int G() {
      return this.w;
   }

   public int Y() {
      return this.g;
   }
}
