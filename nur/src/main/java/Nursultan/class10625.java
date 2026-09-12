package Nursultan;

import minecraft.class02362;
import minecraft.class02678;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class06581;
import minecraft.class06584;

public class class10625 implements class02362<class04247, class06584> {
   public class10625(class02362 var1) {
      this.N = var1;
   }

   public class06584 decode(class04247 var1) {
      int var2 = var1.E();
      if (var2 <= 0) {
         return class06584.E;
      } else {
         class03556<class06581> var3 = (class03556<class06581>)class06581.i.decode(var1);
         class02678 var4 = (class02678)this.N.decode(var1);
         return new class06584(var3, var2, var4);
      }
   }

   public void encode(class04247 var1, class06584 var2) {
      if (var2.R()) {
         var1.L(0);
      } else {
         var1.L(var2.c());
         class06581.i.encode(var1, var2.Z());
         this.N.encode(var1, var2.W.M());
      }
   }
}
