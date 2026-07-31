package l;

import fat.releon.Releon;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.util.Pair;

public class Helper308 implements Helper129 {
   private final Helper117<Helper230> registry = new Helper117<>();

   public Helper308() {
      Helper9.method348().forEach(this.registry::method957);
   }

   @Override
   public Helper117<Helper230> method1061() {
      return this.registry;
   }

   @Override
   public Helper230 method1062(String var1) {
      for (Helper230 var3 : this.registry.entries) {
         if (var3.method1860().contains(var1.toLowerCase(Locale.US))) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public boolean method1063(String var1) {
      return this.method1064(method3066(var1));
   }

   @Override
   public boolean method1064(Pair<String, List<Helper204>> var1) {
      Helper307 var2 = this.method3064(var1);
      if (var2 != null) {
         var2.method3062();
      }

      return var2 != null;
   }

   @Override
   public Stream<String> method1065(Pair<String, List<Helper204>> var1) {
      Helper307 var2 = this.method3064(var1);
      return var2 == null ? Stream.empty() : var2.method3063();
   }

   @Override
   public Stream<String> method1066(String var1) {
      Pair var2 = method3065(var1, true);
      String var3 = (String)var2.getLeft();
      List var4 = (List)var2.getRight();
      return var4.isEmpty() ? new Helper120().method1004(Releon.method71().method19()).method1000(var3).method1003() : this.method1065(var2);
   }

   private Helper307 method3064(Pair<String, List<Helper204>> var1) {
      String var2 = (String)var1.getLeft();
      Helper200 var3 = new Helper200(this, (List<Helper204>)var1.getRight());
      Helper230 var4 = this.method1062(var2);
      return var4 == null ? null : new Helper307(var4, var2, var3);
   }

   private static Pair<String, List<Helper204>> method3065(String var0, boolean var1) {
      String var2 = var0.split("\\s", 2)[0];
      List var3 = Helper299.method2947(var0.substring(var2.length()), var1);
      return new Pair<>(var2, var3);
   }

   public static Pair<String, List<Helper204>> method3066(String var0) {
      return method3065(var0, false);
   }
}
