package Nursultan;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Iterator;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06026;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07490;
import minecraft.class07689;

public class class09422 extends class10742 {
   private void L() {
      class05096 var2 = (class05096)((class06202)super.y_0).v_3;
      if (var2 instanceof class06026 var1) {
         class07490 var8 = (class07490)var1.E();
         int var3 = var8.E().method_5439();
         int var4 = 0;
         Iterator var5 = class11107.y().iterator();

         while (var5.hasNext()) {
            class06584 var7 = ((class11664)var5.next()).N();
            if (var4 < var3) {
               var8.N(var4, var8.z(), var7);
               var4++;
            } else if (!((class04453)((class06202)super.y_0).T_4).method_31548().M(var7) && !var7.R()) {
               ((class04453)((class06202)super.y_0).T_4).method_7328(var7, false);
            }
         }
      }
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("debug").requires(var0 -> (Boolean)class11938.L_3)).then(this.N("load").executes(var1x -> {
            this.L();
            return 1;
         }))
      );
   }
}
