package Nursultan;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class08066;
import org.joml.Vector2i;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public class class11619 {
   private static String[] G;
   private static double[] I;
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2 = 1;
   public static Object L_3 = (Integer)L_2;
   public static Object L_4 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.u_0).N(4).N())
      .N(class11213.N((class09087)class09063.N_2, 6, 6))
      .N();
   public Object u_0;
   public boolean u_init;

   private void L() {
      long var2 = ((class06202)this.y_0).Nt().B();
      this.N_6 = GLFW.glfwGetInputMode(var2, 208897);
      GLFW.glfwSetInputMode(var2, 208897, 212994);
      this.N_7 = true;
   }

   public class11619(
      class11872 var1,
      class09785<class11619> var2,
      class09785<Boolean> var3,
      class09785<Float> var4,
      class09785<Float> var5,
      class09785<Float> var6,
      class09785<String> var7,
      class09785<String> var8
   ) {
      this.y();
      this.y_0 = class06202.Nq();
      this.y_1 = class09064.y((Integer)L_3, (Integer)L_3).y(class11181.RGB8).N(class11199.NEAREST, class11199.NEAREST).N(G[0]).N();
      this.N_6 = 212993;
      this.y_2 = var1;
      this.y_3 = var2;
      this.N_0 = var3;
      this.N_1 = var4;
      this.N_2 = var5;
      this.N_3 = var6;
      this.N_4 = var7;
      this.N_5 = var8;
      this.L();
   }

   static {
      z();
      i();
      Z();
      Math.ceil(I[0]);
   }

   private void B() {
      class08066 var1 = ((class06202)this.y_0).e();
      Vector2i var2 = class11307.N(((class06220)((class06202)this.y_0).L_2).i(), ((class06220)((class06202)this.y_0).L_2).R());
      int var3 = Math.clamp((long)var2.x(), 0, var1.N - 1);
      int var4 = Math.clamp((long)var2.y(), 0, var1.y - 1);
      int var5 = Math.clamp((long)(var3 - (Integer)L_2), 0, var1.N - (Integer)L_3);
      int var6 = Math.clamp((long)(var4 - (Integer)L_2), 0, var1.y - (Integer)L_3);
      int var7 = var1.y - var6 - (Integer)L_3;
      class11925.N(var1, (class09064)this.y_1, var5, var7, (Integer)L_3, (Integer)L_3, 0, 0, (Integer)L_3, (Integer)L_3);
      class11925.N(var1, false);
      float var8 = 144.0F;
      class11176.N(((class11174)L_4).u(), (float)var2.x() - 72.0F, (float)var2.y() - 72.0F, var8, var8, 0.0F, 0.0F, 1.0F, 1.0F, -1);
      ((class11174)L_4).N(var5x -> {
         var5x.z(G[1]).N(class11925.L());
         var5x.z(G[2]).N(RenderSystem.getModelViewMatrix());
         var5x.M(G[3]).N(((class09064)this.y_1).U());
         var5x.R(G[4]).N((float)((Integer)L_3).intValue(), (float)((Integer)L_3).intValue());
         var5x.R(G[5]).N((float)(var3 - var5), (float)(var4 - var6));
      });
   }

   private static void Z() {
      L_0 = 72.0F;
      L_1 = 12.0F;
      L_2 = 0;
      L_3 = 0;
   }

   private static void i() {
      G = new String[6];
      G[0] = "color_picker_pipette_preview";
      G[1] = "u_projection";
      G[2] = "u_view";
      G[3] = "texture_in";
      G[4] = "u_source_size";
      G[5] = "u_center_px";
   }

   private void m() {
      if ((Boolean)this.N_7) {
         GLFW.glfwSetInputMode(((class06202)this.y_0).Nt().B(), 208897, (Integer)this.N_6);
         this.N_7 = false;
      }
   }

   private static void z() {
      I = new double[1];
      I[0] = Double.longBitsToDouble(4618441417868443648L);
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_6 = 0;
         this.N_7 = false;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = false;
      }
   }

   @class11782(
      y = class11777.LISTENER
   )
   public void N(class10989 var1) {
      if ((Boolean)this.u_0) {
         this.u_0 = false;
         int var2 = class11300.N(this.R(), class11300.y(((class11872)this.y_2).y()));
         class11595.N((class11872)this.y_2, var2, (class09785<Float>)this.N_1, (class09785<Float>)this.N_2, (class09785<Float>)this.N_3);
         class11595.N((class11872)this.y_2, var2, (class09785<String>)this.N_4, (class09785<String>)this.N_5);
         this.N();
      } else {
         this.B();
      }
   }

   @class11782(
      y = class11777.BEFORE_ALL
   )
   public void N(class11389 var1) {
      if (var1.B()) {
         if (var1.Z().N(class11381.MOUSE) && var1.z() == 0) {
            var1.N();
            this.u_0 = true;
         } else {
            if (var1.Z().N(class11381.KEYBOARD) && var1.y(class12002.ESCAPE)) {
               var1.N();
               this.N();
            }
         }
      }
   }

   public void N() {
      class11938.L().N(this);
      ((class09785)this.y_3).N(null);
      ((class09785)this.N_0).N(false);
      this.u_0 = false;
      this.m();
   }

   private int R() {
      class08066 var1 = ((class06202)this.y_0).e();
      Vector2i var2 = class11307.N(((class06220)((class06202)this.y_0).L_2).i(), ((class06220)((class06202)this.y_0).L_2).R());
      int var3 = Math.clamp((long)var2.x(), 0, var1.N - 1);
      int var4 = Math.clamp((long)(var1.y - 1 - var2.y()), 0, var1.y - 1);
      ByteBuffer var5 = BufferUtils.createByteBuffer(3);
      class11925.N(var1, false);
      int var6 = GL11.glGetInteger(3333);
      GL11.glPixelStorei(3333, 1);
      GL11.glReadPixels(var3, var4, 1, 1, 6407, 5121, var5);
      GL11.glPixelStorei(3333, var6);
      int var7 = var5.get(0) & 255;
      int var8 = var5.get(1) & 255;
      int var9 = var5.get(2) & 255;
      return class11300.y(var7, var8, var9, 255);
   }
}
