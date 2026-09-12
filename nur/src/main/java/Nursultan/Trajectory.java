package Nursultan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import minecraft.class00734;
import minecraft.class02484;
import minecraft.class02820;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07089;
import minecraft.class07211;
import minecraft.class07438;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Vector3f;

@class11080(
   L = "Trajectory",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class Trajectory extends class11067 {
   public Object L_0;
   public Object L_1;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public static Object R_0;

   private static void T() {
      R_0 = 4.0F;
   }

   public Trajectory() {
      this.j();
      this.i_0 = new class11254("pearl", true, new class11228((class11225)class11225.L_2, class11264.N));
      this.i_1 = new class11254("trident", true, new class11249((class11225)class11225.L_1, class11264.N));
      this.i_2 = new class11254("bow", true, new class11249((class11225)class11225.L_0, class11264.N));
      this.i_3 = new class11254("potions", true, new class11228((class11225)class11225.L_3, class11264.N));
      this.i_4 = new class11254("crossbow", true, new class11249((class11225)class11225.L_0, class11264.N));
      this.u_0 = new class11254("snowball", true, new class11228((class11225)class11225.L_4, class11264.N));
      this.u_1 = new class11254("windcharge", true, new class11228((class11225)class11225.L_5, class11264.N));
      this.u_2 = class11524.y(
         this,
         "predict-entity",
         (class11254)this.i_1,
         (class11254)this.i_0,
         (class11254)this.i_2,
         (class11254)this.i_4,
         (class11254)this.i_3,
         (class11254)this.u_0,
         (class11254)this.u_1
      );
      this.u_3 = class11524.N(this, "line-color", -11104513);
      this.u_4 = class11524.N(this, "hit-line-color", -43691);
      this.u_5 = class06889.L;
      this.u_6 = class06889.L;
      this.L_0 = 0;
      this.L_1 = 0;
   }

   static {
      T();
   }

   private int s() {
      if ((class04453)((class06202)super.y_0).T_4 == null) {
         return 0;
      } else {
         for (class07050 var4 : class07050.values()) {
            class06584 var5 = ((class04453)((class06202)super.y_0).T_4).method_5998(var4);
            if (var5.N(class06570.sx)) {
               return var5.N((class04453)((class06202)super.y_0).T_4) - ((class04453)((class06202)super.y_0).T_4).method_6014();
            }
         }

         return 0;
      }
   }

   private void j() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
      }
   }

   private void y(class11174 var1, Matrix4fStack var2, int var3) {
      float var4 = 0.6F;
      class11184 var5 = var1.R();
      int var6 = var5.i();
      class06889 var7 = new class06889((double)var4, 0.0, 0.0);
      class06889 var8 = new class06889(0.0, 0.0, (double)var4);
      class06889 var9 = new class06889((double)(-var4), 0.0, 0.0);
      class06889 var10 = new class06889(0.0, 0.0, (double)(-var4));
      int var11 = class11300.N(var3, (int)((float)class11300.y(var3) * 0.196F * 2.0F));
      var5.N(var2, (float)var7.M, (float)var7.B, (float)var7.Z).y(var11).y();
      var5.N(var2, (float)var8.M, (float)var8.B, (float)var8.Z).y(var11).y();
      var5.N(var2, (float)var9.M, (float)var9.B, (float)var9.Z).y(var11).y();
      var5.N(var2, (float)var10.M, (float)var10.B, (float)var10.Z).y(var11).y();
      var1.L().y(var6);
   }

   private List<class11266> y(class06889 var1, float var2) {
      this.j();
      float var3 = ((class04453)((class06202)super.y_0).T_4).method_36455();
      float var4 = ((class04453)((class06202)super.y_0).T_4).method_36454();
      class06889 var5 = new class06889(
         class11925.i((class04453)((class06202)super.y_0).T_4),
         class11925.u((class04453)((class06202)super.y_0).T_4)
            + (double)((class04453)((class06202)super.y_0).T_4).method_18381(((class04453)((class06202)super.y_0).T_4).method_18376()),
         class11925.L((class04453)((class06202)super.y_0).T_4)
      );

      for (class07050 var9 : class07050.values()) {
         class06584 var10 = ((class04453)((class06202)super.y_0).T_4).method_5998(var9);
         if (var10.N(class06570.db) && ((class11254)this.i_1).U()) {
            return List.of(new class11266(var5, N((class04453)((class06202)super.y_0).T_4, var1, var3, var4, 0.0F, 2.5F), ((class11254)this.i_1).N()));
         }

         if (var10.N(class06570.nz) && ((class11254)this.i_0).U()) {
            return List.of(new class11266(var5, N((class04453)((class06202)super.y_0).T_4, var1, var3, var4, 0.0F, 1.5F), ((class11254)this.i_0).N()));
         }

         if (var10.N(class06570.dw) && ((class11254)this.i_4).U()) {
            if (!class06593.u(var10)) {
               return Collections.emptyList();
            }

            int[] var22;
            if (((class02820)var10.a_(class02484.x, class02820.N)).N().size() == 1) {
               var22 = new int[]{0};
            } else {
               var22 = new int[]{-10, 0, 10};
            }

            ArrayList var12 = new ArrayList();

            for (int var16 : var22) {
               class06889 var17 = ((class04453)((class06202)super.y_0).T_4).method_18864(1.0F);
               Quaternionf var18 = new Quaternionf().setAngleAxis((double)((float)var16 * (float) (Math.PI / 180.0)), var17.M, var17.B, var17.Z);
               Vector3f var20 = ((class04453)((class06202)super.y_0).T_4).method_5828(1.0F).W().rotate(var18);
               class06889 var21 = N((double)var20.x, (double)var20.y, (double)var20.z, 3.15F);
               var12.add(new class11266(var5, var21, ((class11254)this.i_4).N()));
            }

            return var12;
         }

         if (var10.N(class06570.sx) && ((class11254)this.i_2).U()) {
            float var11 = var2 <= 0.0F ? 1.0F : N(var2) * 3.0F;
            return List.of(new class11266(var5, N((class04453)((class06202)super.y_0).T_4, var1, var3, var4, 0.0F, var11), ((class11254)this.i_2).N()));
         }

         if (var10.N(class06570.lO) && ((class11254)this.i_3).U()) {
            return List.of(new class11266(var5, N((class04453)((class06202)super.y_0).T_4, var1, var3, var4, -20.0F, 0.5F), ((class11254)this.i_3).N(), 4.0F));
         }

         if (var10.N(class06570.jP) && ((class11254)this.u_0).U()) {
            return List.of(new class11266(var5, N((class04453)((class06202)super.y_0).T_4, var1, var3, var4, 0.0F, 1.5F), ((class11254)this.u_0).N()));
         }

         if (var10.N(class06570.Gz) && ((class11254)this.u_1).U()) {
            return List.of(new class11266(var5, N((class04453)((class06202)super.y_0).T_4, var1, var3, var4, 0.0F, 1.5F), ((class11254)this.u_1).N()));
         }
      }

      return Collections.emptyList();
   }

   private static float N(float var0) {
      float var1 = var0 / 20.0F;
      var1 = (var1 * var1 + var1 * 2.0F) / 3.0F;
      return Math.min(var1, 1.0F);
   }

   private void N(class11174 var1, Matrix4fStack var2, class06889 var3, class06889 var4, class06889 var5, int var6, int var7, float var8) {
      class06889 var9 = var4.u(var3);
      class06889 var10 = var5.u(var3);
      var1.R().N(var2, (float)var9.M, (float)var9.B, (float)var9.Z).N(var2, (float)var10.M, (float)var10.B, (float)var10.Z).y(var6).y(var7).N(var8).y();
   }

   @class11782
   public void N(class11355 var1) {
      this.j();
      this.u_5 = (class06889)this.u_6;
      this.u_6 = class11907.y();
      this.L_0 = (Integer)this.L_1;
      this.L_1 = this.s();
   }

   private int N(class11241 var1, float var2) {
      this.j();
      if (var1.N().isPresent()) {
         class11223 var3 = var1.N().get();
         if (var3.y() instanceof class06145) {
            return ((class11515)this.u_4).i();
         }

         if (var2 > 0.0F && this.N(var3.N(), var2)) {
            return ((class11515)this.u_4).i();
         }
      }

      return ((class11515)this.u_3).i();
   }

   public static class06889 N(class07049 var0, class06889 var1, float var2, float var3, float var4, float var5) {
      float var6 = -class04995.m((double)(var3 * (float) (Math.PI / 180.0))) * class04995.P((double)(var2 * (float) (Math.PI / 180.0)));
      float var7 = -class04995.m((double)((var2 + var4) * (float) (Math.PI / 180.0)));
      float var8 = class04995.P((double)(var3 * (float) (Math.PI / 180.0))) * class04995.P((double)(var2 * (float) (Math.PI / 180.0)));
      return N((double)var6, (double)var7, (double)var8, var5).y(var1.M, var0.method_24828() ? 0.0 : var1.B, var1.Z);
   }

   private boolean N(class06889 var1, float var2) {
      class00734 var3 = class00734.N(var1, (double)(var2 * 2.0F), (double)(var2 * 2.0F), (double)(var2 * 2.0F));
      double var4 = (double)(var2 * var2);
      return !((class03448)((class06202)super.y_0).T_3)
         .N(class07438.class, var3, var4x -> var4x != (class04453)((class06202)super.y_0).T_4 && var4x.method_5805() && var4x.method_5707(var1) <= var4)
         .isEmpty();
   }

   public static class06889 N(double var0, double var2, double var4, float var6) {
      return new class06889(var0, var2, var4).u().L((double)var6);
   }

   @class11782
   public void N(class09321 var1) {
      this.j();
      float var2 = var1.u().N(true);
      class06889 var3 = ((class06889)this.u_5).L((double)(1.0F - var2)).i(((class06889)this.u_6).L((double)var2));
      float var4 = (float)((Integer)this.L_0).intValue() + (float)((Integer)this.L_1 - (Integer)this.L_0) * var2;
      List<class11266> var5 = this.y(var3, var4);
      if (!var5.isEmpty()) {
         ArrayList var6 = new ArrayList();

         for (class11266 var8 : var5) {
            var6.add(var8.y());
         }

         float var54 = ((class04453)((class06202)super.y_0).T_4).method_36454();
         class06889 var55 = new class06889(
            (double)(-class04995.P((double)(var54 * (float) (Math.PI / 180.0))) * 0.15F),
            0.0,
            (double)(-class04995.m((double)(var54 * (float) (Math.PI / 180.0))) * 0.15F)
         );
         class11174 var9 = (class11174)class11190.N_2;
         class11174 var10 = (class11174)class11190.y_3;
         Matrix4fStack var11 = var1.R();
         class06889 var12 = var1.y().y();

         for (int var13 = 0; var13 < var6.size(); var13++) {
            class11241 var14 = (class11241)var6.get(var13);
            int var15 = this.N(var14, var5.get(var13).u());
            List<class06889> var16 = var14.y();
            if (!var16.isEmpty()) {
               class06889 var17 = var16.getFirst();
               class06889 var18 = var14.N().map(class11223::N).orElse(var16.getLast());
               Quaternionf var19 = new Quaternionf()
                  .rotationTo(
                     new Vector3f((float)(var17.M - var18.M), (float)(var17.B - var18.B), (float)(var17.Z - var18.Z)),
                     new Vector3f((float)(var17.M + var55.M - var18.M), (float)(var17.B + var55.B - var18.B), (float)(var17.Z + var55.Z - var18.Z))
                  );
               var11.pushMatrix();
               var11.translate((float)(var18.M - var12.M), (float)(var18.B - var12.B), (float)(var18.Z - var12.Z));
               var11.rotate(var19);
               var11.translate((float)(var12.M - var18.M), (float)(var12.B - var18.B), (float)(var12.Z - var18.Z));
               class06889 var20 = var16.getFirst();

               for (int var21 = 1; var21 < var16.size(); var21++) {
                  class06889 var22 = var16.get(var21);
                  this.N(
                     var9,
                     var11,
                     var12,
                     var20,
                     var22,
                     class11300.N(var15, (int)(Math.min(1.0F, (float)(var21 - 1) / 5.0F) * 255.0F)),
                     class11300.N(var15, (int)(Math.min(1.0F, (float)var21 / 5.0F) * 255.0F)),
                     0.0F
                  );
                  var20 = var22;
               }

               var11.popMatrix();
               if (!var14.N().isEmpty()) {
                  class11223 var56 = var14.N().get();
                  float var57 = var5.get(var13).u();
                  if (var57 > 0.0F) {
                     class11226.N(var12, var56.N(), var57, var15);
                  } else {
                     class06889 var23 = new class06889(0.0, 1.0, 0.0);
                     if (var56.y() instanceof class06183 var24) {
                        class07211 var60 = var24.i();
                        var23 = new class06889((double)var60.P(), (double)var60.s(), (double)var60.T());
                     } else {
                        class07089 var61 = var56.y();
                        if (var61 instanceof class06145) {
                           class06145 var25 = (class06145)var61;
                           class07049 var62 = var25.L();
                           class06889 var27 = var25.y();
                           class00734 var28 = var62.method_5829().M(1.0E-6);
                           double var29 = Math.max(1.0E-6, 0.5 * var28.y());
                           double var31 = Math.max(1.0E-6, 0.5 * var28.L());
                           double var33 = Math.max(1.0E-6, 0.5 * var28.u());
                           class06889 var35 = var28.R();
                           double var36 = var27.M - var35.M;
                           double var38 = var27.B - var35.B;
                           double var40 = var27.Z - var35.Z;
                           double var42 = var36 / var29;
                           double var44 = var38 / var31;
                           double var46 = var40 / var33;
                           double var48 = Math.abs(var42);
                           double var50 = Math.abs(var44);
                           double var52 = Math.abs(var46);
                           if (var48 >= var50 && var48 >= var52) {
                              var23 = new class06889(Math.signum(var36), 0.0, 0.0);
                           } else if (var50 >= var48 && var50 >= var52) {
                              var23 = new class06889(0.0, Math.signum(var38), 0.0);
                           } else {
                              var23 = new class06889(0.0, 0.0, Math.signum(var40));
                           }
                        }
                     }

                     class06889 var59 = var56.N();
                     var23 = var23.u();
                     var11.pushMatrix();
                     var11.translate((float)(var59.M - var12.M), (float)(var59.B - var12.B), (float)(var59.Z - var12.Z));
                     var11.rotate(new Quaternionf().rotateTo(new Vector3f(0.0F, 1.0F, 0.0F), new Vector3f((float)var23.M, (float)var23.B, (float)var23.Z)));
                     this.y(var10, var11, var15);
                     this.N(var9, var11, var15);
                     var11.popMatrix();
                  }
               }
            }
         }

         class11226.N(var1);
      }
   }

   private void N(class11174 var1, Matrix4fStack var2, int var3) {
      float var4 = 0.6F;
      byte var5 = 4;
      double var6 = (double)((float) (Math.PI * 2) / (float)var5);
      class06889 var8 = null;

      for (int var9 = 0; var9 <= var5; var9++) {
         double var10 = (double)var9 * var6;
         float var12 = (float)(Math.cos(var10) * (double)var4);
         float var13 = (float)(Math.sin(var10) * (double)var4);
         class06889 var14 = new class06889((double)var12, 0.0, (double)var13);
         if (var8 != null) {
            int var15 = class11300.N(var3, 0.7F);
            this.N(var1, var2, class06889.L, var8, var14, var15, var15, 1.0F);
         }

         var8 = var14;
      }
   }
}
