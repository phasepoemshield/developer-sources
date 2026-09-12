package Nursultan;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public final class class09715 {
   private final class09781 N;
   private final Map<class10021, class09710> y = new IdentityHashMap<>();
   private final Set<class10021> L = Collections.newSetFromMap(new IdentityHashMap<>());

   public boolean L(class10021 var1) {
      class09710 var2 = this.y.get(var1);
      if (var2 != null && !var2.N.isEmpty()) {
         Iterator<class09738> var3 = var2.N.values().iterator();

         while (var3.hasNext()) {
            if (var3.next().i().y()) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private class09715(class09781 var1) {
      this.N = Objects.requireNonNull(var1, "context");
   }

   public void u(class10021 var1) {
      if (var1 != null) {
         ArrayDeque var2 = new ArrayDeque();
         var2.push(var1);

         while (!var2.isEmpty()) {
            class10021 var3 = (class10021)var2.pop();
            this.y.remove(var3);
            this.L.remove(var3);

            for (int var4 = 0; var4 < var3.u(); var4++) {
               var2.push(var3.N(var4));
            }
         }
      }
   }

   public class09741 y(float var1) {
      if (!(var1 <= 0.0F) && !this.y.isEmpty()) {
         boolean var2 = false;
         boolean var3 = false;
         Iterator<Entry<class10021, class09710>> var4 = this.y.entrySet().iterator();

         while (var4.hasNext()) {
            Entry var5 = var4.next();
            class10021 var6 = (class10021)var5.getKey();
            class09710 var7 = (class09710)var5.getValue();
            if (var7.N.isEmpty()) {
               var4.remove();
            } else if (var7.y) {
               var7.y = false;
            } else {
               class09980 var8 = var6.o();
               class09996 var9 = null;
               ArrayList var10 = null;
               Iterator<class09738> var11 = var7.N.values().iterator();

               while (var11.hasNext()) {
                  class09738 var12 = var11.next();
                  boolean var13 = var12.N(var1);
                  if (var13 || var12.N()) {
                     if (var9 == null) {
                        var9 = var8.R();
                     }

                     var12.i().N(var9, var12);
                     if (var12.N()) {
                        var11.remove();
                        if (var10 == null) {
                           var10 = new ArrayList(2);
                        }

                        var10.add(var12.i());
                     }
                  }
               }

               class09980 var16 = var9 == null ? var8 : var9.N();
               boolean var17 = !var16.N(var8);
               boolean var14 = !var16.y(var8);
               boolean var15 = !var16.L(var8);
               if (var17 || var14 || var15) {
                  var6.N(var16);
                  if (var17) {
                     var6.i(2);
                     var3 = true;
                  } else if (var14) {
                     var6.i(4);
                  } else {
                     var6.i(1);
                  }

                  var2 = true;
               }

               N(var6, var10, var7.N.isEmpty());
               if (var7.N.isEmpty()) {
                  var4.remove();
               }
            }
         }

         return class09741.N(var2, var3);
      } else {
         return class09741.N;
      }
   }

   public boolean y(class10021 var1) {
      class09710 var2 = this.y.get(var1);
      return var2 != null && !var2.N.isEmpty();
   }

   private static void N(class10021 var0, class09736 var1, boolean var2) {
      class09863.N(new class09842(var0, var1, var2));
   }

   private static void N(class10021 var0, List<class09736> var1, boolean var2) {
      if (var1 != null && !var1.isEmpty()) {
         for (class09736 var4 : var1) {
            N(var0, var4, var2);
         }
      }
   }

   public static class09715 N(class09781 var0) {
      return var0.N(class09715.class).orElseGet(() -> {
         class09715 var1 = new class09715(var0);
         var0.N(class09715.class, var1);
         return var1;
      });
   }

   public boolean N(class10021 var1) {
      if (var1 == null) {
         return false;
      } else {
         ArrayDeque var2 = new ArrayDeque();
         var2.push(var1);

         while (!var2.isEmpty()) {
            class10021 var3 = (class10021)var2.pop();
            class09710 var4 = this.y.get(var3);
            if (var3.T() && var4 != null && !var4.N.isEmpty()) {
               return true;
            }

            for (int var5 = 0; var5 < var3.u(); var5++) {
               var2.push(var3.N(var5));
            }
         }

         return false;
      }
   }

   private class09980 N(class10021 var1, class09980 var2, class10002 var3) {
      if (var3 != null && !var3.N()) {
         class09980 var4 = var3.N(var2);
         class09713 var5 = var2.A();
         class09980 var6 = var2;
         class09710 var7 = null;

         for (class09736 var11 : class09736.values()) {
            if (var11.N(var4, var2)) {
               class09743 var12 = var5.N(var11);
               if (var12.u() && var11.y(var4, var2, var12)) {
                  if (var7 == null) {
                     var7 = new class09710(true);
                  }

                  var7.N.put(var11, var11.N(var4, var2, var12));
                  var6 = var11.y(var4, var6);
               }
            }
         }

         if (var7 != null && !var7.N.isEmpty()) {
            this.y.put(var1, var7);
         }

         return var6;
      } else {
         return var2;
      }
   }

   public class09980 N(class10021 var1, class09980 var2, class09980 var3, class10002 var4) {
      if (var1 != null && var2 != null && var3 != null) {
         if (!this.L.contains(var1)) {
            this.L.add(var1);
            this.y.remove(var1);
            return this.N(var1, var3, var4);
         } else {
            class09980 var5 = var3;
            class09710 var6 = this.y.computeIfAbsent(var1, var0 -> new class09710(false));
            class09713 var7 = var3.A();

            for (class09736 var11 : class09736.values()) {
               if (!var11.N(var2, var3)) {
                  var6.N.remove(var11);
               } else {
                  class09743 var12 = var7.N(var11);
                  if (var12.u() && var11.y(var2, var3, var12)) {
                     class09738 var13 = var6.N.get(var11);
                     if (var13 != null && var13.N(var12) && var11.N(var13, var3)) {
                        var5 = var11.y(var2, var5);
                     } else if (var13 != null && var13.y(var12) && var13.y(var11.N(var3))) {
                        var5 = var11.N(var5, var13.u());
                     } else {
                        class09738 var14 = var11.N(var2, var3, var12);
                        var6.N.put(var11, var14);
                        var5 = var11.y(var2, var5);
                     }
                  } else {
                     var6.N.remove(var11);
                  }
               }
            }

            if (var6.N.isEmpty()) {
               this.y.remove(var1);
            }

            return var5;
         }
      } else {
         return var3;
      }
   }

   public boolean N(float var1) {
      return this.y(var1).N();
   }
}
