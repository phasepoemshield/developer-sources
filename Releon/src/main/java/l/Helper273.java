package l;

import java.util.stream.Stream;

public enum Helper273 implements Helper268<String, Void> {
   INSTANCE;

   private Helper273() {
   }

   public String method2733(Helper276 var1, Void var2) {
      return var1.method1686().method1723();
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Helper120 var2 = new Helper120();
      Helper19.method384().forEach(var1x -> var2.method991(var1x.getName()));
      String var3 = var1.method1686().method1690() ? var1.method1686().method1700() : "";
      return var2.method1000(var3).method1003();
   }
}
