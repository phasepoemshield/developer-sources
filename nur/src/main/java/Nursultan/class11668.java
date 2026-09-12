package Nursultan;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import minecraft.class02837;
import minecraft.class03519;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08983;

public class class11668<T> implements Codec<class08983<T>> {
   public class11668(Codec var1) {
      this.N = var1;
   }

   public <V> DataResult<Pair<class08983<T>, V>> decode(DynamicOps<V> var1, V var2) {
      return class02837.y
         .decode(var1, var2)
         .flatMap(
            var3 -> {
               class07001 var4 = ((class07001)var3.getFirst()).N();
               class07709 var5 = var4.b("id");
               return var5 == null
                  ? DataResult.error(() -> "Expected 'id' field in " + var2)
                  : var1x.parse(N(var1), var5).map(var2xx -> Pair.of(new class08983(var2xx, var4), var3.getSecond()));
            }
         );
   }

   public <V> DataResult<V> encode(class08983<T> var1, DynamicOps<V> var2, V var3) {
      return this.N.encodeStart(N(var2), var1.N).flatMap(var3x -> {
         class07001 var4 = var1.y.N();
         var4.N("id", var3x);
         return class02837.y.encode(var4, var2, var3);
      });
   }

   private static <T> DynamicOps<class07709> N(DynamicOps<T> var0) {
      return (DynamicOps<class07709>)(var0 instanceof class03519 ? ((class03519)var0).N(class07713.N) : class07713.N);
   }
}
