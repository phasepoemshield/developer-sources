package Nursultan;

import baritone.api.behavior.IPathingBehavior;
import baritone.api.pathing.goals.GoalBlock;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class08844;
import org.joml.Vector2f;
import org.joml.Vector3d;

@class11080(
   L = "FreeCamera",
   y = class11072.MOVEMENT,
   N = class11106.TOOLS
)
public class FreeCamera extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;

   public FreeCamera() {
      this.v();
      this.L_0 = class11524.N(this, "speed-xz", 1.0F, 0.1F, 4.0F, 0.1F);
      this.L_1 = class11524.N(this, "speed-y", 0.6F, 0.1F, 2.0F, 0.1F);
      this.L_2 = class11524.N(this, "walk-by-click", false);
      this.L_3 = class11524.N(this, "show-camera-position", true);
      this.L_4 = new Vector3d(0.0, 0.0, 0.0);
      this.L_5 = new Vector3d(0.0, 0.0, 0.0);
      this.L_6 = new Vector2f(0.0F, 0.0F);
   }

   @Override
   public boolean Z() {
      this.v();
      if ((class04453)((class06202)super.y_0).T_4 != null && (class03448)((class06202)super.y_0).T_3 != null) {
         class05363 var1 = ((class03386)((class06202)super.y_0).i_5).s();
         class06889 var2 = var1.y();
         ((Vector3d)this.L_5).set(new Vector3d(var2.M, var2.B, var2.Z));
         ((Vector3d)this.L_4).set((Vector3d)this.L_5);
         this.L_6 = new Vector2f(var1.R(), var1.i());
         return super.Z();
      } else {
         this.N(false);
         return false;
      }
   }

   @Override
   public boolean i() {
      if ((class04453)((class06202)super.y_0).T_4 != null && class11907.i()) {
         IPathingBehavior var1 = class11907.N().getPathingBehavior();
         var1.cancelEverything();
         var1.forceCancel();
      }

      return super.i();
   }

   private void v() {
   }

   @class11782
   public void N(class09305 var1) {
      var1.N(true);
   }

   @class11782(
      y = class11777.AFTER
   )
   public void N(class09316 var1) {
      this.v();
      var1.N(((Vector2f)this.L_6).x);
      var1.y(((Vector2f)this.L_6).y);
      var1.L(class04995.u((double)class11925.N((class04453)((class06202)super.y_0).T_4), ((Vector3d)this.L_4).x, ((Vector3d)this.L_5).x));
      var1.y(class04995.u((double)class11925.N((class04453)((class06202)super.y_0).T_4), ((Vector3d)this.L_4).y, ((Vector3d)this.L_5).y));
      var1.N(class04995.u((double)class11925.N((class04453)((class06202)super.y_0).T_4), ((Vector3d)this.L_4).z, ((Vector3d)this.L_5).z));
      var1.N();
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class10967 var1) {
      this.v();
      if (((class11507)this.L_3).i()) {
         String var2 = String.format("x: %s y: %s z: %s", (int)((Vector3d)this.L_5).x(), (int)((Vector3d)this.L_5).y(), (int)((Vector3d)this.L_5).z());
         class08844 var3 = ((class06202)super.y_0).Nt();
         class09093 var4 = class09080.u();
         float var5 = (float)var3.U() / 2.0F;
         float var6 = (float)var3.E() / 2.0F;
         float var7 = 16.0F;
         class11176.N(var4, var2, var5 - var4.y(var2, var7, class09079.REGULAR, false) / 2.0F, var6 - 60.0F, var7, -1, -16777216);
      }
   }

   @class11782
   public void N(class10991 var1) {
      var1.N(true);
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.v();
      if (((class11507)this.L_2).i() && var1.Z() == class11381.MOUSE && var1.z() == 1) {
         if (!class11907.i()) {
            class06889 var2 = ((class03386)((class06202)super.y_0).i_5).s().y();
            class06889 var3 = ((class04453)((class06202)super.y_0).T_4).method_5631(((Vector2f)this.L_6).y, ((Vector2f)this.L_6).x).L(256.0);
            class06889 var4 = var2.i(var3);
            class06183 var5 = ((class03448)((class06202)super.y_0).T_3)
               .N(new class05862(var2, var4, class05849.field_17558, class05835.field_1348, (class04453)((class06202)super.y_0).T_4));
            if (var5 != null && var5.N() == class07113.field_1332) {
               class07209 var6 = var5.u();
               class11907.N().getCustomGoalProcess().setGoalAndPath(new GoalBlock(var6.method_10263(), var6.method_10264() + 1, var6.method_10260()));
            }
         }
      }
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class10996 var1) {
      this.v();
      ((Vector3d)this.L_4).set((Vector3d)this.L_5);
      if (!class11902.y()) {
         boolean var2 = class11902.N(((class05630)((class06202)super.y_0).i_7).n.N.y());
         boolean var3 = class11902.N(((class05630)((class06202)super.y_0).i_7).G.N.y());
         boolean var4 = class11902.N(((class05630)((class06202)super.y_0).i_7).t.N.y());
         boolean var5 = class11902.N(((class05630)((class06202)super.y_0).i_7).l.N.y());
         float var6 = var2 == var3 ? 0.0F : (var2 ? 1.0F : -1.0F);
         float var7 = var4 == var5 ? 0.0F : (var4 ? 1.0F : -1.0F);
         boolean var8 = class11902.N(((class05630)((class06202)super.y_0).i_7).d.N.y());
         boolean var9 = class11902.N(((class05630)((class06202)super.y_0).i_7).w.N.y());
         if (var8) {
            ((Vector3d)this.L_5).y = ((Vector3d)this.L_5).y + (double)((class11504)this.L_1).i().floatValue();
         }

         if (var9) {
            ((Vector3d)this.L_5).y = ((Vector3d)this.L_5).y - (double)((class11504)this.L_1).i().floatValue();
         }

         if (var7 != 0.0F || var6 != 0.0F) {
            float var10 = class11908.N(class11902.N(((Vector2f)this.L_6).x, var6, var7));
            ((Vector3d)this.L_5).x = ((Vector3d)this.L_5).x + (double)(-class04995.m((double)var10) * ((class11504)this.L_0).i());
            ((Vector3d)this.L_5).z = ((Vector3d)this.L_5).z + (double)(class04995.P((double)var10) * ((class11504)this.L_0).i());
         }
      }
   }

   @class11782(
      y = class11777.BEFORE
   )
   public void N(class11385 var1) {
      class11902.N(var1);
   }

   @class11782(
      y = class11777.BEFORE
   )
   public void N(class11384 var1) {
      this.v();
      ((Vector2f)this.L_6).x = ((Vector2f)this.L_6).x + (float)var1.u() * 0.15F;
      ((Vector2f)this.L_6).y = ((Vector2f)this.L_6).y + (float)var1.L() * 0.15F;
      ((Vector2f)this.L_6).y = class04995.N(((Vector2f)this.L_6).y, -90.0F, 90.0F);
      var1.N();
   }

   @class11782(
      y = class11777.AFTER
   )
   public void N(class10976 var1) {
      var1.N(true);
      var1.y(false);
   }
}
