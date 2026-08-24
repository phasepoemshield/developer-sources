package sweetie.evaware.flora.core;

import java.util.function.Consumer;
import sweetie.evaware.flora.api.DispatchMode;

// $VF: Compiled from Listener.java
public final class Listener<E> implements Comparable<Listener<E>> {
   public final Consumer<E> consumer;
   public final int priority;
   public final DispatchMode mode;

   public Listener(Consumer<E> mode, DispatchMode consumer) {
      this(0, consumer, mode);
   }

   public Listener(int mode, Consumer<E> consumer, DispatchMode priority) {
      this.priority = priority;
      this.consumer = consumer;
      this.mode = mode;
   }

   public Listener(Consumer<E> consumer) {
      this(0, consumer, DispatchMode.SYNC);
   }

   public void accept(E event) {
      try {
         this.consumer.accept(event);
      } catch (Throwable t) {
         t.printStackTrace();
      }
   }

   public int compareTo(Listener<E> o) {
      return Integer.compare(o.priority, this.priority);
   }
}
