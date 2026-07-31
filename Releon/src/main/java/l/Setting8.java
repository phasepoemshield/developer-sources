package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Setting8 extends Helper264 {
   private List<String> list;
   private List<String> selected = new ArrayList<>();

   public Setting8(String var1, String var2) {
      super(var1, var2);
   }

   public Setting8 method2585(String... var1) {
      this.list = Arrays.asList(var1);
      return this;
   }

   public Setting8 method2586(String... var1) {
      this.selected = new ArrayList<>(Arrays.asList(var1));
      return this;
   }

   public Setting8 method2587(Supplier<Boolean> var1) {
      this.method2704(var1);
      return this;
   }

   public boolean method2588(String var1) {
      return this.selected.contains(var1);
   }

   public List<String> method2589() {
      return this.list;
   }

   public List<String> method2590() {
      return this.selected;
   }

   public void method2591(List<String> var1) {
      this.list = var1;
   }

   public void method2592(List<String> var1) {
      this.selected = var1;
   }
}
