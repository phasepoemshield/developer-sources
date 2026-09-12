package Nursultan;

import minecraft.class00500;
import minecraft.class03182;
import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class06202;
import minecraft.class06898;
import minecraft.class07105;
import minecraft.class07204;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class10157 implements class04417<class07105> {
   private final class06143 N;

   public class10157(class06143 var1) {
      this.N = var1;
   }

   @Nullable
   public class04406 method_3090(
      class07105 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      class00500 var16 = var1.N();
      if (!var16.P() && var16.b() == class06898.field_11455) {
         return null;
      } else {
         class07209 var17 = class07209.method_49637(var3, var5, var7);
         int var18 = class06202.Nq().d().N(var16, var2, var17);
         if (var16.i() instanceof class07204) {
            var18 = ((class07204)var16.i()).N(var16, var2, var17);
         }

         float var19 = (float)(var18 >> 16 & 0xFF) / 255.0F;
         float var20 = (float)(var18 >> 8 & 0xFF) / 255.0F;
         float var21 = (float)(var18 & 0xFF) / 255.0F;
         return new class03182(var2, var3, var5, var7, var19, var20, var21, this.N);
      }
   }
}
