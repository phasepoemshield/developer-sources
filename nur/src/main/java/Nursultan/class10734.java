package Nursultan;

import java.util.function.BiFunction;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00869;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class05835;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.util.Pos.ChunkCoord;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import net.caffeinemc.mods.lithium.mixin.world.raycast.ClipContextAccessor;

public class class10734 implements BiFunction<class05862, class07209, class06183> {
   int N;
   int y;
   class08050 L;
   final boolean u;

   public class10734(class07290 var1, class05862 var2) {
      this.R = var1;
      this.i = var2;
      this.N = Integer.MIN_VALUE;
      this.y = Integer.MIN_VALUE;
      this.L = null;
      this.u = ((ClipContextAccessor)this.i).getFluidHandling() != class05835.field_1348;
   }

   public class06183 apply(class05862 var1, class07209 var2) {
      class00500 var3 = this.N((class05487)this.R, var2);
      class06889 var4 = var1.y();
      class06889 var5 = var1.N();
      class00494 var6 = var1.N(var3, this.R, var2);
      class06183 var7 = this.R.N(var4, var5, var2, var6, var3);
      double var8 = var7 == null ? Double.MAX_VALUE : var1.y().M(var7.y());
      double var10 = Double.MAX_VALUE;
      class06183 var12 = null;
      if (this.u) {
         class04688 var13 = var3.Y();
         var12 = var1.N(var13, this.R, var2).method_1092(var4, var5, var2);
         var10 = var12 == null ? Double.MAX_VALUE : var1.y().M(var12.y());
      }

      return var8 <= var10 ? var7 : var12;
   }

   private class00500 N(class05487 var1, class07209 var2) {
      if (var1.method_31601(var2.method_10264())) {
         return class00869.mh.W();
      } else {
         int var3 = ChunkCoord.fromBlockCoord(var2.method_10263());
         int var4 = ChunkCoord.fromBlockCoord(var2.method_10260());
         if (this.N != var3 || this.y != var4) {
            this.L = var1.method_8392(var3, var4);
            this.N = var3;
            this.y = var4;
         }

         class08050 var5 = this.L;
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
