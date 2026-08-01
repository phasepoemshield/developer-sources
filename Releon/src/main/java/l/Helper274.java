package l;

import java.util.List;

public class Helper274 {
   private final List<Helper242> modules;

   public <T extends Helper242> T method2751(String var1) {
      return this.modules.stream().filter(var1x -> var1x.getName().equalsIgnoreCase(var1)).map(var0 -> (T)var0).findFirst().orElse(null);
   }

   public <T extends Helper242> T method2752(Class<T> var1) {
      return this.modules.stream().filter(var1x -> var1.isAssignableFrom(var1x.getClass())).map(var1::cast).findFirst().orElse(null);
   }

   public List<Helper242> method2753() {
      return this.modules;
   }

   public Helper274(List<Helper242> var1) {
      this.modules = var1;
   }
}
