package Nursultan;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import minecraft.class01054;
import minecraft.class02484;
import minecraft.class02689;
import minecraft.class03386;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class08066;
import org.joml.Matrix3x2fStack;
import org.lwjgl.opengl.GL11;

public class class11836 {
   public static Object N_0 = class06202.Nq();
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public boolean u_init;

   private void L(int var1) {
      if (!((boolean[])this.u_4)[var1]) {
         ((boolean[])this.u_4)[var1] = true;
         ((IntArrayList)this.u_3).add(var1);
      }
   }

   private void L(class01054 var1) {
      class12027.N();
      ((class03386)((class06202)N_0).i_5).M.N((GpuBufferSlice)class11925.L_0);
      if (!(Boolean)this.L_1) {
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((class08066)this.y_5).L(), 0, ((class08066)this.y_5).i(), 1.0);
         this.m();
         this.L_1 = true;
      }

      class09078.N((class08066)this.y_5);
      class11925.y((float)((Integer)this.y_2).intValue(), (float)((Integer)this.y_2).intValue());
      class09081.N(RenderSystem.getProjectionMatrixBuffer());

      try {
         class11925.N((class08066)this.y_5, true);
         this.Z();
         this.y(var1);
         ((class03386)((class06202)N_0).i_5).M.N((GpuBufferSlice)class11925.L_0);
      } finally {
         class09081.N();
         class09078.L();
         class11925.N(((class06202)N_0).e(), true);
         class11925.N();
      }

      for (int var2 = 0; var2 < ((IntArrayList)this.u_3).size(); var2++) {
         ((boolean[])this.u_4)[((IntArrayList)this.u_3).getInt(var2)] = false;
      }

