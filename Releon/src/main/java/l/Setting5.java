package l;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Setting5 extends Helper264 {
   private String selected;
   private List<String> list;
   private Runnable onChange;

   public Setting5(String var1, String var2) {
      super(var1, var2);
   }

   public Setting5 method2381(String... var1) {
      this.list = Arrays.asList(var1);
      this.selected = this.list.isEmpty() ? "" : this.list.get(0);
      return this;
   }

   public Setting5 method2382(Supplier<Boolean> var1) {
      this.method2704(var1);
      return this;
   }

   public Setting5 method2383(String var1) {
      if (this.list.contains(var1)) {
         this.selected = var1;
         if (this.onChange != null) {
            this.onChange.run();
         }
      }

      return this;
   }

   public Setting5 method2384(Runnable var1) {
      this.onChange = var1;
      return this;
   }

   public boolean method2385(String var1) {
      return this.selected.equals(var1);
   }

   public String method2386() {
      return this.selected;
   }

   public List<String> method2387() {
      return this.list;
   }

   public Runnable method2388() {
      return this.onChange;
   }

   public void method2389(String var1) {
      this.selected = var1;
   }
}
