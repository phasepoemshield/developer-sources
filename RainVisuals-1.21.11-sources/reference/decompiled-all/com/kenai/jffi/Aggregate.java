package com.kenai.jffi;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

// $VF: Compiled from Aggregate.java
public abstract class Aggregate extends Type {
   private volatile int disposed;
   private static final AtomicIntegerFieldUpdater<Aggregate> UPDATER = AtomicIntegerFieldUpdater.newUpdater(Aggregate.class, "disposed");
   private final long handle;
   private final Type.TypeInfo typeInfo;
   private final Foreign foreign;

   public final synchronized void dispose() {
   }

   Aggregate(Foreign foreign, long handle) {
      if (handle == 0L) {
         throw new NullPointerException("Invalid ffi_type handle");
      }

      this.foreign = foreign;
      this.handle = handle;
      this.typeInfo = new Type.TypeInfo(handle, foreign.getTypeType(handle), foreign.getTypeSize(handle), foreign.getTypeAlign(handle));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected void finalize() throws Throwable {
      boolean var5 = false /* VF: Semaphore variable */;

      label43: {
         try {
            var5 = true;
            int t = UPDATER.getAndSet(this, 1);
            if (t == 0) {
               this.foreign.freeAggregate(this.typeInfo.handle);
               var5 = false;
            } else {
               var5 = false;
            }
            break label43;
         } catch (Throwable var6) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Exception when freeing FFI aggregate: %s", var6.getLocalizedMessage());
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

   @Override
   final Type.TypeInfo getTypeInfo() {
      return this.typeInfo;
   }
}
