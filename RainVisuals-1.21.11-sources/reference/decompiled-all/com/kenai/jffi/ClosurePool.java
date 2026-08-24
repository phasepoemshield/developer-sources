package com.kenai.jffi;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

// $VF: Compiled from ClosurePool.java
public final class ClosurePool {
   private final ConcurrentLinkedQueue<ClosurePool.Handle> partialQueue;
   private final Set<ClosurePool.Magazine> magazines = Collections.synchronizedSet(new HashSet<>());
   private final CallContext callContext;
   private final ConcurrentLinkedQueue<ClosurePool.Handle> freeQueue = new ConcurrentLinkedQueue<>();
   private static final Closure NULL_CLOSURE = new Closure()   // $VF: Compiled from ClosurePool.java
 {
      @Override
      public void invoke(Closure.Buffer buffer) {
      }
   };

   synchronized void recycle(ClosurePool.Magazine magazine) {
      magazine.recycle();
      if (!magazine.isEmpty()) {
         this.useMagazine(magazine);
      } else {
         this.magazines.remove(magazine);
      }
   }

   private void useMagazine(ClosurePool.Magazine m) {
      ClosurePool.MagazineHolder h = new ClosurePool.MagazineHolder(this, m);
      ArrayList<ClosurePool.Handle> handles = new ArrayList<>();
      ConcurrentLinkedQueue<ClosurePool.Handle> q = m.isFull() ? this.freeQueue : this.partialQueue;

      ClosurePool.Magazine.Slot s;
      while ((s = m.get()) != null) {
         handles.add(new ClosurePool.Handle(s, h));
      }

      q.addAll(handles);
   }

   public Closure.Handle newClosureHandle(Closure closure) {
      ClosurePool.Handle h = this.partialQueue.poll();
      if (h == null) {
         h = this.freeQueue.poll();
      }

      if (h == null) {
         h = this.allocateNewHandle();
      }

      h.slot.proxy.closure = closure;
      return h;
   }

   private ClosurePool.Handle allocateNewHandle() {
      ClosurePool.Handle h;
      while ((h = this.partialQueue.poll()) == null && (h = this.freeQueue.poll()) == null) {
         ClosurePool.Magazine m = new ClosurePool.Magazine(this.callContext);
         this.useMagazine(m);
         this.magazines.add(m);
      }

      return h;
   }

   ClosurePool(CallContext callContext) {
      this.partialQueue = new ConcurrentLinkedQueue<>();
      this.callContext = callContext;
   }

   void recycle(ClosurePool.Magazine.Slot holder, ClosurePool.MagazineHolder slot) {
      this.partialQueue.add(new ClosurePool.Handle(slot, holder));
   }

   // $VF: Compiled from ClosurePool.java
   private static final class Handle implements Closure.Handle {
      private volatile boolean disposed;
      final ClosurePool.Magazine.Slot slot;
      final ClosurePool.MagazineHolder holder;

      Handle(ClosurePool.Magazine.Slot slot, ClosurePool.MagazineHolder holder) {
         this.slot = slot;
         this.holder = holder;
      }

      @Override
      public synchronized void dispose() {
         if (!this.disposed) {
            this.disposed = true;
            this.slot.autorelease = true;
            this.slot.proxy.closure = ClosurePool.NULL_CLOSURE;
            this.holder.pool.recycle(this.slot, this.holder);
         }
      }

      @Override
      public long getAddress() {
         if (this.disposed) {
            throw new RuntimeException("trying to access disposed closure handle");
         } else {
            return this.slot.codeAddress;
         }
      }

      @Override
      public void setAutoRelease(boolean autorelease) {
         if (!this.disposed) {
            this.slot.autorelease = autorelease;
         }
      }

      @Deprecated
      @Override
      public void free() {
         this.dispose();
      }
   }

   // $VF: Compiled from ClosurePool.java
   private static final class Magazine {
      private int freeCount;
      private int next;
      private final ClosurePool.Magazine.Slot[] slots;
      private final Foreign foreign = Foreign.getInstance();
      private final CallContext ctx;
      private static final MemoryIO IO = MemoryIO.getInstance();
      private final long magazine;

