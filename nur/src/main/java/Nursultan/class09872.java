package Nursultan;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

final class class09872 {
   private final Map<class09819, Runnable> N = new IdentityHashMap<>();

   private class09872() {
   }

   void N(class09819 var1) {
      if (var1 != null) {
         this.N.remove(var1);
      }
   }

   class09847 N(float var1) {
      if (!(var1 <= 0.0F) && !this.N.isEmpty()) {
         boolean var2 = false;

         for (Entry var4 : this.N.entrySet()) {
            class09819 var5 = (class09819)var4.getKey();
            if (var5.N()) {
               var2 = true;
               if (var5.N(var1)) {
                  ((Runnable)var4.getValue()).run();
               }
            }
         }

         return var2 ? class09847.y : class09847.N;
      } else {
         return class09847.N;
      }
   }

   static class09872 N(class09781 var0) {
      return var0.N(class09872.class).orElseGet(() -> {
         class09872 var1 = new class09872();
         var0.N(class09872.class, var1);
         return var1;
      });
   }

   void N(class09819 var1, Runnable var2) {
      this.N.put(Objects.requireNonNull(var1, "ticker"), Objects.requireNonNull(var2, "requestRender"));
   }
}
