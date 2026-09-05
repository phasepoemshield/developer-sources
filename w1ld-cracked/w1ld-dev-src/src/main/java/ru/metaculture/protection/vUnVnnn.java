package ru.metaculture.protection;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class vUnVnnn {
   private final Map<Class<?>, List<vUnVnnn.NVnVnNnN>> UuUVuuUu = new ConcurrentHashMap<>();

   public void UuUVuuUu(Object var1) {
      for (Method var5 : var1.getClass().getDeclaredMethods()) {
         if (var5.getParameterCount() == 1 && var5.isAnnotationPresent(vuVvUNNvVNV.class)) {
            Class var6 = var5.getParameterTypes()[0];
            if (VunUNUNVUnv.class.isAssignableFrom(var6)) {
               var5.setAccessible(true);
               byte var7 = var5.getAnnotation(vuVvUNNvVNV.class).UuUVuuUu();
               List var8 = this.UuUVuuUu.computeIfAbsent(var6, var0 -> new CopyOnWriteArrayList<>());

               for (vUnVnnn.NVnVnNnN var10 : var8) {
                  if (var10.UuUVuuUu == var1 && var10.C00OOC00oO.equals(var5)) {
                     return;
                  }
               }

               var8.add(new vUnVnnn.NVnVnNnN(var1, var5, var7));
               var8.sort(Comparator.comparingInt(var0 -> UuUVuuUu(var0.uUnuvNvvNU)));
            }
         }
      }
   }

   public void C00OOC00oO(Object var1) {
      for (Entry var3 : this.UuUVuuUu.entrySet()) {
         List var4 = (List)var3.getValue();
         var4.removeIf(var1x -> var1x.UuUVuuUu == var1);
         if (var4.isEmpty()) {
            this.UuUVuuUu.remove(var3.getKey(), var4);
         }
      }
   }

   public VunUNUNVUnv UuUVuuUu(VunUNUNVUnv var1) {
      List var2 = this.UuUVuuUu.get(var1.getClass());
      if (var2 != null && !var2.isEmpty()) {
         vUnVnnn.NVnVnNnN[] var3 = var2.toArray(new vUnVnnn.NVnVnNnN[0]);
         if (var1 instanceof UnuNvnVUUunn var4) {
            for (vUnVnnn.NVnVnNnN var8 : var3) {
               var8.UuUVuuUu(var1);
               if (var4.vVvUvVVuuNvV()) {
                  break;
               }
            }
         } else {
            for (vUnVnnn.NVnVnNnN var12 : var3) {
               var12.UuUVuuUu(var1);
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private static int UuUVuuUu(byte var0) {
      for (int var1 = 0; var1 < nuvNNvvNNUU.nuUnNvnuUu.length; var1++) {
         if (nuvNNvvNNUU.nuUnNvnuUu[var1] == var0) {
            return var1;
         }
      }

      return nuvNNvvNNUU.nuUnNvnuUu.length;
   }

   static final class NVnVnNnN {
      final Object UuUVuuUu;
      final Method C00OOC00oO;
      final byte uUnuvNvvNU;

      NVnVnNnN(Object var1, Method var2, byte var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
      }

      void UuUVuuUu(VunUNUNVUnv var1) {
         try {
            this.C00OOC00oO.invoke(this.UuUVuuUu, var1);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }
   }
}
