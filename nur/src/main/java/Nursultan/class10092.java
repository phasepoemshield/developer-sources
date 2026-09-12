package Nursultan;

import minecraft.class03037;
import minecraft.class04039;
import minecraft.class04995;

public class class10092 extends class10099 {
   public class10092(class03037 var1, class04039 var2, boolean var3) {
      super(var2);
      this.i = var1;
      this.N = var2;
      this.y = var3;
   }

   protected boolean N() {
      int var1 = this.y ? this.L.b : this.L.j;
      int var2 = this.i.L() ? this.L.E : 0;
      int var3 = this.i.u() == 0 ? 0 : (int)class04995.y(this.L.N(), -1.0, 1.0, 0.0, (double)this.i.u());
      return var1 <= 1 + this.i.y() + var2 + var3;
   }
}