      ((IntArrayList)this.u_3).clear();
      class12027.y();
   }

   public int L() {
      return (Integer)this.y_0;
   }

   public class11836() {
      this(32, 32);
   }

   public class11836(int var1, int var2) {
      this.R();
      this.y_6 = new Int2IntOpenHashMap();
      this.u_3 = new IntArrayList(64);
      this.L_2 = -1;
      this.L_3 = "glidfy:0";
      this.y_0 = var1;
      this.y_1 = var2;
      this.y_2 = var2 * var1;
      this.y_3 = 1.0F / (float)var2;
      this.y_4 = var2 * var2;
      this.y_5 = new class10203(null, (Integer)this.y_2, (Integer)this.y_2, true);
      this.u_0 = new int[(Integer)this.y_4];
      this.u_1 = new int[(Integer)this.y_4];
      this.u_2 = new class06584[(Integer)this.y_4];
      this.u_4 = new boolean[(Integer)this.y_4];
      ((Int2IntOpenHashMap)this.y_6).defaultReturnValue(-1);
   }

   static {
      u();
   }

   private class11867 B(int var1) {
      int var2 = var1 % (Integer)this.y_1;
      int var3 = var1 / (Integer)this.y_1;
      float var4 = (float)var2 * (Float)this.y_3;
      float var5 = (float)var3 * (Float)this.y_3;
      float var6 = var4 + (Float)this.y_3;
      float var7 = var5 + (Float)this.y_3;
      return new class11867(var1, var4, var5, var6, var7);
   }

   private void Z() {
      GL11.glColorMask(true, true, true, true);
      GL11.glDepthMask(true);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glEnable(3089);

      for (int var1 = 0; var1 < ((IntArrayList)this.u_3).size(); var1++) {
         int var2 = ((IntArrayList)this.u_3).getInt(var1);
         int var3 = var2 % (Integer)this.y_1;
         int var4 = var2 / (Integer)this.y_1;
         int var5 = var3 * (Integer)this.y_0;
         int var6 = var4 * (Integer)this.y_0;
         int var7 = (Integer)this.y_2 - var6 - (Integer)this.y_0;
         GL11.glScissor(var5, var7, (Integer)this.y_0, (Integer)this.y_0);
         GL11.glClear(16384);
      }

      GL11.glDisable(3089);
   }

   private void m() {
      GlStateManager._activeTexture(33984);
      GlStateManager._bindTexture(class11925.N((class08066)this.y_5));
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
   }

   private int z() {
      int var1 = -1;
      int var2 = Integer.MAX_VALUE;

      for (int var3 = 0; var3 < (Integer)this.y_4; var3++) {
         if (((int[])this.u_1)[var3] < var2) {
            var2 = ((int[])this.u_1)[var3];
            var1 = var3;
            if (var2 == 0) {
               break;
            }
         }
      }

      return var1;
   }

   private static void u() {
      N_0 = null;
      N_1 = 32;
      N_2 = 32;
      N_3 = 16;
   }

   private void y(Property var1) {
      for (int var2 = 0; var2 < (Integer)this.y_4; var2++) {
         class06584 var3 = ((class06584[])this.u_2)[var2];
         if (var3 != null && !var3.R()) {
            class02689 var4 = (class02689)var3.method_58694(class02484.Nb);
            if (var4 != null) {
               GameProfile var5 = var4.y();
               if (var5 != null && var5.properties().get("textures").contains(var1)) {
                  this.L(var2);
               }
            }
         }
      }
   }

   private void y(class01054 var1) {
      class12027.N();
      Matrix3x2fStack var2 = var1.i();
      float var3 = (float)((Integer)this.y_0).intValue() / 16.0F;

      for (int var4 = 0; var4 < ((IntArrayList)this.u_3).size(); var4++) {
         int var5 = ((IntArrayList)this.u_3).getInt(var4);
         class06584 var6 = ((class06584[])this.u_2)[var5];
         if (var6 != null && !var6.R()) {
            int var7 = var5 % (Integer)this.y_1;
            int var8 = var5 / (Integer)this.y_1;
            float var9 = (float)(var7 * (Integer)this.y_0);
            float var10 = (float)(var8 * (Integer)this.y_0);
            var2.pushMatrix();
            var2.translate(var9, var10);
            var2.scale(var3);
            var1.N(var6, 0, 0);
            var2.popMatrix();
         }
      }
   }

   public String y() {
      int var1 = class11925.N((class08066)this.y_5);
      if (var1 != (Integer)this.L_2) {
         this.L_2 = var1;
         this.L_3 = "glidfy:" + var1;
      }

      return (String)this.L_3;
   }

   @class11782
   public void N(class11392 var1) {
      Property var2 = var1.N();
      if (var2 != null) {
         ((class06202)N_0).execute(() -> this.y(var2));
      }
   }

   @class11782
   public void N(class09343 var1) {
      ((Int2IntOpenHashMap)this.y_6).clear();

      for (int var2 = 0; var2 < (Integer)this.y_4; var2++) {
         ((int[])this.u_0)[var2] = 0;
         ((int[])this.u_1)[var2] = 0;
         ((class06584[])this.u_2)[var2] = null;
         ((boolean[])this.u_4)[var2] = false;
      }

      ((IntArrayList)this.u_3).clear();
      this.u_5 = 0;
      this.L_1 = false;
      this.L_2 = -1;
   }

   public void N(class06584 var1, float var2, float var3, float var4) {
      class11867 var5 = this.N(var1);
      if (var5.L()) {
         class11176.N(
            ((class11174)class11190.y_1).u(),
            (float)class04995.y(var2),
            (float)class04995.y(var3),
            var4,
            var4,
            var5.y(),
            1.0F - var5.N(),
            var5.R(),
            1.0F - var5.i(),
            -1
         );
      }
   }

   private int N(int var1, class06584 var2) {
      int var3;
      if ((Integer)this.u_5 < (Integer)this.y_4) {
         int var10002 = (Integer)this.u_5;
         this.u_5 = var10002 + 1;
         var3 = var10002;
      } else {
         var3 = this.z();
         if (var3 < 0) {
            return -1;
         }

         ((Int2IntOpenHashMap)this.y_6).remove(((int[])this.u_0)[var3]);
      }

      ((Int2IntOpenHashMap)this.y_6).put(var1, var3);
      ((int[])this.u_0)[var3] = var1;
      ((class06584[])this.u_2)[var3] = var2;
      this.L(var3);
      return var3;
   }

   public void N(class01054 var1) {
      this.L_0 = (Integer)this.L_0 + 1;
      if (!((IntArrayList)this.u_3).isEmpty() || !(Boolean)this.L_1) {
         this.L(var1);
      }
   }

   public int N() {
      return class11925.N((class08066)this.y_5);
   }

   public class11867 N(class06584 var1) {
      if (var1 != null && !var1.R()) {
         int var2 = class11929.R(var1);
         int var3 = ((Int2IntOpenHashMap)this.y_6).get(var2);
         if (var3 < 0) {
            var3 = this.N(var2, var1);
            if (var3 < 0) {
               return (class11867)class11867.y_0;
            }
         } else {
            ((class06584[])this.u_2)[var3] = var1;
         }

         ((int[])this.u_1)[var3] = (Integer)this.L_0;
         return this.B(var3);
      } else {
         return (class11867)class11867.y_0;
      }
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
         this.y_1 = 0;
         this.y_2 = 0;
         this.y_3 = 0.0F;
         this.y_4 = 0;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_5 = 0;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = false;
         this.L_2 = 0;
      }
   }
}
