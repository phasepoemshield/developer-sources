package Nursultan;

import java.util.HashMap;
import minecraft.class03556;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07438;

public class class10749 extends HashMap<class03556<class07084>, class07055> {
   public Object N_0;

   public class10749(class07438 var1) {
      this.N();
      this.N_0 = var1;
   }

   public class07055 remove(Object var1) {
      class07055 var2 = (class07055)super.remove(var1);
      if (var2 != null) {
         class11938.L().L(class10997.N(var2, class10966.staticFields_0cabd41f8be773279a9b5245fe31e3239_3));
      }

      return var2;
   }

   public class07055 put(class03556<class07084> var1, class07055 var2) {
      class07055 var3 = super.put(var1, var2);
      if (var3 == null) {
         class11938.L().L(class10997.N(var2, class10966.staticFields_0cabd41f8be773279a9b5245fe31e3239_0));
      } else {
         class11938.L().L(class10997.N(var2, class10966.staticFields_0cabd41f8be773279a9b5245fe31e3239_1));
      }

      return var3;
   }

   private void N() {
   }
}
