package Nursultan;

import java.util.Iterator;
import java.util.List;

public final class class09730 {
   private static final int N = 4;
   private final int y;
   private final List<List<class09729>> L;

   class09730(int var1, List<List<class09729>> var2) {
      this.y = var1;
      this.L = var2;
   }

   public int y() {
      return this.y;
   }

   public int N(int var1, int var2) {
      int var3 = 0;
      Iterator<List<class09729>> var4 = this.L.iterator();

      while (var4.hasNext()) {
         Iterator<class09729> var6 = var4.next().iterator();

         while (var6.hasNext()) {
            int var8 = var6.next().N(var1, var2);
            if (var8 != Integer.MIN_VALUE) {
               var3 += var8;
               break;
            }
         }
      }

      return var3;
   }

   public boolean N() {
      return this.L.isEmpty();
   }

   public static class09730 N(byte[] var0) {
      try {
         return new class09754(var0).N();
      } catch (RuntimeException var2) {
         return new class09730(1000, List.of());
      }
   }
}
