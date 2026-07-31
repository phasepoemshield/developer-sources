package l;

import java.util.function.Supplier;

public class Setting4 extends Helper264 {
   private Runnable runnable;
   private String buttonName;

   public Setting4(String var1, String var2) {
      super(var1, var2);
   }

   public Setting4 method2215(Supplier<Boolean> var1) {
      this.method2704(var1);
      return this;
   }

   public Runnable method2216() {
      return this.runnable;
   }

   public String method2217() {
      return this.buttonName;
   }

   public Setting4 method2218(Runnable var1) {
      this.runnable = var1;
      return this;
   }

   public Setting4 method2219(String var1) {
      this.buttonName = var1;
      return this;
   }
}
