package Nursultan;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import minecraft.class00556;
import minecraft.class00565;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07062;
import minecraft.class07107;
import minecraft.class07299;

@class11080(
   L = "FakePlayer",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class FakePlayer extends class11067 {
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public boolean u_init;

   private static void T() {
      L_0 = null;
      L_1 = 2.0F;
      L_2 = 0.1F;
      L_3 = 3;
   }

   private void Q() {
      this.G();
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      String var2 = ((String[])L_0)[var1.nextInt(((String[])L_0).length)] + var1.nextInt(10, 100);
      class10401 var3 = new class10401((class03448)((class06202)super.y_0).T_3, new GameProfile(UUID.randomUUID(), var2));
      var3.method_5838(-var1.nextInt(1000000, 2000000));
      this.u_4 = ((class04453)((class06202)super.y_0).T_4).method_73189();
      this.u_6 = ((class04453)((class06202)super.y_0).T_4).method_36454();
      float var4 = class11908.N((Float)this.u_6);
      this.u_5 = new class06889((double)(-class04995.P((double)var4)), 0.0, (double)(-class04995.m((double)var4)));
      this.u_7 = 0.0F;
      var3.method_5808(((class06889)this.u_4).M, ((class06889)this.u_4).B, ((class06889)this.u_4).Z, (Float)this.u_6, 0.0F);
      var3.method_5847((Float)this.u_6);
      var3.method_5636((Float)this.u_6);
      ((class03448)((class06202)super.y_0).T_3).u(var3);
      this.u_3 = var3;
   }

   public FakePlayer() {
      this.G();
      this.u_0 = class11524.N(this, "walk", true);
      this.u_1 = class11524.N(this, "rotate", true);
      this.u_2 = new class11046(this);
      this.u_4 = class06889.L;
      this.u_5 = class06889.L;
   }

   static {
      T();
   }

   @Override
   public boolean i() {
      this.d();
      return super.i();
   }

   private void l() {
      this.G();
      double var1 = ((class04453)((class06202)super.y_0).T_4).method_45325(class05298.u);
      int var3 = Math.max(1, (int)(var1 * 0.5));

      for (int var4 = 0; var4 < var3; var4++) {
         ((class03448)((class06202)super.y_0).T_3)
            .method_8406(
               class07107.B,
               ((class10401)this.u_3).method_23317(),
               ((class10401)this.u_3).method_23323(0.5),
               ((class10401)this.u_3).method_23321(),
               ((class03448)((class06202)super.y_0).T_3).field_9229.E() * 0.1,
               0.0,
               ((class03448)((class06202)super.y_0).T_3).field_9229.E() * 0.1
            );
      }
   }

   private void d() {
      this.G();
      if ((class10401)this.u_3 != null) {
         class07299 var2 = ((class10401)this.u_3).method_73183();
         if (var2 instanceof class03448) {
            ((class03448)var2).N(((class10401)this.u_3).method_5628(), class07062.field_26999);
         }

         this.u_3 = null;
      }
   }

   private void k() {
      this.G();
      class06889 var1 = (class06889)this.u_4;
      float var2 = (Float)this.u_6;
      float var3 = 0.0F;
      if (((class11507)this.u_0).i()) {
         this.u_7 = (Float)this.u_7 + 0.1F;
         var1 = ((class06889)this.u_4).i(((class06889)this.u_5).L((double)(class04995.m((double)((Float)this.u_7).floatValue()) * 2.0F)));
         double var4 = class04995.P((double)((Float)this.u_7).floatValue()) >= 0.0F ? 1.0 : -1.0;
         class06889 var6 = ((class06889)this.u_5).L(var4);
         var2 = class11908.y(class04995.u(-var6.M, var6.Z));
      }

      if (((class11507)this.u_1).i()) {
         double var10 = ((class04453)((class06202)super.y_0).T_4).method_23317() - ((class10401)this.u_3).method_23317();
         double var11 = ((class04453)((class06202)super.y_0).T_4).method_23320() - ((class10401)this.u_3).method_23320();
         double var8 = ((class04453)((class06202)super.y_0).T_4).method_23321() - ((class10401)this.u_3).method_23321();
         var2 = class11908.y(class04995.u(var8, var10)) - 90.0F;
         var3 = -class11908.y(class04995.u(var11, Math.hypot(var10, var8)));
      }

      ((class10401)this.u_3).method_66233().method_66267(var1, var2, var3);
      ((class10401)this.u_3).method_5683(var2, 3);
   }

   void t() {
      this.G();
      if ((class10401)this.u_3 != null && (class04453)((class06202)super.y_0).T_4 != null) {
         ((class10401)this.u_3).method_48922(((class10401)this.u_3).method_48923().N((class04453)((class06202)super.y_0).T_4));
         this.l();
         boolean var1 = ((class04453)((class06202)super.y_0).T_4).method_7261(0.5F) > 0.9F;
         if (var1 && ((class04453)((class06202)super.y_0).T_4).method_5624()) {
            this.N(class04909.GX);
         }

         if (var1 && this.j()) {
            this.N(class04909.Gc);
            ((class04453)((class06202)super.y_0).T_4).method_7277((class10401)this.u_3);
         } else {
            this.N(var1 ? class04909.Gp : class04909.GA);
         }
      }
   }

   private boolean j() {
      return ((class04453)((class06202)super.y_0).T_4).field_6017 > 0.0
         && !((class04453)((class06202)super.y_0).T_4).method_24828()
         && !((class04453)((class06202)super.y_0).T_4).method_6101()
         && !((class04453)((class06202)super.y_0).T_4).method_5799()
         && !((class04453)((class06202)super.y_0).T_4).method_74025()
         && !((class04453)((class06202)super.y_0).T_4).method_5765()
         && !((class04453)((class06202)super.y_0).T_4).method_5624();
   }

   @class11782
   public void N(class11380 var1) {
      this.G();
      if ((class04453)((class06202)super.y_0).T_4 != null && (class03448)((class06202)super.y_0).T_3 != null) {
         if ((class10401)this.u_3 == null
            || ((class10401)this.u_3).method_31481()
            || ((class10401)this.u_3).method_73183() != (class03448)((class06202)super.y_0).T_3) {
            this.Q();
         }

         this.k();
      } else {
         this.u_3 = null;
      }
   }

   private void N(class04891 var1) {
      ((class03448)((class06202)super.y_0).T_3)
         .method_43128(
            (class04453)((class06202)super.y_0).T_4,
            ((class04453)((class06202)super.y_0).T_4).method_23317(),
            ((class04453)((class06202)super.y_0).T_4).method_23318(),
            ((class04453)((class06202)super.y_0).T_4).method_23321(),
            var1,
            class04911.field_15248,
            1.0F,
            1.0F
         );
   }

   @class11782
   public void N(class11382 var1) {
      this.G();
      if ((class10401)this.u_3 != null && var1.L() == (class10401)this.u_3) {
         var1.N();
         this.t();
         ((class04453)((class06202)super.y_0).T_4).method_7350();
      }
   }

   @class11782
   public void N(class10965 var1) {
      this.G();
      if ((class10401)this.u_3 != null && var1.L() instanceof class00556 var2) {
         if (((class12025)var2).N() == ((class10401)this.u_3).method_5628()) {
            var1.N();
            var2.N((class00565)this.u_2);
         }
      }
   }

   private void G() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_6 = 0.0F;
         this.u_7 = 0.0F;
      }
   }
}
