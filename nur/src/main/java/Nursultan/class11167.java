package Nursultan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class11167 implements class09337 {
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public boolean y_init;

   class11167(List<class11208> var1) {
      this.i();
      this.y_0 = new ArrayList();
      this.y_1 = new HashMap();
      this.y_2 = new HashSet();
      this.y_3 = new HashSet();

      for (class11208 var3 : var1) {
         if (var3.u() == null) {
            ((List)this.y_0).add(var3);
         } else if (((Map)this.y_1).put(var3.u(), var3) != null) {
            throw new IllegalArgumentException("Shader template arg was configured twice: " + var3.u());
         }
      }
   }

   private void i() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_4 = 0;
      }
   }

   @Override
   public void y() {
      this.y_4 = 0;
      ((Set)this.y_2).clear();
      ((Set)this.y_3).clear();
   }

   private class11208 y(String var1) {
      class11208 var2 = (class11208)((Map)this.y_1).get(var1);
      if (var2 != null) {
         ((Set)this.y_2).add(var1);
         return var2;
      } else if ((Integer)this.y_4 < ((List)this.y_0).size()) {
         List var10000 = (List)this.y_0;
         int var10003 = (Integer)this.y_4;
         this.y_4 = var10003 + 1;
         return (class11208)var10000.get(var10003);
      } else {
         throw new IllegalArgumentException("Missing shader template value for " + var1);
      }
   }

   @Override
   public boolean N() {
      return true;
   }

   @Override
   public String N(int var1, String var2, String var3) {
      Matcher var4 = ((Pattern)class11193.N_0).matcher(var3);
      StringBuilder var5 = new StringBuilder();

      while (var4.find()) {
         String var6 = var4.group(1);
         String var7 = var4.group(2);
         class11169 var8 = class11169.N(var4.group(3));
         int var9 = N(var8, var7, var4.group(4));
         String var10 = var4.group(5);
         class11208 var11 = this.y(var7);
         String var12 = this.N(var2, var7, var8, var9, var11);
         var4.appendReplacement(var5, Matcher.quoteReplacement(var6 + var12 + var10));
         ((Set)this.y_3).add(var7);
      }

      var4.appendTail(var5);
      if (var1 == 35632) {
         this.N(var2);
      }

      return var5.toString();
   }

   private String N(String var1, String var2, class11169 var3, int var4, class11208 var5) {
      if (var5.N() != null && var5.N() != var3) {
         throw new IllegalArgumentException("Shader template type mismatch for " + var2 + " in " + var1 + ". Expected " + var5.N() + ", actual " + var3);
      } else if (var5.y()) {
         return var3.N(var2, var4);
      } else {
         try {
            return var3.N(var2, var5.L(), var4);
         } catch (IllegalArgumentException var7) {
            throw new IllegalArgumentException("Invalid shader template value for " + var2 + " (" + var3 + ") in " + var1 + ": " + var7.getMessage(), var7);
         }
      }
   }

   private static int N(class11169 var0, String var1, String var2) {
      if (!var0.N()) {
         if (var2 != null) {
            throw new IllegalArgumentException("Only array shader template args can have a size: " + var1);
         } else {
            return 0;
         }
      } else if (var2 == null) {
         throw new IllegalArgumentException("Array shader template arg needs a marker size: " + var1);
      } else {
         return Integer.parseInt(var2);
      }
   }

   private void N(String var1) {
      if ((Integer)this.y_4 < ((List)this.y_0).size()) {
         throw new IllegalArgumentException("Too many ordered shader template actions for " + var1 + ". First unused action index: " + (Integer)this.y_4);
      } else {
         for (String var3 : ((Map)this.y_1).keySet()) {
            if (!((Set)this.y_3).contains(var3)) {
               throw new IllegalArgumentException("Shader template arg was not found: " + var3);
            }

            if (!((Set)this.y_2).contains(var3)) {
               throw new IllegalArgumentException("Shader template arg was not used: " + var3);
            }
         }
      }
   }
}
