package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class09071 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public Object y_7;
   public boolean y_init;
   public static Object L_0 = LogManager.getLogger(String.class);
   public static Object L_1;

   public float L() {
      return (Float)this.y_0;
   }

   public int M() {
      return ((class09742)this.N_0).i();
   }

   public class09071(class09742 var1, int var2, float var3, Path var4) {
      this.m();
      this.y_5 = System.currentTimeMillis();
      this.N_0 = var1;
      this.N_1 = var2;
      this.y_0 = var3;
      this.y_1 = var4;
   }

   static {
      j();
   }

   private void B() {
      if (!(Boolean)this.y_7 && (Path)this.y_1 != null && (Boolean)this.y_6) {
         if (System.currentTimeMillis() - (Long)this.y_5 >= 2000L) {
            this.y_7 = true;

            try {
               ((class09742)this.N_0).N((Path)this.y_1);
            } catch (Exception var2) {
               ((Logger)L_0).warn("Font atlas cache save failed ({}): {}", (Path)this.y_1, var2.toString());
            }
         }
      }
   }

   public void i() {
      ((class09742)this.N_0).close();
   }

   private void m() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0.0F;
         this.y_2 = 0;
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_5 = 0L;
         this.y_6 = false;
         this.y_7 = false;
      }
   }

   private static void j() {
      L_0 = null;
      L_1 = 2000L;
   }

   public int u() {
      return ((class09742)this.N_0).u();
   }

   public boolean y(int var1) {
      return ((class09742)this.N_0).L(var1);
   }

   public int y() {
      return (Integer)this.N_1;
   }

   public float y(float var1) {
      return (float)(((class09742)this.N_0).z().N() * (double)var1);
   }

   private void E() {
      this.y_2 = GL11.glGenTextures();
      int var1 = GL11.glGetInteger(32873);
      GlStateManager._bindTexture((Integer)this.y_2);
      GlStateManager._texParameter(3553, 10240, 9729);
      GlStateManager._texParameter(3553, 10241, 9729);
      GlStateManager._texParameter(3553, 10242, 33071);
      GlStateManager._texParameter(3553, 10243, 33071);
      GlStateManager._bindTexture(var1);
   }

   public boolean N(int var1, float var2, class09719 var3) {
      return ((class09742)this.N_0).N(var1, var2, var3);
   }

   public float N(int var1, float var2) {
      return (float)(((class09742)this.N_0).y(var1) * (double)var2);
   }

   public void N(int var1) {
      ((class09742)this.N_0).N(var1);
   }

   public float N(float var1) {
      class09718 var2 = ((class09742)this.N_0).z();
      double var3 = var2.L();
      if (var3 <= 0.0) {
         var3 = var2.N() - var2.y();
      }

      return (float)(var3 * (double)var1);
   }

   public float N(int var1, int var2, float var3) {
      return (float)(((class09742)this.N_0).N(var1, var2) * (double)var3);
   }

   public void N() {
      class09731 var1 = ((class09742)this.N_0).N();
      if (!var1.N() && (Integer)this.y_2 != 0) {
         this.B();
      } else {
         if ((Integer)this.y_2 == 0) {
            this.E();
         }

         int var2 = ((class09742)this.N_0).u();
         int var3 = ((class09742)this.N_0).i();
         ByteBuffer var4 = ((class09742)this.N_0).L();
         int var5 = GL11.glGetInteger(32873);
         GlStateManager._bindTexture((Integer)this.y_2);
         GL11.glPixelStorei(3317, 4);
         if (var1.y() || (Integer)this.y_3 != var2 || (Integer)this.y_4 != var3) {
            GL11.glPixelStorei(3314, 0);
            GL11.glPixelStorei(3316, 0);
            GL11.glPixelStorei(3315, 0);
            GL11.glTexImage2D(3553, 0, 32856, var2, var3, 0, 6408, 5121, var4);
            this.y_3 = var2;
            this.y_4 = var3;
         } else {
            GL11.glPixelStorei(3314, var2);

            for (int var7 = 0; var7 < var1.M(); var7++) {
               int var8 = var1.N(var7);
               int var9 = var1.y(var7);
               GL11.glPixelStorei(3316, var8);
               GL11.glPixelStorei(3315, var9);
               GL11.glTexSubImage2D(3553, 0, var8, var9, var1.L(var7), var1.u(var7), 6408, 5121, var4);
            }

            GL11.glPixelStorei(3314, 0);
            GL11.glPixelStorei(3316, 0);
            GL11.glPixelStorei(3315, 0);
         }

         GlStateManager._bindTexture(var5);
         this.y_6 = true;
         this.y_5 = System.currentTimeMillis();
      }
   }

   public int R() {
      this.N();
      return (Integer)this.y_2;
   }
}
