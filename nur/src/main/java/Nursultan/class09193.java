package Nursultan;

import java.util.Objects;
import minecraft.class06202;
import minecraft.class08844;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class09193 {
   public static Object N_0;
   public static Object N_1 = new class09193();
   public static Object N_2 = ((class09193)N_1)::N;
   public static Object N_3 = new class11854[]{
      class11854.COMBAT,
      class11854.MOVEMENT,
      class11854.VISUAL,
      class11854.PLAYER,
      class11854.MISC,
      class11854.CONFIGS,
      class11854.AUTO_BUY,
      class11854.ACCOUNTS
   };
   public static Object N_4 = class09991.N()
      .N(class09962.y(1196.0F))
      .y(class09962.y(750.0F))
      .j(10.0F)
      .y((Integer)class09181.L_1)
      .v(20.0F)
      .L(class09662.N(-16777216, 0.2F))
      .u((Integer)class09181.L_2)
      .z(1.0F)
      .N(class09975.ROW)
      .Z(16.0F);
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;

   public static void L() {
      class09785 var0 = (class09785)((class09193)N_1).y_3;
      if (var0 != null) {
         var0.N(!(Boolean)var0.L());
      }
   }

   private class09193() {
      this.W();
      this.y_0 = new class09793();
   }

   static {
      z();
      Objects.requireNonNull(N_1);
   }

   private static void z() {
      N_0 = "menu";
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
   }

   public static class09904 u() {
      class09904 var0 = (class09904)((class09793)((class09193)N_1).y_0).N();
      return var0 != null && var0.K() != null ? var0 : null;
   }

   public static Vector2f y() {
      if ((class09785)((class09193)N_1).y_1 == null) {
         return null;
      } else {
         Vector4f var0 = (Vector4f)((class09785)((class09193)N_1).y_1).L();
         return var0 == null ? null : new Vector2f(var0.x(), var0.y());
      }
   }

   private static void N(class09785<Vector4f> var0, boolean var1) {
      if (!var1) {
         Vector4f var2 = (Vector4f)var0.L();
         if (var2 != null) {
            if (class11938.w() != null) {
               class08844 var3 = class06202.Nq().Nt();
               float var4 = class09222.L();
               float var5 = (float)Math.max(1, var3.U()) / var4;
               float var6 = (float)Math.max(1, var3.E()) / var4;
               float var7 = class11623.N(var2.x, var5, 1196.0F);
               float var8 = class11623.N(var2.y, var6, 750.0F);
               if (var7 != var2.z || var8 != var2.w) {
                  var2.z = var7;
                  var2.w = var8;
                  var0.N(var2);
               }
            }
         }
      }
   }

   public static boolean N() {
      class09785 var0 = (class09785)((class09193)N_1).y_4;
      return var0 != null && !((String)var0.L()).isEmpty();
   }

   public static void N(int var0) {
      class09785 var1 = (class09785)((class09193)N_1).y_2;
      if (var1 != null && var0 >= 0 && var0 < ((class11854[])N_3).length) {
         var1.N(((class11854[])N_3)[var0]);
      }
   }

   private class09798 N(class09785<class11854> var1, class09809 var2) {
      class09785 var3 = var2.N("menuPos", () -> {
         Vector2f var0 = class11938.M().N(class11292.class).L();
         return var0 == null ? null : new Vector4f(var0.x, var0.y, var0.x, var0.y);
      });
      this.y_1 = var3;
      class09785 var4 = var2.N("menuDrag", false);
      class09785 var5 = var2.N("menuOffset", new Vector2f());
      class09785 var6 = var2.N("menuCategory", class11854.COMBAT);
      class09785 var7 = var2.y("nursultan:clientSettingsOpened", false);
      class09785 var8 = var2.y("nursultan:openModuleSettings", "");
      class09785 var9 = var2.y("nursultan:searchQuery", "");
      class09785 var10 = var2.N("searchCategory", (class11854)var6.L());
      if (var10.L() != var6.L()) {
         var10.N((class11854)var6.L());
         if (!((String)var9.L()).isEmpty()) {
            var9.N("");
         }
      }

      this.y_2 = var6;
      this.y_3 = var7;
      this.y_4 = var8;
      N(var3, (Boolean)var4.L());
      return var2.N(
         "draggableMenu",
         (class09788<class11613>)class11609.N_0,
         new class11613(
            "menu", (class09793<class09904>)this.y_0, (class09991)N_4, class11609.N(var3), var4, var5, (class11623)class11623.L_0, (var2x, var3x) -> {
               var2x.y(var2.N("sidebar", (class09788<class09785>)class09210.N_0, var6));
               var2x.y(var2.N("main", (class09788<class09785>)class09203.L_0, var6));
               var2x.y(var2.N("accountModal", (class09788)class09228.M_0, null));
               var2x.y(var2.N("deleteAccountsModal", (class09788)class09182.R_0, null));
               var2x.y(var2.N("sharePresetModal", (class09788)class09194.u_0, null));
            }
         )
      );
   }

   private void W() {
   }
}
