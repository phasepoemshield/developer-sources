package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class class10006 {
   public static final class10006 N = new class10006(null);
   private final List<class09998> y;

   private class10006(List<class09998> var1) {
      this.y = var1 != null && !var1.isEmpty() ? List.copyOf(var1) : List.of();
   }

   public List<class09998> y() {
      return this.y;
   }

   public class10006 N(class10006 var1) {
      if (var1 == null || var1.N()) {
         return this;
      } else if (this.N()) {
         return var1;
      } else {
         ArrayList var2 = new ArrayList(this.y.size() + var1.y.size());
         var2.addAll(this.y);
         var2.addAll(var1.y);
         return new class10006(var2);
      }
   }

   private static boolean N(class09979 var0, boolean var1, boolean var2, boolean var3) {
      return switch (var0) {
         case HOVER -> var1;
         case FOCUS -> var2;
         case ACTIVE -> var3;
      };
   }

   private static boolean N(List<class09992> var0, class09992 var1) {
      Iterator var2 = var0.iterator();

      while (var2.hasNext()) {
         if ((class09992)var2.next() == var1) {
            return true;
         }
      }

      return false;
   }

   public boolean N() {
      return this.y.isEmpty();
   }

   public class10006 N(class09979 var1, class09992 var2, class10002 var3) {
      if (var1 != null && var2 != null && var3 != null && !var3.N()) {
         ArrayList var4 = new ArrayList(this.y.size() + 1);
         var4.addAll(this.y);
         var4.add(new class09998(var1, var2, var3));
         return new class10006(var4);
      } else {
         return this;
      }
   }

   public boolean N(class09979 var1) {
      if (var1 != null && !this.N()) {
         Iterator var2 = this.y.iterator();

         while (var2.hasNext()) {
            if (((class09998)var2.next()).N() == var1) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public class10002 N(List<class09992> var1, boolean var2, boolean var3, boolean var4) {
      if (!this.N() && var1 != null && !var1.isEmpty()) {
         class10002 var5 = class10002.N;

         for (class09998 var7 : this.y) {
            if (N(var7.N(), var2, var3, var4) && N(var1, var7.y())) {
               var5 = var5.N(var7.L());
            }
         }

         return var5;
      } else {
         return class10002.N;
      }
   }
}
