package l;

import java.util.List;

public class Helper358 {
   private static Helper358 instance;
   private boolean enabled = false;

   private Helper358() {
   }

   public static Helper358 method3577() {
      if (instance == null) {
         instance = new Helper358();
      }

      return instance;
   }

   public void method3578(boolean var1) {
      this.enabled = var1;
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public List<Helper465> method3579() {
      return Helper359.method3582();
   }

   public void method3580(Helper465 var1) {
      var1.method367(!var1.isEnabled());
   }
}
