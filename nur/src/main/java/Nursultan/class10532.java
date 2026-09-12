package Nursultan;

import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class05678;
import org.jspecify.annotations.Nullable;

public final class class10532 implements class05678<class10533> {
   private final Queue<Runnable>[] N;
   private final AtomicInteger y = new AtomicInteger();

   public int L() {
      return this.y.get();
   }

   public class10532(int var1) {
      this.N = new Queue[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         this.N[var2] = Queues.newConcurrentLinkedQueue();
      }
   }

   public boolean y() {
      return this.y.get() == 0;
   }

   public boolean N(class10533 var1) {
      int var2 = var1.N();
      if (var2 < this.N.length && var2 >= 0) {
         this.N[var2].add(var1);
         this.y.incrementAndGet();
         return true;
      } else {
         throw new IndexOutOfBoundsException(String.format(Locale.ROOT, "Priority %d not supported. Expected range [0-%d]", var2, this.N.length - 1));
      }
   }

   @Nullable
   public Runnable N() {
      Queue<Runnable>[] var1 = this.N;
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         Runnable var5 = var1[var3].poll();
         if (var5 != null) {
            this.y.decrementAndGet();
            return var5;
         }
      }

      return null;
   }
}
