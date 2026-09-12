package Nursultan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

final class class09879 {
   private final class09872 N;
   private final Runnable y;
   private final class09874 L;
   private final Map<class09829, class09840<?>> u = new HashMap<>();
   private final Map<String, class09840<?>> i = new HashMap<>();
   private final Map<class09829, class09848<?>> R = new HashMap<>();
   private final Set<class09874> M = new HashSet<>();
   private final Set<class09829> B = new HashSet<>();
   private final Set<class09829> Z = new HashSet<>();
   private class09862 z;
   private boolean U;

   void L() {
      if (this.U) {
         for (class09829 var2 : this.Z) {
            class09848<?> var3 = this.R.get(var2);
            if (var3 != null) {
               var3.y();
            }
         }

         this.u.entrySet().removeIf(var1 -> this.N(var1.getKey(), var1.getValue()));
         this.R.keySet().removeIf(var1 -> !this.Z.contains(var1));
         this.M.clear();
         this.B.clear();
         this.Z.clear();
         this.z = null;
         this.U = false;
      }
   }

   class09879(class09872 var1, Runnable var2, String var3) {
      this.N = Objects.requireNonNull(var1, "tickerManager");
      this.y = Objects.requireNonNull(var2, "requestRender");
      this.L = class09874.N(var3);
   }

   boolean i() {
      if (this.R.isEmpty()) {
         return false;
      } else {
         Iterator<class09848<?>> var1 = this.R.values().iterator();

         while (var1.hasNext()) {
            if (var1.next().N()) {
               return true;
            }
         }

         return false;
      }
   }

   void u() {
      for (class09829 var2 : this.B) {
         class09840<?> var3 = this.u.get(var2);
         if (var3 != null && var3.L) {
            this.N(var3);
         }
      }

      this.M.clear();
      this.B.clear();
      this.Z.clear();
      this.z = null;
      this.U = false;
   }

   <T extends class09819> T y(class09874 var1, String var2, Supplier<T> var3, class09783 var4) {
      class09829 var5 = this.N(var1, var2, "ticker name");
      class09783 var6 = this.N(var4);
      class09840<?> var7 = this.u.get(var5);
      if (var7 != null) {
         if (!var7.L) {
            throw new IllegalStateException("State name is already used by a value: " + var5);
         } else {
            var7.y = var6;
            class09819 var10 = (class09819)var7.N;
            this.N(var5, var10);
            return (T)var10;
         }
      } else {
         class09819 var8 = this.N(var3, var5);
         class09840 var9 = new class09840<>(var8, var6, true, this.y);
         this.u.put(var5, var9);
         this.N(var5, var8);
         return (T)var8;
      }
   }

   class09809 y() {
      return this.N(this.L);
   }

   private class09829 N(class09874 var1, String var2, String var3) {
      return new class09829(var1, class09853.N(var2, var3));
   }

   private void N(class09829 var1, class09819 var2) {
      this.B.add(var1);
      this.N.N(var2, this.y);
   }

   private void N(class09840<?> var1) {
      this.N.N((class09819)var1.N);
   }

   private boolean N(class09829 var1, class09840<?> var2) {
      boolean var3 = this.B.contains(var1);
      if (var2.L && !var3) {
         this.N(var2);
      }

      boolean var4 = var2.y == class09783.WHILE_MOUNTED && !this.M.contains(var1.N());
      if (var4 && var2.L && var3) {
         this.N(var2);
      }

      return var4;
   }

   private <T extends class09819> T N(Supplier<T> var1, class09829 var2) {
      return Objects.requireNonNull((T)Objects.requireNonNull(var1, "initialValue").get(), "Ticker supplier returned null: " + var2);
   }

   private <T> T N(Supplier<T> var1) {
      return (T)(var1 == null ? null : var1.get());
   }

   private class09783 N(class09783 var1) {
      return var1 == null ? class09783.WHILE_MOUNTED : var1;
   }

   void N(class09874 var1, String var2) {
      class09840<?> var3 = this.u.remove(this.N(var1, var2, "state name"));
      if (var3 != null && var3.L) {
         this.N(var3);
      }
   }

   <T> class09785<T> N(String var1, Supplier<T> var2) {
      String var3 = class09853.N(var1, "app state name");
      class09840<?> var4 = this.i.get(var3);
      if (var4 != null) {
         return (class09785<T>)var4;
      } else {
         class09840 var5 = new class09840<>(this.N(var2), class09783.MANUAL, false, this.y);
         this.i.put(var3, var5);
         return var5;
      }
   }

   <T> class09785<T> N(class09874 var1, String var2, Supplier<T> var3, class09783 var4) {
      class09829 var5 = this.N(var1, var2, "state name");
      class09783 var6 = this.N(var4);
      class09840<?> var7 = this.u.get(var5);
      if (var7 != null) {
         if (var7.L) {
            throw new IllegalStateException("State name is already used by a ticker: " + var5);
         } else {
            var7.y = var6;
            return (class09785<T>)var7;
         }
      } else {
         class09840 var8 = new class09840<>(this.N(var3), var6, false, this.y);
         this.u.put(var5, var8);
         return var8;
      }
   }

   class09809 N(class09874 var1) {
      if (!this.U) {
         throw new IllegalStateException("State scope can only be opened while rendering");
      } else if (!this.M.add(var1)) {
         throw new IllegalStateException("Duplicate state scope path: " + var1);
      } else {
         return new class09845(this, var1);
      }
   }

   void N() {
      if (this.U) {
         throw new IllegalStateException("Stateful render is already in progress");
      } else {
         this.M.clear();
         this.B.clear();
         this.Z.clear();
         this.z = null;
         this.U = true;
      }
   }

   <C> class09798 N(class09874 var1, String var2, class09788<C> var3, C var4) {
      String var5 = class09853.N(var2, "component key");
      class09788 var6 = Objects.requireNonNull(var3, "component");
      class09874 var7 = var1.y(var5);
      class09809 var8 = this.N(var7);
      return Objects.requireNonNull(var6.render(var4, var8), "Stateful component returned null: " + var7);
   }

   <T> class09798 N(class09804<T> var1, T var2, Supplier<class09798> var3) {
      Objects.requireNonNull(var1, "context");
      Objects.requireNonNull(var3, "render");
      class09862 var4 = this.z;
      this.z = new class09862(var4, var1, var2);

      class09798 var5;
      try {
         var5 = Objects.requireNonNull((class09798)var3.get(), "Context provider returned null: " + var1);
      } finally {
         this.z = var4;
      }

      return var5;
   }

   <T> T N(class09804<T> var1) {
      class09804 var2 = Objects.requireNonNull(var1, "context");
      Object var3 = this.z == null ? class09862.N : this.z.N(var2);
      if (var3 != class09862.N) {
         return (T)var3;
      } else if (var2.N()) {
         return (T)var2.y();
      } else {
         throw new class09775("Missing context: " + var2);
      }
   }

   <T> T N(class09874 var1, String var2, Supplier<T> var3, class09805<T> var4) {
      class09829 var5 = this.N(var1, var2, "observable name");
      Supplier var6 = Objects.requireNonNull(var3, "snapshot");
      class09805 var7 = Objects.requireNonNull(var4, "changeDetector");
      Object var8 = var6.get();
      class09848<?> var9 = this.R.get(var5);
      if (var9 == null) {
         this.R.put(var5, new class09848<>(var8, var6, var7));
      } else {
         var9.y = var8;
         var9.L = var6;
         var9.u = var7;
      }

      this.Z.add(var5);
      return (T)var8;
   }
}
