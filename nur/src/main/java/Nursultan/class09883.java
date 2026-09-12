package Nursultan;

import java.util.function.BiFunction;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00869;
import minecraft.class05487;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.util.Pos.ChunkCoord;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import net.caffeinemc.mods.lithium.common.world.explosions.ClipContextAccess;

public class class09883 implements BiFunction<class05862, class07209, class06183> {
   final class07299 N;
   int y;
   int L;
   class08050 u;

   public class09883(class07049 var1) {
      this.i = var1;
      this.N = this.i.method_73183();
      this.y = Integer.MIN_VALUE;
      this.L = Integer.MIN_VALUE;
      this.u = null;
   }

   public class06183 apply(class05862 var1, class07209 var2) {
      return this.N(this.N, var2).y(this.N, var2, ((ClipContextAccess)var1).lithium$getCollisionContext()).method_1092(var1.y(), var1.N(), var2);
   }

   private class00500 N(class05487 var1, class07209 var2) {
      if (var1.method_31601(var2.method_10264())) {
         return class00869.mh.W();
      } else {
         int var3 = ChunkCoord.fromBlockCoord(var2.method_10263());
         int var4 = ChunkCoord.fromBlockCoord(var2.method_10260());
         if (this.y != var3 || this.L != var4) {
            this.u = var1.method_8392(var3, var4);
            this.y = var3;
            this.L = var4;
         }

         class08050 var5 = this.u;
         if (var5 != null) {
            class00554 var6 = var5.u()[SectionYIndex.fromBlockCoord(var5, var2.method_10264())];
            if (var6 != null && !var6.L()) {
               return var6.N(var2.method_10263() & 15, var2.method_10264() & 15, var2.method_10260() & 15);
            }
         }

         return class00869.N.W();
      }
   }
}
