package Nursultan;

import java.util.Objects;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class08844;
import org.joml.Vector2f;
import org.joml.Vector4f;

public abstract class class11769 {
   public Object B_0;
   public Object B_1;
   public Object B_2;
   public Object Z_0;
   public Object Z_1;
   public Object Z_2;
   public Object Z_3;
   public Object Z_4;
   public Object Z_5;
   public Object Z_6;
   public Object Z_7;
   public boolean Z_init;
   public static Object z_0 = class09991.N().N(class09962.N()).y(class09962.N());
   public static Object z_1;
   public static Object z_2;
   public static Object z_3 = class09991.N().N(false);
   public static Object z_4;

   public class11763 L() {
      return (class11763)this.Z_7 != null ? (class11763)this.Z_7 : class11763.LEFT;
   }

   public void M() {
      Vector2f var1 = this.U();
      this.Z_7 = (Boolean)this.Z_1 ? class11763.N(var1.x, B()) : null;
      this.N(var1.x, var1.y);
   }

   public void P() {
      if ((class09785)this.Z_6 != null) {
         int var10000 = (Integer)z_4 + 1;
         z_4 = var10000;
         int var1 = var10000;
         if (((class09785)this.Z_6).L() == null || (Integer)((class09785)this.Z_6).L() != var1) {
            ((class09785)this.Z_6).N(var1);
         }
      }
   }

   public class11769(class09788<Void> var1) {
      this.t();
      this.Z_2 = new class09793();
      this.Z_3 = new class09793();
      class11761 var2 = Objects.requireNonNull(this.getClass().getAnnotation(class11761.class), "The hud component should be annotated @HudComponentTag");
      this.B_1 = var2.u();
      this.B_2 = new Vector2f(var2.i(), var2.N());
      this.Z_0 = var2.y();
      this.Z_1 = var2.L();
      this.B_0 = var1;
      this.Z_4 = new class11760(var2.u());
      class11938.L().y(this);
   }

   static {
      j();
      class09991 var66 = class09991.N().l(1.0F);
      z_1 = class09991.N((class09991)z_0, var66.N(class09994.s((class09743)class11644.N_0)));
      class09991 var67 = class09991.N().l(0.0F);
      z_2 = class09991.N((class09991)z_0, var67.N(class09994.s((class09743)class11644.N_0)));
   }

   public static float B() {
      class11753 var0 = class11938.i();
      float var1 = var0 != null ? var0.u() : 1.0F;
      return (float)Math.max(1, class06202.Nq().Nt().U()) / var1;
   }

   public class09788<Void> Z() {
      return this::N;
   }

   public class09793<class09904> i() {
      return (class09793<class09904>)this.Z_3;
   }

   public boolean s() {
      return (class11616)this.Z_0 != class11616.NONE && class11753.y() && this.N();
   }

   public Vector2f m() {
      if ((class09785)this.Z_5 == null) {
         return null;
      } else {
         Vector4f var1 = (Vector4f)((class09785)this.Z_5).L();
         return new Vector2f(var1.x(), var1.y());
      }
   }

   private void t() {
      if (!this.Z_init) {
         this.Z_init = true;
         this.Z_1 = false;
      }
   }

   private static void j() {
      z_0 = null;
      z_1 = null;
      z_2 = null;
      z_3 = null;
      z_4 = 0;
   }

   public Vector2f U() {
      return (Vector2f)this.B_2;
   }

   public class09991 z() {
      return class09991.N;
   }

   public static float u() {
      class11753 var0 = class11938.i();
      float var1 = var0 != null ? var0.u() : 1.0F;
      return (float)Math.max(1, class06202.Nq().Nt().E()) / var1;
   }

   public boolean y() {
      return true;
   }

   private void y(boolean var1) {
      if ((Boolean)this.Z_1 && (class09785)this.Z_5 != null) {
         Vector4f var2 = (Vector4f)((class09785)this.Z_5).L();
         if (var2 != null) {
            if ((class11763)this.Z_7 == null) {
               class11763 var8 = class11938.M().N(class11292.class).N((String)this.B_1);
               this.Z_7 = var8 != null ? var8 : class11763.N(var2.x, B());
            } else if (var1 && ((class11616)this.Z_0).y()) {
               class09904 var3 = (class09904)((class09793)this.Z_2).N();
               if (var3 != null && var3.K() != null) {
                  float var4 = var3.c().u();
                  if (!(var4 <= 0.0F)) {
                     class11763 var6 = class11763.N(var2.x + (0.5F - ((class11763)this.Z_7).N()) * var4, B());
                     if (var6 != (class11763)this.Z_7) {
                        float var7 = (var6.N() - ((class11763)this.Z_7).N()) * var4;
                        this.Z_7 = var6;
                        var2.x += var7;
                        var2.z += var7;
                        ((class09785)this.Z_5).N(var2);
                     }
                  }
               }
            }
         }
      }
   }

