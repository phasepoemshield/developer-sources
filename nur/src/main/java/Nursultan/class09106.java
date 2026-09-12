package Nursultan;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05194;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;

public class class09106 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5 = class09079.values();
   public static Object y_6 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.W_0).N(4).N())
      .N(class11213.N((class09087)class09063.N_6, 65536))
      .N(6)
      .N();
   public static Object y_7 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N())
      .N(class11213.N((class09087)class09063.N_2, 4096, 1024))
      .N();

   private void L() {
      this.N_5 = 0;
      ((ByteBuffer)this.N_3).position(0);
   }

   public class09106() {
      this.u();
      this.N_0 = new class09090();
      this.N_1 = new class09059(this);
      this.N_2 = new class09075(this);
      this.N_3 = MemoryUtil.memAlloc(512 * (Integer)class09077.y_1);
      this.N_4 = new Object[512];
      this.N_6 = -1;
      this.N_7 = -1;
   }

   static {
      y();
      N();
   }

   private void B(int var1) {
      if (((Object[])this.N_4).length < var1) {
         int var2 = ((Object[])this.N_4).length;

         while (var2 < var1) {
            var2 *= 2;
         }

         this.N_4 = Arrays.copyOf((Object[])this.N_4, var2);
      }

      int var4 = var1 * (Integer)class09077.y_1;
      if (((ByteBuffer)this.N_3).capacity() < var4) {
         int var3 = ((ByteBuffer)this.N_3).capacity();

         while (var3 < var4) {
            var3 *= 2;
         }

         this.N_3 = MemoryUtil.memRealloc((ByteBuffer)this.N_3, var3);
      }
   }

   void U() {
      if ((Integer)this.N_7 != -1) {
         ((class11174)y_7).N(var1 -> {
            var1.z("u_projection").N(class11925.L());
            var1.z("u_view").N(RenderSystem.getModelViewMatrix());
            var1.M("texture_in").N((Integer)this.N_7);
         });
      }
   }

   private void z() {
      ((class11174)y_6).y(var1 -> {
         var1.z("u_projection").N(class11925.L());
         var1.M("texture_in").N((Integer)this.N_6);
      });
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = 0;
         this.N_6 = 0;
         this.N_7 = 0;
      }
   }

   private static void y() {
   }

   private class09079 y(int var1) {
      int var2 = var1 >>> 8 & 0xFF;
      return var2 >= ((class09079[])y_5).length ? class09079.REGULAR : ((class09079[])y_5)[var2];
   }

   private int N(class09079 var1, boolean var2, boolean var3) {
      int var4 = (var1.ordinal() & 0xFF) << 8;
      if (var2) {
         var4 |= 1;
      }

      if (var3) {
         var4 |= 2;
      }

      return var4;
   }

   public void N(String var1, float var2, float var3, byte var4, class09079 var5, boolean var6, int var7, int var8, int var9, byte var10) {
      this.N(var1, var2, var3, var4, var7, var8, this.N(var5, var6, var9 != 0), var9, var10);
   }

   public void N(class09093 var1) {
      if ((Integer)this.N_5 != 0) {
         this.N_6 = -1;
         this.N_7 = -1;

         for (int var2 = 0; var2 < (Integer)this.N_5; var2++) {
            Object var3 = ((Object[])this.N_4)[var2];
            if (var3 != null) {
               int var4 = var2 * (Integer)class09077.y_1;
               int var5 = ((ByteBuffer)this.N_3).getInt(var4 + (Integer)class09077.N_4);
               if ((var5 & 2) != 0) {
                  float var6 = ((ByteBuffer)this.N_3).getFloat(var4 + (Integer)class09077.N_1);
                  float var7 = ((ByteBuffer)this.N_3).getFloat(var4 + (Integer)class09077.N_2);
                  int var8 = ((ByteBuffer)this.N_3).getInt(var4 + (Integer)class09077.N_5);
                  byte var9 = ((ByteBuffer)this.N_3).get(var4 + (Integer)class09077.N_7);
                  byte var10 = ((ByteBuffer)this.N_3).get(var4 + (Integer)class09077.y_0);
                  class09071 var11 = var1.y(this.y(var5));
                  int var12 = var11.R();
                  if (var12 != (Integer)this.N_6) {
                     this.z();
                     this.N_6 = var12;
                  }

                  ((class09075)this.N_2).N(var11, (float)var9, var7, var8, (float)var10);
                  this.N(var11, (float)var9, var3, var6, var7, (class09075)this.N_2);
               }
            }
         }

         this.z();

         for (int var15 = 0; var15 < (Integer)this.N_5; var15++) {
            Object var16 = ((Object[])this.N_4)[var15];
            ((Object[])this.N_4)[var15] = null;
            if (var16 != null) {
               int var17 = var15 * (Integer)class09077.y_1;
               float var18 = ((ByteBuffer)this.N_3).getFloat(var17 + (Integer)class09077.N_1);
               float var19 = ((ByteBuffer)this.N_3).getFloat(var17 + (Integer)class09077.N_2);
               int var20 = ((ByteBuffer)this.N_3).getInt(var17 + (Integer)class09077.N_3);
               int var21 = ((ByteBuffer)this.N_3).getInt(var17 + (Integer)class09077.N_6);
               int var22 = ((ByteBuffer)this.N_3).getInt(var17 + (Integer)class09077.N_4);
               byte var23 = ((ByteBuffer)this.N_3).get(var17 + (Integer)class09077.N_7);
               class09071 var24 = var1.y(this.y(var22));
               int var25 = var24.R();
               if (var25 != (Integer)this.N_6) {
                  this.z();
                  this.N_6 = var25;
               }

               float var13 = var24.L() / (float)Math.max(1, var24.u());
               float var14 = var24.L() / (float)Math.max(1, var24.M());
               ((class09059)this.N_1).N(var20, var21, var13, var14);
               this.N(var24, (float)var23, var16, var18, var19, (class09059)this.N_1);
            }
         }

         this.L();
         this.z();
         this.U();
      }
   }

   static int N(class00405 var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         class05194 var2 = var0.N();
         return var2 == null ? var1 : var1 & 0xFF000000 | var2.N() & 16777215;
      }
   }

   private void N(Object var1, float var2, float var3, byte var4, int var5, int var6, int var7, int var8, byte var9) {
      int var10 = (Integer)this.N_5 + 1;
      this.B(var10);
      int var11 = (Integer)this.N_5 * (Integer)class09077.y_1;
      ((ByteBuffer)this.N_3).putFloat(var11 + (Integer)class09077.N_1, var2);
      ((ByteBuffer)this.N_3).putFloat(var11 + (Integer)class09077.N_2, var3);
      ((ByteBuffer)this.N_3).putInt(var11 + (Integer)class09077.N_3, var5);
      ((ByteBuffer)this.N_3).putInt(var11 + (Integer)class09077.N_6, var6);
      ((ByteBuffer)this.N_3).putInt(var11 + (Integer)class09077.N_4, var7);
      ((ByteBuffer)this.N_3).putInt(var11 + (Integer)class09077.N_5, var8);
      ((ByteBuffer)this.N_3).put(var11 + (Integer)class09077.N_7, var4);
      ((ByteBuffer)this.N_3).put(var11 + (Integer)class09077.y_0, var9);
      ((ByteBuffer)this.N_3).position(var10 * (Integer)class09077.y_1);
      ((Object[])this.N_4)[(Integer)this.N_5] = var1;
      this.N_5 = var10;
   }

   void N(float var1, float var2, float var3, float var4, int var5) {
      ((class11174)y_6).R().N(var1).N(var2).N(var3).N(var4).N(0.0F).N(0.0F).N(0.0F).N(0.0F).y(var5).N(0.0F).N(0.0F).y(0).y();
   }

   private void N(class09071 var1, float var2, Object var3, float var4, float var5, class09102 var6) {
      Objects.requireNonNull(var3);
      switch (var3) {
         case String var9:
            ((class09090)this.N_0).N(var1, var2, 1.0F, var9, var4, var5, var6);
            break;
         case class01028 var10:
            ((class09090)this.N_0).N(var1, var2, 1.0F, var10, var4, var5, var6);
            break;
         default:
            ((Logger)y_0).warn("Unknown payload type: {}", var3.getClass().getSimpleName());
      }
   }

   private static void N() {
      y_0 = null;
      y_1 = 512;
      y_2 = 1;
      y_3 = 2;
      y_4 = 8;
      y_5 = null;
      y_6 = null;
      y_7 = null;
   }

   public void N(class01028 var1, float var2, float var3, byte var4, class09079 var5, boolean var6, int var7, int var8, int var9, byte var10) {
      this.N(var1, var2, var3, var4, var7, var8, this.N(var5, var6, var9 != 0), var9, var10);
   }

   void N(class09719 var1, int var2, int var3, float var4, float var5) {
      float var6 = ((class09090)this.N_0).y() + (((class09090)this.N_0).R() - ((class09090)this.N_0).N());
      float var7 = ((class09090)this.N_0).u();
      float var8 = var6 + var1.N;
      float var9 = var6 + var1.L;
      float var10 = var7 - var1.u;
      float var11 = var7 - var1.y;
      float var12 = var1.i;
      float var13 = var1.B;
      float var14 = var1.M;
      float var15 = var1.R;
      ((class11174)y_6).R().N(var8).N(var10).N(var9).N(var11).N(var12).N(var13).N(var14).N(var15).y(var2).N(var4).N(var5).y(var3).y();
   }
}
