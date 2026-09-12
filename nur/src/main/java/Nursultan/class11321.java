package Nursultan;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;

public class class11321<T> extends ObjectArraySet<T> {
   public boolean add(T var1) {
      boolean var2 = super.add(var1);
      if (!var2) {
         this.N((T)var1);
         var2 = super.add(var1);
      }

      return var2;
   }

   public boolean addAll(Collection<? extends T> var1) {
      boolean var2 = false;

      for (Object var4 : var1) {
         boolean var5 = super.add(var4);
         if (!var5) {
            this.N((T)var4);
            var5 = super.add(var4);
         }

         if (var5) {
            var2 = true;
         }
      }

      return var2;
   }

   public void N(T var1) {
      this.remove(var1);
   }
}
