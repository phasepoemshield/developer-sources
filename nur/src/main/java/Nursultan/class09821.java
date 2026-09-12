package Nursultan;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02477;
import minecraft.class02678;
import minecraft.class02704;
import minecraft.class04247;

public class class09821 implements class02362<class04247, class02678> {
   public class09821(class02704 var1) {
      this.N = var1;
   }

   private <T> void N(class04247 var1, class02477<T> var2, Object var3) {
      this.N.N(var2).encode(var1, var3);
   }

   public void encode(class04247 var1, class02678 var2) {
      if (var2.u()) {
         var1.L(0);
         var1.L(0);
      } else {
         int var3 = 0;
         int var4 = 0;
         ObjectIterator<Entry<class02477<?>, Optional<?>>> var5 = Reference2ObjectMaps.fastIterable(var2.i).iterator();

         while (var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            if (((Optional)var6.getValue()).isPresent()) {
               var3++;
            } else {
               var4++;
            }
         }

         var1.L(var3);
         var1.L(var4);
         var5 = Reference2ObjectMaps.fastIterable(var2.i).iterator();

         while (var5.hasNext()) {
            Entry var11 = (Entry)var5.next();
            Optional var7 = (Optional)var11.getValue();
            if (var7.isPresent()) {
               class02477<?> var8 = (class02477<?>)var11.getKey();
               class02477.y.encode(var1, var8);
               this.N(var1, var8, var7.get());
            }
         }

         var5 = Reference2ObjectMaps.fastIterable(var2.i).iterator();

         while (var5.hasNext()) {
            Entry var12 = (Entry)var5.next();
            if (((Optional)var12.getValue()).isEmpty()) {
               class02477 var13 = (class02477)var12.getKey();
               class02477.y.encode(var1, var13);
            }
         }
      }
   }

   public class02678 decode(class04247 var1) {
      int var2 = var1.E();
      int var3 = var1.E();
      if (var2 == 0 && var3 == 0) {
         return class02678.N;
      } else {
         int var4 = var2 + var3;
         Reference2ObjectArrayMap var5 = new Reference2ObjectArrayMap(Math.min(var4, 65536));

         for (int var6 = 0; var6 < var2; var6++) {
            class02477<?> var7 = (class02477<?>)class02477.y.decode(var1);
            Object var8 = this.N.N(var7).decode(var1);
            var5.put(var7, Optional.of(var8));
         }

         for (int var9 = 0; var9 < var3; var9++) {
            class02477 var10 = (class02477)class02477.y.decode(var1);
            var5.put(var10, Optional.empty());
         }

         return new class02678(var5);
      }
   }
}
