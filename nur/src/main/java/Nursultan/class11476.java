package Nursultan;

import java.nio.FloatBuffer;
import java.util.List;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08844;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.lwjgl.BufferUtils;

public class class11476 extends class11473<class11483> {
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4 = new class12012(true, 1, 1, 1, 1);
   public static Object y_5 = class12036.u().N((class12012)y_4).N();
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   public class11476() {
      this.B();
      this.L_0 = class06202.Nq();
      this.L_1 = BufferUtils.createFloatBuffer(40);
      this.L_2 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.L_3 = class09097.i(() -> {
         this.B();
         return ((class06202)this.L_0).e().N;
      }, () -> {
         this.B();
         return ((class06202)this.L_0).e().y;
      });
      this.L_4 = class11218.<class09321>N().N(new class11465(this, (class11213)this.L_2)).y((class09064)this.L_3).N(33990, () -> {
         this.B();
         return class11925.y(((class06202)this.L_0).e());
      }).N(new class11470(this, (class11213)this.L_2)).L(((class06202)this.L_0)::e).L((class09064)this.L_3).N();
   }

   static {
      U();
   }

   private void B() {
   }

   private static void U() {
      y_0 = 5;
      y_1 = 40.0F;
      y_2 = 500.0F;
      y_3 = Math.PI * 10;
      y_4 = null;
      y_5 = null;
   }

   private boolean N(List<class11483> var1, class06889 var2) {
      this.B();
      ((FloatBuffer)this.L_1).clear();
      int var3 = 0;

      for (class11483 var5 : var1) {
         if (var3 >= 5) {
            break;
         }

         class11934 var6 = var5.M();
         if (!this.N(var5, var6, var2)) {
            float var7 = var6.E().floatValue();
            float var8 = 40.0F * var7;
            if (!(var8 < 0.1F)) {
               class06889 var9 = var5.B();
               int var10 = var5.i();
               long var11 = (System.nanoTime() - var6.z()) / 1000000L;
               float var14 = Math.clamp((float)(var6.y().toMillis() - var11) / 500.0F, 0.0F, 1.0F) * (float)class11300.y(var10) / 255.0F;
               ((FloatBuffer)this.L_1).put((float)(var9.M - var2.M));
               ((FloatBuffer)this.L_1).put((float)(var9.B - var2.B));
               ((FloatBuffer)this.L_1).put((float)(var9.Z - var2.Z));
               ((FloatBuffer)this.L_1).put(var8);
               ((FloatBuffer)this.L_1).put(var14);
               ((FloatBuffer)this.L_1).put((float)class11300.u(var10) / 255.0F);
               ((FloatBuffer)this.L_1).put((float)class11300.N(var10) / 255.0F);
               ((FloatBuffer)this.L_1).put((float)class11300.i(var10) / 255.0F);
               var3++;
            }
         }
      }

      for (int var15 = var3; var15 < 5; var15++) {
         ((FloatBuffer)this.L_1).put(0.0F).put(0.0F).put(0.0F).put(0.0F).put(0.0F).put(0.0F).put(0.0F).put(0.0F);
      }

      return var3 > 0;
   }

   @Override
   public void N(class09321 var1) {
      this.B();
      List<class11483> var2 = this.N();
      if (!var2.isEmpty()) {
         if (this.N(var2, var1.y().y())) {
            ((class11218)this.L_4).execute(var1);
         }
      }
   }

   @Override
   public void N(class10967 var1) {
      this.B();
      List<class11483> var2 = this.N();
      if (!var2.isEmpty()) {
         byte var3 = 16;
         byte var4 = 14;
         float var5 = 8.0F;
         class08844 var6 = ((class06202)this.L_0).Nt();
         float var7 = (float)var6.U();
         float var8 = (float)var6.E();
         float var9 = 0.15F;
         float var10 = Math.min(var7, var8) * 0.15F;
         class09093 var11 = class09080.u();
         class06889 var12 = ((class03386)((class06202)this.L_0).i_5).s().y();

         for (class11483 var14 : var2) {
            var14.L().N();
            var14.M().N();
            class06889 var15 = var14.W();
            boolean var16 = false;
            if (var14.R()) {
               class07049 var17 = ((class03448)((class06202)this.L_0).T_3).method_8469(var14.y());
               if (var17 != null) {
                  var15 = new class06889(var17.field_6014, var17.field_6036 + (double)var17.method_17682(), var17.field_5969)
                     .N(var17.method_73189().y(0.0, (double)var17.method_17682(), 0.0), (double)var1.y().N(true));
                  var14.N(var15);
                  var16 = true;
               }
            }

            class06889 var38 = var15.u(var12);
            class06889 var18 = var15.y(0.0, var16 ? 1.0 : 2.0, 0.0).u(var12);
            class11893 var19 = class11925.y((float)var38.M, (float)var38.B, (float)var38.Z);
            class11893 var20 = class11925.y((float)var18.M, (float)var18.B, (float)var18.Z);
            if (var19 != null && var20 != null) {
               Vector2f var21 = var19.N().round();
               Vector2f var22 = var20.N().round();
               boolean var24 = var19.y() && var21.x >= var10 && var21.x <= var7 - var10 && var21.y >= var10 && var21.y <= var8 - var10;
               int var25 = var14.i();
               String var26 = var14.E() + " m";
               float var27 = var14.L().E().floatValue();
               float var28 = (var21.y - var22.y) * var27;
               float var29 = (var22.y - var21.y) * var27;
               float var30 = var21.y + var29;
               float var31 = var21.x;
               float var32 = var30;
               if (var24) {
                  class11176.N(((class11174)class11190.y_3).u(), (Matrix4f)class11925.y_3, var21.x, var30, 2.0F, var28, var25, class11300.N(var25, 0));
               } else {
                  Vector2f var33 = class11925.N(var21, var7, var8, var10);
                  var31 = var33.x;
                  var32 = var33.y;
               }

               float var40 = var31 - var11.y(var26, 14.0F, class09079.REGULAR, false) / 2.0F;
               float var34 = var32 - 28.0F;
               class11176.N(var11, var26, var40, var34, 14.0F, var25, -16777216);
               var26 = var14.m();
               float var35 = var31 - var11.y(var26, 16.0F, class09079.REGULAR, false) / 2.0F;
               float var36 = var32 - 48.0F;
               class11176.N(var11, var26, var35, var36, 16.0F, var25, -16777216);
               class11176.N(((class11174)class11190.y_3).u(), (Matrix4f)class11925.y_3, var31 + 1.0F, var32, 8.0F, var25);
            }
         }
      }
   }

   private boolean N(class11483 var1, class11934 var2, class06889 var3) {
      return var2.N(class11903.FORWARDS) ? true : var3.R(var1.u()) > 200.0;
   }

   @Override
   public void N(class10996 var1) {
      this.B();
      List<class11483> var2 = this.N();
      if (!var2.isEmpty()) {
         class06889 var3 = ((class03386)((class06202)this.L_0).i_5).s().y();

         for (class11483 var5 : var2) {
            var5.N((int)var3.R(var5.W()));
         }
      }
   }
}
