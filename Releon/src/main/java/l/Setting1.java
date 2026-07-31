package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Setting1 extends Helper264 {
   private boolean value;
   private List<Helper264> subSettings = new ArrayList<>();

   public Setting1(String var1, String var2) {
      super(var1, var2);
   }

   public Setting1 method1971(Helper264... var1) {
      this.subSettings.addAll(Arrays.asList(var1));
      return this;
   }

   public Setting1 method1972(Supplier<Boolean> var1) {
      this.method2704(var1);
      return this;
   }

   public Helper264 method1973(String var1) {
      return this.subSettings.stream().filter(var1x -> var1x.getName().equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   public boolean method1974() {
      return this.value;
   }

   public List<Helper264> method1975() {
      return this.subSettings;
   }

   public Setting1 method1976(boolean var1) {
      this.value = var1;
      return this;
   }

   public Setting1 method1977(List<Helper264> var1) {
      this.subSettings = var1;
      return this;
   }
}
