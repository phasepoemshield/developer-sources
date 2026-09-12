package Nursultan;

import minecraft.class01054;
import minecraft.class02834;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07043;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07438;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class class11045<T extends class07438> extends class11051<T> {
   public class11045(EntityESP var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public void y(class01054 var1, class09093 var2, Vector4f var3, T var4) {
      float var5 = ((EntityESP)super.N_0).m().i();
      float var6 = (var5 - 4.0F) / 4.0F;
      float var7 = var2.N(var5, class09079.REGULAR, false) + var6 * 2.0F;
      float var8 = var3.x() + (var3.z() - var3.x()) * 0.5F;
      float var9 = var3.w() + var6 + 1.0F;

      for (class06584 var13 : new class06584[]{var4.method_6047(), var4.method_6079()}) {
         if (!var13.R()) {
            class05216 var14 = this.N(var13);
            float var15 = var2.y(var14, var5, class09079.REGULAR, false);
            var2.y(var14).N(var8 - var15 / 2.0F, var9).N(var5).y(this.u((T)var4)).u(var6).N(class09079.REGULAR).i(this.y((T)var4)).L();
            var9 += var7;
         }
      }

      var3.w = var9;
   }

   public class05216 L(T var1) {
      return super.L((T)var1).i(" ").i(class06541.field_1080 + "[" + class06541.field_1061 + Math.round(var1.method_6032()) + class06541.field_1080 + "]");
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4, int var5, int var6) {
      float var7 = var3.x;
      float var8 = var3.y;
      float var9 = var3.w - var8;
      int var10 = -1291187702;
      float var11 = var4.method_6032();
      float var12 = class04995.N(var11 / Math.max(var4.method_6063(), var11), 0.0F, 1.0F);
      float var13 = var12 * var9;
      int var14 = class11300.N(var6, var5, var12);
      class11174 var15 = (class11174)class11190.y_3;
      class11176.N(var15.u(), var7 - 5.0F, var8 - 1.0F, 3.0F, var9 + 2.0F, var10);
      class11176.N(var15.u(), (Matrix4f)class11925.y_3, var7 - 4.0F, var8 + var9 - var13, 1.0F, var13, var14, var6);
      if (!((class11535)((EntityESP)super.N_0).L_2).U()) {
         var3.y = (float)Math.round(var3.y - 4.0F);
      }
   }

   private class05216 N(class06584 var1) {
      class05216 var2 = var1.d().L();
      return var1.c() <= 1 ? var2 : var2.i(class06541.field_1080 + " x" + var1.c());
   }

   public void L(class01054 var1, class09093 var2, Vector4f var3, T var4) {
      int var5 = (Integer)((class11007)((class11517)((EntityESP)super.N_0).B_2).i()).N_0;
      int var6 = 0;
      boolean var7 = false;

      for (class02834 var11 : new class02834[]{class02834.field_49224, class02834.field_49219}) {
         for (class07085 var13 : var11.N()) {
            if (var13.N() == class07043.field_6178 || var13.N() == class07043.field_6177) {
               class06584 var14 = var4.method_6118(var13);
               if (!var14.R()) {
                  var6 += 16 * var5;
                  var7 = true;
               }
            }
         }
      }

      if (var7) {
         float var25 = var3.x();
         float var26 = var3.y();
         float var27 = var3.z();
         float var28 = var25 + (var27 - var25) * 0.5F;
         float var29 = (float)Math.round(var28 - (float)var6 / 2.0F);
         float var30 = ((EntityESP)super.N_0).m().i();
         float var31 = (var30 - 4.0F) / 4.0F;
         int var15 = 20 * var5;
         float var16 = (float)Math.round(var26 - var31 - (float)(var15 - 4));
         class11176.N(((class11174)class11190.y_3).u(), var29 - 2.0F, var16 - 1.0F, (float)(var6 + 4), (float)(var15 - 3), this.u((T)var4));
         var6 = 0;
         class02834[] var17 = new class02834[]{class02834.field_49224, class02834.field_49219};
         int var18 = var17.length;

         for (int var19 = 0; var19 < var18; var19++) {
            for (class07085 var22 : var17[var19].N()) {
               if (var22.N() == class07043.field_6178 || var22.N() == class07043.field_6177) {
                  class06584 var23 = var4.method_6118(var22);
                  if (!var23.R()) {
                     class11938.k().N(var23, var29 + (float)var6, var16, (float)(16 * var5));
                     var6 += 16 * var5;
                  }
               }
            }
         }
      }
   }

   public boolean test(class07049 var1) {
      return var1 instanceof class07438;
   }
}
