package l;

import java.util.function.Supplier;

public class Helper264 {
   private final String name;
   private String description;
   private Supplier<Boolean> visible;

   public Helper264(String var1) {
      this.name = var1;
   }

   public Helper264(String var1, String var2) {
      this.name = var1;
      this.description = var2;
   }

   public boolean method2701() {
      return this.visible == null || this.visible.get();
   }

   public String getName() {
      return this.name;
   }

   public String method2702() {
      return this.description;
   }

   public Supplier<Boolean> method2703() {
      return this.visible;
   }

   public void method2704(Supplier<Boolean> var1) {
      this.visible = var1;
   }
}
