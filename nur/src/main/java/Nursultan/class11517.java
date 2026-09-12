package Nursultan;

import java.util.List;
import java.util.function.BooleanSupplier;

public class class11517<T extends class11535> extends class11536<T> {
   public Object N_0;

   public List<T> L() {
      this.M();
      return List.copyOf((List)this.N_0);
   }

   private void M() {
   }

   public class11517(class12018 var1, List<T> var2) {
      super(var1, null);
      this.M();
      this.N_0 = var2;
      long var3 = var2.stream().filter(class11535::U).count();
      if (var3 <= 0L) {
         throw new IllegalArgumentException("No value is selected");
      } else if (var3 > 1L) {
         throw new IllegalArgumentException("More than one value is selected");
      } else {
         this.L(var2.stream().filter(class11535::U).findFirst().orElseThrow());
         this.y(this.i());
      }
   }

   @Override
   public void u() {
      this.y(this.U());
   }

   public void y(class11535 var1) {
      this.M();
      if (var1 != null && ((List)this.N_0).contains(var1)) {
         ((List)this.N_0).forEach(var1x -> var1x.M(var1x == var1));
         this.L((T)var1);
      } else {
         throw new IllegalArgumentException("Entry is null or not found");
      }
   }

   public void N(T var1) {
      throw new UnsupportedOperationException("Use selectEntry instead of setValue");
   }

   public class11517<T> N(BooleanSupplier var1, T var2) {
      this.M();
      if (var2 != null && ((List)this.N_0).contains(var2)) {
         this.N(var1, (T)var2);

         for (class11535 var4 : (List)this.N_0) {
            var4.N_5(() -> var1.getAsBoolean() ? var4 == var2 : null);
         }

         return this;
      } else {
         throw new IllegalArgumentException("Entry is null or not found");
      }
   }

   @Override
   public boolean c_() {
      class11535 var1 = this.W();
      class11535 var2 = this.U();
      return !var1.E().N().equals(var2.E().N());
   }
}
