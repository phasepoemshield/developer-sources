package l;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import net.minecraft.client.util.InputUtil.Type;

public enum Helper266 implements Helper278<Entry<String, Integer>> {
   INSTANCE;

   private Helper266() {
   }

   @Override
   public Stream<String> method2013(Helper276 var1) {
      Stream var2 = method2726().keySet().stream();
      String var3 = var1.method1686().method1723();
      return new Helper120().method990(var2).method1000(var3).method999().method1003();
   }

   public Entry<String, Integer> method2018(Helper276 var1) {
      String var2 = var1.method1686().method1723();
      return method2726().entrySet().stream().filter(var1x -> var1x.getKey().equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   private static Map<String, Integer> method2726() {
      HashMap var0 = new HashMap();
      ObjectIterator var1 = Type.KEYSYM.map.int2ObjectEntrySet().iterator();

      while (var1.hasNext()) {
         it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry var2 = (it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry)var1.next();
         int var3 = var2.getIntKey();
         String var4 = Helper209.method1791(var3).toLowerCase();
         var0.put(var4, var3);
      }

      return var0;
   }
}
