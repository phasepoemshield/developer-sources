package Nursultan;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class01766;
import minecraft.class06794;
import minecraft.class07049;
import minecraft.class07680;
import minecraft.class07701;
import minecraft.class07765;

public class class10789 implements class07765 {
   private final class06794 N;

   public class10789(class06794 var1) {
      this.N = var1;
   }

   public Collection<class01766> getNames(class07701 var1, Supplier<Collection<class01766>> var2) throws CommandSyntaxException {
      List<? extends class07049> var3 = this.N.y(var1);
      if (var3.isEmpty()) {
         throw class07680.u.create();
      } else {
         return List.copyOf(var3);
      }
   }
}
