package l;

import java.util.ArrayDeque;
import java.util.Queue;

public class Helper97<T> {
   private final Queue<T> items = new ArrayDeque<>();
   private final Helper62<T> producer;

   public Helper97(Helper62<T> var1) {
      this.producer = var1;
   }

   public synchronized T method909() {
      return !this.items.isEmpty() ? this.items.poll() : this.producer.create();
   }

   public synchronized void method910(T var1) {
      this.items.offer((T)var1);
   }
}
