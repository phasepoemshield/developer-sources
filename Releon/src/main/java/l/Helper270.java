package l;

import java.util.stream.Stream;

public enum Helper270 implements Helper278<String> {
   INSTANCE;

   private Helper270() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = Helper11.method355().method359().stream();
      String var3 = var1.method1686().method1700();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public String method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return Helper11.method355().method359().stream().filter(var1x -> var1x.equalsIgnoreCase(var2)).findFirst().orElse(null);
   }
}
