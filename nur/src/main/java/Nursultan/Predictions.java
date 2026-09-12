package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class01421;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04499;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07488;
import minecraft.class07517;
import minecraft.class08007;
import minecraft.class08045;
import minecraft.class08591;
import org.joml.Matrix4fStack;
import org.joml.Vector2f;

@class11080(
   L = "Predictions",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class Predictions extends class11067 {
   public static Object L_0;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object i_0;
   public Object i_1;

   private boolean L(class07049 var1) {
      if (var1.method_24828()) {
         return false;
      } else if (var1.field_6014 == var1.method_23317() && var1.field_5969 == var1.method_23321()) {
         return false;
      } else if (var1.field_5960) {
         return false;
      } else if (!var1.method_5805()) {
         return false;
      } else {
         return var1 instanceof class07517 ? !((class03448)((class06202)super.y_0).T_3).method_8600(var1, var1.method_5829()).iterator().hasNext() : true;
      }
   }

   public Predictions() {
      this.v();
      this.i_0 = new class11254("pearl", true, new class11228((class11225)class11225.L_2));
      this.i_1 = new class11254("trident", true, new class11249((class11225)class11225.L_1));
      this.u_0 = new class11254("arrow", true, new class11249((class11225)class11225.L_0));
      this.u_1 = new class11254("potions", true, new class11228((class11225)class11225.L_3));
      this.u_2 = new class11254("snowball", true, new class11228((class11225)class11225.L_4));
      this.u_3 = new class11254("windcharge", true, new class11228((class11225)class11225.L_5));
      this.u_4 = class11524.y(
         this,
         "predict-entity",
         (class11254)this.i_1,
         (class11254)this.i_0,
         (class11254)this.u_0,
         (class11254)this.u_1,
         (class11254)this.u_2,
         (class11254)this.u_3
      );
      this.u_5 = class11524.N(this, "line-color", -11104513);
      this.u_6 = new ArrayList();
   }

   static {
      n();
   }

   private static void n() {
      L_0 = 4.0F;
   }

   private void v() {
   }

   private class06584 y(class07049 var1) {
      if (var1 instanceof class07488) {
         return class06570.nz.E();
      } else if (var1 instanceof class07517) {
         return class06570.db.E();
      } else if (var1 instanceof class08007 var3) {
         return var3.B();
      } else if (var1 instanceof class08591 var2) {
         return var2.L();
      } else if (var1 instanceof class08045) {
         return class06570.jP.E();
      } else {
         return var1 instanceof class04499 ? class06570.Gz.E() : class06584.E;
      }
   }

   private class11254 N(class07049 var1) {
      this.v();
      if (var1 instanceof class07488) {
         return (class11254)this.i_0;
      } else if (var1 instanceof class07517) {
         return (class11254)this.i_1;
      } else if (var1 instanceof class08007) {
         return (class11254)this.u_0;
      } else if (var1 instanceof class08591) {
         return (class11254)this.u_1;
      } else if (var1 instanceof class08045) {
         return (class11254)this.u_2;
      } else {
         return var1 instanceof class04499 ? (class11254)this.u_3 : null;
      }
   }

   @class11782
   public void N(class10996 var1) {
      this.v();
      ((List)this.u_6).clear();

      for (class07049 var3 : ((class03448)((class06202)super.y_0).T_3).M()) {
         class11254 var4 = this.N(var3);
         if (var4 != null && var4.U() && this.L(var3)) {
            ((List)this.u_6).add(var4.N().N(var3, var3.method_73189(), var3.method_18798()));
         }
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.v();
      if (!((List)this.u_6).isEmpty()) {
         class11174 var2 = (class11174)class11190.N_2;
         class01421 var3 = var1.L();
         var3.N();
         class06889 var4 = var1.y().y();
         Matrix4fStack var5 = var1.R();
         int var6 = ((class11515)this.u_5).i();
         int var7 = class11300.y(var6);

         for (class11241 var9 : (List)this.u_6) {
            var9.N().ifPresent(var2x -> {
               if (var2x.u() instanceof class08591) {
                  class11226.N(var4, var2x.N(), 4.0F, var6);
               }
            });
            List<class06889> var10 = var9.y();
            if (!var10.isEmpty()) {
               class06889 var11 = var10.getFirst();

               for (int var12 = 1; var12 < var10.size(); var12++) {
                  class06889 var13 = var10.get(var12);
                  class06889 var14 = var11.u(var4);
                  class06889 var15 = var13.u(var4);
                  var2.R()
                     .N(var5, (float)var14.M, (float)var14.B, (float)var14.Z)
                     .N(var5, (float)var15.M, (float)var15.B, (float)var15.Z)
                     .y(class11300.N(var6, (int)(Math.min(1.0F, (float)(var12 - 1) / 5.0F) * (float)var7)))
                     .y(class11300.N(var6, (int)(Math.min(1.0F, (float)var12 / 5.0F) * (float)var7)))
                     .N(0.0F)
                     .y();
                  var11 = var13;
               }
            }
         }

         var3.y();
         class11226.N(var1);
      }
   }

   @class11782
   public void N(class10967 var1) {
      this.v();
      if (!((List)this.u_6).isEmpty()) {
         class11174 var2 = (class11174)class11190.y_3;
         class09093 var3 = class09080.u();
         Iterator var4 = ((List)this.u_6).iterator();

         while (var4.hasNext()) {
            ((class11241)var4.next()).N().ifPresent(var3x -> {
               class06889 var4x = var3x.N().u(((class03386)((class06202)super.y_0).i_5).s().y());
               Vector2f var5 = class11925.N((float)var4x.M, (float)var4x.B, (float)var4x.Z);
               if (var5 != null) {
                  var5 = var5.round();
                  int var6 = var3x.L();
                  float var7 = var6 <= 0 ? 0.0F : (float)var6 / (float)(var3x.u().field_6012 + var6);
                  class11925.N(var3, var2.u(), "", 16, var5.x, var5.y, this.y(var3x.u()), var6, var7);
               }
            });
         }
      }
   }
}
