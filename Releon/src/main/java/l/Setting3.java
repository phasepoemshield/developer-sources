package l;

import java.util.function.Supplier;

public class Setting3 extends Helper264 {
   private boolean value;
   private int key = -1;
   private int type = 1;

   public Setting3(String var1, String var2) {
      super(var1, var2);
   }

   public Setting3 method2199(Supplier<Boolean> var1) {
      this.method2704(var1);
      return this;
   }

   public boolean method2200() {
      return this.value;
   }

   public int getKey() {
      return this.key;
   }

   public int getType() {
      return this.type;
   }

   public Setting3 method2201(boolean var1) {
      this.value = var1;
      return this;
   }

   public Setting3 method2202(int var1) {
      this.key = var1;
      return this;
   }

   public Setting3 method2203(int var1) {
      this.type = var1;
      return this;
   }
}
