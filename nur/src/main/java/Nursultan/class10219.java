package Nursultan;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import minecraft.class02968;
import minecraft.class03643;

public class class10219 implements class03643 {
   public class10219(JsonObject var1) {
      this.L = var1;
   }

   public <T> Optional<T> N(class02968<T> var1) {
      String var2 = var1.N();
      return this.L.has(var2) ? Optional.of((T)var1.y().parse(JsonOps.INSTANCE, this.L.get(var2)).getOrThrow(JsonParseException::new)) : Optional.empty();
   }
}
