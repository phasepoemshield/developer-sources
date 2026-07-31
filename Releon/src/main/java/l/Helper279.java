package l;

import java.util.List;
import java.util.stream.Stream;

public enum Helper279 implements Helper278<Helper190> {
   INSTANCE;

   private Helper279() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = this.method2771().stream().map(Helper190::getName);
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public Helper190 method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return this.method2771().stream().filter(var1x -> var1x.getName().equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   private List<? extends Helper190> method2771() {
      return Helper309.method3078();
   }
}
