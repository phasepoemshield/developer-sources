package sweetie.evaware.flora.core.engine;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

// $VF: Compiled from AsyncLoop.java
public class AsyncLoop extends Thread {
   private static final VarHandle CONSUMER_IDX;
   private volatile long consumerIndex;
   long p14;
   long p11;
   long p23;
   long p13;
   long p12;
   long p25;
   long p02;
   private static final VarHandle ARRAY_ELEM;
   private volatile long producerIndex;
   long p07;
   long p22;
   private static final int MASK = 65535;
   private final AtomicBoolean running = new AtomicBoolean(true);
   long p27;
   private static final VarHandle PRODUCER_IDX;
   long p26;
   long p17;
   long p06;
   long p24;
   private static final int CAPACITY = 65536;
   long p15;
   long p03;
   long p21;
   long p16;
   private final Runnable[] buffer = new Runnable[65536];
   long p01;
   long p04;
   long p05;

   public void shutdown() {
      this.running.set(false);
      LockSupport.unpark(this);
   }

   public void execute(Runnable task) {
      long currHead;
      long currTail;
      do {
         currHead = (long)CONSUMER_IDX.getVolatile((AsyncLoop)this);
         currTail = (long)PRODUCER_IDX.getVolatile((AsyncLoop)this);
         if (currTail - currHead >= 65536L) {
            Thread.onSpinWait();
         }
      } while (!PRODUCER_IDX.compareAndSet((AsyncLoop)this, (long)currTail, (long)(currTail + 1L)));

      int offset = (int)(currTail & 65535L);
      ARRAY_ELEM.setRelease((Runnable[])this.buffer, (int)offset, (Runnable)task);
      if (currTail == currHead) {
         LockSupport.unpark(this);
      }
   }

   static {
      try {
         Lookup l = MethodHandles.lookup();
         PRODUCER_IDX = l.findVarHandle(AsyncLoop.class, "producerIndex", long.class);
         CONSUMER_IDX = l.findVarHandle(AsyncLoop.class, "consumerIndex", long.class);
         ARRAY_ELEM = MethodHandles.arrayElementVarHandle(Runnable[].class);
      } catch (ReflectiveOperationException e) {
         throw new ExceptionInInitializerError(e);
      }
   }

   public AsyncLoop() {
      super("Async-Worker");
      this.setDaemon(true);
      this.start();
   }

   @Override
   public void run() {
      while (this.running.get()) {
         long currHead = (long)CONSUMER_IDX.getVolatile((AsyncLoop)this);
         long currTail = (long)PRODUCER_IDX.getVolatile((AsyncLoop)this);
         if (currHead < currTail) {
            int offset = (int)(currHead & 65535L);
            Runnable task = (Runnable)ARRAY_ELEM.getAcquire((Runnable[])this.buffer, (int)offset);
            if (task == null) {
               Thread.onSpinWait();
            } else {
               try {
                  task.run();
               } catch (Throwable t) {
                  t.printStackTrace();
               }

               ARRAY_ELEM.setRelease((Runnable[])this.buffer, (int)offset, (Void)null);
               CONSUMER_IDX.setRelease((AsyncLoop)this, (long)(currHead + 1L));
            }
         } else {
            LockSupport.park();
         }
      }
   }
}
