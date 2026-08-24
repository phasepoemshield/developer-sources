package org.zenith.render;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

final class HudPreviewRenderQueue_Var165<T> {
   public final ArrayList<T> arrayList = new ArrayList<>();
   public final Supplier<T> supplier2;
   public final Consumer<T> consumer;
   public int int178;

   HudPreviewRenderQueue_Var165(Supplier<T> var1, Consumer<T> var2) {
      this.supplier2 = var1;
      this.consumer = var2;
   }

   T var1435() {
      if (this.int178 < this.arrayList.size()) {
         return this.arrayList.get(this.int178++);
      } else {
         Object object = this.supplier2.get();
         this.arrayList.add((T)object);
         this.int178++;
         return (T)object;
      }
   }

   void reset() {
      for (int i = 0; i < this.int178; i++) {
         this.consumer.accept(this.arrayList.get(i));
      }

      this.int178 = 0;
   }
}
