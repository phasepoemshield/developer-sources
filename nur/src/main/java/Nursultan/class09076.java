package Nursultan;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;

public class class09076 implements AutoCloseable {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   public void L(int var1) {
      class09083 var2 = ((class09083[])this.N_2)[var1];
      if (var2 != null) {
         ((class09083[])this.N_2)[var1] = null;
         class09083 var3 = ((class09064[])this.N_1)[var1].y(var2);
         if (var3 != null) {
            ((class09083[])this.N_3)[(Integer)this.N_5] = var3;
            ((int[])this.N_4)[(Integer)this.N_5] = var1;
            this.N_5 = (Integer)this.N_5 + 1;
         }
      }
   }

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = 0;
      }
   }

   class09076(class09065 var1) {
      this.L();
      this.N_0 = var1;
   }

   public class09057 i(int var1) {
      this.N(var1);
      return ((class09064[])this.N_1)[var1].N(((class09083[])this.N_2)[var1]);
   }

   @Override
   public void close() {
      class09064[] var1 = (class09064[])this.N_1;
      class09083[] var2 = (class09083[])this.N_2;

      for (int var3 = 0; var3 < var1.length; var3++) {
         class09083 var4 = var2[var3];
         if (var4 != null) {
            var1[var3].B(var4);
            var2[var3] = null;
         }
      }

      for (int var5 = 0; var5 < (Integer)this.N_5; var5++) {
         var1[((int[])this.N_4)[var5]].R(((class09083[])this.N_3)[var5]);
         ((class09083[])this.N_3)[var5] = null;
      }

      this.N_5 = 0;
      this.N_1 = null;
   }

   public class09057 u(int var1) {
      this.N(var1);
      return ((class09064[])this.N_1)[var1].u(((class09083[])this.N_2)[var1]);
   }

   public class09086 y(int var1) {
      this.N(var1);
      return ((class09064[])this.N_1)[var1].M(((class09083[])this.N_2)[var1]);
   }

   public class09076 N(class09064[] var1) {
      this.N_1 = var1;
      int var2 = var1.length;
      if ((class09083[])this.N_2 == null || ((class09083[])this.N_2).length < var2) {
         this.N_2 = new class09083[var2];
         this.N_3 = new class09083[var2];
         this.N_4 = new int[var2];
      }

      this.N_5 = 0;
      return this;
   }

   public void N(int var1) {
      if (((class09083[])this.N_2)[var1] == null) {
         class09064 var2 = ((class09064[])this.N_1)[var1];
         ((class09065)this.N_0).R(var2);
         class09083 var3 = this.N(var2, var1);
         class09083 var4 = var3 == null ? ((class09065)this.N_0).y(var2) : var2.L(var3);
         ((ObjectOpenHashSet)((class09065)this.N_0).N_0).add(var2);
         ((class09083[])this.N_2)[var1] = var4;
      }
   }

   private class09083 N(class09064 var1, int var2) {
      for (int var3 = 0; var3 < (Integer)this.N_5; var3++) {
         if (((int[])this.N_4)[var3] == var2) {
            class09083 var4 = ((class09083[])this.N_3)[var3];
            if (var1.i(var4)) {
               int var10002 = (Integer)this.N_5 - 1;
               this.N_5 = var10002;
               int var5 = var10002;
               ((class09083[])this.N_3)[var3] = ((class09083[])this.N_3)[var5];
               ((int[])this.N_4)[var3] = ((int[])this.N_4)[var5];
               ((class09083[])this.N_3)[var5] = null;
               return var4;
            }
         }
      }

      return null;
   }
}
