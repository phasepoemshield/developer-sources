package Nursultan;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public final class class10010 {
   public static final class10010 N = new class10010(null);
   private final Map<class09979, class10002> y;

   public class10010(Map<class09979, class10002> var1) {
      EnumMap var2 = new EnumMap<>(class09979.class);
      if (var1 != null) {
         for (Entry var4 : var1.entrySet()) {
            class09979 var5 = (class09979)var4.getKey();
            class10002 var6 = (class10002)var4.getValue();
            if (var5 != null && var6 != null && !var6.N()) {
               var2.put(var5, var6);
            }
         }
      }

      this.y = Collections.unmodifiableMap(var2);
   }

   public Map<class09979, class10002> y() {
      return this.y;
   }

   public class10010 N(class10010 var1) {
      if (var1 != null && var1 != N && !var1.N()) {
         EnumMap var2 = new EnumMap<>(class09979.class);
         var2.putAll(this.y);

         for (Entry var4 : var1.y.entrySet()) {
            class09979 var5 = (class09979)var4.getKey();
            class10002 var6 = (class10002)var4.getValue();
            class10002 var7 = this.N(var5).N(var6);
            if (var7.N()) {
               var2.remove(var5);
            } else {
               var2.put(var5, var7);
            }
         }

         return new class10010(var2);
      } else {
         return this;
      }
   }

   public boolean N() {
      return this.y.isEmpty();
   }

   public class10002 N(class09979 var1) {
      return var1 == null ? class10002.N : this.y.getOrDefault(var1, class10002.N);
   }

   public class10010 N(class09979 var1, class10002 var2) {
      if (var1 == null) {
         return this;
      } else {
         EnumMap var3 = new EnumMap<>(class09979.class);
         var3.putAll(this.y);
         if (var2 != null && !var2.N()) {
            var3.put(var1, var2);
         } else {
            var3.remove(var1);
         }

         return new class10010(var3);
      }
   }

   public class10002 N(boolean var1, boolean var2, boolean var3) {
      class10002 var4 = class10002.N;
      if (var1) {
         var4 = var4.N(this.N(class09979.HOVER));
      }

      if (var2) {
         var4 = var4.N(this.N(class09979.FOCUS));
      }

      if (var3) {
         var4 = var4.N(this.N(class09979.ACTIVE));
      }

      return var4;
   }
}
