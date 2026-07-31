package l;

import fat.releon.Releon;
import java.util.List;
import java.util.stream.Stream;

public enum Helper265 implements Helper278<Helper8> {
   INSTANCE;

   private Helper265() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = this.method2722().stream().map(Helper8::method345);
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public Helper8 method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return this.method2722().stream().filter(var1x -> var1x.method345().equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   private List<? extends Helper8> method2722() {
      return Releon.method71().method22().macroList;
   }
}
