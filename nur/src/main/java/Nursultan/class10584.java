package Nursultan;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;
import minecraft.class07689;
import org.joml.Vector3d;

public class class10584 extends class10742 {
   public Object N_0;

   private int L() {
      this.R();
      if (((class11460)this.N_0).N().isEmpty()) {
         class11303.y(class06541.field_1080 + class12020.N("waypoint.empty-list"));
         return 0;
      } else {
         ((class11460)this.N_0).L();
         class11303.y(class06541.field_1080 + class12020.N("waypoint.cleared"));
         return 1;
      }
   }

   private LiteralArgumentBuilder<class07689> M() {
      return (LiteralArgumentBuilder<class07689>)this.N("remove").then(this.N("name", new class10715()).executes(var1 -> this.N(class10715.N(var1, "name"))));
   }

   public class10584() {
      this.R();
      this.N_0 = class11938.E();
   }

   static {
      u();
      y();
   }

   private LiteralArgumentBuilder<class07689> B() {
      return (LiteralArgumentBuilder<class07689>)this.N("list").executes(var1 -> this.Z());
   }

   private int Z() {
      this.R();
      if (((class11460)this.N_0).N().isEmpty()) {
         class11303.y(class11921.N("waypoint.empty-list").N(class06541.field_1080));
         return 0;
      } else {
         class11303.y(class11921.N("waypoint.list-header").N(class06541.field_1080));
         ObjectIterator<class11481> var1 = ((class11460)this.N_0).N().iterator();

         while (var1.hasNext()) {
            class11481 var2 = (class11481)var1.next();
            class06889 var3 = var2.W();
            class00625 var4 = new class00625((Character)class10626.N_1 + "way remove " + var2.m());
            class05216 var5 = class11921.N("remove").N(class06541.field_1061).L(class00405.N.N(var4));
            class11303.y(
               class00392.N(
                     class06541.field_1068
                        + var2.m()
                        + " "
                        + class06541.field_1080
                        + "{"
                        + class06541.field_1068
                        + "x: "
                        + class11908.N(var3.N(), 0.1)
                        + class06541.field_1080
                        + ", "
                        + class06541.field_1068
                        + "y: "
                        + class11908.N(var3.y(), 0.1)
                        + class06541.field_1080
                        + ", "
                        + class06541.field_1068
                        + "z: "
                        + class11908.N(var3.L(), 0.1)
                        + class06541.field_1080
                        + "} "
                        + class06541.field_1080
                        + "{"
                        + class06541.field_1068
                        + "ip: "
                        + var2.s()
                        + class06541.field_1080
                        + "}"
                  )
                  .L()
                  .i(" ")
                  .y(var5)
            );
         }

         class11303.y(class11921.N("total", ((class11460)this.N_0).N().size()).N(class06541.field_1080));
         return 1;
      }
   }

   private LiteralArgumentBuilder<class07689> i() {
      return (LiteralArgumentBuilder<class07689>)this.N("clear").executes(var1 -> this.L());
   }

   private LiteralArgumentBuilder<class07689> U() {
      return (LiteralArgumentBuilder<class07689>)this.N("add")
         .then(
            ((RequiredArgumentBuilder)this.N("name", class10761.y(3, 16))
                  .executes(
                     var1 -> this.N(
                           class10742.N(var1, "name"),
                           ((class04453)((class06202)super.y_0).T_4).method_23317(),
                           ((class04453)((class06202)super.y_0).T_4).method_23318(),
                           ((class04453)((class06202)super.y_0).T_4).method_23321()
                        )
                  ))
               .then(this.N("pos", new class09387()).executes(var1 -> {
                  Vector3d var2 = class09387.N(var1, "pos");
                  return this.N(class10742.N(var1, "name"), var2.x, var2.y, var2.z);
               }))
         );
   }

   private static void u() {
   }

   private static void y() {
   }

   private int N(class11481 var1) {
      this.R();
      Object var2 = var1.m();
      if (((class11460)this.N_0).N((String)var2)) {
         class11303.y(class11921.N("waypoint.removed", class06541.field_1068 + var2 + class06541.field_1080).N(class06541.field_1080));
      } else {
         class11303.y(class11921.N("waypoint.not-found", class06541.field_1068 + var2 + class06541.field_1080).N(class06541.field_1080));
      }

      return 1;
   }

   private int N(String var1, double var2, double var4, double var6) {
      this.R();
      class06889 var8 = new class06889(var2, var4, var6);
      ((class11460)this.N_0).N((String)var1, var8, class11910.L());
      class11303.y(class11921.N("waypoint.added", class06541.field_1068 + var1 + class06541.field_1080).N(class06541.field_1080));
      return 1;
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      LiteralCommandNode var2 = var1.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("waypoint").then(this.U())).then(this.M()))
               .then(this.B()))
            .then(this.i())
      );
      var1.register((LiteralArgumentBuilder)this.N("way").redirect(var2));
   }

   private void R() {
   }
}
