package Nursultan;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07689;
import org.joml.Vector2d;

public class class10681 extends class10742 {
   public Object N_0;

   private LiteralArgumentBuilder<class07689> L() {
      return (LiteralArgumentBuilder<class07689>)this.N("off").executes(var1 -> this.M());
   }

   private int M() {
      this.R();
      ((class10705)this.N_0).y();
      return 1;
   }

   public class10681() {
      this.R();
      this.N_0 = class11938.Q();
   }

   static {
      y();
      u();
   }

   private int B() {
      this.R();
      if (((class10705)this.N_0).N()) {
         class00625 var1 = new class00625((Character)class10626.N_1 + "gps off");
         class05216 var2 = class11921.N("remove").N(class06541.field_1061).L(class00405.N.N(var1));
         class11303.y(
            class11921.N(
                  "command.gps.info-enabled",
                  "" + class06541.field_1068 + ((class10705)this.N_0).u().x() + class06541.field_1080,
                  "" + class06541.field_1068 + ((class10705)this.N_0).u().y() + class06541.field_1080
               )
               .i(" ")
               .y(var2)
         );
      } else {
         class11303.y(class11921.N("command.gps.info-disabled").N(class06541.field_1080));
      }

      return 1;
   }

   private LiteralArgumentBuilder<class07689> Z() {
      return (LiteralArgumentBuilder<class07689>)this.N("info").executes(var1 -> this.B());
   }

   private RequiredArgumentBuilder<class07689, Vector2d> U() {
      return (RequiredArgumentBuilder<class07689, Vector2d>)this.N("pos", new class10726()).executes(var1 -> {
         Vector2d var2 = class10726.N(var1, "pos");
         return this.N(var2.x, var2.y);
      });
   }

   private static void u() {
   }

   private static void y() {
   }

   private int N(double var1, double var3) {
      this.R();
      ((class10705)this.N_0).N(var1, var3);
      return 1;
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("gps")
                     .executes(
                        var1x -> this.N(((class04453)((class06202)super.y_0).T_4).method_23317(), ((class04453)((class06202)super.y_0).T_4).method_23321())
                     ))
                  .then(this.Z()))
               .then(this.L()))
            .then(this.U())
      );
   }

   private void R() {
   }
}
