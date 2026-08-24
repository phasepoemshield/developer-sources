package com.kenai.jffi;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

// $VF: Compiled from ClosureMagazine.java
public final class ClosureMagazine {
   private final CallContext callContext;
   private final Foreign foreign;
   private static final AtomicIntegerFieldUpdater<ClosureMagazine> UPDATER = AtomicIntegerFieldUpdater.newUpdater(ClosureMagazine.class, "disposed");
   private volatile int disposed;
   private final long magazineAddress;

   ClosureMagazine(Foreign foreign, CallContext magazineAddress, long callContext) {
      this.foreign = foreign;
      this.callContext = callContext;
      this.magazineAddress = magazineAddress;
   }

   public void dispose() {
      int disposed = UPDATER.getAndSet(this, 1);
      if (this.magazineAddress != 0L && disposed == 0) {
         this.foreign.freeClosureMagazine(this.magazineAddress);
      }
   }

   public Closure.Handle allocate(Object proxy) {
      long closureAddress = this.foreign.closureMagazineGet(this.magazineAddress, proxy);
      return closureAddress != 0L ? new ClosureMagazine.Handle(this, closureAddress, MemoryIO.getInstance().getAddress(closureAddress)) : null;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected void finalize() throws Throwable {
      boolean var5 = false /* VF: Semaphore variable */;

      label46: {
         try {
            var5 = true;
            int t = UPDATER.getAndSet(this, 1);
            if (this.magazineAddress != 0L) {
               if (t == 0) {
                  this.foreign.freeClosureMagazine(this.magazineAddress);
                  var5 = false;
               } else {
                  var5 = false;
               }
            } else {
               var5 = false;
            }
            break label46;
         } catch (Throwable var6) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "exception when freeing " + this.getClass() + ": %s", var6.getLocalizedMessage());
            var5 = false;
         } finally {
            if (var5) {
               super.finalize();
            }
         }

         super.finalize();
         return;
      }

      super.finalize();
   }

   // $VF: Compiled from ClosureMagazine.java
   private static final class Handle implements Closure.Handle {
      private final long closureAddress;
      private final long codeAddress;
      private final ClosureMagazine magazine;

      @Override
      public void dispose() {
      }

      @Override
      public void free() {
      }

      private Handle(ClosureMagazine magazine, long codeAddress, long closureAddress) {
         this.magazine = magazine;
         this.closureAddress = closureAddress;
         this.codeAddress = codeAddress;
      }

      @Override
      public long getAddress() {
         return this.codeAddress;
      }

      @Override
      public void setAutoRelease(boolean autorelease) {
      }
   }
}
