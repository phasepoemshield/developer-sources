package l;

import fat.releon.Releon;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Helper293 implements Helper278<Helper95> {
   INSTANCE;

   private Helper293() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = this.method2881().stream().map(Helper95::getName);
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public Helper95 method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return this.method2881().stream().filter(var1x -> var1x.getName().equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   public List<? extends AutoCfg> method2881() {
      return Releon.method71()
         .method28()
         .method893()
         .stream()
         .filter(var0 -> var0 instanceof AutoCfg)
         .map(var0 -> (AutoCfg)var0)
         .collect(Collectors.toList());
   }
}
