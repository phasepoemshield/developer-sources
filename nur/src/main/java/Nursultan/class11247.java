package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.List;
import minecraft.class01421;
import minecraft.class03049;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07050;
import minecraft.class07070;
import minecraft.class08844;
import minecraft.class08893;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL33;

public class class11247 {
   public static Object N_0;
   public static Object N_1 = new class09087(class09069.N(3), class09069.N(2), class09069.N(3));
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;
   public Object i_7;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public Object M_4;

   private class11218<class09101> L() {
      if ((Integer)this.u_4 == 0) {
         return (class11218<class09101>)this.L_1;
      } else {
         return switch ((Integer)this.y_3) {
            case 2 -> (class11218)this.L_2;
            case 4 -> (class11218)this.u_0;
            default -> (class11218)this.u_1;
         };
      }
   }

   private class11218<class09101> M(int var1) {
      class11206 var2 = class11218.<class09101>N()
         .N((class09056)this.y_2)
         .y(var1x -> this.N(var1x, 1, 2))
         .N(var1 == 2 ? (class09064)this.R_2 : (class09064)this.R_0)
         .N(() -> class11925.N(((class06202)this.i_0).e()));
      if (var1 >= 4) {
         var2 = var2.N((class09056)this.y_2).y(var1x -> this.N(var1x, 2, 4)).N(var1 == 4 ? (class09064)this.R_2 : (class09064)this.R_1).L((class09064)this.R_0);
      }

      if (var1 == 8) {
         var2 = var2.N((class09056)this.y_2).y(var1x -> this.N(var1x, 4, 8)).N((class09064)this.R_2).L((class09064)this.R_1);
      }

      return var2.N((class09072)this.M_4)
         .y(this::N)
         .N((class09064)this.R_3)
         .L((class09064)this.R_2)
         .N((class09072)this.y_0)
         .y(this::N)
         .N((class09064)this.R_4)
         .L((class09064)this.R_3)
         .N();
   }

   private int P() {
      if ((Integer)this.u_6 == 0) {
         this.u_6 = GL33.glGenSamplers();
         GL33.glSamplerParameteri((Integer)this.u_6, 10241, 9728);
         GL33.glSamplerParameteri((Integer)this.u_6, 10240, 9728);
         GL33.glSamplerParameteri((Integer)this.u_6, 10242, 33071);
         GL33.glSamplerParameteri((Integer)this.u_6, 10243, 33071);
      }

      return (Integer)this.u_6;
   }

   public class11247() {
      this.z();
      this.i_0 = class06202.Nq();
      this.i_1 = class11213.N((class09087)N_1, 65536, 16384);
      this.i_2 = class11174.N()
         .N(
            class11204.L()
               .N(class12036.u().N((class12012)class12012.R_0).N((class12030)class12030.N_0).N((class12014)class12014.y_0).N((class11996)class11996.N_1).N())
               .N((class09322)class11185.i_4)
               .N(4)
               .N()
         )
         .N((class11213)this.i_1)
         .N();
      this.i_3 = ((class09322)class11185.i_4).z("u_projection");
      this.i_4 = ((class09322)class11185.i_4).z("u_view");
      this.i_5 = ((class09322)class11185.i_4).M("texture_in");
      this.i_6 = ((class09322)class11185.i_4).M("blurred_in");
      this.i_7 = ((class09322)class11185.i_4).N("u_color");
      this.M_0 = ((class09322)class11185.i_4).i("u_mix");
      this.M_1 = ((class09322)class11185.i_4).R("u_resolution");
      this.M_2 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.M_3 = new class09101();
      this.M_4 = class09072.N((class11213)this.M_2, (float[])class09072.N_0);
      this.y_0 = class09072.N((class11213)this.M_2, (float[])class09072.N_1);
      this.y_1 = new class09056((class11213)this.M_2, 0.0F);
      this.y_2 = new class09056((class11213)this.M_2, 2.0F);
      this.y_3 = 1;
      this.R_0 = this.U(2);
      this.R_1 = this.U(4);
      this.R_2 = this.N(class11175.CLAMP_TO_EDGE);
      this.R_3 = this.N(class11175.CLAMP_TO_EDGE);
      this.R_4 = this.N(class11175.MIRRORED_REPEAT);
      this.L_0 = BufferUtils.createFloatBuffer(30);
      this.L_1 = this.W();
      this.L_2 = this.M(2);
      this.u_0 = this.M(4);
      this.u_1 = this.M(8);
      this.u_2 = new int[4];
      this.u_5 = -1;
   }

   static {
      E();
      i();
      R();
   }

   private static void i() {
   }

   private class09064 U(int var1) {
      return class09064.N(() -> this.N(((class06202)this.i_0).Nt().U(), var1), () -> this.N(((class06202)this.i_0).Nt().E(), var1))
         .N(class11199.LINEAR, class11199.LINEAR)
         .y(class11175.CLAMP_TO_EDGE)
         .N();
   }

