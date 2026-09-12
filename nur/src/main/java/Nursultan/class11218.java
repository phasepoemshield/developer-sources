package Nursultan;

import java.util.Arrays;
import java.util.List;

public class class11218<C> implements class11192<C> {
   public static Object N_0;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;

   class11218(List<class11171<C>> var1, class09065 var2) {
      this.y();
      this.y_0 = var1;
      this.y_1 = var2;
      class11202 var3 = new class11202();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         ((class11171)var1.get(var4)).N(var3);
      }

      this.y_2 = var3.u();
      this.y_3 = N(var1, ((class09064[])this.y_2).length);
      this.y_4 = var2.N();
   }

   static {
      i();
   }

   private static void i() {
      N_0 = new int[0];
   }

   @Override
   public void execute(C var1) {
      try (class09076 var2 = ((class09076)this.y_4).N((class09064[])this.y_2)) {
         List var3 = (List)this.y_0;
         int[][] var4 = (int[][])this.y_3;
         class09064[] var5 = (class09064[])this.y_2;

         for (int var6 = 0; var6 < var3.size(); var6++) {
            ((class11171)var3.get(var6)).N(var1, var2, (class09065)this.y_1);

            for (int var11 : var4[var6]) {
               if (!var5[var11].Z()) {
                  var2.L(var11);
               }
            }
         }
      }
   }

   private void y() {
   }

   private static <C> int[][] N(List<class11171<C>> var0, int var1) {
      int[] var2 = new int[var1];
      Arrays.fill(var2, -1);

      for (int var3 = 0; var3 < var0.size(); var3++) {
         for (int var7 : ((class11171)var0.get(var3)).y()) {
            var2[var7] = var3;
         }
      }

      int[][] var12 = new int[var0.size()][];
      boolean[] var13 = new boolean[var1];
      int[] var14 = new int[var1];

      for (int var15 = 0; var15 < var0.size(); var15++) {
         int var16 = 0;

         for (int var11 : ((class11171)var0.get(var15)).y()) {
            if (!var13[var11] && var2[var11] == var15) {
               var13[var11] = true;
               var14[var16++] = var11;
            }
         }

         int[] var17 = Arrays.copyOf(var14, var16);

         for (int var18 = 0; var18 < var16; var18++) {
            var13[var17[var18]] = false;
         }

         var12[var15] = var17.length == 0 ? (int[])N_0 : var17;
      }

      return var12;
   }

   public static <C> class11187<C> N() {
      return new class11187<>((class09065)class09065.y_0);
   }

   public static <C> class11187<C> N(class09065 var0) {
      return new class11187<>(var0);
   }
}
