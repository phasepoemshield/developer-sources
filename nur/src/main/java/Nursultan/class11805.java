package Nursultan;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11805 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;

   private static void L() {
   }

   private String L(class11808 var1) {
      Class<?> var2 = var1.M();
      return var2 == null ? "" : var2.getName();
   }

   private List<class11808> L(List<class11808> var1) {
      int var2 = var1.size();
      if (var2 < 2) {
         return var1;
      } else {
         HashMap var3 = new HashMap();

         for (int var4 = 0; var4 < var2; var4++) {
            Class<?> var5 = ((class11808)var1.get(var4)).M();
            if (var5 != null) {
               var3.computeIfAbsent(var5, var0 -> new ArrayList<>()).add(var4);
            }
         }

         ArrayList var14 = new ArrayList(var2);

         for (int var15 = 0; var15 < var2; var15++) {
            var14.add(new HashSet());
         }

         int[] var16 = new int[var2];

         for (int var6 = 0; var6 < var2; var6++) {
            class11808 var7 = (class11808)var1.get(var6);

            for (Class<?> var11 : var7.y()) {
               for (int var13 : var3.getOrDefault(var11, List.of())) {
                  if (var13 != var6 && ((Set)var14.get(var13)).add(var6)) {
                     var16[var6]++;
                  }
               }
            }

            for (Class var27 : var7.R()) {
               for (int var34 : var3.getOrDefault(var27, List.of())) {
                  if (var34 != var6 && ((Set)var14.get(var6)).add(var34)) {
                     var16[var34]++;
                  }
               }
            }
         }

         Comparator var17 = Comparator.comparing(var2x -> this.L((class11808)var1.get(var2x))).thenComparingInt(var0 -> var0);
         PriorityQueue var18 = new PriorityQueue(var17);

         for (int var20 = 0; var20 < var2; var20++) {
            if (var16[var20] == 0) {
               var18.add(var20);
            }
         }

         ArrayList var21 = new ArrayList(var2);
         boolean[] var23 = new boolean[var2];

         while (!var18.isEmpty()) {
            int var25 = (Integer)var18.poll();
            var21.add((class11808)var1.get(var25));
            var23[var25] = true;

            for (int var32 : (Set)var14.get(var25)) {
               if (--var16[var32] == 0) {
                  var18.add(var32);
               }
            }
         }

         if (var21.size() < var2) {
            ArrayList var26 = new ArrayList();

            for (int var29 = 0; var29 < var2; var29++) {
               if (!var23[var29]) {
                  var26.add((class11808)var1.get(var29));
               }
            }

            String var30 = ((class11808)var1.get(0)).u().getName();
            List var33 = var26.stream().map(this::L).toList();
            if ((Boolean)class11938.L_3) {
               throw new IllegalStateException("Cyclic before/after for event " + var30 + ": " + var33);
            }

            ((Logger)N_0).warn("Cyclic before/after for event {}; ignoring ordering for: {}", var30, var33);
            var26.sort(Comparator.comparing(this::L));
            var21.addAll(var26);
         }

         return var21;
      }
   }

   public <T> void L(T var1) {
      class11784 var2 = var1 instanceof class11784 var3 ? var3 : null;
      if (var2 != null) {
         var2.N(false);
      }

      class11818 var9 = (class11818)((ClassValue)this.y_2).get(var1.getClass());
      if (var9 != null) {
         class11808[] var4 = var9.y();
         Consumer<Object>[] var5 = var9.N();

         for (int var6 = 0; var6 < var5.length; var6++) {
            if (var2 == null || !var2.y() || !var4[var6].i()) {
               try {
                  var5[var6].accept(var1);
               } catch (Exception var8) {
                  ((Logger)N_0).error("Event handler failed: {}", var1.getClass().getName(), var8);
               }
            }
         }
      }
   }

   public class11805(Object var1) {
      this.i();
      this.y_0 = new ConcurrentHashMap();
      this.y_1 = new ConcurrentHashMap();
      this.y_2 = new class11800(this);
      this.y_3 = new ArrayList();
      ((List)this.y_3).add(new class11803(var1.getClass().getPackageName(), (var0, var1x) -> (Lookup)var0.invoke(null, var1x, MethodHandles.lookup())));
      this.y(var1);
   }

   static {
      L();
      N();
      y();
      u();
   }

   private void i() {
   }

   private static void u() {
      N_0 = null;
   }

   private void y(class11808 var1) {
      Class<?> var2 = var1.u();
      ((Map)this.y_1).compute(var2, (var2x, var3) -> {
         ArrayList var4 = var3 == null ? new ArrayList() : new ArrayList<>(Arrays.asList(var3.y()));
         var4.add(var1);
         return this.N(var4);
      });
      ((ClassValue)this.y_2).remove(var2);
   }

   private static void y() {
   }

   public void y(Object var1) {
      this.N(var1.getClass(), var1).forEach(this::y);
   }

   private class11795 y(Class<?> var1) {
      synchronized ((List)this.y_3) {
         for (class11803 var4 : (List)this.y_3) {
            if (var1.getName().startsWith(var4.y())) {
               return var4.N();
            }
         }
      }

      throw new RuntimeException("No registered lambda factory for '" + var1.getName() + "'.");
   }

   private List<class11808> y(List<class11808> var1) {
      EnumMap var2 = new EnumMap<>(class11777.class);

      for (class11808 var4 : var1) {
         var2.computeIfAbsent(var4.L(), var0 -> new ArrayList<>()).add(var4);
      }

      ArrayList var9 = new ArrayList(var1.size());

      for (class11777 var7 : class11777.values()) {
         List var8 = (List)var2.get(var7);
         if (var8 != null) {
            var9.addAll(this.L(var8));
         }
      }

      return var9;
   }

   public <T> void N(class11777 var1, boolean var2, Class<T> var3, class11826<T> var4) {
      this.y((class11808)(new class11780(var3, var1, var2, var4)));
   }

   private void N(class11808 var1) {
      Class<?> var2 = var1.u();
      ((Map)this.y_1).computeIfPresent(var2, (var2x, var3) -> {
         ArrayList var4 = new ArrayList<>(Arrays.asList(var3.y()));
         var4.remove(var1);
         return var4.isEmpty() ? null : this.N(var4);
      });
      ((ClassValue)this.y_2).remove(var2);
   }

   private void N(List<class11808> var1, Class<?> var2, Object var3) {
      for (Method var7 : var2.getDeclaredMethods()) {
         if (this.N(var7)) {
            var1.add(new class11779(this.y(var2), var2, var3, var7));
         }
      }

      if (var2.getSuperclass() != null) {
         this.N(var1, var2.getSuperclass(), var3);
      }
   }

   private List<class11808> N(Class<?> var1, Object var2) {
      return ((Map)this.y_0).computeIfAbsent(var2, var2x -> {
         ArrayList var3 = new ArrayList();
         this.N(var3, var1, var2x);
         return var3;
      });
   }

   public <T> void N(Class<T> var1, class11826<T> var2) {
      this.N(class11777.NOW, false, var1, var2);
   }

   private boolean N(Method var1) {
      return var1.isAnnotationPresent(class11782.class)
         && var1.getReturnType() == void.class
         && var1.getParameterCount() == 1
         && !var1.getParameters()[0].getType().isPrimitive();
   }

   private class11818 N(List<class11808> var1) {
      class11808[] var3 = this.y(var1).toArray(var0 -> new class11808[var0]);
      Consumer[] var4 = new Consumer[var3.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         var4[var5] = var3[var5].N();
      }

      return new class11818(var3, var4);
   }

   public void N(Object var1) {
      this.N(var1.getClass(), var1).forEach(this::N);
   }

   private static void N() {
   }

   public <T> void N(class11777 var1, Class<T> var2, class11826<T> var3) {
      this.N(var1, false, var2, var3);
   }
}