   private void z() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_3 = 0;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_4 = 0;
         this.u_5 = 0;
         this.u_6 = 0;
      }
   }

   public boolean y() {
      return (class09057)this.u_3 != null;
   }

   private int y(int var1) {
      if (var1 == 0) {
         return 1;
      } else if (var1 < 5) {
         return 2;
      } else {
         return var1 < 15 ? 4 : 8;
      }
   }

   private static void E() {
   }

   private void N(List<class11904> var1, Matrix4f var2, class08844 var3, class09057 var4, int var5, float var6) {
      for (class11904 var8 : var1) {
         if (!var8.i().isClosed() && var8.i().texture() instanceof class08893 var9) {
            this.N(var8);
            ((class11174)this.i_2).N(var7 -> {
               ((class12038)this.i_3).N(var2);
               ((class12038)this.i_4).N(RenderSystem.getModelViewMatrix());
               ((class12026)this.i_5).N(var9.N());
               GL33.glBindSampler(0, this.P());
               ((class12026)this.i_6).N(33985, var4.i());
               ((class12043)this.i_7).N(var5);
               ((class11200)this.M_0).N(var6);
               ((class11993)this.M_1).N((float)var3.U(), (float)var3.E());
            });
         }
      }
   }

   public void N(int var1) {
      this.u_4 = Math.clamp((long)var1, 0, 30);
      this.y_3 = this.y((Integer)this.u_4);
      if ((Integer)this.u_4 > 0 && (Integer)this.u_5 != (Integer)this.u_4) {
         this.u_5 = (Integer)this.u_4;
         class11925.N((FloatBuffer)this.L_0, (Integer)this.u_4 - 1);
      }

      int var2 = GL33.glGetInteger(36006);
      GL33.glGetIntegerv(2978, (int[])this.u_2);
      this.L().execute((class09101)this.M_3);
      GlStateManager._glBindFramebuffer(36160, var2);
      GL33.glViewport(((int[])this.u_2)[0], ((int[])this.u_2)[1], ((int[])this.u_2)[2], ((int[])this.u_2)[3]);
      this.u_3 = ((class09064)this.R_4).U();
   }

   private int N(int var1, int var2) {
      return Math.max(1, (var1 + var2 - 1) / var2);
   }

   private void N(class09101 var1) {
      class08844 var2 = ((class06202)this.i_0).Nt();
      var1.u((float)this.W(var2.U())).R((float)this.W(var2.E())).L((Integer)this.u_4).N((FloatBuffer)this.L_0);
   }

   public boolean N(class07050 var1) {
      return (class07050)this.u_7 == null || (class07050)this.u_7 == var1;
   }

   public void N(class03049 var1, float var2, class01421 var3, class04453 var4, int var5, Matrix4f var6, int var7, int var8, float var9) {
      class09057 var10 = (class09057)this.u_3;
      this.u_3 = null;

      List<class11904> var11;
      List<class11904> var12;
      try {
         this.u_7 = class07050.field_5808;
         var11 = class11890.N(var5x -> var1.N(var2, var3, var5x, var4, var5));
         this.u_7 = class07050.field_5810;
         var12 = class11890.N(var5x -> var1.N(var2, var3, var5x, var4, var5));
      } finally {
         this.u_7 = null;
      }

      if (var10 != null && (!var11.isEmpty() || !var12.isEmpty())) {
         class07070 var13 = var4.method_6068();
         class08844 var14 = ((class06202)this.i_0).Nt();

         try (class12027 var15 = class12027.y()) {
            class11925.N(((class06202)this.i_0).e(), true);
            this.N(var11, var6, var14, var10, var13 == class07070.field_6183 ? var7 : var8, var9);
            this.N(var12, var6, var14, var10, var13 == class07070.field_6183 ? var8 : var7, var9);
            GL33.glBindSampler(0, 0);
         }
      }
   }

   private void N(class09101 var1, int var2, int var3) {
      class08844 var4 = ((class06202)this.i_0).Nt();
      int var5 = this.N(var4.U(), var3);
      int var6 = this.N(var4.E(), var3);
      var1.z().setOrtho(0.0F, (float)var5, (float)var6, 0.0F, -1.0F, 1.0F);
      var1.y().set((Matrix4f)class11925.y_3);
      var1.y(0).N(0).i(var5).u(var6).u((float)this.N(var4.U(), var2)).R((float)this.N(var4.E(), var2)).y(0.0F).N(1.0F).L(1.0F).i(0.0F);
   }

   private void N(class11904 var1) {
      class11184 var2 = ((class11213)this.i_1).M();
      class11178 var3 = ((class11213)this.i_1).N();
      float[] var4 = var1.M();
      float[] var5 = var1.u();
      float[] var6 = var1.R();
      int var7 = var4.length / 3;

      for (int var8 = 0; var8 < var7; var8++) {
         var2.N(var4[var8 * 3], var4[var8 * 3 + 1], var4[var8 * 3 + 2])
            .N(var5[var8 * 2], var5[var8 * 2 + 1])
            .N(var6[var8 * 3], var6[var8 * 3 + 1], var6[var8 * 3 + 2])
            .y();
      }

      for (int var11 : var1.y()) {
         var3.N(var11);
      }
   }

   public void N() {
      this.u_3 = null;
   }

   private class09064 N(class11175 var1) {
      return class09064.N(() -> this.W(((class06202)this.i_0).Nt().U()), () -> this.W(((class06202)this.i_0).Nt().E()))
         .N(class11199.LINEAR, class11199.LINEAR)
         .y(var1)
         .N();
   }

   private class11218<class09101> W() {
      return class11218.<class09101>N()
         .N((class09056)this.y_1)
         .y(var1 -> this.N(var1, 1, 1))
         .N((class09064)this.R_4)
         .N(() -> class11925.N(((class06202)this.i_0).e()))
         .N();
   }

   private int W(int var1) {
      return this.N(var1, (Integer)this.y_3);
   }

   private static void R() {
      N_0 = 30;
      N_1 = null;
   }
}
