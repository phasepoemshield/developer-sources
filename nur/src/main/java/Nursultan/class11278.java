package Nursultan;

import java.util.Optional;
import minecraft.class06584;

public class class11278 {
   public Optional<class11882> N(class06584 var1, String var2, long var3) {
      if (!var2.matches("^[\\s\\S]{3,16}$")) {
         return Optional.empty();
      } else {
         for (class11882 var6 : class11938.n().y().values()) {
            if (var6.M()
               && !((float)var3 / (float)var1.c() > (float)Long.parseLong(var6.Z().i()))
               && var1.c() >= var6.E()
               && !(class11929.M(var1) < var6.N())
               && var6.test(var1)) {
               return Optional.of(var6);
            }
         }

         return Optional.empty();
      }
   }
}
