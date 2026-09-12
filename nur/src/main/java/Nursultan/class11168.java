package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class06202;
import minecraft.class06889;
import org.joml.Matrix4f;
import org.joml.Vector3d;
import org.lwjgl.opengl.GL30;

public class class11168 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public static Object i_0 = new class09087(class09069.N(3).R(), class09069.N(1).R(), class09069.N(1).R(), class09069.y().R());
   public static Object i_1;
   public static Object i_2 = class06202.Nq();

   private void M() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_5 = 0.0F;
         this.L_6 = 0.0F;
         this.L_7 = false;
      }
   }

   public class11168(int var1, float var2, float var3) {
      this(var1, var2, var3, (class12036)class12019.N_0);
   }

   public class11168(int var1, float var2, float var3, class12036 var4) {
      this.M();
      this.u_0 = new ArrayList();
      this.u_1 = (class09065)class09065.y_0;
      this.y_0 = class09097.L(48, 48).N(() -> true);
      this.y_1 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.y_3 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.i_5).N(4).N()).N((class11213)this.y_1).N();
      this.N_1 = ((class09322)class11185.i_5).z("u_projection");
      this.N_2 = ((class09322)class11185.i_5).z("u_view");
      this.L_0 = ((class09322)class11185.i_5).i("radius");
      this.L_1 = ((class09322)class11185.i_5).i("pinch");
      this.L_2 = ((class09322)class11185.E_6).z("u_projection");
      this.L_3 = ((class09322)class11185.E_6).z("u_view");
      this.L_4 = ((class09322)class11185.E_6).M("texture_in");
      this.L_7 = true;
      this.L_5 = var2;
      this.L_6 = var3;
      this.y_2 = class11213.N((class09087)i_0, var1);
      this.N_0 = class11174.N()
         .N(class11204.L().N(var4.L().N((class12030)class12030.N_0).N((class12014)class12014.y_1).N()).N((class09322)class11185.E_6).N(4).N())
         .N((class11213)this.y_2)
         .N(6)
         .N();
   }

   static {
      u();
   }

   private static void u() {
      i_0 = null;
      i_1 = 5.0F;
      i_2 = null;
   }

   public void N(class11179 var1) {
      ((List)this.u_0).add(var1);
   }

   public void N(float var1, float var2) {
      this.L_5 = var1;
      this.L_6 = var2;
      this.L_7 = true;
   }

   public void N() {
      if (!((List)this.u_0).isEmpty()) {
         Iterator var1 = ((List)this.u_0).iterator();

         while (var1.hasNext()) {
            class11179 var2 = (class11179)var1.next();
            var2.E();
            if (var2.U()) {
               var1.remove();
            }
         }
      }
   }

   public void N(class09321 var1) {
      this.R();
      if (!((List)this.u_0).isEmpty()) {
         class06889 var2 = var1.y().y();
         float var3 = var1.u().N(true);
         class11184 var4 = ((class11213)this.y_2).M();

         for (class11179 var6 : (List)this.u_0) {
            Vector3d var7 = var6.B().lerp(var6.W(), (double)var3, new Vector3d());
            int var8 = var6.u() - var6.i();
            float var9 = Math.min(1.0F, (float)var8 / 5.0F);
            if (var6.L() > 0) {
               var9 = Math.min(var9, Math.min(1.0F, ((float)var6.i() + var3) / (float)var6.L()));
            }

            int var10 = class11300.N(var6.R(), (int)(255.0F * var9));
            float var11 = 0.08F * var6.N();
            float var12 = var6.m() + (var6.y() - var6.m()) * var3;
            var4.N((float)(var7.x - var2.M), (float)(var7.y - var2.B), (float)(var7.z - var2.Z)).N(var11).N(var12).y(var10).y();
         }

         ((class09065)this.u_1).N(((class06202)i_2).e(), true);
         ((class11174)this.N_0).y(var2x -> {
            ((class12038)this.L_2).N(var1.i());
            ((class12038)this.L_3).N(var1.N());
            ((class12026)this.L_4).N(((class09064)this.y_0).U());
         });
      }
   }

   private void R() {
      if (!((class09064)this.y_0).L()) {
         this.L_7 = true;
      }

      if ((Boolean)this.L_7) {
         ((class09065)this.u_1).u((class09064)this.y_0);
         Matrix4f var1 = (Matrix4f)class11925.y_3;
         Matrix4f var2 = new Matrix4f().setOrtho(0.0F, (float)((class09064)this.y_0).G(), (float)((class09064)this.y_0).u(), 0.0F, -1000.0F, 1000.0F);
         class11176.y((class11213)this.y_1, 0.0F, 0.0F, 0.0F, (float)((class09064)this.y_0).G(), (float)((class09064)this.y_0).u(), -1);
         ((class11174)this.y_3).N(var3 -> {
            ((class12038)this.N_1).N(var2);
            ((class12038)this.N_2).N(var1);
            ((class11200)this.L_0).N((Float)this.L_5);
            ((class11200)this.L_1).N((Float)this.L_6);
         });
         class09060.N().N(0, ((class09064)this.y_0).U());
         GL30.glGenerateMipmap(3553);
         ((class09065)this.u_1).N(((class06202)i_2).e(), true);
         this.L_7 = false;
      }
   }
}
