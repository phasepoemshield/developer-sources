package Nursultan;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public record class09713(Map<class09736, class09743> specs) {
   public static final class09713 N = new class09713(null);

   public class09713(Map<class09736, class09743> specs) {
      EnumMap var2 = new EnumMap<>(class09736.class);
      if (specs != null) {
         for (Entry var4 : specs.entrySet()) {
            class09736 var5 = (class09736)var4.getKey();
            if (var5 != null) {
               class09743 var6 = var4.getValue() == null ? class09743.Z() : (class09743)var4.getValue();
               if (var6.u()) {
                  var5.y(var6);
                  var2.put(var5, var6);
               }
            }
         }
      }

      this.specs = Collections.unmodifiableMap(var2);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof class09713 var3) {
         class09713 var10000 = var3;

         try {
            var5 = var10000.y();
         } catch (Throwable var4) {
            throw new MatchException(var4.toString(), var4);
         }

         Map var2 = var5;
         return this.specs.equals(var2);
      } else {
         return false;
      }
   }

   public Map<class09736, class09743> y() {
      return this.specs;
   }

   public class09743 N(class09736 var1) {
      return var1 == null ? class09743.Z() : this.specs.getOrDefault(var1, class09743.Z());
   }

   public boolean N() {
      return this.specs.isEmpty();
   }
}