   public String E() {
      return (String)this.B_1;
   }

   public boolean N() {
      return true;
   }

   public void N(float var1, float var2) {
      if ((class09785)this.Z_5 != null) {
         ((class09785)this.Z_5).N(((Vector4f)((class09785)this.Z_5).L()).set(var1, var2, var1, var2));
      }
   }

   private class09798 N(Void var1, class09809 var2) {
      this.Z_5 = var2.N((String)this.B_1 + "Position", () -> {
         Vector2f var1x = class11938.M().N(class11292.class).L((String)this.B_1);
         Vector2f var2x = this.U();
         float var3x = var1x != null && ((class11616)this.Z_0).y() ? var1x.x : var2x.x;
         float var4x = var1x != null && ((class11616)this.Z_0).N() ? var1x.y : var2x.y;
         return new Vector4f(var3x, var4x, var3x, var4x);
      });
      this.Z_6 = var2.N((String)this.B_1 + "ZIndex", 0);
      class09785 var3 = var2.N((String)this.B_1 + "Dragging", false);
      class09785 var4 = var2.N((String)this.B_1 + "DragOffset", new Vector2f());
      this.y((Boolean)var3.L());
      this.N((Boolean)var3.L());
      if (!this.y()) {
         return class09778.N(var1x -> var1x.N((String)this.B_1 + "Draggable").N((class09991)z_3));
      } else {
         var2.L("chatOpened", class11753::y);
         return var2.N(
            (String)this.B_1 + "Draggable",
            (class09788<class11613>)class11609.N_0,
            new class11613(
               (String)this.B_1,
               (class09793<class09904>)this.Z_2,
               N((Integer)((class09785)this.Z_6).L(), this.N(), this.z(), this.L().y()),
               class11609.N((class09785<Vector4f>)this.Z_5),
               var3,
               var4,
               class11633.N((class11616)this.Z_0),
               (var2x, var3x) -> {
                  var2x.y(((class11760)this.Z_4).N(var3x, this, var3, var3x.N((String)this.B_1 + "Content", (class09788)this.B_0, null)));
                  var2x.y(class11748.N(var3x, this));
               }
            )
         );
      }
   }

   private static class09991 N(int var0, boolean var1, class09991 var2, class09991 var3) {
      class09991 var4 = var1 ? (class09991)z_1 : (class09991)z_2;
      return class09991.N(var4, var2, var3, class09991.N().N(var0));
   }

   private void N(boolean var1) {
      if (!var1 && (class09785)this.Z_5 != null) {
         Vector4f var2 = (Vector4f)((class09785)this.Z_5).L();
         if (var2 != null) {
            class11753 var3 = class11938.i();
            if (var3 != null) {
               class09904 var4 = (class09904)((class09793)this.Z_2).N();
               if (var4 != null && var4.K() != null) {
                  float var5 = var4.c().u();
                  float var6 = var4.c().i();
                  if (!(var5 <= 0.0F) && !(var6 <= 0.0F)) {
                     class08844 var7 = class06202.Nq().Nt();
                     float var8 = var3.u();
                     float var9 = Math.max(0.0F, (float)Math.max(1, var7.U()) / var8 - var5);
                     float var10 = Math.max(0.0F, (float)Math.max(1, var7.E()) / var8 - var6);
                     float var11 = this.L().N() * var5;
                     float var12 = class04995.N(var2.x, var11, var9 + var11);
                     float var13 = class04995.N(var2.y, 0.0F, var10);
                     if (var12 != var2.z || var13 != var2.w) {
                        var2.z = var12;
                        var2.w = var13;
                        ((class09785)this.Z_5).N(var2);
                     }
                  }
               }
            }
         }
      }
   }

   public boolean W() {
      if (!this.s()) {
         return false;
      } else {
         class09904 var1 = (class09904)((class09793)this.Z_2).N();
         return var1 != null && var1.E();
      }
   }

   public Vector4f R() {
      if (this.y() && this.N()) {
         class09904 var1 = (class09904)((class09793)this.Z_2).N();
         if (var1 != null && var1.K() != null) {
            float var2 = var1.c().u();
            float var3 = var1.c().i();
            return !(var2 <= 0.0F) && !(var3 <= 0.0F) ? new Vector4f(var1.c().y(), var1.c().L(), var2, var3) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
