package l;

import fat.releon.Releon;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.util.Pair;

public class Helper363 implements Helper94 {
   private final Helper129 manager = Releon.method71().method19();
   public static String prefix = ".";

   public Helper363(Helper124 var1) {
      var1.method1016(this);
   }

   @Helper104
   public void method3605(Helper380 var1) {
      String var2 = var1.getMessage();
      boolean var3 = var2.startsWith(Helper215.FORCE_COMMAND_PREFIX);
      if (var2.startsWith(prefix) || var3) {
         var1.method582();
         String var4 = var2.substring(var3 ? Helper215.FORCE_COMMAND_PREFIX.length() : prefix.length());
         if (!this.method3606(var4) && !var4.trim().isEmpty()) {
            new Helper114(Helper308.method3066(var4).getLeft()).method647(null, null);
         }
      }
   }

   public boolean method3606(String var1) {
      if (var1.isEmpty()) {
         return this.method3606("help");
      } else {
         Pair var2 = Helper308.method3066(var1);
         String var3 = (String)var2.getLeft();
         String var4 = var1.substring(((String)var2.getLeft()).length());
         new Helper200(this.manager, (List<Helper204>)var2.getRight());
         return this.manager.method1064(var2);
      }
   }

   @Helper104
   public void method3607(Helper396 var1) {
      String var2 = var1.prefix;
      if (var2.startsWith(prefix)) {
         String var3 = var2.substring(prefix.length());
         List var4 = Helper299.method2947(var3, true);
         Stream<String> var5 = this.method3608(var3);
         if (var4.size() == 1) {
            var5 = var5.map(var0 -> prefix + var0);
         }

         var1.completions = var5.toArray(String[]::new);
      }
   }

   public Stream<String> method3608(String var1) {
      try {
         List var2 = Helper299.method2947(var1, true);
         Helper200 var3 = new Helper200(this.manager, var2);
         return var3.method1691(2) && var3.method1693(1)
            ? new Helper120().method1004(this.manager).method1000(var3.method1723()).method1003()
            : this.manager.method1066(var1);
      } catch (Exception var4) {
         return Stream.empty();
      }
   }
}
