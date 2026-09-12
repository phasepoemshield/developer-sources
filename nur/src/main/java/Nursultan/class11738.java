package Nursultan;

import java.util.ArrayList;
import java.util.List;
import minecraft.class06202;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class11738 {
   public Object N_0;
   public static Object y_0 = new class11738();
   public static Object y_1;
   public static Object y_2;
   public static Object y_3 = class11300.N(-1, 100);
   public static Object y_4 = class09991.N().N(false);
   public static Object y_5 = class09991.N()
      .N(class09969.FLOATING)
      .U(0.0F)
      .E(0.0F)
      .N(class09962.N(100.0F))
      .y(class09962.N(100.0F))
      .L(true)
      .N(Integer.MAX_VALUE);

   private class11738() {
      this.Z();
      this.N_0 = new ArrayList();
   }

   static {
      B();
   }

   private static void B() {
      y_0 = null;
      y_1 = 5.0F;
      y_2 = 1.0F;
      y_3 = 1694498815;
      y_4 = null;
      y_5 = null;
   }

   private void Z() {
   }

   private void y(float var1, Vector2f var2, float var3) {
      float var4 = this.N(var1, var2.x, var3);
      if (!Float.isNaN(var4)) {
         var2.x = var4;
         ((List)this.N_0).add(new Vector2f(var1, -1.0F));
      }
   }

   private float N(float var1, float var2, float var3) {
      if (Math.abs(var1 - var2) < 5.0F) {
         return var1;
      } else if (Math.abs(var1 - (var2 + var3)) < 5.0F) {
         return var1 - var3;
      } else {
         return Math.abs(var1 - (var2 + var3 / 2.0F)) < 5.0F ? var1 - var3 / 2.0F : Float.NaN;
      }
   }

   public static class09798 N(Void var0, class09809 var1) {
      var1.L("hudSnapLines", ((List)((class11738)y_0).N_0)::hashCode);
      List var2 = (List)((class11738)y_0).N_0;
      if (var2.isEmpty()) {
         return class09778.N(var0x -> var0x.N("snapGuides").N((class09991)y_4));
      } else {
         float var3 = N(true);
         float var4 = N(false);
         return class09778.N((class09991)y_5, var3x -> {
            var3x.N("snapGuides");

            for (int var4x = 0; var4x < var2.size(); var4x++) {
               Vector2f var5 = (Vector2f)var2.get(var4x);
               float var6 = var5.x == -1.0F ? 1.0F : var4 + 1.0F;
               float var7 = var5.y == -1.0F ? 1.0F : var3 + 1.0F;
               class09991 var8 = class09991.N().N(class09969.FLOATING).U(var5.x).E(var5.y).u(var7, var6).y((Integer)y_3);
               String var9 = "snapLine-" + var4x;
               var3x.N_3(var8, var1xx -> var1xx.N(var9));
            }
         });
      }
   }

   private static float N(boolean var0) {
      class11753 var1 = class11938.i();
      float var2 = var1 != null ? var1.u() : 1.0F;
      class06202 var3 = class06202.Nq();
      int var4 = var0 ? var3.Nt().U() : var3.Nt().E();
      return (float)Math.max(1, var4) / var2;
   }

   public void N(String var1, Vector2f var2, float var3, float var4, float var5, float var6, boolean var7, boolean var8) {
      for (class11769 var10 : (List)class11730.N_7) {
         if (!var10.E().equals(var1)) {
            Vector4f var11 = var10.R();
            if (var11 != null) {
               if (var7) {
                  this.y(var11.x(), var2, var3);
                  this.y(var11.x() + var11.z(), var2, var3);
               }

               if (var8) {
                  this.N(var11.y(), var2, var4);
                  this.N(var11.y() + var11.w(), var2, var4);
               }
            }
         }
      }

      if (var7) {
         this.y(var5 / 2.0F, var2, var3);
      }

      if (var8) {
         this.N(var6 / 2.0F, var2, var4);
      }
   }

   private void N(float var1, Vector2f var2, float var3) {
      float var4 = this.N(var1, var2.y, var3);
      if (!Float.isNaN(var4)) {
         var2.y = var4;
         ((List)this.N_0).add(new Vector2f(-1.0F, var1));
      }
   }

   public void N() {
      ((List)this.N_0).clear();
   }
}
