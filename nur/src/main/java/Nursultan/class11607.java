package Nursultan;

import java.util.Objects;

public class class11607 implements class09780 {
   public Object N_0;
   public Object N_1;

   private void L() {
   }

   public class11607(class09666 var1, class09666 var2, class11863 var3) {
      this.L();
      Objects.requireNonNull(var3, "spec");
      this.N_0 = new class11833(var1.y(), var2.y(), var3);
      this.N_1 = new class11833(var1.L(), var2.L(), var3);
   }

   @Override
   public boolean y() {
      return ((class11833)this.N_0).y() && ((class11833)this.N_1).y();
   }

   @Override
   public boolean N(float var1) {
      boolean var2 = ((class11833)this.N_0).N(var1);
      boolean var3 = ((class11833)this.N_1).N(var1);
      return var2 || var3;
   }

   @Override
   public boolean N(class09753 var1) {
      class09666 var2 = var1.i();
      boolean var3 = ((class11833)this.N_0).y(var2.y());
      boolean var4 = ((class11833)this.N_1).y(var2.L());
      return var3 || var4;
   }

   @Override
   public class09753 N() {
      return class09753.N(class09666.N(((class11833)this.N_0).L(), ((class11833)this.N_1).L()));
   }
}
