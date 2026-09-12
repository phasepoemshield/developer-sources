package Nursultan;

import com.mojang.blaze3d.textures.GpuTexture;
import java.util.List;
import minecraft.class03269;
import minecraft.class03386;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;
import minecraft.class08893;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL33;

public class class11074 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public Object y_7;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public boolean i_init;
   public static Object R_0;
   public static Object R_1 = new class09087(class09069.N(3), class09069.N(2), class09069.y(), class09069.N(2));

   private int M() {
      if ((Integer)this.N_3 == 0) {
         this.N_3 = GL33.glGenSamplers();
         GL33.glSamplerParameteri((Integer)this.N_3, 10241, 9728);
         GL33.glSamplerParameteri((Integer)this.N_3, 10240, 9728);
         GL33.glSamplerParameteri((Integer)this.N_3, 10242, 33071);
         GL33.glSamplerParameteri((Integer)this.N_3, 10243, 33071);
      }

      return (Integer)this.N_3;
   }

   public class11074() {
      this.i();
      this.y_0 = class06202.Nq();
      this.y_1 = class11213.N((class09087)R_1, 65536, 16384);
      this.y_2 = class11174.N()
         .N(
            class11204.L()
               .N(class12036.u().N((class12012)class12012.R_0).N((class12030)class12030.N_0).N((class12014)class12014.y_0).N((class11996)class11996.N_1).N())
               .N((class09322)class11185.i_3)
               .N(4)
               .N()
         )
         .N((class11213)this.y_1)
         .N();
      this.y_3 = ((class09322)class11185.i_3).z("u_projection");
      this.y_4 = ((class09322)class11185.i_3).z("u_view");
      this.y_5 = ((class09322)class11185.i_3).M("texture_in");
      this.y_6 = ((class09322)class11185.i_3).M("lightmap_in");
      this.y_7 = ((class09322)class11185.i_3).N("u_color");
      this.u_0 = new Matrix4f();
   }

   static {
      u();
   }

   private void i() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_6 = 0.0F;
      }

      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0.0F;
         this.i_1 = 0;
         this.i_2 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = 0.0F;
         this.L_3 = 0.0F;
         this.L_4 = 0.0F;
         this.L_5 = 0.0F;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = false;
         this.N_3 = 0;
      }
   }

   private int U() {
      GpuTexture var2 = ((class03386)((class06202)this.y_0).i_5).T().N().texture();
      return var2 instanceof class08893 ? ((class08893)var2).N() : 0;
   }

   private static void u() {
      R_0 = 3;
      R_1 = null;
   }

   private void y(class06889 var1) {
      float var3 = Math.min((float)Math.hypot(var1.M - ((class06889)this.u_4).M, var1.Z - ((class06889)this.u_4).Z) * 4.0F, 1.0F);
      this.L_5 = (Float)this.N_0;
      this.N_0 = (Float)this.N_0 + (var3 - (Float)this.N_0) * 0.4F;
      this.N_1 = (Float)this.N_1 + (Float)this.N_0;
   }

   public void N() {
      this.u_1 = null;
      this.u_2 = null;
      this.u_3 = null;
      this.u_4 = null;
      this.N_2 = false;
   }

   public void N(class07438 var1, class06889 var2) {
      this.u_1 = var1;
      class06889 var3 = var2 != null ? var2 : var1.method_73189();
      this.u_3 = var3;
      this.u_4 = var3;
      this.u_5 = var3;
      this.i_2 = var1.fields_4212a028292fd3c078969e3ee4c71d9e8_1;
      this.L_0 = var1.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      this.L_1 = var1.fields_5212a028292fd3c078969e3ee4c71d9e8_0;
      this.L_2 = var1.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
      this.L_3 = var1.field_6004;
      this.L_4 = var1.method_36455();
      this.u_6 = (Float)this.L_4;
      this.i_0 = (Float)this.L_2;
      this.i_1 = 0;
      class03269 var4 = var1.fields_3212a028292fd3c078969e3ee4c71d9e8_3;
      this.L_5 = var4.N;
      this.N_0 = var4.y;
      this.N_1 = var4.L;
      this.N_2 = true;
   }

   public void N(class06889 var1, float var2, float var3) {
      if ((Boolean)this.N_2 && var1 != null) {
         if (!var1.equals((class06889)this.u_5) || var2 != (Float)this.u_6 || var3 != (Float)this.i_0) {
            this.u_5 = var1;
            this.u_6 = var2;
            this.i_0 = var3;
            this.i_1 = 3;
         }

         this.u_3 = (class06889)this.u_4;
         this.i_2 = (Float)this.L_0;
         this.L_1 = (Float)this.L_2;
         this.L_3 = (Float)this.L_4;
         class06889 var4 = (class06889)this.u_4;
         if ((Integer)this.i_1 > 0) {
            float var5 = 1.0F / (float)((Integer)this.i_1).intValue();
            var4 = new class06889(
               ((class06889)this.u_4).M + (((class06889)this.u_5).M - ((class06889)this.u_4).M) * (double)var5,
               ((class06889)this.u_4).B + (((class06889)this.u_5).B - ((class06889)this.u_4).B) * (double)var5,
               ((class06889)this.u_4).Z + (((class06889)this.u_5).Z - ((class06889)this.u_4).Z) * (double)var5
            );
            this.L_2 = (Float)this.L_2 + class04995.R((Float)this.i_0 - (Float)this.L_2) * var5;
            this.L_4 = (Float)this.L_4 + ((Float)this.u_6 - (Float)this.L_4) * var5;
            this.i_1 = (Integer)this.i_1 - 1;
         }

         this.L_0 = this.N(var4);
         this.y(var4);
         this.u_4 = var4;
      }
   }

   public void N(class09321 var1, int var2) {
      if ((Boolean)this.N_2) {
         float var3 = var1.u().N(true);
         this.N(var3);
         if ((List)this.u_2 != null) {
            class06889 var4 = var1.y().y();
            class06889 var5 = ((class06889)this.u_3).N((class06889)this.u_4, (double)var3);
            ((Matrix4f)this.u_0).translation((float)(var5.M - var4.M), (float)(var5.B - var4.B), (float)(var5.Z - var4.Z));
            class11925.N(((class06202)this.y_0).e(), true);

            for (class11904 var7 : (List)this.u_2) {
               if (!var7.i().isClosed() && var7.i().texture() instanceof class08893 var8) {
                  this.N(var7);
                  ((class11174)this.y_2).N(var4x -> {
                     ((class12038)this.y_3).N(var1.i());
                     ((class12038)this.y_4).N(var1.N());
                     ((class12026)this.y_5).N(var8.N());
                     GL33.glBindSampler(0, this.M());
                     ((class12026)this.y_6).N(33985, this.U());
                     GL33.glBindSampler(1, this.M());
                     ((class12043)this.y_7).N(var2);
                  });
               }
            }

            GL33.glBindSampler(0, 0);
            GL33.glBindSampler(1, 0);
         }
      }
   }

   private void N(class11904 var1) {
      class11184 var2 = ((class11213)this.y_1).M();
      class11178 var3 = ((class11213)this.y_1).N();
      float[] var4 = var1.M();
      float[] var5 = var1.u();
      int[] var6 = var1.L();
      float[] var7 = var1.N();

      for (int var8 = 0; var8 < var6.length; var8++) {
         var2.N((Matrix4f)this.u_0, var4[var8 * 3], var4[var8 * 3 + 1], var4[var8 * 3 + 2])
            .N(var5[var8 * 2], var5[var8 * 2 + 1])
            .y(var6[var8])
            .N(var7[var8 * 2], var7[var8 * 2 + 1])
            .y();
      }

      for (int var11 : var1.y()) {
         var3.N(var11);
      }
   }

   private void N(float var1) {
      if ((class07438)this.u_1 != null && !((class07438)this.u_1).method_31481()) {
         float var2 = ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_0;
         float var3 = ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_1;
         float var4 = ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_2;
         float var5 = ((class07438)this.u_1).fields_5212a028292fd3c078969e3ee4c71d9e8_0;
         float var6 = ((class07438)this.u_1).method_36454();
         float var7 = ((class07438)this.u_1).field_5982;
         float var8 = ((class07438)this.u_1).method_36455();
         float var9 = ((class07438)this.u_1).field_6004;
         class03269 var10 = ((class07438)this.u_1).fields_3212a028292fd3c078969e3ee4c71d9e8_3;
         float var11 = var10.y;
         float var12 = var10.N;
         float var13 = var10.L;
         ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = (Float)this.L_0;
         ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_1 = (Float)this.i_2;
         ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = (Float)this.L_2;
         ((class07438)this.u_1).fields_5212a028292fd3c078969e3ee4c71d9e8_0 = (Float)this.L_1;
         ((class07438)this.u_1).method_36456((Float)this.L_2);
         ((class07438)this.u_1).field_5982 = (Float)this.L_1;
         ((class07438)this.u_1).method_36457((Float)this.L_4);
         ((class07438)this.u_1).field_6004 = (Float)this.L_3;
         var10.y = (Float)this.N_0;
         var10.N = (Float)this.L_5;
         var10.L = (Float)this.N_1;

         try {
            class06889 var14 = new class06889(
               class04995.u((double)var1, ((class07438)this.u_1).field_6014, ((class07438)this.u_1).method_23317()),
               class04995.u((double)var1, ((class07438)this.u_1).field_6036, ((class07438)this.u_1).method_23318()),
               class04995.u((double)var1, ((class07438)this.u_1).field_5969, ((class07438)this.u_1).method_23321())
            );
            List<class11904> var15 = class11890.N((class07438)this.u_1, var14, var1);
            if (!var15.isEmpty()) {
               this.u_2 = var15;
            }
         } catch (Exception var19) {
         } finally {
            ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = var2;
            ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_1 = var3;
            ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = var4;
            ((class07438)this.u_1).fields_5212a028292fd3c078969e3ee4c71d9e8_0 = var5;
            ((class07438)this.u_1).method_36456(var6);
            ((class07438)this.u_1).field_5982 = var7;
            ((class07438)this.u_1).method_36457(var8);
            ((class07438)this.u_1).field_6004 = var9;
            var10.y = var11;
            var10.N = var12;
            var10.L = var13;
         }
      }
   }

   private float N(class06889 var1) {
      double var2 = var1.M - ((class06889)this.u_4).M;
      double var4 = var1.Z - ((class06889)this.u_4).Z;
      float var6 = (Float)this.L_0;
      float var7 = var6;
      if (var2 * var2 + var4 * var4 > 0.0025000002F) {
         var7 = (float)class04995.u(var4, var2) * (180.0F / (float)Math.PI) - 90.0F;
         float var8 = class04995.L(class04995.R((Float)this.L_2) - var7);
         if (95.0F < var8 && var8 < 265.0F) {
            var7 -= 180.0F;
         }
      }

      var6 += class04995.R(var7 - var6) * 0.3F;
      float var10 = class04995.R((Float)this.L_2 - var6);
      if (Math.abs(var10) > 50.0F) {
         var6 += var10 - (float)class04995.U((double)var10) * 50.0F;
      }

      return var6;
   }
}
