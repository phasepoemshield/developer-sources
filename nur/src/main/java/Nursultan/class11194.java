package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.lwjgl.opengl.GL11;

public class class11194<C> implements class11171<C> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;

   class11194(class11192<C> var1) {
      this.i();
      this.N_1 = new ArrayList();
      this.N_2 = new ArrayList();
      this.N_3 = new ArrayList();
      this.N_6 = (int[])class11218.N_0;
      this.N_0 = Objects.requireNonNull(var1, "pass");
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = false;
      }
   }

   void y(class11173<C> var1) {
      ((ArrayList)this.N_1).add(Objects.requireNonNull(var1, "setup"));
   }

   void y(boolean var1) {
      this.N_5 = var1;
   }

   @Override
   public int[] y() {
      return (int[])this.N_6;
   }

   private static void N(boolean var0) {
      GL11.glColorMask(true, true, true, true);
      GL11.glClear(16384 | (var0 ? 256 : 0));
   }

   void N(class11212 var1) {
      this.N_4 = Objects.requireNonNull(var1, "target");
   }

   @Override
   public void N(class11202 var1) {
      ((class11212)this.N_4).N(var1);
      int var2 = 0;

      for (class11211 var4 : (ArrayList)this.N_3) {
         var4.N(var1);
         if (var4.a_() >= 0) {
            var2++;
         }
      }

      if (var2 == 0) {
         this.N_6 = (int[])class11218.N_0;
      } else {
         int[] var8 = new int[var2];
         int var9 = 0;
         Iterator var5 = ((ArrayList)this.N_3).iterator();

         while (var5.hasNext()) {
            int var7 = ((class11211)var5.next()).a_();
            if (var7 >= 0) {
               var8[var9++] = var7;
            }
         }

         this.N_6 = var8;
      }
   }

   void N(class11173<C> var1) {
      ((ArrayList)this.N_2).add(Objects.requireNonNull(var1, "beforePass"));
   }

   @Override
   public void N() {
      if ((class11212)this.N_4 == null) {
         throw new IllegalStateException("Pass step has no target: " + ((class11192)this.N_0).getClass().getName());
      } else {
         class09064 var1 = ((class11212)this.N_4).N();

         for (int var2 = 0; var2 < ((ArrayList)this.N_3).size(); var2++) {
            class11211 var3 = (class11211)((ArrayList)this.N_3).get(var2);
            if (var1 != null && var1 == var3.L()) {
               throw new IllegalStateException("Pass reads and writes the same framebuffer: " + var1.d());
            }

            for (int var4 = var2 + 1; var4 < ((ArrayList)this.N_3).size(); var4++) {
               if (var3.y() == ((class11211)((ArrayList)this.N_3).get(var4)).y()) {
                  throw new IllegalStateException("Texture unit is bound twice in one pass: " + var3.y());
               }
            }
         }
      }
   }

   void N(class11211 var1) {
      ((ArrayList)this.N_3).add(Objects.requireNonNull(var1, "input"));
   }

   @Override
   public void N(C var1, class09076 var2, class09065 var3) {
      for (int var4 = 0; var4 < ((ArrayList)this.N_1).size(); var4++) {
         ((class11173)((ArrayList)this.N_1).get(var4)).execute(var1);
      }

      ((class11212)this.N_4).N(var2, var3);
      if ((Boolean)this.N_5) {
         N(((class11212)this.N_4).N(var2));
      }

      for (class11173 var5 : (ArrayList)this.N_2) {
         var5.execute(var1);
      }

      for (class11211 var8 : (ArrayList)this.N_3) {
         var8.N(var2);
      }

      ((class11192)this.N_0).execute(var1);
   }
}
