package Nursultan;

import java.util.Objects;

public final class class09843<P> {
   private final class09832 N;
   private final class09788<P> y;
   private final class09879 L;
   private class09841 u;
   private P i;
   private boolean R;
   private class09810 M = class09810.N();

   private void L() {
      class09798 var1 = this.R();

      try {
         this.u = this.N.N(var1);
         this.L.L();
         this.R = false;
      } catch (RuntimeException var3) {
         this.L.u();
         throw var3;
      }
   }

   private class09843(class09832 var1, String var2, class09788<P> var3, P var4) {
      this.N = Objects.requireNonNull(var1, "engine");
      this.y = Objects.requireNonNull(var3, "root");
      class09872 var5 = class09872.N(var1.N());
      this.L = new class09879(var5, this::y, var2);
      this.i = (P)var4;
   }

   private void i() {
      if (!this.R && this.L.i()) {
         this.y();
      }
   }

   private void u() {
      if (this.R) {
         class09798 var1 = this.R();
         class09810 var2 = this.M;

         try {
            this.u.N(var1, var2);
            this.L.L();
            this.R = false;
            this.M = class09810.N();
         } catch (RuntimeException var4) {
            this.L.u();
            throw var4;
         }
      }
   }

   public void y() {
      this.N(class09810.N());
   }

   public class09936 N(int var1, int var2, float var3) {
      this.i();
      this.u();
      return this.N.N(this.u, var1, var2, var3);
   }

   public void N(P var1) {
      this.i = (P)var1;
      this.y();
   }

   private static class09810 N(class09810 var0, class09810 var1) {
      Objects.requireNonNull(var0, "current");
      Objects.requireNonNull(var1, "next");
      return var0.L() != class09787.REMOVE_IMMEDIATELY && var1.L() != class09787.REMOVE_IMMEDIATELY ? class09810.N() : class09810.y();
   }

   public static <P> class09843<P> N(class09832 var0, String var1, class09788<P> var2, P var3) {
      class09843 var4 = new class09843<>(var0, var1, var2, var3);
      var4.L();
      return var4;
   }

   public class09841 N() {
      return this.u;
   }

   public void N(P var1, class09810 var2) {
      Objects.requireNonNull(var2, "renderOptions");
      this.i = (P)var1;
      this.N(var2);
   }

   public void N(class09810 var1) {
      Objects.requireNonNull(var1, "renderOptions");
      this.R = true;
      this.M = N(this.M, var1);
   }

   private class09798 R() {
      this.L.N();

      try {
         class09809 var1 = this.L.y();
         return Objects.requireNonNull(this.y.render(this.i, var1), "Root stateful component returned null");
      } catch (RuntimeException var2) {
         this.L.u();
         throw var2;
      }
   }
}
