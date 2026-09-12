package Nursultan;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07689;

public class class09363 extends class10742 {
   public Object N_0;

   private int L() {
      this.R();
      if (((class09327)this.N_0).y().isEmpty()) {
         class11303.y(class11921.N("friend.empty-list").N(class06541.field_1080));
         return 0;
      } else {
         class11303.y(class11921.N("friend.list-header").N(class06541.field_1080));

         for (class09332 var2 : ((class09327)this.N_0).y()) {
            class00625 var3 = new class00625((Character)class10626.N_1 + "friend remove " + var2.y());
            class05216 var4 = class11921.N("remove").N(class06541.field_1061).L(class00405.N.N(var3));
            class11303.y(
               class11921.N(
                     "friend.list-entry",
                     class06541.field_1068 + var2.y() + class06541.field_1080,
                     class06541.field_1068 + class11480.N(var2.N()) + class06541.field_1080
                  )
                  .N(class06541.field_1061)
                  .i(" ")
                  .y(var4)
            );
         }

         class11303.y(class11921.N("total", ((class09327)this.N_0).y().size()).N(class06541.field_1080));
         return 1;
      }
   }

   public class09363() {
      this.R();
      this.N_0 = class11938.t();
   }

   static {
      u();
      y();
   }

   private LiteralArgumentBuilder<class07689> B() {
      return (LiteralArgumentBuilder<class07689>)this.N("remove").then(this.N("name", new class10773()).executes(var1 -> this.N(class10773.N(var1, "name"))));
   }

   private LiteralArgumentBuilder<class07689> Z() {
      return (LiteralArgumentBuilder<class07689>)this.N("list").executes(var1 -> this.L());
   }

   private int i() {
      this.R();
      String var1;
      if (((class09327)this.N_0).y().isEmpty()) {
         var1 = "friend.empty-list";
      } else {
         ((class09327)this.N_0).N();
         var1 = "friend.cleared";
      }

      class11303.y(class11921.N(var1).N(class06541.field_1080));
      return 1;
   }

   private LiteralArgumentBuilder<class07689> U() {
      return (LiteralArgumentBuilder<class07689>)this.N("clear").executes(var1 -> this.i());
   }

   private LiteralArgumentBuilder<class07689> z() {
      return (LiteralArgumentBuilder<class07689>)this.N("add").then(this.N("name", new class09401()).executes(var1 -> this.G(class10742.N(var1, "name"))));
   }

   private static void u() {
   }

   private static void y() {
   }

   private int N(class09332 var1) {
      this.R();
      Object var2 = var1.y();
      ((class09327)this.N_0).y((String)var2);
      class11303.y(class11921.N("friend.removed", class06541.field_1068 + var2 + class06541.field_1080).N(class06541.field_1080));
      return 1;
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      LiteralCommandNode var2 = var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("friend").then(this.z())).then(this.B()))
               .then(this.Z()))
            .then(this.U())
      );
      var1.register((LiteralArgumentBuilder)this.N("fr").redirect(var2));
   }

   private void R() {
   }

   private int G(String var1) {
      this.R();
      String var2;
      if (((class09327)this.N_0).N((String)var1, System.currentTimeMillis())) {
         var2 = "friend.added";
      } else {
         var2 = "friend.exists";
      }

      class11303.y(class11921.N(var2, class06541.field_1068 + var1 + class06541.field_1080).N(class06541.field_1080));
      return 1;
   }
}
