package Nursultan;

import java.util.Set;
import java.util.regex.Pattern;

public class class11811 {
   private class11811() {
   }

   public static void y(long var0) {
      if (var0 >= 50L) {
         throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_5);
      }
   }

   public static void N(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         if (var0.length > 1048576) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_4);
         }
      } else {
         throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_3);
      }
   }

   public static void N(int var0) {
      if (!((Set)class11823.N_6).contains(var0)) {
         throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_3);
      }
   }

   public static String N(String var0) {
      if (var0 == null) {
         throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_2);
      } else {
         String var1 = var0.strip();
         if (var1.length() < 3 || var1.length() > 32) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_2);
         } else if (!((Pattern)class11823.N_5).matcher(var1).matches()) {
            throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_2);
         } else {
            return var1;
         }
      }
   }

   public static void N(long var0) {
      if (var0 > 4194304L) {
         throw new class11788(class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_4);
      }
   }
}
