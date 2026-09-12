package Nursultan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class class11740<K, V> implements class09819 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;
   public static Object y_0;

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0.0F;
         this.N_3 = false;
      }
   }

   public class11740(float var1) {
      this.M();
      this.N_0 = new LinkedHashMap();
      this.N_1 = new HashMap();
      this.N_2 = var1;
   }

   static {
      i();
   }

   private static void i() {
      y_0 = 180L;
   }

   public boolean N(boolean var1) {
      boolean var2 = (Boolean)this.N_3;
      this.N_3 = var1;
      return var2;
   }

   public boolean N(K var1) {
      return ((Map)this.N_1).containsKey(var1);
   }

   public float N(boolean var1, float var2) {
      if (var1) {
         this.N_2 = var2;
      }

      return (Float)this.N_2;
   }

   @Override
   public boolean N() {
      return !((Map)this.N_1).isEmpty();
   }

   public List<V> N(List<V> var1, Function<V, K> var2) {
      long var3 = System.currentTimeMillis();
      HashSet var5 = new HashSet();

      for (Object var7 : var1) {
         Object var8 = var2.apply(var7);
         var5.add(var8);
         ((Map)this.N_0).put(var8, var7);
         ((Map)this.N_1).remove(var8);
      }

      for (Object var10 : ((Map)this.N_0).keySet()) {
         if (!var5.contains(var10)) {
            ((Map)this.N_1).putIfAbsent(var10, var3);
         }
      }

      ((Map)this.N_0).keySet().removeIf(var3x -> {
         Long var4 = (Long)((Map)this.N_1).get(var3x);
         if (var4 != null && var3 - var4 >= 180L) {
            ((Map)this.N_1).remove(var3x);
            return true;
         } else {
            return false;
         }
      });
      return List.copyOf(((Map)this.N_0).values());
   }

   @Override
   public boolean N(float var1) {
      return true;
   }
}
