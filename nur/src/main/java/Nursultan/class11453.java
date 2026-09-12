package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.time.Duration;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04790;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07438;
import minecraft.class08066;
import minecraft.class08133;
import org.joml.Matrix4f;

public class class11453 extends class11807<TargetEsp> {
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public static Object L_0 = Duration.ofMillis(300L);
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
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;

   public class11453(TargetEsp var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.B();
      this.i_0 = new class11934(class11903.FORWARDS);
      this.i_1 = new class10203(null, 1, 1, true);
      this.i_2 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.i_3 = class11174.N().N(class11204.L().N((class12036)class12019.N_1).N((class09322)class11185.N_0).N(4).N()).N((class11213)this.i_2).N();
      this.i_4 = new Matrix4f();
      this.i_5 = new Matrix4f();
      this.u_0 = new Matrix4f();
      this.u_1 = ((class09322)class11185.N_0).z("u_projection");
      this.u_2 = ((class09322)class11185.N_0).z("u_view");
      this.u_3 = ((class09322)class11185.N_0).L("texture_in");
      this.u_4 = ((class09322)class11185.N_0).L("depth_texture_in");
      this.u_5 = ((class09322)class11185.N_0).z("inv_mvp");
      this.u_6 = ((class09322)class11185.N_0).U("u_center");
      this.u_7 = ((class09322)class11185.N_0).i("u_band_y");
      this.y_0 = ((class09322)class11185.N_0).R("u_dir_vel");
      this.y_1 = ((class09322)class11185.N_0).i("u_time");
      this.y_2 = ((class09322)class11185.N_0).i("u_alpha");
   }

   static {
      N();
      m();
   }

   private void B() {
   }

   private static void m() {
      L_0 = null;
      L_1 = 0.5F;
      L_2 = 0.1F;
      L_3 = Math.PI * 10;
   }

   @Override
   public void y(Object var1) {
      this.B();
      if (var1 instanceof class09321 var2) {
         ((class11934)this.i_0).N(((TargetEsp)super.N_1).m() ? 1.0 : 0.0, (Duration)L_0, (class11887)class11905.u_4);
         ((class11934)this.i_0).N();
         if (((class11934)this.i_0).N(class11903.BACKWARDS)) {
            return;
         }

         class07438 var3 = ((TargetEsp)super.N_1).T();
         if (var3.method_31481() || !class11925.y(var3)) {
            return;
         }

         this.N(var2, var3);
         this.y(var2, var3);
      }
   }

   private void y(class09321 var1, class07438 var2) {
      this.B();
      class08066 var3 = ((class06202)super.N_0).e();
      int var4 = var3.N;
      int var5 = var3.y;
      ((Matrix4f)this.i_4).setOrtho(0.0F, (float)var4, (float)var5, 0.0F, -1.0F, 1000.0F);
      class11176.N((class11213)this.i_2, 0.0F, 0.0F, 0.0F, (float)var4, (float)var5, ((class11515)((TargetEsp)super.N_1).L_5).i());
      ((Matrix4f)this.i_5).set(var1.i()).mul(var1.N());
      ((Matrix4f)this.u_0).set((Matrix4f)this.i_5).invert();
      class06889 var6 = var1.y().y();
      float var7 = (float)(class11925.i(var2) - var6.M);
      float var8 = (float)(class11925.u(var2) - var6.B);
      float var9 = (float)(class11925.L(var2) - var6.Z);
      float var10 = var2.method_17682();
      double var11 = (double)((float)((class04453)((class06202)super.N_0).T_4).field_6012 + ((class06202)super.N_0).NK().N(false)) / 20.0;
      double var13 = var11 % 2.0 * 0.5 * (float) (Math.PI * 2);
      float var15 = var10 / 2.0F + 0.1F;
      float var16 = var8 + var10 / 2.0F + (float)Math.sin(var13) * var15;
      float var17 = (float)Math.cos(var13);
      class11925.N(((class08066)this.i_1).L());
      class11925.N(((class08066)this.i_1).i());
      ((class11174)this.i_3).N(var8x -> {
         this.B();
         GlStateManager._activeTexture(33984);
         GlStateManager._bindTexture(class11925.N((class08066)this.i_1));
         GlStateManager._activeTexture(33990);
         GlStateManager._bindTexture(class11925.y((class08066)this.i_1));
         ((class12038)this.u_1).N((Matrix4f)this.i_4);
         ((class12038)this.u_2).N((Matrix4f)class11925.y_3);
         ((class12003)this.u_3).N(0);
         ((class12003)this.u_4).N(6);
         ((class12038)this.u_5).N((Matrix4f)this.u_0);
         ((class12017)this.u_6).N(var7, var8, var9);
         ((class11200)this.u_7).N(var16);
         ((class11993)this.y_0).N(var17 > 0.0F ? 1.0F : -1.0F, Math.abs(var17));
         ((class11200)this.y_1).N((float)(var11 % (Math.PI * 10)));
         ((class11200)this.y_2).N(((class11934)this.i_0).E().floatValue());
      });
   }

   private void N(class09321 var1, class07438 var2) {
      this.B();
      class08066 var3 = ((class06202)super.N_0).e();
      class12027.N();
      class11925.N((class08066)this.i_1, var3.N, var3.y);
      class04790 var4 = ((class03063)((class06202)super.N_0).B_2).Z;
      class08133 var5 = ((class03063)((class06202)super.N_0).B_2).z;
      class06959 var6 = ((class03063)((class06202)super.N_0).B_2).B.N;
      class01422 var7 = ((class03063)((class06202)super.N_0).B_2).u.L();
      class06889 var8 = var1.y().y();
      class01421 var9 = new class01421();
      var9.L().N().mul(var1.N());
      RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((class08066)this.i_1).L(), 0, ((class08066)this.i_1).i(), 1.0);
      class09078.N((class08066)this.i_1);
      ((class11792)((class06202)super.N_0).Ng())
         .N(var2, var6, var8.M, var8.B, var8.Z, var1.u().N(((class03448)((class06202)super.N_0).T_3).method_54719().N(var2)), var9, var4);
      class11925.N((class08066)this.i_1, true);
      var5.N();
      var7.u();
      class09078.L();
      class11925.N(var3, true);
      GlStateManager._depthFunc(515);
      class12027.y();
   }

   private static void N() {
   }
}
