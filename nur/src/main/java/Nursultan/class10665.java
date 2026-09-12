package Nursultan;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07689;

public class class10665 extends class10742 {
   public Object N_0;

   private LiteralArgumentBuilder<class07689> L() {
      return (LiteralArgumentBuilder<class07689>)this.N("add")
         .then(
            this.N("name", class10761.N(20))
               .then(
                  this.N("key", new class09382())
                     .then(
                        this.N("message", new class10684())
                           .executes(var1 -> this.N(class10742.N(var1, "name"), class10684.N(var1, "message").getString(), class09382.N(var1, "key").L()))
                     )
               )
         );
   }

   private int M() {
      this.Z();
      String var1;
      if (((class11992)this.N_0).L().isEmpty()) {
         var1 = "macros.empty-list";
      } else {
         ((class11992)this.N_0).y();
         var1 = "macros.cleared";
      }

      class11303.y(class11921.N(var1).N(class06541.field_1080));
      return 1;
   }

   public class10665() {
      this.Z();
      this.N_0 = class11938.y();
   }

   private LiteralArgumentBuilder<class07689> B() {
      return (LiteralArgumentBuilder<class07689>)this.N("remove").then(this.N("name", new class10751()).executes(var1 -> this.N(class10751.N(var1, "name"))));
   }

   private void Z() {
   }

   private LiteralArgumentBuilder<class07689> u() {
      return (LiteralArgumentBuilder<class07689>)this.N("list").executes(var1 -> this.y());
   }

   private int y() {
      this.Z();
      if (((class11992)this.N_0).L().isEmpty()) {
         class11303.y(class11921.N("macros.empty-list").N(class06541.field_1080));
         return 0;
      } else {
         class11303.y(class11921.N("macros.list-header").N(class06541.field_1080));

         for (class11997 var2 : ((class11992)this.N_0).L()) {
            class00625 var3 = new class00625((Character)class10626.N_1 + "macros remove " + var2.L());
            class05216 var4 = class11921.N("remove").N(class06541.field_1061).L(class00405.N.N(var3));
            class11303.y(
               class11921.N(
                     "macros.list-entry",
                     class06541.field_1068 + var2.L(),
                     class06541.field_1068 + class12002.y(var2.N()).u(),
                     class06541.field_1068 + var2.y()
                  )
                  .N(class06541.field_1080)
                  .i(" ")
                  .y(var4)
            );
         }

         class11303.y(class11921.N("total", ((class11992)this.N_0).L().size()).N(class06541.field_1080));
         return 1;
      }
   }

   private int N(class11997 var1) {
      this.Z();
      Object var2 = var1.L();
      ((class11992)this.N_0).N((String)var2);
      class11303.y(class11921.N("macros.removed", class06541.field_1068 + var2 + class06541.field_1080).N(class06541.field_1080));
      return 1;
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      LiteralCommandNode var2 = var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("macros").then(this.L())).then(this.B()))
               .then(this.u()))
            .then(this.R())
      );
      var1.register((LiteralArgumentBuilder)this.N("mac").redirect(var2));
   }

   private int N(String var1, String var2, int var3) {
      this.Z();
      class11303.y(
         class11921.N(
               ((class11992)this.N_0).N((String)var1, var2, var3) ? "macros.added" : "macros.exists",
               class06541.field_1068 + var1 + class06541.field_1080,
               class06541.field_1068 + class12002.y(var3).u() + class06541.field_1080
            )
            .N(class06541.field_1080)
      );
      return 1;
   }

   private LiteralArgumentBuilder<class07689> R() {
      return (LiteralArgumentBuilder<class07689>)this.N("clear").executes(var1 -> this.M());
   }
}