      void recycle() {
         for (int i = 0; i < this.slots.length; i++) {
            ClosurePool.Magazine.Slot s = this.slots[i];
            if (s.autorelease) {
               this.freeCount++;
               s.proxy.closure = ClosurePool.NULL_CLOSURE;
            }
         }

         this.next = 0;
      }

      boolean isFull() {
         return this.slots.length == this.freeCount;
      }

      boolean isEmpty() {
         return this.freeCount < 1;
      }

      // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      @Override
      protected void finalize() throws Throwable {
         boolean var5 = false /* VF: Semaphore variable */;

         try {
            var5 = true;
            boolean release = true;

            for (int i = 0; i < this.slots.length; i++) {
               if (!this.slots[i].autorelease) {
                  release = false;
                  break;
               }
            }

            if (this.magazine != 0L) {
               if (release) {
                  this.foreign.freeClosureMagazine(this.magazine);
                  var5 = false;
               } else {
                  var5 = false;
               }
            } else {
               var5 = false;
            }
         } finally {
            if (var5) {
               super.finalize();
            }
         }

         super.finalize();
      }

      ClosurePool.Magazine.Slot get() {
         while (this.freeCount > 0 && this.next < this.slots.length) {
            ClosurePool.Magazine.Slot s = this.slots[this.next++];
            if (s.autorelease) {
               this.freeCount--;
               return s;
            }
         }

         return null;
      }

      Magazine(CallContext ctx) {
         this.ctx = ctx;
         this.magazine = this.foreign.newClosureMagazine(ctx.getAddress(), ClosurePool.Proxy.METHOD, false);
         ArrayList<ClosurePool.Magazine.Slot> slots = new ArrayList();

         while (true) {
            ClosurePool.Proxy proxy = new ClosurePool.Proxy(ctx);
            long h;
            if ((h = this.foreign.closureMagazineGet(this.magazine, proxy)) == 0L) {
               this.slots = new ClosurePool.Magazine.Slot[slots.size()];
               slots.toArray(this.slots);
               this.next = 0;
               this.freeCount = this.slots.length;
               return;
            }

            ClosurePool.Magazine.Slot s = new ClosurePool.Magazine.Slot(h, proxy);
            slots.add(s);
         }
      }

      // $VF: Compiled from ClosurePool.java
      static final class Slot {
         final long codeAddress;
         volatile boolean autorelease;
         final ClosurePool.Proxy proxy;
         final long handle;

         public Slot(long handle, ClosurePool.Proxy proxy) {
            this.handle = handle;
            this.proxy = proxy;
            this.autorelease = true;
            this.codeAddress = ClosurePool.Magazine.IO.getAddress(handle);
         }
      }
   }

   // $VF: Compiled from ClosurePool.java
   private static final class MagazineHolder {
      final ClosurePool pool;
      final ClosurePool.Magazine magazine;

      @Override
      protected void finalize() throws Throwable {
         try {
            this.pool.recycle(this.magazine);
         } finally {
            super.finalize();
         }
      }

      public MagazineHolder(ClosurePool magazine, ClosurePool.Magazine pool) {
         this.pool = pool;
         this.magazine = magazine;
      }
   }

   // $VF: Compiled from ClosurePool.java
   static final class Proxy {
      final CallContext callContext;
      static final Method METHOD = getMethod();
      volatile Closure closure = ClosurePool.NULL_CLOSURE;

      public void invoke(long paramAddress, long retvalAddress) {
         this.closure.invoke(new DirectClosureBuffer(this.callContext, retvalAddress, paramAddress));
      }

      Proxy(CallContext callContext) {
         this.callContext = callContext;
      }

      private static Method getMethod() {
         try {
            return ClosurePool.Proxy.class.getDeclaredMethod("invoke", long.class, long.class);
         } catch (Throwable var1) {
            throw new RuntimeException(var1);
         }
      }
   }
}
