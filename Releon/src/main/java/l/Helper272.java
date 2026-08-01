package l;

import fat.releon.Releon;
import java.util.List;
import java.util.stream.Stream;

public enum Helper272 implements Helper278<Helper298> {
   INSTANCE;

   private Helper272() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = this.method2745().stream().map(Helper298::method2934);
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public Helper298 method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return this.method2745().stream().filter(var1x -> var1x.method2934().equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   private List<? extends Helper298> method2745() {
      return Releon.method71().method23().wayList;
   }
}
