package Nursultan;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class09426 {
   public Object N_0;
   public Object N_1;

   private static void L() {
   }

   private void L(class09173 var1) {
      this.u(var1);
      this.N(var1.y().L(), var1);
   }

   public class09426() {
      this.N();
      this.N_0 = new Int2ObjectOpenHashMap();
      this.N_1 = this::L;
   }

   static {
      u();
      L();
      y();
   }

   private static void u() {
   }

   private void u(class09173 var1) {
      ObjectIterator var2 = ((Int2ObjectOpenHashMap)this.N_0).int2ObjectEntrySet().iterator();

      while (var2.hasNext()) {
         List var4 = (List)((Entry)var2.next()).getValue();
         var4.removeIf(var1x -> var1x == var1);
         if (var4.isEmpty()) {
            var2.remove();
         }
      }
   }

   private static void y() {
   }

   public void y(class11389 var1) {
      List var2 = (List)((Int2ObjectOpenHashMap)this.N_0).get(var1.z());
      if (var2 != null) {
         List var3 = var2.stream().filter(var1x -> var1x.u(var1)).toList();
         if (var3.isEmpty()) {
            var3 = var2.stream().filter(var1x -> var1x.y(var1)).toList();
         }

         var3.forEach(var1x -> var1x.L(var1));
      }
   }

   public void y(class09173 var1) {
      this.u(var1);
      this.N(var1.y().L(), var1);
      var1.N((Consumer<class09173>)this.N_1);
   }

   private void N(int var1, class09173 var2) {
      if (!var2.B()) {
         List var3 = (List)((Int2ObjectOpenHashMap)this.N_0).computeIfAbsent(var1, var0 -> new ArrayList());
         if (!var3.stream().anyMatch(var1x -> var1x == var2)) {
            var3.add(var2);
         }
      }
   }

   private void N() {
   }

   public void N(class11389 var1) {
      List var2 = (List)((Int2ObjectOpenHashMap)this.N_0).get(var1.z());
      if (var2 != null) {
         var2.stream().filter(var1x -> var1x.N(var1.z())).forEach(var1x -> var1x.N(var1));
      }
   }

   public void N(class09173 var1) {
      this.u(var1);
   }
}
