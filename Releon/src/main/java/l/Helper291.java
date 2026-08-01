package l;

import fat.releon.Releon;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public enum Helper291 implements Helper278<String> {
   INSTANCE;

   private Helper291() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = this.method2871().stream().map(String::toString);
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public String method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return this.method2871().stream().filter(var1x -> var1x.equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   public List<String> method2871() {
      ArrayList var1 = new ArrayList();
      File[] var2 = Releon.method71().method31().method3927().listFiles();
      if (var2 != null) {
         for (File var6 : var2) {
            if (var6.isFile() && var6.getName().endsWith(".json")) {
               String var7 = var6.getName().replace(".json", "");
               var1.add(var7);
            }
         }
      }

      return var1;
   }
}
