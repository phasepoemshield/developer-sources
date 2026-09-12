package Nursultan;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08844;
import org.joml.Matrix4f;

@class11080(
   L = "Arrows",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class Arrows extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public static Object i_0;

   public Arrows() {
      this.m();
      this.u_0 = new class11023(this, "players", true);
      this.u_1 = new class11010(this, "friends", true);
      this.u_2 = new class11032(this, "villagers", true);
      this.u_3 = new class11044(this, "monsters", true);
      this.u_4 = new class11016(this, "animals", true);
      this.u_5 = new class11011(this, "items", true);
      this.u_6 = new class11012(this, "party", true);
      this.u_7 = class11524.y(
         this,
         "entities",
         (class11023)this.u_0,
         (class11012)this.u_6,
         (class11010)this.u_1,
         (class11032)this.u_2,
         (class11011)this.u_5,
         (class11044)this.u_3,
         (class11016)this.u_4
      );

      for (class11034 var2 : ((class11523)this.u_7).L()) {
         if (var2 instanceof class11801) {
            var2.N(this);
         }
      }

      this.L_0 = class11174.N()
         .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N())
         .N(class11213.N((class09087)class09063.N_2, 4096, 1024))
         .N();
      this.L_1 = ((class09322)class11185.Z_1).z("u_projection");
      this.L_2 = ((class09322)class11185.Z_1).z("u_view");
      this.L_3 = ((class09322)class11185.Z_1).M("texture_in");
      this.L_4 = new Matrix4f();
   }

   static {
      s();
   }

   private static void s() {
      i_0 = 32.0F;
   }

   private void m() {
   }

   @class11782
   public void N(class10967 var1) {
      this.m();
      class06889 var2 = class11925.y();
      class08844 var3 = ((class06202)super.y_0).Nt();
      float var4 = (float)var3.U() / 2.0F;
      float var5 = (float)var3.E() / 2.0F;
      float var6 = class11908.N(class11505.y().y());
      float var7 = class04995.P((double)var6);
      float var8 = class04995.m((double)var6);

      for (class07049 var10 : ((class03448)((class06202)super.y_0).T_3).M()) {
         for (class11034 var12 : (List)((class11523)this.u_7).i()) {
            if (var12.test(var10)) {
               double var13 = class11925.i(var10);
               double var15 = class11925.L(var10);
               double var17 = ((class04453)((class06202)super.y_0).T_4).method_5858(var10);
               this.N(var12, null, var13, var2, var15, var7, var8, var4, var5, var17);
            }
         }
      }

      if (((class11012)this.u_6).U()) {
         for (class09309 var22 : class11938.N().N()) {
            float var23 = (float)(System.currentTimeMillis() - var22.y()) / 1000.0F;
            double var24 = var22.i().x();
            double var14 = var22.i().z();
            double var16 = class04995.u((double)var23, var22.N().x(), var24);
            double var18 = class04995.u((double)var23, var22.N().z(), var14);
            String var20 = var22.L()
               + " "
               + (int)Math.hypot(
                  ((class04453)((class06202)super.y_0).T_4).method_23317() - var24, ((class04453)((class06202)super.y_0).T_4).method_23321() - var14
               )
               + "m";
            this.N((class11012)this.u_6, var20, var16, var2, var18, var7, var8, var4, var5, var22.i().distanceSquared(var2.M, var2.B, var2.Z));
         }
      }

      class11925.N(((class06202)super.y_0).e(), true);
      ((class11174)this.L_0).N(var1x -> {
         this.m();
         ((class12038)this.L_1).N(class11925.L());
         ((class12038)this.L_2).N(RenderSystem.getModelViewMatrix());
         ((class12026)this.L_3).N(((class12031)class11998.N_2).N());
      });
   }

   private int N(double var1, int var3) {
      var1 = Math.clamp(var1 / 512.0, 0.5, 1.0);
      return class11300.N(var3, (int)((double)class11300.y(var3) * var1));
   }

   private void N(class11034 var1, String var2, double var3, class06889 var5, double var6, float var8, float var9, float var10, float var11, double var12) {
      this.m();
      double var14 = var3 - var5.M;
      double var16 = var6 - var5.Z;
      double var18 = -(var16 * (double)var8 - var14 * (double)var9);
      double var20 = -(var14 * (double)var8 + var16 * (double)var9);
      float var23 = class11908.N((float)class04995.u(var18, var20) * 180.0F / (float) Math.PI);
      float var24 = var10 + var1.N() * class04995.P((double)var23);
      float var25 = var11 + var1.N() * class04995.m((double)var23);
      if (var2 != null) {
         class09093 var26 = class09080.u();
         float var27 = 12.0F;
         class11176.N(var26, var2, var24 - var26.y(var2, var27, class09079.REGULAR, false) / 2.0F, var25 - 32.0F, var27, var1.L(), -16777216);
      }

      ((Matrix4f)this.L_4).identity().translate(var24, var25, 0.0F).rotate(var23, 0.0F, 0.0F, 1.0F);
      class11176.y(((class11174)this.L_0).u(), (Matrix4f)this.L_4, -16.0F, -16.0F, 0.0F, 32.0F, 32.0F, this.N(var12, var1.L()));
   }
}
