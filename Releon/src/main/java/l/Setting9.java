package l;

import java.util.function.Supplier;

public class Setting9 extends Helper264 {
   private int key = -1;
   private int type = 1;

   public Setting9(String var1, String var2) {
      super(var1, var2);
   }

   public Setting9 method2705(Supplier<Boolean> var1) {
      this.method2704(var1);
      return this;
   }

   public int getKey() {
      return this.key;
   }

   public int getType() {
      return this.type;
   }

   public Setting9 method2706(int var1) {
      this.key = var1;
      return this;
   }

   public Setting9 method2707(int var1) {
      this.type = var1;
      return this;
   }
}
