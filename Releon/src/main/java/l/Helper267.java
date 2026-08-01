package l;

import fat.releon.Releon;
import java.util.List;
import java.util.stream.Stream;

public enum Helper267 implements Helper278<Helper242> {
   INSTANCE;

   private Helper267() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = this.method2730().stream().map(Helper242::getName);
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public Helper242 method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return this.method2730().stream().filter(var1x -> var1x.getName().equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   private List<? extends Helper242> method2730() {
      return Releon.method71().method17().method2314();
   }
}
