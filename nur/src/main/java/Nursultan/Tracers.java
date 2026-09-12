package Nursultan;

import java.util.List;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import org.joml.Matrix4f;

@class11080(
   L = "Tracers",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class Tracers extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   public Tracers() {
      this.s();
      this.L_0 = new Matrix4f();
      this.L_1 = new class11414(this, "players", true);
      this.L_2 = new class11437(this, "friends", true);
      this.L_3 = class11524.y(this, "entities", (class11414)this.L_1, (class11437)this.L_2);
      this.L_4 = new Matrix4f();

      for (class11419 var2 : ((class11523)this.L_3).L()) {
         if (var2 instanceof class11801) {
            var2.N(this);
         }
      }
   }

   private void s() {
   }

   @class11782(
      y = class11777.BEFORE
   )
   public void N(class09321 var1) {
      this.s();
      class11184 var2 = ((class11174)class11190.N_2).R();
      class06889 var3 = var1.y().y();
      Matrix4f var4 = var1.L().L().N().invert((Matrix4f)this.L_4);
      Matrix4f var6 = var1.N().invert((Matrix4f)this.L_0).mul(var4);

      for (class07049 var8 : ((class03448)((class06202)super.y_0).T_3).M()) {
         if (var8 != (class04453)((class06202)super.y_0).T_4) {
            for (int var9 = 0; var9 < ((List)((class11523)this.L_3).i()).size(); var9++) {
               class11419 var10 = (class11419)((List)((class11523)this.L_3).i()).get(var9);
               if (var10.test(var8)) {
                  int var11 = var10.N();
                  var2.N(var6, 0.0F, 0.0F, -1.0F)
                     .N(var1.R(), (float)(class11925.i(var8) - var3.M), (float)(class11925.u(var8) - var3.B), (float)(class11925.L(var8) - var3.Z))
                     .y(var11)
                     .y(var11)
                     .N(0.0F)
                     .y();
               }
            }
         }
      }
   }
}
