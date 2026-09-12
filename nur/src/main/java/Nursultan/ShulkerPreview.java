package Nursultan;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import minecraft.class00392;
import minecraft.class00717;
import minecraft.class00891;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02118;
import minecraft.class02128;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class06922;
import minecraft.class06937;
import minecraft.class07027;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07510;
import minecraft.class08394;
import org.joml.Vector2ic;
import org.joml.Vector4f;

@class11080(
   L = "ShulkerPreview",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class ShulkerPreview extends class11067 {
   public Object L_0;
   public Object L_1;
   public static Object u_0;
   public static Object u_1;
   public static Object u_2;

   private void P() {
   }

   public ShulkerPreview() {
      this.P();
      this.L_0 = class11911.N("icons/3x9.png");
      this.L_1 = class11524.N(this, "show-in-world", true);
   }

   static {
      v();
   }

   private static void v() {
      u_0 = 8;
      u_1 = -12698050;
      u_2 = -16777216;
   }

   private void N(class01054 var1, int var2, int var3, int var4, class06584 var5) {
      this.P();
      var1.N(class08394.Na, (class01894)this.L_0, var2 - 4, var3 + var4 + 5, 0.0F, 0.0F, 256, 256, 256, 256, this.N(var5, false));
   }

   private void N(class09093 var1, class06584 var2, int var3, int var4) {
      int var5 = var2.c();
      if (var5 > 1) {
         String var6 = Integer.toString(var5);
         float var7 = var1.y(var6, 8.0F, class09079.REGULAR, false);
         class11176.N(var1, var6, (float)(var3 + 17) - var7, (float)(var4 + 9), 8.0F, -1, -12698050);
      }
   }

   private class00392 N(List<class06584> var1) {
      return class11921.N("shulker.contains", var1.size()).N(class06541.field_1080);
   }

   @class11782(
      y = class11777.AFTER
   )
   public void N(class10967 var1) {
      this.P();
      if (((class11507)this.L_1).i()) {
         boolean var2 = false;

         for (class07049 var4 : ((class03448)((class06202)super.y_0).T_3).M()) {
            if (var4.method_5864() == class07078.Nt && class11925.y(var4)) {
               class06584 var5 = ((class00717)var4).N();
               if (class11929.y(var5)) {
                  Vector4f var6 = class11925.N(var4, true);
                  if (var6 != null) {
                     List<class06584> var7 = class11929.i(var5);
                     if (!var7.isEmpty()) {
                        int var8 = (int)(var6.x() + (var6.z() - var6.x()));
                        int var9 = (int)var6.y();
                        var8 += 12;
                        byte var10 = 18;
                        var9 -= var10;
                        class11176.N(
                           ((class11174)class11190.y_0).u(),
                           (float)(var8 - 4),
                           (float)(var9 + var10 + 5),
                           256.0F,
                           256.0F,
                           0.0F,
                           0.0F,
                           1.0F,
                           1.0F,
                           this.N(var5, true)
                        );
                        var2 = true;
                        this.N(var7, var8, var9, var10);
                     }
                  }
               }
            }
         }

         if (var2) {
            class11925.N(((class06202)super.y_0).e(), true);
            ((class11174)class11190.y_0).N(var0 -> {
               var0.z("u_projection").N(class11925.L());
               var0.z("u_view").N(RenderSystem.getModelViewMatrix());
               var0.M("texture_in").N(((class12031)class11998.N_4).N());
            });
         }
      }
   }

   private void N(List<class06584> var1, int var2, int var3, int var4) {
      class09093 var5 = class09080.i();

      for (int var6 = 0; var6 < var1.size(); var6++) {
         int var7 = var2 + 4 + var6 % 9 * 18;
         int var8 = var3 + var4 + 13 + var6 / 9 * 18;
         class06584 var9 = (class06584)var1.get(var6);
         class11938.k().N(var9, (float)var7, (float)var8, 16.0F);
         this.N(var9, var7, var8);
         this.N(var5, var9, var7, var8);
      }
   }

   private void N(class06584 var1, int var2, int var3) {
      if (var1.m()) {
         int var4 = var1.s();
         if (var4 > 0) {
            float var5 = 1.0F - (float)var1.P() / (float)var4;
            class11213 var6 = ((class11174)class11190.N_0).u();
            class11176.N(var6, (float)(var2 + 2), (float)(var3 + 13), 13.0F, 2.0F, -16777216);
            int var7 = Math.round(var5 * 13.0F);
            if (var7 > 0) {
               class11176.N(var6, (float)(var2 + 2), (float)(var3 + 13), (float)var7, 1.0F, class11300.N(var5));
            }
         }
      }
   }

   @class11782
   public void N(class11361 var1) {
      if (!class11929.i(var1.y()).isEmpty() && !((class06202)super.y_0).s()) {
         List<class00392> var4 = var1.N();
         var4.add(1, class11921.N("shulker.holdControl").N(class06541.field_1080));
         var4.add(2, class00392.y(" "));
      }
   }

   private void N(class01054 var1, List<class06584> var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < var2.size(); var6++) {
         int var7 = var3 + 4 + var6 % 9 * 18;
         int var8 = var4 + var5 + 13 + var6 / 9 * 18;
         class06584 var9 = (class06584)var2.get(var6);
         class11925.N(var1, var9, (float)var7, (float)var8);
         var1.N((class01590)((class06202)super.y_0).i_3, var9, var7, var8);
      }
   }

   @class11782
   public void N(class11368 var1) {
      if (var1.u() == -111) {
         var1.N();
      }

      class06937 var2 = var1.L();
      if (var2 != null && var2.R()) {
         class06584 var3 = var2.i();
         List<class06584> var4 = class11929.i(var3);
         if (!var4.isEmpty() && ((class06202)super.y_0).s()) {
            if (var1.M() == class07510.field_7790 && var1.R() == 1) {
               var1.N();
               class06922 var5 = new class06922(-111, ((class04453)((class06202)super.y_0).T_4).method_31548());
               var5.L().addAll(var4);

               for (int var6 = 0; var6 < var4.size(); var6++) {
                  ((class06937)var5.T.get(var6)).u(var4.get(var6));
               }

               class05096 var9 = (class05096)((class06202)super.y_0).v_3;
               class05096 var8 = (class05096)((class06202)super.y_0).v_3;
               if (var8 instanceof class11031) {
                  var9 = (class05096)((class11031)var8).N_0;
               }

               ((class06202)super.y_0).N(new class11031(var5, ((class04453)((class06202)super.y_0).T_4).method_31548(), var3.d(), var9));
            }
         }
      }
   }

   private int N(class06584 var1, boolean var2) {
      class00891 var4 = class00891.N(var1.B());
      if (var4 instanceof class07027) {
         class06563 var5 = ((class07027)var4).y();
         if (var5 != null) {
            return class11300.N(var5.u().NU, var2 ? 100 : 255);
         }
      }

      return class11300.N(class06563.field_7945.u().NU, var2 ? 100 : 255);
   }

   @class11782
   public void N(class10964 var1) {
      class06584 var2 = var1.L();
      List<class06584> var3 = class11929.i(var2);
      if (!var3.isEmpty() && ((class06202)super.y_0).s()) {
         var1.N();
         class00392 var4 = this.N(var3);
         class00392 var5 = var2.d();
         int var6 = Math.max(((class01590)((class06202)super.y_0).i_3).N(var4), ((class01590)((class06202)super.y_0).i_3).N(var5));
         byte var7 = 18;
         int var8 = var1.i();
         int var9 = var1.R() - var7;
         class01054 var10 = var1.u();
         Vector2ic var11 = class02128.N.method_47944(var10.N(), var10.y(), var8, var9, var6, var7);
         var8 = var11.x();
         var9 = var11.y();
         class02118.N(var10, var8, var9, var6, var7, (class01894)var2.method_58694(class02484.V));
         this.N(var10, var8, var9, var7, var2);
         var10.y((class01590)((class06202)super.y_0).i_3, var5.method_30937(), var8, var9, -1);
         var10.y((class01590)((class06202)super.y_0).i_3, var4.method_30937(), var8, var9 + 10, -1);
         this.N(var10, var3, var8, var9, var7);
      }
   }
}
