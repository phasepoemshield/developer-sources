package Nursultan;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.regex.Pattern;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08844;
import org.joml.Matrix4f;
import org.joml.Vector2dc;

@class11080(
   L = "GPS",
   y = class11072.VISUAL,
   N = class11106.INTERFACE
)
public class GPS extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public static Object u_0 = Pattern.compile("^-?\\d*\\.?\\d*$");
   public static Object u_1;
   public static Object u_2;
   public static Object u_3;

   private static void P() {
      u_0 = null;
      u_1 = 32.0F;
      u_2 = 60.0F;
      u_3 = -1;
   }

   private void T() {
   }

   public GPS() {
      this.T();
      this.L_0 = (class11533)class11524.N(this, "target-x", "", (Pattern)u_0).N_6((var1, var2) -> this.s());
      this.L_1 = (class11533)class11524.N(this, "target-z", "", (Pattern)u_0).N_6((var1, var2) -> this.s());
      this.L_2 = class11524.N(this, "clear-target", this::m);
      this.L_3 = class11174.N()
         .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N())
         .N(class11213.N((class09087)class09063.N_2, 256, 64))
         .N();
      this.L_4 = ((class09322)class11185.Z_1).z("u_projection");
      this.L_5 = ((class09322)class11185.Z_1).z("u_view");
      this.L_6 = ((class09322)class11185.Z_1).M("texture_in");
      this.L_7 = new Matrix4f();
   }

   static {
      P();
   }

   private static Double B(String var0) {
      try {
         return Double.parseDouble(var0);
      } catch (NumberFormatException var2) {
         return null;
      }
   }

   private void s() {
      this.T();
      class11938.Q().N(B(((class11533)this.L_0).i()), B(((class11533)this.L_1).i()));
   }

   @Override
   public void m() {
      this.T();
      ((class11533)this.L_0).N("");
      ((class11533)this.L_1).N("");
   }

   private static String N(double var0) {
      return !Double.isInfinite(var0) && var0 == Math.rint(var0) ? Long.toString((long)var0) : Double.toString(var0);
   }

   public void N(double var1, double var3) {
      this.T();
      ((class11533)this.L_0).N(N(var1));
      ((class11533)this.L_1).N(N(var3));
   }

   @class11782
   public void N(class10967 var1) {
      this.T();
      class10705 var2 = class11938.Q();
      if ((class04453)((class06202)super.y_0).T_4 != null && (class03448)((class06202)super.y_0).T_3 != null && var2.L()) {
         Vector2dc var3 = var2.u();
         class06889 var4 = class11925.y();
         class08844 var5 = ((class06202)super.y_0).Nt();
         float var6 = class11938.i().u();
         float var7 = (float)var5.U() / 2.0F;
         float var8 = (float)var5.E() / 4.0F;
         class11499 var9 = class11505.y();
         float var10 = class11908.N(var9.y());
         float var11 = class04995.P((double)var10);
         float var12 = class04995.m((double)var10);
         double var13 = var3.x() - var4.M;
         double var15 = var3.y() - var4.Z;
         double var17 = -(var15 * (double)var11 - var13 * (double)var12);
         double var19 = -(var13 * (double)var11 + var15 * (double)var12);
         float var22 = class11908.N((float)class04995.u(var17, var19) * 180.0F / (float) Math.PI);
         String var24 = "GPS: "
            + (int)Math.hypot(
               var3.x() - ((class04453)((class06202)super.y_0).T_4).method_23317(), var3.y() - ((class04453)((class06202)super.y_0).T_4).method_23321()
            )
            + "m";
         class09093 var25 = class09080.u();
         float var26 = 16.0F * var6;
         float var27 = var25.y(var24, var26, class09079.REGULAR, false);
         float var28 = var25.N(var26, class09079.REGULAR, false);
         float var29 = 100.0F * var6;
         float var30 = class11908.N(60.0F * (1.0F - Math.clamp(var9.R(), 0.0F, 90.0F) / 90.0F));
         float var31 = var29 * class04995.P((double)var22);
         float var32 = var29 * class04995.m((double)var22);
         float var33 = 32.0F * var6;
         ((Matrix4f)this.L_7).identity().translate(var7, var8, 0.0F).rotateX(var30).translate(var31, var32, 0.0F).rotateZ(var22);
         class11176.y(((class11174)this.L_3).u(), (Matrix4f)this.L_7, -var33 / 2.0F, -var33 / 2.0F, 0.0F, var33, var33, -1);
         var25.y(var24).N(var7 - var27 / 2.0F, var8 - var28 / 2.0F).N(var26).N(class09079.REGULAR).N(class11300.L(0, 50.0F)).i(-1).L();
         class11925.N(((class06202)super.y_0).e(), true);
         ((class11174)this.L_3).N(var1x -> {
            this.T();
            ((class12038)this.L_4).N(class11925.L());
            ((class12038)this.L_5).N(RenderSystem.getModelViewMatrix());
            ((class12026)this.L_6).N(((class12031)class11998.N_2).N());
         });
      }
   }
}
