package org.zenith.render;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

final class RenderCommandQueue_Var159<T> {
   public final ArrayList<T> arrayList2 = new ArrayList<>();
   public final Supplier<T> supplier4;
   public final Consumer<T> consumer2;
   public int int178;

   RenderCommandQueue_Var159(Supplier<T> var1, Consumer<T> var2) {
      this.supplier4 = var1;
      this.consumer2 = var2;
   }

   T var1435() {
      if (this.int178 < this.arrayList2.size()) {
         return this.arrayList2.get(this.int178++);
      } else {
         Object object = this.supplier4.get();
         this.arrayList2.add((T)object);
         this.int178++;
         return (T)object;
      }
   }

   void reset() {
      for (int i = 0; i < this.int178; i++) {
         this.consumer2.accept(this.arrayList2.get(i));
      }

      this.int178 = 0;
   }
}
